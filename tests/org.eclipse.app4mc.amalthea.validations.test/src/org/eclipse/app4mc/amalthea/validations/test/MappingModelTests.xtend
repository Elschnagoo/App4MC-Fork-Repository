/**
 * *******************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.test

import java.util.List
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.ProcessingUnit
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition
import org.eclipse.app4mc.amalthea.model.Task
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder
import org.eclipse.app4mc.amalthea.model.builder.MappingBuilder
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.amalthea.validations.MappingProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.junit.Assert.assertTrue

class MappingModelTests {
	
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder
	extension OperatingSystemBuilder b3 = new OperatingSystemBuilder
	extension HardwareBuilder b4 = new HardwareBuilder
	extension MappingBuilder b5 = new MappingBuilder
	
	val executor = new ValidationExecutor( #[MappingProfile, EMFProfile] )

	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	def Amalthea createValidTestModel() {
		amalthea [
			softwareModel [
				task [ name = "TestTask" ]
			]
			hardwareModel [
				definition_ProcessingUnit [ name = "TestCoreDef" ]
				structure [
					name = "System"
					module_ProcessingUnit [
						name = "TestCore"
						definition = _find(ProcessingUnitDefinition, "TestCoreDef")
					]
				]
			]
			osModel [
				operatingSystem [ name = "TestOS"
					taskScheduler [ name = "TestScheduler" ]
				]
			]
			mappingModel [
				taskAllocation [
					task = _find(Task, "TestTask")
					scheduler = _find(TaskScheduler, "TestScheduler")
				]
				schedulerAllocation [
					scheduler = _find(TaskScheduler, "TestScheduler")
					responsibility += _find(ProcessingUnit, "TestCore")
				]
			]
		]
	}
	
	@Test
	def void testTaskToSchedulerToCoreMapping() {
		val model = createValidTestModel()
		
		val validationResult = validate(model)
		
		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.isEmpty)
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_UnmappedTasks() {
		val model = createValidTestModel()
		// add unmapped task
		model.swModel.task [ name = "TestTask_left"]
		
		val validationResult = validate(model)
		
		val result = validationResult.filter[it.severityLevel == Severity.WARNING].map[it.message].toList
		assertTrue(result.contains("Unmapped task found: \"TestTask_left\""))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_UnmappedScheduler() {
		val model = createValidTestModel()
		// add unmapped scheduler
		model.osModel.operatingSystems.head.taskScheduler [ name = "TestScheduler_left"]
		
		val validationResult = validate(model)
		
		val result = validationResult.filter[it.severityLevel == Severity.WARNING].map[it.message].toList
		assertTrue(result.contains("Scheduler not responsible for any core: \"TestScheduler_left\""))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_MissingSchedulerInTaskAlloc() {
		val model = createValidTestModel()
		// task allocation: remove reference to scheduler
		model.mappingModel.taskAllocation.head.scheduler = null
		
		val validationResult = validate(model)
		
		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("The required feature 'scheduler' of 'TaskAllocation' must be set"))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_MissingTaskInTaskAlloc() {
		val model = createValidTestModel()
		// task allocation: remove reference to task
		model.mappingModel.taskAllocation.head.task = null
		
		val validationResult = validate(model)
		
		val errors = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		val warnings = validationResult.filter[it.severityLevel == Severity.WARNING].map[it.message].toList
		
		assertTrue(errors.contains("The required feature 'task' of 'TaskAllocation' must be set"))
		assertTrue(warnings.contains("Unmapped task found: \"TestTask\""))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_MissingTaskAndSchedulerInTaskAlloc() {
		val model = createValidTestModel()
		// task allocation: remove references to scheduler and task
		model.mappingModel.taskAllocation.head.scheduler = null
		model.mappingModel.taskAllocation.head.task = null
		
		val validationResult = validate(model)
		
		val errors = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		val warnings = validationResult.filter[it.severityLevel == Severity.WARNING].map[it.message].toList
		
		assertTrue(errors.contains("The required feature 'scheduler' of 'TaskAllocation' must be set"))
		assertTrue(errors.contains("The required feature 'task' of 'TaskAllocation' must be set"))
		assertTrue(warnings.contains("Unmapped task found: \"TestTask\""))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_MissingSchedulerInSchedulerAlloc() {
		val model = createValidTestModel()
		// scheduler allocation: remove references to scheduler
		model.mappingModel.schedulerAllocation.head.scheduler = null
		
		val validationResult = validate(model)
		
		val errors = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		val warnings = validationResult.filter[it.severityLevel == Severity.WARNING].map[it.message].toList
		
		assertTrue(errors.contains("The required feature 'scheduler' of 'SchedulerAllocation' must be set"))
		assertTrue(warnings.contains("Scheduler not responsible for any core: \"TestScheduler\""))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_MissingCoreInSchedulerAlloc() {
		val model = createValidTestModel()
		// scheduler allocation: remove responsibilities
		model.mappingModel.schedulerAllocation.head.responsibility.clear
		
		val validationResult = validate(model)
		
		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("The feature 'responsibility' of 'SchedulerAllocation' with 0 values must have at least 1 values"))
	}

	@Test
	def void testTaskToSchedulerToCoreMapping_MissingSchedulerAndCoreInSchedulerAlloc() {
		val model = createValidTestModel()
		// scheduler allocation: remove references to scheduler and responsibilities
		model.mappingModel.schedulerAllocation.head.scheduler = null
		model.mappingModel.schedulerAllocation.head.responsibility.clear
		
		val validationResult = validate(model)
		
		val errors = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		val warnings = validationResult.filter[it.severityLevel == Severity.WARNING].map[it.message].toList
		
		assertTrue(errors.contains("The required feature 'scheduler' of 'SchedulerAllocation' must be set"))
		assertTrue(errors.contains("The feature 'responsibility' of 'SchedulerAllocation' with 0 values must have at least 1 values"))
		assertTrue(warnings.contains("Scheduler not responsible for any core: \"TestScheduler\""))
	}
}
