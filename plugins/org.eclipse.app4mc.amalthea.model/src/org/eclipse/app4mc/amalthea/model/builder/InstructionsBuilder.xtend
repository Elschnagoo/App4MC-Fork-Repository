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

package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Deviation
import org.eclipse.app4mc.amalthea.model.Group
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.LongObject
import org.eclipse.app4mc.amalthea.model.ModeSwitchDefault
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.Scheduler
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil

class InstructionsBuilder {

	// ********** Runnable Items - Execution Need **********

	def execNeed_default_Instructions(Runnable container, long instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.runnableItems += obj
	}

	def execNeed_default_Instructions(Runnable container, Deviation<LongObject> instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.runnableItems += obj
	}

	def execNeed_default_Instructions(Group container, long instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}
	def execNeed_default_Instructions(Group container, Deviation<LongObject> instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	def execNeed_default_Instructions(ModeSwitchDefault<RunnableItem> container, long instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	def execNeed_default_Instructions(ModeSwitchDefault<RunnableItem> container, Deviation<LongObject> instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	def execNeed_default_Instructions(ModeSwitchEntry<RunnableItem> container, long instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	def execNeed_default_Instructions(ModeSwitchEntry<RunnableItem> container, Deviation<LongObject> instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	def execNeed_default_Instructions(ProbabilitySwitchEntry<RunnableItem> container, long instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	def execNeed_default_Instructions(ProbabilitySwitchEntry<RunnableItem> container, Deviation<LongObject> instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.items += obj
	}

	// ********** Computation Items - Execution Need **********

	def execNeed_default_Instructions(Scheduler container, long instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.computationItems += obj
	}

	def execNeed_default_Instructions(Scheduler container, Deviation<LongObject> instructions) {
		val obj = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.computationItems += obj
	}

	// ********** Hardware Feature Category **********

	def featureCategory_Instructions(HWModel container, (HwFeatureCategory)=>void initializer) {
		val obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory()
		container.featureCategories += obj
		obj.name = InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME
		obj.init(initializer)
	}

	// ********** private **********

	def private <T> T init(T obj, (T)=>void init) {
		init.apply(obj)
		return obj
	}

}