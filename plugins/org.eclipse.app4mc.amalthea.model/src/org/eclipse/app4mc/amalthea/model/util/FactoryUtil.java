/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.NeedConstant;
import org.eclipse.app4mc.amalthea.model.NeedDeviation;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;

public class FactoryUtil {

	/**
	 * creates a time out of a value and a unit given as String (lower case)
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
	 * creates a Time object parsed from a text representation  
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
	 * @param executionNeedCount	-	absolute number of executionNeedCount (simular to instructions)
	 * @param scaleFactor		- simular to ipc	
	 * @param frequency			-	frequency in Hertz (=1/s)
	 * Note: the function will round up the runtime e.g if the (executionNeedCount/ipc) / frequency < 1 => the runtime is 0
	 * @return
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
	 * returns a created Weibull Deviation.
	 * @param min
	 * @param avg
	 * @param max
	 * @param promille
	 * @return   
	 */
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
	
	
	
	/**
	 * returns a created Weibull Estimator.
	 * @param avgR
	 * @param promille
	 * @return WeibullEstimators<LongObject>  
	 */
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
	 * returns a created Weibull NeedDeviation.
	 * @param min
	 * @param avg
	 * @param max
	 * @param promille
	 * @return  
	 */
	public static NeedDeviation createExecutionNeedWeibullDeviation(long min, long avg, long max, float promille) {
		NeedDeviation needDev = AmaltheaFactory.eINSTANCE.createNeedDeviation();
		needDev.setDeviation(createWeibullDeviation(min, avg, max, promille));
		return needDev;
	}
	
	/**
	 * creates NeedConstant element
	 * @param needValue
	 * @return NeedConstant
	 */
	public static NeedConstant createExecutionNeedConstant(long needValue) {
		NeedConstant needConst = AmaltheaFactory.eINSTANCE.createNeedConstant();
		needConst.setValue(needValue);
		return needConst;
	}
	
	/**
	 * creates ExecutionNeed for a featureCategory, need set
	 * @param featureCategory
	 * @param need
	 * @return ExecutionNeed
	 */
	public static ExecutionNeed createExecutionNeed(HwFeatureCategory featureCategory, Need need) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getDefault().put(featureCategory, need);
		return exeNeed;
	}
	
	/**
	 * creates ExecutionNeed for a feature, need set
	 * @param feature
	 * @param need
	 * @return ExecutionNeed
	 */
	public static ExecutionNeed createExecutionNeed(HwFeature feature, Need need) {
		ExecutionNeed exeNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		exeNeed.getDefault().put(feature.getContainingCategory(), need);
		return exeNeed;
	}
	

	
}
