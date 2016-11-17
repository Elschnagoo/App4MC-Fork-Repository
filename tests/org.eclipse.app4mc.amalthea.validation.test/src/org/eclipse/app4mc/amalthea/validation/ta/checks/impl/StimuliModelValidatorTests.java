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

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.StimuliModelValidator;
import org.junit.Before;
import org.junit.Test;

public class StimuliModelValidatorTests {

	private StimuliModelValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	@Before
	public void setUp() {
		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		// this.eObjectHelper = EasyMock.createMock(EObjectHelper.class);

		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new StimuliModelValidatorImpl(this.issueCreator/*, this.eObjectHelper*/);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicRecurrence_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Time recurrence = AmaltheaFactory.eINSTANCE.createTime();
		final int value = -10;
		final TimeUnit unit = TimeUnit.MS;

		amalthea.setStimuliModel(stimuliModel);
		stimuliModel.getStimuli().add(periodic);
		periodic.setRecurrence(recurrence);
		recurrence.setValue(value);
		recurrence.setUnit(unit);

		this.issueCreator.issue(periodic, AmaltheaPackage.eINSTANCE.getPeriodic_Recurrence(), value, unit);

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicRecurrence(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicRecurrence_zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Time recurrence = AmaltheaFactory.eINSTANCE.createTime();
		final int value = 0;
		final TimeUnit unit = TimeUnit.MS;

		amalthea.setStimuliModel(stimuliModel);
		stimuliModel.getStimuli().add(periodic);
		periodic.setRecurrence(recurrence);
		recurrence.setValue(value);
		recurrence.setUnit(unit);

		this.issueCreator.issue(periodic, AmaltheaPackage.eINSTANCE.getPeriodic_Recurrence(), value, unit);

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicRecurrence(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkPeriodicRecurrence_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Time recurrence = AmaltheaFactory.eINSTANCE.createTime();
		final int value = 10;
		final TimeUnit unit = TimeUnit.MS;

		amalthea.setStimuliModel(stimuliModel);
		stimuliModel.getStimuli().add(periodic);
		periodic.setRecurrence(recurrence);
		recurrence.setValue(value);
		recurrence.setUnit(unit);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkPeriodicRecurrence(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	// /**
	// * Test for validation method {@link StimuliModelValidator#checkClockReferenceOfPeriodic(AMALTHEA)}
	// */
	// @Test
	// public void test_checkClockReferenceOfPeriodic_null() {
	// // prepare
	// final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
	// final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
	// final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
	// final Time recurrence = AmaltheaFactory.eINSTANCE.createTime();
	// int value = 10;
	// TimeUnit unit = TimeUnit.MS;
	//
	// amalthea.setStimuliModel(stimuliModel);
	// stimuliModel.getStimuli().add(periodic);
	// periodic.setRecurrence(recurrence);
	// recurrence.setValue(value);
	// recurrence.setUnit(unit);
	//
	// EasyMock.replay(this.issueCreator);
	//
	// // test
	// this.classUnderTest.checkClockReferenceOfPeriodic(amalthea);
	//
	// // evaluate
	// EasyMock.verify(this.issueCreator);
	// }

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockReferenceOfPeriodic(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzReferenceOfPrescaler_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();

		amalthea.setStimuliModel(stimuliModel);
		stimuliModel.getStimuli().add(periodic);

		this.issueCreator.issue(periodic, AmaltheaPackage.eINSTANCE.getPeriodic_Clock());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockReferenceOfPeriodic(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockReferenceOfPeriodic(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzReferenceOfPrescaler_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Clock clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();

		amalthea.setStimuliModel(stimuliModel);
		stimuliModel.getStimuli().add(periodic);
		periodic.setClock(clock);

		this.issueCreator.issue(periodic, AmaltheaPackage.eINSTANCE.getPeriodic_Clock());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockReferenceOfPeriodic(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockReferenceOfPeriodic(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzReferenceOfPrescaler_Existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Clock clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();

		amalthea.setStimuliModel(stimuliModel);
		stimuliModel.getClocks().add(clock);
		stimuliModel.getStimuli().add(periodic);
		periodic.setClock(clock);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockReferenceOfPeriodic(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();

		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Max());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_minNegative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
		final int min = -1;

		clock.setMin(min);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Min());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_minPositive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
		final int min = 1;

		clock.setMin(min);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Max());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_maxNegative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
		final int max = -1;

		clock.setMax(max);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Max());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_maxPositive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
		final int max = 1;

		clock.setMax(max);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_minMaxIncorrect() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
		final int min = 2;
		final int max = 1;

		clock.setMin(min);
		clock.setMax(max);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockTriangleFunction_Min());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockTriangleFunctionConstraint_minMaxCorrect() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockTriangleFunction clock = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
		final int min = 1;
		final int max = 2;

		clock.setMin(min);
		clock.setMax(max);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockTriangleFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();

		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockSinusFunction_YOffset());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_amplitudeNegative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final int amplitude = -1;

		clock.setAmplitude(amplitude);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Amplitude());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_amplitudePositive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final int amplitude = 1;

		clock.setAmplitude(amplitude);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockSinusFunction_YOffset());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_yOffsetNegative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final int yOffset = -1;

		clock.setYOffset(yOffset);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockSinusFunction_YOffset());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_yOffsetPositive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final int yOffset = 1;

		clock.setYOffset(yOffset);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_amplitudeYOffsetIncorrect() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final int amplitude = 2;
		final int yOffset = 1;

		clock.setAmplitude(amplitude);
		clock.setYOffset(yOffset);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockSinusFunction_Amplitude());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockTriangleFunctionConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockSinusFunctionConstraint_amplitudeYOffsetCorrect() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockSinusFunction clock = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
		final int amplitude = 1;
		final int yOffset = 2;

		clock.setAmplitude(amplitude);
		clock.setYOffset(yOffset);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockSinusFunction(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockMultiplierListConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockMultiplierListConstraint_null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockMultiplierList clock = AmaltheaFactory.eINSTANCE.createClockMultiplierList();
		final ClockMultiplierListEntry entry = AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry();

		clock.getEntries().add(entry);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockMultiplierList(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockMultiplierListConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockMultiplierListConstraint_negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockMultiplierList clock = AmaltheaFactory.eINSTANCE.createClockMultiplierList();
		final ClockMultiplierListEntry entry = AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry();
		final double value = -1;

		entry.setMultiplier(value);
		clock.getEntries().add(entry);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(clock, AmaltheaPackage.eINSTANCE.getClockMultiplierListEntry_Multiplier());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockMultiplierList(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link StimuliModelValidator#checkClockMultiplierListConstraint(AMALTHEA)}
	 */
	@Test
	public void test_checkClockMultiplierListConstraint_positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final ClockMultiplierList clock = AmaltheaFactory.eINSTANCE.createClockMultiplierList();
		final ClockMultiplierListEntry entry = AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry();
		final double value = 1;

		entry.setMultiplier(value);
		clock.getEntries().add(entry);
		stimuliModel.getClocks().add(clock);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkClockMultiplierList(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
