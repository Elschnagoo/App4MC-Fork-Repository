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
package org.eclipse.app4mc.amalthea.validations.ta.constraints;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates lower bound, upper bound, jitter, and period of repetition constraints.
 * 
 * <ul>
 * <li>lower bound must be non negative</li>
 * <li>upper bound must be non negative</li>
 * <li>upper bound must not be smaller than lower bound</li>
 * <li>jitter must be non negative</li>
 * <li>period must be non negative</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-RepetitionConstraint")
public class TAConstraintsRepetitionConstraint extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getRepetitionConstraint();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof RepetitionConstraint) {
			RepetitionConstraint rc = (RepetitionConstraint) eObject;
			Time lower = rc.getLower();
			if (lower != null && lower.getValue() != null && 0 > lower.getValue().signum()) {
				addIssue(results, rc, ePackage.getRepetitionConstraint_Lower(), "The lower bound must not be negative (" + lower + " < 0, in "+ objectInfo(rc) + ")");
			}
			Time upper = rc.getUpper();
			if (upper != null && upper.getValue() != null && 0 > upper.getValue().signum()) {
				addIssue(results, rc, ePackage.getRepetitionConstraint_Upper(), "The upper bound must not be negative (" + upper + " < 0, in "+ objectInfo(rc) + ")");
			}
			if (upper != null && lower != null && lower.compareTo(upper) > 0) {
				addIssue(results, rc, ePackage.getRepetitionConstraint_Lower(), "The lower bound is greater than the upper (" + lower + " > " + upper + ", in "+ objectInfo(rc) + ")");
			}
			Time jitter = rc.getJitter();
			if (jitter != null && jitter.getValue() != null && 0 > jitter.getValue().signum()) {
				addIssue(results, rc, ePackage.getRepetitionConstraint_Jitter(), "The jitter must not be negative (" + jitter + " < 0, in "+ objectInfo(rc) + ")");
			}
			Time period = rc.getPeriod();
			if (period != null && period.getValue() != null && 0 > period.getValue().signum()) {
				addIssue(results, rc, ePackage.getRepetitionConstraint_Period(), "The period must not be negative (" + period + " < 0, in "+ objectInfo(rc) + ")");
			}
		}
	}

}
