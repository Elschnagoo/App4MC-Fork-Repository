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

package org.eclipse.app4mc.amalthea.models

import org.eclipse.app4mc.amalthea.model.FrequencyDomain
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.HwFeature
import org.eclipse.app4mc.amalthea.model.HwFeatureType
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.StructureType
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder
import org.eclipse.app4mc.amalthea.model.builder.InstructionsBuilder
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.Task

class RuntimeModels {

	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension HardwareBuilder b2 = new HardwareBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	extension InstructionsBuilder b4 = new InstructionsBuilder
	extension OperatingSystemBuilder b5 = new OperatingSystemBuilder
	extension MappingBuilder b6 = new MappingBuilder

	def static void main(String[] args) {
		val model1 = (new RuntimeModels).model1()
		AmaltheaWriter.writeToFileNamed(model1, "test-data/RuntimeUtilTestModel-gen.amxmi")
	}

	def static runtimeModel1() {
		(new RuntimeModels).model1()
	}

	def model1() {
		val model = amalthea [

			hardwareModel [

				// ***** Features *****
				featureCategory_Instructions [
					featureType = HwFeatureType::PERFORMANCE
					feature [name = "IPC_1.2"; value = 1.2]
					feature [name = "IPC_0.8"; value = 0.8]
				]
				featureCategory [
					name = "MAC_Operations"
					feature [name = "MacUnit_factor"; value = 5.0]
				]

				// ***** Definitions *****
				definition_ProcessingUnit [
					name = "Pu1_def"
					features += _find(HwFeature, "IPC_1.2")
					features += _find(HwFeature, "MacUnit_factor")
				]
				definition_ProcessingUnit [
					name = "Pu2_def"
					features += _find(HwFeature, "IPC_0.8")
				]

				// ***** Domains *****
				domain_Frequency [
					name = "freq_Domain1"
					clockGating = false
					defaultValue = createFrequency(500, FrequencyUnit::MHZ)
				]

				// ***** Structures *****
				structure [
					name = "SoC"
					structureType = StructureType::SO_C

					module_ProcessingUnit [
						name = "core1"
						frequencyDomain = _find(FrequencyDomain, "freq_Domain1")
						definition = _find(ProcessingUnitDefinition, "Pu1_def")
					]
					module_ProcessingUnit [
						name = "core2"
						frequencyDomain = _find(FrequencyDomain, "freq_Domain1")
						definition = _find(ProcessingUnitDefinition, "Pu2_def")
					]
				]
			]

			softwareModel [
				runnable [
					name = "r1"
					execNeed [
						default_Instructions(500)
						extended_Instructions(_find(ProcessingUnitDefinition, "Pu2_def"), 800)
					]
					execNeed [default_Instructions(createDeviation(createGaussDistribution(500, 2), 250, 750))]
					execNeed [default_Need("MAC_Operations", createNeedConstant(2000))]
				]
				runnable [
					name = "r2"
					execNeed [default_Need("MAC_Operations", createNeedConstant(2000))]
				]
				task [
					name = "t1"
					callSequence [
						runnableCall [runnable = _find(Runnable, "r1")]
					]
				]
				task [
					name = "t2"
					callSequence [
						runnableCall [runnable = _find(Runnable, "r2")]
					]
				]
			]

			osModel [
				operatingSystem [
					name = "Os1"
					taskScheduler [name = "Scheduler1"]
					taskScheduler [name = "Scheduler2"]
				]
			]

			mappingModel [
				schedulerAllocation [
					scheduler = _find(TaskScheduler, "Scheduler2")
					responsibility += _find(ProcessingUnit, "core2")
					executingPU = _find(ProcessingUnit, "core2")
				]
				schedulerAllocation [
					scheduler = _find(TaskScheduler, "Scheduler1")
					responsibility += _find(ProcessingUnit, "core1")
					executingPU = _find(ProcessingUnit, "core1")
				]
				runnableAllocation [
					scheduler = _find(TaskScheduler, "Scheduler1")
					entity = _find(Runnable, "r1")
				]
				runnableAllocation [
					scheduler = _find(TaskScheduler, "Scheduler2")
					entity = _find(Runnable, "r2")
				]
				taskAllocation [
					task = _find(Task, "t1")
					scheduler = _find(TaskScheduler, "Scheduler1")
					affinity += _find(ProcessingUnit, "core1")
				]
				taskAllocation [
					task = _find(Task, "t2")
					scheduler = _find(TaskScheduler, "Scheduler2")
					affinity += _find(ProcessingUnit, "core2")
				]
			]
		]

		return model
	}
}
