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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.app4mc.amalthea.model.util.ModelUtil;
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
		Amalthea root = AmaltheaFactory.eINSTANCE.createAmalthea();
		SWModel sw = ModelUtil.getOrCreateSwModel(root);
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		sw.getRunnables().add(runnable);
		ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeed(25);
		runnable.getRunnableItems().add(execNeed);
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
		Amalthea root = AmaltheaFactory.eINSTANCE.createAmalthea();
		SWModel sw = ModelUtil.getOrCreateSwModel(root);
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		sw.getRunnables().add(runnable);
		ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeed(25);
		runnable.getRunnableItems().add(execNeed);
		List<Label> result = this.runnS.getLabelReadAccessesForRunnable(runnable);
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
		Amalthea root = AmaltheaFactory.eINSTANCE.createAmalthea();
		SWModel sw = ModelUtil.getOrCreateSwModel(root);
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		sw.getRunnables().add(runnable);
		ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeed(25);
		runnable.getRunnableItems().add(execNeed);
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
		List<Label> result = this.runnS.getLabelReadAccessesForRunnable(runnable);
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
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runnable);
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
		Runnable run1 = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable run2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.READ);
		la.setData(label);
		run1.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.READ);
		la2.setData(label);
		run2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(run1);
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
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		runnable.getRunnableItems().add(la);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(runnable);
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
		Runnable run1 = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable run2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.READ);
		la.setData(label);
		run1.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.WRITE);
		la2.setData(label);
		run2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(run1);
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
		Runnable run1 = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable run2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		la.setData(label);
		run1.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.WRITE);
		la2.setData(label);
		run2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(run1);
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
		Runnable run1 = AmaltheaFactory.eINSTANCE.createRunnable();
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		Runnable run2 = AmaltheaFactory.eINSTANCE.createRunnable();
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setAccess(LabelAccessEnum.WRITE);
		la.setData(label);
		run1.getRunnableItems().add(la);
		LabelAccess la2 = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la2.setAccess(LabelAccessEnum.READ);
		la2.setData(label);
		run2.getRunnableItems().add(la2);
		List<Runnable> result = this.runnS.getCommunicationForRunnable(run1);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(run2));
	}
	
}
