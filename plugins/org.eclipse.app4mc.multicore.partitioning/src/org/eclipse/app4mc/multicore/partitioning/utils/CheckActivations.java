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

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * This class creates ProcessPrototypes and including RunnableCalls
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
			for (final CallGraphItem geb : t.getCallGraph().getItems()) {
				if (geb instanceof Group) {
					Activation ref = null;
					for (final Activation a : swm.getActivations()) {
						if (a.getName().equals(t.getStimuli().get(0).getName())) {
							ref = a;
						}
					}
					assert null != ref;
					for (final CallGraphItem csi : ((Group) geb).getItems()) {
						if (csi instanceof RunnableCall) {
							((RunnableCall) csi).getRunnable().getActivations().clear();
							((RunnableCall) csi).getRunnable().getActivations().add(ref);
							// TODO: handle multiple activations
						}
					}
				}
			}
		}
		createPPs(swm, monitor);
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
		if (null != monitor) {
			monitor.beginTask("Acitvation Grouping", swm.getActivations().size());
		}
		PartLog.getInstance().setLogName("Activation Analysis");
		if (swm.getActivations().size() != 0) {
			AmaltheaPackage.eINSTANCE.eClass();
			final AmaltheaFactory instance = AmaltheaFactory.eINSTANCE;
			PartLog.getInstance().log("There are " + swm.getActivations().size() + " activations.");
			for (int act = 0; act < swm.getActivations().size(); act++) {
				if (null != monitor) {
					monitor.worked(1);
				}
				final ProcessPrototype pp = instance.createProcessPrototype();
				pp.setName(swm.getActivations().get(act).getName());
				pp.setActivation(swm.getActivations().get(act));
				// for (int r = 0; r < swm.getRunnables().size(); r++) {
				for (final Runnable r : swm.getRunnables()) {
					assert null != r.getFirstActivation();
					// TODO: handle multiple activations
					if (null != r.getFirstActivation()) {
						if (r.getFirstActivation().equals(swm.getActivations().get(act))) {
							final RunnableCall trc = instance.createRunnableCall();
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
					PartLog.getInstance()
							.log("There is an activation that is not referenced by any runnable (will be ignored) "
									+ pp.getActivation().getName(), null);
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
