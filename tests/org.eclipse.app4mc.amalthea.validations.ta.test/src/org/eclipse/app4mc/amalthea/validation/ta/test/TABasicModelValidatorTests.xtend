package org.eclipse.app4mc.amalthea.validation.ta.test

import org.junit.Test
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory
import org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution
import org.eclipse.app4mc.validation.util.ValidationExecutor
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile
import java.util.List
import org.eclipse.app4mc.validation.core.ValidationDiagnostic
import org.eclipse.app4mc.amalthea.model.Amalthea
import static org.junit.Assert.assertTrue
import java.util.stream.Collectors
import static org.junit.Assert.assertFalse
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution
import org.eclipse.app4mc.amalthea.model.Time

import static org.eclipse.app4mc.amalthea.model.util.FactoryUtil.*
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics
import org.eclipse.app4mc.amalthea.model.TimeStatistics
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution

class TABasicModelValidatorTests {
	extension AmaltheaBuilder b1 = new AmaltheaBuilder
	extension StimuliBuilder b2 = new StimuliBuilder
	extension SoftwareBuilder b3 = new SoftwareBuilder
	val executor = new ValidationExecutor(TimingArchitectsProfile)
	
	def ContinuousValueBetaDistribution createCVBetaD(double alpha, double beta, double lower, double upper) {
		val ret = AmaltheaFactory.eINSTANCE.createContinuousValueBetaDistribution
		ret.alpha = alpha
		ret.beta = beta
		ret.lowerBound = lower
		ret.upperBound = upper
		ret
	}
	
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
	
