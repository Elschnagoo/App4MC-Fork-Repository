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

package org.eclipse.app4mc.amalthea.validations.software;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of call argument definitions
 * 
 * <ul>
 * <li>The referred runnable must contain the referred parameter</li>
 * </ul>
 */	

@Validation(id = "AM-SW-CallArgument")

public class AmSwCallArgument extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getCallArgument();
	}

	@Override
	public void validate(final EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof CallArgument) {
			CallArgument argument = (CallArgument) object;
			
			RunnableCall runnableCall = argument.getContainingCall();
			Runnable calledRunnable = runnableCall.getRunnable();
			RunnableParameter parameter = argument.getParameter();
			
			if (parameter == null) {
				addIssue(results, argument, ePackage.getCallArgument_Parameter(),
						"Call argument: Parameter of argument is undefined");
			}
			
			if (calledRunnable == null) {
				addIssue(results, runnableCall, ePackage.getRunnableCall_Runnable(),
						"Call argument: Called runnable is undefined");
			}
			
			if (parameter == null || calledRunnable == null) {
				return;	// Skip further checks
			}
			
			if (!calledRunnable.getParameters().contains(parameter)) {
				addIssue(results, argument, ePackage.getCallArgument_Parameter(),
						"Call argument: Called Runnable \"" + calledRunnable.getName()
						+ "\" does not match Parameter \"" + parameter.toString() + "\"");
			}

		}
	}

}
