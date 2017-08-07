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

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableOrderType;
import org.eclipse.app4mc.amalthea.model.RunnableSequencingConstraint;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class CheckLabels {

	private ConstraintsModel CM;
	private SWModel swm;

	public SWModel getSwm() {
		return this.swm;
	}

	public void setSwm(final SWModel swm) {
		this.swm = swm;
	}

	public void setCMModel(final ConstraintsModel cm) {
		this.CM = cm;
	}

	public ConstraintsModel getCMModel() {
		return this.CM;
	}

	/**
	 * Checks if a RSC already exists in global constraints model. No RSC
	 * instances should have the same groups.
	 *
	 * @param RSC
	 *            RunnableSequencingConstraint that may exit in global RSCL
	 * @return true when RSCL contains RCS
	 */
	private boolean RSCLReveals(final RunnableSequencingConstraint rsc) {
		for (final RunnableSequencingConstraint rsc2 : this.CM.getRunnableSequencingConstraints()) {
			if (rsc2.getRunnableGroups().size() == 2) {
				if (rsc2.getRunnableGroups().get(0).getRunnables().get(0).equals(rsc.getRunnableGroups().get(0).getRunnables().get(0))
						&& rsc2.getRunnableGroups().get(1).getRunnables().get(0).equals(rsc.getRunnableGroups().get(1).getRunnables().get(0))) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * identifies LabelAccesses within a software model, and creates
	 * RunnableSequencingConstraints. E.g.: If runnable A writes a label and
	 * runnable B reads the same label, the corresponding created RSC will have
	 * runnable A as a RunnableGroupEntry in RunnableGroup0 and runnable B as a
	 * RunnableGroupEntry in RunnableGroup1.
	 */
	public IStatus run(final IProgressMonitor monitor) {

		monitor.beginTask("Performing label access analysis...", this.swm.getRunnables().size());
		PartLog.getInstance().setLogName("RSC Generation");
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		if (this.CM == null) {
			this.CM = factory.createConstraintsModel();
		}

		for (final Runnable r1 : this.swm.getRunnables()) {
			monitor.worked(1);

			// compare all label accesses & create a RSC for A write L; B read L
			for (final Runnable r2 : this.swm.getRunnables()) {
				if (r1 != r2 && this.swm.getRunnables().indexOf(r1) < this.swm.getRunnables().indexOf(r2)) {
					for (final RunnableItem ri1 : r1.getRunnableItems()) {
						for (final RunnableItem ri2 : r2.getRunnableItems()) {
							if (ri1 instanceof LabelAccess && ri2 instanceof LabelAccess) {
								final LabelAccess la1 = (LabelAccess) ri1;
								final LabelAccess la2 = (LabelAccess) ri2;
								if (la1.getData() != null && la2.getData() != null) {
									if (la1.getData().getName().equals(la2.getData().getName())) {
										if (((la1.getAccess().equals(LabelAccessEnum.READ) && la2.getAccess().equals(LabelAccessEnum.WRITE))
												|| (la1.getAccess().equals(LabelAccessEnum.WRITE) && la2.getAccess().equals(LabelAccessEnum.READ)))) {
											final RunnableSequencingConstraint RSC = factory.createRunnableSequencingConstraint();
											RSC.setOrderType(RunnableOrderType.SUCCESSOR);
											final RunnableEntityGroup prg1 = factory.createRunnableEntityGroup();
											final RunnableEntityGroup prg2 = factory.createRunnableEntityGroup();
											prg1.getRunnables().add(r1);
											prg2.getRunnables().add(r2);
											if (la1.getAccess().equals(LabelAccessEnum.WRITE) && la2.getAccess().equals(LabelAccessEnum.READ)) {
												RSC.getRunnableGroups().add(prg1);
												RSC.getRunnableGroups().add(prg2);
												RSC.setName(r1.getName() + "-->" + r2.getName());
											}
											else if (la1.getAccess().equals(LabelAccessEnum.READ) && la2.getAccess().equals(LabelAccessEnum.WRITE)) {
												RSC.getRunnableGroups().add(prg2);
												RSC.getRunnableGroups().add(prg1);
												RSC.setName(r2.getName() + "-->" + r1.getName());
											}
											if (!RSCLReveals(RSC)) {
												this.CM.getRunnableSequencingConstraints().add(RSC);
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
		PartLog.getInstance()
				.log("Label Access Analysis finished and created " + this.CM.getRunnableSequencingConstraints().size() + " RunnableSequencingConstraints.");
		return Status.OK_STATUS;
	}

}
