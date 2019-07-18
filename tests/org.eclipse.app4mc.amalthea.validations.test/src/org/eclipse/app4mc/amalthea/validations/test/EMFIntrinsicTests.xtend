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
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import java.util.stream.Collectors

class EMFIntrinsicTests {

	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension SoftwareBuilder b2 = new SoftwareBuilder
	extension StimuliBuilder b3 = new StimuliBuilder
	val executor = new ValidationExecutor(EMFProfile)
	
	def ContinuousValueBetaDistribution createCVBetaD(double alpha, double beta, double lower, double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueBetaDistribution
		ret.alpha = alpha
		ret.beta = beta
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

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
		
		assertTrue(errors.get(_find(model, SporadicActivation, "a1")) == "TimeBoundaries: lower bound > upper bound, in Sporadic Activation \"a1\"")
		assertTrue(errors.get(_find(model, SporadicActivation, "a2")) == "TimeBoundaries: lower bound > upper bound, in Sporadic Activation \"a2\"")
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
		
		assertTrue(errors.get(_find(model, SporadicActivation, "a1")) == "TimeGaussDistribution: lower bound > upper bound, in Sporadic Activation \"a1\"")
	}
	
	@Test
	def void test_TABasicContinuousValueBetaDistribution() {
		val model = amalthea [
			stimuliModel[
				variableRateStimulus[
					name = "vrs_ok"
					occurrencesPerStep = createCVBetaD(0.5d, 0.5d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_alphaZero"
					occurrencesPerStep = createCVBetaD(0d, 0.5d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_betaZero"
					occurrencesPerStep = createCVBetaD(0.5d, 0d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_alphabetaZero"
					occurrencesPerStep = createCVBetaD(0d, 0d, 20d, 40d)
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("The feature 'alpha' of 'ContinuousValueBetaDistribution' contains a bad value, in Variable Rate Stimulus \"vrs_alphaZero\" (The value '0.0' must be greater than '0.0')"))
		assertTrue(result.contains("The feature 'alpha' of 'ContinuousValueBetaDistribution' contains a bad value, in Variable Rate Stimulus \"vrs_alphabetaZero\" (The value '0.0' must be greater than '0.0')"))
		assertFalse(result.contains("The feature 'alpha' of 'ContinuousValueBetaDistribution' contains a bad value, in Variable Rate Stimulus \"vrs_ok\" (The value '0.5' must be greater than '0.0')"))
		assertTrue(result.contains("The feature 'beta' of 'ContinuousValueBetaDistribution' contains a bad value, in Variable Rate Stimulus \"vrs_betaZero\" (The value '0.0' must be greater than '0.0')"))
		assertTrue(result.contains("The feature 'beta' of 'ContinuousValueBetaDistribution' contains a bad value, in Variable Rate Stimulus \"vrs_alphabetaZero\" (The value '0.0' must be greater than '0.0')"))
		assertFalse(result.contains("The feature 'beta' of 'ContinuousValueBetaDistribution' contains a bad value, in Variable Rate Stimulus \"vrs_ok\" (The value '0.5' must be greater than '0.0')"))
	}

}
