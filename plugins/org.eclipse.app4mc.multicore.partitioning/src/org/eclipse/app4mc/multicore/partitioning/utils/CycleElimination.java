/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.partitioning.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.jface.preference.IPreferenceStore;
import org.jgrapht.DirectedGraph;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.alg.cycle.TarjanSimpleCycles;
import org.jgrapht.graph.DefaultDirectedWeightedGraph;
import org.jgrapht.graph.DirectedSubgraph;

/**
 * This class taskes advantage of the JGrahT library and is able to remove
 * cycles of a directed graph. Cycles can be removed by minimal decompositions
 * and in a way, that, with respect to the whole graph, the resulting graph
 * provides a great treespread e.i. a graph structure with better parallelism
 * exploitation possibility
 */
public class CycleElimination {
	private final SWModel swm;
	private final ConstraintsModel cm;
	private boolean minimialEdgeElim = false;
	private boolean efficientEdgeInCycle = false;

	/**
	 * constructor
	 *
	 * @param swm
	 * @param cm
	 */
	public CycleElimination(final SWModel swm, final ConstraintsModel cm) {
		this.swm = swm;
		this.cm = cm;
	}

	public SWModel getSwm() {
		return this.swm;
	}

	public ConstraintsModel getCm() {
		return this.cm;
	}

	/**
	 * simply checks, if there exist cycles or a cycle within the SWModel and
	 * Constrainsmodel (graph)
	 */
	public boolean containsCycles() {
		final DirectedGraph<Runnable, RunnableSequencingConstraint> graph = createJGraphT();
		final CycleDetector<Runnable, RunnableSequencingConstraint> cd = new CycleDetector<>(graph);
		if (cd.detectCycles()) {
			return true;
		}
		return false;
	}

