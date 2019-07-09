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
package org.eclipse.app4mc.amalthea.validations.ta.hardware;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates whether the frequency of a frequency domain is positive.
 * 
 * <ul>
 * <li>frequency must be positive</li>
 * </ul>
 */

@Validation(id = "TA-Hardware-FrequencyDomainMustBePositive")
public class TAHardwareFrequencyDomainPositive extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getFrequencyDomain();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof FrequencyDomain) {
			FrequencyDomain fd = (FrequencyDomain) eObject;
			Frequency f = fd.getDefaultValue();
			if (f != null && Double.isFinite(f.getValue()) && Double.compare(f.getValue(), 0d) <= 0) {
				addIssue(results, fd, ePackage.getFrequencyDomain_DefaultValue(), "The frequency must be positive (" + f + " <= 0.0d, in " + objectInfo(fd) + ")");
			}
		}
	}

}
