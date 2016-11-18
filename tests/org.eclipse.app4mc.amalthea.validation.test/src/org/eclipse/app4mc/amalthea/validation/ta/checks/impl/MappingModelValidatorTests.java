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
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwSystem;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Microcontroller;
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
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		final CoreAllocation allocation = AmaltheaFactory.eINSTANCE.createCoreAllocation();

		amalthea.setMappingModel(mappingModel);
		mappingModel.getCoreAllocation().add(allocation);

		this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getCoreAllocation_Core());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCoreReferenceOfCoreAllocation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link MappingModelValidator#checkCoreReferenceOfCoreAllocation(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreReferenceOfCoreAllocation_notExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		final CoreAllocation allocation = AmaltheaFactory.eINSTANCE.createCoreAllocation();
		final Core core = AmaltheaFactory.eINSTANCE.createCore();

		amalthea.setMappingModel(mappingModel);
		mappingModel.getCoreAllocation().add(allocation);
		allocation.getCore().add(core);

		this.issueCreator.issue(allocation, AmaltheaPackage.eINSTANCE.getCoreAllocation_Core());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCoreReferenceOfCoreAllocation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link MappingModelValidator#checkCoreReferenceOfCoreAllocation(AMALTHEA)}
	 */
	@Test
	public void test_checkCoreReferenceOfCoreAllocation_existing() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final HWModel hwModel = AmaltheaFactory.eINSTANCE.createHWModel();
		final HwSystem hwSystem = AmaltheaFactory.eINSTANCE.createHwSystem();
		final ECU ecu = AmaltheaFactory.eINSTANCE.createECU();
		final Microcontroller microcontroller = AmaltheaFactory.eINSTANCE.createMicrocontroller();

		final Core core = AmaltheaFactory.eINSTANCE.createCore();
		final MappingModel mappingModel = AmaltheaFactory.eINSTANCE.createMappingModel();
		final CoreAllocation allocation = AmaltheaFactory.eINSTANCE.createCoreAllocation();

		amalthea.setHwModel(hwModel);
		hwModel.setSystem(hwSystem);
		hwSystem.getEcus().add(ecu);
		ecu.getMicrocontrollers().add(microcontroller);
		microcontroller.getCores().add(core);

		amalthea.setMappingModel(mappingModel);
		mappingModel.getCoreAllocation().add(allocation);
		allocation.getCore().add(core);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkCoreReferenceOfCoreAllocation(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
