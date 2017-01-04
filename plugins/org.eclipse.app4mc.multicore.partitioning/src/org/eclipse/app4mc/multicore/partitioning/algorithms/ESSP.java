/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

/**
 * This class forms an Earliest Start Schedule Partitioning mechanism, in oder
 * to distribute runnables to ProcessPrototypes with respect to a user defined
 * number of tasks. The mechanism iterates over all runnables beginning with the
 * one, that starts earliest and finishes its calculation after the smallest
 * amount of instructions. "Later" runnables are assigned to tasks with regard
 * to their dependency and to their instructions.
 */
public class ESSP {
	public SWModel swm;
	public ConstraintsModel cm;
	private final EList<ProcessPrototype> tasks = new BasicEList<ProcessPrototype>();
	private final EList<Runnable> assignedNodes = new BasicEList<Runnable>();
	final Map<Runnable, Long> cache = new HashMap<Runnable, Long>();
	final private Map<ProcessPrototype, Long> TargetRT = new HashMap<ProcessPrototype, Long>();
	private Stack<Runnable> runs = new Stack<Runnable>();

	/**
	 * Constructor reuires a @param swmi SWModel, @param cmi constraintsmodel
	 * and @param tasks the user defined number of tasks
	 */
	public ESSP(final SWModel swmi, final ConstraintsModel cmi, final int tasks) {
		this.swm = swmi;
		this.cm = cmi;
		PartLog.getInstance().setLogName("ESS Partitioning");
		final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
		for (int i = 0; i < tasks; i++) {
			final ProcessPrototype pp = swf.createProcessPrototype();
			pp.setName("ESS" + i);
			this.tasks.add(pp);
			this.TargetRT.put(pp, (long) 0);
		}
		if (tasks < this.swm.getProcessPrototypes().size()) {
			PartLog.getInstance()
					.log("ESSP can't create less partitions than already present from independent graph groups (GGP) or activation groups (AA). ProcessPrototypes in file:"
							+ this.swm.getProcessPrototypes().size() + ", configured partitions: " + tasks
							+ ". ProcessPrototypes are resetted (AA/GGP is ignored).", null);

			this.swm.getProcessPrototypes().clear();
			final ProcessPrototype pp = swf.createProcessPrototype();
			pp.setName("AllRunnables");
			for (final Runnable r : this.swm.getRunnables()) {
				final TaskRunnableCall trc = swf.createTaskRunnableCall();
				trc.setRunnable(r);
				pp.getRunnableCalls().add(trc);
			}
			this.swm.getProcessPrototypes().add(pp);
		}

		final CriticalPath cp = new CriticalPath(this.swm, this.cm);
		for (final Runnable r : swmi.getRunnables()) {
			this.cache.put(r, cp.getLongestPreceedingRT(r));
		}
	}


