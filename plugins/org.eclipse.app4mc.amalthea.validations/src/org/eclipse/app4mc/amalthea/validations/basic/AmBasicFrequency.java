/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Checks the correctness of Frequencies
 * 
 * <ul>
 * <li>Some frequencies have to fulfill the condition >0 or >=0.</li>
 * </ul>
 */

@Validation(id = "AM-Basic-Frequency")

public class AmBasicFrequency extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getFrequency();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof Frequency) {
			Frequency frequency = (Frequency) eObject;

			if (frequency.getValue() > 0d)
				return; // always valid
			
			final EStructuralFeature containingFeature = frequency.eContainingFeature();
			if (containingFeature == null)
				return; // unknown context
			
			//*** the value of the following elements should be > 0
			
			if (frequency.getValue() <= 0d) {
				if (containingFeature == ePackage.getFrequencyDomain_DefaultValue()
				|| containingFeature == ePackage.getClockFunction_YOffset()
				) {
					addIssue(results, frequency, ePackage.getFrequency_Value(),
							"Frequency: " + containingFeature.getName() + " value must be greater than zero" + containerInfo(frequency));
				}
			}

			//*** the value of the following elements should be >= 0
			
			if (frequency.getValue() < 0d) {
				if (containingFeature == ePackage.getClockStep_Frequency()
				|| containingFeature == ePackage.getClockFunction_PeakToPeak()
				) {
					addIssue(results, frequency, ePackage.getFrequency_Value(),
							"Frequency: " + containingFeature.getName() + " value must be positive or zero" + containerInfo(frequency));
				}
			}

		}
	}

}
