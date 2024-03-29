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

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.ASILType;
import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableGroup;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.TagGroup;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class MergeRunnablePairings {
	/**
	 * combining runnables via affinity constraints @param, @return
	 * AmaltheaModel
	 */
	public Amalthea merge(final Amalthea modelCopy) {
		if (modelCopy.getConstraintsModel() != null && modelCopy.getConstraintsModel().getAffinityConstraints() != null
				&& modelCopy.getConstraintsModel().getAffinityConstraints().size() > 0) {
			PartLog.getInstance().log("Found AffinityConstraints, Creating CumulatedRunnables");
			final AmaltheaFactory af = AmaltheaFactory.eINSTANCE;
			final EList<AffinityConstraint> acs = modelCopy.getConstraintsModel().getAffinityConstraints();
			for (final AffinityConstraint ac : acs) {
				// null check since runnables shall only be cumulated if they
				// dont pair with a target (e.g. core)
				if (ac instanceof RunnablePairingConstraint && ((RunnablePairingConstraint) ac).getTarget() == null) {
					final RunnablePairingConstraint rpc = (RunnablePairingConstraint) ac;
					ceckConsistency(rpc);
					final Runnable r = af.createRunnable();
					r.setName("CumulatedRunnable" + modelCopy.getConstraintsModel().getAffinityConstraints().indexOf(ac));
					final RunnableGroup rg = rpc.getGroup();
					final RunnableEntityGroup reg = (RunnableEntityGroup) rg;
					long instrCum = 0;
					for (final Runnable run : reg.getRunnables()) {
						instrCum += new Helper().getInstructions(run);
						// do not add instruction constants / deviations;
						// cumulation is added later
						final EList<CallGraphItem> ril = new BasicEList<CallGraphItem>();
						for (final CallGraphItem ri : run.getRunnableItems()) {
							if (!(ri instanceof Ticks)) {
								ril.add(ri);
							}
						}
						r.getRunnableItems().addAll(ril);
						r.getActivations().add(run.getFirstActivation());
						// TODO: handle multiple activations
						r.getTags().addAll(run.getTags());
					}
// TODO
//					final InstructionsConstant ic = af.createInstructionsConstant();
//					ic.setValue(instrCum);
//					final RunnableInstructions runInst = af.createRunnableInstructions();
//					runInst.setDefault(ic);
//					r.getRunnableItems().add(runInst);
//					modelCopy.getSwModel().getRunnables().add(r);

					// also remove taskrunnablecall refs from tasks
					for (final Task t : modelCopy.getSwModel().getTasks()) {
//						for (final GraphEntryBase geb : t.getCallGraph().getGraphEntries()) {
//							if (geb instanceof CallSequence) {
//								final EList<TaskRunnableCall> rtrcs = new BasicEList<TaskRunnableCall>();
//								final CallSequence cs = (CallSequence) geb;
//								for (final CallSequenceItem csi : cs.getCalls()) {
//									if (csi instanceof TaskRunnableCall) {
//										final TaskRunnableCall trc = (TaskRunnableCall) csi;
//										if (reg.getRunnables().contains(trc.getRunnable())) {
//											rtrcs.add(trc);
//										}
//									}
//								}
//								cs.getCalls().removeAll(rtrcs);
//							}
//						}
					}

					// replace refs to cumulated runnables within
					// processPrototypes
					for (final ProcessPrototype pp : modelCopy.getSwModel().getProcessPrototypes()) {
						final Iterator<RunnableCall> trcIt = pp.getRunnableCalls().iterator();
						final EList<RunnableCall> trcsadd = new BasicEList<>();
						while (trcIt.hasNext()) {
							final RunnableCall trc = trcIt.next();
							if (reg.getRunnables().contains(trc.getRunnable())) {
								trcIt.remove();
								if (!trcsadd.contains(r)) {
									final RunnableCall trcnew = af.createRunnableCall();
									trcnew.setRunnable(r);
									trcsadd.add(trcnew);
								}
							}
						}
						pp.getRunnableCalls().addAll(trcsadd);
					}
					new Helper().updatePPsFirstLastActParams(modelCopy.getSwModel());

					// remove runnable pairing runnables (cumulated runnable
					// replaces these temporarily)
					modelCopy.getSwModel().getRunnables().removeAll(reg.getRunnables());
				}
			}
		}
		return modelCopy;
	}

	private void ceckConsistency(final RunnablePairingConstraint rpc) {
		if (rpc.getTarget() instanceof TagGroup) {
			PartLog.getInstance().log("Tag Group Pairing Constraints are not yet considered during the partitioning", null);
			// TODO implement TagGroup consideration
			return;
		}
		final RunnableGroup rg = rpc.getGroup();
		final RunnableEntityGroup reg = (RunnableEntityGroup) rg;

		final Set<Activation> as = new HashSet<Activation>();
		final Set<Tag> ts = new HashSet<Tag>();
		final Set<ASILType> ass = new HashSet<ASILType>();

		for (final Runnable r : reg.getRunnables()) {
			// check activations
			if (!as.contains(r.getFirstActivation())) {
				as.add(r.getFirstActivation());
			}
			// check tags
			if (!ts.contains(r.getTags())) {
				ts.addAll(r.getTags());
			}
			// check asil levels
			if (!ass.contains(r.getAsilLevel())) {
				ass.add(r.getAsilLevel());
			}
		}
		if (as.size() > 1) {
			PartLog.getInstance().log("Inconsistency: RunnablePairingConstraint " + null != rpc.getName() ? rpc.getName()
					: "" + " includes " + as.size() + " different activations", null);
		}
		if (ts.size() > 1) {
			PartLog.getInstance().log("Inconsistency: RunnablePairingConstraint " + null != rpc.getName() ? rpc.getName()
					: "" + " includes " + ts.size() + " different tags", null);
		}
		if (ass.size() > 1) {
			PartLog.getInstance().log("Inconsistency: RunnablePairingConstraint " + null != rpc.getName() ? rpc.getName()
					: "" + " includes " + as.size() + " different ASIL-levels", null);
		}

		// final output
		if (as.size() > 1 || ts.size() > 1 || ass.size() > 1) {
			PartLog.getInstance()
					.log("This inconsistency results in tasks with mixed-up references. To resolve this, please carefully check your ASIL, Tag, and Activation references for the pairing constraint"
							+ null != rpc.getName() ? rpc.getName() : "");
		}
	}
}
