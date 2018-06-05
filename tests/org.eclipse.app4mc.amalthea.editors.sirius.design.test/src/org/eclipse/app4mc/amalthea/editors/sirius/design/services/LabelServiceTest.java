/*********************************************************************************
 *  Copyright (c) 2016-2018 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class LabelServiceTest {

	private LabelService labelService = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.labelService = new LabelService();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.labelService = null;
	}

	private SWModel createModelWithSWModel() {
		Amalthea model = AmaltheaFactory.eINSTANCE.createAmalthea();
		SWModel sw = AmaltheaFactory.eINSTANCE.createSWModel();
		model.setSwModel(sw);
		return sw;
	}
	
	private Runnable createRunnable(SWModel sw) {
		Runnable run = AmaltheaFactory.eINSTANCE.createRunnable();
		sw.getRunnables().add(run);
		return run;
	}
	
	private Label createLabel(SWModel sw) {
		Label label = AmaltheaFactory.eINSTANCE.createLabel();
		sw.getLabels().add(label);
		return label;
	}
	
	private LabelAccess createLabelAccess(Runnable run, Label label) {
		LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
		la.setData(label);
		run.getRunnableItems().add(la);
		return la;
	}
	
	
	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.LabelService#getRunnablesFromLabelAccesses(org.eclipse.app4mc.amalthea.model.Label)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromLabelAccessesNull() {
		List<Runnable> result = this.labelService.getRunnablesFromLabelAccesses(null);
		
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
		SWModel sw = createModelWithSWModel();
		Label label = createLabel(sw);
		
		List<Runnable> result = this.labelService.getRunnablesFromLabelAccesses(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		createLabelAccess(runnable, label);
		
		List<Runnable> result = this.labelService.getRunnablesFromLabelAccesses(label);
		
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
		List<Runnable> result = this.labelService.getReadAccessRunnableForLabel(null);
		
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
		SWModel sw = createModelWithSWModel();
		Label label = createLabel(sw);
		
		List<Runnable> result = this.labelService.getReadAccessRunnableForLabel(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		LabelAccess la = createLabelAccess(runnable, label);
		la.setAccess(LabelAccessEnum.READ);
		
		List<Runnable> result = this.labelService.getReadAccessRunnableForLabel(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		LabelAccess la = createLabelAccess(runnable, label);
		la.setAccess(LabelAccessEnum.WRITE);
		
		List<Runnable> result = this.labelService.getReadAccessRunnableForLabel(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		createLabelAccess(runnable, label);
		
		List<Runnable> result = this.labelService.getReadAccessRunnableForLabel(label);
		
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
		List<Runnable> result = this.labelService.getWriteAccessRunnableForLabel(null);
		
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
		SWModel sw = createModelWithSWModel();
		Label label = createLabel(sw);
		
		List<Runnable> result = this.labelService.getWriteAccessRunnableForLabel(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		LabelAccess la = createLabelAccess(runnable, label);
		la.setAccess(LabelAccessEnum.READ);
		
		List<Runnable> result = this.labelService.getWriteAccessRunnableForLabel(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		LabelAccess la = createLabelAccess(runnable, label);
		la.setAccess(LabelAccessEnum.WRITE);
				
		List<Runnable> result = this.labelService.getWriteAccessRunnableForLabel(label);
		
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
		SWModel sw = createModelWithSWModel();
		Runnable runnable = createRunnable(sw);
		Label label = createLabel(sw);
		createLabelAccess(runnable, label);
		
		List<Runnable> result = this.labelService.getWriteAccessRunnableForLabel(label);
		
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

}
