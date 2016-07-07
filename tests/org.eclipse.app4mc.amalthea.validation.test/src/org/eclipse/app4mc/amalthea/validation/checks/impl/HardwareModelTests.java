/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ECUType;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.StringObject;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.junit.Before;
import org.junit.Test;

public class HardwareModelTests {
	private HardwareModelCheckValidatorImpl classUnderTest;

	private IssueCreator issueCreator;

	private IEObjectHelper eObjectHelper;

	@Before
	public void setUp() {

		/*
		 * Create mock of dependency class
		 */
		this.issueCreator = EasyMock.createMock(IssueCreator.class);
		this.eObjectHelper = EasyMock.createMock(IEObjectHelper.class);

		/*
		 * Create object from class to be tested
		 */
		this.classUnderTest = new HardwareModelCheckValidatorImpl(this.issueCreator, this.eObjectHelper);
	}


	/*
	 * Adding attributes to AMALTHEA HwModel elements of type 'AbstractionTypeDescription' e.g. ECUType
	 *
	 * HwModel --> ECUType --> Attributes
	 */

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Attributes_NoDuplicatesSameType() {

		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		ecuType.setName("test_ECUType_name");

		final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();

		hwModel.getEcuTypes().add(ecuType);
		ecuType.getCustomProperties().put("test_StrValue1_name", strVal1);
		ecuType.getCustomProperties().put("test_StrValue2_name", strVal2);

		EasyMock.replay(this.issueCreator);
		EasyMock.replay(this.eObjectHelper);

		this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);

