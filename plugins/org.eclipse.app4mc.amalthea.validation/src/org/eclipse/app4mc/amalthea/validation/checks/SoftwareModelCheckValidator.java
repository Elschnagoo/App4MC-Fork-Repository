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

package org.eclipse.app4mc.amalthea.validation.checks;

import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.impl.SoftwareModelCheckValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

public class SoftwareModelCheckValidator extends AbstractCheckValidator implements IssueCreator {

	private final SoftwareModelCheckValidatorImpl softwareModelImpl;

	public SoftwareModelCheckValidator() {
		super();
		this.softwareModelImpl = new SoftwareModelCheckValidatorImpl(this);
	}

	public SoftwareModelCheckValidator(final boolean doNothing) {
		this.softwareModelImpl = new SoftwareModelCheckValidatorImpl(this);
	}

	
	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}


	@Check(constraint = "DataDependency", categories = { "SoftwareModel" })
	public void checkDataDependency(final DataDependency model) {
		this.softwareModelImpl.checkDataDependency(model);
	}

	@Check(constraint = "CallArgument", categories = { "SoftwareModel" })
	public void checkCallArgument(final CallArgument model) {
		this.softwareModelImpl.checkCallArgument(model);
	}

}
