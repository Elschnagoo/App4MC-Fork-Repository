/*******************************************************************************
 * Copyright (c) 2017 FH-Dortmund and others.
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
import org.eclipse.app4mc.amalthea.model.AffinityConstraint;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableOrderType;
import org.eclipse.app4mc.amalthea.model.RunnablePairingConstraint;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.app4mc.multicore.partitioning.handlers.WriteAppletHandler;
import org.eclipse.app4mc.multicore.partitioning.utils.CreateTAInput;
import org.eclipse.app4mc.multicore.partitioning.utils.CycleElimination;
import org.eclipse.app4mc.multicore.partitioning.utils.Helper;
import org.eclipse.app4mc.multicore.partitioning.utils.PartLog;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;

public class PerformPartitioning {
	/**
	 * Partitioning using ESSP algorithm
	 */
	public final static String PART_ESSP = "essp";
	/**
	 * Partitioning using CPP algorithm
	 */
	public final static String PART_CPP = "cpp";

	/**
	 * determines which operation shall be performed: activation analysis, label
	 * analysis, graph or independent graph partitioning and calls the
	 * corresponding classes
	 */
	public void execute(final IFile file, final IProgressMonitor monitor, final IPreferenceStore store) {
		final UniversalHandler uh = UniversalHandler.getInstance();
		PartLog.getInstance().setLogName("PartitioningHandler");
		final OutputPathParser outputParser = new OutputPathParser(IParConstants.PRE_LOC_RADIO,
				IParConstants.PRE_LOC_STRING, store);
		String append = "";
		if (!file.getName().endsWith("_PrePartitioned.amxmi")) {
			append = "_PrePartitioned";
		}

		uh.dropCache();
		uh.readModels(outputParser.parseOutputFileURI(file, append), true);
		if (uh.getSwModel() == null) {
			PartLog.getInstance().log("No SWModel found at " + outputParser.parseOutputFileURI(file, append).toString(),
					null);
			return;
		}

		final AmaltheaFactory af = AmaltheaFactory.eINSTANCE;
		Amalthea amodels = af.createAmalthea();
		assert uh.getSwModel() != null;
		amodels = new Helper().setAllModels(amodels, uh);
		if (amodels.getSwModel().getProcessPrototypes().size() == 0) {
			PartLog.getInstance().log("!!No ProcessPrototypes present. Creating one containing all RunnableCalls.");
			amodels.setSwModel(createPPs(amodels.getSwModel()));
		}

		switch (store.getString(IParConstants.PRE_PARTITIONING_ALG)) {
			case PART_ESSP:
				PartLog.getInstance().logSimple("**Starting earliest start schedule partitioning**");
				final ESSP essp = new ESSP(amodels.getSwModel(), amodels.getConstraintsModel(),
						Integer.parseInt(store.getString(IParConstants.PRE_INT)));
				essp.build(monitor);
				if (essp.swm.getProcessPrototypes().size() < Integer.parseInt(store.getString(IParConstants.PRE_INT))) {
					PartLog.getInstance()
							.log("ESSP could not generate " + Integer.parseInt(store.getString(IParConstants.PRE_INT))
									+ " partitions since the softwaremodel's graph does not feature enough parallel runnables (though possibly sequences). "
									+ essp.swm.getProcessPrototypes().size() + " partitions could be generated.");
				}
				amodels.setConstraintsModel(essp.cm);
				amodels.setSwModel(essp.swm);
				amodels = retainAffntyCnstrnts(file, amodels, monitor);
				PartLog.getInstance().log(new Helper().writePPs(amodels.getSwModel().getProcessPrototypes()));
				PartLog.getInstance().logSimple("**Earliest start schedule partitioning finished**");
				Helper.writeModelFile(file, outputParser.parseOutputFileURI(file, "_ESSP"), amodels);
				break;
			case PART_CPP:
				PartLog.getInstance().logSimple("**Starting critical path partitioning**");
				final CPP cpp = new CPP(amodels.getSwModel(), amodels.getConstraintsModel());
				cpp.bglobalCP = store.getBoolean(IParConstants.PRE_GCP);
				cpp.build(monitor);
				amodels.setConstraintsModel(cpp.cm);
				amodels.setSwModel(cpp.swm);
				amodels = retainAffntyCnstrnts(file, amodels, monitor);
				PartLog.getInstance().log(new Helper().writePPs(amodels.getSwModel().getProcessPrototypes()));
				PartLog.getInstance().logSimple("**Critical path partitioning finished**");
				Helper.writeModelFile(file, outputParser.parseOutputFileURI(file, "_CPP"), amodels);
				break;
			default:
				break;
		}

		if (store.getBoolean(IParConstants.PRE_TA)) {
			PartLog.getInstance().logSimple("**Starting generating a runnable sequencing constraints alternative**");
			final CreateTAInput ctai = new CreateTAInput();
			ctai.setCm(amodels.getConstraintsModel());
			ctai.combineSimilarRSCs();
			amodels.setConstraintsModel(ctai.getCm());
			Helper.writeModelFile(file, outputParser.parseOutputFileURI(file, "_TAInput"), amodels);
			PartLog.getInstance().logSimple("**Generating a runnable sequencing constraints alternative finished**");
		}
		if (store.getBoolean(IParConstants.PRE_VIS)) {
			PartLog.getInstance().logSimple("**Generating Applet**");
			final WriteAppletHandler wa = new WriteAppletHandler();
			wa.write(amodels.getSwModel(), amodels.getConstraintsModel(), file.getLocation().toString());
			PartLog.getInstance().logSimple("**Applet generation finished**");
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

		return;
	}


	/**
	 * retain cumulated runnables from affinity constraints: get original file,
	 * replace CumulatedRunnables with AffinityRunnables from original file
	 * (@param uh, file), add new rscs; @return Amalthea model with new
	 * RunnableSequencingConstraints
	 */
	public Amalthea retainAffntyCnstrnts(final IFile file, final Amalthea amodels, final IProgressMonitor monitor) {
		final UniversalHandler uh = UniversalHandler.getInstance();
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
			amodels.setSwModel(addOrgRunsUpdateRunCalls(amodels.getConstraintsModel().getAffinityConstraints(),
					amodels.getSwModel(), cumuRuns));


			// update runnable sequencing constraints
			amodels.setConstraintsModel(updateRSCs(amodels, cumuRuns));

			// delete RSCs to cumulated Runnables
			final EList<RunnableSequencingConstraint> rrsc = new BasicEList<RunnableSequencingConstraint>();
			for (final RunnableSequencingConstraint rsc : amodels.getConstraintsModel()
					.getRunnableSequencingConstraints()) {
				if (rsc.getRunnableGroups().size() > 0 && rsc.getRunnableGroups().get(0).getRunnables().size() > 0) {
					if (cumuRuns.contains(rsc.getRunnableGroups().get(0).getRunnables().get(0))
							|| cumuRuns.contains(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
						rrsc.add(rsc);
					}
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
	private SWModel addOrgRunsUpdateRunCalls(final EList<AffinityConstraint> ac, final SWModel swm,
			final EList<Runnable> cumuRuns) {
		for (final Runnable cr : cumuRuns) {
			final int crindex = Integer.parseInt(cr.getName().substring(17, cr.getName().length()));
			if (ac.get(crindex) instanceof RunnablePairingConstraint) {
				// add original runnables
				final RunnableEntityGroup reg = (RunnableEntityGroup) ((RunnablePairingConstraint) ac.get(crindex))
						.getGroup();
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
				// update only pairing constraints with no targets
				if (null == ((RunnablePairingConstraint) am.getConstraintsModel().getAffinityConstraints().get(crindex))
						.getTarget()) {
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
											if (!CMcontains(am.getConstraintsModel(), rsc) && null != rsc) {
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
											if (!CMcontains(am.getConstraintsModel(), rsc) && null != rsc) {
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
					if (null == la.getData()) {
						PartLog.getInstance().log("label access with no data found! at Runnable " + r.getName(), null);
					}
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
			if (rsc.getRunnableGroups().size() > 0 && rsc.getRunnableGroups().get(0).getRunnables().size() > 0
					&& orsc.getRunnableGroups().size() > 0
					&& orsc.getRunnableGroups().get(0).getRunnables().size() > 0) {
				if (orsc.getRunnableGroups().get(0).getRunnables().get(0)
						.equals(rsc.getRunnableGroups().get(0).getRunnables().get(0))
						&& orsc.getRunnableGroups().get(1).getRunnables().get(0)
								.equals(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
					return true;
				}
			}
			else if (null != rsc.getName()) {
				PartLog.getInstance().log("RSC empty entries: " + rsc.getName(), null);
			}
		}
		return false;
	}

	/**
	 * @return a RunnableSequencingConstraint, having two groups. First group
	 *         contains @param source, second group contains @param target
	 */
	private RunnableSequencingConstraint createRSC(final Runnable source, final Runnable target, final SWModel swm) {
		if (null == target || null == source) {
			PartLog.getInstance().log("RSC cannot be created for null Runnable");
			return null;
		}
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		final RunnableSequencingConstraint rsc = factory.createRunnableSequencingConstraint();
		rsc.setName(source.getName() + "-->" + target.getName());
		final RunnableEntityGroup prg1 = factory.createRunnableEntityGroup();
		final RunnableEntityGroup prg2 = factory.createRunnableEntityGroup();

		final ProcessPrototype sourcePP = new Helper().getPPfromR(source, swm);
		rsc.getProcessScope().add(sourcePP);
		prg1.getRunnables().add(source);
		prg2.getRunnables().add(target);
		rsc.getRunnableGroups().add(prg1);
		rsc.getRunnableGroups().add(prg2);
		rsc.setOrderType(RunnableOrderType.SUCCESSOR);

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
		if (swm.getRunnables().get(0).getFirstActivation() != null) {
			pp.setActivation(swm.getRunnables().get(0).getFirstActivation());	//TODO: handle multiple activations
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