	/**
	 * Creates Vertexes foreach Runnable in the software model and weighted
	 * edges for each RunnableSequenceConstraint in the ConstraintsModel,
	 *
	 * @return a directed graph with weighted edges
	 */
	public DirectedGraph<Runnable, RunnableSequencingConstraint> createJGraphT() {
		if (this.swm.getRunnables() == null || this.cm.getRunnableSequencingConstraints() == null) {
			return null;
		}
		final DefaultDirectedWeightedGraph<Runnable, RunnableSequencingConstraint> test = new DefaultDirectedWeightedGraph<>(
				RunnableSequencingConstraint.class);
		for (final Runnable r : this.swm.getRunnables()) {
			test.addVertex(r);
		}
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			if (rsc.getRunnableGroups().get(0).getRunnables().get(0) != null
					&& rsc.getRunnableGroups().get(1).getRunnables().get(0) != null) {
				if (!test.vertexSet().contains(rsc.getRunnableGroups().get(0).getRunnables().get(0))
						|| !test.vertexSet().contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
					PartLog.getInstance().log("Runnables of RSC " + rsc.getName() + " are not contained in JGraph",
							null);
				}
				else {
					test.addEdge(rsc.getRunnableGroups().get(0).getRunnables().get(0),
							rsc.getRunnableGroups().get(1).getRunnables().get(0), rsc);
				}
			}
		}
		return test;
	}

	public void setparams(final boolean efficientEdgeInCycle, final boolean minimalEdgeDis) {
		setEfficientEdgeInCycle(efficientEdgeInCycle);
		setMinimialEdgeElim(minimalEdgeDis);
	}

	public void setparams(final IPreferenceStore s) {
		setEfficientEdgeInCycle(s.getBoolean("boolEffEdge"));
		setMinimialEdgeElim(s.getBoolean("boolMinEdges"));
	}

	/**
	 * Converts given scycles into list of directed subgraphs of Runnables and
	 * RunnableSequencingConstraints
	 *
	 * @param scycles
	 *            A given List (simple cycles) of a list of runnables (derived
	 *            from jgrapht tarjan algorithm)
	 * @param graph
	 *            A directed subgraph required for edge derivation
	 * @return List<DirectedSubGraph<Runnable, RunnablSequencingConstraint>>
	 *         List of cycles
	 */
	private List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> convertSimpleCycleToSubGraph(
			final List<List<Runnable>> scycles, final DirectedGraph<Runnable, RunnableSequencingConstraint> graph) {
		final List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> cycles = new BasicEList<DirectedSubgraph<Runnable, RunnableSequencingConstraint>>();
		for (final List<Runnable> cycle : scycles) {
			final Set<RunnableSequencingConstraint> edgeSubset = new HashSet<RunnableSequencingConstraint>();
			// add edges along with given runnables
			for (int i = 0; i < cycle.size(); i++) {
				if (i == cycle.size() - 1) {
					// connect last runnable with first runnable
					edgeSubset.add(graph.getEdge(cycle.get(i), cycle.get(0)));
				}
				else {
					edgeSubset.add(graph.getEdge(cycle.get(i), cycle.get(i + 1)));
				}
			}
			final Set<Runnable> vertexSet = new HashSet<Runnable>();
			for (final Runnable r : cycle) {
				vertexSet.add(r);
			}
			final DirectedSubgraph<Runnable, RunnableSequencingConstraint> dsg = new DirectedSubgraph<Runnable, RunnableSequencingConstraint>(
					graph, vertexSet, edgeSubset);
			cycles.add(dsg);
		}
		return cycles;
	}

	/**
	 * removes given RSC from constraints models, adds a corresponding
	 * accessPrecedence, calculates new cycle list
	 *
	 * @param graph
	 *            required for new cycle calculation
	 * @param cycles
	 * @param rsc
	 * @return
	 */
	private List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> removeRSC(
			final DirectedGraph<Runnable, RunnableSequencingConstraint> graph,
			List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> cycles,
			final RunnableSequencingConstraint rsc) {
		PartLog.getInstance()
				.log("RSC to be converted to AccessPrecedence: "
						+ rsc.getRunnableGroups().get(0).getRunnables().get(0).getName() + "-->"
						+ rsc.getRunnableGroups().get(1).getRunnables().get(0).getName());
		convertRSCToAP(rsc);
		graph.removeEdge(rsc);
		final TarjanSimpleCycles<Runnable, RunnableSequencingConstraint> tsc = new TarjanSimpleCycles<>(graph);
		cycles = convertSimpleCycleToSubGraph(tsc.findSimpleCycles(), graph);
		if (cycles.size() == 0) {
			return null;
		}
		final List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> deleteMe = new BasicEList<DirectedSubgraph<Runnable, RunnableSequencingConstraint>>();
		for (final DirectedSubgraph<Runnable, RunnableSequencingConstraint> cycle : cycles) {
			if (cycle.vertexSet().size() == 1 || cycle.vertexSet().size() == 0) {
				deleteMe.add(cycle);
			}
		}
		for (final DirectedSubgraph<Runnable, RunnableSequencingConstraint> cycle : deleteMe) {
			cycles.remove(cycle);
		}
		return cycles;
	}

	/**
	 *
	 * deletes the given @param rsc from the swmodel and creates an access
	 * precedence correspondingly
	 */
	private void convertRSCToAP(final RunnableSequencingConstraint rsc) {
		final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
		final AccessPrecedenceSpec ap = swf.createAccessPrecedenceSpec();
		ap.setLabel(new Helper().getCommonLabel(rsc.getRunnableGroups().get(0).getRunnables().get(0),
				rsc.getRunnableGroups().get(1).getRunnables().get(0)));
		ap.setOrigin(rsc.getRunnableGroups().get(0).getRunnables().get(0));
		ap.setTarget(rsc.getRunnableGroups().get(1).getRunnables().get(0));
		ap.setOrderType(AccessPrecedenceType.IGNORE_WR);
		if (this.swm.getProcessPrototypes().size() > 0) {
			final Set<AccessPrecedenceSpec> aps = new HashSet<AccessPrecedenceSpec>();
			aps.add(ap);
			new Helper().assignAPs(aps);
		}
		else {
			PartLog.getInstance()
					.log("No ProcessPrototype for cycle dissolution - creating ProcessPrototype with all runnables");
			final ProcessPrototype pp = swf.createProcessPrototype();
			pp.setName("allRunnables");
			for (final Runnable r : this.swm.getRunnables()) {
				final RunnableCall trc = swf.createRunnableCall();
				trc.setRunnable(r);
				pp.getRunnableCalls().add(trc);
			}
			pp.getAccessPrecedenceSpec().add(ap);
			this.swm.getProcessPrototypes().add(pp);
		}
		this.cm.getRunnableSequencingConstraints().remove(rsc);
	}


	/**
	 * Due to cycles must be avoided within DAGs, this method analyzes all
	 * cycles within @param cycles, identifies the most cost intensive cycle and
	 * returns an edge within this cycle, that cuts the cycle either into two
	 * approximately equally branches, into a preceding branch or into a
	 * successing branch
	 *
	 * @param cycles
	 *            the cycles within the graph
	 * @return edge, that shall be removed
	 */
	private RunnableSequencingConstraint getMostEfficientRemoveEdge(
			final List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> cycles) {
		final DirectedSubgraph<Runnable, RunnableSequencingConstraint> bc = getBiggestCycle(cycles);
		Runnable source = getBiggestPrecedingRunnable(bc);
		long sourcert = new Helper().getPreceedingRunTimeCycle(this.cm, source);
		Runnable source2 = getBiggestSuccessingRunnable(bc);
		long source2rt = new Helper().getSucceedingRunTimeCycle(this.cm, source2);
		boolean preceding = true;
		if (source2rt > sourcert) {
			preceding = false;
			source = source2;
			sourcert = source2rt;
		}
		else {
			source2 = source;
			source2rt = sourcert;
		}
		long cycleRestWeight = 0;
		for (final Runnable rt : bc.vertexSet()) {
			if (rt != source) {
				cycleRestWeight += new Helper().getInstructions(rt);
			}
		}
		RunnableSequencingConstraint removeMe = this.cm.getRunnableSequencingConstraints().get(0);
		if (cycleRestWeight < (sourcert - new Helper().getInstructions(source))) {
			if (preceding) {
				while (bc.incomingEdgesOf(source).size() == 1
						&& ((RunnableSequencingConstraint) bc.incomingEdgesOf(source).toArray()[0]).getRunnableGroups()
								.get(0).getRunnables().get(0) != source2) {
					removeMe = (RunnableSequencingConstraint) bc.incomingEdgesOf(source).toArray()[0];
					source = removeMe.getRunnableGroups().get(0).getRunnables().get(0);
				}
			}
			else {
				while (bc.outgoingEdgesOf(source).size() == 1
						&& ((RunnableSequencingConstraint) bc.outgoingEdgesOf(source).toArray()[0]).getRunnableGroups()
								.get(1).getRunnables().get(0) != source2) {
					removeMe = (RunnableSequencingConstraint) bc.outgoingEdgesOf(source).toArray()[0];
					source = removeMe.getRunnableGroups().get(1).getRunnables().get(0);
				}
			}
		}
		else {
			cycleRestWeight /= 2;
			PartLog.getInstance().log("Cycle branch length: " + Long.toString(cycleRestWeight));
			long branchLength = 0;
			removeMe = (RunnableSequencingConstraint) bc.outgoingEdgesOf(source).toArray()[0];
			while (branchLength < cycleRestWeight) {
				final Runnable target = bc
						.getEdgeTarget((RunnableSequencingConstraint) bc.outgoingEdgesOf(source).toArray()[0]);
				final long branchLengthA = branchLength + new Helper().getInstructions(target);
				if (branchLengthA == cycleRestWeight) {
					removeMe = (RunnableSequencingConstraint) bc.outgoingEdgesOf(target).toArray()[0];
					break;
				}
				else if (branchLengthA < cycleRestWeight) {
					branchLength = branchLengthA;
					source = target;
				}
				else if (branchLengthA > cycleRestWeight) {
					final long distCycleRestWeightb = cycleRestWeight - branchLength;
					final long distCycleRestWeighta = branchLengthA - cycleRestWeight;
					if (distCycleRestWeighta > distCycleRestWeightb) {
						return (RunnableSequencingConstraint) bc.outgoingEdgesOf(source).toArray()[0];
					}
					return (RunnableSequencingConstraint) bc.outgoingEdgesOf(target).toArray()[0];
				}
			}
		}
		return removeMe;
	}

	/**
	 * identifies a cycle from the given list of cycles, thats sum of included
	 * runnable's instructions if the largest
	 *
	 * @param cycles
	 * @return cycle with most instructions (derived from included runnables)
	 */
	private DirectedSubgraph<Runnable, RunnableSequencingConstraint> getBiggestCycle(
			final List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> cycles) {
		// bcw= biggest cycle weight
		long bcw = 0;
		DirectedSubgraph<Runnable, RunnableSequencingConstraint> bc = null;
		for (final DirectedSubgraph<Runnable, RunnableSequencingConstraint> dsg : cycles) {
			// cw=current weight
			final long cw = getCycleWeight(dsg);
			if (cw > bcw) {
				bcw = cw;
				bc = dsg;
			}
			else if (cw == bcw) {
				// two cycles with same weight found
				final long icw1 = getBiggestPrecedingRuntime(bc);
				final long icw2 = getBiggestPrecedingRuntime(dsg);
				if (icw2 > icw1) {
					bcw = cw;
					bc = dsg;
				}
			}
		}
		return bc;
	}

	/**
	 * @return (long) biggest preceding sum of instructions of the @param cycle
	 *         runnables w.r.t. total graph
	 */
	private long getBiggestPrecedingRuntime(final DirectedSubgraph<Runnable, RunnableSequencingConstraint> bc) {
		long bpr = 0;
		for (final Runnable r : bc.vertexSet()) {
			final long pr = new Helper().getPreceedingRunTimeCycle(this.cm, r);
			if (pr > bpr) {
				bpr = pr;
			}
		}
		return bpr;
	}

	/**
	 * @return runnable, thats preceding sum of instructions of the @param cycle
	 *         runnables w.r.t. total graph is the biggest
	 */
	private Runnable getBiggestPrecedingRunnable(final DirectedSubgraph<Runnable, RunnableSequencingConstraint> bc) {
		long bpr = 0;
		Runnable rr = null;
		for (final Runnable r : bc.vertexSet()) {
			final long pr = new Helper().getPreceedingRunTimeCycle(this.cm, r);
			if (pr > bpr) {
				bpr = pr;
				rr = r;
			}
		}
		return rr;
	}

	/**
	 * @return runnable, thats suceeding sum of instructions of the @param cycle
	 *         runnables w.r.t. total graph is the biggest
	 */
	private Runnable getBiggestSuccessingRunnable(final DirectedSubgraph<Runnable, RunnableSequencingConstraint> bc) {
		long bpr = 0;
		Runnable rr = null;
		for (final Runnable r : bc.vertexSet()) {
			final long pr = new Helper().getSucceedingRunTimeCycle(this.cm, r);
			if (pr > bpr) {
				bpr = pr;
				rr = r;
			}
		}
		return rr;
	}

	/**
	 * calculates a list of edges, used by maximal number of cycles. E.g. 2
	 * Edges E1, E2 used within 3 Cycles, Edge E3 used in 2 Cycles, just edges
	 * E1 and E2 are returned.
	 *
	 * @param cycles
	 * @return
	 */
	private RunnableSequencingConstraint getMostCommonEdges(
			final List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> cycles) {
		if (cycles.size() == 1) {
			return getMostEfficientRemoveEdge(cycles);
		}

		final Map<RunnableSequencingConstraint, Integer> mceReps = new HashMap<RunnableSequencingConstraint, Integer>();
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			mceReps.put(rsc, 0);
		}
		for (final DirectedSubgraph<Runnable, RunnableSequencingConstraint> dsg : cycles) {
			for (final RunnableSequencingConstraint rsc : dsg.edgeSet()) {
				mceReps.put(rsc, mceReps.get(rsc) + 1);
			}
		}
		int reps = 0;
		RunnableSequencingConstraint mce = null;
		final Iterator<Entry<RunnableSequencingConstraint, Integer>> it = mceReps.entrySet().iterator();
		while (it.hasNext()) {
			final Map.Entry<RunnableSequencingConstraint, Integer> pair = it.next();
			if (pair.getValue() > reps) {
				reps = pair.getValue();
				mce = pair.getKey();
			}
			it.remove();
		}
		if (reps == 1) {
			return null;
		}
		return mce;
	}

	/**
	 * @param dsg
	 *            = DirectedSubGraph, that forms the cycle
	 * @return (long) sum of the cycle's runnable's instructions
	 */
	private long getCycleWeight(final DirectedSubgraph<Runnable, RunnableSequencingConstraint> dsg) {
		long cw = 0;
		for (final Runnable r : dsg.vertexSet()) {
			cw += new Helper().getInstructions(r);
		}
		return cw;
	}

	public void setEfficientEdgeInCycle(final boolean efficientEdgeInCycle) {
		this.efficientEdgeInCycle = efficientEdgeInCycle;
	}

	public void setMinimialEdgeElim(final boolean minimialEdgeElim) {
		this.minimialEdgeElim = minimialEdgeElim;
	}

	public boolean isMinimialEdgeElim() {
		return this.minimialEdgeElim;
	}

	public boolean isEfficientEdgeInCycle() {
		return this.efficientEdgeInCycle;
	}

	/**
	 * adjusts the class's constraints and swm-model by detecting cycles and
	 * decomposing them via converting RunnableSequencingConstraints to
	 * AccessPrecedences. Decomposition is configured by global boolean
	 * minimalEdgeElim, that defines, if RSCs are preffered, that decompose
	 * multiple cycles and gloabl boolean efficientEdgeInCycle that defines, if
	 * simply any edge is decomosed in a cycle or a calculated edge, that
	 * results in a graph featuring a great parallelization structure
	 */
	public IStatus run(final IProgressMonitor monitor) {
		DirectedGraph<Runnable, RunnableSequencingConstraint> graph;
		graph = createJGraphT();
		if (graph == null) {
			PartLog.getInstance().log("No Constraints model!", null);
			return Status.CANCEL_STATUS;
		}
		PartLog.getInstance().setLogName("Cycle Elimination");

		if (!this.minimialEdgeElim) {
			final Cycle<Runnable, RunnableSequencingConstraint> mc = new Cycle<Runnable, RunnableSequencingConstraint>(
					graph);
			if (monitor == null) {
				mc.findSimpleCycles();
				for (final RunnableSequencingConstraint rsc : mc.getRemovedEdges()) {
					convertRSCToAP(rsc);
				}
			}
			else {
				monitor.beginTask("Cycle Elimination", mc.getRemovedEdges().size());
				mc.findSimpleCycles();
				for (final RunnableSequencingConstraint rsc : mc.getRemovedEdges()) {
					monitor.worked(1);
					convertRSCToAP(rsc);
				}
				monitor.done();
			}
			return Status.OK_STATUS;
		}

		final TarjanSimpleCycles<Runnable, RunnableSequencingConstraint> tsc = new TarjanSimpleCycles<>();
		tsc.setGraph(graph);
		final List<List<Runnable>> scycles = tsc.findSimpleCycles();
		List<DirectedSubgraph<Runnable, RunnableSequencingConstraint>> cycles = convertSimpleCycleToSubGraph(scycles,
				graph);
		final StringBuffer sb = new StringBuffer();
		sb.append("SimpleCycles: ");
		for (final List<Runnable> rl : scycles) {
			sb.append("\n" + scycles.indexOf(rl) + ":(");
			for (final Runnable r : rl) {
				sb.append(r.getName() + ", ");
			}
			sb.append(")");
		}
		PartLog.getInstance().log(sb.toString());
		// initialize remove edge re
		RunnableSequencingConstraint re = null;
		monitor.beginTask("Cycle elimintation", cycles.size());
		while (cycles != null && cycles.size() > 0) {
			monitor.worked(1);
			if (this.minimialEdgeElim) {
				re = getMostCommonEdges(cycles);
				if (re == null) {
					// no common edges among cycles
					if (this.efficientEdgeInCycle) {
						re = getMostEfficientRemoveEdge(cycles);
					}
					else {
						re = cycles.get(0).edgeSet().iterator().next();
					}
				}
			}
			else {
				// no minimal edge dissolution
				if (this.efficientEdgeInCycle) {
					re = getMostEfficientRemoveEdge(cycles);
				}
				else {
					re = cycles.get(0).edgeSet().iterator().next();
				}
			}
			if (re != null) {
				cycles = removeRSC(graph, cycles, re);
			}
			else {
				PartLog.getInstance().log("Cycle elimination could not find remove edge!", null);
				return Status.CANCEL_STATUS;
			}
		}

		return Status.OK_STATUS;
	}


}
