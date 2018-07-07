/**
 ********************************************************************************
 * Copyright (c) 2016-2018 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.ta.checks;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.impl.StimuliModelValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Performs basic validation checks which are explained in more detail below
 */
public class StimuliModelValidator extends AbstractCheckValidator implements IssueCreator {

	private final StimuliModelValidatorImpl stimuliModelValidator;

	public StimuliModelValidator() {
		super();
		this.stimuliModelValidator = new StimuliModelValidatorImpl(this);
	}

	public StimuliModelValidator(final boolean doNothing) {
		this.stimuliModelValidator = new StimuliModelValidatorImpl(this);
	}

	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}

	@Check(constraint = "PeriodicRecurrenceConstraint", categories = { "TAConstraint" })
	public void checkPeriodicRecurrence(final Amalthea amalthea) {
		this.stimuliModelValidator.checkPeriodicRecurrence(amalthea);
	}

	@Check(constraint = "VariableRateScenarioConstraint", categories = { "TAConstraint" })
	public void checkVariableRateScenario(final Amalthea amalthea) {
		this.stimuliModelValidator.checkVariableRateScenario(amalthea);
	}

	@Check(constraint = "ScenarioRecurrenceConstraint", categories = { "TAConstraint" })
	public void checkScenarioRecurrence(final Amalthea amalthea) {
		this.stimuliModelValidator.checkScenarioRecurrence(amalthea);
	}

	@Check(constraint = "ScenarioClockReferenceConstraint", categories = { "TAConstraint" })
	public void checkScenarioClock(final Amalthea amalthea) {
		this.stimuliModelValidator.checkScenarioClock(amalthea);
	}

	@Check(constraint = "ClockTriangleFunctionConstraint", categories = { "TAConstraint" })
	public void checkClockTriangleFunction(final Amalthea amalthea) {
		this.stimuliModelValidator.checkClockTriangleFunction(amalthea);
	}

	@Check(constraint = "ClockSinusFunctionConstraint", categories = { "TAConstraint" })
	public void checkClockSinusFunction(final Amalthea amalthea) {
		this.stimuliModelValidator.checkClockSinusFunction(amalthea);
	}

	@Check(constraint = "ClockMultiplierListConstraint", categories = { "TAConstraint" })
	public void checkClockMultiplierList(final Amalthea amalthea) {
		this.stimuliModelValidator.checkClockMultiplierList(amalthea);
	}
	
	@Check(constraint = "PeriodicOffsetUnsigned", categories = { "TAConstraint" })
	public void checkPeriodicOffsetUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkPeriodicOffsetUnsigned(amalthea);
	}
	
	@Check(constraint = "PeriodicRecurrenceUnsigned", categories = { "TAConstraint" })
	public void checkPeriodicRecurrenceUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkPeriodicRecurrenceUnsigned(amalthea);
	}
	
	@Check(constraint = "SyntheticOffsetUnsigned", categories = { "TAConstraint" })
	public void checkSyntheticOffsetUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkSyntheticOffsetUnsigned(amalthea);
	}
	
	@Check(constraint = "SyntheticPeriodUnsigned", categories = { "TAConstraint" })
	public void checkSyntheticPeriodUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkSyntheticRecurrenceUnsigned(amalthea);
	}
	
	@Check(constraint = "TimestampListTimestampsUnsigned", categories = { "TAConstraint" })
	public void checkTimestampListTimestampsUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkSyntheticTimestampsUnsigned(amalthea);
	}
	
	@Check(constraint = "SingleActivationUnsigned", categories = { "TAConstraint" })
	public void checkSingleActivationUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkSingleOccurrenceUnsigned(amalthea);
	}
	
	@Check(constraint = "ArrivalCurveEntryLowerUnsigned", categories = { "TAConstraint" })
	public void checkArrivalCurveEntryLowerUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkArrivalCurveEntryLowerUnsigned(amalthea);
	}
	
	@Check(constraint = "ArrivalCurveEntryUpperUnsigned", categories = { "TAConstraint" })
	public void checkArrivalCurveEntryUpperUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkArrivalCurveEntryUpperUnsigned(amalthea);
	}
	
	@Check(constraint = "ClockTriangleFunctionPeriodUnsigned", categories = { "TAConstraint" })
	public void checkClockTriangleFunctionPeriodUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkClockTriangleFunctionPeriodUnsigned(amalthea);
	}
	
	@Check(constraint = "ClockSinusFunctionPeriodUnsigned", categories = { "TAConstraint" })
	public void checkClockSinusFunctionPeriodUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkClockSinusFunctionPeriodUnsigned(amalthea);
	}
	
	@Check(constraint = "ClockMultiplierListEntryTimeUnsigned", categories = { "TAConstraint" })
	public void checkClockMultiplierListEntryTimeUnsigned(final Amalthea amalthea) {
		this.stimuliModelValidator.checkClockMultiplierListEntryTimeUnsigned(amalthea);
	}
	
	@Check(constraint = "ModeValueProviderConstraint", categories = { "TAConstraint" })
	public void checkModeValueProviderConstraint(final Amalthea amalthea) {
		this.stimuliModelValidator.checkModeValueProviderConstraint(amalthea);
	}
}
