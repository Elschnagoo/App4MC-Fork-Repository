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
 *     
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.util.ModelStaticCacheBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModelStaticCacheBuilderTest {

	private Amalthea model;
	private ModelStaticCacheBuilder modelStaticCacheBuilder;

	@Before
	public void setUp() throws Exception {
		model = AmaltheaFactory.eINSTANCE.createAmalthea();
		model.setSwModel(AmaltheaFactory.eINSTANCE.createSWModel());
		model.setMappingModel(AmaltheaFactory.eINSTANCE.createMappingModel());
		modelStaticCacheBuilder=new ModelStaticCacheBuilder(model);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testModelDynamicCacheBuilder() {
		// create labels
		Label label0 = AmaltheaFactory.eINSTANCE.createLabel();
		label0.setName("d0");
		model.getSwModel().getLabels().add(label0);
		Label label1 = AmaltheaFactory.eINSTANCE.createLabel();
		label1.setName("d1");
		model.getSwModel().getLabels().add(label1);

		/*---- Verification --*/
		List<?> elementsBasedOnName = modelStaticCacheBuilder.getElementsBasedOnName("d0", Label.class);
		assertEquals("Label d0 available in the cache - it is invalid as cache should not be loaded implicitly ",0, elementsBasedOnName.size());

		/*- based on creating fresh cache, model will be idexed again based on the names */
		
		modelStaticCacheBuilder =new ModelStaticCacheBuilder(model);
		
		elementsBasedOnName = modelStaticCacheBuilder.getElementsBasedOnName("d0", Label.class);
		assertEquals("Label d0 should be available in the cache - as the cache is recreated  ",1, elementsBasedOnName.size());

		 		
 	}

}
