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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEntityGroup;
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
	 * identifies LabelAccesses within a software model, and creates
	 * RunnableSequencingConstraints. E.g.: If runnable A writes a label and
	 * runnable B reads the same label, the corresponding created RSC will have
	 * runnable A as a RunnableGroupEntry in RunnableGroup0 and runnable B as a
	 * RunnableGroupEntry in RunnableGroup1.
	 */
	public IStatus run(final IProgressMonitor monitor) {
		if (null != monitor) {
			monitor.beginTask("Performing label access analysis...", this.swm.getRunnables().size());
		}
		PartLog.getInstance().setLogName("RSC Generation");
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		if (this.CM == null) {
			this.CM = factory.createConstraintsModel();
		}

		final HashMap<Runnable, List<Runnable>> deps = new HashMap<>();
		this.swm.getLabels().stream().forEach(l -> {
			final Set<LabelAccess> lars = l.getLabelAccesses().stream()
					.filter(la -> la.getAccess().equals(LabelAccessEnum.READ)).collect(Collectors.toSet());
			final Set<LabelAccess> laws = l.getLabelAccesses().stream()
					.filter(lac -> lac.getAccess().equals(LabelAccessEnum.WRITE)).collect(Collectors.toSet());
			if (lars.size() > 0 && laws.size() > 0) {
				laws.stream().forEach(law -> {
					final Runnable key = (Runnable) law.eContainer();
					lars.stream().forEach(lar -> {
						final Runnable value = (Runnable) lar.eContainer();
						if (null != key && null != value && !key.equals(value)) {
							if (!deps.containsKey(key)) {
								final List<Runnable> tmp = new ArrayList<Runnable>();
								tmp.add(value);
								deps.put(key, tmp);
							}
							else if (!deps.get(key).contains(value)) {
								deps.get(key).add(value);
							}
						}
					});
				});
			}
		});

		deps.keySet().stream().forEach(key -> {
			deps.get(key).stream().forEach(value -> {
				final RunnableSequencingConstraint RSC = factory.createRunnableSequencingConstraint();
				RSC.setOrderType(RunnableOrderType.SUCCESSOR);
				final RunnableEntityGroup prg1 = factory.createRunnableEntityGroup();
				final RunnableEntityGroup prg2 = factory.createRunnableEntityGroup();
				prg1.getRunnables().add(key);
				prg2.getRunnables().add(value);
				RSC.getRunnableGroups().add(prg1);
				RSC.getRunnableGroups().add(prg2);
				RSC.setName(key.getName() + "-->" + value.getName());
				// if (!RSCLReveals(RSC) &&
				// !value.getName().equals(key.getName())) {
				this.CM.getRunnableSequencingConstraints().add(RSC);
				// }
			});
		});

		PartLog.getInstance().log("Label Access Analysis finished and created "
				+ this.CM.getRunnableSequencingConstraints().size() + " RunnableSequencingConstraints.");
		return Status.OK_STATUS;
	}

}
