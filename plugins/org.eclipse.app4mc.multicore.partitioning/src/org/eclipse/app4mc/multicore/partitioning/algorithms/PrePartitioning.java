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

import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableGroup;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.IPreferenceStore;

public class PrePartitioning {

	private final boolean enableLog = true;
	private boolean activationGroups = false;
	private boolean ggp = false;
	private boolean efficientEdgeInCycle = false;
	private boolean minimalEdgeDis = false;

	public PrePartitioning(final IPreferenceStore store) {
		setActivationGroups(store.getBoolean("boolActivation"));
		setEfficientEdgeInCycle(store.getBoolean("boolEffEdge"));
		setGgp(store.getBoolean("boolGGP"));
		setMinimalEdgeDis(store.getBoolean("boolMinEdges"));
	}

	public PrePartitioning(final boolean ag, final boolean ggp, final boolean effEdges, final boolean minimalEdges) {
		setActivationGroups(ag);
		setEfficientEdgeInCycle(effEdges);
		setGgp(ggp);
		setMinimalEdgeDis(minimalEdges);
	}

	public boolean isEfficientEdgeInCycle() {
		return this.efficientEdgeInCycle;
	}

	public boolean isMinimalEdgeDis() {
		return this.minimalEdgeDis;
	}

	public void setMinimalEdgeDis(final boolean minimalEdgeDis) {
		this.minimalEdgeDis = minimalEdgeDis;
	}

	public void setEfficientEdgeInCycle(final boolean effCycleElim) {
		this.efficientEdgeInCycle = effCycleElim;
	}


	/**
	 * PrePartitioning performs -affinityConstraint Runnable cumulation-,
	 * -activation grouping-, -global graph grouping- and -cycle elimination-
	 * based on the class' parameters; the prepartitioned model will be saved
	 * along a separate file without affinitycontraints (these are replaced by
	 * cumulated runnables, but later on resolved into the original runnables
	 * after partitioning)
	 *
	 * @param modelCopy
	 * @param monitor
	 */
	public Amalthea performPrePartitioning(Amalthea modelCopy, final IProgressMonitor monitor) {
		if (isEnableLog()) {
			PartLog.getInstance().setLogName("PrePartitioning");
		}
		if (modelCopy.getSwModel() == null) {
			PartLog.getInstance().log("No SW Model found. Stopping Prepartitioning", null);
			return null;
		}

		modelCopy = mergeRunnablesFromAffntyCnstrnts(modelCopy);

		// grouping runnables into ProcessPrototypes via activation references
		if (this.activationGroups) {
			PartLog.getInstance().setLogName("Activation Analysis");
			PartLog.getInstance().log("Starting Activations Analysis");
			assert null != modelCopy.getSwModel() && null != modelCopy.getStimuliModel();

			// creating activations in swmodel derived from stimulation model
			if (modelCopy.getStimuliModel() != null && modelCopy.getSwModel().getActivations() == null) {
				for (final Stimulus s : modelCopy.getStimuliModel().getStimuli()) {
					final AmaltheaFactory swf = AmaltheaFactory.eINSTANCE;
					final PeriodicActivation pa = swf.createPeriodicActivation();
					pa.setName(s.getName());
					modelCopy.getSwModel().getActivations().add(pa);
				}
			}
			final CheckActivations ca = new CheckActivations();
			if (modelCopy.getStimuliModel() != null) {
				ca.createPPs(modelCopy.getSwModel(), modelCopy.getStimuliModel(), monitor);
			}
			else if (modelCopy.getStimuliModel() == null && modelCopy.getSwModel().getActivations() != null) {
				ca.createPPs(modelCopy.getSwModel(), monitor);
			}
			else {
				PartLog.getInstance().log(
						"Neither stimulation model nor activation within swmodel found. No activation analaysis possible",
						null);
			}
			assert null != ca.getSwmo();
			if (null == ca.getSwmo() || ca.getSwmo().getRunnables().size() < 1) {
				PartLog.getInstance().log("No Runnables at Activation Analysis.", null);
			}
			else {
				modelCopy.setSwModel(ca.getSwmo());
				modelCopy.setStimuliModel(ca.getStimu());
				PartLog.getInstance().log("Activation Analysis finished. Created ProcessPrototypes: "
						+ ca.getSwmo().getProcessPrototypes().size());
			}
		}

		// generating constraints model representing a graph
		if (modelCopy.getConstraintsModel() == null
				|| modelCopy.getConstraintsModel().getRunnableSequencingConstraints().size() == 0) {
			final CheckLabels cl = new CheckLabels();
			cl.setSwm(modelCopy.getSwModel());

			// results in unresolved references
			if (modelCopy.getConstraintsModel() != null) {
				modelCopy.getConstraintsModel().getAffinityConstraints().clear();
				cl.setCMModel(modelCopy.getConstraintsModel());
			}
			cl.run(monitor);
			if (cl.getCMModel() == null || cl.getCMModel().getRunnableSequencingConstraints().size() < 1) {
				PartLog.getInstance().log(
						"No Constraintsmodel / Runnable Sequencing Constraints created! Stopping Prepartitioning.",
						null);
				return null;
			}
			modelCopy.setConstraintsModel(cl.getCMModel());
			PartLog.getInstance().log("Graph creation (constraint model) finished.");
		}
		else {
			PartLog.getInstance().log("ConstraintsModel already existing.");
		}

		assert null != modelCopy.getSwModel();
		assert null != modelCopy.getConstraintsModel().getRunnableSequencingConstraints();

		// perform cycle elimination / make graph acyclic
		final CycleElimination ce = new CycleElimination(modelCopy.getSwModel(), modelCopy.getConstraintsModel());
		ce.setparams(this.efficientEdgeInCycle, this.minimalEdgeDis);
		while (!ce.run(monitor).isOK()) {
			// wait for job to complete
		}
		assert null != ce.getSwm() && null != ce.getCm();
		if (ce.getSwm() == null) {
			PartLog.getInstance().log("No swmodel available after CycleElimination. Stopping Prepartitioning.", null);
			return null;
		}
		modelCopy.setSwModel(ce.getSwm());
		modelCopy.setConstraintsModel(ce.getCm());
		PartLog.getInstance().log("Cycle elimination finished.");

		// group independent graphs into separate ProcessPrototypes
		if (this.ggp) {
			PartLog.getInstance().setLogName("GG Partitioning");
			PartLog.getInstance().log("Starting to generate ProcessPrototypes for each independent graph (GGP).");
			final GGP ggp = new GGP(modelCopy.getSwModel(), modelCopy.getConstraintsModel());
			ggp.build();
			assert null != ggp.getCm() && null != ggp.getSwm();
			if (ggp.getCm() == null || ggp.getCm() == null) {
				PartLog.getInstance()
						.log("GGP did not result in swmodel / constraints model. Stopping Prepartitioning.", null);
				return null;
			}
			modelCopy.setSwModel(ggp.getSwm());
			modelCopy.setConstraintsModel(ggp.getCm());
			PartLog.getInstance()
					.log("GGP finished. Created ProcessPrototypes: " + ggp.getSwm().getProcessPrototypes().size());
		}

		// print prepartitioning result
		for (final ProcessPrototype pp : modelCopy.getSwModel().getProcessPrototypes()) {
			final StringBuffer sb = new StringBuffer();
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				sb.append(trc.getRunnable().getName() + ", ");
			}
			PartLog.getInstance().log(pp.getName() + ": " + sb.toString());
		}
		PartLog.getInstance().logSimple("PrePartitioning finished.");

