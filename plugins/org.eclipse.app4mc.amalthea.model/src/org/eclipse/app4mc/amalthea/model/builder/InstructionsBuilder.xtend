package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.Deviation
import org.eclipse.app4mc.amalthea.model.Group
import org.eclipse.app4mc.amalthea.model.HWModel
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
		container.runnableItems += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(Runnable container, Deviation<LongObject> instructions) {
		container.runnableItems += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(Group container, long instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}
	def execNeed_default_Instructions(Group container, Deviation<LongObject> instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(ModeSwitchDefault<RunnableItem> container, long instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(ModeSwitchDefault<RunnableItem> container, Deviation<LongObject> instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(ModeSwitchEntry<RunnableItem> container, long instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(ModeSwitchEntry<RunnableItem> container, Deviation<LongObject> instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(ProbabilitySwitchEntry<RunnableItem> container, long instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(ProbabilitySwitchEntry<RunnableItem> container, Deviation<LongObject> instructions) {
		container.items += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	// ********** Computation Items - Execution Need **********

	def execNeed_default_Instructions(Scheduler container, long instructions) {
		container.computationItems += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	def execNeed_default_Instructions(Scheduler container, Deviation<LongObject> instructions) {
		container.computationItems += InstructionsUtil.createDefaultExecutionNeed(instructions)
	}

	// ********** Hardware Feature Category **********

	def featureCategory_Instructions(HWModel container) {
		val category = AmaltheaFactory.eINSTANCE.createHwFeatureCategory()
		category.name = InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME
		container.featureCategories += category
	}

}