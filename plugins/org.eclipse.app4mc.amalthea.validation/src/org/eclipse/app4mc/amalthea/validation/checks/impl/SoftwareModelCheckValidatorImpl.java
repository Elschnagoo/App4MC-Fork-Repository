/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;

public class SoftwareModelCheckValidatorImpl extends AbstractValidatorImpl {

	public SoftwareModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public SoftwareModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}


	/**
	 * Checks the correctness of data dependency references
	 * 
	 * <ul>
	 * <li>...</li>
	 * </ul>
	 */
	public void checkDataDependency(final DataDependency dependency) {

	}

	/**
	 * Checks the correctness of call argument definitions
	 * 
	 * <ul>
	 * <li>The referred runnable must contain the referred parameter</li>
	 * </ul>
	 */	
	public void checkCallArgument(final CallArgument argument) {
		Runnable calledRunnable = argument.getContainingCall().getRunnable();
		RunnableParameter parameter = argument.getParameter();
		
		if (parameter == null) {
			this.issueCreator.issue(argument, AmaltheaPackage.eINSTANCE.getCallArgument_Parameter(),
					"Parameter of argument is undefined");
			return;
		}
		
		if (calledRunnable == null) {
			this.issueCreator.issue(argument.getContainingCall(), AmaltheaPackage.eINSTANCE.getRunnableCall_Runnable(),
					"Called runnable is undefined");
			return;
		}
		
		if (!calledRunnable.getParameters().contains(parameter)) {
			this.issueCreator.issue(argument, AmaltheaPackage.eINSTANCE.getCallArgument_Parameter(),
				"Called Runnable \"" + calledRunnable.getName()
				+ "\" does not match Parameter \"" + parameter.toString() + "\"");
		}
	}

}
