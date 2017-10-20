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

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;

public class TimeUtil {

	/**
	 * compares two Times 
	 * @param Time t1
	 * @param Time t2
	 * @return 0 if both are equal, >0 if t1>t2, <0 if t1<t2
	 * 
	 */
	public static Long compareTime(AbstractTime t1, AbstractTime t2) {
		List<TimeUnit> unitList = getTimeUnitList();
		if(t1 == null && t2 == null) {
			return 0L;
		}
		if(t1 == null && t2 != null) {
			return -1L;
		}
		if(t1 != null && t2 == null) {
			return 1L;
		}
		
		int f1 = unitList.indexOf(t1.getUnit());
		int f2 = unitList.indexOf(t2.getUnit());
		BigInteger f3,f4;
		
		if(f1>f2) {
			f3 = BigInteger.valueOf((long) Math.pow(1000, f1-f2));
			f4 = BigInteger.valueOf(1L);
		} else {
			f3 = BigInteger.valueOf(1L);
			f4 = BigInteger.valueOf((long) Math.pow(1000, f2-f1));
		}
		f4 = f4.multiply(t1.getValue());
		f3 = f3.multiply(t2.getValue());
		
		return f4.subtract(f3).longValue();
	}
	
	/**
	 * Note that: 
	 * */
	public static Time addTimes(AbstractTime time1, AbstractTime time2) {
		fixTimeUnit(time1);
		fixTimeUnit(time2);

		List<TimeUnit> units = getTimeUnitList();
		int unit1index = units.indexOf(time1.getUnit());
		int unit2index = units.indexOf(time2.getUnit());
		
		int targetIndex = Math.max(unit1index, unit2index);
	
		AbstractTime t1 = convertToTimeUnit(time1, units.get(targetIndex));
		AbstractTime t2 = convertToTimeUnit(time2, units.get(targetIndex));
		Time t = adjustTimeUnit(t1.getValue().add(t2.getValue()), units.get(targetIndex));
		
		return t;
	}
	

	public static AbstractTime subtractTimes(AbstractTime time1, AbstractTime time2) {
		fixTimeUnit(time1);
		fixTimeUnit(time2);
		
		List<TimeUnit> units = getTimeUnitList();
		int unit1index = units.indexOf(time1.getUnit());
		int unit2index = units.indexOf(time2.getUnit());
		
		if(unit1index >= unit2index) {
			AbstractTime t1 = convertToTimeUnit(time1, time1.getUnit());
			AbstractTime t2 = convertToTimeUnit(time2, time1.getUnit());
			return adjustTimeUnit(t1.getValue().subtract(t2.getValue()), time1.getUnit());
		} else {
			AbstractTime t1 = convertToTimeUnit(time1, time2.getUnit());
			AbstractTime t2 = convertToTimeUnit(time2, time2.getUnit());
			return adjustTimeUnit(t1.getValue().subtract(t2.getValue()), time2.getUnit());
		}
	}
	
	
	
	/**
	 * Multiplies a Time object by a factor of type long. Checks if there
	 * is an integer overflow.
	 * 
	 * @param Time
	 * @param Value
	 * @return Time
	 */
	public static Time multiplyTime(AbstractTime time, double value) {

		if(value <= 0) {
			//should not happen
			return null;
		}
		
		BigDecimal bdTime = new BigDecimal(time.getValue());
		BigDecimal bdValue = new BigDecimal(value);
		bdTime = bdTime.multiply(bdValue, MathContext.DECIMAL128);
		Time newTime = adjustTimeUnit(bdTime.toBigInteger(), time.getUnit());
		
		return newTime;
	}
	
	/**
	 * Divides time1 by time 2
	 * @param time1
	 * @param time2
	 * @return factor between the two times
	 */
	public static double divideTimes(AbstractTime time1, AbstractTime time2) {
		List<TimeUnit> units = getTimeUnitList();
		int unit1index = units.indexOf(time1.getUnit());
		int unit2index = units.indexOf(time2.getUnit());
				
		if(unit1index >= unit2index) {					//time1 has a smaller unit (e.g. "us" vs. "ms")
			BigDecimal bd1 = new BigDecimal(time1.getValue());			// -> scale time2.getValue()
			BigDecimal bd2 = new BigDecimal(time2.getValue());
			bd2 = bd2.scaleByPowerOfTen((unit1index-unit2index)*3);
			return bd1.divide(bd2, MathContext.DECIMAL128).doubleValue();
		} else {										// else -> scale time1.getValue()
			BigDecimal bd1 = new BigDecimal(time1.getValue());			// -> scale time2.getValue()
			BigDecimal bd2 = new BigDecimal(time2.getValue());
			bd1 = bd1.scaleByPowerOfTen((unit2index-unit1index)*3);
			return bd1.divide(bd2, MathContext.DECIMAL128).doubleValue();
		}
			
	}
	
