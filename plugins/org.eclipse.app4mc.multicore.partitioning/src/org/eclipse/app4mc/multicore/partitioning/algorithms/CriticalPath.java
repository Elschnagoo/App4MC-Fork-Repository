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
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
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
import org.eclipse.emf.common.util.EList;
import org.jgrapht.alg.CycleDetector;
import org.jgrapht.alg.cycle.SzwarcfiterLauerSimpleCycles;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph;
import org.jgrapht.experimental.dag.DirectedAcyclicGraph.CycleFoundException;

/**
 * This class provides critical path determination, as well as timeframe values
 * (earliest initial time and latest initial time) for any runnable, that is
 * contained within the critical path's graph
 *
 */
public class CriticalPath {

	private final DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> graph;
	private final SWModel swm;
	private final ConstraintsModel cm;
	private Path cp;
	private final Map<Runnable, CriticalPath.tf> cache = new HashMap<Runnable, CriticalPath.tf>();


	class tf {
		long eit = 0;
		long lit = 0;

		public tf(final long eit, final long lit) {
			this.eit = eit;
			this.lit = lit;
		}
	}

	/**
	 * Constructor creates graph from given @param swmodel (swm) and @param
	 * constraints model (cm) already
	 *
	 */
	public CriticalPath(final SWModel swm, final ConstraintsModel cm) {
		this.swm = swm;
		this.cm = cm;
		this.graph = createJGraphT();
		rtlinit();
	}


	private DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> createJGraphT() {
		final DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> test = new DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint>(
				null);
		for (final Runnable r : this.swm.getRunnables()) {
			test.addVertex(r);
		}
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			try {
				test.addDagEdge(rsc.getRunnableGroups().get(0).getRunnables().get(0),
						rsc.getRunnableGroups().get(1).getRunnables().get(0), rsc);
			}
			catch (final CycleFoundException e) {
				// do not add a cycle
			}

			// final Label l = new
			// Helper().getCommonLabel(rsc.getRunnableGroups().get(0).getRunnables().get(0),
			// rsc.getRunnableGroups().get(1).getRunnables().get(0));
			// if (null != l) {
			// test.setEdgeWeight(rsc, l.getSize().getNumberBytes());
			// }
			// else {
			// test.setEdgeWeight(rsc, 1);
			// }
		}

