/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.algorithms;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
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
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

/**
 * This class forms an Earliest Start Schedule Partitioning mechanism, in oder
 * to distribute runnables to ProcessPrototypes with respect to a user defined
 * number of tasks. In constrast to the ESSP class, ESSPe considers already
 * created ProcessPrototypes (e.g. created by GGP / AA). Each iteration (until
 * the user defined number of tasks is generated), ESSPe picks the
 * ProcessPrototype that consumes most instructions and features a
 * parallelizable graph (more than one Runnable and not a Runnable sequence).
 */
public class ESSPe {
	public SWModel swm;
	public ConstraintsModel cm;
	final Map<Runnable, Long> cache = new HashMap<Runnable, Long>();
	private int tasknumber = 0;
	private final DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> graph;

	/**
	 * Constructor reuires a @param swmi SWModel, @param cmi constraintsmodel
	 * and @param tasks the user defined number of tasks
	 */
	public ESSPe(final SWModel swmi, final ConstraintsModel cmi, final int tasks) {
		this.swm = swmi;
		this.cm = cmi;
		this.tasknumber = tasks;
		PartLog.getInstance().setLogName("ESS Partitioning");
		final CriticalPath cp = new CriticalPath(this.swm, this.cm);
		this.graph = cp.getGraph();
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

		int addTasks = this.tasknumber - this.swm.getProcessPrototypes().size();
		int taskCunter = 0;
		monitor.beginTask("ESSP...", addTasks);
		while (addTasks-- > 0) {
			monitor.worked(1);
			final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
			final ProcessPrototype ppNew1 = swf.createProcessPrototype();
			final ProcessPrototype ppNew2 = swf.createProcessPrototype();
			ppNew1.setName("ESSP" + taskCunter++);
			ppNew2.setName("ESSP" + taskCunter++);
			final List<ProcessPrototype> ppl = new BasicEList<ProcessPrototype>();
			ppl.add(ppNew1);
			ppl.add(ppNew2);
			final ProcessPrototype ppEdit = getLongestPP();
			if (null != ppEdit) {
				final Stack<Runnable> rs = createRunnableStack(ppEdit);
				while (!rs.isEmpty()) {
					final TaskRunnableCall trc = swf.createTaskRunnableCall();
					trc.setRunnable(rs.pop());
					if (RDependsOn1(trc.getRunnable(), ppl)) {
						ppl.get(0).getRunnableCalls().add(trc);
					}
					else if (RDependsOn2(trc.getRunnable(), ppl)) {
						ppl.get(1).getRunnableCalls().add(trc);
					}
					else {
						final int i = getIndexOfEarliestTask(ppl);
						ppl.get(i).getRunnableCalls().add(trc);
					}
				}
			}
			if (!pplContainsEmptyEntry(ppl)) {
				this.swm.getProcessPrototypes().addAll(ppl);
				this.swm.getProcessPrototypes().remove(ppEdit);
			}
			else {
				break;
			}
		}
		monitor.done();

		// -----------------------------------------------------------
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			pp.setName("ESSP" + this.swm.getProcessPrototypes().indexOf(pp));
		}
		new Helper().updateRSCs(this.cm, this.swm);
		new Helper().updatePPsFirstLastActParams(this.swm);
		new Helper().assignAPs(aps);
		return this.swm.getProcessPrototypes();
	}


	/**
	 * @return boolean true if @param ProcessPrototypeList contains empty PP;
	 *         false otherwise
	 */
	private boolean pplContainsEmptyEntry(final List<ProcessPrototype> ppl) {
		for (final ProcessPrototype pp : ppl) {
			if (pp.getRunnableCalls().size() < 1) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Checks, if @param runnable has an incomingEdge of the last Runnable in
	 * the second entry in @param ppl
	 */
	private boolean RDependsOn2(final Runnable runnable, final List<ProcessPrototype> ppl) {
		if (ppl.size() == 2) {
			if (ppl.get(1).getRunnableCalls().size() > 0) {
				final Runnable d = ppl.get(1).getRunnableCalls().get(ppl.get(1).getRunnableCalls().size() - 1)
						.getRunnable();
				final Set<RunnableSequencingConstraint> sources = this.graph.incomingEdgesOf(runnable);
				for (final RunnableSequencingConstraint rsc : sources) {
					if (this.graph.getEdgeSource(rsc).equals(d)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * Checks, if @param runnable has an incomingEdge of the last Runnable in
	 * the first entry in @param ppl
	 */
	private boolean RDependsOn1(final Runnable runnable, final List<ProcessPrototype> ppl) {
		if (ppl.size() == 2) {
			if (ppl.get(0).getRunnableCalls().size() > 0) {
				final Runnable d = ppl.get(0).getRunnableCalls().get(ppl.get(0).getRunnableCalls().size() - 1)
						.getRunnable();
				final Set<RunnableSequencingConstraint> sources = this.graph.incomingEdgesOf(runnable);
				for (final RunnableSequencingConstraint rsc : sources) {
					if (this.graph.getEdgeSource(rsc).equals(d)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * @return the index of the ProcessProtoype in @param ppl, that features
	 *         lowest instructions defined by all containing runnables
	 */
	private int getIndexOfEarliestTask(final List<ProcessPrototype> ppl) {
		int index = 0;
		long min = Long.MAX_VALUE;
		for (final ProcessPrototype pp : ppl) {
			final long ppi = new Helper().getPPInstructions(pp);
			if (ppi < min) {
				min = ppi;
				index = ppl.indexOf(pp);
			}
		}
		return index;
	}

	/**
	 * Creates a Stack of Runnables of @param PPs, sorted by their graph
	 * position (sum of longest preceeding runnable's instructions; top =
	 * highest amount)
	 */
	private Stack<Runnable> createRunnableStack(final ProcessPrototype PPs) {
		final List<Runnable> rl = new BasicEList<Runnable>();
		for (final TaskRunnableCall trc : PPs.getRunnableCalls()) {
			rl.add(trc.getRunnable());
		}
		Collections.sort(rl, new Comparator<Runnable>() {
			@Override
			public int compare(final Runnable o1, final Runnable o2) {
				return ESSPe.this.cache.get(o2).intValue() - ESSPe.this.cache.get(o1).intValue();
			}
		});
		final Stack<Runnable> rs = new Stack<Runnable>();
		for (final Runnable r : rl) {
			rs.push(r);
		}
		return rs;
	}


	/**
	 * find PP with > 1 TRCs, return the one with most cumulated instructions *
	 * activation
	 *
	 * @return
	 */
	private ProcessPrototype getLongestPP() {
		ProcessPrototype pps = null;
		double max = 0;
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			if (pp.getRunnableCalls().size() > 1 && !isSequence(pp)) {
				final double temp = new Helper().getPPIntrSumActRel(pp);
				if (temp > max) {
					max = temp;
					pps = pp;
				}
			}
		}
		return pps;
	}

	/**
	 * Checks if @param pps contains a sequence of runnables: all runnables have
	 * exactly one incoming edge and one outgoing edge except the first runnable
	 * (only one outgoing edge) and the last runnable (only one incoming edge)
	 */
	private boolean isSequence(final ProcessPrototype pps) {
		if (pps.getRunnableCalls().size() == 1) {
			return true;
		}
		int topology = 1;
		for (final TaskRunnableCall trc : pps.getRunnableCalls()) {
			final Runnable r = trc.getRunnable();
			if (this.graph.incomingEdgesOf(r).size() > 1) {
				int counter = 0;
				for (final RunnableSequencingConstraint rsc : this.graph.incomingEdgesOf(r)) {
					final Runnable source = this.graph.getEdgeSource(rsc);
					if (new Helper().getPPfromR(r, this.swm).equals(new Helper().getPPfromR(source, this.swm))) {
						counter++;
						topology++;
					}
					if (counter > 1) {
						return false;
					}
				}
			}
			else if (this.graph.outgoingEdgesOf(r).size() > 1) {
				int counter = 0;
				for (final RunnableSequencingConstraint rsc : this.graph.outgoingEdgesOf(r)) {
					final Runnable target = this.graph.getEdgeTarget(rsc);
					if (new Helper().getPPfromR(r, this.swm).equals(new Helper().getPPfromR(target, this.swm))) {
						counter++;
					}
					if (counter > 1) {
						return false;
					}
				}
			}
			else if (this.graph.outgoingEdgesOf(r).size() == 0 && this.graph.incomingEdgesOf(r).size() == 0
					&& pps.getRunnableCalls().size() > 1) {
				return false;
			}
		}
		if (topology < pps.getRunnableCalls().size()) {
			return false;
		}
		PartLog.getInstance().log(pps.getName() + " is seuqnece");
		return true;
	}
}
