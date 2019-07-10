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

import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of periodic synthetic stimuli.
 * 
 * <ul>
 * <li>occurrence times must not be negative</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-PeriodicSyntheticStimulus")
public class TAStimuliPeriodicSyntheticStimulus extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getPeriodicSyntheticStimulus();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof PeriodicSyntheticStimulus) {
			PeriodicSyntheticStimulus pss = (PeriodicSyntheticStimulus) eObject;
			int index = 0;
			for(Time occurrenceTime:pss.getOccurrenceTimes()) {
				if (occurrenceTime != null && occurrenceTime.getValue() != null && 0 > occurrenceTime.getValue().signum()) {
					addIssue(results, pss, ePackage.getPeriodicSyntheticStimulus_OccurrenceTimes(), "The occurrence time specified at index " + index +
							" of " + objectInfo(pss) + " must not be negative.");
				}
				index++;
			}
		}
	}

}
