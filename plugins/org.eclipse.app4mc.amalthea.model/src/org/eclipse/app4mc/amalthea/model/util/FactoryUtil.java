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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
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
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TypeDefinition;
import org.eclipse.app4mc.amalthea.model.TypeRef;
import org.eclipse.app4mc.amalthea.model.Voltage;
import org.eclipse.app4mc.amalthea.model.VoltageUnit;

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

	public static DiscreteValueConstant createLatency(long value) {
		DiscreteValueConstant constant = AmaltheaFactory.eINSTANCE.createDiscreteValueConstant();
		constant.setValue(value);;
		return constant;
	}

	public static DiscreteValueBoundaries createDiscreteValueBoundaries(long min, long max) {
		DiscreteValueBoundaries boundaries = AmaltheaFactory.eINSTANCE.createDiscreteValueBoundaries();
		boundaries.setLowerBound(min);
		boundaries.setUpperBound(max);
		return boundaries;
	}

	public static DiscreteValueGaussDistribution createDiscreteValueGaussDistribution(double mean, double sd) {
		DiscreteValueGaussDistribution result = AmaltheaFactory.eINSTANCE.createDiscreteValueGaussDistribution();
		// set parameters
		result.setMean(mean);
		result.setSd(sd);
		return result;
	}

	public static DiscreteValueGaussDistribution createDiscreteValueGaussDistribution(double mean, double sd, Long min, Long max) {
		DiscreteValueGaussDistribution result = createDiscreteValueGaussDistribution(mean, sd);
		// set parameters
		result.setLowerBound(min);
		result.setUpperBound(max);
		return result;
	}

	public static DiscreteValueConstant createDiscreteValueConstant(long value) {
		DiscreteValueConstant result = AmaltheaFactory.eINSTANCE.createDiscreteValueConstant();
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

	public static DiscreteValueWeibullEstimatorsDistribution createWeibullDistribution(long min, double avg, long max, double promille) {
		DiscreteValueWeibullEstimatorsDistribution result = AmaltheaFactory.eINSTANCE.createDiscreteValueWeibullEstimatorsDistribution();
		result.setLowerBound(min);
		result.setAverage(avg);
		result.setUpperBound(max);
		result.setPRemainPromille(promille);
		return result;
	}

	/**
	 * Creates ExecutionNeed for a featureCategoryName, need set.
	 * @param featureCategory
	 * @param usages
	 */
	public static ExecutionNeed createExecutionNeed(String featureCategory, IDiscreteValueDeviation usages) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getNeeds().put(featureCategory, usages);
		return exeNeed;
	}
	
	/**
	 * Creates ExecutionNeed for a feature, need set.
	 * @param feature
	 * @param usages
	 */
	public static ExecutionNeed createExecutionNeed(HwFeature feature, IDiscreteValueDeviation usages) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getNeeds().put(feature.getContainingCategory().getName(), usages);
		return exeNeed;
	}
	
}
