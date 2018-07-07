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

import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SearchElementsTest2 {


	private Amalthea model;

	@Before
	public void setUp() throws Exception {
		model = AmaltheaFactory.eINSTANCE.createAmalthea();
		model.setSwModel(AmaltheaFactory.eINSTANCE.createSWModel());
		model.setMappingModel(AmaltheaFactory.eINSTANCE.createMappingModel());
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testFindLabels() {
		//create labels
		Label label0 = AmaltheaFactory.eINSTANCE.createLabel();
		label0.setName("d0");
		model.getSwModel().getLabels().add(label0);
		Label label1 = AmaltheaFactory.eINSTANCE.createLabel();
		label1.setName("d1");
		model.getSwModel().getLabels().add(label1);

		//create runnable
		 Runnable runnable0 = AmaltheaFactory.eINSTANCE.createRunnable();
		 runnable0.setName("r0");
		 
		 model.getSwModel().getRunnables().add(runnable0);
		 
		 for(int i=0;i<10;i++){
			 LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess();
			 la.setData(label0);
			 runnable0.getRunnableItems().add(la);
		 }
		 
		 Set<? extends Label> elementsBasedOnName = AmaltheaIndex.getElements(model, "d0", Label.class);
		 
		 assertEquals("Label d0 present in the model, but not found by search utility", 1, elementsBasedOnName.size());
		 
		 Set<? extends Label> elementsBasedOnRegex = AmaltheaIndex.getElements(model, Pattern.compile("d\\d"), Label.class);
		 
		 assertEquals("Label d0, d1 present in the model, but not found by search utility", 2, elementsBasedOnRegex.size());
		 
		 Set<? extends Label> elementsBasedOnType = AmaltheaIndex.getElements(model, Pattern.compile(".*"), Label.class);
		 
		 assertEquals("Label d0, d1 present in the model, but not found by search utility", 2, elementsBasedOnType.size());
		 
	}
	
 


}
