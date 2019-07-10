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
package org.eclipse.app4mc.amalthea.validations.ta.misc;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of initial and max value of semaphores.
 * 
 * <ul>
 * <li>initial value must not be negative</li>
 * <li>max value must be positive</li>
 * <li>max value must not be smaller than the initial value</li>
 * </ul>
 */

@Validation(id = "TA-Misc-Semaphore")
public class TAMiscSemaphore extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getSemaphore();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof Semaphore) {
			Semaphore s = (Semaphore) eObject;
			int initial = s.getInitialValue();
			if (initial < 0) {
				addIssue(results, s, ePackage.getSemaphore_InitialValue(), "The initial value must not be negative (" + initial + " < 0, in "+ objectInfo(s) + ")");
			}
			int max = s.getMaxValue();
			if (max <= 0) {
				addIssue(results, s, ePackage.getSemaphore_MaxValue(), "The maximum value must be positive (" + max + " <= 0, in "+ objectInfo(s) + ")");
			}
			if (max < initial) {
				addIssue(results, s, ePackage.getSemaphore_InitialValue(), "The initial value is greater than the maximum value (" + initial + " > " + max + ", in "+ objectInfo(s) + ")");
			}
		}
	}

}
