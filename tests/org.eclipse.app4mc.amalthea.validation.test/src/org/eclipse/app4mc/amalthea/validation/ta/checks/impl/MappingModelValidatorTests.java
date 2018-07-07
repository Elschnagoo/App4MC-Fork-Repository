/**
 ********************************************************************************
 * Copyright (c) 2016 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 *  Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validation.ta.checks.impl;

import org.easymock.EasyMock;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.MappingModelValidator;
import org.junit.Before;
import org.junit.Test;

public class MappingModelValidatorTests {

	private MappingModelValidatorImpl classUnderTest;

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
		this.classUnderTest = new MappingModelValidatorImpl(this.issueCreator/*, this.eObjectHelper*/);
	}

	/**
	 * Test for validation method {@link MappingModelValidator#checkCoreReferenceOfCoreAllocation(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreReferenceOfCoreAllocation_null() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
//		final SchedulerAllocation allocation = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
//
//		amalthea.setMappingModel(mappingModel);
//		mappingModel.getSchedulerAllocation().add(allocation);
//
//		this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility());
//
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkCoreReferenceOfCoreAllocation(amalthea);
//
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link MappingModelValidator#checkCoreReferenceOfCoreAllocation(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreReferenceOfCoreAllocation_notExisting() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
//		final SchedulerAllocation allocation = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
//		final Core core = AmaltheaFactory.eINSTANCE.createCore();
//
//		amalthea.setMappingModel(mappingModel);
//		mappingModel.getSchedulerAllocation().add(allocation);
//		allocation.getResponsibility().add(core);
//
//		this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getSchedulerAllocation_Responsibility());
//
//		EasyMock.expectLastCall().times(1);
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkCoreReferenceOfCoreAllocation(amalthea);
//
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link MappingModelValidator#checkCoreReferenceOfCoreAllocation(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreReferenceOfCoreAllocation_existing() {
		// prepare
//		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
//		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
//		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
//		final ECU ecu = AmaltheaFactory.eINSTANCE.createECU();
//		final Microcontroller microcontroller = AmaltheaFactory.eINSTANCE.createMicrocontroller();
//
//		final Core core = AmaltheaFactory.eINSTANCE.createCore();
//		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
//		final SchedulerAllocation allocation = AmaltheaFactory.eINSTANCE.createSchedulerAllocation();
//
//		amalthea.setHwModel(hwModel);
//		hwModel.setSystem(hwSystem);
//		hwSystem.getEcus().add(ecu);
//		ecu.getMicrocontrollers().add(microcontroller);
//		microcontroller.getCores().add(core);
//
//		amalthea.setMappingModel(mappingModel);
//		mappingModel.getSchedulerAllocation().add(allocation);
//		allocation.getResponsibility().add(core);
//
//		EasyMock.replay(this.issueCreator);
//
//		// test
//		this.classUnderTest.checkCoreReferenceOfCoreAllocation(amalthea);
//
//		// evaluate
//		EasyMock.verify(this.issueCreator);
	}
}
