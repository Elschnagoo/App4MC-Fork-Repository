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
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.HWModelValidator;
import org.junit.Before;
import org.junit.Test;

public class HWModelValidatorTests {

	private HWModelValidatorImpl classUnderTest;

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
		this.classUnderTest = new HWModelValidatorImpl(this.issueCreator/*, this.eObjectHelper*/);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_unset() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.getQuartzes().add(quartz);
//
//		this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_null() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Frequency frequency = null;
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		quartz.setFrequency(frequency);
//		hwSystem.getQuartzes().add(quartz);
//
//		this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_negativeValue() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		frequency.setValue(-1000);
//		frequency.setUnit(FrequencyUnit.MHZ);
//		quartz.setFrequency(frequency);
//		hwSystem.getQuartzes().add(quartz);
//
//		this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_zeroValue() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.getQuartzes().add(quartz);	
//		frequency.setValue(0);
//		frequency.setUnit(FrequencyUnit.MHZ);		
//		quartz.setFrequency(frequency);
//
//		this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_positiveValue() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.getQuartzes().add(quartz);	
//		frequency.setValue(1000);
//		frequency.setUnit(FrequencyUnit.MHZ);
//		quartz.setFrequency(frequency);
//
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_unsetValue() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.getQuartzes().add(quartz);
//		frequency.setUnit(FrequencyUnit.MHZ);
//
//		this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzFrequency_undefinedUnit() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		frequency.setValue(10);
//		frequency.setUnit(FrequencyUnit._UNDEFINED_);
//		quartz.setFrequency(frequency);
//		hwSystem.getQuartzes().add(quartz);
//
//		this.issueCreator.issue(quartz, AmaltheaPackage.eINSTANCE.getQuartz_Frequency());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzFrequency(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreTypeInstructionsPerCycle_negative() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final CoreType coreType = AmaltheaFactory.eINSTANCE.createCoreType();
//		final float instructionsPerCycle = -2f;
//
//		amalthea.setHwModel(hwModel);
//		hwModel.getCoreTypes().add(coreType);
//		coreType.setInstructionsPerCycle(instructionsPerCycle);
//
//		this.issueCreator.issue(coreType, AmaltheaPackage.eINSTANCE.getCoreType_InstructionsPerCycle(), instructionsPerCycle);
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkCoreTypeInstructionsPerCycle(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreTypeInstructionsPerCycle_zero() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final CoreType coreType = AmaltheaFactory.eINSTANCE.createCoreType();
//		final float instructionsPerCycle = 0f;
//
//		amalthea.setHwModel(hwModel);
//		hwModel.getCoreTypes().add(coreType);
//		coreType.setInstructionsPerCycle(instructionsPerCycle);
//
//		this.issueCreator.issue(coreType, AmaltheaPackage.eINSTANCE.getCoreType_InstructionsPerCycle(), instructionsPerCycle);
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkCoreTypeInstructionsPerCycle(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzFrequency(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreTypeInstructionsPerCycle_positive() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final CoreType coreType = AmaltheaFactory.eINSTANCE.createCoreType();
//		final float instructionsPerCycle = 2f;
//
//		amalthea.setHwModel(hwModel);
//		hwModel.getCoreTypes().add(coreType);
//		coreType.setInstructionsPerCycle(instructionsPerCycle);
//
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkCoreTypeInstructionsPerCycle(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzReferenceOfPrescaler(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzReferenceOfPrescaler_null() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Prescaler prescaler = AmaltheaFactory.eINSTANCE.createPrescaler();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.setPrescaler(prescaler);
//
//		this.issueCreator.issue(prescaler, AmaltheaPackage.eINSTANCE.getPrescaler_Quartz());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzReferenceOfPrescaler(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzReferenceOfPrescaler(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzReferenceOfPrescaler_notExisting() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Prescaler prescaler = AmaltheaFactory.eINSTANCE.createPrescaler();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.setPrescaler(prescaler);
//		prescaler.setQuartz(quartz);
//
//		this.issueCreator.issue(prescaler, AmaltheaPackage.eINSTANCE.getPrescaler_Quartz());
//		
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzReferenceOfPrescaler(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link HWModelValidator#checkQuartzReferenceOfPrescaler(AMALTHEA)}
	 */
	@Test
	public void test_checkQuartzReferenceOfPrescaler_Existing() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final Quartz quartz = AmaltheaFactory.eINSTANCE.createQuartz();
//		final Prescaler prescaler = AmaltheaFactory.eINSTANCE.createPrescaler();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.getQuartzes().add(quartz);
//		hwSystem.setPrescaler(prescaler);
//		prescaler.setQuartz(quartz);
//
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkQuartzReferenceOfPrescaler(amalthea);
//		
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
	
}
