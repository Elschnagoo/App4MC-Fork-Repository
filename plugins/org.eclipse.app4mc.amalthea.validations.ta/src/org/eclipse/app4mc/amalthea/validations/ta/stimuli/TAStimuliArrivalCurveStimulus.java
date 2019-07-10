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

import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.Time;
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
public class TAStimuliArrivalCurveStimulus extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getArrivalCurveStimulus();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ArrivalCurveStimulus) {
			ArrivalCurveStimulus acs = (ArrivalCurveStimulus) eObject;
			int index = 0;
			for(ArrivalCurveEntry ace:acs.getEntries()) {
				Time lower = ace.getLowerTimeBorder();
				if (lower != null && lower.getValue() != null && 0 > lower.getValue().signum()) {
					addIssue(results, ace, ePackage.getArrivalCurveEntry_LowerTimeBorder(), "The lower time border specified in the " + objectInfo(ace) +
							" at index " + index + " of " + objectInfo(acs) + " must not be negative.");
				}
				Time upper = ace.getUpperTimeBorder();
				if (upper != null && upper.getValue() != null && 0 > upper.getValue().signum()) {
					addIssue(results, ace, ePackage.getArrivalCurveEntry_UpperTimeBorder(), "The upper time border specified in the " + objectInfo(ace) +
							" at index " + index + " of " + objectInfo(acs) + " must not be negative.");
				}
				index++;
			}
		}
	}

}
