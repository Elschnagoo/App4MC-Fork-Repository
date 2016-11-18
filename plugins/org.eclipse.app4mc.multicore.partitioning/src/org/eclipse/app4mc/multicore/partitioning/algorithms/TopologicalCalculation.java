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

import java.util.LinkedList;

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;

/**
 * This class provides different topological calculations on a given graph
 * structure, that is defined by a software model and a constraints model
 *
 */
public class TopologicalCalculation {
	private final SWModel swm;
	private LinkedList<Runnable> untreatedCNs;
	private final ConstraintsModel cm;

	public TopologicalCalculation(final SWModel swm, final ConstraintsModel cm) {
		this.swm = swm;
		this.cm = cm;
	}

	/**
	 * Calculates the shortest path to the next sink from a specific runnable.
	 *
	 * @param Runnable
	 *            r defines the Runnable, thats distance to the next sink shall
	 *            be calculated
	 * @return int distance specifies the distance to the next sink e.g. r-x-x-s
	 *         (r=param Runnable thats distance shall be calculated, x = any
	 *         adjacent runnable, s = sink) the returned value will be 4 due to
	 *         r being the fourth last runnable according to the next sink
	 */
	public int calcNodesToSink(final Runnable r) {
		int distance = 0;
		// will contain all distances from all adjacent runnables
		final LinkedList<Integer> distList = new LinkedList<Integer>();
		final LinkedList<Runnable> sinks = getSinks();
		final LinkedList<RunnableSequencingConstraint> rscs = getOrigins(r);
		if (!sinks.contains(r)) {
			for (int edges = 0; edges < rscs.size(); edges++) {
				final Runnable target = rscs.get(edges).getRunnableGroups().get(1).getRunnables().get(0);
				distList.add(calcNodesToSink(target));
			}
		}
		else {
			distList.add(0);
		}

		for (int j = 0; j < distList.size(); j++) {
			distance = Math.max(distance, distList.get(j));
		}
		distance += 1;
		return distance;
	}

	/**
	 * Accesses the global SWModel swm and returns all sinks
	 *
	 * @return LinkedList<Runnable>, that contains all Sink-Runnables (no RSC
	 *         reveals such a Sink-Runnable within the first RunnableGroup)
	 */
	private LinkedList<Runnable> getSinks() {
		final LinkedList<Runnable> sinks = new LinkedList<Runnable>();
		final LinkedList<Runnable> origins = new LinkedList<Runnable>();
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			origins.add(rsc.getRunnableGroups().get(0).getRunnables().get(0));
		}
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			if (!(origins.contains(rsc.getRunnableGroups().get(1).getRunnables().get(0)))
					&& !sinks.contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
				sinks.add(rsc.getRunnableGroups().get(1).getRunnables().get(0));
			}
			if (!this.swm.getRunnables().contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
				sinks.add(rsc.getRunnableGroups().get(0).getRunnables().get(0));
			}
		}
		return sinks;
	}

	/**
	 * Accesses the global ConstraintsModels cm and returns all
	 * RunnableSequencingConstraints, that have the param Runnable within the
	 * first RunnableGroup
	 *
	 * @param Runnable
	 *            r specifies the Runnable, that the RSCs must provide within
	 *            the first RunnableGroup
	 * @return LinkedList<RunnableSequencingConstraint> rscs contains all RSCs,
	 *         that provide the param Runnable within the first RunnableGroup
	 */
	private LinkedList<RunnableSequencingConstraint> getOrigins(final Runnable r) {
		final LinkedList<RunnableSequencingConstraint> rscs = new LinkedList<RunnableSequencingConstraint>();
		for (final RunnableSequencingConstraint rsc : this.cm.getRunnableSequencingConstraints()) {
			for (final Runnable r2 : rsc.getRunnableGroups().get(0).getRunnables()) {
				if (r2.getName() != null && r.getName() != null) {
					if (r2.getName().equals(r.getName()) && !(rscs.contains(rsc))) {
						rscs.add(rsc);
					}
				}
			}
		}
		return rscs;
	}

	public Runnable getFarthestNode(final int distance) {
		if (this.untreatedCNs == null) {
			this.untreatedCNs = new LinkedList<Runnable>();
			for (final Runnable r : this.swm.getRunnables()) {
				this.untreatedCNs.add(r);
			}
		}
		int l = 0;
		Runnable r = null;
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				if (this.untreatedCNs.contains(trc.getRunnable())) {
					final int k = calcNodesToSink(trc.getRunnable());
					if (k > l && k < distance) {
						l = k;
						r = trc.getRunnable();
					}
				}
			}
		}
		final int temp = calcNodesToSink(r);
		if (temp > distance && temp != 1) {
			r = null;
		}
		return r;
	}
}
