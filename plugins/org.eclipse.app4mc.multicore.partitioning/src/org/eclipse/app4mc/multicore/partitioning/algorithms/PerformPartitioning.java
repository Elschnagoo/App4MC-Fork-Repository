/*******************************************************************************
 * Copyright (c) 2016 FH-Dortmund and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     FH-Dortmund - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.algorithms;

import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroup;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableOrderType;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.app4mc.multicore.partitioning.handlers.WriteAppletHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;

public class PerformPartitioning {

	/**
	 * determines which operation shall be performed: activation analysis, label
	 * analysis, graph or independent graph partitioning and calls the
	 * corresponding classes
	 */
	public Object execute(final IFile file, final IProgressMonitor monitor) {
		final UniversalHandler uh = UniversalHandler.getInstance();
		PartLog.getInstance().setLogName("PartitioningHandler");
		PartLog.getInstance().log("Starting Partitioning");
		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		String CurrentPathFile = file.getProject().getFullPath().toString() + "/" + store.getString("loc") + "/";
		if (!file.getName().endsWith("_PrePartitioned.amxmi")) {
			CurrentPathFile += file.getName().substring(0, file.getName().lastIndexOf(".")) + "_PrePartitioned.amxmi";
		}
		else {
			CurrentPathFile += file.getName();
		}
		uh.dropCache();
		uh.readModels(URI.createPlatformResourceURI(CurrentPathFile, true), true);
		if (uh.getSwModel() == null) {
			PartLog.getInstance().log("No SWModel found at " + CurrentPathFile, null);
			return null;
		}

		final AmaltheaFactory af = AmaltheaFactory.eINSTANCE;
		Amalthea amodels = af.createAmalthea();
		assert uh.getSwModel() != null;
		amodels = new Helper().setAllModels(amodels, uh);
		if (amodels.getSwModel().getProcessPrototypes().size() == 0) {
			PartLog.getInstance().log("!!No ProcessPrototypes present. Creating one containing all RunnableCalls.");
			amodels.setSwModel(createPPs(amodels.getSwModel()));
		}

		if (store.getBoolean("boolCPP") == true) {
			PartLog.getInstance().log("--Starting critical path partitioning--");
			final CPP cpp = new CPP(amodels.getSwModel(), amodels.getConstraintsModel());
			cpp.bglobalCP = store.getBoolean("boolGCP");
			cpp.build(monitor);
			amodels.setConstraintsModel(cpp.cm);
			amodels.setSwModel(cpp.swm);
			amodels = retainAffntyCnstrnts(file, uh, amodels, monitor);
			new Helper().writeModelFile(file, "_CPP", amodels);
			PartLog.getInstance().log("--Critical path partitioning finished--");
			PartLog.getInstance().logSimple("CPP finished.");
		}
		if (Integer.parseInt(store.getString("intThreads")) > 1 && store.getBoolean("boolESSP") == true) {
			PartLog.getInstance().log("--Starting earliest start schedule partitioning--");
			final ESSP essp = new ESSP(amodels.getSwModel(), amodels.getConstraintsModel(),
					Integer.parseInt(store.getString("intThreads")));
			essp.build(monitor);
			if (essp.swm.getProcessPrototypes().size() < Integer.parseInt(store.getString("intThreads"))) {
				PartLog.getInstance()
						.log("ESSP could not generate " + Integer.parseInt(store.getString("intThreads"))
								+ " partitions since the softwaremodel's graph does not feature enough parallel runnables. "
								+ essp.swm.getProcessPrototypes().size() + " partitions could be generated.");
			}
			amodels.setConstraintsModel(essp.cm);
			amodels.setSwModel(essp.swm);
			amodels = retainAffntyCnstrnts(file, uh, amodels, monitor);
			new Helper().writeModelFile(file, "_ESSP", amodels);
			PartLog.getInstance().log("--Earliest start schedule partitioning finished--");
			PartLog.getInstance().logSimple("ESSP finished.");
		}
		if (store.getBoolean("boolTA")) {
			PartLog.getInstance().log("--Starting generating a runnable sequencing constraints alternative--");
			final CreateTAInput ctai = new CreateTAInput();
			ctai.setCm(amodels.getConstraintsModel());
			ctai.combineSimilarRSCs();
			amodels.setConstraintsModel(ctai.getCm());
			new Helper().writeModelFile(file, "_TAInput", amodels);
			PartLog.getInstance().log("--Generating a runnable sequencing constraints alternative finished--");
			PartLog.getInstance().logSimple("RSC alternative generation finished.");
		}
		if (store.getBoolean("boolVis")) {
			PartLog.getInstance().setLogName("Applet visualization");
			PartLog.getInstance().log("--Generating Applet--");
			final WriteAppletHandler wa = new WriteAppletHandler();
			wa.write(amodels.getSwModel(), amodels.getConstraintsModel(), file.getLocation().toString());
			PartLog.getInstance().log("--Applet generation finished--");
			PartLog.getInstance().logSimple("Applet generation finished.");
		}


		// print result
		final long tmp = (long) ((float) getMaxPPLength(amodels.getSwModel()) / getSWMInstructions(amodels.getSwModel())
				* 100);
		PartLog.getInstance()
				.logSimple("Sequential runtime of " + getSWMInstructions(amodels.getSwModel()) + " by "
						+ amodels.getSwModel().getRunnables().size() + " Runnables were split into "
						+ amodels.getSwModel().getProcessPrototypes().size() + " ProcessPrototypes with maximal "
						+ getMaxPPLength(amodels.getSwModel()) + " Instructions to reduce overall execution time to "
						+ tmp + "% and by " + (100 - tmp) + "%.");

		return null;
	}


	/**
	 * retain cumulated runnables from affinity constraints: get original file,
	 * replace CumulatedRunnables with AffinityRunnables from original file
	 * (@param uh, file), add new rscs; @return Amalthea model with new
	 * RunnableSequencingConstraints
	 */
	public Amalthea retainAffntyCnstrnts(final IFile file, final UniversalHandler uh, final Amalthea amodels,
			final IProgressMonitor monitor) {
		uh.dropCache();

		if (file.getFullPath().toString().startsWith("/platform:/resource")) {
			uh.readModels(URI.createPlatformResourceURI(file.getFullPath().toString().substring(19), true), true);
		}
		else {
			uh.readModels(URI.createPlatformResourceURI(file.getFullPath().toString(), true), true);
		}


		if (uh.getConstraintsModel() != null && uh.getConstraintsModel().getAffinityConstraints() != null
				&& uh.getConstraintsModel().getAffinityConstraints().size() > 0) {

			// add all original constraints except RunnableSequencingConstraints
			final EList<RunnableSequencingConstraint> rsclo = amodels.getConstraintsModel()
					.getRunnableSequencingConstraints();
			amodels.setConstraintsModel(uh.getConstraintsModel());
			amodels.getConstraintsModel().getRunnableSequencingConstraints().addAll(rsclo);

			// create a list of all cumulatedRunnables
			final EList<Runnable> cumuRuns = new BasicEList<Runnable>();
			for (final Runnable r : amodels.getSwModel().getRunnables()) {
				if (r.getName().contains("CumulatedRunnable")) {
					cumuRuns.add(r);
				}
			}

			// add original runnables and update runnable calls
			amodels.setSwModel(addOrgRunsUpdateRunCalls(uh, amodels.getSwModel(), cumuRuns));

			// update runnable sequencing constraints
			amodels.setConstraintsModel(updateRSCs(amodels, cumuRuns));

			// delete RSCs to cumulated Runnables
			final EList<RunnableSequencingConstraint> rrsc = new BasicEList<RunnableSequencingConstraint>();
			for (final RunnableSequencingConstraint rsc : amodels.getConstraintsModel()
					.getRunnableSequencingConstraints()) {
				if (cumuRuns.contains(rsc.getRunnableGroups().get(0).getRunnables().get(0))
						|| cumuRuns.contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
					rrsc.add(rsc);
				}
			}
			amodels.getConstraintsModel().getRunnableSequencingConstraints().removeAll(rrsc);

			// remove all temporary cumulatedRunnables
			amodels.getSwModel().getRunnables().removeAll(cumuRuns);

			// remove temporary cumulated runnables
			for (final ProcessPrototype pp : amodels.getSwModel().getProcessPrototypes()) {
				if (pp.getAccessPrecedenceSpec().size() > 0) {
					for (final Iterator<AccessPrecedenceSpec> it = pp.getAccessPrecedenceSpec().iterator(); it
							.hasNext();) {
						final AccessPrecedenceSpec aps = it.next();
						if (aps.getOrigin().getName().contains("CumulatedRunnable")
								|| aps.getTarget().getName().contains("CumulatedRunnable")) {
							it.remove();
						}
					}
				}
			}

			// check if there occur new cycles after cumulatedRunable
			// dissolution
			final CycleElimination ce = new CycleElimination(amodels.getSwModel(), amodels.getConstraintsModel());
			final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
			ce.setparams(store);
			while (!ce.run(monitor).isOK()) {
				// waiting for job to complete
			}
			amodels.setConstraintsModel(ce.getCm());
			amodels.setSwModel(ce.getSwm());
		}
		// update first / last / activation ref for ProcessPrototypes
		amodels.setSwModel(new Helper().updatePPsFirstLastActParams(amodels.getSwModel()));
		// check if rscs all reference a processprototype
		amodels.setConstraintsModel(new Helper().updateRSCs(amodels.getConstraintsModel(), amodels.getSwModel()));
		return amodels;
	}

	/**
	 * From each entry in the @param cumulated Runnable list, originally
	 * separated runnables are dissolved, added to the @param swmodel and all
	 * runnable calls from the cummulated Runnables are replaced with the
	 * corresponding mutliple calls of the original Runnables (required for
	 * AffinityConstraints)
	 *
	 */
	private SWModel addOrgRunsUpdateRunCalls(final UniversalHandler uh, final SWModel swm,
			final EList<Runnable> cumuRuns) {
		for (final Runnable cr : cumuRuns) {
			final int crindex = Integer.parseInt(cr.getName().substring(17, cr.getName().length()));
			if (uh.getConstraintsModel().getAffinityConstraints().get(crindex) instanceof RunnablePairingConstraint) {
				// add original runnables
				final RunnableEntityGroup reg = (RunnableEntityGroup) ((RunnablePairingConstraint) uh
						.getConstraintsModel().getAffinityConstraints().get(crindex)).getGroup();
				swm.getRunnables().addAll(reg.getRunnables());

				// Update RunnableCalls
				for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
					final EList<TaskRunnableCall> trcrem = new BasicEList<TaskRunnableCall>();
					final EList<TaskRunnableCall> trcs = new BasicEList<TaskRunnableCall>();
					int index = 0;
					for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
						if (cr.equals(trc.getRunnable())) {
							index = pp.getRunnableCalls().indexOf(trc);
							final AmaltheaFactory af = AmaltheaFactory.eINSTANCE;
							for (final Runnable or : reg.getRunnables()) {
								// create trcs for original runnables
								final TaskRunnableCall ntrc = af.createTaskRunnableCall();
								ntrc.setRunnable(or);
								trcs.add(ntrc);
							}
							trcrem.add(trc);
						}
					}
					pp.getRunnableCalls().addAll(index, trcs);
					// remove cumulated runnable trcs
					pp.getRunnableCalls().removeAll(trcrem);
				}
			}
		}
		return swm;
	}

	/**
	 * Runnable sequencing constraints (contained and @return in the @param cm
	 * constraints model) are updated to the original label accesses (required
	 * for affinityConstraints)
	 *
	 */
	private ConstraintsModel updateRSCs(final Amalthea am, final EList<Runnable> cumuRuns) {
		for (final Runnable cr : cumuRuns) {
			final int crindex = Integer.parseInt(cr.getName().substring(17, cr.getName().length()));
			if (am.getConstraintsModel().getAffinityConstraints().get(crindex) instanceof RunnablePairingConstraint) {
				final RunnableEntityGroup reg = (RunnableEntityGroup) ((RunnablePairingConstraint) am
						.getConstraintsModel().getAffinityConstraints().get(crindex)).getGroup();
				for (final Runnable or : reg.getRunnables()) {
					for (final RunnableItem ri : or.getRunnableItems()) {
						if (ri instanceof LabelAccess) {
							final LabelAccess la = (LabelAccess) ri;
							final Label l = la.getData();
							if (la.getAccess().equals(LabelAccessEnum.READ)) {
								// or is target
								final EList<Runnable> wrs = getAccessingRunnables(l, LabelAccessEnum.WRITE,
										am.getSwModel());
								for (final Runnable rr : wrs) {
									if (!rr.getName().contains("CumulatedRunnable")) {
										final RunnableSequencingConstraint rsc = createRSC(rr, or, am.getSwModel());
										if (!CMcontains(am.getConstraintsModel(), rsc)) {
											am.getConstraintsModel().getRunnableSequencingConstraints().add(rsc);
										}
									}
								}
							}
							else if (la.getAccess().equals(LabelAccessEnum.WRITE)) {
								// or is source
								final EList<Runnable> rrs = getAccessingRunnables(l, LabelAccessEnum.READ,
										am.getSwModel());
								for (final Runnable rr : rrs) {
									if (!rr.getName().contains("CumulatedRunnable")) {
										final RunnableSequencingConstraint rsc = createRSC(or, rr, am.getSwModel());
										if (!CMcontains(am.getConstraintsModel(), rsc)) {
											am.getConstraintsModel().getRunnableSequencingConstraints().add(rsc);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		return am.getConstraintsModel();
	}

	/**
	 * checks all accesses to a given label @param l and returns @return a list
	 * of runnables with the specific (@param lae) accesses from the given
	 * swmodel @param swm
	 *
	 */
	private EList<Runnable> getAccessingRunnables(final Label l, final LabelAccessEnum lae, final SWModel swm) {
		final EList<Runnable> rl = new BasicEList<Runnable>();
		for (final Runnable r : swm.getRunnables()) {
			for (final RunnableItem ri : r.getRunnableItems()) {
				if (ri instanceof LabelAccess) {
					final LabelAccess la = (LabelAccess) ri;
					if (la.getData().equals(l) && la.getAccess() == lae) {
						rl.add(r);
					}
					else if (la.getData().getName().equals(l.getName()) && la.getAccess() == lae) {
						rl.add(r);
					}
				}
			}
		}
		return rl;
	}

	/**
	 * returns boolean whether a @param RunnableSequencingConstrainted is
	 * contained in the @param constraints model or not
	 *
	 */
	private boolean CMcontains(final ConstraintsModel cm, final RunnableSequencingConstraint rsc) {
		for (final RunnableSequencingConstraint orsc : cm.getRunnableSequencingConstraints()) {
			if (orsc.getRunnableGroups().get(0).getRunnables().get(0)
					.equals(rsc.getRunnableGroups().get(0).getRunnables().get(0))
					&& orsc.getRunnableGroups().get(1).getRunnables().get(0)
							.equals(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return a RunnableSequencingConstraint, having two groups. First group
	 *         contains @param source, second group contains @param target
	 */
	private RunnableSequencingConstraint createRSC(final Runnable source, final Runnable target, final SWModel swm) {
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		final RunnableSequencingConstraint rsc = factory.createRunnableSequencingConstraint();
		rsc.setName(source.getName() + "-->" + target.getName());
		final ProcessRunnableGroup prg1 = factory.createProcessRunnableGroup();
		final ProcessRunnableGroup prg2 = factory.createProcessRunnableGroup();

		final ProcessPrototype sourcePP = new Helper().getPPfromR(source, swm);
		final ProcessPrototype targetPP = new Helper().getPPfromR(target, swm);
		if (true == sourcePP.equals(targetPP)) {
			rsc.getProcessScope().add(sourcePP);
			prg1.getRunnables().add(source);
			prg2.getRunnables().add(target);
			rsc.getRunnableGroups().add(prg1);
			rsc.getRunnableGroups().add(prg2);
			rsc.setOrderType(RunnableOrderType.SUCCESSOR);
		}
		else {
			PartLog.getInstance().log("Two different process prototypes of source and target runnable", null);
		}

		return rsc;
	}

	/**
	 * @return max instructions sum of the longest ProcessPrototype
	 */
	private long getMaxPPLength(final SWModel swm) {
		long ret = 0;
		for (final ProcessPrototype pp : swm.getProcessPrototypes()) {
			long temp = 0;
			for (final TaskRunnableCall trc : pp.getRunnableCalls()) {
				temp += new Helper().getInstructions(trc.getRunnable());
			}
			if (temp > ret) {
				ret = temp;
			}
		}
		return ret;
	}

	/**
	 * @return sum of all instructions of the @param swmodel
	 */
	private long getSWMInstructions(final SWModel swm) {
		long ret = 0;
		for (final Runnable r : swm.getRunnables()) {
			ret += new Helper().getInstructions(r);
		}
		return ret;
	}

	/**
	 * @return swmodel containing a temporary ProcessPrototype with
	 *         TaskRunnableCalls for all Runnables within the @param swmodel
	 */
	private SWModel createPPs(final SWModel swm) {
		final AmaltheaFactory af = AmaltheaFactory.eINSTANCE;
		final ProcessPrototype pp = af.createProcessPrototype();
		if (swm.getRunnables().get(0).getActivation() != null) {
			pp.setActivation(swm.getRunnables().get(0).getActivation());
		}
		pp.setName("PPTemp");
		for (final Runnable r : swm.getRunnables()) {
			final TaskRunnableCall trc = af.createTaskRunnableCall();
			trc.setRunnable(r);
			pp.getRunnableCalls().add(trc);
		}
		swm.getProcessPrototypes().add(pp);
		return swm;
	}
}
