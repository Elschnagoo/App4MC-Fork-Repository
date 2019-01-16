/** 
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * SPDX-License-Identifier: EPL-2.0
 * Contributors:
 * Robert Bosch GmbH - initial API and implementation
 */
 
package org.eclipse.app4mc.amalthea.model.util.test

import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.Ticks
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil
import org.eclipse.app4mc.amalthea.models.SoftwareModels
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals

class SoftwareUtilsTest {
	Amalthea model
	Runnable run1
	Runnable run2
	Runnable run3
	Runnable run4

	@Before
	def void initalizeModel() {
		model = SoftwareModels.getModel1()
		run1 = AmaltheaIndex.getElements(model, "Run1", Runnable).head
		run2 = AmaltheaIndex.getElements(model, "Run2", Runnable).head
		run3 = AmaltheaIndex.getElements(model, "Run3", Runnable).head
		run4 = AmaltheaIndex.getElements(model, "Run4", Runnable).head
	}
	
	@Test
	def void testCollectRunnableItems() {
		val list1 = SoftwareUtil.collectRunnableItems(run1);
		assertEquals(
			"collectRunnableItems: 6 items expected", 6, list1.size);
		
		val list2 = SoftwareUtil.collectRunnableItems(run1, null, Ticks);
		assertEquals(
			"collectRunnableItems: 2 items (ticks) expected", 2, list2.size);
		
		val list3 = SoftwareUtil.collectRunnableItems(run1, null, LabelAccess, [i | i.access === LabelAccessEnum::READ]);
		assertEquals(
			"collectRunnableItems: 2 items (label accesses) expected", 2, list3.size);
		
		val list4 = SoftwareUtil.collectRunnableItems(run4);
		assertEquals(
			"collectRunnableItems: 1 item expected", 1, list4.size);
	}
	
	@Test
	def void testLabelAccessMethods() {
		val model = SoftwareModels.getModel2()
		val run1 = AmaltheaIndex.getElements(model, "Run1", Runnable).head
		
		val set1 = SoftwareUtil.getAccessedLabelSet(run1, null)
		val set2 = SoftwareUtil.getReadLabelSet(run1, null)
		val set3 = SoftwareUtil.getWriteLabelSet(run1, null)
		
		val list1 = SoftwareUtil.getLabelAccessList(run1, null)
		val list2 = SoftwareUtil.getReadLabelAccessList(run1, null)
		val list3 = SoftwareUtil.getWriteLabelAccessList(run1, null)
		
		val map = SoftwareUtil.getLabelToLabelAccessMap(run1, null)
		
		val map1 = SoftwareUtil.getLabelAccessStatisticsMap(run1, null)

		
		println("done.")
	}
	
}
