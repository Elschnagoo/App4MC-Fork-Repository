/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.utils;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.jgrapht.DirectedGraph;

/**
 * Class to remove edges within either a DirectedGraph or from a
 * RunnableSequencingConstraints set from given AccessPrecendenceSpecs
 *
 */
public class RemoveGraphEdges {

	EList<RunnableSequencingConstraint> RSCs;
	SWModel swm;

	public void setSwm(final SWModel swm) {
		this.swm = swm;
	}

	public void setRSCs(final EList<RunnableSequencingConstraint> rSCs) {
		this.RSCs = rSCs;
	}

	/**
	 * Removes AccessPrecedeceSpec Edges from a DirectedGraph
	 *
	 * @param graph
	 *            DirectedGraph
	 * @param swm
	 *            must contain AccessPrecedeceSpecs in any ProcessPrototypes
	 */
	public void removeAPSEdges(final DirectedGraph<Runnable, RunnableSequencingConstraint> graph, final SWModel swm) {
		for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
			if (null != pp.getAccessPrecedenceSpec() && 0 < pp.getAccessPrecedenceSpec().size()) {
				for (final AccessPrecedenceSpec aps : pp.getAccessPrecedenceSpec()) {
					final RunnableSequencingConstraint rscrem = getRSCfromAPS(aps);
					if (null != rscrem) {
						graph.removeEdge(rscrem);
					}
				}
			}
		}
	}

	/**
	 * Removes AccessPrecedeceSpec Edges from a RunnableSequencingConstraints
	 * list
	 *
	 * @param eList
	 *            RunnableSequencingConstraints
	 * @param swm
	 *            must contain AccessPrecedeceSpecs in any ProcessPrototypes
	 */
	public void removeAPSRSCs(final EList<RunnableSequencingConstraint> eList, final SWModel swm) {
		setRSCs(eList);
		setSwm(swm);
		for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
			if (null != pp.getAccessPrecedenceSpec() && 0 < pp.getAccessPrecedenceSpec().size()) {
				for (final AccessPrecedenceSpec aps : pp.getAccessPrecedenceSpec()) {
					final RunnableSequencingConstraint rscrem = getRSCfromAPS(aps);
					if (null != rscrem) {
						eList.remove(rscrem);
						PartLog.getInstance().log("Removed RCS " + rscrem.getName() + " due to APS");
					}
				}
			}
		}
		// Create PP reffering all runnables
		final EList<TaskRunnableCall> etrcs = getTRCs();
		if (etrcs.size() < swm.getRunnables().size()) {
			final ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
			pp.setName("AllRunnables");
			final EList<TaskRunnableCall> alltrcs = new BasicEList<TaskRunnableCall>();
			for (final Runnable r : this.swm.getRunnables()) {
				final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
				trc.setRunnable(r);
				alltrcs.add(trc);
			}
			pp.getRunnableCalls().addAll(alltrcs);
			swm.getProcessPrototypes().add(pp);
			PartLog.getInstance().log("Created AllRunnablesPP with " + alltrcs.size() + " TRCs");
		}
	}

	/**
	 *
	 * @return all taskrunnablecalls across processprototypes
	 */
	private EList<TaskRunnableCall> getTRCs() {
		final EList<TaskRunnableCall> trcs = new BasicEList<TaskRunnableCall>();
		for (final ProcessPrototype pp : this.swm.getProcessPrototypes()) {
			trcs.addAll(pp.getRunnableCalls());
		}
		return trcs;
	}

	/**
	 * If there exists a RunnableSequencingConstraint matching the
	 * AccessPrecedenceSpec, it will be returned
	 *
	 * @param aps
	 *            AccessPrecedenceSpec
	 * @return RSC matching the APS
	 */
	private RunnableSequencingConstraint getRSCfromAPS(final AccessPrecedenceSpec aps) {
		assert null != this.RSCs;
		if (null == this.RSCs) {
			return null;
		}
		for (final RunnableSequencingConstraint rsc : this.RSCs) {
			if (aps.getOrigin().equals(rsc.getRunnableGroups().get(0).getRunnables().get(0))
					&& aps.getTarget().equals(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
				return rsc;
			}
		}
		return null;
	}
}
