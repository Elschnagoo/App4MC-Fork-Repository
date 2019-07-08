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

import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates min and max bounds of event chain latency constraints.
 * 
 * <ul>
 * <li>minimum must be non negative</li>
 * <li>maximum must be non negative</li>
 * <li>maximum must not be smaller than minimum</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-ECLConstraint")
public class TAConstraintsECLConstraint extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getEventChainLatencyConstraint();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof EventChainLatencyConstraint) {
			EventChainLatencyConstraint eclc = (EventChainLatencyConstraint) eObject;
			Time minimum = eclc.getMinimum();
			if (minimum != null && minimum.getValue() != null && 0 > minimum.getValue().signum()) {
				addIssue(results, eclc, ePackage.getEventChainLatencyConstraint_Minimum(), "The minimum must not be negative (" + minimum + " < 0, in "+ objectInfo(eclc) + ")");
			}
			Time maximum = eclc.getMaximum();
			if (maximum != null && maximum.getValue() != null && 0 > maximum.getValue().signum()) {
				addIssue(results, eclc, ePackage.getEventChainLatencyConstraint_Maximum(), "The maximum must not be negative (" + maximum + " < 0, in "+ objectInfo(eclc) + ")");
			}
			if (maximum != null && minimum != null && minimum.compareTo(maximum) > 0) {
				addIssue(results, eclc, ePackage.getEventChainLatencyConstraint_Minimum(), "The minimum is greater than the maximum (" + minimum + " > " + maximum + ", in "+ objectInfo(eclc) + ")");
			}
		}
	}

}
