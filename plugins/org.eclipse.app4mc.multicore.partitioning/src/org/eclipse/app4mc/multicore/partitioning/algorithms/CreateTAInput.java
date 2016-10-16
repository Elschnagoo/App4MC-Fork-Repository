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

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.ProcessRunnableGroupEntry;

public class CreateTAInput {
	ConstraintsModel cm;

	/**
	 * This method creates a more dynamic approach of the runnable sequencing constraints (TA input)
	 */
	public void combineSimilarRSCs() {
		if (this.cm == null || this.cm.getRunnableSequencingConstraints().size() == 0) {
			PartLog.getInstance()
					.log("Selected files must contain a constraints model with runnableSequencingConstraints", null);
			return;
		}
		final ConstraintsModel cmta = this.cm;
		for (int i = 0; i < cmta.getRunnableSequencingConstraints().size(); i++) {
			for (int j = i + 1; j < cmta.getRunnableSequencingConstraints().size(); j++) {
				try {
					if (cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(0).getEntries().get(0)
							.getRunnable().equals(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups()
									.get(0).getEntries().get(0).getRunnable())) {
						final AmaltheaFactory cf = AmaltheaFactory.eINSTANCE;
						final ProcessRunnableGroupEntry prgen = cf.createProcessRunnableGroupEntry();
						prgen.setRunnable(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups().get(1)
								.getEntries().get(0).getRunnable());
						try {
							cmta.getRunnableSequencingConstraints().get(i).getProcessScope().add(cmta.getRunnableSequencingConstraints().get(j).getProcessScope().get(0));
						}
						catch (final Exception e) {
							PartLog.getInstance().log(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups()
									.get(1).getEntries().get(0).getRunnable().getName() + "has no processScope", e);
						}
						cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(1).getEntries()
								.add(prgen);
						cmta.getRunnableSequencingConstraints().remove(j);
						j--;
					}
					else if (cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(1).getEntries()
							.get(0).getRunnable().equals(cmta.getRunnableSequencingConstraints().get(j)
									.getRunnableGroups().get(1).getEntries().get(0).getRunnable())) {
						final AmaltheaFactory cf = AmaltheaFactory.eINSTANCE;
						final ProcessRunnableGroupEntry prgen = cf.createProcessRunnableGroupEntry();
						prgen.setRunnable(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups().get(0)
								.getEntries().get(0).getRunnable());
						try {
							cmta.getRunnableSequencingConstraints().get(i).getProcessScope().add(cmta.getRunnableSequencingConstraints().get(j).getProcessScope().get(0));
						}
						catch (final Exception e) {
							PartLog.getInstance().log(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups()
									.get(0).getEntries().get(0).getRunnable().getName() + " has no processScope", e);
						}
						cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(0).getEntries()
								.add(prgen);
						cmta.getRunnableSequencingConstraints().remove(j);
						j--;
					}
				}
				catch (final Exception e) {
					PartLog.getInstance().log("i: " + i + " j: " + j);
					e.printStackTrace();
					return;
				}
			}
		}
	}


	public ConstraintsModel getCm() {
		return this.cm;
	}


	public void setCm(final ConstraintsModel cm) {
		this.cm = cm;
	}

}