		return modelCopy;
	}

	/**
	 * combining runnables via affinity constraints @param, @return
	 * AmaltheaModel
	 */
	private Amalthea mergeRunnablesFromAffntyCnstrnts(final Amalthea modelCopy) {
		if (modelCopy.getConstraintsModel() != null && modelCopy.getConstraintsModel().getAffinityConstraints() != null
				&& modelCopy.getConstraintsModel().getAffinityConstraints().size() > 0) {
			PartLog.getInstance().log("Found AffinityConstraints, Creating CumulatedRunnables");
			final AmaltheaFactory af = AmaltheaFactory.eINSTANCE;
			final EList<AffinityConstraint> acs = modelCopy.getConstraintsModel().getAffinityConstraints();
			for (final AffinityConstraint ac : acs) {
				if (ac instanceof RunnablePairingConstraint) {
					final RunnablePairingConstraint rpc = (RunnablePairingConstraint) ac;
					final org.eclipse.app4mc.amalthea.model.Runnable r = af.createRunnable();
					r.setName(
							"CumulatedRunnable" + modelCopy.getConstraintsModel().getAffinityConstraints().indexOf(ac));
					final RunnableGroup rg = rpc.getRunnables();
					final RunnableEntityGroup reg = (RunnableEntityGroup) rg;
					long instrCum = 0;
					for (final Runnable run : reg.getRunnables()) {
						instrCum += new Helper().getInstructions(run);
						// do not add instruction constants / deviations;
						// cumulation is added later
						final EList<RunnableItem> ril = new BasicEList<RunnableItem>();
						for (final RunnableItem ri : run.getRunnableItems()) {
							if (!(ri instanceof InstructionsConstant || ri instanceof InstructionsDeviation)) {
								ril.add(ri);
							}
						}
						r.getRunnableItems().addAll(ril);
						r.setActivation(run.getActivation());
					}
					final InstructionsConstant ic = af.createInstructionsConstant();
					ic.setValue(instrCum);
					r.getRunnableItems().add(ic);
					modelCopy.getSwModel().getRunnables().add(r);

					// also remove taskrunnablecall refs from tasks
					for (final Task t : modelCopy.getSwModel().getTasks()) {
						for (final GraphEntryBase geb : t.getCallGraph().getGraphEntries()) {
							if (geb instanceof CallSequence) {
								final EList<TaskRunnableCall> rtrcs = new BasicEList<TaskRunnableCall>();
								final CallSequence cs = (CallSequence) geb;
								for (final CallSequenceItem csi : cs.getCalls()) {
									if (csi instanceof TaskRunnableCall) {
										final TaskRunnableCall trc = (TaskRunnableCall) csi;
										if (reg.getRunnables().contains(trc.getRunnable())) {
											rtrcs.add(trc);
										}
									}
								}
								cs.getCalls().removeAll(rtrcs);
							}
						}
					}
					// remove runnable pairing runnables (cumulated runnable
					// replaces these temporarily)
					modelCopy.getSwModel().getRunnables().removeAll(reg.getRunnables());
				}
			}
		}
		return modelCopy;
	}


	private boolean isEnableLog() {
		return this.enableLog;
	}

	public boolean getActivationGroups() {
		return this.activationGroups;
	}

	public void setActivationGroups(final boolean ActivationGroups) {
		this.activationGroups = ActivationGroups;
	}

	public boolean isGgp() {
		return this.ggp;
	}

	public void setGgp(final boolean ggp) {
		this.ggp = ggp;
	}
}
