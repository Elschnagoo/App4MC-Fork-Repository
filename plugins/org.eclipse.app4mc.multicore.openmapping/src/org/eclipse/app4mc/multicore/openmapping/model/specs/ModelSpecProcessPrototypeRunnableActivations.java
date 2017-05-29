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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Activation;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.PeriodicActivation;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecProcessPrototypeRunnableActivations extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecProcessPrototypeRunnableActivations build() {
		final ModelSpecProcessPrototypeRunnableActivations spec = new ModelSpecProcessPrototypeRunnableActivations();
		spec.specType = "Process Prototype's Runnables have activations";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * Get all runnables refered by a process prototype out of the model
	 *
	 * @param model
	 *            model
	 * @return list of runnables
	 */
	private List<Runnable> getAllRunnablesOfProcessPrototypes(final Amalthea model) {
		final List<Runnable> listRun = new ArrayList<Runnable>();

		for (final ProcessPrototype procProto : model.getSwModel().getProcessPrototypes()) {
			for (final TaskRunnableCall call : procProto.getRunnableCalls()) {
				listRun.add(call.getRunnable());
			}
		}

		return listRun;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final Runnable run : getAllRunnablesOfProcessPrototypes(model)) {
			final Activation act = run.getActivation();

			// Check for activation
			if (act == null) {
				cond &= false;
				log("Runnable " + run.getName() + " doesn't have an activation set.");
				continue;
			}

			// If the activation is periodic check for max and min
			if (act instanceof PeriodicActivation) {
				final PeriodicActivation perAct = (PeriodicActivation) act;

				if (perAct.getMax() == null && perAct.getMin() == null) {
					cond &= false;
					log("Runnable " + run.getName() + "'s periodic activation doesn't have a maximum nor minimum set.");
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
	public ModelSpecProcessPrototypeRunnableActivations setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
