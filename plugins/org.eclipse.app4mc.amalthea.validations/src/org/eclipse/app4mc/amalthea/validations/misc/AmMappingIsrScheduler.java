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
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.misc;

import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.ISR;
import org.eclipse.app4mc.amalthea.model.ISRAllocation;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of ISR -> Scheduler mapping
 * 
 * <ul>
 * <li>An ISR should have an allocation to an interrupt controller </li>
 * </ul>
 */

@Validation(id = "AM-Mapping-ISR-Scheduler")

public class AmMappingIsrScheduler extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getISR();
	}

	@Override
	public void validate(EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof ISR) {
			ISR isr = (ISR) object;

			Set<ISRAllocation> allocations = AmaltheaIndex.getReferringObjects(isr, ISRAllocation.class);
			if (allocations.isEmpty()) {
				addIssue(results, isr, null, "Unmapped ISR found: " + name(isr));
			}

			// multiple allocations ?
		}
	}

}
