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

package org.eclipse.app4mc.multicore.partitioning.algorithms;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.utils.AsilToPP;
import org.eclipse.app4mc.multicore.partitioning.utils.CheckActivations;
import org.eclipse.app4mc.multicore.partitioning.utils.CheckLabels;
import org.eclipse.app4mc.multicore.partitioning.utils.CycleElimination;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.MergeRunnablePairings;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.partitioning.utils.RemoveGraphEdges;
import org.eclipse.app4mc.multicore.partitioning.utils.RunnableCorePairingToPP;
import org.eclipse.app4mc.multicore.partitioning.utils.TagToPP;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.preference.IPreferenceStore;

public class PrePartitioning {

	private final boolean enableLog = true;
	private boolean activationGroups = false;
	private boolean ggp = false;
	private boolean efficientEdgeInCycle = false;
	private boolean minimalEdgeDis = false;

	private boolean tagGroups = true;
	private boolean rcpGroups = false;
	private boolean asilGroups = false;
	private boolean rpGroups = false;

	public PrePartitioning(final IPreferenceStore store) {
		setActivationGroups(store.getBoolean(IParConstants.PRE_ACTIVATION));
		setEfficientEdgeInCycle(store.getBoolean(IParConstants.PRE_EFF_EDGE));
		setGgp(store.getBoolean(IParConstants.PRE_GGP));
		setMinimalEdgeDis(store.getBoolean(IParConstants.PRE_MIN_EDGES));
		setTagGroups(store.getBoolean(IParConstants.PRE_TAGS));
		setRcpGroups(store.getBoolean(IParConstants.PRE_RCPC));
		setAsilGroups(store.getBoolean(IParConstants.PRE_ASIL));
		setRpGroups(store.getBoolean(IParConstants.PRE_RPC));
	}

	public PrePartitioning(final boolean ag, final boolean ggp, final boolean effEdges, final boolean minimalEdges) {
		setActivationGroups(ag);
		setEfficientEdgeInCycle(effEdges);
		setGgp(ggp);
		setMinimalEdgeDis(minimalEdges);
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
		PartLog.getInstance().logSimple("**Starting PrePartitioning**");
		if (modelCopy.getSwModel() == null) {
			PartLog.getInstance().log("No SW Model found. Stopping Prepartitioning", null);
			return null;
		}

		// grouping runnables into ProcessPrototypes via activation references
		if (this.activationGroups) {
			PartLog.getInstance().setLogName("Activation Analysis");
			PartLog.getInstance().log("Starting Activations Analysis");
			assert null != modelCopy.getSwModel() && null != modelCopy.getStimuliModel();

			final CheckActivations ca = new CheckActivations();
			if (modelCopy.getStimuliModel() != null) {
				ca.createPPs(modelCopy.getSwModel(), modelCopy.getStimuliModel(), monitor);
			}
			else if (modelCopy.getStimuliModel() == null && modelCopy.getSwModel().getActivations() != null) {
				ca.createPPs(modelCopy.getSwModel(), monitor);
			}
			else {
				PartLog.getInstance().log("Neither stimulation model nor activation within swmodel found. No activation analaysis possible", null);
			}
			assert null != ca.getSwmo();
			if (null == ca.getSwmo() || ca.getSwmo().getRunnables().size() < 1) {
				PartLog.getInstance().log("No Runnables at Activation Analysis.", null);
			}
			else {
				modelCopy.setSwModel(ca.getSwmo());
				modelCopy.setStimuliModel(ca.getStimu());
				PartLog.getInstance().log("Activation Analysis finished. Created ProcessPrototypes: " + ca.getSwmo().getProcessPrototypes().size());
			}
		}

		// grouping runnables into ProcessPrototypes via ASIL references
		if (this.asilGroups) {
			boolean found = false;
			for (final Runnable r : modelCopy.getSwModel().getRunnables()) {
				if (null != r.getAsilLevel()) {
					found = true;
					break;
				}
			}
			if (found) {
				final AsilToPP ac = new AsilToPP(modelCopy.getSwModel());
				ac.createPPsFromASILsSplit();
				PartLog.getInstance().log("ASIL grouping:\n" + new Helper().writePPs(modelCopy.getSwModel().getProcessPrototypes()));
			}
			else {
				PartLog.getInstance().log("No Runnable references an ASIL level. ASIL partitioning stopped.");
			}

		}

		// grouping runnables into ProcessPrototypes via tag references
		if (this.tagGroups) {
			if (modelCopy.getCommonElements().getTags().size() > 0) {
				final TagToPP tpp = new TagToPP(modelCopy.getSwModel(), modelCopy.getCommonElements());
				tpp.createPPsFromTagsSplit();
				PartLog.getInstance().log("Tag grouping:\n" + new Helper().writePPs(modelCopy.getSwModel().getProcessPrototypes()));
			}
			else {
				PartLog.getInstance().log("No Tags found, stopping Runnable Tag partitioning.");
			}
		}

		// grouping runnables into ProcessPrototypes via RunnableCorePairing
		// constraints
		if (this.rcpGroups) {
			if (modelCopy.getConstraintsModel().getAffinityConstraints().size() > 0) {
				final RunnableCorePairingToPP rcp = new RunnableCorePairingToPP(modelCopy.getSwModel(), modelCopy.getConstraintsModel());
				rcp.getPPsFromCorePairingsSplit();
				PartLog.getInstance().log("RCP grouping:\n" + new Helper().writePPs(modelCopy.getSwModel().getProcessPrototypes()));
			}
			else {
				PartLog.getInstance().log("No Affinity Constraints found, stopping Runnable Core Pairing partitioning.");
			}
		}

		// merge Runnable pairings (affinity constraints)
		if (this.rpGroups) {
			if (modelCopy.getConstraintsModel().getAffinityConstraints().size() > 0) {
				modelCopy = new MergeRunnablePairings().merge(modelCopy);
				PartLog.getInstance().log("RP grouping:\n" + new Helper().writePPs(modelCopy.getSwModel().getProcessPrototypes()));
			}
			else {
				PartLog.getInstance().log("No Affinity Constraints found, stopping Runnable Pairing partitioning.");
			}
		}

		// generating constraints model representing a graph
		if (modelCopy.getConstraintsModel() == null || modelCopy.getConstraintsModel().getRunnableSequencingConstraints().size() == 0) {
			final CheckLabels cl = new CheckLabels();
			cl.setSwm(modelCopy.getSwModel());

			if (modelCopy.getConstraintsModel() != null) {
				// modelCopy.getConstraintsModel().getAffinityConstraints().clear();
				cl.setCMModel(modelCopy.getConstraintsModel());
			}
			cl.run(monitor);
			if (cl.getCMModel() == null || cl.getCMModel().getRunnableSequencingConstraints().size() < 1) {
				PartLog.getInstance().log("No Constraintsmodel / Runnable Sequencing Constraints created! Stopping Prepartitioning.", null);
				return null;
			}
			if (null == modelCopy.getConstraintsModel()) {
				modelCopy.setConstraintsModel(cl.getCMModel());
			}
			else if (0 == modelCopy.getConstraintsModel().getRunnableSequencingConstraints().size()) {
				modelCopy.getConstraintsModel().getRunnableSequencingConstraints().addAll(cl.getCMModel().getRunnableSequencingConstraints());
			}
			PartLog.getInstance().log("Graph creation (constraint model) finished.");
		}
		else {
			PartLog.getInstance().log("ConstraintsModel already existing.");
		}


		if (aPSarepresent(modelCopy.getSwModel().getProcessPrototypes())) {
			final RemoveGraphEdges rge = new RemoveGraphEdges();
			rge.removeAPSRSCs(modelCopy.getConstraintsModel().getRunnableSequencingConstraints(), modelCopy.getSwModel());
			modelCopy.getConstraintsModel().getRunnableSequencingConstraints().clear();
			modelCopy.getConstraintsModel().getRunnableSequencingConstraints().addAll(rge.getRSCs());
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
				PartLog.getInstance().log("GGP did not result in swmodel / constraints model. Stopping Prepartitioning.", null);
				return null;
			}
			modelCopy.setSwModel(ggp.getSwm());
			modelCopy.setConstraintsModel(ggp.getCm());
			PartLog.getInstance().log("GGP finished. Created ProcessPrototypes: " + ggp.getSwm().getProcessPrototypes().size());
		}

