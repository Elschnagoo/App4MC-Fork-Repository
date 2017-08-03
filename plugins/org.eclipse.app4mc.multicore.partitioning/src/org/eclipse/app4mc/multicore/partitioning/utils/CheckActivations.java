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
package org.eclipse.app4mc.multicore.partitioning.utils;

import java.util.ArrayList;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

/**
 * This class creates ProcessPrototypes and including taskRunnableCalls
 * according to Activations either referenced by tasks (Stimuli model - reverse
 * engineered) or within a SW model
 */
public class CheckActivations {

	private SWModel swmo;
	private StimuliModel stimu;

	/**
	 * The createPP method including the stimuli model as a parameter creates
	 * ProcessPrototypes and Activations for each stimuli entry in the stimuli
	 * model, and assigns runnables correspondingly to the given activations
	 *
	 * @param swm
	 *            The SoftwareModel containing tasks, that reference activations
	 *            from the stimuli model
	 * @param Stim
	 *            The StimuliModel containing the activationed referenced by the
	 *            tasks in the SoftwareModel
	 */
	public void createPPs(final SWModel swm, final StimuliModel Stim, final IProgressMonitor monitor) {
		this.stimu = Stim;
		checkHarmonicActivations(swm.getActivations());
		// if there is a Stimuli model, there also must be tasks, that reference
		// the activations; correspondingly, activations must be created and
		// referenced by runnables
		PartLog.getInstance().setLogName("Activation Analysis");
		for (final Stimulus stim : Stim.getStimuli()) {
			final PeriodicActivation act = AmaltheaFactory.eINSTANCE.createPeriodicActivation();
			act.setName(stim.getName());
			if (stim instanceof PeriodicStimulus) {
				final PeriodicStimulus per = (PeriodicStimulus) stim;
				if (null != per.getRecurrence()) {
					final Time t = AmaltheaFactory.eINSTANCE.createTime();
					t.setUnit(per.getRecurrence().getUnit());
					t.setValue(per.getRecurrence().getValue());
					act.setMax(t);
					final Time t2 = AmaltheaFactory.eINSTANCE.createTime();
					t2.setUnit(per.getRecurrence().getUnit());
					t2.setValue(per.getRecurrence().getValue());
					act.setMin(t2);
				}
				if (null != per.getOffset()) {
					final Time t3 = AmaltheaFactory.eINSTANCE.createTime();
					t3.setUnit(per.getOffset().getUnit());
					t3.setValue(per.getOffset().getValue());
					act.setOffset(t3);
				}

			}
			swm.getActivations().add(act);
		}
		for (final Task t : swm.getTasks()) {
			for (final GraphEntryBase geb : t.getCallGraph().getGraphEntries()) {
				if (geb instanceof CallSequence) {
					Activation ref = null;
					for (final Activation a : swm.getActivations()) {
						if (a.getName().equals(t.getStimuli().get(0).getName())) {
							ref = a;
						}
					}
					assert null != ref;
					for (final CallSequenceItem csi : ((CallSequence) geb).getCalls()) {
						if (csi instanceof TaskRunnableCall) {
							((TaskRunnableCall) csi).getRunnable().getActivations().add(ref);
							// TODO: handle multiple activations
						}
					}
				}
			}
		}
		createPPs(swm, monitor);
	}

	/**
	 * checks whether all periodic activations are harmonic
	 *
	 * @return true if periodic activations are harmonic
	 */
	public boolean checkHarmonicActivations(final EList<Activation> acts) {
		final ArrayList<Long> pacts = new ArrayList<>();
		for (final Activation act : acts) {
			if (act instanceof PeriodicActivation) {
				final PeriodicActivation pa = (PeriodicActivation) act;
				pacts.add((pa.getMin().getValue().longValue() + pa.getMax().getValue().longValue()) / 2);
			}
			else {
				PartLog.getInstance().log(act.getName() + " is not a periodic activation and is ignored for schedulability analysis.");
			}
		}
		// Collections.sort(pacts, Collections.reverseOrder());
		for (int i = 0; i < pacts.size(); i++) {
			final Long currentAct = pacts.get(i);
			for (int j = i; j < pacts.size(); j++) {
				if (currentAct % pacts.get(j) > 0) {
					return false;
				}
			}
		}
		return true;
	}


	/**
	 * The createPP method without any stimuli parameter creates
	 * ProcessPrototypes for each activation referenced by runnables within the
	 * softweare model
	 *
	 * @param swm
	 *            The SoftwareModel containing runnables, that reference
	 *            activations within the software model
	 * @throws Exception
	 */
	public void createPPs(final SWModel swm, final IProgressMonitor monitor) {
		monitor.beginTask("Acitvation Grouping", swm.getActivations().size());
		PartLog.getInstance().setLogName("Activation Analysis");
		if (swm.getActivations().size() != 0) {
			AmaltheaPackage.eINSTANCE.eClass();
			final AmaltheaFactory instance = AmaltheaFactory.eINSTANCE;
			PartLog.getInstance().log("There are " + swm.getActivations().size() + " activations.");
			for (int act = 0; act < swm.getActivations().size(); act++) {
				monitor.worked(1);
				final ProcessPrototype pp = instance.createProcessPrototype();
				pp.setName(swm.getActivations().get(act).getName());
				pp.setActivation(swm.getActivations().get(act));
				// for (int r = 0; r < swm.getRunnables().size(); r++) {
				for (final Runnable r : swm.getRunnables()) {
					assert null != r.getFirstActivation();
					// TODO: handle multiple activations
					if (null != r.getFirstActivation()) {
						if (r.getFirstActivation().equals(swm.getActivations().get(act))) {
							final TaskRunnableCall trc = instance.createTaskRunnableCall();
							trc.setRunnable(r);
							pp.getRunnableCalls().add(trc);
						}
					}
					else {
						PartLog.getInstance().log("No activation reference found at runnable " + r.getName(), null);
						return;
					}
				}
				if (pp.getRunnableCalls().size() == 0) {
					PartLog.getInstance().log("There is an activation that is not referenced by any runnable (will be ignored) " + pp.getActivation().getName(),
							null);
				}
				else {
					swm.getProcessPrototypes().add(pp);
				}
			}
			this.swmo = swm;
		}
		else {
			PartLog.getInstance().log("No activation found within software model!", null);
		}
	}

	public SWModel getSwmo() {
		return this.swmo;
	}

	public void setSwmo(final SWModel swmo) {
		this.swmo = swmo;
	}

	public StimuliModel getStimu() {
		return this.stimu;
	}

	public void setStimu(final StimuliModel stimu) {
		this.stimu = stimu;
	}
}
