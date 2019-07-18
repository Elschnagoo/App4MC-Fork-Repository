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
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.SporadicActivation
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.TimeUnit.*
import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.*

class EMFIntrinsicTests {

	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder
	val executor = new ValidationExecutor(EMFProfile)

	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}

	@Test
	def void testTimeInterval_Bounds() {
		val model = amalthea [
			softwareModel[
				activation_Sporadic[
					name = "a1"
					occurrence = createTimeBoundaries(createTime(5, NS), createTime(1, NS))
				]
				activation_Sporadic[
					name = "a2"
					occurrence = createTimeBoundaries(createTime(1, MS), createTime(5, NS))
				]
			]
		]
		val validationResult = validate(model)
		val errors = validationResult.filter[severityLevel == Severity.ERROR].toMap([it.targetObject.eContainer],[it.message])
		
		assertTrue(errors.get(_find(model, SporadicActivation, "a1")) == "TimeBoundaries: lower bound > upper bound")
		assertTrue(errors.get(_find(model, SporadicActivation, "a2")) == "TimeBoundaries: lower bound > upper bound")
	}

	@Test
	def void testTimeTruncatedDistribution_Bounds() {
		val model = amalthea [
			softwareModel[
				activation_Sporadic[
					name = "a1"
					occurrence = createTimeGaussDistribution(createTime(1, US), createTime(5, NS), createTime(9, US), createTime(7, US))
				]
				
			]
		]
		val validationResult = validate(model)
		val errors = validationResult.filter[severityLevel == Severity.ERROR].toMap([it.targetObject.eContainer],[it.message])
		
		assertTrue(errors.get(_find(model, SporadicActivation, "a1")) == "TimeGaussDistribution: lower bound > upper bound")

	}

}
