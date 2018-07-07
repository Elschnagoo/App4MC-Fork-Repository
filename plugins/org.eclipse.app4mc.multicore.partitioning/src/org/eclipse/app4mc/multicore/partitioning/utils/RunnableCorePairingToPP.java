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

import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TargetCore;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class RunnableCorePairingToPP {

	ConstraintsModel cm;
	SWModel swm;

	public RunnableCorePairingToPP(final SWModel SW, final ConstraintsModel CM) {
		this.swm = SW;
		this.cm = CM;
	}

	public void getPPsFromCorePairingsSplit() {
		this.swm.getProcessPrototypes().addAll(getPPsFromCorePairings());
	}

	private EList<ProcessPrototype> getPPsFromCorePairings() {
		final EList<ProcessPrototype> ppl = new BasicEList<ProcessPrototype>();
		final HashMap<ProcessingUnit, Integer> CorePPIndexMap = new HashMap<ProcessingUnit, Integer>();

		for (final AffinityConstraint ac : this.cm.getAffinityConstraints()) {
			if (ac instanceof RunnablePairingConstraint) {
				final RunnablePairingConstraint rpc = (RunnablePairingConstraint) ac;
				if (null != rpc.getTarget() && rpc.getTarget() instanceof TargetCore) {

					final ProcessingUnit c = ((TargetCore) rpc.getTarget()).getCores().get(0);
					if (!CorePPIndexMap.containsKey(c)) {
						final ProcessPrototype pp = AmaltheaFactory.eINSTANCE.createProcessPrototype();
						pp.setName("CorePairing" + c.getName());
						final Tag tag = AmaltheaFactory.eINSTANCE.createTag();
						tag.setName("CorePairing" + c.getName());
						if (((TargetCore) rpc.getTarget()).getCores().size() > 1) {
							// TODO can be done more efficiently
							pp.setName(pp.getName() + "+");
							tag.setName(tag.getName() + "+");
						}
						pp.getTags().add(tag);
						for (final Runnable r : ((RunnableEntityGroup) rpc.getGroup()).getRunnables()) {
							final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
							trc.setRunnable(r);
							pp.getRunnableCalls().add(trc);
							pp.getTags().add(tag);
						}
					}
					else {
						for (final Runnable r : ((RunnableEntityGroup) rpc.getGroup()).getRunnables()) {
							final TaskRunnableCall trc = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
							trc.setRunnable(r);
							ppl.get(CorePPIndexMap.get(c)).getRunnableCalls().add(trc);
						}
					}
				}
			}
		}

		return ppl;
	}

}
