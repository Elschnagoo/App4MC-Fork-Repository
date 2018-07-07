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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.MemoryMapping;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.util.DeleteElementsUtility;
import org.eclipse.app4mc.amalthea.model.util.ModelDynamicCacheBuilder;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModelDynamicCacheBuilderTest {

	private Amalthea model;
	private ModelDynamicCacheBuilder modelDynamicCacheBuilder;

	@Before
	public void setUp() throws Exception {
		model = AmaltheaFactory.eINSTANCE.createAmalthea();
		model.setSwModel(AmaltheaFactory.eINSTANCE.createSWModel());
		model.setMappingModel(AmaltheaFactory.eINSTANCE.createMappingModel());
		modelDynamicCacheBuilder=new ModelDynamicCacheBuilder(model);
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
		List<?> elementsBasedOnName = modelDynamicCacheBuilder.getElementsBasedOnName("d0", Label.class);
		assertEquals("Label d0 should already be present in the model.. ",1, elementsBasedOnName.size());

		// create runnable
		Runnable runnable0 = AmaltheaFactory.eINSTANCE.createRunnable();
		runnable0.setName("r0");

		model.getSwModel().getRunnables().add(runnable0);

		for (int i = 0; i < 10; i++) {
			LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
			la.setData(label0);
			runnable0.getRunnableItems().add(la);
		}
		
		
		/*---- Verification --*/
		elementsBasedOnName = modelDynamicCacheBuilder.getElementsBasedOnName("r0", Runnable.class);

		assertEquals("Runnable r0 should already be present in the model.. ",1, elementsBasedOnName.size());

		// create Mapping

		MappingModel mappingModel = model.getMappingModel();

		MemoryMapping elementMapping = AmaltheaFactory.eINSTANCE.createMemoryMapping();

		elementMapping.setAbstractElement(label0);

		mappingModel.getMemoryMapping().add(elementMapping);


		//deletion of element from the model
		
		List<EObject> elements_to_be_deleted=new ArrayList<EObject>();
		
		elements_to_be_deleted.add(runnable0);
		elements_to_be_deleted.add(label0);
		elements_to_be_deleted.add(label1);
		
		DeleteElementsUtility.deleteAll(elements_to_be_deleted, model);
		
		/*---- Verification --*/
		elementsBasedOnName = modelDynamicCacheBuilder.getElementsBasedOnName("r0", Runnable.class);

		assertEquals("Runnable r0 is removed from the model..and it is not expected to be found as a part of dynamic cache  ",0, elementsBasedOnName.size());
 
		elementsBasedOnName = modelDynamicCacheBuilder.getElementsBasedOnName("d0", Label.class);
		
		assertEquals("Label d0 is removed from the model..and it is not expected to be found as a part of dynamic cache  ",0, elementsBasedOnName.size());
		
		elementsBasedOnName = modelDynamicCacheBuilder.getElementsBasedOnName("d1", Label.class);
		
		assertEquals("Label d1 is removed from the model..and it is not expected to be found as a part of dynamic cache  ",0, elementsBasedOnName.size());
		
 	}

}
