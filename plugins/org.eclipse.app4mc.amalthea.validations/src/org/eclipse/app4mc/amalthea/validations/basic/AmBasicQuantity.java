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

package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Quantity;
import org.eclipse.app4mc.amalthea.validations.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;


/**
 * Checks the correctness of Quantity
 * 
 * <ul>
 * <li>Unit has to be set (_undefined_ is an error)</li>
 * </ul>
 */

@Validation(id = "AM-Basic-Quantity")

public class AmBasicQuantity extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getQuantity();
	}

	@Override
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof Quantity) {
			Quantity quantity = (Quantity) object;
			
			Object unit = attributeValue(quantity, "unit");
			if (unit instanceof Enumerator) {
				if (((Enumerator) unit).getLiteral() == "_undefined_") {
					addIssue(results, quantity,
							typeInfo(quantity) + ": undefined unit" + containerInfo(quantity));
				}
			}

		}
	}

}
