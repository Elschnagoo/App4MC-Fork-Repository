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

import java.math.BigInteger;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of variable rate stimuli.
 * 
 * <ul>
 * <li>scenario must be set</li>
 * <li>scenario recurrence time must not be negative</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-VariableRateStimulusScenario")
public class TAStimuliVRStimulus extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getVariableRateStimulus();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof VariableRateStimulus) {
			VariableRateStimulus vrs = (VariableRateStimulus) eObject;
			if (vrs.getScenario() == null) {
				addIssue(results, vrs, ePackage.getVariableRateStimulus_Scenario(), "Scenario must be set in "+ objectInfo(vrs) + ".");
			} else {
				Scenario s = vrs.getScenario();
				Time r = s.getRecurrence();
				if (r != null) {
					BigInteger value = r.getValue();
					if (0 >= value.signum()) {
						addIssue(results, s, ePackage.getScenario_Recurrence(), "The recurrence time specified in the scenario of " + objectInfo(vrs) +
								" must be greater than 0.");
					}
				}
			}
		}
	}

}
