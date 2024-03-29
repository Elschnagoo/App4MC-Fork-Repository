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

package org.eclipse.app4mc.multicore.partitioning.specs;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecRunnableActivation extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecRunnableActivation build() {
		final ModelSpecRunnableActivation spec = new ModelSpecRunnableActivation();
		spec.specType = "Runnables have Stimuli";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final Runnable run : model.getSwModel().getRunnables()) {
			final Activation activation = run.getFirstActivation();		//TODO: handle multiple activations

			if (activation == null) {
				log("Runnable " + run.getName() + " doesn't have an Activation set.");
				cond &= false;
				continue;
			}

			if (!(activation instanceof PeriodicActivation)) {
				log("Runnable " + run.getName() + " has a non-Periodic Activation set (not yet supported).");
				cond &= false;
				continue;
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
	public ModelSpecRunnableActivation setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
