/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.emf.common.util.EList;

public class ModelSpecTaskPeriodicStimuli extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecTaskPeriodicStimuli build() {
		final ModelSpecTaskPeriodicStimuli spec = new ModelSpecTaskPeriodicStimuli();
		spec.specType = "Tasks' Periodic Stimuli";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final Task task : model.getSwModel().getTasks()) {
			final EList<Stimulus> stimList = task.getStimuli();
			for (final Stimulus stim : stimList) {
				if (!(stim instanceof Periodic)) {
					continue;
				}

				final Periodic per = (Periodic) stim;

				if (per.getRecurrence() == null) {
					log("Periodic Stimulus " + per.getName() + " doesn't have a Recurrence set.");
					cond &= false;
					continue;
				}

				if (per.getRecurrence().getUnit() == TimeUnit._UNDEFINED_) {
					log("Periodic Stimulus " + per.getName() + " has a Recurrence without Unit set.");
					cond &= false;
				}

				if (per.getRecurrence().getValue() == 0) {
					log("Periodic Stimulus " + per.getName() + " has a Recurrence without Value set.");
					cond &= false;
				}

			}


		}

		return cond;

	}

	/**
	 * Set the logging severity
	 *
	 * @param severity
	 *            logging severity
	 * @return the same spec object
	 */
	public ModelSpecTaskPeriodicStimuli setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}