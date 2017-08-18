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
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class RunnableServiceTest {

	private RunnableService runnS = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.runnS = new RunnableService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.runnS = null;
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelWriteAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelWriteAccessesForRunnableNull() {
		List<Label> result = this.runnS.getLabelWriteAccessesForRunnable(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelWriteAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelWriteAccessesForRunnableEmpty() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		List<Label> result = this.runnS.getLabelWriteAccessesForRunnable(runnable);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelWriteAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelWriteAccessesForRunnableOneOtherRunnableItem() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		RunnableInstructions instr = AmaltheaFactory.eINSTANCE.createRunnableInstructions();
		runnable.getRunnableItems().add(instr);
		List<Label> result = this.runnS.getLabelWriteAccessesForRunnable(runnable);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelWriteAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelWriteAccessesForRunnableOneLabelWrite() {
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		LabelAccess labelA = AmaltheaFactory.eINSTANCE.createLabelAccess();
		labelA.setData(label);
		labelA.setAccess(LabelAccessEnum.WRITE);
		runnable.getRunnableItems().add(labelA);
		Label label2 = AmaltheaFactory.eINSTANCE.createLabel();
		LabelAccess labelA2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		labelA2.setData(label2);
		labelA2.setAccess(LabelAccessEnum.READ);
		runnable.getRunnableItems().add(labelA2);
		List<Label> result = this.runnS.getLabelWriteAccessesForRunnable(runnable);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(label));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelReadAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelReadAccessesForRunnableNull() {
		List<Label> result = this.runnS.getLabelReadAccessesForRunnable(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelReadAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelReadAccessesForRunnableEmpty() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		List<Label> result = this.runnS.getLabelReadAccessesForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelReadAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelReadAccessesForRunnableOtherItem() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		RunnableInstructions instr = AmaltheaFactory.eINSTANCE.createRunnableInstructions();
		runn.getRunnableItems().add(instr);
		List<Label> result = this.runnS.getLabelReadAccessesForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getLabelReadAccessesForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetLabelReadAccessesForRunnableOneReadItem() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		RunnableInstructions instr = AmaltheaFactory.eINSTANCE.createRunnableInstructions();
		runn.getRunnableItems().add(instr);
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		LabelAccess labelA = AmaltheaFactory.eINSTANCE.createLabelAccess();
		labelA.setData(label);
		labelA.setAccess(LabelAccessEnum.WRITE);
		runn.getRunnableItems().add(labelA);
		Label label2 = AmaltheaFactory.eINSTANCE.createLabel();
		LabelAccess labelA2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		labelA2.setData(label2);
		labelA2.setAccess(LabelAccessEnum.READ);
		runn.getRunnableItems().add(labelA2);
		List<Label> result = this.runnS.getLabelReadAccessesForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(label2));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableNull() {
		List<Runnable> result = this.runnS.getCommunicationForRunnable(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableEmpty() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableReadRead() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable runn2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.READ);
		la.setData(label);
		runn.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.READ);
		la2.setData(label);
		runn2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableEmptyRead() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		runn.getRunnableItems().add(la);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableReadWrite() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable runn2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.READ);
		la.setData(label);
		runn.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.WRITE);
		la2.setData(label);
		runn2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableWriteWrite() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable runn2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		la.setData(label);
		runn.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.WRITE);
		la2.setData(label);
		runn2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.RunnableService#getCommunicationForRunnable(org.eclipse.app4mc.amalthea.model.Runnable)}
	 * .
	 */
	@Test
	public void testGetCommunicationForRunnableWriteRead() {
		Runnable runn = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable runn2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		la.setData(label);
		runn.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.READ);
		la2.setData(label);
		runn2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runn);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(runn2));
	}
}
