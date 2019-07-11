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
package org.eclipse.app4mc.amalthea.validations.ta.software;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of mode label accesses.
 * 
 * <ul>
 * <li>checks whether value refers to an existing mode enum literal</li>
 * </ul>
 */

@Validation(id = "TA-Software-ModeLabelAccess")
public class TASoftwareModeLabelAccess extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getModeLabelAccess();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ModeLabelAccess) {
			ModeLabelAccess mla = (ModeLabelAccess) eObject;
			ModeLabel ml = mla.getData();
			if (ml != null && ml.isEnum() && mla.getAccess() == ModeLabelAccessEnum.SET && mla.eIsSet(ePackage.getModeLabelAccess_Value())) {
				if (null == ((EnumMode)ml.getMode()).getLiteral(mla.getValue())) {
					INamed namedContainer = AmaltheaServices.getContainerOfType(mla, INamed.class);
					addIssue(results, mla, ePackage.getModeLabelAccess_Value(), "The mode label access value to be updated to \"" + mla.getValue() + "\" in " + objectInfo(namedContainer) +
							" is not a valid literal of " + objectInfo(ml.getMode()) + ".");
				}
			}
		}
	}

}
