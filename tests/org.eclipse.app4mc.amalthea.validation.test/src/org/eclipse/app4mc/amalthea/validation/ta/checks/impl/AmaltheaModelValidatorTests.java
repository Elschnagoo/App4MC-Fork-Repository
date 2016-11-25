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
import org.eclipse.app4mc.amalthea.model.BetaDistribution;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Periodic;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SignedTime;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.AmaltheaModelValidator;
import org.junit.Before;
import org.junit.Test;

public class AmaltheaModelValidatorTests {

	private AmaltheaModelValidatorImpl classUnderTest;

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
		this.classUnderTest = new AmaltheaModelValidatorImpl(this.issueCreator/*, this.eObjectHelper*/);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniqueName(AMALTHEA)}
	 */
	@Test
	public void test_checkUniqueName_nullNames() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Task taskA = fac.createTask();
		final Task taskB = fac.createTask();

		swModel.getTasks().add(taskA);
		swModel.getTasks().add(taskB);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(taskA, AmaltheaPackage.eINSTANCE.getIReferable_UniqueName(), taskA.getUniqueName());
		this.issueCreator.issue(taskB, AmaltheaPackage.eINSTANCE.getIReferable_UniqueName(), taskB.getUniqueName());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkUniqueName(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniqueName(AMALTHEA)}
	 */
	@Test
	public void test_checkUniqueName_nullNamesDifferentType() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Task task = fac.createTask();
		final Runnable runnable = fac.createRunnable();

		swModel.getTasks().add(task);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkUniqueName(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniqueName(AMALTHEA)}
	 */
	@Test
	public void test_checkUniqueName_ambiguousNames() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Task taskA = fac.createTask();
		final Task taskB = fac.createTask();

		taskA.setName("Task");
		taskB.setName("Task");
		swModel.getTasks().add(taskA);
		swModel.getTasks().add(taskB);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(taskA, AmaltheaPackage.eINSTANCE.getIReferable_UniqueName(), taskA.getUniqueName());
		this.issueCreator.issue(taskB, AmaltheaPackage.eINSTANCE.getIReferable_UniqueName(), taskB.getUniqueName());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkUniqueName(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniqueName(AMALTHEA)}
	 */
	@Test
	public void test_checkUniqueName_uniqueNames() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Task taskA = fac.createTask();
		final Task taskB = fac.createTask();

		taskA.setName("TaskA");
		taskB.setName("TaskB");
		swModel.getTasks().add(taskA);
		swModel.getTasks().add(taskB);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkUniqueName(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_InstructionsNull() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();

		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_Distribution());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_InstructionsInvalidBounds() {
		// prepare
		final AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createUniformDistribution();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();

		lowerBound.setValue(2);
		upperBound.setValue(1);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_InstructionsMissingBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createUniformDistribution();

		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_InstructionsMissingLowerBound() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createUniformDistribution();
		final LongObject upperBound = fac.createLongObject();

		upperBound.setValue(1);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_LowerBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_InstructionsMissingUpperBound() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createUniformDistribution();
		final LongObject lowerBound = fac.createLongObject();

		lowerBound.setValue(1);
		deviation.setLowerBound(lowerBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_InstructionsValidBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createUniformDistribution();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_StimulusNull() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();

		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_Distribution());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_StimulusInvalidBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();

		lowerBound.setValue(2);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(1);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_StimulusMissingBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();

		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_StimulusMissingLowerBound() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();
		final SignedTime upperBound = fac.createSignedTime();

		upperBound.setValue(1);
		upperBound.setUnit(TimeUnit.S);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_LowerBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_StimulusMissingUpperBound() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();
		final SignedTime lowerBound = fac.createSignedTime();

		lowerBound.setValue(2);
		lowerBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkDeviation(AMALTHEA)}
	 */
	@Test
	public void test_checkDeviation_StimulusValidBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkDeviation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkBetaDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkBetaDistribution_Invalid() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final BetaDistribution<SignedTime> distribution = fac.createBetaDistribution();
		final double alpha = -1;
		final double beta = -1;

		distribution.setAlpha(alpha);
		distribution.setBeta(beta);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getBetaDistribution_Alpha());
		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getBetaDistribution_Beta());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkBetaDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkBetaDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkBetaDistribution_AlphaUnset() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final BetaDistribution<SignedTime> distribution = fac.createBetaDistribution();
		final double beta = 1;

		distribution.setBeta(beta);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getBetaDistribution_Alpha());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkBetaDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkBetaDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkBetaDistribution_BetaUnset() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final BetaDistribution<SignedTime> distribution = fac.createBetaDistribution();
		final double alpha = 1;

		distribution.setAlpha(alpha);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getBetaDistribution_Beta());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkBetaDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniformDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkBetaDistribution_Valid() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final BetaDistribution<SignedTime> distribution = fac.createBetaDistribution();
		final double alpha = 1;
		final double beta = 1;

		distribution.setAlpha(alpha);
		distribution.setBeta(beta);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkBetaDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniformDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkUniformDistribution_Invalid() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();

		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_LowerBound());
		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_UpperBound());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkUniformDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkUniformDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkUniformDistribution_Valid() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createUniformDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkUniformDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_InstructionsNull() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createGaussDistribution();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_InstructionsMeanInvalidLower() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final GaussDistribution<LongObject> distribution = fac.createGaussDistribution();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject sd = fac.createLongObject();
		final LongObject mean = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(0);
		sd.setValue(1);
		distribution.setSd(sd);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_InstructionsMeanInvalidUpper() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final GaussDistribution<LongObject> distribution = fac.createGaussDistribution();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject sd = fac.createLongObject();
		final LongObject mean = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(3);
		sd.setValue(1);
		distribution.setSd(sd);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_InstructionsValidMean() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final GaussDistribution<LongObject> distribution = fac.createGaussDistribution();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject sd = fac.createLongObject();
		final LongObject mean = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(3);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(2);
		sd.setValue(1);
		distribution.setSd(sd);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_StimulusNull() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createGaussDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());
		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Sd());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_StimulusMeanInvalidLower() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final GaussDistribution<SignedTime> distribution = fac.createGaussDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();
		final SignedTime mean = fac.createSignedTime();
		final SignedTime sd = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		sd.setValue(1);
		sd.setUnit(TimeUnit.S);
		mean.setValue(0);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		distribution.setSd(sd);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_StimulusMeanInvalidUpper() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final GaussDistribution<SignedTime> distribution = fac.createGaussDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();
		final SignedTime mean = fac.createSignedTime();
		final SignedTime sd = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		sd.setValue(1);
		sd.setUnit(TimeUnit.S);
		mean.setValue(3);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		distribution.setSd(sd);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getGaussDistribution_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkGaussDistribution(AMALTHEA)}
	 */
	@Test
	public void test_checkGaussDistribution_StimulusValidMean() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final GaussDistribution<SignedTime> distribution = fac.createGaussDistribution();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();
		final SignedTime mean = fac.createSignedTime();
		final SignedTime sd = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(3);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		sd.setValue(1);
		sd.setUnit(TimeUnit.S);
		mean.setValue(2);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		distribution.setSd(sd);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkGaussDistribution(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullParameters(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullParameters_Null() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullParameters<LongObject> distribution = fac.createWeibullParameters();

		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullParameters(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullParameters(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullParameters_Invalid() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullParameters<LongObject> distribution = fac.createWeibullParameters();
		final double kappa = -1;
		final double lambda = -1;

		distribution.setKappa(kappa);
		distribution.setLambda(lambda);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullParameters_Kappa());
		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullParameters_Lambda());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullParameters(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullParameters(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullParameters_Valid() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullParameters<LongObject> distribution = fac.createWeibullParameters();
		final double kappa = 1;
		final double lambda = 1;

		distribution.setKappa(kappa);
		distribution.setLambda(lambda);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullParameters(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_InstructionsNull() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final Distribution<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_InstructionsMeanInvalidLower() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullEstimators<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject mean = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(0);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_InstructionsMeanInvalidUpper() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullEstimators<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject mean = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(3);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_InstructionsValidMean() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullEstimators<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject mean = fac.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(3);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(2);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_InstructionsMissingBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullEstimators<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject mean = fac.createLongObject();

		mean.setValue(2);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_StimulusNull() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final Distribution<SignedTime> distribution = fac.createWeibullEstimators();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_StimulusMeanInvalidLower() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final WeibullEstimators<SignedTime> distribution = fac.createWeibullEstimators();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();
		final SignedTime mean = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(0);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_StimulusMeanInvalidUpper() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final WeibullEstimators<SignedTime> distribution = fac.createWeibullEstimators();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();
		final SignedTime mean = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(2);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(3);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_Mean());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_StimulusValidMean() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final WeibullEstimators<SignedTime> distribution = fac.createWeibullEstimators();
		final SignedTime lowerBound = fac.createSignedTime();
		final SignedTime upperBound = fac.createSignedTime();
		final SignedTime mean = fac.createSignedTime();

		lowerBound.setValue(1);
		lowerBound.setUnit(TimeUnit.S);
		upperBound.setValue(3);
		upperBound.setUnit(TimeUnit.S);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(2);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_StimulusMissingBounds() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final StimuliModel stimuliModel = fac.createStimuliModel();
		final Periodic periodic = fac.createPeriodic();
		final Deviation<SignedTime> deviation = fac.createDeviation();
		final WeibullEstimators<SignedTime> distribution = fac.createWeibullEstimators();
		final SignedTime mean = fac.createSignedTime();

		mean.setValue(2);
		mean.setUnit(TimeUnit.S);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		periodic.setStimulusDeviation(deviation);
		stimuliModel.getStimuli().add(periodic);
		amalthea.setStimuliModel(stimuliModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_InvalidPRemainPromille() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullEstimators<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject mean = fac.createLongObject();
		final double pRemainPromille = -1;

		lowerBound.setValue(1);
		upperBound.setValue(3);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(2);
		distribution.setMean(mean);
		distribution.setPRemainPromille(pRemainPromille);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		this.issueCreator.issue(distribution, AmaltheaPackage.eINSTANCE.getWeibullEstimators_PRemainPromille());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link AmaltheaModelValidator#checkWeibullEstimators(AMALTHEA)}
	 */
	@Test
	public void test_checkWeibullEstimators_ValidPRemainPromille() {
		// prepare
		AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = fac.createAmalthea();
		final SWModel swModel = fac.createSWModel();
		final Runnable runnable = fac.createRunnable();
		final RunnableInstructions runInstr = fac.createRunnableInstructions();
		final InstructionsDeviation instructions = fac.createInstructionsDeviation();
		final Deviation<LongObject> deviation = fac.createDeviation();
		final WeibullEstimators<LongObject> distribution = fac.createWeibullEstimators();
		final LongObject lowerBound = fac.createLongObject();
		final LongObject upperBound = fac.createLongObject();
		final LongObject mean = fac.createLongObject();
		final double pRemainPromille = 1;

		lowerBound.setValue(1);
		upperBound.setValue(3);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(2);
		distribution.setMean(mean);
		distribution.setPRemainPromille(pRemainPromille);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runInstr.setDefault(instructions);
		runnable.getRunnableItems().add(runInstr);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
