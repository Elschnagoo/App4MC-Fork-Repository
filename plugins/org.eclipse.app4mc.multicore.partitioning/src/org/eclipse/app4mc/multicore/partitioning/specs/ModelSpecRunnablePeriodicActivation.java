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
package org.eclipse.app4mc.multicore.partitioning.specs;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecRunnablePeriodicActivation extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecRunnablePeriodicActivation build() {
		final ModelSpecRunnablePeriodicActivation spec = new ModelSpecRunnablePeriodicActivation();
		spec.specType = "Runnables' Periodic Activations";
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


			if (!(activation instanceof PeriodicActivation)) {
				continue;
			}

			final PeriodicActivation per = (PeriodicActivation) activation;

			if (per.getMax() == null && per.getMin() == null) {
				log("Periodic Activation " + per.getName() + " doesn't have a Maximum nor Minimum set.");
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
	public ModelSpecRunnablePeriodicActivation setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
