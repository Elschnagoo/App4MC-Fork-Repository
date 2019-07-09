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

import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates whether the value of the instructions per cycle HwFeature is sane.
 * 
 * <ul>
 * <li>IPC (instructions per cycle) must be positive
 * </ul>
 */

@Validation(id = "TA-Hardware-HWFIPCMustBePositive")
public class TAHardwareHWFIPCPositive extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwFeature();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof HwFeature) {
			HwFeature hwf = (HwFeature) eObject;
			if (hwf.getContainingCategory() != null && "Instructions".equalsIgnoreCase(hwf.getContainingCategory().getName()) &&
				hwf.getName() != null && hwf.getName().startsWith("IPC_")) {
				double ipcValue = hwf.getValue();
				if (Double.isFinite(ipcValue) && Double.compare(ipcValue, 0) <= 0) {
					addIssue(results, hwf, ePackage.getHwFeature_Value(), "The IPC value must be positive (" + ipcValue + " <= 0.0d, in " + objectInfo(hwf) + ")");
				}
			}
		}
	}

}
