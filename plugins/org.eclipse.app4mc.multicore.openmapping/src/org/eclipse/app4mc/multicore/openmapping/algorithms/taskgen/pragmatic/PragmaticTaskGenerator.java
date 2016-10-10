/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractTaskCreationAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class PragmaticTaskGenerator extends AbstractTaskCreationAlgorithm {
	// Map for Activation<->Stimulus associations
	private final Map<Activation, Stimulus> mActivationStimuli = new HashMap<Activation, Stimulus>();
	// Will be used in various List operations (i.e. add Runnables, manage
	// internal runnable dependency graphs, ...)
	private final Map<ProcessPrototype, ExtendedProcessPrototype> lProcessPrototypes = new HashMap<ProcessPrototype, ExtendedProcessPrototype>();
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	private boolean initProcessPrototypes() {
		// Check if there are any ProcessPrototypes at all
		if (getSwModel().getProcessPrototypes().size() <= 0) {
			UniversalHandler.getInstance()
					.log("Invalid SWModel.\nThere are no ProcessPrototypes in this model.\nLeaving Algorithm...", null);
			return false;
		}
		UniversalHandler.getInstance()
				.logCon("Found " + getSwModel().getProcessPrototypes().size() + " Process Prototype(s)");

		// Process ProcessPrototypes
		final Iterator<ProcessPrototype> swProcProto = getSwModel().getProcessPrototypes().iterator();
		while (swProcProto.hasNext()) {
			final ProcessPrototype pp = swProcProto.next();
			final ExtendedProcessPrototype epp = new ExtendedProcessPrototype(pp.getName(), pp.getFirstRunnable(),
					pp.getLastRunnable());
			// ...
			this.lProcessPrototypes.put(pp, epp);
		}
		return true;
	}

	private boolean convertActivations() {
		// Check if there are any activation elements in the (origin) software
		// model
		if (getSwModel().getActivations().size() <= 0) {
			UniversalHandler.getInstance().log(
					"Invalid SWModel.\nThere are no Activation elements in this model.\nLeaving Algorithm...", null);
			return false;
		}
		UniversalHandler.getInstance()
				.logCon("Found " + getSwModel().getActivations().size() + " Activation element(s)");

		// Process the Activation elements
		final Iterator<Activation> activations = getSwModel().getActivations().iterator();
		while (activations.hasNext()) {
			final Activation activation = activations.next();

			if (activation instanceof PeriodicActivation) {
				// Periodic activation element
				final PeriodicActivation entry = (PeriodicActivation) activation;
				final String name = entry.getName();
				UniversalHandler.getInstance().logCon("Connverting Periodic Activation Element '" + name);

				final Periodic stimuliPeriodic = getStimuliInstance().createPeriodic();
				stimuliPeriodic.setName(name);

				if (entry.getOffset() != null) {
					stimuliPeriodic.setOffset(EcoreUtil.copy(entry.getOffset()));
				}
				if (entry.getMax() != null) {
					stimuliPeriodic.setRecurrence(EcoreUtil.copy(entry.getMax()));
				}
				if (entry.getMin() != null) {
					stimuliPeriodic.setRecurrence(EcoreUtil.copy(entry.getMin()));
				}
				if (entry.getDeadline() != null) {
					stimuliPeriodic.setRecurrence(EcoreUtil.copy(entry.getDeadline()));
				}
				
				// TODO More attributes may need to be converted/generated

				getStimuliModel().getStimuli().add(stimuliPeriodic);
				this.mActivationStimuli.put(entry, stimuliPeriodic);
			}
			else {
				UniversalHandler.getInstance().log("Unhandled Activation element.\nSkipping...", null);
			}
		}
		return true;
	}

	private void processRunnableSequencingConstraint(final RunnableSequencingConstraint rsc) {
		// Check if there are any runnable groups in the runnable sequencing
		// constraint
		// In our case this algorithm will only support the partitioning plugin
		// hence there must be 2 entries (origin/target)
		if (rsc.getRunnableGroups().size() != 2) {
			UniversalHandler.getInstance().log(
					"Invalid RunnableSequencingConstraint.\nRunnableSequencingConstraints must contain 2 RunnableGroups.\nSkipping...",
					null);
			return;
		}

		final ProcessRunnableGroup originGroup = rsc.getRunnableGroups().get(0);
		final ProcessRunnableGroup targetGroup = rsc.getRunnableGroups().get(1);

		// Is there one ProcessRunnableGroupEntry per group?
		if (originGroup.getEntries().size() != 1 || targetGroup.getEntries().size() != 1) {
			UniversalHandler.getInstance().log(
					"Invalid ProcessRunnableGroup.\nProcessRunnableGroup must contain one ProcessRunnableGroupEntry.\nSkipping...",
					null);
			return;
		}

		final ProcessRunnableGroupEntry originEntry = originGroup.getEntries().get(0);
		final ProcessRunnableGroupEntry targetEntry = targetGroup.getEntries().get(0);

		// Has each entry a process scope?
		if (originEntry.getProcessScope().size() != 1 || targetEntry.getProcessScope().size() != 1) {
			UniversalHandler.getInstance().log(
					"Invalid ProcessRunnableGroupEntry.\nProcessRunnableGroupEntry must reference one AbstractProcess.\nSkipping...",
					null);
			return;
		}

		final AbstractProcess originAProcess = originEntry.getProcessScope().get(0);
		final AbstractProcess targetAProcess = targetEntry.getProcessScope().get(0);

		// Are those references to ProcessPrototypes?
		if (!(originAProcess instanceof ProcessPrototype) || !(targetAProcess instanceof ProcessPrototype)) {
			UniversalHandler.getInstance().log(
					"Invalid ProcessScope reference.\nThe ProcessScope must reference a ProcessPrototype.\nSkipping...",
					null);
			return;
		}

		final ProcessPrototype ppOrigin = (ProcessPrototype) originAProcess;
		final ProcessPrototype ppTarget = (ProcessPrototype) targetAProcess;

		final Runnable originRunnable;
		final Runnable targetRunnable;
		// Now, check if both Entries have the Runnable reference set
		if ((originRunnable = originEntry.getRunnable()) == null
				|| (targetRunnable = targetEntry.getRunnable()) == null) {
			UniversalHandler.getInstance().log(
					"Invalid ProcessRunnableGroupEntry.\nProcessRunnableGroupEntry must reference one Runnable.\nSkipping...",
					null);
			return;
		}

		// From here on: Check which process prototypes are influenced by this
		// Constraint
		if (ppOrigin.equals(ppTarget)) {
			// Same ProcessPrototype, so they describe an Edge inside the same
			// Task!
			final ExtendedProcessPrototype epp = this.lProcessPrototypes.get(ppOrigin);
			epp.addEdge(originRunnable, targetRunnable);
		}
		else {
			// Different ProcessPrototypes, but there may be still "new"
			// Runnables specified
			final ExtendedProcessPrototype eppOrigin = this.lProcessPrototypes.get(ppOrigin);
			final ExtendedProcessPrototype eppTarget = this.lProcessPrototypes.get(ppTarget);
			eppOrigin.addOrphanRunnable(originRunnable);
			eppTarget.addOrphanRunnable(targetRunnable);
		}
	}

	private boolean createRunnableDependencyGraph() {
		// Check if there are any activation runnable sequencing constraints
		// specified
		if (null == getConnstraintsModel() || null == getConnstraintsModel().getRunnableSequencingConstraints()
				|| getConnstraintsModel().getRunnableSequencingConstraints().size() <= 0) {
			UniversalHandler.getInstance().log(
					"Invalid ConstraintsModel.\nThere are no RunnableSequencingConstraints in this model.\nLeaving Algorithm...",
					null);
			return false;
		}
		UniversalHandler.getInstance().logCon("Found "
				+ getConnstraintsModel().getRunnableSequencingConstraints().size() + " Sequencing Constraint(s)");

		final Iterator<RunnableSequencingConstraint> lRsc = getConnstraintsModel().getRunnableSequencingConstraints()
				.iterator();
		while (lRsc.hasNext()) {
			final RunnableSequencingConstraint rsc = lRsc.next();
			processRunnableSequencingConstraint(rsc);
		}

		return true;
	}

	@Override
	public void createTasks() {
		UniversalHandler.getInstance().setPluginId(OpenMappingPlugin.getPluginId());
		if (null != OpenMappingPlugin.getDefault()) {
			UniversalHandler.getInstance().setLog(OpenMappingPlugin.getDefault().getLog());
		}
		UniversalHandler.getInstance().log("Entering Pragmatic Task-Creation algorithm.");

		// Create empty Stimuli Model
		setStimuliModel(getStimuliInstance().createStimuliModel());

		// Convert ProcessPrototypes to Tasks
		if (!initProcessPrototypes()) {
			UniversalHandler.getInstance().log("Error during ProcessPrototype initialization.\nLeaving Algorithm...",
					null);
			return;
		}
		UniversalHandler.getInstance().logCon("ProcessPrototypes successfully initialized.");

		// Convert Activation elements to Stimuli
		if (!convertActivations()) {
			UniversalHandler.getInstance().log("Error during Activation element conversion.\nLeaving Algorithm...",
					null);
			return;
		}
		UniversalHandler.getInstance().logCon("Activation elements successfully converted.");

		// Fetch and insert the Runnable dependencies for each new Task
		if (!createRunnableDependencyGraph()) {
			UniversalHandler.getInstance().log("Error during dependency graph generation.\nLeaving Algorithm...", null);
			return;
		}
		UniversalHandler.getInstance().log("Runnable Dependency Graph has been successfully created.", null);

		// Now we can start with the actual Task generation
		final Iterator<Entry<ProcessPrototype, ExtendedProcessPrototype>> mPP = this.lProcessPrototypes.entrySet()
				.iterator();
		while (mPP.hasNext()) {
			final Entry<ProcessPrototype, ExtendedProcessPrototype> e = mPP.next();
			final ProcessPrototype pp = e.getKey();
			final ExtendedProcessPrototype epp = e.getValue();
			final String name = pp.getName();

			// Prepare the (sorted) Runnable list
			epp.createRunnableList();
			final List<Runnable> lRunnables = epp.getRunnableList();
			if (lRunnables.isEmpty()) {
				// Some error must have occurred
				UniversalHandler.getInstance().logCon("Unexpected Runnable list (List Empty?).\nSkipping entry...");
				break;
			}

			final Task task = getSwInstance().createTask();
			task.setName("Task_" + name);
			final CallGraph cGraph = getSwInstance().createCallGraph();
			final CallSequence cSeq = getSwInstance().createCallSequence();

			for (final Runnable run : lRunnables) {
				final TaskRunnableCall trc = getSwInstance().createTaskRunnableCall();
				trc.setRunnable(run);
				cSeq.getCalls().add(trc);
			}

			cGraph.getGraphEntries().add(cSeq);
			task.setCallGraph(cGraph);
			if (pp.getActivation() != null) {
				task.getStimuli().add(this.mActivationStimuli.get(pp.getActivation()));
			}
			getSwModel().getTasks().add(task);
			UniversalHandler.getInstance().logCon("Added Task: '" + task.getName() + "'");
			this.con.appendln("Added Task: '" + task.getName() + "'");
		}
		UniversalHandler.getInstance().logCon("Leaving Pragmatic Task-Creation algorithm.");
		this.con.appendln("Done!\n");
		this.con.focus();
	}
}
