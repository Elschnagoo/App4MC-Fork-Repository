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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping.model.specs;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;

public class ModelSpecCorePrescaler extends ModelSpec {
	/**
	 * Builder
	 *
	 * @return newly build spec
	 */
	public static ModelSpecCorePrescaler build() {
		final ModelSpecCorePrescaler spec = new ModelSpecCorePrescaler();
		spec.specType = "Has Prescaler with ClockRatio > 0 and Quartz";
		spec.name = spec.specType;
		return spec;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec#checkSpec(org.eclipse.app4mc.amalthea.model.Amalthea)
	 */
	@Override
	protected boolean checkSpec(final Amalthea model) {
		boolean cond = true;

// TODO implement
		
//		final EList<ProcessingUnit> cores = model.getHwModel().getSystem().getEcus().get(0).getMicrocontrollers().get(0)
//				.getCores();

//		for (final ProcessingUnit core : cores) {
//			final Prescaler ps = core.getPrescaler();
//
//			// Check that the ecu has a presacler
//			if (ps == null) {
//				log("ECU " + core.getName() + " doesn't have a Prescaler set.");
//				cond &= false;
//				continue;
//			}

//			// Verify the clock ration
//			if (ps.getClockRatio() <= 0) {
//				log("Prescaler " + ps.getName() + " has clock ratio <= 0.");
//				cond &= false;
//			}

//			final Quartz qtz = ps.getQuartz();
//
//			// Check that it has a quartz set
//			if (qtz == null) {
//				log("Prescaler " + ps.getName() + " doesn't have a Quartz set.");
//				cond &= false;
//				continue;
//			}

//			final Frequency frq = qtz.getFrequency();
//
//			// Check that the quartz has a frequency set
//			if (frq == null) {
//				log("Quartz " + qtz.getName() + " doesn't have a Frequency set.");
//				cond &= false;
//				continue;
//			}

//			// Check that the frequency has a Unit set
//			if (frq.getUnit() == FrequencyUnit._UNDEFINED_) {
//				log("Quartz " + qtz.getName() + " has frequency without Unit set.");
//				cond &= false;
//			}

//			// Check that the frequency has a Unit set
//			if (frq.getValue() <= 0) {
//				log("Quartz " + qtz.getName() + " has frequency without Value > 0.");
//				cond &= false;
//			}
//		}

		return cond;
	}

	/**
	 * Set the logging severity
	 *
	 * @param severity
	 *            logging severity
	 * @return the same spec object
	 */
	public ModelSpecCorePrescaler setSeverity(final EntrySeverityLevel severity) {
		this.severity = severity;
		return this;
	}

}
