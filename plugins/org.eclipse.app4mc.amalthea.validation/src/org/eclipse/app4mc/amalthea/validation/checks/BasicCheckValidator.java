/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.impl.BasicCheckValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;


/**
 * Performs basic validation checks which are explained in more detail below
 */
public class BasicCheckValidator extends AbstractCheckValidator implements IssueCreator {

	private final BasicCheckValidatorImpl basicCheckImpl;

	public BasicCheckValidator() {
		super();
		this.basicCheckImpl = new BasicCheckValidatorImpl(this);
	}


	public BasicCheckValidator(final boolean doNothing) {
		this.basicCheckImpl = new BasicCheckValidatorImpl(this);
	}


	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}


	@Check(constraint = "DuplicateUniqueName", categories = { "Basic" })
	public void checkDuplicateUniqueNames(final Amalthea model) {
		this.basicCheckImpl.checkDuplicateUniqueNames(model);
	}
	
	@Check(constraint = "MissingReferableName", categories = { "Basic" })
	public void checkReferableNames(final Amalthea model) {
		this.basicCheckImpl.checkReferableNames(model);
	}

	@Check(constraint = "CustomPropertyDuplicateKey", categories = { "Basic" })
	public void checkForCustomPropertyDuplicateKey(final Amalthea model) {
		this.basicCheckImpl.checkForCustomPropertyDuplicateKey(model);
	}

	@Check(constraint = "UndefinedUnit", categories = { "Basic" })
	public void checkUnits(final Amalthea model) {
		this.basicCheckImpl.checkUnits(model);
	}
	
	@Check(constraint = "TimeRangeExceeded", categories = { "Basic" })
	public void checkTimeRanges(final Amalthea model) {
		this.basicCheckImpl.checkTimeRanges(model);
	}
	
	@Check(constraint = "WeibullParameters", categories = { "Basic" })
	public void checkWeibullParameters(final Amalthea model) {
		this.basicCheckImpl.checkWeibullParameters(model);
	}
}
