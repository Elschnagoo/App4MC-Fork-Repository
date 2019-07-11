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

import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of mode labels.
 * 
 * <ul>
 * <li>if set, initial value must refer to an enum mode literal</li>
 * </ul>
 */

@Validation(id = "TA-Software-OsEvent")
public class TASoftwareModeLabel extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getModeLabel();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ModeLabel) {
			ModeLabel ml = (ModeLabel) eObject;
			if (ml.isEnum() && ml.eIsSet(ePackage.getModeLabel_InitialValue())) {
				if (null == ((EnumMode)ml.getMode()).getLiteral(ml.getInitialValue())) {
					addIssue(results, ml, ePackage.getModeLabel_InitialValue(), "The initial value \"" + ml.getInitialValue() + "\" in " + objectInfo(ml) +
							" is not a valid literal of " + objectInfo(ml.getMode()) + ".");
				}
			}
		}
	}

}
