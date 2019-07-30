/**
 ********************************************************************************
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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.ClockStep;
import org.eclipse.app4mc.amalthea.model.Counter;
import org.eclipse.app4mc.amalthea.model.DataRate;
import org.eclipse.app4mc.amalthea.model.DataRateUnit;
import org.eclipse.app4mc.amalthea.model.DataSize;
import org.eclipse.app4mc.amalthea.model.DataSizeUnit;
import org.eclipse.app4mc.amalthea.model.DiscreteValueBoundaries;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBoundaries;
import org.eclipse.app4mc.amalthea.model.TimeConstant;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.Voltage;
import org.eclipse.app4mc.amalthea.model.VoltageUnit;

public class FactoryUtil {

	/**
	 * Creates a counter (with offset = 0)
	 */
	public static Counter createCounter(long prescaler) {
		return createCounter(prescaler, 0);
	}
	
	/**
	 * Creates a counter
	 */
	public static Counter createCounter(long prescaler, long offset) {
		Counter counter = AmaltheaFactory.eINSTANCE.createCounter();
		counter.setPrescaler(prescaler);
		counter.setOffset(offset);
		return counter;
	}

	/**
	 * Creates a data size (initialized with zero value and base unit)
	 */
	public static DataSize createDataSize() {
		DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		size.setValue(BigInteger.ZERO);
		size.setUnit(DataSizeUnit.BIT);
		return size;
	}

	/**
	 * Creates a data size out of a value and a unit
	 */
	public static DataSize createDataSize(long value, DataSizeUnit unit) {
		DataSize size = AmaltheaFactory.eINSTANCE.createDataSize();
		size.setValue(BigInteger.valueOf(value));
		size.setUnit(unit);
		return size;
	}

	/**
	 * Creates a data rate (initialized with zero value and base unit)
	 */
	public static DataRate createDataRate() {
		DataRate rate = AmaltheaFactory.eINSTANCE.createDataRate();
		rate.setValue(BigInteger.ZERO);
		rate.setUnit(DataRateUnit.BIT_PER_SECOND);
		return rate;
	}

	/**
	 * Creates a data rate out of a value and a unit
	 */
	public static DataRate createDataRate(long value, DataRateUnit unit) {
		DataRate rate = AmaltheaFactory.eINSTANCE.createDataRate();
		rate.setValue(BigInteger.valueOf(value));
		rate.setUnit(unit);
		return rate;
	}

	/**
	 * Creates a frequency (initialized with zero value and base unit)
	 */
	public static Frequency createFrequency() {
		Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
		frequency.setUnit(FrequencyUnit.HZ);
		return frequency;
	}

	/**
	 * Creates a frequency out of a value and a unit
	 */
	public static Frequency createFrequency(double value, FrequencyUnit unit) {
		Frequency frequency = AmaltheaFactory.eINSTANCE.createFrequency();
		frequency.setValue(value);
		frequency.setUnit(unit);
		return frequency;
	}

	/**
	 * Creates a voltage (initialized with zero value and base unit)
	 */
	public static Voltage createVoltage() {
		Voltage voltage = AmaltheaFactory.eINSTANCE.createVoltage();
		voltage.setUnit(VoltageUnit.UV);
		return voltage;
	}

	/**
	 * Creates a voltage out of a value and a unit
	 */
	public static Voltage createVoltage(double value, VoltageUnit unit) {
		Voltage voltage = AmaltheaFactory.eINSTANCE.createVoltage();
		voltage.setValue(value);
		voltage.setUnit(unit);
		return voltage;
	}

	/**
	 * Creates a time (initialized with zero value and base unit)
	 */
	public static Time createTime() {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(BigInteger.ZERO);
		time.setUnit(TimeUnit.PS);
		return time;
	}

	/**
	 * Creates a new time based on a time
	 * @param inputTime
	 * @return New time object
	 */
	public static Time createTime(Time inputTime) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(inputTime.getValue());
		time.setUnit(inputTime.getUnit());
		return time;
	}

	/**
	 * Creates a time out of a value and a unit
	 */
	public static Time createTime(long value, TimeUnit unit) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(BigInteger.valueOf(value));
		time.setUnit(unit);
		return time;
	}

	/**
	 * Creates a time out of a value and a unit (converted to pico seconds)
	 */
	public static Time createTime(double value, TimeUnit unit) {
		if (unit == TimeUnit._UNDEFINED_)  return null;

		// convert to pico seconds
		int power = AmaltheaServices.TIME_UNIT_LIST.indexOf(unit);
		double factor = Math.pow(1000, power);
		long newValue = Math.round(value * factor);

		return createTime(newValue, TimeUnit.PS);
	}

	/**
	 * Creates a time out of a value and a unit
	 */
	public static Time createTime(BigInteger value, TimeUnit unit) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(value);
		time.setUnit(unit);
		return time;
	}

	/**
	 * Creates a time out of a value and a unit given as String.
	 */
	public static Time createTime(long value, String unit) {
		return createTime(value, parseTimeUnit(unit));
	}

	/**
	 * Creates a time out of a value and a unit given as String.
	 */
	public static Time createTime(double value, String unit) {
		return createTime(value, parseTimeUnit(unit));
	}

	/**
	 * Creates a time out of a value and a unit given as String.
	 */
	public static Time createTime(BigInteger value, String unit) {
		return createTime(value, parseTimeUnit(unit));
	}

	/**
	 * Creates a Time object parsed from a text representation. 
	 * @param timeString	string representation of a time (number followed by time unit s, ms, us, ns or ps)  
	 * @return The new Time object
	 * 
	 */
	public static Time createTime(String timeString) {
		Pattern p = Pattern.compile("(-?\\d+)(\\.\\d+)?\\s?(s|ms|us|ns|ps)");
		Matcher m = p.matcher(timeString);
		if(m.matches()) {
			String value = m.group(1);
			String fraction = m.group(2);
			String unit = m.group(3);
			if (fraction == null) {
				return createTime(Long.parseLong(value), parseTimeUnit(unit));
			} else {
				return createTime(Double.parseDouble(value + fraction), parseTimeUnit(unit));
			}
		}
		return null;
	}

	private static TimeUnit parseTimeUnit(String input) {
		if (input == null) return TimeUnit.MS;	//default millisecond
		
		String unit = input.trim().toLowerCase();
		if(unit.equals("ps")) return TimeUnit.PS;
		if(unit.equals("ns")) return TimeUnit.NS;
		if(unit.equals("us")) return TimeUnit.US;
		if(unit.equals("ms")) return TimeUnit.MS;
		if(unit.equals("s")) return TimeUnit.S;
	
		return null;
	}
	
	public static ClockStep createClockStep(double freqValue, FrequencyUnit freqUnit, long timeValue, String timeUnit) {
		ClockStep clockStep = AmaltheaFactory.eINSTANCE.createClockStep();
		clockStep.setFrequency(createFrequency(freqValue, freqUnit));
		clockStep.setTime(createTime(timeValue, timeUnit));
		return clockStep;
	}

	/**
	 * Creates a TypeRef object that refers to a type definition
	 */
	public static TypeRef createTypeRef(TypeDefinition typeDefinition) {
		TypeRef refObj = AmaltheaFactory.eINSTANCE.createTypeRef();
		refObj.setTypeDef(typeDefinition);;
		return refObj;
	}

	public static DiscreteValueConstant createDiscreteValueConstant(long value) {
		DiscreteValueConstant result = AmaltheaFactory.eINSTANCE.createDiscreteValueConstant();
		result.setValue(value);;
		return result;
	}

	public static DiscreteValueBoundaries createDiscreteValueBoundaries(long min, long max) {
		DiscreteValueBoundaries boundaries = AmaltheaFactory.eINSTANCE.createDiscreteValueBoundaries();
		boundaries.setLowerBound(min);
		boundaries.setUpperBound(max);
		return boundaries;
	}

	public static DiscreteValueGaussDistribution createDiscreteValueGaussDistribution(double mean, double sd) {
		DiscreteValueGaussDistribution result = AmaltheaFactory.eINSTANCE.createDiscreteValueGaussDistribution();
		result.setMean(mean);
		result.setSd(sd);
		return result;
	}

	public static DiscreteValueGaussDistribution createDiscreteValueGaussDistribution(double mean, double sd, Long min, Long max) {
		DiscreteValueGaussDistribution result = createDiscreteValueGaussDistribution(mean, sd);
		result.setLowerBound(min);
		result.setUpperBound(max);
		return result;
	}

	public static DiscreteValueWeibullEstimatorsDistribution createWeibullDistribution(long min, double avg, long max, double promille) {
		DiscreteValueWeibullEstimatorsDistribution result = AmaltheaFactory.eINSTANCE.createDiscreteValueWeibullEstimatorsDistribution();
		result.setLowerBound(min);
		result.setAverage(avg);
		result.setUpperBound(max);
		result.setPRemainPromille(promille);
		return result;
	}
	
	public static TimeConstant createTimeConstant(Time value) {
		TimeConstant result = AmaltheaFactory.eINSTANCE.createTimeConstant();
		result.setValue(value);;
		return result;
	}
	
	public static TimeBoundaries createTimeBoundaries(Time min, Time max) {
		TimeBoundaries boundaries = AmaltheaFactory.eINSTANCE.createTimeBoundaries();
		boundaries.setLowerBound(min);
		boundaries.setUpperBound(max);
		return boundaries;
	}
	
	public static TimeGaussDistribution createTimeGaussDistribution(Time mean, Time sd) {
		TimeGaussDistribution result = AmaltheaFactory.eINSTANCE.createTimeGaussDistribution();
		result.setMean(mean);
		result.setSd(sd);
		return result;
	}
	
	public static TimeGaussDistribution createTimeGaussDistribution(Time mean, Time sd, Time min, Time max) {
		TimeGaussDistribution result = createTimeGaussDistribution(mean, sd);
		result.setLowerBound(min);
		result.setUpperBound(max);
		return result;
	}
	
	public static TimeWeibullEstimatorsDistribution createWeibullDistribution(Time min, Time avg, Time max, double promille) {
		TimeWeibullEstimatorsDistribution result = AmaltheaFactory.eINSTANCE.createTimeWeibullEstimatorsDistribution();
		result.setLowerBound(min);
		result.setAverage(avg);
		result.setUpperBound(max);
		result.setPRemainPromille(promille);
		return result;
	}

	/**
	 * Creates ExecutionNeed for a featureCategoryName, need set.
	 */
	public static ExecutionNeed createExecutionNeed(String featureCategory, IDiscreteValueDeviation usages) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getNeeds().put(featureCategory, usages);
		return exeNeed;
	}
	
	/**
	 * Creates ExecutionNeed for a feature, need set.
	 */
	public static ExecutionNeed createExecutionNeed(HwFeature feature, IDiscreteValueDeviation usages) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getNeeds().put(feature.getContainingCategory().getName(), usages);
		return exeNeed;
	}

	public static DiscreteValueConstant createLatency(long value) {
		return createDiscreteValueConstant(value);
	}
	
}