		if (new Helper().activationsAreHarmonic(modelCopy.getSwModel().getActivations())) {
			PartLog.getInstance().log(
					"Activations in this model are harmonic! This allows a more sophisticated essp algorithm, that splits partitions with regard to their activation parameter!");
		}

		// print prepartitioning result
		new Helper().writePPs(modelCopy.getSwModel().getProcessPrototypes());
		PartLog.getInstance().logSimple("**PrePartitioning finished**");

		return modelCopy;
	}

	/**
	 * Checks if AccessPrecedences exist
	 *
	 * @param processPrototypes
	 *            required since PPs may contain AccessPrecedences
	 * @return true if AccessPrecedences exist within PPs
	 */
	private boolean aPSarepresent(final EList<ProcessPrototype> processPrototypes) {
		for (final ProcessPrototype pp : processPrototypes) {
			if (pp.getAccessPrecedenceSpec().size() > 0) {
				return true;
			}
		}
		return false;
	}


	private boolean isEnableLog() {
		return this.enableLog;
	}


	public void setActivationGroups(final boolean ActivationGroups) {
		this.activationGroups = ActivationGroups;
	}

	public void setGgp(final boolean ggp) {
		this.ggp = ggp;
	}

	public void setTagGroups(final boolean tagGroups) {
		this.tagGroups = tagGroups;
	}

	public void setRcpGroups(final boolean rcpGroups) {
		this.rcpGroups = rcpGroups;
	}

	public void setAsilGroups(final boolean asilGroups) {
		this.asilGroups = asilGroups;
	}

	public void setRpGroups(final boolean rpGroups) {
		this.rpGroups = rpGroups;
	}

	public void setMinimalEdgeDis(final boolean minimalEdgeDis) {
		this.minimalEdgeDis = minimalEdgeDis;
	}

	public void setEfficientEdgeInCycle(final boolean effCycleElim) {
		this.efficientEdgeInCycle = effCycleElim;
	}
}