		EasyMock.verify(this.issueCreator);
		EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Attributes_NoDuplicatesAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_value1_name");
		//
		// final IntegerObject intVal = AmaltheaFactory.eINSTANCE.createIntegerObject();
		// intVal.setValue("test_value2_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getAttribute().add(strVal1);
		// ecuType.getAttribute().add(intVal);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Attributes_DuplicateNameSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getAttribute().add(strVal1);
		// ecuType.getAttribute().add(strVal2);
		//
		// this.issueCreator.issue(ecuType, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, ecuType.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(ecuType)).andReturn(ecuType.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Attributes_DuplicateNameAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_StrValue_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getAttribute().add(strVal1);
		// ecuType.getAttribute().add(intVal);
		//
		// this.issueCreator.issue(ecuType, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, ecuType.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(ecuType)).andReturn(ecuType.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Attributes_NoDuplicateNameAddAttributeTwice() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getAttribute().add(strVal1);
		// ecuType.getAttribute().add(strVal1);
		//
		// /*
		// * Adding 'strVal1' will not raise an issue at validator's side because EMF avoids having identical elements
		// in
		// * its EObjectList
		// */
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/*
	 * Adding attributes to AMALTHEA HwModel elements of type 'AbstractionTypeDescription' e.g. ECUType
	 *
	 * HwModel --> System --> Attributes
	 */

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Attributes_NoDuplicatesSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue1_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue2_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getAttribute().add(strVal1);
		// system.getAttribute().add(strVal2);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Attributes_NoDuplicatesAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_value1_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_value2_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getAttribute().add(strVal1);
		// system.getAttribute().add(intVal);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Attributes_DuplicateNameSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getAttribute().add(strVal1);
		// system.getAttribute().add(strVal2);
		//
		// this.issueCreator.issue(system, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, system.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(system)).andReturn(system.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Attributes_DuplicateNameAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_StrValue_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getAttribute().add(strVal1);
		// system.getAttribute().add(intVal);
		//
		// this.issueCreator.issue(system, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, system.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(system)).andReturn(system.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Attributes_NoDuplicateNameAddAttributeTwice() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getAttribute().add(strVal1);
		// system.getAttribute().add(strVal1);
		//
		// /*
		// * Adding 'strVal1' will not raise an issue at validator's side because EMF avoids having identical elements
		// in
		// * its EObjectList
		// */
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/*
	 * Adding features to AMALTHEA HwModel elements of type 'AbstractionTypeDescription' e.g. ECUType
	 *
	 * HwModel --> ECUType --> Features
	 */

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Features_NoDuplicatesSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue1_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue2_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getFeatures().add(strVal1);
		// ecuType.getFeatures().add(strVal2);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Features_NoDuplicatesAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_value1_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_value2_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getFeatures().add(strVal1);
		// ecuType.getFeatures().add(intVal);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Features_DuplicateNameSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getFeatures().add(strVal1);
		// ecuType.getFeatures().add(strVal2);
		//
		// this.issueCreator.issue(ecuType, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, ecuType.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(ecuType)).andReturn(ecuType.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Features_DuplicateNameAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_StrValue_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getFeatures().add(strVal1);
		// ecuType.getFeatures().add(intVal);
		//
		// this.issueCreator.issue(ecuType, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, ecuType.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(ecuType)).andReturn(ecuType.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testECUType_Features_NoDuplicateNameAddAttributeTwice() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final ECUType ecuType = AmaltheaFactory.eINSTANCE.createECUType();
		// ecuType.setName("test_ECUType_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		//
		// hwModel.getEcuTypes().add(ecuType);
		// ecuType.getFeatures().add(strVal1);
		// ecuType.getFeatures().add(strVal1);
		//
		// /*
		// * Adding 'strVal1' will not raise an issue at validator's side because EMF avoids having identical elements
		// in
		// * its EObjectList
		// */
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/*
	 * Adding features to AMALTHEA HwModel elements of type 'AbstractionTypeDescription' e.g. ECUType
	 *
	 * HwModel --> System --> Features
	 */

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Features_NoDuplicatesSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue1_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue2_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getFeatures().add(strVal1);
		// system.getFeatures().add(strVal2);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Features_NoDuplicatesAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_value1_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_value2_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getFeatures().add(strVal1);
		// system.getFeatures().add(intVal);
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}


	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Features_DuplicateNameSameType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final StringObject strVal2 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal2.setValue("test_StrValue_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getFeatures().add(strVal1);
		// system.getFeatures().add(strVal2);
		//
		// this.issueCreator.issue(system, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, system.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(system)).andReturn(system.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Features_DuplicateNameAltType() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final System system = AmaltheaFactory.eINSTANCE.createSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		// final IntValue intVal = AmaltheaFactory.eINSTANCE.createIntValue();
		// intVal.setName("test_StrValue_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getFeatures().add(strVal1);
		// system.getFeatures().add(intVal);
		//
		// this.issueCreator.issue(system, AmaltheaPackage.eInst.ABSTRACT_TYPE__NAME, system.getName());
		//
		// EasyMock.expect(this.eObjectHelper.getName(system)).andReturn(system.getName());
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

	/**
	 * Test for validation method {@link HardwareModelCheckValidatorImpl#checkForHwAttributesDuplicateName(hwModel)}
	 */
	@Test
	public void testSystem_Features_NoDuplicateNameAddAttributeTwice() {

		// final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		// final HwSystem system = AmaltheaFactory.eINSTANCE.createHwSystem();
		// system.setName("test_System_name");
		//
		// final StringObject strVal1 = AmaltheaFactory.eINSTANCE.createStringObject();
		// strVal1.setValue("test_StrValue_name");
		//
		//
		// hwModel.setSystem(system);
		// system.getFeatures().add(strVal1);
		// system.getFeatures().add(strVal1);
		//
		// /*
		// * Adding 'strVal1' will not raise an issue at validator's side because EMF avoids having identical elements
		// in
		// * its EObjectList
		// */
		//
		// EasyMock.replay(this.issueCreator);
		// EasyMock.replay(this.eObjectHelper);
		//
		// this.classUnderTest.checkForHwAbstractTypeDuplicateName(hwModel);
		//
		// EasyMock.verify(this.issueCreator);
		// EasyMock.verify(this.eObjectHelper);
	}

}
