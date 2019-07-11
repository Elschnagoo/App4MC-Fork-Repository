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
package org.eclipse.app4mc.amalthea.validations.ta.software;

import java.util.List;

import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of arrival curve stimuli.
 * 
 * <ul>
 * <li>lower time border of each arrival curve entry must not be negative</li>
 * <li>upper time border of each arrival curve entry must not be negative</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-ArrivalCurveStimulus")
public class TASoftwareEventMask extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		// TODO Auto-generated method stub

	}

}
