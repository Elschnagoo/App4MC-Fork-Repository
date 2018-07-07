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

import org.eclipse.app4mc.amalthea.model.ConstraintsModel;

public class CreateTAInput {
	ConstraintsModel cm;

	/**
	 * This method creates a more dynamic approach of the runnable sequencing
	 * constraints (TA input)
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
				if (cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(0).getRunnables().get(0)
						.equals(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups().get(0).getRunnables()
								.get(0))) {
					setProcessScope(cmta, i, j);
					cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(1).getRunnables()
							.add(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups().get(1)
									.getRunnables().get(0));
					cmta.getRunnableSequencingConstraints().remove(j);
					j--;
				}
				else if (cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(1).getRunnables().get(0)
						.equals(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups().get(1).getRunnables()
								.get(0))) {
					setProcessScope(cmta, i, j);
					cmta.getRunnableSequencingConstraints().get(i).getRunnableGroups().get(0).getRunnables()
							.add(cmta.getRunnableSequencingConstraints().get(j).getRunnableGroups().get(0)
									.getRunnables().get(0));
					cmta.getRunnableSequencingConstraints().remove(j);
					j--;
				}
			}
		}
	}


	private void setProcessScope(final ConstraintsModel cmta, int i, int j) {
		if (cmta.getRunnableSequencingConstraints().get(j).getProcessScope() == null) {
			PartLog.getInstance().log(
					cmta.getRunnableSequencingConstraints().get(j).getName() + " has no processScope",
					null);
		}
		else {
			cmta.getRunnableSequencingConstraints().get(i).getProcessScope()
					.add(cmta.getRunnableSequencingConstraints().get(j).getProcessScope().get(0));
		}
	}


	public ConstraintsModel getCm() {
		return this.cm;
	}


	public void setCm(final ConstraintsModel cm) {
		this.cm = cm;
	}

}
