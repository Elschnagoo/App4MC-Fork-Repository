/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.util;

import java.math.BigInteger;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.DiscreteConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.DiscreteGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.Voltage;
import org.eclipse.app4mc.amalthea.model.VoltageUnit;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;

public class FactoryUtil {

	/**
	 * Creates a data size out of a value and a unit
	 * @param value
	 * @param unit
	 * @return DataSize
	 */
	public static DataSize createDataSize(long value, DataSizeUnit unit) {
		DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		size.setValue(BigInteger.valueOf(value));
		size.setUnit(unit);
		return size;
	}

	/**
	 * Creates a data rate out of a value and a unit
	 * @param value
	 * @param unit
	 * @return DataRate
	 */
	public static DataRate createDataRate(long value, DataRateUnit unit) {
		DataRate rate = AmaltheaFactory.eINSTANCE.createDataRate();
		rate.setValue(BigInteger.valueOf(value));
		rate.setUnit(unit);
		return rate;
	}

	/**
	 * Creates a frequency out of a value and a unit
	 * @param value
	 * @param unit
	 * @return Frequency
	 */
	public static Frequency createFrequency(double value, FrequencyUnit unit) {
		Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
		frequency.setValue(value);
		frequency.setUnit(unit);
		return frequency;
	}
	
	/**
	 * Creates a voltage out of a value and a unit
	 * @param value
	 * @param unit
	 * @return Voltage
	 */
	public static Voltage createVoltage(double value, VoltageUnit unit) {
		Voltage voltage = AmaltheaFactory.eINSTANCE.createVoltage();
		voltage.setValue(value);
		voltage.setUnit(unit);
		return voltage;
	}

