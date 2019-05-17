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

package org.eclipse.app4mc.amalthea.validations.ta.basic;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Every Runnable must have a RunnableItem.
 */

public class TA011 extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getRunnable();
	}


	@Override
	public void validate(final EObject object, List<ValidationDiagnostic> results) {
		Runnable runnable = (Runnable) object;

		if (runnable.getRunnableItems().isEmpty()) {
			addIssue(results, runnable, null, "Runnable: no runnable items defined");
		}
	}

}
