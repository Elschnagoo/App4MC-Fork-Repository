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
package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
* Checks the correctness of counters
* 
* <ul>
* <li>the offset value of a counter must not be negative</li>
* </ul>
*/

@Validation(id = "AM-Basic-Counter")
public class AmBasicCounter extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getCounter();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof Counter) {
			Counter c = (Counter) eObject;
			long offset = c.getOffset();
			if (offset < 0) {
				addIssue(results, c, ePackage.getCounter_Offset(), "Counter: offset value must not be negative" + containerInfo(c));
			}
		}
	}

}
