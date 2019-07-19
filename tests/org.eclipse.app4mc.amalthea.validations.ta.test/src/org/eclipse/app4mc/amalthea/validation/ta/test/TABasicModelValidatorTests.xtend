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
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import org.eclipse.app4mc.validation.core.Severity
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.junit.Test

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import static org.junit.Assert.assertFalse
import static org.junit.Assert.assertTrue

class TABasicModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension StimuliBuilder b2 = new StimuliBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def ContinuousValueGaussDistribution createCVGaussD(double mean, double sd, double lower, double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueGaussDistribution
		ret.mean = mean
		ret.sd = sd
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
	
	def TimeGaussDistribution createTGaussD(Time mean, Time sd, Time lower, Time upper) {
		val ret = AmaltheaFactory.eINSTANCE.createTimeGaussDistribution
		ret.mean = mean
		ret.sd = sd
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
	}
	
	@Test
	def void test_TABasicContinuousValueGaussDistribution() {
		val model = amalthea [
			stimuliModel[
				variableRateStimulus[
					name = "vrs_ok"
					occurrencesPerStep = createCVGaussD(30d, 10d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_meanLess"
					occurrencesPerStep = createCVGaussD(10d, 10d, 20d, 40d)
				]
				variableRateStimulus[
					name = "vrs_meanMore"
					occurrencesPerStep = createCVGaussD(50d, 10d, 20d, 40d)
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_meanLess\")"))
		assertTrue(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_meanMore\")"))
		assertFalse(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"))
		assertFalse(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void test_TABasicDiscreteValueGaussDistribution() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					callGraph [ticks [^default = createDVGaussD(30d, 10d, 20, 40)]]
				]
				runnable[
					name = "r_meanLess"
					callGraph [ticks [^default = createDVGaussD(10d, 10d, 20, 40)]] 
				]
				runnable[
					name = "r_meanMore"
					callGraph [ticks [^default = createDVGaussD(50d, 10d, 20, 40)]] 
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (10.0 < 20, in Runnable \"r_meanLess\")"))
		assertTrue(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40, in Runnable \"r_meanMore\")"))
		assertFalse(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"))
		assertFalse(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicTimeGaussDistribution() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTGaussD(createTime(30, "ms"), createTime(10, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_meanLess"
					jitter = createTGaussD(createTime(10, "ms"), createTime(10, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_meanMore"
					jitter = createTGaussD(createTime(50, "ms"), createTime(10, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.filter[it.severityLevel == Severity.ERROR].map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TimeGaussDistribution: mean is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_meanLess\")"))
		assertTrue(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_meanMore\")"))
		assertFalse(result.contains("TimeGaussDistribution: mean is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"))
		assertFalse(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"))
	}
}
