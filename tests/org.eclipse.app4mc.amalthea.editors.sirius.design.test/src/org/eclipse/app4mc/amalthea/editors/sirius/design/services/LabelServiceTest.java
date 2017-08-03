/*********************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class LabelServiceTest {

	private LabelService labelS = null;
	private Label label = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.labelS = new LabelService();
		this.label = AmaltheaFactory.eINSTANCE.createLabel();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.labelS = null;
		this.label = null;
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getRunnablesFromLabelAccesses(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromLabelAccessesNull() {
		List<Runnable> result = this.labelS.getRunnablesFromLabelAccesses(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getRunnablesFromLabelAccesses(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromLabelAccessesEmptyAccesses() {
		List<Runnable> result = this.labelS.getRunnablesFromLabelAccesses(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getRunnablesFromLabelAccesses(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromLabelAccessesOneAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getRunnablesFromLabelAccesses(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(runnable));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getReadAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetReadAccessRunnableForLabelNull() {
		List<Runnable> result = this.labelS.getReadAccessRunnableForLabel(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getReadAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetReadAccessRunnableForLabelEmptyAccesses() {
		List<Runnable> result = this.labelS.getReadAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getReadAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetReadAccessRunnableForLabelReadAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.READ);
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getReadAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(runnable));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getReadAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetReadAccessRunnableForLabelWriteAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getReadAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getReadAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetReadAccessRunnableForLabelUndefinedAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getReadAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getWriteAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetWriteAccessRunnableForLabelNull() {
		List<Runnable> result = this.labelS.getWriteAccessRunnableForLabel(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getWriteAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetWriteAccessRunnableForLabelEmptyAccesses() {
		List<Runnable> result = this.labelS.getWriteAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getWriteAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetWriteAccessRunnableForLabelReadAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.READ);
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getWriteAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getWriteAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetWriteAccessRunnableForLabelWriteAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getWriteAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(runnable));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getWriteAccessRunnableForLabel(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetWriteAccessRunnableForLabelUndefinedAccesses() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum._UNDEFINED_);
		la.setData(this.label);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.labelS.getWriteAccessRunnableForLabel(this.label);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

}
