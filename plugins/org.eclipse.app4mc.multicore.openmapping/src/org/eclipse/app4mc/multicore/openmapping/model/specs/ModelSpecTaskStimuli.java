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
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.emf.common.util.EList;

public class ModelSpecTaskStimuli extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecTaskStimuli build() {
		final ModelSpecTaskStimuli spec = new ModelSpecTaskStimuli();
		spec.specType = "Tasks' have Stimuli";
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

			if (stimList.size() == 0) {
				log("Task " + task.getName() + " doesn't have a Stimulus set.");
				cond &= false;
				continue;
			}

			for (final Stimulus stim : stimList) {
				if (!(stim instanceof Periodic)) {
					log("Task " + task.getName() + " has a non-Periodic stimulus (not yet supported).");
					cond &= false;
					continue;
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
	public ModelSpecTaskStimuli setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
