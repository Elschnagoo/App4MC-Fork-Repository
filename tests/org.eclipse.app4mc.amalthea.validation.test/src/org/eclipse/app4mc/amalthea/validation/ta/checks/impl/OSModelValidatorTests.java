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
import org.eclipse.app4mc.amalthea.model.Component;
import org.eclipse.app4mc.amalthea.model.ComponentsModel;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.ta.checks.OSModelValidator;
import org.junit.Before;
import org.junit.Test;

public class OSModelValidatorTests {

	private OSModelValidatorImpl classUnderTest;

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
		this.classUnderTest = new OSModelValidatorImpl(this.issueCreator/*, this.eObjectHelper*/);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_InitialValue_Negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(-10);
		semaphore.setMaxValue(20);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_InitialValue());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_InitialValue_Zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(0);
		semaphore.setMaxValue(20);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_InitialValue_Positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(10);
		semaphore.setMaxValue(20);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_MaxValue_Negative() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(0);
		semaphore.setMaxValue(-10);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue());
		this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_MaxValue_Zero() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(0);
		semaphore.setMaxValue(0);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_MaxValue_Positive() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(0);
		semaphore.setMaxValue(10);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphore(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphore_InitialValue_GT_MaxValue() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphore.setInitialValue(2);
		semaphore.setMaxValue(1);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphore, AmaltheaPackage.eINSTANCE.getSemaphore_MaxValue());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphore(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}

	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_Components_NotExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ComponentsModel componentsModel = AmaltheaFactory.eINSTANCE.createComponentsModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Component component = AmaltheaFactory.eINSTANCE.createComponent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		componentsModel.getComponents().add(component);
		amalthea.setComponentsModel(componentsModel);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_Components_Invalid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ComponentsModel componentsModel = AmaltheaFactory.eINSTANCE.createComponentsModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Component component = AmaltheaFactory.eINSTANCE.createComponent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		component.getSemaphores().add(semaphore);
		componentsModel.getComponents().add(component);
		amalthea.setComponentsModel(componentsModel);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(component, AmaltheaPackage.eINSTANCE.getComponent_Semaphores());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_Components_Valid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final ComponentsModel componentsModel = AmaltheaFactory.eINSTANCE.createComponentsModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Component component = AmaltheaFactory.eINSTANCE.createComponent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		component.getSemaphores().add(semaphore);
		componentsModel.getComponents().add(component);
		amalthea.setComponentsModel(componentsModel);
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreEvent_NotExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		eventModel.getEvents().add(semaphoreEvent);
		amalthea.setEventModel(eventModel);
		
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Entity());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreEvent_Null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphoreEvent.setEntity(null);
		eventModel.getEvents().add(semaphoreEvent);
		amalthea.setEventModel(eventModel);
		
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Entity());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreEvent_Invalid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphoreEvent.setEntity(semaphore);
		eventModel.getEvents().add(semaphoreEvent);
		amalthea.setEventModel(eventModel);
		
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Entity());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreEvent_Valid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final EventModel eventModel = AmaltheaFactory.eINSTANCE.createEventModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final SemaphoreEvent semaphoreEvent = AmaltheaFactory.eINSTANCE.createSemaphoreEvent();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		
		semaphoreEvent.setEntity(semaphore);
		eventModel.getEvents().add(semaphoreEvent);
		amalthea.setEventModel(eventModel);
		
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreAccess_NotExisting() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		final SemaphoreAccess semaphoreAccess = AmaltheaFactory.eINSTANCE.createSemaphoreAccess();
		
		runnable.getRunnableItems().add(semaphoreAccess);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);
		
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphoreAccess, AmaltheaPackage.eINSTANCE.getSemaphoreAccess_Semaphore());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreAccess_Null() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		final SemaphoreAccess semaphoreAccess = AmaltheaFactory.eINSTANCE.createSemaphoreAccess();
		
		semaphoreAccess.setSemaphore(null);
		runnable.getRunnableItems().add(semaphoreAccess);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);
		
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphoreAccess, AmaltheaPackage.eINSTANCE.getSemaphoreAccess_Semaphore());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreAccess_Invalid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		final SemaphoreAccess semaphoreAccess = AmaltheaFactory.eINSTANCE.createSemaphoreAccess();
		
		semaphoreAccess.setSemaphore(semaphore);
		runnable.getRunnableItems().add(semaphoreAccess);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);
		
		amalthea.setOsModel(osModel);

		this.issueCreator.issue(semaphoreAccess, AmaltheaPackage.eINSTANCE.getSemaphoreAccess_Semaphore());

		EasyMock.expectLastCall().times(1);
		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
	
	/**
	 * Test for validation method {@link OSModelValidator#checkSemaphoreReferences(AMALTHEA)}
	 */
	@Test
	public void test_checkSemaphoreReferences_SemaphoreAccess_Valid() {
		// prepare
		final Amalthea amalthea = AmaltheaFactory.eINSTANCE.createAmalthea();
		final SWModel swModel = AmaltheaFactory.eINSTANCE.createSWModel();
		final OSModel osModel = AmaltheaFactory.eINSTANCE.createOSModel();
		final Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		final Semaphore semaphore = AmaltheaFactory.eINSTANCE.createSemaphore();
		final SemaphoreAccess semaphoreAccess = AmaltheaFactory.eINSTANCE.createSemaphoreAccess();
		
		semaphoreAccess.setSemaphore(semaphore);
		runnable.getRunnableItems().add(semaphoreAccess);
		swModel.getRunnables().add(runnable);
		amalthea.setSwModel(swModel);
		
		osModel.getSemaphores().add(semaphore);
		amalthea.setOsModel(osModel);

		EasyMock.replay(this.issueCreator);

		// test
		this.classUnderTest.checkSemaphoreReferences(amalthea);

		// evaluate
		EasyMock.verify(this.issueCreator);
	}
}