	def ContinuousValueWeibullEstimatorsDistribution createCVWeibullED(double avg, double prp, double lower, double upper) {
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
	
	def List<ValidationDiagnostic> validate(Amalthea model) {
		executor.validate(model)
		executor.results
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("ContinuousValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_alphaZero\")"))
		assertTrue(result.contains("ContinuousValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_alphabetaZero\")"))
		assertFalse(result.contains("ContinuousValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_ok\")"))
		assertTrue(result.contains("ContinuousValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_betaZero\")"))
		assertTrue(result.contains("ContinuousValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_alphabetaZero\")"))
		assertFalse(result.contains("ContinuousValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_ok\")"))
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_meanLess\")"))
		assertTrue(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_meanMore\")"))
		assertFalse(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"))
		assertFalse(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void test_TABasicContinuousValueInterval() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("ContinuousValueInterval: lower bound is higher than the upper: (20.0 > 10.0, in Variable Rate Stimulus \"vrs_more\")"))
		assertFalse(result.contains("ContinuousValueInterval: lower bound is higher than the upper: (20.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void test_TABasicContinuousValueStatistics() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("ContinuousValueStatistics: average is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_avgLess\")"))
		assertTrue(result.contains("ContinuousValueStatistics: average is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_avgMore\")"))
		assertFalse(result.contains("ContinuousValueStatistics: average is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"))
		assertFalse(result.contains("ContinuousValueStatistics: average is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void test_TABasicContinuousValueWeibullEstimatorsDistribution() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_avgLess\")"))
		assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_avgMore\")"))
		assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"))
		assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void test_TABasicTruncatedContinuousValueDistribution() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TruncatedContinuousValueDistribution: lower bound is higher than the upper: (20.0 > 10.0, in Variable Rate Stimulus \"vrs_more\")"))
		assertFalse(result.contains("TruncatedContinuousValueDistribution: lower bound is higher than the upper: (20.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"))
	}
	
	@Test
	def void test_TABasicDiscreteValueBetaDistribution() {
		val model = amalthea [
			softwareModel [
				runnable [
					name = "r_ok"
					ticks[
						^default = createDVBetaD(0.5d, 0.5d, 20l, 40l)
					]
				]
				runnable [
					name = "r_alphaZero"
					ticks[
						^default = createDVBetaD(0d, 0.5d, 20l, 40l)
					]
				]
				runnable [
					name = "r_betaZero"
					ticks[
						^default = createDVBetaD(0.5d, 0d, 20l, 40l)
					]
				]
				runnable [
					name = "r_alphabetaZero"
					ticks[
						^default = createDVBetaD(0d, 0d, 20l, 40l)
					]
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("DiscreteValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_alphaZero\")"))
		assertTrue(result.contains("DiscreteValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_alphabetaZero\")"))
		assertFalse(result.contains("DiscreteValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_ok\")"))
		assertTrue(result.contains("DiscreteValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_betaZero\")"))
		assertTrue(result.contains("DiscreteValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_alphabetaZero\")"))
		assertFalse(result.contains("DiscreteValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicDiscreteValueGaussDistribution() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					ticks[
						^default = createDVGaussD(30d, 10d, 20, 40)
					]
				]
				runnable[
					name = "r_meanLess"
					ticks[
						^default = createDVGaussD(10d, 10d, 20, 40)
					] 
				]
				runnable[
					name = "r_meanMore"
					ticks[
						^default = createDVGaussD(50d, 10d, 20, 40)
					] 
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (10.0 < 20, in Runnable \"r_meanLess\")"))
		assertTrue(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40, in Runnable \"r_meanMore\")"))
		assertFalse(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"))
		assertFalse(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicDiscreteValueInterval() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					ticks[
						^default = createDVUniformD(20, 40)
					]
				]
				runnable[
					name = "r_more"
					ticks[
						^default = createDVUniformD(20, 10)
					] 
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("DiscreteValueInterval: lower bound is higher than the upper: (20 > 10, in Runnable \"r_more\")"))
		assertFalse(result.contains("DiscreteValueInterval: lower bound is higher than the upper: (20 < 40, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicDiscreteValueStatistics() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					ticks[
						^default = createDVStatistics(30d, 20, 40)
					]
				]
				runnable[
					name = "r_avgLess"
					ticks[
						^default = createDVStatistics(10d, 20, 40)
					] 
				]
				runnable[
					name = "r_avgMore"
					ticks[
						^default = createDVStatistics(50d, 20, 40)
					] 
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("DiscreteValueStatistics: average is less than the lower bound: (10.0 < 20, in Runnable \"r_avgLess\")"))
		assertTrue(result.contains("DiscreteValueStatistics: average is greater than the upper bound: (50.0 > 40, in Runnable \"r_avgMore\")"))
		assertFalse(result.contains("DiscreteValueStatistics: average is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"))
		assertFalse(result.contains("DiscreteValueStatistics: average is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicDiscreteValueWeibullEstimatorsDistribution() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					ticks[
						^default = createDVWeibullED(30d, 1d, 20, 40)
					]
				]
				runnable[
					name = "r_avgLess"
					ticks[
						^default = createDVWeibullED(10d, 1d, 20, 40)
					] 
				]
				runnable[
					name = "r_avgMore"
					ticks[
						^default = createDVWeibullED(50d, 1d, 20, 40)
					] 
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is less than the lower bound: (10.0 < 20, in Runnable \"r_avgLess\")"))
		assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is greater than the upper bound: (50.0 > 40, in Runnable \"r_avgMore\")"))
		assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"))
		assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicTruncatedDiscreteValueDistribution() {
		val model = amalthea [
			softwareModel[
				runnable[
					name = "r_ok"
					ticks[
						^default = createDVGaussD(30d, 10d, 20, 40)
					]
				]
				runnable[
					name = "r_more"
					ticks[
						^default = createDVGaussD(30d, 10d, 20, 10)
					] 
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TruncatedDiscreteValueDistribution: lower bound is higher than the upper: (20 > 10, in Runnable \"r_more\")"))
		assertFalse(result.contains("TruncatedDiscreteValueDistribution: lower bound is higher than the upper: (20 > 40, in Runnable \"r_ok\")"))
	}
	
	@Test
	def void test_TABasicTimeBetaDistribution() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TimeBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_alphaZero\")"))
		assertTrue(result.contains("TimeBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_alphabetaZero\")"))
		assertFalse(result.contains("TimeBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_ok\")"))
		assertTrue(result.contains("TimeBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_betaZero\")"))
		assertTrue(result.contains("TimeBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_alphabetaZero\")"))
		assertFalse(result.contains("TimeBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_ok\")"))
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TimeGaussDistribution: mean is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_meanLess\")"))
		assertTrue(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_meanMore\")"))
		assertFalse(result.contains("TimeGaussDistribution: mean is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"))
		assertFalse(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"))
	}
	
	@Test
	def void test_TABasicTimeInterval() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TimeInterval: lower bound is higher than the upper: (20 ms > 10 ms, in Periodic Stimulus \"ps_more\")"))
		assertFalse(result.contains("TimeInterval: lower bound is higher than the upper: (20 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"))
	}
	
	@Test
	def void test_TABasicTimeStatistics() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TimeStatistics: average is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_avgLess\")"))
		assertTrue(result.contains("TimeStatistics: average is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_avgMore\")"))
		assertFalse(result.contains("TimeStatistics: average is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"))
		assertFalse(result.contains("TimeStatistics: average is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"))
	}
	
	@Test
	def void test_TABasicTimeWeibullEstimatorsDistribution() {
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
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TimeWeibullEstimatorsDistribution: average is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_avgLess\")"))
		assertTrue(result.contains("TimeWeibullEstimatorsDistribution: average is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_avgMore\")"))
		assertFalse(result.contains("TimeWeibullEstimatorsDistribution: average is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"))
		assertFalse(result.contains("TimeWeibullEstimatorsDistribution: average is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"))
	}
	
	@Test
	def void test_TABasicTruncatedTimeDistribution() {
		val model = amalthea [
			stimuliModel[
				periodicStimulus[
					name = "ps_ok"
					jitter = createTGaussD(createTime(30, "ms"), createTime(10, "ms"), createTime(20, "ms"), createTime(40, "ms"))
				]
				periodicStimulus[
					name = "ps_more"
					jitter = createTGaussD(createTime(30, "ms"), createTime(10, "ms"), createTime(20, "ms"), createTime(10, "ms"))
				]
			]
		]
		val validationResult = validate(model)
		val result = validationResult.stream.map[it.message].collect(Collectors.toList)
		assertTrue(result.contains("TruncatedTimeDistribution: lower bound is higher than the upper: (20 ms > 10 ms, in Periodic Stimulus \"ps_more\")"))
		assertFalse(result.contains("TruncatedTimeDistribution: lower bound is higher than the upper: (20 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"))
	}
}