		return test;
	}

	/**
	 * Get the @param r Runnable's time frame wrt the graph
	 *
	 * @return
	 */
	public tf getTF(final Runnable r) {
		return this.cache.get(r);
	}

	/**
	 * calculates the critical path of a swmodel
	 *
	 * @return critical path as EList<Runnable>
	 */
	public EList<Runnable> getCP() {
		if (this.swm.getProcessPrototypes().size() == 0) {
			final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
			final ProcessPrototype pp = swf.createProcessPrototype();
			for (final Runnable r : this.swm.getRunnables()) {
				final TaskRunnableCall trc = swf.createTaskRunnableCall();
				trc.setRunnable(r);
				pp.getRunnableCalls().add(trc);
			}
			this.swm.getProcessPrototypes().add(pp);
		}
		final Path cpt = getCrPa();
		this.cp = cpt;
		updateCacheTFs();
		return sortRunnables(cpt.getRunnablesL());
	}

	/**
	 * Sorts the given @param rl wrt each runnable's eit value
	 *
	 * @return
	 */
	private EList<Runnable> sortRunnables(final EList<Runnable> rl) {
		Collections.sort(rl, new Comparator<Runnable>() {
			@Override
			public int compare(final Runnable o1, final Runnable o2) {
				return (int) getTF(o1).eit - (int) getTF(o2).eit;
			}
		});
		return rl;
	}

	/**
	 * returns the @param EList<Runnable> p as a string of runnables
	 *
	 * @return String with runnables and time frames
	 */
	public String getPathString(final EList<Runnable> p) {
		String str = "";
		for (final Runnable r : p) {
			str += r.getName() + "(" + getTFString(r) + ") ";
		}
		return str;
	}

	/**
	 * Get a time frame of the Runnable @param r, wrt the graph
	 *
	 * @return timeframe consisting of eit (earliest initial time) and lit
	 *         (latest initial time)
	 */
	private String getTFString(final Runnable r) {
		final tf TF = this.cache.get(r);
		return TF.eit + " " + TF.lit;
	}

	/**
	 * critical path calculation
	 *
	 * @return critial path
	 */
	private Path getCrPa() {
		final SzwarcfiterLauerSimpleCycles<Runnable, RunnableSequencingConstraint> slsc = new SzwarcfiterLauerSimpleCycles<Runnable, RunnableSequencingConstraint>();
		slsc.setGraph(this.graph);
		final CycleDetector<Runnable, RunnableSequencingConstraint> cd = new CycleDetector<Runnable, RunnableSequencingConstraint>(
				this.graph);
		if (cd.detectCycles()) {
			PartLog.getInstance().log("THERE ARE STILL CYCLES", null);
			return null;
		}
		LinkedList<Runnable> sinks = new LinkedList<>();
		sinks = new GGP(this.swm, this.cm, this.graph).getSinks();
		final HashMap<Runnable, Long> rts = new HashMap<Runnable, Long>();
		for (final Runnable sink : sinks) {
			rts.put(sink, getLongestPreceedingRT(sink));
		}
		Runnable cps = null;
		long max = 0;
		for (final Runnable r : rts.keySet()) {
			if (rts.get(r).longValue() > max) {
				max = rts.get(r).longValue();
				cps = r;
			}
		}
		assert cps != null;
		Path cpt = new Path();
		cpt = getPrecedingCriticalPath(cps);
		this.cp = cpt;
		this.cp.updateRunTime();
		return cpt;
	}

	private Path getPrecedingCriticalPath(Runnable cps) {
		final Path p = new Path();
		p.getRunnables().add(cps);
		long time = this.rtl.get(cps).longValue() - new Helper().getInstructions(cps);
		while (time > 0) {
			final Set<RunnableSequencingConstraint> iel = this.graph.incomingEdgesOf(cps);
			final long temp = time;
			for (final RunnableSequencingConstraint rsc : iel) {
				final Runnable source = this.graph.getEdgeSource(rsc);
				if (this.rtl.get(source).longValue() == time) {
					p.getRunnables().add(source);
					cps = source;
					time -= new Helper().getInstructions(cps);
					break;
				}
			}
			if (temp == time) {
				PartLog.getInstance().log("no preceeding runnable found. TIME " + time, null);
				break;
			}
		}
		return p;
	}

	/**
	 * calculates the complete runtime (instructions) of a given @param EList
	 * <Runnable>
	 */
	public long getPathLength(final EList<Runnable> rl) {
		long length = 0;
		for (final Runnable r : rl) {
			length += new Helper().getInstructions(r);
		}
		return length;
	}

	public long getPathLength() {
		long length = 0;
		for (final Runnable r : this.cp.getRunnablesL()) {
			length += new Helper().getInstructions(r);
		}
		return length;
	}

	private void updateCacheTFs() {
		initSrtl();
		for (final Runnable run : this.swm.getRunnables()) {
			final tf TF = new tf(0, 0);
			TF.eit = this.rtl.get(run).longValue() - new Helper().getInstructions(run);
			TF.lit = this.cp.runtime - getLongestSuceedingRT(run);
			this.cache.put(run, TF);
		}
	}

	/**
	 * RunTimeList contains all Runnables and their earliest finished times
	 */
	private final HashMap<Runnable, Long> rtl = new HashMap<Runnable, Long>();


	private void rtlinit() {
		for (final Runnable r : this.swm.getRunnables()) {
			this.rtl.put(r, (long) 0);
		}
	}

	/**
	 * requires this.graph and this.rtl to be calculated
	 *
	 * @param r
	 * @return
	 */
	public long getLongestPreceedingRT(final Runnable r) {
		assert this.graph != null;
		long rt = 0;
		if (this.graph.incomingEdgesOf(r).size() == 0) {
			rt = new Helper().getInstructions(r);
			// set sources runtime (earliest finish time)
			this.rtl.put(r, rt);
			return rt;
		}
		final Iterator<RunnableSequencingConstraint> i = this.graph.incomingEdgesOf(r).iterator();
		final Set<Long> rts = new HashSet<Long>();
		while (i.hasNext()) {
			final RunnableSequencingConstraint rscTemp = i.next();
			final Runnable source = this.graph.getEdgeSource(rscTemp);
			if (null != new Helper().getPPfromR(r, this.swm) && null != new Helper().getPPfromR(source, this.swm)
					&& new Helper().getPPfromR(r, this.swm).equals(new Helper().getPPfromR(source, this.swm))) {
				if (this.rtl.get(source).longValue() == 0) {
					rts.add(getLongestPreceedingRT(source));
				}
				else {
					// prevents already visited runnables from redundant
					// calculations
					rts.add(this.rtl.get(source).longValue());
				}
			}
			else {
				if (null == new Helper().getPPfromR(r, this.swm) || null == new Helper().getPPfromR(source, this.swm)) {
					PartLog.getInstance()
							.log("No ProcessPrototype for Runnable " + r.getName() + " or " + source.getName(), null);
				}
			}
		}
		for (final long rtc : rts) {
			if (rt < rtc) {
				rt = rtc;
			}
		}

		final long rtt = rt + new Helper().getInstructions(r);
		this.rtl.put(r, rtt);
		return rtt;
	}

	private final HashMap<Runnable, Long> srtl = new HashMap<Runnable, Long>();

	private void initSrtl() {
		for (final Runnable r : this.swm.getRunnables()) {
			this.srtl.put(r, (long) 0);
		}
	}

	private long getLongestSuceedingRT(final Runnable r) {
		long rt = 0;
		if (this.graph.outgoingEdgesOf(r).size() == 0) {
			rt = new Helper().getInstructions(r);
			this.srtl.put(r, rt);
			return rt;
		}
		final Iterator<RunnableSequencingConstraint> i = this.graph.outgoingEdgesOf(r).iterator();
		final Set<Long> outgoingEdges = new HashSet<Long>();
		while (i.hasNext()) {
			final RunnableSequencingConstraint rscTemp = i.next();
			final Runnable target = this.graph.getEdgeTarget(rscTemp);

			if (null != new Helper().getPPfromR(r, this.swm) && null != new Helper().getPPfromR(target, this.swm)
					&& new Helper().getPPfromR(r, this.swm).equals(new Helper().getPPfromR(target, this.swm))) {
				if (this.srtl.get(target).longValue() == 0) {
					outgoingEdges.add(getLongestSuceedingRT(target));
				}
				else {
					// prevents already visited runnables from redundant
					// calculations
					outgoingEdges.add(this.srtl.get(target).longValue());
				}
			}
		}
		for (final long rtc : outgoingEdges) {
			if (rt < rtc) {
				rt = rtc;
			}
		}

		final long rtt = rt + new Helper().getInstructions(r);
		this.srtl.put(r, rtt);
		return rtt;
	}

	/**
	 * Get a directed graph with runnables as vertices and
	 * runnablesequencingconstraints as edges
	 *
	 * @return graph
	 */
	public DirectedAcyclicGraph<Runnable, RunnableSequencingConstraint> getGraph() {
		return this.graph;
	}


	public Map<Runnable, CriticalPath.tf> getCache() {
		return this.cache;
	}

}
