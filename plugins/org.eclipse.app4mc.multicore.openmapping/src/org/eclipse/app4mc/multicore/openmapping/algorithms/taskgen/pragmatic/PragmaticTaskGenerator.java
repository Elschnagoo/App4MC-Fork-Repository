/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.SporadicStimulus;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractTaskCreationAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.model.OMProcessPrototype;
import org.eclipse.app4mc.multicore.openmapping.model.OMRunnable;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class PragmaticTaskGenerator extends AbstractTaskCreationAlgorithm {
	// Map for Activation<->Stimulus associations
	private final Map<Activation, Stimulus> mActivationStimuli = new HashMap<Activation, Stimulus>();
	private final ArrayList<OMProcessPrototype> lProcessPrototypes = new ArrayList<OMProcessPrototype>();
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	private boolean initProcessPrototypes() {
		// Check if there are any ProcessPrototypes at all
		if (getAmaltheaModel().getSwModel().getProcessPrototypes().size() <= 0) {
			UniversalHandler.getInstance()
					.log("Invalid SWModel.\nThere are no ProcessPrototypes in this model.\nLeaving Algorithm...", null);
			return false;
		}
		UniversalHandler.getInstance()
				.logCon("Found " + getAmaltheaModel().getSwModel().getProcessPrototypes().size() + " Process Prototype(s)");

		// Process ProcessPrototypes
		final Iterator<ProcessPrototype> swProcProto = getAmaltheaModel().getSwModel().getProcessPrototypes().iterator();
		while (swProcProto.hasNext()) {
			final ProcessPrototype pp = swProcProto.next();
			final OMProcessPrototype ompp = new OMProcessPrototype(pp);
			this.lProcessPrototypes.add(ompp);
		}
		return true;
	}

	private boolean convertActivations() {
		// Check if there are any activation elements in the (origin) software
		// model
		if (getAmaltheaModel().getSwModel().getActivations().size() <= 0) {
			UniversalHandler.getInstance().logWarn(
					"Unexpected SWModel: There are no Activation elements in this model. Leaving Algorithm...");
			return false;
		}
		UniversalHandler.getInstance()
				.logCon("Found " + getAmaltheaModel().getSwModel().getActivations().size() + " Activation element(s)");

		// Process the Activation elements
		final Iterator<Activation> activations = getAmaltheaModel().getSwModel().getActivations().iterator();
		while (activations.hasNext()) {
			final Activation activation = activations.next();

			if (activation instanceof PeriodicActivation) {
				final PeriodicStimulus stimuliPeriodic = convertPeriodicActivation((PeriodicActivation) activation);
				getAmaltheaModel().getStimuliModel().getStimuli().add(stimuliPeriodic);
				this.mActivationStimuli.put(activation, stimuliPeriodic);
			}
			else if (activation instanceof SporadicActivation) {
				final SporadicStimulus stimuliSporadic = convertSporadicActivation((SporadicActivation) activation);
				getAmaltheaModel().getStimuliModel().getStimuli().add(stimuliSporadic);
				this.mActivationStimuli.put(activation, stimuliSporadic);
			}
			else {
				UniversalHandler.getInstance().log("Unhandled Activation element.\nSkipping...", null);
			}
		}
		return true;
	}

	private PeriodicStimulus convertPeriodicActivation(final PeriodicActivation activation) {
		// Periodic activation element
		final String name = activation.getName();
		UniversalHandler.getInstance().logCon("Connverting Periodic Activation Element '" + name);

		final PeriodicStimulus stimuliPeriodic = getStimuliInstance().createPeriodicStimulus();
		stimuliPeriodic.setName(name);

		if (activation.getOffset() != null) {
			stimuliPeriodic.setOffset(EcoreUtil.copy(activation.getOffset()));
		}
		if (activation.getMax() != null) {
			stimuliPeriodic.setRecurrence(EcoreUtil.copy(activation.getMax()));
		}
		if (activation.getMin() != null) {
			stimuliPeriodic.setRecurrence(EcoreUtil.copy(activation.getMin()));
		}
		if (activation.getRecurrence() != null) {
			stimuliPeriodic.setRecurrence(EcoreUtil.copy(activation.getRecurrence()));
		}

		return stimuliPeriodic;
	}

	private SporadicStimulus convertSporadicActivation(final SporadicActivation activation) {
		final String name = activation.getName();
		UniversalHandler.getInstance().logCon("Connverting Sporiadic Activation Element '" + name);

		final SporadicStimulus stimuliSporadic = getStimuliInstance().createSporadicStimulus();
		stimuliSporadic.setName(name);
		
		// Check which timing information is present and try to convert deviations as well
		if (null != activation.getActivationDeviation()) {
			final Deviation<Time> stimuliDeviation = getStimuliInstance().createDeviation();
			
			if ( null != activation.getActivationDeviation().getLowerBound()) {
				stimuliDeviation.setLowerBound(EcoreUtil.copy(activation.getActivationDeviation().getLowerBound()));
			}
			
			if ( null != activation.getActivationDeviation().getUpperBound()) {
				stimuliDeviation.setLowerBound(EcoreUtil.copy(activation.getActivationDeviation().getUpperBound()));
			}
			
			if ( null != activation.getActivationDeviation().getDistribution()) {
				stimuliDeviation.setDistribution(EcoreUtil.copy(activation.getActivationDeviation().getDistribution()));
			}
			
			stimuliSporadic.setStimulusDeviation(stimuliDeviation);
		}

		return stimuliSporadic;

	}

	@Override
	public void createTasks() {
		UniversalHandler.getInstance().setPluginId(OpenMappingPlugin.getPluginId());
		if (null != OpenMappingPlugin.getDefault()) {
			UniversalHandler.getInstance().setLog(OpenMappingPlugin.getDefault().getLog());
		}
		UniversalHandler.getInstance().log("Entering Pragmatic Task-Creation algorithm.");

		// Create empty Stimuli Model
		getAmaltheaModel().setStimuliModel(getStimuliInstance().createStimuliModel());

		// Convert ProcessPrototypes to Tasks
		if (!initProcessPrototypes()) {
			UniversalHandler.getInstance().log("Error during ProcessPrototype initialization.\nLeaving Algorithm...",
					null);
			return;
		}
		UniversalHandler.getInstance().logCon("ProcessPrototypes successfully initialized.");

		// Convert Activation elements to Stimuli
		if (!convertActivations()) {
			UniversalHandler.getInstance().logWarn("Warning: No Activation Elements found. Skipping conversion.");
		}
		else {
			UniversalHandler.getInstance().logCon("Activation elements successfully converted.");
		}

		UniversalHandler.getInstance().log("Runnable Dependency Graph has been successfully created.");

		// Now we can start with the actual Task generation
		int iTotalRunnables = 0;

		for (final OMProcessPrototype epp : this.lProcessPrototypes) {
			final String name = epp.getName();

			// Prepare the (sorted) Runnable list
			epp.createRunnableGraph();
			final Set<OMRunnable> lRunnables = epp.getRunnableList();
			if (lRunnables.isEmpty()) {
				// Some error must have occurred
				UniversalHandler.getInstance().logCon("Unexpected Runnable list (List Empty?).\nSkipping entry...");
				break;
			}

			final Task task = getSwInstance().createTask();
			task.setName("Task_" + name);
			final CallGraph cGraph = getSwInstance().createCallGraph();
			final CallSequence cSeq = getSwInstance().createCallSequence();

			for (final OMRunnable run : lRunnables) {
				final TaskRunnableCall trc = getSwInstance().createTaskRunnableCall();
				trc.setRunnable(run.getRunnableRef());
				cSeq.getCalls().add(trc);
			}

			cGraph.getGraphEntries().add(cSeq);
			task.setCallGraph(cGraph);
			if (epp.getProcessPrototype().getActivation() != null) {
				task.getStimuli().add(this.mActivationStimuli.get(epp.getProcessPrototype().getActivation()));
			}
			getAmaltheaModel().getSwModel().getTasks().add(task);
			iTotalRunnables += lRunnables.size();
			final String msg = "Added Task: '" + task.getName() + "', Runnables: " + lRunnables.size();
			System.out.println("-----------------------------------------------------------------");
			System.out.println(epp.toString());
			System.out.println(lRunnables);
			UniversalHandler.getInstance().logCon(msg);
			this.con.appendln(msg);
		}
		UniversalHandler.getInstance().logCon("Leaving Pragmatic Task-Creation algorithm.");
		this.setAmaltheaOutputModel(EcoreUtil.copy(this.getAmaltheaModel()));
		this.con.appendln("Done! " + iTotalRunnables + " Runnables in tasks\n");
		this.con.focus();
	}


}
