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

import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of clock multiplier lists.
 * 
 * <ul>
 * <li>multiplier value in each clock multiplier list entry must not be negative</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-ClockMultiplierList")
public class TAStimuliClockMultiplierList extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getClockMultiplierList();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ClockMultiplierList) {
			ClockMultiplierList vrs = (ClockMultiplierList) eObject;
			int index = 0;
			for(ClockMultiplierListEntry entry:vrs.getEntries()) {
				double multiplier = entry.getMultiplier();
				if (Double.isFinite(multiplier) && Double.compare(multiplier, 0) < 0) {
					addIssue(results, entry, ePackage.getClockMultiplierListEntry_Multiplier(), "The multiplier specified in the " + objectInfo(entry) +
							" at index " + index + " of " + objectInfo(vrs) + " must not be negative.");
				}
				index++;
			}
		}
	}

}
