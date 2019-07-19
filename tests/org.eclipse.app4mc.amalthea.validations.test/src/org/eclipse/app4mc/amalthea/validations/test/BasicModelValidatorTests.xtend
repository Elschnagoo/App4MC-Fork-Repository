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
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.test

import java.util.List
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution
import org.eclipse.app4mc.amalthea.model.TimeStatistics
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder
import org.eclipse.app4mc.amalthea.validations.EMFProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class BasicModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension StimuliBuilder b2 = new StimuliBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	val executor = new ValidationExecutor(EMFProfile)

	def ContinuousValueGaussDistribution createCVGaussD(double mean, double sd, double lower, double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueGaussDistribution
		ret.mean = mean
		ret.sd = sd
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def ContinuousValueUniformDistribution createCVUniformD(double lower, double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueUniformDistribution
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def ContinuousValueStatistics createCVStatistics(double avg, double lower, double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueStatistics
		ret.average = avg
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def ContinuousValueWeibullEstimatorsDistribution createCVWeibullED(double avg, double prp, double lower,
		double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueWeibullEstimatorsDistribution
		ret.average = avg
		ret.PRemainPromille = prp
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def DiscreteValueBetaDistribution createDVBetaD(double alpha, double beta, long lower, long upper) {
		val ret = AmaltheaFactory.eINSTANCE.createDiscreteValueBetaDistribution
		ret.alpha = alpha
		ret.beta = beta
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def DiscreteValueGaussDistribution createDVGaussD(double mean, double sd, long lower, long upper) {
		val ret = AmaltheaFactory.eINSTANCE.createDiscreteValueGaussDistribution
		ret.mean = mean
		ret.sd = sd
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def DiscreteValueUniformDistribution createDVUniformD(long lower, long upper) {
		val ret = AmaltheaFactory.eINSTANCE.createDiscreteValueUniformDistribution
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def DiscreteValueStatistics createDVStatistics(double avg, long lower, long upper) {
		val ret = AmaltheaFactory.eINSTANCE.createDiscreteValueStatistics
		ret.average = avg
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def DiscreteValueWeibullEstimatorsDistribution createDVWeibullED(double avg, double prp, long lower, long upper) {
		val ret = AmaltheaFactory.eINSTANCE.createDiscreteValueWeibullEstimatorsDistribution
		ret.average = avg
		ret.PRemainPromille = prp
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def TimeBetaDistribution createTBetaD(double alpha, double beta, Time lower, Time upper) {
		val ret = AmaltheaFactory.eINSTANCE.createTimeBetaDistribution
		ret.alpha = alpha
		ret.beta = beta
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def TimeGaussDistribution createTGaussD(Time mean, Time sd, Time lower, Time upper) {
		val ret = AmaltheaFactory.eINSTANCE.createTimeGaussDistribution
		ret.mean = mean
		ret.sd = sd
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def TimeUniformDistribution createTUniformD(Time lower, Time upper) {
		val ret = AmaltheaFactory.eINSTANCE.createTimeUniformDistribution
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def TimeStatistics createTStatistics(Time avg, Time lower, Time upper) {
		val ret = AmaltheaFactory.eINSTANCE.createTimeStatistics
		ret.average = avg
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def TimeWeibullEstimatorsDistribution createTWeibullED(Time avg, double prp, Time lower, Time upper) {
		val ret = AmaltheaFactory.eINSTANCE.createTimeWeibullEstimatorsDistribution
		ret.average = avg
		ret.PRemainPromille = prp
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}

	def boolean containsAll(String str, String... args) {
		for (String arg : args) {
			if(!str.contains(arg)) return false
		}
		return true
	}

	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}

	@Test
	def void test_BasicContinuousValueInterval() {
		val model = amalthea [
			stimuliModel[
				variableRateStimulus[
					name = "vrs_ok"
					occurrencesPerStep = createCVUniformD(20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_more"
					occurrencesPerStep = createCVUniformD(20d, 10d)
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("ContinuousValueUniformDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_more\" )"))
		assertFalse(result.contains("ContinuousValueUniformDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_ok\" )"))
	}

	@Test
	def void test_BasicContinuousValueStatistics() {
		val model = amalthea [
			stimuliModel[
				variableRateStimulus[
					name = "vrs_ok"
					occurrencesPerStep = createCVStatistics(30d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_avgLess"
					occurrencesPerStep = createCVStatistics(10d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_avgMore"
					occurrencesPerStep = createCVStatistics(50d, 20d, 40d)
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("ContinuousValueStatistics: lower bound > average ( in Variable Rate Stimulus \"vrs_avgLess\" )"))
		assertTrue(result.contains("ContinuousValueStatistics: average > upper bound ( in Variable Rate Stimulus \"vrs_avgMore\" )"))
		assertFalse(result.contains("ContinuousValueStatistics: lower bound > average ( in Variable Rate Stimulus \"vrs_ok\")"))
		assertFalse(result.contains("ContinuousValueStatistics: average > upper bound ( in Variable Rate Stimulus \"vrs_ok\")"))
	}

	@Test
	def void test_BasicContinuousValueWeibullEstimatorsDistribution() {
		val model = amalthea [
			stimuliModel[
				variableRateStimulus[
					name = "vrs_ok"
					occurrencesPerStep = createCVWeibullED(30d, 1d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_avgLess"
					occurrencesPerStep = createCVWeibullED(10d, 1d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_avgMore"
					occurrencesPerStep = createCVWeibullED(50d, 1d, 20d, 40d)
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: lower bound > average ( in Variable Rate Stimulus \"vrs_avgLess\" )"))
		assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: average > upper bound ( in Variable Rate Stimulus \"vrs_avgMore\" )"))
		assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: lower bound > average ( in Variable Rate Stimulus \"vrs_ok\" )"))
		assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: average > upper bound ( in Variable Rate Stimulus \"vrs_ok\" )"))
	}

	@Test
	def void test_BasicTruncatedContinuousValueDistribution() {
		val model = amalthea [
			stimuliModel[
				variableRateStimulus[
					name = "vrs_ok"
					occurrencesPerStep = createCVGaussD(30d, 10d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_more"
					occurrencesPerStep = createCVGaussD(30d, 10d, 20d, 10d)
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("ContinuousValueGaussDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_more\" )"))
		assertFalse(result.contains("ContinuousValueGaussDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_ok\" )"))
	}

	@Test
	def void test_BasicDiscreteValueBetaDistribution() {
		val model = amalthea [
			softwareModel [
				runnable [
					name = "r_ok"
					callGraph [ticks [^default = createDVBetaD(0.5d, 0.5d, 20l, 40l)]]
				]
				runnable [
					name = "r_alphaZero"
					callGraph [ticks [^default = createDVBetaD(0d, 0.5d, 20l, 40l)]]
				]
				runnable [
					name = "r_betaZero"
					callGraph [ticks [^default = createDVBetaD(0.5d, 0d, 20l, 40l)]]
				]
				runnable [
					name = "r_alphabetaZero"
					callGraph [ticks [^default = createDVBetaD(0d, 0d, 20l, 40l)]]
				]
			]
		]
		val validationResult = validate(model)

		val alpha = "feature 'alpha' of 'DiscreteValueBetaDistribution'"
		val beta = "feature 'beta' of 'DiscreteValueBetaDistribution'"
		val message = "value '0.0' must be greater than '0.0'"

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.exists[it.containsAll(alpha, message, "in Runnable \"r_alphaZero\"")])
		assertTrue(result.exists[it.containsAll(alpha, message, "in Runnable \"r_alphabetaZero\"")])
		assertFalse(result.exists[it.containsAll(alpha, message, "in Runnable \"r_ok\"")])
		assertTrue(result.exists[it.containsAll(beta, message, "in Runnable \"r_betaZero\"")])
		assertTrue(result.exists[it.containsAll(beta, message, "in Runnable \"r_alphabetaZero\"")])
		assertFalse(result.exists[it.containsAll(beta, message, "in Runnable \"r_ok\"")])
	}

	@Test
	def void test_BasicDiscreteValueInterval() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					callGraph [ticks [^default = createDVUniformD(20, 40)]]
				]
				runnable[
					name = "r_more"
					callGraph [ticks [^default = createDVUniformD(20, 10)]]
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("DiscreteValueUniformDistribution: lower bound > upper bound ( in Runnable \"r_more\" )"))
		assertFalse(result.contains("DiscreteValueUniformDistribution: lower bound > upper bound ( in Runnable \"r_ok\" )"))
	}

	@Test
	def void test_BasicDiscreteValueStatistics() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					callGraph [ticks [^default = createDVStatistics(30d, 20, 40)]]
				]
				runnable[
					name = "r_avgLess"
					callGraph [ticks [^default = createDVStatistics(10d, 20, 40)]]
				]
				runnable[
					name = "r_avgMore"
					callGraph [ticks [^default = createDVStatistics(50d, 20, 40)]]
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("DiscreteValueStatistics: lower bound > average ( in Runnable \"r_avgLess\" )"))
		assertTrue(result.contains("DiscreteValueStatistics: average > upper bound ( in Runnable \"r_avgMore\" )"))
		assertFalse(result.contains("DiscreteValueStatistics: lower bound > average ( in Runnable \"r_ok\" )"))
		assertFalse(result.contains("DiscreteValueStatistics: average > upper bound ( in Runnable \"r_ok\" )"))
	}

	@Test
	def void test_BasicDiscreteValueWeibullEstimatorsDistribution() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					callGraph [ticks [^default = createDVWeibullED(30d, 1d, 20, 40)]]
				]
				runnable[
					name = "r_avgLess"
					callGraph [ticks [^default = createDVWeibullED(10d, 1d, 20, 40)]]
				]
				runnable[
					name = "r_avgMore"
					callGraph [ticks [^default = createDVWeibullED(50d, 1d, 20, 40)]]
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: lower bound > average ( in Runnable \"r_avgLess\" )"))
		assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: average > upper bound ( in Runnable \"r_avgMore\" )"))
		assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: lower bound > average ( in Runnable \"r_ok\" )"))
		assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: average > upper bound ( in Runnable \"r_ok\" )"))
	}

	@Test
	def void test_BasicTruncatedDiscreteValueDistribution() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					callGraph [ticks [^default = createDVGaussD(30d, 10d, 20, 40)]]
				]
				runnable[
					name = "r_more"
					callGraph [ticks [^default = createDVGaussD(30d, 10d, 20, 10)]]
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("DiscreteValueGaussDistribution: lower bound > upper bound ( in Runnable \"r_more\" )"))
		assertFalse(result.contains("DiscreteValueGaussDistribution: lower bound > upper bound ( in Runnable \"r_ok\" )"))
	}

	@Test
	def void test_BasicTimeBetaDistribution() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTBetaD(0.5d, 0.5d, createTime(), createTime())
				]
				periodicStimulus[
					name = "ps_alphaZero"
					jitter = createTBetaD(0d, 0.5d, createTime(), createTime())
				]
				periodicStimulus[
					name = "ps_betaZero"
					jitter = createTBetaD(0.5d, 0d, createTime(), createTime())
				]
				periodicStimulus[
					name = "ps_alphabetaZero"
					jitter = createTBetaD(0d, 0d, createTime(), createTime())
				]
			]
		]
		val validationResult = validate(model)

		val alpha = "feature 'alpha' of 'TimeBetaDistribution'"
		val beta = "feature 'beta' of 'TimeBetaDistribution'"
		val message = "value '0.0' must be greater than '0.0'"

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.exists[it.containsAll(alpha, message, "in Periodic Stimulus \"ps_alphaZero\"")])
		assertTrue(result.exists[it.containsAll(alpha, message, "in Periodic Stimulus \"ps_alphabetaZero\"")])
		assertFalse(result.exists[it.containsAll(alpha, message, "in Periodic Stimulus \"ps_ok\"")])
		assertTrue(result.exists[it.containsAll(beta, message, "in Periodic Stimulus \"ps_betaZero\"")])
		assertTrue(result.exists[it.containsAll(beta, message, "in Periodic Stimulus \"ps_alphabetaZero\"")])
		assertFalse(result.exists[it.containsAll(beta, message, "in Periodic Stimulus \"ps_ok\"")])
	}

	@Test
	def void test_BasicTimeInterval() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTUniformD(createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_more"
					jitter = createTUniformD(createTime(20, "ms"), createTime(10, "ms"))
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("TimeUniformDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_more\" )"))
		assertFalse(result.contains("TimeUniformDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_ok\" )"))
	}

	@Test
	def void test_BasicTimeStatistics() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTStatistics(createTime(30, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_avgLess"
					jitter = createTStatistics(createTime(10, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_avgMore"
					jitter = createTStatistics(createTime(50, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("TimeStatistics: lower bound > average ( in Periodic Stimulus \"ps_avgLess\" )"))
		assertTrue(result.contains("TimeStatistics: average > upper bound ( in Periodic Stimulus \"ps_avgMore\" )"))
		assertFalse(result.contains("TimeStatistics: lower bound > average ( in Periodic Stimulus \"ps_ok\" )"))
		assertFalse(result.contains("TimeStatistics: average > upper bound ( in Periodic Stimulus \"ps_ok\" )"))
	}

	@Test
	def void test_BasicTimeWeibullEstimatorsDistribution() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTWeibullED(createTime(30, "ms"), 1d, createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_avgLess"
					jitter = createTWeibullED(createTime(10, "ms"), 1d, createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_avgMore"
					jitter = createTWeibullED(createTime(50, "ms"), 1d, createTime(20, "ms"), createTime(40, "ms"))
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("TimeWeibullEstimatorsDistribution: lower bound > average ( in Periodic Stimulus \"ps_avgLess\" )"))
		assertTrue(result.contains("TimeWeibullEstimatorsDistribution: average > upper bound ( in Periodic Stimulus \"ps_avgMore\" )"))
		assertFalse(result.contains("TimeWeibullEstimatorsDistribution: lower bound > average ( in Periodic Stimulus \"ps_ok\" )"))
		assertFalse(result.contains("TimeWeibullEstimatorsDistribution: average > upper bound ( in Periodic Stimulus \"ps_ok\" )"))
	}

	@Test
	def void test_BasicTruncatedTimeDistribution() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTGaussD(createTime(30, "ms"), createTime(10, "ms"), createTime(20, "ms"),
						createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_more"
					jitter = createTGaussD(createTime(30, "ms"), createTime(10, "ms"), createTime(20, "ms"),
						createTime(10, "ms"))
				]
			]
		]
		val validationResult = validate(model)

		val result = validationResult.filter[it.severityLevel == Severity.ERROR].map[it.message].toList
		assertTrue(result.contains("TimeGaussDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_more\" )"))
		assertFalse(result.contains("TimeGaussDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_ok\" )"))
	}
}