	/**
	 * Creates a time out of a value and a unit
	 * @param value
	 * @param unit
	 * @return Time
	 */
	public static Time createTime(long value, TimeUnit unit) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(BigInteger.valueOf(value));
		time.setUnit(unit);
		return time;
	}

	/**
	 * Creates a TypeRef object that refers to a type definition
	 * @param typeDefinition
	 * @return TypeRef
	 */
	public static TypeRef createTypeRef(TypeDefinition typeDefinition) {
		TypeRef refObj = AmaltheaFactory.eINSTANCE.createTypeRef();
		refObj.setTypeDef(typeDefinition);;
		return refObj;
	}

	/**
	 * Creates a HwLatency with constant cycles
	 * @param cycles
	 * @return LatencyConstant
	 */
	public static LatencyConstant createLatency(long cycles) {
		LatencyConstant latency = AmaltheaFactory.eINSTANCE.createLatencyConstant();
		latency.setCycles(cycles);
		return latency;
	}

	/**
	 * Creates a HwLatency with a deviation of cycles
	 * @param cycles
	 * @return LatencyDeviation
	 */
	public static LatencyDeviation createLatency(Deviation<LongObject> cycles) {
		LatencyDeviation latency = AmaltheaFactory.eINSTANCE.createLatencyDeviation();
		latency.setCycles(cycles);;
		return latency;
	}

	/**
	 * Returns a newly created Deviation.
	 * @param dist
	 */
	public static Deviation<LongObject> createDeviation(Distribution<LongObject> dist) {
		Deviation<LongObject> result = AmaltheaFactory.eINSTANCE.createDeviation();
		// set distribution
		result.setDistribution(dist);
		return result;
	}

	/**
	 * Returns a newly created Deviation.
	 * @param dist
	 * @param min
	 * @param max
	 */
	public static Deviation<LongObject> createDeviation(Distribution<LongObject> dist, long min, long max) {
		Deviation<LongObject> result = AmaltheaFactory.eINSTANCE.createDeviation();
		// set distribution
		result.setDistribution(dist);
		// set bounds (clipping)
		LongObject upperBound = AmaltheaFactory.eINSTANCE.createLongObject();
		upperBound.setValue(max);
		LongObject lowerBound = AmaltheaFactory.eINSTANCE.createLongObject();
		lowerBound.setValue(min);
		result.setUpperBound(upperBound);
		result.setLowerBound(lowerBound);
		return result;
	}

	public static GaussDistribution<LongObject> createGaussDistribution(long mean, long sd) {
		GaussDistribution<LongObject> result = AmaltheaFactory.eINSTANCE.createGaussDistribution();
		// set parameters
		LongObject meanObj = AmaltheaFactory.eINSTANCE.createLongObject();
		meanObj.setValue(mean);
		result.setMean(meanObj);
		LongObject sdObj = AmaltheaFactory.eINSTANCE.createLongObject();
		sdObj.setValue(sd);
		result.setSd(sdObj);
		return result;
	}

	public static DiscreteGaussDistribution createDiscreteGaussDistribution(double mean, double sd) {
		DiscreteGaussDistribution result = AmaltheaFactory.eINSTANCE.createDiscreteGaussDistribution();
		// set parameters
		result.setMean(mean);
		result.setSd(sd);
		return result;
	}

	public static DiscreteGaussDistribution createDiscreteGaussDistribution(double mean, double sd, Long min, Long max) {
		DiscreteGaussDistribution result = createDiscreteGaussDistribution(mean, sd);
		// set parameters
		result.setLowerBound(min);
		result.setUpperBound(max);
		return result;
	}

	public static DiscreteConstant createDiscreteConstant(long value) {
		DiscreteConstant result = AmaltheaFactory.eINSTANCE.createDiscreteConstant();
		// set parameters
		result.setValue(value);;
		return result;
	}

	/**
	 * Creates a time out of a value and a unit given as String (lower case).
	 * @param value
	 * @param unit
	 * @return Time
	 */
	public static Time createTime(int value, String unit) {
		TimeUnit tu = null;
		if(unit.toLowerCase().equals("ps")) tu = TimeUnit.PS;
		if(unit.toLowerCase().equals("ns")) tu = TimeUnit.NS;
		if(unit.toLowerCase().equals("us")) tu = TimeUnit.US;
		if(unit.toLowerCase().equals("ms")) tu = TimeUnit.MS;
		if(unit.toLowerCase().equals("s")) tu = TimeUnit.S;
		if(tu == null) tu = TimeUnit.MS;	//default millisecond
		
		return TimeUtil.adjustTimeUnit(BigInteger.valueOf(value), tu);
	}

	public static Time createTime(BigInteger value, String unit) {
		TimeUnit tu = null;
		if(unit.toLowerCase().equals("ps")) tu = TimeUnit.PS;
		if(unit.toLowerCase().equals("ns")) tu = TimeUnit.NS;
		if(unit.toLowerCase().equals("us")) tu = TimeUnit.US;
		if(unit.toLowerCase().equals("ms")) tu = TimeUnit.MS;
		if(unit.toLowerCase().equals("s")) tu = TimeUnit.S;
		if(tu == null) tu = TimeUnit.MS;	//default millisecond
		
		return TimeUtil.adjustTimeUnit(new BigInteger(value.toByteArray()), tu);
	}

	/**
	 * Creates a Time object parsed from a text representation. 
	 * @param timeString string representation of a time (number follwed by time unit s, ms, us, ns or ps)  
	 * @return returns the respective Time object
	 * 
	 */
	public static Time createTime(String timeString) {
		Pattern p = Pattern.compile("(\\d+)\\s?(s|ms|us|ns|ps)");
		Matcher m = p.matcher(timeString);
		if(m.matches()) {
			String value = m.group(1);
			String unit = m.group(2);
			return createTime(Integer.parseInt(value), unit);
		}
		return null;
	}
	
	public static Time createTime(Time inputTime) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(inputTime.getValue());
		time.setUnit(inputTime.getUnit());
		return time;
	}

	/**
	 * 
	 * @param executionNeedCount	absolute number of executionNeedCount (simular to instructions)
	 * @param scaleFactor			simular to ipc	
	 * @param frequency				frequency in Hertz (=1/s)
	 * Note: the function will round up the runtime e.g if the (executionNeedCount/ipc) / frequency &lt; 1 =&gt; the runtime is 0
	 */
	public static Time createTime(long executionNeedCount, double scaleFactor, long frequency) {
		double cycles = (((double)executionNeedCount)/scaleFactor);
		
		List<TimeUnit> units = TimeUtil.getTimeUnitList();
		int timeUnitIndex = units.indexOf(TimeUnit.S);
		
		while(frequency % 1000 == 0 && (frequency > 0)) {		//as long as frequency is multiple of 1000
			timeUnitIndex++;
			frequency = frequency / 1000L;
		}
		double runtime = ((double)cycles) / ((double)frequency);

		return TimeUtil.adjustTimeUnit(runtime, units.get(timeUnitIndex));
	}

	/**
	 * Returns a created Weibull Deviation.
	 * @param min
	 * @param avg
	 * @param max
	 * @param promille
	 */
	@Deprecated
	public static Deviation<LongObject> createWeibullDeviation(long min, long avg, long max, float promille) {
		Deviation<LongObject> result = AmaltheaFactory.eINSTANCE.createDeviation();
		result.setDistribution(createWeibullEstimator(avg, promille));
		LongObject uB = AmaltheaFactory.eINSTANCE.createLongObject();
		uB.setValue(max);
		LongObject lB = AmaltheaFactory.eINSTANCE.createLongObject();
		lB.setValue(min);
		result.setUpperBound(uB);
		result.setLowerBound(lB);
		return result;
	}

	public static DiscreteWeibullEstimatorsDistribution createWeibullDistribution(long min, double avg, long max, double promille) {
		DiscreteWeibullEstimatorsDistribution result = AmaltheaFactory.eINSTANCE.createDiscreteWeibullEstimatorsDistribution();
		result.setLowerBound(min);
		result.setAverage(avg);
		result.setUpperBound(max);
		result.setPRemainPromille(promille);
		return result;
	}
	
	
	/**
	 * Returns a created Weibull Estimator.
	 * @param avgR
	 * @param promille
	 */
	@Deprecated
	public static WeibullEstimators<LongObject> createWeibullEstimator(long avgR, float promille) 
	{
		WeibullEstimators<LongObject> weibull = AmaltheaFactory.eINSTANCE.createWeibullEstimators();
		LongObject mean = AmaltheaFactory.eINSTANCE.createLongObject();
		mean.setValue(avgR);
		weibull.setMean(mean);
		if (promille > 0)
			weibull.setPRemainPromille(promille);
		return weibull;
	}

	/**
	 * Creates ExecutionNeed for a featureCategoryName, need set.
	 * @param featureCategory
	 * @param usages
	 */
	public static ExecutionNeed createExecutionNeed(String featureCategory, DiscreteDeviation usages) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getNeeds().put(featureCategory, usages);
		return exeNeed;
	}
	
	/**
	 * Creates ExecutionNeed for a feature, need set.
	 * @param feature
	 * @param usages
	 */
	public static ExecutionNeed createExecutionNeed(HwFeature feature, DiscreteDeviation usages) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getNeeds().put(feature.getContainingCategory().getName(), usages);
		return exeNeed;
	}
	
}
