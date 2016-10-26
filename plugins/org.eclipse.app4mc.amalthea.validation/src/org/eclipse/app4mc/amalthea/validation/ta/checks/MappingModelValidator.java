/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Timing-Architects Embedded Systems GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.MappingModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class MappingModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final MappingModelValidatorImpl modelValidatorImpl;

	public MappingModelValidator() {
		super();
		this.modelValidatorImpl = new MappingModelValidatorImpl(this);
	}

	public MappingModelValidator(final boolean doNothing) {
		this.modelValidatorImpl = new MappingModelValidatorImpl(this);
	}

	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "CoreReferenceOfCoreAllocationConstraint", categories = { "TAConstraint" })
	public void checkCoreReferenceOfCoreAllocation(final Amalthea amalthea) {
		this.modelValidatorImpl.checkCoreReferenceOfCoreAllocation(amalthea);

	}
}
