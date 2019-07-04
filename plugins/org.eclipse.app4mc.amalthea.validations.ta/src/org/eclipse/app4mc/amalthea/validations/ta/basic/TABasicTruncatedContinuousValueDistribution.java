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

import org.eclipse.app4mc.amalthea.model.TruncatedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks sanity of lower and upper bound of truncated continuous value distributions
 * 
 * <ul>
 * <li>upper bounds must be greater than or equal to lower bounds</li>
 * </ul>
 */

@Validation(id = "TA-Basic-TruncatedContinuousValueDistribution-LowerUpper")
public class TABasicTruncatedContinuousValueDistribution extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTruncatedContinuousValueDistribution();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof TruncatedContinuousValueDistribution) {
			TruncatedContinuousValueDistribution tcvd = (TruncatedContinuousValueDistribution) eObject;
			Double lower = tcvd.getLowerBound();
			Double upper = tcvd.getUpperBound();
			if (lower != null && !lower.isNaN() && !lower.isInfinite() && upper != null && !upper.isNaN() && !upper.isInfinite()) {
				if (lower.compareTo(upper) > 0) {
					addIssue(results, tcvd, ePackage.getTruncatedContinuousValueDistribution_LowerBound(),
							getEClassifier().getName() + ": lower bound is higher than the upper: (" + lower + " > " + upper + ", in " + objectInfo(tcvd) + " )");
				}
			}
		}
	}

}