	/**
	 * starts the ESSP mechanism. Requires runnables, dependencies
	 * (RunnableSequencingConstraints) and Instructions for each runnable
	 */
	public EList<ProcessPrototype> build(final IProgressMonitor monitor) {
		final Set<AccessPrecedenceSpec> aps = new HashSet<AccessPrecedenceSpec>();
		aps.addAll(this.swm.getProcessPrototypes().get(0).getAccessPrecedenceSpec());

		if (this.swm.getProcessPrototypes().size() > 1) {
			// If PPs are present from AA / GGP --> perform ESS partitioning via
			// ESSPe class
			return new ESSPe(this.swm, this.cm, this.tasks.size()).build(monitor);
		}
		this.runs = createRunnableStack();

		final int temp = this.swm.getRunnables().size() - this.assignedNodes.size();
		monitor.beginTask("ESSP...", temp);
		while (this.assignedNodes.size() < this.swm.getRunnables().size()) {
			monitor.worked(1);
			final Runnable r = this.runs.pop();
			int taskIndex = 0;
			final EList<Integer> td = getRunnablesTaskDependencyIndices(r);
			switch (td.size()) {
				case 0:
					taskIndex = getIndexOfEarliestTask();
					break;
				case 1:
					taskIndex = td.get(0);
					break;
				default:
					taskIndex = getIndexOfLatestTask(td);
					break;
			}
			final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
			final TaskRunnableCall trc = swf.createTaskRunnableCall();
			trc.setRunnable(r);
			this.tasks.get(taskIndex).getRunnableCalls().add(trc);
			this.assignedNodes.add(r);
			this.TargetRT.put(this.tasks.get(taskIndex),
					this.TargetRT.get(this.tasks.get(taskIndex)).longValue() + new Helper().getInstructions(r));
		}
		monitor.done();

		this.swm.getProcessPrototypes().clear();
		// user may have specified more partitions than ess created: delete
		// those
		for (final Iterator<ProcessPrototype> it = this.tasks.iterator(); it.hasNext();) {
			if (it.next().getRunnableCalls().size() < 1) {
				it.remove();
			}
		}
		this.swm.getProcessPrototypes().addAll(this.tasks);

		// -----------------------------------------------------------
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			pp.setName("ESSP" + this.swm.getProcessPrototypes().indexOf(pp));
		}
		new Helper().updateRSCs(this.cm, this.swm);
		new Helper().updatePPsFirstLastActParams(this.swm);
		new Helper().assignAPs(aps);
		PartLog.getInstance().log(new Helper().writePPs(this.swm.getProcessPrototypes()));
		return this.swm.getProcessPrototypes();
	}

	/**
	 * Creates a Stack of Runnables all existing runnable in the swmodel, sorted
	 * by their graph position (sum of longest preceeding runnable's
	 * instructions; top = highest amount)
	 */
	private Stack<Runnable> createRunnableStack() {
		final List<Runnable> rl = new BasicEList<Runnable>();
		rl.addAll(this.swm.getRunnables());
		Collections.sort(rl, new Comparator<Runnable>() {
			@Override
			public int compare(final Runnable o1, final Runnable o2) {
				return ESSP.this.cache.get(o2).intValue() - ESSP.this.cache.get(o1).intValue();
			}
		});
		final Stack<Runnable> rs = new Stack<Runnable>();
		for (final Runnable r : rl) {
			rs.push(r);
		}
		return rs;
	}

	private int getIndexOfLatestTask(final EList<Integer> td) {
		int index = 0;
		long max = 0;
		for (int i = 0; i < td.size(); i++) {
			if (this.TargetRT.get(this.tasks.get(td.get(i))).longValue() > max) {
				max = this.TargetRT.get(this.tasks.get(td.get(i))).longValue();
				index = td.get(i);
			}
		}
		return index;
	}

	/**
	 * @return indexes of tasks, that possess a direct predecessor of @param r
	 *         at their last entry
	 */
	private EList<Integer> getRunnablesTaskDependencyIndices(final Runnable r) {
		final LinkedList<RunnableSequencingConstraint> prevRuns = new LinkedList<>();
		final Set<RunnableSequencingConstraint> rscs = new CriticalPath(this.swm, this.cm).getGraph()
				.incomingEdgesOf(r);
		for (final RunnableSequencingConstraint rsc : rscs) {
			prevRuns.add(rsc);
		}
		final EList<Runnable> latestRunnablesAtTasks = getLatestRunnablesAtTasks();
		final EList<Integer> TaskIndexes = new BasicEList<Integer>();
		for (final RunnableSequencingConstraint rsc : prevRuns) {
			if (latestRunnablesAtTasks.contains(rsc.getRunnableGroups().get(0).getRunnables().get(0))) {
				TaskIndexes.add(getTaskIndexOf(rsc.getRunnableGroups().get(0).getRunnables().get(0)));
			}
		}
		return TaskIndexes;
	}

	private Integer getTaskIndexOf(final Runnable runnable) {
		for (final ProcessPrototype pp : this.tasks) {
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				if (trc.getRunnable().equals(runnable)) {
					return this.tasks.indexOf(pp);
				}
			}
		}
		PartLog.getInstance().log("Runnable " + runnable.getName() + " is not yet assigned to a task!");
		return null;
	}

	private EList<Runnable> getLatestRunnablesAtTasks() {
		final EList<Runnable> ltr = new BasicEList<Runnable>();
		for (final ProcessPrototype pp : this.tasks) {
			int temp = pp.getRunnableCalls().size();
			if (temp != 0) {
				temp--;
				ltr.add(pp.getRunnableCalls().get(temp).getRunnable());
			}
		}
		return ltr;
	}

	/**
	 * @return the index of the ProcessPrototype that features lowest
	 *         instructions defined by all containing runnables
	 */
	private int getIndexOfEarliestTask() {
		int index = 0;
		long min = Long.MAX_VALUE;
		for (final ProcessPrototype pp : this.TargetRT.keySet()) {
			if (this.TargetRT.get(pp).longValue() < min) {
				min = this.TargetRT.get(pp).longValue();
				index = this.tasks.indexOf(pp);
			}
		}
		return index;
	}
}
