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

import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.jgrapht.DirectedGraph;

/**
 * Class to remove edges within either a DirectedGraph or from a
 * RunnableSequencingConstraints set from given AccessPrecendenceSpecs
 *
 */
public class RemoveGraphEdges {

	private EList<RunnableSequencingConstraint> RSCs;

	public void setRSCs(final EList<RunnableSequencingConstraint> rSCs) {
		this.RSCs = rSCs;
	}

	public EList<RunnableSequencingConstraint> getRSCs() {
		return this.RSCs;
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
	public void removeAPSRSCs(final Object obj, final SWModel swm) {
		Iterator<?> it = null;
		final EList<RunnableSequencingConstraint> rsclist = new BasicEList<RunnableSequencingConstraint>();
		if (obj instanceof EList<?>) {
			final EList<?> list = (EList<?>) obj;
			it = list.iterator();
		}
		else if (obj instanceof DirectedGraph<?, ?>) {
			final DirectedGraph<?, ?> graph = (DirectedGraph<?, ?>) obj;
			it = graph.edgeSet().iterator();
		}

		while (null != it && it.hasNext()) {
			final Object rscit = it.next();
			if (rscit instanceof RunnableSequencingConstraint) {
				rsclist.add((RunnableSequencingConstraint) rscit);
			}
		}
		setRSCs(rsclist);

		for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
			if (null != pp.getAccessPrecedenceSpec() && 0 < pp.getAccessPrecedenceSpec().size()) {
				for (final AccessPrecedenceSpec aps : pp.getAccessPrecedenceSpec()) {
					final RunnableSequencingConstraint rscrem = getRSCfromAPS(aps);
					if (null != rscrem) {
						rsclist.remove(rscrem);
						PartLog.getInstance().log("Removed RSC " + rscrem.getName() + " due to APS");
					}
				}
			}
		}
		setRSCs(rsclist);

		// Create PP reffering all runnables if TRCs do not match the number of
		// all Runnables
		new Helper().checkTRCsVsAllRunnables(swm);
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
			if (new Helper().AllRSCsHave2ValidEntries(this.RSCs)) {
				if (aps.getOrigin().equals(rsc.getRunnableGroups().get(0).getRunnables().get(0))
						&& aps.getTarget().equals(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
					return rsc;
				}
			}
		}
		return null;
	}
}