	/**
	 * Prints Time object nicely.
	 */
	public static String timeToString(AbstractTime time) {
		if(time == null) {
			return "null";
		}
		return time.getValue() + time.getUnit().getName();
	}

	
	/**
	 * get a list with all possible Units
	 * @return TimeUnit.VALUES
	 */
	public static List<TimeUnit> getTimeUnitList() {	
		return TimeUnit.VALUES;
	}
	
	/**
	 * Checks the given time parameter, if the values are set correctly. 
	 * I.e. if Value == 0 und TimeUnit is undefined -> set TimeUnit to ms;
	 * @param time
	 */
	private static void fixTimeUnit(AbstractTime time) {
		if(time != null &&
				time.getValue() != null && 
				time.getValue().intValue() == 0 && 
				time.getUnit().equals(TimeUnit._UNDEFINED_)) {
			time.setUnit(TimeUnit.MS);
		}
	}
	
	
	/**
	 * This methods adjusts the value to the first storable format
	 * if (value < 1) then scale by 1000 and check again  
	 * @param value
	 * @param timeUnit
	 * @return
	 */
	public static Time adjustTimeUnit(double runtime, TimeUnit timeUnit) {
		List<TimeUnit> units = getTimeUnitList();
		int timeUnitIndex = units.indexOf(timeUnit);
		
		while(((runtime - Math.floor(runtime)) > 0) &&
				(timeUnitIndex < units.size()-1)) {
			runtime = runtime * 1000.0;
			timeUnitIndex++;
		}

		return adjustTimeUnit(BigInteger.valueOf((long)(runtime)), units.get(timeUnitIndex));
	}
	
	/**
	 *  This method takes a time (in value and unit) and adjusts the TimeUnit 
	 *  so that the value is as small as possible, without losing precision
	 *  e.g. 1000µs is converted to 1ms
	 * @param runtime
	 * @param timeUnit
	 * @return new Time with adjusted value and unit
	 */
	public static Time adjustTimeUnit(BigInteger runtime, TimeUnit timeUnit) {
		BigInteger maxInt = BigInteger.valueOf(Integer.MAX_VALUE);
		List<TimeUnit> units = getTimeUnitList();
		int startTimeUnitIndex = units.indexOf(TimeUnit.S);
		int timeUnitIndex = units.indexOf(timeUnit);
				
		while(((runtime.compareTo(maxInt) > 0) || runtime.mod(BigInteger.valueOf(1000)).compareTo(BigInteger.valueOf(0)) == 0) &&
				(runtime.compareTo(BigInteger.valueOf(1000)) >= 0) &&
				(timeUnitIndex > startTimeUnitIndex)) {
			runtime = runtime.divide(BigInteger.valueOf(1000));
			timeUnitIndex--;
		}
			
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(runtime);
		time.setUnit(units.get(timeUnitIndex));
		return time;
	}
		
	
	/**
	 * Converts a Time object to the given TimeUnit.
	 * Note: when convert from small unit to bigger unit, the function will round the number e.g 5200Ps = 5Ns
	 */
	public static AbstractTime convertToTimeUnit(AbstractTime time, TimeUnit unit) {
		if (time.getUnit() == unit) {
			// Units are the same, no conversion
			return time;
		}
		
		Time newTime = AmaltheaFactory.eINSTANCE.createTime();
		
		List<TimeUnit> units = getTimeUnitList();
		int power = units.indexOf(unit) - units.indexOf(time.getUnit()); 
		// Get the difference from the source TimeUnit to the destination TimeUnit as a factor
		//val int power = Arrays.asList(TimeUnit.values()).indexOf(time.unit) - Arrays.asList(TimeUnit.values()).indexOf(unit);
		double factor = Math.pow(1000, power);
		
		// Convert
		if(factor >= 1.0) { 
			newTime.setValue(time.getValue().multiply(new BigInteger(""+((long)factor))));
		} else {
			factor = 1 / factor;
			newTime.setValue(time.getValue().divide(new BigInteger(""+((long)factor))));
		}
		newTime.setUnit(unit);
		
		return newTime;
	}
}
