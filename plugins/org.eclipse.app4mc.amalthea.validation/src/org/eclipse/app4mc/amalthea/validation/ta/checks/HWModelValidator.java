/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 *
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.HWModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class HWModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final HWModelValidatorImpl hwModelValidatorImpl;

	public HWModelValidator() {
		super();
		this.hwModelValidatorImpl = new HWModelValidatorImpl(this);
	}

	public HWModelValidator(final boolean doNothing) {
		this.hwModelValidatorImpl = new HWModelValidatorImpl(this);
	}
	
	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "QuartzFrequencyConstraint", categories = { "TAConstraint" })
	public void checkQuartzFrequency(final Amalthea amalthea) {
		this.hwModelValidatorImpl.checkQuartzFrequency(amalthea);
	}
	
	@Check(constraint = "InstructionsPerCycleConstraint", categories = { "TAConstraint" })
	public void checkCoreTypeInstructionsPerCycle(final Amalthea amalthea) {
		this.hwModelValidatorImpl.checkCoreTypeInstructionsPerCycle(amalthea);
	}
	
	@Check(constraint = "QuartzReferenceOfPrescalerConstraint", categories = { "TAConstraint" })
	public void checkQuartzReferenceOfPrescaler(final Amalthea amalthea) {
		this.hwModelValidatorImpl.checkCoreTypeInstructionsPerCycle(amalthea);
	}
}
