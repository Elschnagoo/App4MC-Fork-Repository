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
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.ConstraintsModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class ConstraintsModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final ConstraintsModelValidatorImpl constraintsModelValidatorImpl;

	public ConstraintsModelValidator() {
		super();
		this.constraintsModelValidatorImpl = new ConstraintsModelValidatorImpl(this);
	}

	public ConstraintsModelValidator(final boolean doNothing) {
		this.constraintsModelValidatorImpl = new ConstraintsModelValidatorImpl(this);
	}
	
	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "EDFDeadlineAvailabilityConstraint", categories = { "TAConstraint" })
	public void checkEDFDeadlineAvailability(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkEDFDeadlineAvailability(amalthea);
	}
	
	@Check(constraint = "DeadlineValueConstraint", categories = { "TAConstraint" })
	public void checkDeadlineValue(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkDeadlineValue(amalthea);
	}
	
	@Check(constraint = "SynchronizationConstraintToleranceUnsigned", categories = { "TAConstraint" })
	public void checkSynchronizationConstraintToleranceUnsigned(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkSynchronizationConstraintToleranceUnsigned(amalthea);
	}
	
	@Check(constraint = "DelayConstraintUpperUnsigned", categories = { "TAConstraint" })
	public void checkDelayConstraintUpperUnsigned(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkDelayConstraintUpperUnsigned(amalthea);
	}
	
	@Check(constraint = "DelayConstraintLowerUnsigned", categories = { "TAConstraint" })
	public void checkDelayConstraintLowerUnsigned(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkDelayConstraintLowerUnsigned(amalthea);
	}
	
	@Check(constraint = "EventChainLatencyConstraintMinimumUnsigned", categories = { "TAConstraint" })
	public void checkEventChainLatencyConstraintMinimumUnsigned(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkEventChainLatencyConstraintMinimumUnsigned(amalthea);
	}
	
	@Check(constraint = "EventChainLatencyConstraintMaximumUnsigned", categories = { "TAConstraint" })
	public void checkEventChainLatencyConstraintMaximumUnsigned(final Amalthea amalthea) {
		this.constraintsModelValidatorImpl.checkEventChainLatencyConstraintMaximumUnsigned(amalthea);
	}
}
