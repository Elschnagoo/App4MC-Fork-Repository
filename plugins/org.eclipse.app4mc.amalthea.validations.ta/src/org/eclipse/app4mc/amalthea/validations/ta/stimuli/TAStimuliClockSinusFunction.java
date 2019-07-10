/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta.stimuli;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates amplitude and yOffset of triangle sinus functions.
 * 
 * <ul>
 * <li>amplitude must be non negative</li>
 * <li>yOffset must be positive</li>
 * <li>yOffset must not be smaller than amplitude</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-ClockSinuxFunction")
public class TAStimuliClockSinusFunction extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getClockSinusFunction();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ClockSinusFunction) {
			ClockSinusFunction csf = (ClockSinusFunction) eObject;
			double amplitude = csf.getAmplitude();
			if (Double.isFinite(amplitude) && Double.compare(amplitude, 0) < 0) {
				addIssue(results, csf, ePackage.getClockSinusFunction_Amplitude(), "The amplitude must not be negative (" + amplitude + " < 0.0d, in "+ objectInfo(csf) + ")");
			}
			double yOffset = csf.getYOffset();
			if (Double.isFinite(yOffset) && Double.compare(yOffset, 0) <= 0) {
				addIssue(results, csf, ePackage.getClockSinusFunction_YOffset(), "The yOffset must be positive (" + yOffset + " <= 0.0d, in "+ objectInfo(csf) + ")");
			}
			if (Double.isFinite(amplitude) && Double.isFinite(yOffset) && Double.compare(amplitude, yOffset) > 0) {
				addIssue(results, csf, ePackage.getClockSinusFunction_Amplitude(), "The amplitude is greater than the yOffset (" + amplitude + " > " + yOffset + ", in "+ objectInfo(csf) + ")");
			}
		}
	}

}
