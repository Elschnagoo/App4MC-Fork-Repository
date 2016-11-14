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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task taskA = AmaltheaFactory.eINSTANCE.createTask();
		final Task taskB = AmaltheaFactory.eINSTANCE.createTask();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task task = AmaltheaFactory.eINSTANCE.createTask();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task taskA = AmaltheaFactory.eINSTANCE.createTask();
		final Task taskB = AmaltheaFactory.eINSTANCE.createTask();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Task taskA = AmaltheaFactory.eINSTANCE.createTask();
		final Task taskB = AmaltheaFactory.eINSTANCE.createTask();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();

		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(2);
		upperBound.setValue(1);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();

		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();

		upperBound.setValue(1);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		deviation.setLowerBound(lowerBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final BetaDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createBetaDistribution();
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final BetaDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createBetaDistribution();
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final BetaDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createBetaDistribution();
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final BetaDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createBetaDistribution();
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createUniformDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final GaussDistribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject sd = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

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
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final GaussDistribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject sd = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

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
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final GaussDistribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject sd = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

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
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final GaussDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime sd = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final GaussDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime sd = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final GaussDistribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime sd = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullParameters<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullParameters();

		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullParameters<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullParameters();
		final double kappa = -1;
		final double lambda = -1;

		distribution.setKappa(kappa);
		distribution.setLambda(lambda);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullParameters<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullParameters();
		final double kappa = 1;
		final double lambda = 1;

		distribution.setKappa(kappa);
		distribution.setLambda(lambda);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(0);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(2);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(3);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

		lowerBound.setValue(1);
		upperBound.setValue(3);
		deviation.setLowerBound(lowerBound);
		deviation.setUpperBound(upperBound);
		mean.setValue(2);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();

		mean.setValue(2);
		distribution.setMean(mean);
		deviation.setDistribution(distribution);
		instructions.setDeviation(deviation);
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final Distribution<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final SignedTime lowerBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime upperBound = AmaltheaFactory.eINSTANCE.createSignedTime();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final StimuliModel stimuliModel = AmaltheaFactory.eINSTANCE.createStimuliModel();
		final Periodic periodic = AmaltheaFactory.eINSTANCE.createPeriodic();
		final Deviation<SignedTime> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<SignedTime> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final SignedTime mean = AmaltheaFactory.eINSTANCE.createSignedTime();

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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();
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
		runnable.getRunnableItems().add(instructions);
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final InstructionsDeviation instructions = AmaltheaFactory.eINSTANCE.createInstructionsDeviation();
		final Deviation<LongObject> deviation = AmaltheaFactory.eINSTANCE.createDeviation();
		final WeibullEstimators<LongObject> distribution = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		final LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		final LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();
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
		runnable.getRunnableItems().add(instructions);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkWeibullEstimators(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
