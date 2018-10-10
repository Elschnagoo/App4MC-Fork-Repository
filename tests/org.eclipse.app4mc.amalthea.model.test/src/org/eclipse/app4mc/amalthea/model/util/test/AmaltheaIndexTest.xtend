/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util.test

import java.util.ArrayList
import java.util.List
import java.util.Set
import java.util.regex.Pattern
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex
import org.eclipse.app4mc.amalthea.model.Label
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.MappingModel
import org.eclipse.app4mc.amalthea.model.MemoryMapping
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.SWModel
import org.eclipse.app4mc.amalthea.model.util.ModelUtil
import org.eclipse.emf.ecore.EObject
import org.junit.After
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals

class AmaltheaIndexTest {

	@Before
	def void setUp() throws Exception {
	}

	@After
	def void tearDown() throws Exception {
	}


	@Test
	def void testIndexSearch() {
		val Amalthea model = createTestModel()

		val elementsBasedOnName = AmaltheaIndex.getElements(model, "d0", Label);
		assertEquals(
			"Label d0 present in the model, but not found by index search.", 1, elementsBasedOnName.size);

		val elementsBasedOnRegex = AmaltheaIndex.getElements(model, Pattern.compile("d\\d"), Label);
		assertEquals(
			"Label d0, d1 present in the model, but not found by index search.", 2, elementsBasedOnRegex.size);

		val elementsBasedOnType = AmaltheaIndex.getElements(model, Pattern.compile(".*"), Label);
		assertEquals(
			"Label d0, d1 present in the model, but not found by index search.", 2, elementsBasedOnType.size);
	}


	@Test
	def void testIndex() {
		val Amalthea model = createTestModel()

		/*---- Verification --*/
		var Set<? extends Label> labelsBasedOnName = AmaltheaIndex.getElements(model, "d0", Label)

		assertEquals(
			"Label d0 should be present in the model.", 1, labelsBasedOnName.size)

		/*---- Verification --*/
		var Set<? extends Runnable> runnablesBasedOnName = AmaltheaIndex.getElements(model, "r0", Runnable)
		assertEquals(
			"Runnable r0 should be present in the model.", 1, runnablesBasedOnName.size)

		// deletion of element from the model
		var List<EObject> elements_to_be_deleted = new ArrayList<EObject>()
		elements_to_be_deleted.addAll(AmaltheaIndex.getElements(model, "r0", Runnable))
		elements_to_be_deleted.addAll(AmaltheaIndex.getElements(model, Pattern.compile("d\\d"), Label))
		assertEquals(
			"Elements to delete should be runnable r0 and labels l0 and l1.", 3, elements_to_be_deleted.size())

		AmaltheaIndex.deleteAll(elements_to_be_deleted)

		/*---- Verification --*/
		runnablesBasedOnName = AmaltheaIndex.getElements(model, "r0", Runnable)
		assertEquals(
			"Runnable r0 is removed from the model..and it is not expected to be found as a part of the index.", 0, runnablesBasedOnName.size)

		labelsBasedOnName = AmaltheaIndex.getElements(model, "d0", Label)
		assertEquals(
			"Label d0 is removed from the model..and it is not expected to be found as a part of the index.", 0, labelsBasedOnName.size)
			
		labelsBasedOnName = AmaltheaIndex.getElements(model, "d1", Label)
		assertEquals(
			"Label d1 is removed from the model..and it is not expected to be found as a part of the index.", 0, labelsBasedOnName.size) 
	}


	@Test
	def void testRemoveAllLabels() {
		val Amalthea model = createTestModel()

		AmaltheaIndex.deleteAll(model.getSwModel().getLabels())

		assertEquals("Label d0 is not removed from model.", 0, AmaltheaIndex.getElements(model, "d0", Label).size)

		val runnable0 = AmaltheaIndex.getElements(model, "r0", Runnable).head
		val runnableItems = runnable0.runnableItems
		val filteredItems = runnableItems.filter [s | s instanceof LabelAccess && ((s as LabelAccess)).data !== null]

		assertEquals("Runnable runnable0 should not contain reference to Label in LabelAccess - as all labels are deleted.", 0, filteredItems.size) 
	}


	def private Amalthea createTestModel() {
		val Amalthea model = AmaltheaFactory.eINSTANCE.createAmalthea

		val SWModel sw = ModelUtil.getOrCreateSwModel(model)
		val MappingModel map = ModelUtil.getOrCreateMappingModel(model)

		// create labels
		val Label label0 = AmaltheaFactory.eINSTANCE.createLabel()
		label0.setName("d0")
		sw.getLabels().add(label0)
		val Label label1 = AmaltheaFactory.eINSTANCE.createLabel()
		label1.setName("d1")
		sw.getLabels().add(label1)

		// create runnable
		val Runnable runnable0 = AmaltheaFactory.eINSTANCE.createRunnable()
		runnable0.setName("r0")
		sw.getRunnables().add(runnable0)
		for (var int i = 0; i < 10; i++) {
			var LabelAccess la = AmaltheaFactory.eINSTANCE.createLabelAccess()
			la.setData(label0)
			runnable0.getRunnableItems().add(la) 
		}

		// create Mapping
		val MemoryMapping elementMapping=AmaltheaFactory.eINSTANCE.createMemoryMapping() 
		elementMapping.setAbstractElement(label0) 
		map.getMemoryMapping().add(elementMapping) 

		return model 
	}

}