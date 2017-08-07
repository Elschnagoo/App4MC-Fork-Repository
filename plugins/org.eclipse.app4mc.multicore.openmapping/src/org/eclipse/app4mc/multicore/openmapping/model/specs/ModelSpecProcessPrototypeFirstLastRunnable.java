/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ProcessPrototype;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecProcessPrototypeFirstLastRunnable extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecProcessPrototypeFirstLastRunnable build() {
		final ModelSpecProcessPrototypeFirstLastRunnable spec = new ModelSpecProcessPrototypeFirstLastRunnable();
		spec.specType = "Process Prototype has First/Last Runnable";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

		for (final ProcessPrototype procProto : model.getSwModel().getProcessPrototypes()) {
			if (procProto.getFirstRunnable() == null) {
				log("Process Prototype " + procProto.getName() + " doesn't have First Runnable set.");
				cond &= false;
				continue;
			}

			if (procProto.getLastRunnable() == null) {
				log("Process Prototype " + procProto.getName() + " doesn't have Last Runnable set.");
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
	public ModelSpecProcessPrototypeFirstLastRunnable setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
