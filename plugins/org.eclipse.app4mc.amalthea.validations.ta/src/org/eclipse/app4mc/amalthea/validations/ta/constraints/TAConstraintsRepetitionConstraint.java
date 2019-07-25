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
 * Validates lower and upper bound of repetition constraints.
 * 
 * <ul>
 * <li>upper bound must not be smaller than lower bound</li>
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
			Time upper = rc.getUpper();
			if (upper != null && lower != null && lower.compareTo(upper) > 0) {
				addIssue(results, rc, ePackage.getRepetitionConstraint_Lower(), "The lower bound is greater than the upper (" + lower + " > " + upper + ", in "+ objectInfo(rc) + ")");
			}
		}
	}

}
