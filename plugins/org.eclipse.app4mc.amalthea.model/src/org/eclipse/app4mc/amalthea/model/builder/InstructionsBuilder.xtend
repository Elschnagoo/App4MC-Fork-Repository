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
import org.eclipse.app4mc.amalthea.model.ExecutionNeed
import org.eclipse.app4mc.amalthea.model.HWModel
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.LongObject
import org.eclipse.app4mc.amalthea.model.Need
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.Scheduler
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil
import org.eclipse.emf.common.util.BasicEMap

class InstructionsBuilder {

	// ********** Execution Need (Runnable items) **********

	def default_Instructions(ExecutionNeed container, long instructions) {
		val need = FactoryUtil.createNeedConstant(instructions)
		container.^default.put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need)
		return need
	}

	def default_Instructions(ExecutionNeed container, Deviation<LongObject> instructions) {
		val need = FactoryUtil.createNeedDeviation(instructions)
		container.^default.put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need)
		return need
	}

	def extended_Instructions(ExecutionNeed container, ProcessingUnitDefinition puDef, long instructions) {
		val need = FactoryUtil.createNeedConstant(instructions)
		if (container.extended.containsKey(puDef) == false) {
			container.extended.put(puDef, new BasicEMap<String, Need>());
		}
		container.extended.get(puDef).put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need)
		return need
	}

	def extended_Instructions(ExecutionNeed container, ProcessingUnitDefinition puDef, Deviation<LongObject> instructions) {
		val need = FactoryUtil.createNeedDeviation(instructions)
		if (container.extended.containsKey(puDef) == false) {
			container.extended.put(puDef, new BasicEMap<String, Need>());
		}
		container.extended.get(puDef).put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need)
		return need
	}

	// ********** Execution Need (Computation Items) **********

	def execNeed_default_Instructions(Scheduler container, long instructions) {
		val execNeed = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.computationItems += execNeed
		return execNeed
	}

	def execNeed_default_Instructions(Scheduler container, Deviation<LongObject> instructions) {
		val execNeed = InstructionsUtil.createDefaultExecutionNeed(instructions)
		container.computationItems += execNeed
		return execNeed
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