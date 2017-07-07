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

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;

/**
 * GGP means Global Graph Partitioning. The GGP approach identifies independent
 * graphs and creates ProcessPrototypes for each graph.
 */
public class GGP {
	private final SWModel swm;
	private final ConstraintsModel cm;
	private LinkedList<Runnable> unassigned = new LinkedList<Runnable>();
	LinkedList<LinkedList<Runnable>> tasks = new LinkedList<LinkedList<Runnable>>();
	private final LinkedList<Runnable> visited = new LinkedList<Runnable>();
	private final LinkedList<Runnable> unvisited = new LinkedList<Runnable>();
	private DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> graph = null;

	GGP(final SWModel swm, final LinkedList<Runnable> uCNs, final LinkedList<LinkedList<Runnable>> threads,
			final ConstraintsModel cm) {
		this.swm = swm;
		this.unassigned = uCNs;
		this.tasks = threads;
		this.cm = cm;
	}

	public GGP(final SWModel swm, final ConstraintsModel cm) {
		this.cm = cm;
		this.swm = swm;
		for (final Runnable r : swm.getRunnables()) {
			this.unassigned.add(r);
			this.unvisited.add(r);
		}
	}

	public GGP(final SWModel swm, final ConstraintsModel cm,
			final DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> graph) {
		this.cm = cm;
		this.swm = swm;
		this.graph = graph;
	}

