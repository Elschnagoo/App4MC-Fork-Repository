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
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks sanity of mean of time Gauss distributions
 * 
 * <ul>
 * <li>mean must not be less than the lower bound</li>
 * <li>mean must not be greater than the upper bound</li>
 * </ul>
 */

@Validation(id = "TA-Basic-TimeGaussDistribution-mean")
public class TABasicTimeGaussDistribution extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTimeGaussDistribution();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof TimeGaussDistribution) {
			TimeGaussDistribution tgd = (TimeGaussDistribution) eObject;
			INamed namedContainer = AmaltheaServices.getContainerOfType(tgd, INamed.class);
			Time mean = tgd.getMean();
			if (mean != null) {
				Time lower = tgd.getLowerBound();
				if (lower != null) {
					if (lower.compareTo(mean) > 0) {
						addIssue(results, tgd, ePackage.getTimeGaussDistribution_Mean(),
								getEClassifier().getName() + ": mean is less than the lower bound: (" + mean + " < " + lower + ", in " + objectInfo(namedContainer) + ")");
					}
				}
				Time upper = tgd.getUpperBound();
				if (upper != null) {
					if (upper.compareTo(mean) < 0) {
						addIssue(results, tgd, ePackage.getTimeGaussDistribution_Mean(),
								getEClassifier().getName() + ": mean is greater than the upper bound: (" + mean + " > " + upper + ", in " + objectInfo(namedContainer) + ")");
					}
				}
			}
		}
	}

}
