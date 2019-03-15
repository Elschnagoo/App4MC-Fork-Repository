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
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TimeUnit
import org.eclipse.app4mc.amalthea.model.util.ConstraintsUtil
import org.eclipse.app4mc.amalthea.models.ConstraintsModels
import org.junit.Before
import org.junit.Test

import static org.junit.Assert.assertEquals

class ConstraintsUtilsTest {
	Amalthea model
	Runnable run1
	Runnable run2
	Task task1

	@Before
	def void initalizeModel() {
		model = ConstraintsModels.createModel1()
		run1 = AmaltheaIndex.getElements(model, "Run1", Runnable).head
		run2 = AmaltheaIndex.getElements(model, "Run2", Runnable).head
		task1 = AmaltheaIndex.getElements(model, "Task1", Task).head
	}
	
	@Test
	def void testRunnableDeadline() {
		val deadline1 = ConstraintsUtil.getDeadline(run1);
		assertEquals(
			"testRunnableDeadline: null expected", null, deadline1);
		
		val deadline2 = ConstraintsUtil.getDeadline(run2, model.constraintsModel);
		assertEquals(
			"testRunnableDeadline: 80 ns expected", 80, deadline2.value.intValue);
		assertEquals(
			"testRunnableDeadline: 80 ns expected", TimeUnit::NS, deadline2.unit);
	}
	
	@Test
	def void testProcessDeadline() {
		val deadline3 = ConstraintsUtil.getDeadline(task1);
		assertEquals(
			"testProcessDeadline: 20 ms expected", 20, deadline3.value.intValue);
		assertEquals(
			"testProcessDeadline: 20 ms expected", TimeUnit::MS, deadline3.unit);

		val deadline4 = ConstraintsUtil.getDeadline(task1, model.constraintsModel);
		assertEquals(
			"testProcessDeadline: same result expected", deadline3, deadline4);
	}

}
