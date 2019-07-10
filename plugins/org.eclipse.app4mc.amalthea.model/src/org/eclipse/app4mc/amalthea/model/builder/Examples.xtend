/**
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 */

package org.eclipse.app4mc.amalthea.model.builder

import org.eclipse.app4mc.amalthea.model.DataSizeUnit
import org.eclipse.app4mc.amalthea.model.FrequencyDomain
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.HwFeature
import org.eclipse.app4mc.amalthea.model.HwFeatureType
import org.eclipse.app4mc.amalthea.model.LimitType
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.StructureType
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.TimeMetric

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter

class Examples {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension CommonElementsBuilder b2 = new CommonElementsBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	extension DatatypeBuilder b4 = new DatatypeBuilder
	extension OperatingSystemBuilder b5 = new OperatingSystemBuilder
	extension HardwareBuilder b6 = new HardwareBuilder
	extension ConstraintsBuilder b7 = new ConstraintsBuilder
	extension MappingBuilder b8 = new MappingBuilder

	def static void main(String[] args) {
		val model1 = (new Examples).model1()
		AmaltheaWriter.writeToFileNamed(model1, "C:/temp/ExampleModel-gen.amxmi")
	}

	def static runtimeModel1() {
		(new Examples).model1()
	}

	def model1() {
		val model = amalthea [

			commonElements [
				tag [ name = "Optional" _reg("tag1")]
				tag [ name = "Standard" _reg("tag2")]
				
				coreClassifier [ name = "LockStep" _reg("cc1") ]
				coreClassifier [ name = "FPU" _reg("cc2") ]
				
				memoryClassifier [ name = "DDR3" _reg("mc1") ]
			]

			hardwareModel [
				// ***** Features *****
				featureCategory [
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
				typeDefinition_BaseType [
					name = "Boolean" size = createDataSize(8, DataSizeUnit::BIT)
					alias [ target = "AR" alias = "Boolean" ]
					alias [ target = "C" alias = "bool" ]
				]
				
				runnable [
					name = "r1"
					callGraph [
						ticks [ defaultConstant(500) ]
					]
				]
				runnable [
					name = "r2"
					callGraph [
						ticks [ defaultConstant(2000) ]
					]
				]
				task [
					name = "t1"
					callGraph [
						runnableCall [runnable = _find(Runnable, "r1")]
					]
				]
				task [
					name = "t2"
					callGraph [
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

			constraintsModel [
				// deadline of runnable
				requirement_Runnable [
					runnable = _find(Runnable, "r1")
					limit_Time [ 
						metric = TimeMetric::RESPONSE_TIME
						limitType = LimitType::UPPER_LIMIT
						limitValue = createTime("1 ms")
					]
				]
				deadline_Process(_find(Task, "t2"), createTime("10 ms"))
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