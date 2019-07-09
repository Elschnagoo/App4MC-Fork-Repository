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
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.PuType;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates whether the instructions per cycle HWFeature is set for
 * a processing unit definition of type CPU and has a sane value.
 * 
 * <ul>
 * <li>IPC (instructions per cycle) should be set, otherwise default (1.0) will
 * be assumed</li>
 * <li>there should only be one IPC HwFeature be specified for a processing unit
 * definition</li>
 * </ul>
 */

@Validation(id = "TA-Hardware-PUDIPCMissing")
public class TAHardwarePUDIPCMissing extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getProcessingUnitDefinition();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ProcessingUnitDefinition) {
			ProcessingUnitDefinition pud = (ProcessingUnitDefinition) eObject;
			// only cores should have IPCs
			if (pud.getPuType() == PuType.CPU) {
				List<HwFeature> oHWF = pud.getFeatures().stream()
						// consider only features which are in category "Instructions"
						.filter(hwf -> hwf.getContainingCategory() != null && "Instructions".equalsIgnoreCase(hwf.getContainingCategory().getName()))
						// consider only features whose name starts with "IPC_"
						.filter(hwf -> hwf.getName() != null && hwf.getName().startsWith("IPC_")).collect(Collectors.toList());
				if (oHWF.size() > 1) {
					addIssue(results, pud, ePackage.getProcessingUnitDefinition_Features(), objectInfo(pud) + " has multiple IPC HwFeatures (only the first will be considered)");
				}
				if (oHWF.isEmpty()) {
					addIssue(results, pud, ePackage.getProcessingUnitDefinition_Features(), objectInfo(pud) + " does not have an IPC specified (default value of 1.0 will be assumed). "
							+ "To specify an IPC value: add a HwFeature in the category named \"Instructions\", set a name that starts with \"IPC_\", set a positive "
							+ "value, and add it to the feature list of " + objectInfo(pud) + ".");
				}
			}
		}
	}

}
