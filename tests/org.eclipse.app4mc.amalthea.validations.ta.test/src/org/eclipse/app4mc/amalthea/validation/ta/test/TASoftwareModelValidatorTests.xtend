/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validation.ta.test

import java.util.List
import java.util.stream.Collectors
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.EnumMode
import org.eclipse.app4mc.amalthea.model.InterruptController
import org.eclipse.app4mc.amalthea.model.ModeCondition
import org.eclipse.app4mc.amalthea.model.ModeConditionConjunction
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.OsEvent
import org.eclipse.app4mc.amalthea.model.RelationalOperator
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.TaskScheduler
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.junit.Test

import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class TASoftwareModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder
	extension OperatingSystemBuilder b3 = new OperatingSystemBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	def void modeCondition(ModeSwitchEntry container, Procedure1<ModeCondition> initializer) {
		if (container.condition === null) {
			container.condition = AmaltheaFactory.eINSTANCE.createModeConditionDisjunction
		}
		val obj = AmaltheaFactory.eINSTANCE.createModeCondition
		container.condition.entries += obj
		initializer.apply(obj)
	}
	
	def void modeConditionSingleConjunction(ModeSwitchEntry container, Procedure1<ModeCondition> initializer) {
		if (container.condition === null) {
			container.condition = AmaltheaFactory.eINSTANCE.createModeConditionDisjunction
			container.condition.entries += AmaltheaFactory.eINSTANCE.createModeConditionConjunction
		}
		val obj = AmaltheaFactory.eINSTANCE.createModeCondition
		var mcc = container.condition.entries.get(0) as ModeConditionConjunction
		mcc.entries += obj
		initializer.apply(obj)
	}
	
	@Test
	def void test_TASoftwareOsEvent() {
		val model = amalthea [
			softwareModel [
				osEvent [name = "ev_ok"]
				osEvent [name = "ev_wait"]
				task [
					name = "t1"
					callGraph [
						setEvent [eventMask(_find(OsEvent, "ev_ok"))]
						waitEvent [eventMask(_find(OsEvent, "ev_ok"))]
					]
				]
				task [
					name = "t2"
					callGraph [
						waitEvent [eventMask(_find(OsEvent, "ev_wait"))]
					]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Os Event \"ev_wait\" is waited upon, but it is never set."))
		assertFalse(result.contains("Os Event \"ev_ok\" is waited upon, but it is never set."))
	}
	
	@Test
	def void test_TASoftwareModeLabel() {
		val model = amalthea [
			softwareModel [
				mode_Enum[
					name = "enumerated"
					literal [name = "first"]
					literal [name = "second"]
				]
				modeLabel [name = "ml_ok" mode = _find(EnumMode, "enumerated") initialValue = "first"]
				modeLabel [name = "ml_notOk" mode = _find(EnumMode, "enumerated") initialValue = "third"]
				modeLabel [name = "ml_okok" mode = _find(EnumMode, "enumerated")]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The initial value \"third\" in Mode Label \"ml_notOk\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The initial value \"first\" in Mode Label \"ml_ok\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The initial value \"\" in Mode Label \"ml_okok\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The initial value \"null\" in Mode Label \"ml_okok\" is not a valid literal of Enum Mode \"enumerated\"."))
	}
	
	@Test
	def void test_TASoftwareModeValue() {
		val model = amalthea [
			softwareModel [
				mode_Enum[
					name = "enumerated"
					literal [name = "first"]
					literal [name = "second"]
				]
				modeLabel [name = "ml" mode = _find(EnumMode, "enumerated") initialValue = "first"]
				runnable [
					name = "r1"
					callGraph [modeSwitch [entry [name = "r1_mse_ok" modeCondition [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]]]]]
				runnable [
					name = "r2"
					callGraph [modeSwitch [entry [name = "r2_mse_notOk" modeCondition [label = _find(ModeLabel, "ml") value = "third" relation = RelationalOperator.EQUAL]]]]
				]
				task [
					name = "t1"
					callGraph [modeSwitch [entry [name = "t1_mse_ok" modeCondition [label = _find(ModeLabel, "ml") value = "second" relation = RelationalOperator.EQUAL]]]]
				]
				task [
					name = "t2k"
					callGraph [modeSwitch [entry [name = "t2_mse_notOk" modeCondition [label = _find(ModeLabel, "ml") value = "fourth" relation = RelationalOperator.EQUAL]]]]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The mode value \"third\" in Mode Switch Entry \"r2_mse_notOk\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The mode value \"first\" in Mode Switch Entry \"r1_mse_ok\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertTrue(result.contains("The mode value \"fourth\" in Mode Switch Entry \"t2_mse_notOk\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The mode value \"second\" in Mode Switch Entry \"t1_mse_ok\" is not a valid literal of Enum Mode \"enumerated\"."))
	}
	
	@Test
	def void test_TASoftwareModeConditionDisjunctionAlwaysTrue() {
		val model = amalthea [
			softwareModel [
				mode_Enum[
					name = "enumerated"
					literal [name = "first"]
					literal [name = "second"]
				]
				modeLabel [name = "ml" mode = _find(EnumMode, "enumerated") initialValue = "first"]
				runnable [
					name = "r"
					callGraph [
						modeSwitch [entry [name = "r_mse_ok"
							modeCondition [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]
							modeCondition [label = _find(ModeLabel, "ml") value = "second" relation = RelationalOperator.NOT_EQUAL]
						]]
						modeSwitch [entry [name = "r_mse_allLiterals"
							modeCondition [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]
							modeCondition [label = _find(ModeLabel, "ml") value = "second" relation = RelationalOperator.EQUAL]
						]]
						modeSwitch [entry [name = "r_mse_sameLiteral"
							modeCondition [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]
							modeCondition [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.NOT_EQUAL]
						]]
					]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.WARNING].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Disjoining all possible mode literals in Mode Switch Entry \"r_mse_allLiterals\" always evaluates to TRUE, which might not be intended here."))
		assertTrue(result.contains("Disjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_sameLiteral\" always evaluates to TRUE, which might not be intended here."))
		assertFalse(result.contains("Disjoining all possible mode literals in Mode Switch Entry \"r_mse_ok\" always evaluates to TRUE, which might not be intended here."))
		assertFalse(result.contains("Disjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_ok\" always evaluates to TRUE, which might not be intended here."))
		assertFalse(result.contains("Disjoining mode conditions on the same Mode Literal \"second\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_ok\" always evaluates to TRUE, which might not be intended here."))
	}
	
	@Test
	def void test_TASoftwareModeConditionConjunctionAlwaysFalse() {
		val model = amalthea [
			softwareModel [
				mode_Enum[
					name = "enumerated"
					literal [name = "first"]
					literal [name = "second"]
				]
				modeLabel [name = "ml" mode = _find(EnumMode, "enumerated") initialValue = "first"]
				runnable [
					name = "r"
					callGraph [
						modeSwitch [entry [name = "r_mse_ok"
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "second" relation = RelationalOperator.NOT_EQUAL]
						]]
						modeSwitch [entry [name = "r_mse_twoLitEQ"
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "second" relation = RelationalOperator.EQUAL]
						]]
						modeSwitch [entry [name = "r_mse_twoLitUnEQ"
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.NOT_EQUAL]
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "second" relation = RelationalOperator.NOT_EQUAL]
						]]
						modeSwitch [entry [name = "r_mse_sameLiteral"
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.EQUAL]
							modeConditionSingleConjunction [label = _find(ModeLabel, "ml") value = "first" relation = RelationalOperator.NOT_EQUAL]
						]]
					]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.WARNING].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("Conjoining equality of mode literals [first, second] in Mode Switch Entry \"r_mse_twoLitEQ\" always evaluates to FALSE, which might not be intended here."))
		assertTrue(result.contains("Conjoining unequality of mode literals [first, second] in Mode Switch Entry \"r_mse_twoLitUnEQ\" always evaluates to FALSE, which might not be intended here."))
		assertTrue(result.contains("Conjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_sameLiteral\" always evaluates to FALSE, which might not be intended here."))
		assertFalse(result.contains("Conjoining equality of mode literals [first, second] in Mode Switch Entry \"r_mse_ok\" always evaluates to FALSE, which might not be intended here."))
		assertFalse(result.contains("Conjoining unequality of mode literals [first, second] in Mode Switch Entry \"r_mse_ok\" always evaluates to FALSE, which might not be intended here."))
		assertFalse(result.contains("Conjoining mode conditions on the same Mode Literal \"first\" with relations [EQUAL, NOT_EQUAL] in Mode Switch Entry \"r_mse_ok\" always evaluates to FALSE, which might not be intended here."))
	}
	
	@Test
	def void test_TASoftwareServerCall() {
		val model = amalthea [
			softwareModel [
				runnable [
					name = "server_runnable"
				]
				runnable [
					name = "r_ok"
					callGraph [asynchronousServerCall [serverRunnable = _find(Runnable, "server_runnable")]]
				]
				runnable [
					name = "r_looped"
					callGraph [asynchronousServerCall [serverRunnable = containingRunnable]]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The server runnable called by Asynchronous Server Call in Runnable \"r_looped\" must not refer to the containing runnable."))
		assertFalse(result.contains("The server runnable called by Asynchronous Server Call in Runnable \"r_ok\" must not refer to the containing runnable."))
	}
	
	@Test
	def void test_TASoftwareRunnableCall() {
		val model = amalthea [
			softwareModel [
				runnable [
					name = "other_runnable"
				]
				runnable [
					name = "r_ok"
					callGraph [asynchronousServerCall [serverRunnable = _find(Runnable, "other_runnable")]]
				]
				runnable [
					name = "r_looped"
					callGraph [runnableCall [runnable = containingRunnable]]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The runnable called by Runnable Call in Runnable \"r_looped\" must not refer to the containing runnable."))
		assertFalse(result.contains("The runnable called by Runnable Call in Runnable \"r_ok\" must not refer to the containing runnable."))
	}
	
	@Test
	def void test_TASoftwareEnforcedMigration() {
//		val model = amalthea [
//			osModel [
//				operatingSystem [
//					name = "os"
//					taskScheduler [
//						name = "ts"
//					]
//					interruptController [
//						name = "ic"
//					]
//				]
//			]
//			softwareModel [
//				runnable [
//					name = "r_ok"
//					callGraph [enforcedMigration [resourceOwner = _find(TaskScheduler, "ts")]]
//				]
//				runnable [
//					name = "r_unset"
//					callGraph [enforcedMigration []]
//				]
//				task [
//					name = "t_ok"
//					callGraph [enforcedMigration [resourceOwner = _find(TaskScheduler, "ts")]]
//				]
//				task [
//					name = "t_bad"
//					callGraph [enforcedMigration [resourceOwner = _find(InterruptController, "ic")]]
//				]
//			]
//		]
//		val validationResult = validate(model)
//		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
//		assertTrue(result.contains("The resource owner of the Enforced Migration in Runnable \"r_unset\" must be set."))
//		assertTrue(result.contains("The resource owner of the Enforced Migration in Task \"t_bad\" must refer to a task scheduler (instead of Interrupt Controller \"ic\")."))
//		assertFalse(result.contains("The resource owner of the Enforced Migration in Runnable \"r_ok\" must be set."))
//		assertFalse(result.contains("The resource owner of the Enforced Migration in Runnable \"r_ok\" must refer to a task scheduler (instead of Task Scheduler \"ts\")."))
//		assertFalse(result.contains("The resource owner of the Enforced Migration in Task \"t_ok\" must be set."))
//		assertFalse(result.contains("The resource owner of the Enforced Migration in Task \"t_ok\" must refer to a task scheduler (instead of Task Scheduler \"ts\")."))
	}
	
	@Test
	def void test_TASoftwareModeLabelAccess() {
		val model = amalthea [
			softwareModel [
				mode_Enum[
					name = "enumerated"
					literal [name = "first"]
					literal [name = "second"]
				]
				modeLabel [name = "ml" mode = _find(EnumMode, "enumerated") initialValue = "first"]
				runnable [
					name = "r_ok"
					callGraph [modeLabelAccess [access = ModeLabelAccessEnum.SET
						data = _find(ModeLabel, "ml")
						value = "first"
					]]
				]
				runnable [
					name = "r_notOk"
					callGraph [modeLabelAccess [access = ModeLabelAccessEnum.SET
						data = _find(ModeLabel, "ml")
						value = "third"
					]]
				]
				task [
					name = "t_ok"
					callGraph [modeLabelAccess [access = ModeLabelAccessEnum.SET
						data = _find(ModeLabel, "ml")
						value = "second"
					]]
				]
				task [
					name = "t_notOk"
					callGraph [modeLabelAccess [access = ModeLabelAccessEnum.SET
						data = _find(ModeLabel, "ml")
						value = "fourth"
					]]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The mode label access value to be updated to \"third\" in Runnable \"r_notOk\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The mode label access value to be updated to \"first\" in Runnable \"r1_ok\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertTrue(result.contains("The mode label access value to be updated to \"fourth\" in Task \"t_notOk\" is not a valid literal of Enum Mode \"enumerated\"."))
		assertFalse(result.contains("The mode label access value to be updated to \"second\" in Task \"t_ok\" is not a valid literal of Enum Mode \"enumerated\"."))
	}
	
}