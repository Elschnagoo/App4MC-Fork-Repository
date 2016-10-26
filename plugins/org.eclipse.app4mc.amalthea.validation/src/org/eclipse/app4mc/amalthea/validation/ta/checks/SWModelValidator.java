/*******************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html Contributors: Timing-Architects Embedded Systems GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.validation.ta.checks;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.SWModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class SWModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final SWModelValidatorImpl softwareModelValidatorImpl;

	public SWModelValidator() {
		super();
		this.softwareModelValidatorImpl = new SWModelValidatorImpl(this);
	}

	public SWModelValidator(final boolean doNothing) {
		this.softwareModelValidatorImpl = new SWModelValidatorImpl(this);
	}

	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "LabelSizeConstraint", categories = { "TAConstraint" })
	public void checkLabelSize(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkLabelSize(amalthea);
	}

	@Check(constraint = "RunnableReferenceOfTaskRunnableCallConstraint", categories = { "TAConstraint" })
	public void checkRunnableReferenceOfTaskRunnableCall(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkRunnableReferenceOfTaskRunnableCall(amalthea);
	}

	@Check(constraint = "RunnableReferenceOfRunnableCallConstraint", categories = { "TAConstraint" })
	public void checkRunnableReferenceOfRunnableCall(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkRunnableReferenceOfRunnableCall(amalthea);
	}

	@Check(constraint = "OsEventReferenceOfEventMaskConstraint", categories = { "TAConstraint" })
	public void checkOsEventReferenceOfEventMask(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkOsEventReferenceOfEventMask(amalthea);
	}

	@Check(constraint = "EventMaskEventsConstraint", categories = { "TAConstraint" })
	public void checkEventMaskEvents(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkEventMaskEvents(amalthea);
	}

	@Check(constraint = "ModeValueProviderConstraint", categories = { "TAConstraint" })
	public void checkModeValueProvider(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkModeValueProvider(amalthea);
	}

	@Check(constraint = "ModeSwitchEntryValueConstraint", categories = { "TAConstraint" })
	public void checkModeSwitchEntryValue(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkModeSwitchEntryValue(amalthea);
	}

	@Check(constraint = "ModeValueProviderValueConstraint", categories = { "TAConstraint" })
	public void checkModeValueProviderValue(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkModeValueProviderValue(amalthea);
	}

	@Check(constraint = "ModeValueProviderModeConstraint", categories = { "TAConstraint" })
	public void checkModeLabelMode(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkModeValueProviderMode(amalthea);
	}

	@Check(constraint = "ModeValueProviderInitialValueConstraint", categories = { "TAConstraint" })
	public void checkModeLabelInitialValue(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkModeValueProviderInitialValue(amalthea);
	}

	@Check(constraint = "CounterOffsetConstraint", categories = { "TAConstraint" })
	public void checkCounterOffset(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkCounterOffset(amalthea);
	}

	@Check(constraint = "ServerCallServerRunnableConstraint", categories = { "TAConstraint" })
	public void checkServerCallServerRunnable(final Amalthea amalthea) {
		this.softwareModelValidatorImpl.checkServerCallServerRunnable(amalthea);
	}

}
