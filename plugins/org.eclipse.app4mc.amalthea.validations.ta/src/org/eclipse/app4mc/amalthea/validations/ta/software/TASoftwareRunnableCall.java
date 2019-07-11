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

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of runnable calls.
 * 
 * <ul>
 * <li>the called runnable may not refer to the runnable owning this runnable call</li>
 * </ul>
 */

@Validation(id = "TA-Software-RunnableCall")
public class TASoftwareRunnableCall extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getRunnableCall();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof RunnableCall) {
			RunnableCall rc = (RunnableCall) eObject;
			Runnable r = rc.getRunnable();
			Runnable cr = rc.getContainingRunnable();
			if (r != null && cr != null && cr == r) {
				addIssue(results, rc, ePackage.getRunnableCall_Runnable(), "The runnable called by " + objectInfo(rc) + " in " + objectInfo(cr) +
						" must not refer to the containing runnable.");
			}
		}
	}

}
