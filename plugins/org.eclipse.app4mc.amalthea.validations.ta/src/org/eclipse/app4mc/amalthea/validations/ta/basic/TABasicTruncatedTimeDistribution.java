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
package org.eclipse.app4mc.amalthea.validations.ta.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks sanity of lower and upper bound of truncated time distributions
 * 
 * <ul>
 * <li>upper bounds must be greater than or equal to lower bounds</li>
 * </ul>
 */

@Validation(id = "TA-Basic-TruncatedTimeDistribution-LowerUpper")
public class TABasicTruncatedTimeDistribution extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTruncatedTimeDistribution();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof TruncatedTimeDistribution) {
			TruncatedTimeDistribution ttd = (TruncatedTimeDistribution) eObject;
			INamed namedContainer = AmaltheaServices.getContainerOfType(ttd, INamed.class);
			Time lower = ttd.getLowerBound();
			Time upper = ttd.getUpperBound();
			if (lower != null && upper != null) {
				if (lower.compareTo(upper) > 0) {
					addIssue(results, ttd, ePackage.getTruncatedTimeDistribution_LowerBound(),
							getEClassifier().getName() + ": lower bound is higher than the upper: (" + lower + " > " + upper + ", in " + objectInfo(namedContainer) + ")");
				}
			}
		}
	}

}
