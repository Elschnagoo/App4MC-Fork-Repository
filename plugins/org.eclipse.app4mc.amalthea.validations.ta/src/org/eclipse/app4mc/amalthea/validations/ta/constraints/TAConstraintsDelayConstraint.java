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

import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates upper and lower bounds of delay constraints.
 * 
 * <ul>
 * <li>lower bound must be non negative</li>
 * <li>upper bound must be non negative</li>
 * <li>upper bound must not be smaller than lower bound</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-DelayConstraint")
public class TAConstraintsDelayConstraint extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getDelayConstraint();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof DelayConstraint) {
			DelayConstraint dc = (DelayConstraint) eObject;
			Time lower = dc.getLower();
			if (lower != null && lower.getValue() != null && 0 > lower.getValue().signum()) {
				addIssue(results, dc, ePackage.getDelayConstraint_Lower(), "The lower bound must not be negative (" + lower + " < 0, in "+ objectInfo(dc) + ")");
			}
			Time upper = dc.getUpper();
			if (upper != null && upper.getValue() != null && 0 > upper.getValue().signum()) {
				addIssue(results, dc, ePackage.getDelayConstraint_Upper(), "The upper bound must not be negative (" + upper + " < 0, in "+ objectInfo(dc) + ")");
			}
			if (upper != null && lower != null && lower.compareTo(upper) > 0) {
				addIssue(results, dc, ePackage.getDelayConstraint_Lower(), "The lower bound is greater than the upper (" + lower + " > " + upper + ", in "+ objectInfo(dc) + ")");
			}
		}
	}

}