	/**
	 * starts the independent graph identification and stores its outcome in the
	 * SWModel swm as prototypes
	 */
	public void build() {
		if (this.unassigned.size() == 0) {
			this.unassigned.addAll(this.swm.getRunnables());
		}
		else if (this.unassigned.size() != this.swm.getRunnables().size()) {
			PartLog.getInstance().log("Unassigned != Runnables.size");
		}
		PartLog.getInstance().setLogName("GG Partitioning");
		if (this.swm.getProcessPrototypes().size() == 0) {
			final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
			final ProcessPrototype pp = swf.createProcessPrototype();
			pp.setName("AllRunnables");
			for (final Runnable r : this.swm.getRunnables()) {
				final TaskRunnableCall trc = swf.createTaskRunnableCall();
				trc.setRunnable(r);
				pp.getRunnableCalls().add(trc);
			}
			this.swm.getProcessPrototypes().add(pp);
		}

		this.graph = new CriticalPath(getSwm(), getCm()).getGraph();

		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			genGraphs(pp);
		}
		final StringBuffer sb = new StringBuffer();
		int ct = 0;
		for (final LinkedList<Runnable> lrl : this.tasks) {
			sb.append(ct++ + ": ");
			for (final Runnable r : lrl) {
				sb.append(r.getName() + ", ");
			}
			sb.append("\n");
		}
		// PartLog.getInstance().log(sb.toString());
		correctPPs();
	}

	/**
	 * This method identifies the first unassigned source runnable of a
	 * ProcessPrototype, and returns the corresponding graph. In case there are
	 * multiple independent graphs within a ProcessPrototype, the method
	 * recursively assigns all graphs to the global thread list begnning with
	 * the biggest graph untill the smallest graph is returned. In case there is
	 * no graph but loose runnables only, the method returns a list of all loose
	 * runnables according to the ProcessPrototye.
	 *
	 * @throws Exception
	 **/
	private void genGraphs(final ProcessPrototype pp) {
		final LinkedList<Runnable> sinks = getSinks(pp);
		if (sinks.size() == 0) {
			PartLog.getInstance().log("getGraph didnt find unhandled Runnable at" + pp.getName() + " TRCs "
					+ pp.getRunnableCalls().size(), null);
			return;
		}

		for (final Runnable r : sinks) {
			if (this.unassigned.contains(r)) {
				final Set<Runnable> task = getCoherentNodes(r, pp);
				this.unassigned.removeAll(task);
				final LinkedList<Runnable> temp = new LinkedList<Runnable>();
				temp.addAll(task);
				this.tasks.add(temp);
			}
		}
	}

	private LinkedList<Runnable> getSinks(final ProcessPrototype pp) {
		final LinkedList<Runnable> sinks = getSinks();
		final Set<Runnable> rs = new HashSet<Runnable>();
		for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
			rs.add(trc.getRunnable());
		}
		sinks.retainAll(rs);
		return sinks;
	}

	public LinkedList<Runnable> getSinks() {
		final LinkedList<Runnable> sinks = new LinkedList<Runnable>();
		for (final Runnable r : this.swm.getRunnables()) {
			if (this.graph.outgoingEdgesOf(r).size() == 0) {
				sinks.add(r);
			}
			else {
				final Set<RunnableSequencingConstraint> oe = this.graph.outgoingEdgesOf(r);
				int ct = 0;
				for (final RunnableSequencingConstraint rsc : oe) {
					final Runnable target = this.graph.getEdgeTarget(rsc);
					if (!new Helper().getPPfromR(r, this.swm).equals(new Helper().getPPfromR(target, this.swm))) {
						ct++;
					}
				}
				if (oe.size() == ct) {
					sinks.add(r);
				}
			}
		}
		if (sinks.size() == 0) {
			PartLog.getInstance().log("No sink found", null);
		}
		return sinks;
	}

	/**
	 * Looks for all Runnables within the ProcessPrototype @param ppi, that
	 * precede or succeed the runnable @param r according to dependencies
	 *
	 */
	private Set<Runnable> getCoherentNodes(final Runnable r, final ProcessPrototype pp) {
		final Set<Runnable> rl = new HashSet<Runnable>();
		rl.add(r);
		this.visited.add(r);
		final Iterator<RunnableSequencingConstraint> i = this.graph.incomingEdgesOf(r).iterator();
		while (i.hasNext()) {
			final RunnableSequencingConstraint rsc = i.next();
			final Runnable source = this.graph.getEdgeSource(rsc);
			if (new Helper().getPPfromR(source, this.swm).equals(pp) && !this.visited.contains(source)) {
				rl.addAll(getCoherentNodes(source, pp));
			}
		}
		final Iterator<RunnableSequencingConstraint> i2 = this.graph.outgoingEdgesOf(r).iterator();
		while (i2.hasNext()) {
			final RunnableSequencingConstraint rsc = i2.next();
			final Runnable target = this.graph.getEdgeTarget(rsc);
			if (new Helper().getPPfromR(target, this.swm).equals(pp) && !this.visited.contains(target)) {
				rl.addAll(getCoherentNodes(target, pp));
			}
		}
		return rl;
	}

	public SWModel getSwm() {
		return this.swm;
	}

	public ConstraintsModel getCm() {
		return this.cm;
	}

	/**
	 * creates PPs, TRCs, PPname, PPactivation, PPfirstrunnable, PPlastrunnable
	 * requires this.tasks
	 */
	private void correctPPs() {
		this.swm.getProcessPrototypes().clear();
		int i = 0;
		for (final LinkedList<Runnable> llr : this.tasks) {
			final AmaltheaFactory instance = AmaltheaFactory.eINSTANCE;

			final ProcessPrototype pp = instance.createProcessPrototype();
			for (final Runnable r : llr) {
				final TaskRunnableCall trc = instance.createTaskRunnableCall();
				trc.setRunnable(r);
				pp.getRunnableCalls().add(trc);
			}
			pp.setName("PP" + i++);
			pp.setActivation(pp.getRunnableCalls().get(0).getRunnable().getFirstActivation());	//TODO: handle multiple activations
			pp.setFirstRunnable(llr.get(0));
			pp.setLastRunnable(llr.get(llr.size() - 1));
			this.swm.getProcessPrototypes().add(pp);
		}
		// update PP references in constraints model
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			final Runnable source = rsc.getRunnableGroups().get(0).getRunnables().get(0);
			final Runnable target = rsc.getRunnableGroups().get(1).getRunnables().get(0);
			if (!this.swm.getRunnables().contains(source) || !this.swm.getRunnables().contains(target)) {
				PartLog.getInstance().log("Runnable " + source.getName() + " / " + target.getName()
						+ " could not be found. SWM.size:" + this.swm.getRunnables().size(), null);
			}
			for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
				for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
					if (trc.getRunnable().equals(source)) {
						rsc.getProcessScope().clear();
						rsc.getProcessScope().add(pp);
					}
					else if (trc.getRunnable().equals(target)) {
						rsc.getProcessScope().clear();
						rsc.getProcessScope().add(pp);
					}
				}
			}
		}
	}
}
