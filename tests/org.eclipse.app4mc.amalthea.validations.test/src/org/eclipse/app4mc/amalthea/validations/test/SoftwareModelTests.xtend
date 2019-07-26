/**
 * *******************************************************************************
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
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.test

import java.util.List
import java.util.stream.Collectors
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.EnumMode
import org.eclipse.app4mc.amalthea.model.ModeCondition
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLabelAccessEnum
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.RelationalOperator
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1
import org.junit.Test

import static org.junit.Assert.*

class SoftwareModelTests {

	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder
	val executor = new ValidationExecutor(EMFProfile)

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
	
	@Test
	def void testModeLabel() {
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
		assertTrue(result.contains("The initialValue 'third' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_notOk\" )"))
		assertFalse(result.contains("The initialValue 'first' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_ok\" )"))
		assertFalse(result.contains("The initialValue '' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_okok\" )"))
		assertFalse(result.contains("The initialValue 'null' is not a valid literal of Enum Mode \"enumerated\" ( in Mode Label \"ml_okok\" )"))
	}
	
	@Test
	def void testModeValue() {
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
					name = "t2"
					callGraph [modeSwitch [entry [name = "t2_mse_notOk" modeCondition [label = _find(ModeLabel, "ml") value = "fourth" relation = RelationalOperator.EQUAL]]]]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The value 'third' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r2\" )"))
		assertFalse(result.contains("The value 'first' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r1\" )"))
		assertTrue(result.contains("The value 'fourth' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t2\" )"))
		assertFalse(result.contains("The value 'second' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t1\" )"))
	}
	
	@Test
	def void testModeLabelAccess() {
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
		assertTrue(result.contains("The value 'third' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r_notOk\" )"))
		assertFalse(result.contains("The value 'first' is not a valid literal of Enum Mode \"enumerated\" ( in Runnable \"r_ok\" )"))
		assertTrue(result.contains("The value 'fourth' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t_notOk\" )"))
		assertFalse(result.contains("The value 'second' is not a valid literal of Enum Mode \"enumerated\" ( in Task \"t_ok\" )"))
	}

}
