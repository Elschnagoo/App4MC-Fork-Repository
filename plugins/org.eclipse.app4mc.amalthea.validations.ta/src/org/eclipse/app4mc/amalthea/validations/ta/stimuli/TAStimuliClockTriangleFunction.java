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

import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates min and max of triangle clock functions.
 * 
 * <ul>
 * <li>minimum must be non negative</li>
 * <li>maximum must be positive</li>
 * <li>maximum must not be smaller than minimum</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-ClockTriangleFunction")
public class TAStimuliClockTriangleFunction extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getClockTriangleFunction();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ClockTriangleFunction) {
			ClockTriangleFunction ctf = (ClockTriangleFunction) eObject;
			double min = ctf.getMin();
			if (Double.isFinite(min) && Double.compare(min, 0) < 0) {
				addIssue(results, ctf, ePackage.getClockTriangleFunction_Min(), "The min must not be negative (" + min + " < 0.0d, in "+ objectInfo(ctf) + ")");
			}
			double max = ctf.getMax();
			if (Double.isFinite(max) && Double.compare(max, 0) <= 0) {
				addIssue(results, ctf, ePackage.getClockTriangleFunction_Max(), "The max must be positive (" + max + " <= 0.0d, in "+ objectInfo(ctf) + ")");
			}
			if (Double.isFinite(min) && Double.isFinite(max) && Double.compare(min, max) > 0) {
				addIssue(results, ctf, ePackage.getClockTriangleFunction_Min(), "The min is greater than the max (" + min + " > " + max + ", in "+ objectInfo(ctf) + ")");
			}
		}
	}

}
