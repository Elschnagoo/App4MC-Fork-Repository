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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import java.util.Arrays;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.BasicCheckValidator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicValidationTests {

	private BasicCheckValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	private IEObjectHelper eObjectHelper;

	@Before
	public void setUp() {
		// DO NOT REMOVE for probably later usage!!
		//
		// /*
		// * Replace inner method call all existing 'AbstractCheckValidator.issue' methods
		// */
		// final Method[] issueMethods = methods(AbstractCheckValidator.class, "issue");
		// for (final Method method : issueMethods) {
		// replace(method).with(new InvocationHandler() {
		// @Override
		// public Object invoke(final Object proxy, final Method method, final Object[] args) throws Throwable {
		// ++BasicValidationTests.this.replacedMethodInvocationCnt;
		// if (args[0] instanceof EObject) {
		// BasicValidationTests.this.defectiveAmaltheaElement.add((EObject) args[0]);
		// }
		// // Parameter auswerten
		// return null;
		// }
		// });
		// }


		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		this.eObjectHelper = EasyMock.createMock(IEObjectHelper.class);

		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new BasicCheckValidatorImpl(this.issueCreator, this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link BasicCheckValidator#checkForCustomPropertyDuplicateKey(Amalthea)}
	 */
	@Test
	public void testCustomPropertyNoDuplicateKey() {
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = factory.createAmalthea();

		final SWModel swModel = factory.createSWModel();
		amalthea.setSwModel(swModel);

		final Label label = factory.createLabel();
		swModel.getLabels().add(label);

		// Add "custom properties" with different keys
		amalthea.getCustomProperties().put("SW", null);
		swModel.getCustomProperties().put("SW", null);
		label.getCustomProperties().put("custom1", null);
		label.getCustomProperties().put("custom2", null);


		EasyMock.expect(this.eObjectHelper.getAllInstancesAndInheritedOf(amalthea, IAnnotatable.class))
				.andReturn(Arrays.asList(amalthea, swModel, label));


		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		// Run test
		this.classUnderTest.checkForCustomPropertyDuplicateKey(amalthea);

		// Verify no calls on issue
		EasyMock.verify(this.issueCreator);
	}


	/**
	 * Test for validation method {@link BasicCheckValidator#checkForCustomPropertyDuplicateKey(Amalthea)}
	 */
	@SuppressWarnings("unchecked")
	@Test
	public void testCustomPropertyDuplicateKey() {
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = factory.createAmalthea();

		final SWModel swModel = factory.createSWModel();
		amalthea.setSwModel(swModel);

		final Label label = factory.createLabel();
		label.setName("TestLabel");
		swModel.getLabels().add(label);

		// Add "custom properties" with same keys
		amalthea.getCustomProperties().put("SW", null);
		swModel.getCustomProperties().put("SW", null);
		label.getCustomProperties().put("different", null);
		label.getCustomProperties().put("custom", null);

		// TODO Try to avoid test model creation like the following. Read in xmi instead.

		// use EMF reflection to create a CustomProperty
		final EObject prop = factory.create(AmaltheaPackage.eINSTANCE.getCustomProperty());
		prop.eSet(prop.eClass().getEStructuralFeature("key"), "custom");
		// use EMF reflection to add property with same name
		final EStructuralFeature propFeature = label.eClass()
				.getEStructuralFeature(AmaltheaPackage.LABEL__CUSTOM_PROPERTIES);
		((EList<EObject>) label.eGet(propFeature)).add(prop);


		EasyMock.expect(this.eObjectHelper.getName(label)).andReturn("TestLabel");
		EasyMock.expect(this.eObjectHelper.getClassName(label)).andReturn("Label");

		EasyMock.expect(this.eObjectHelper.getAllInstancesAndInheritedOf(amalthea, IAnnotatable.class))
				.andReturn(Arrays.asList(amalthea, swModel, label));

		this.issueCreator.issue(label, AmaltheaPackage.eINSTANCE.getCustomProperty_Key(), "Label", "TestLabel", "custom");

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		// Run test
		this.classUnderTest.checkForCustomPropertyDuplicateKey(amalthea);

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link BasicCheckValidator#checkWeibullParameters(AMALTHEA)}
	 */
	@Test
	public void testWeiblullParametersGood() {
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = factory.createAmalthea();
		final SWModel swModel = factory.createSWModel();
		final Runnable runnable = factory.createRunnable();
		final Deviation<LongObject> deviation = factory.createDeviation();
		final ExecutionNeed execNeed = InstructionsUtil.createExecutionNeedDeviation(deviation);

		final LongObject lower = factory.createLongObject();
		final LongObject upper = factory.createLongObject();

		final WeibullEstimators<LongObject> weibullEstimator = factory.createWeibullEstimators();
		final LongObject mean = factory.createLongObject();

		// Stick/Put AMALTHEA elements together
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(execNeed);

		deviation.setLowerBound(lower);
		deviation.setUpperBound(upper);
		lower.setValue(72000);
		upper.setValue(88000);
		deviation.setDistribution(weibullEstimator);
		weibullEstimator.setMean(mean);
		mean.setValue(80000);


		EasyMock.replay(this.issueCreator);

		// Values (lower,upper,mean) taken from democar example; see inside Runnable "ABSCalculation"
		// Run test
		this.classUnderTest.checkWeibullParameters(amalthea);

		// Verify no call on issueCreator
		EasyMock.verify(this.issueCreator);


		final Runnable run = amalthea.getSwModel().getRunnables().get(0);
		final ExecutionNeed en = (ExecutionNeed) run.getRunnableItems().get(0);
		final Deviation<LongObject> dev = InstructionsUtil.getNeedDeviation(en);
		final long meanValue = ((WeibullEstimators<LongObject>) dev.getDistribution()).getMean().getValue();

		Assert.assertEquals(dev.getLowerBound().getValue(), 72000);
		Assert.assertEquals(dev.getUpperBound().getValue(), 88000);
		Assert.assertEquals(meanValue, 80000);

		Assert.assertTrue(dev.getLowerBound().getValue() < meanValue);
		Assert.assertTrue(meanValue < dev.getUpperBound().getValue());
	}


	/**
	 * Test for validation method {@link BasicCheckValidator#checkWeibullParameters(AMALTHEA)}
	 */
	@Test
	public void testWeiblullParametersBad() {
		final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
		final Amalthea amalthea = factory.createAmalthea();
		final SWModel swModel = factory.createSWModel();
		final Runnable runnable = factory.createRunnable();
		final Deviation<LongObject> deviation = factory.createDeviation();
		final ExecutionNeed execNeed = InstructionsUtil.createExecutionNeedDeviation(deviation);

		final LongObject lower = factory.createLongObject();
		final LongObject upper = factory.createLongObject();

		final WeibullEstimators<LongObject> weibullEstimator = factory.createWeibullEstimators();
		final LongObject mean = factory.createLongObject();

		// Stick/Put AMALTHEA elements together
		amalthea.setSwModel(swModel);
		swModel.getRunnables().add(runnable);
		runnable.getRunnableItems().add(execNeed);

		deviation.setLowerBound(lower);
		deviation.setUpperBound(upper);
		lower.setValue(88000);
		upper.setValue(88000);
		deviation.setDistribution(weibullEstimator);
		weibullEstimator.setMean(mean);
		mean.setValue(88000);

		this.issueCreator.issue(deviation, AmaltheaPackage.eINSTANCE.getDeviation_Distribution(), lower.getValue(),
				upper.getValue());

		EasyMock.expectLastCall().times(1);

		EasyMock.replay(this.issueCreator);

		// Run test
		this.classUnderTest.checkWeibullParameters(amalthea);

		EasyMock.verify(this.issueCreator);

		
		final Runnable run = amalthea.getSwModel().getRunnables().get(0);
		final ExecutionNeed en = (ExecutionNeed) run.getRunnableItems().get(0);
		final Deviation<LongObject> dev = InstructionsUtil.getNeedDeviation(en);
		final long meanValue = ((WeibullEstimators<LongObject>) dev.getDistribution()).getMean().getValue();

		Assert.assertEquals(dev.getLowerBound().getValue(), 88000);
		Assert.assertEquals(dev.getLowerBound().getValue(), dev.getUpperBound().getValue());
		Assert.assertEquals(dev.getLowerBound().getValue(), meanValue);
		Assert.assertEquals(dev.getUpperBound().getValue(), meanValue);
	}
}
