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

package org.eclipse.app4mc.amalthea.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;

public class AmaltheaServices {

	private static final List<TimeUnit> TIME_UNIT_LIST = Arrays.asList(
			TimeUnit.PS, TimeUnit.NS, TimeUnit.US, TimeUnit.MS, TimeUnit.S);
	
	public static <T extends EObject> T getContainerOfType(EObject object, Class<T> type) {
		if (type == null || object == null) return null;
		
		for (EObject parent = object.eContainer(); parent != null; parent = parent.eContainer()) {
			if (type.isInstance(parent))
				return type.cast(parent);
		}
		return null;
	}
	
	public static BigInteger convertToBit(DataSize size) {
		if (size == null || size.getValue() == null)
			return null;

		BigInteger bitBase = size.getValue();
		BigInteger byteBase = size.getValue().multiply(BigInteger.valueOf(8));

		switch (size.getUnit()) {
		case _UNDEFINED_:
			return null;
		case BIT:
			return bitBase;
		case KBIT:
			return bitBase.multiply(BigInteger.TEN.pow(3));
		case MBIT:
			return bitBase.multiply(BigInteger.TEN.pow(6));
		case GBIT:
			return bitBase.multiply(BigInteger.TEN.pow(9));
		case TBIT:
			return bitBase.multiply(BigInteger.TEN.pow(12));

		case KIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(10));
		case MIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(20));
		case GIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(30));
		case TIBIT:
			return bitBase.multiply(BigInteger.valueOf(2).pow(40));

		case B:
			return byteBase;
		case KB:
			return byteBase.multiply(BigInteger.TEN.pow(3));
		case MB:
			return byteBase.multiply(BigInteger.TEN.pow(6));
		case GB:
			return byteBase.multiply(BigInteger.TEN.pow(9));
		case TB:
			return byteBase.multiply(BigInteger.TEN.pow(12));

		case KI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(10));
		case MI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(20));
		case GI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(30));
		case TI_B:
			return byteBase.multiply(BigInteger.valueOf(2).pow(40));
		}

		return null;
	}

	public static BigInteger convertToBitPerSecond(DataRate rate) {
		if (rate == null || rate.getValue() == null)
			return null;

		BigInteger bitBase = rate.getValue();
		BigInteger byteBase = rate.getValue().multiply(BigInteger.valueOf(8));

		switch (rate.getUnit()) {
		case _UNDEFINED_:
			return null;
		case BIT_PER_SECOND:
			return bitBase;
		case KBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.TEN.pow(3));
		case MBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.TEN.pow(6));
		case GBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.TEN.pow(9));
		case TBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.TEN.pow(12));

		case KIBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.valueOf(2).pow(10));
		case MIBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.valueOf(2).pow(20));
		case GIBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.valueOf(2).pow(30));
		case TIBIT_PER_SECOND:
			return bitBase.multiply(BigInteger.valueOf(2).pow(40));

		case BPER_SECOND:
			return byteBase;
		case KB_PER_SECOND:
			return byteBase.multiply(BigInteger.TEN.pow(3));
		case MB_PER_SECOND:
			return byteBase.multiply(BigInteger.TEN.pow(6));
		case GB_PER_SECOND:
			return byteBase.multiply(BigInteger.TEN.pow(9));
		case TB_PER_SECOND:
			return byteBase.multiply(BigInteger.TEN.pow(12));

		case KI_BPER_SECOND:
			return byteBase.multiply(BigInteger.valueOf(2).pow(10));
		case MI_BPER_SECOND:
			return byteBase.multiply(BigInteger.valueOf(2).pow(20));
		case GI_BPER_SECOND:
			return byteBase.multiply(BigInteger.valueOf(2).pow(30));
		case TI_BPER_SECOND:
			return byteBase.multiply(BigInteger.valueOf(2).pow(40));
		}

		return null;
	}

	/**
	 * This method is used to convert the value of Time/TimeObject element's value
	 * to BigInteger in Pico Seconds
	 * 
	 * @param time
	 *            Time object
	 * @return value BigInteger in Pico Seconds
	 */
	public static BigInteger convertToPicoSeconds(Time time) {

		BigInteger timeValue = time.getValue();

		if (timeValue != null) {

			switch (time.getUnit()) {
			case _UNDEFINED_:
				return null;
			case PS:
				return timeValue;
			case NS:
				return timeValue.multiply(BigInteger.TEN.pow(3));
			case US:
				return timeValue.multiply(BigInteger.TEN.pow(6));
			case MS:
				return timeValue.multiply(BigInteger.TEN.pow(9));
			case S:
				return timeValue.multiply(BigInteger.TEN.pow(12));
			}

		}

		return null;
	}

	public static BigDecimal convertToHertz(Frequency frequency) {
		if (frequency == null)
			return null;

		double freqValue = frequency.getValue();

		switch (frequency.getUnit()) {
		case _UNDEFINED_:
			return null;
		case HZ:
			return BigDecimal.valueOf(freqValue);
		case KHZ:
			return BigDecimal.valueOf(freqValue).multiply(BigDecimal.TEN.pow(3));
		case MHZ:
			return BigDecimal.valueOf(freqValue).multiply(BigDecimal.TEN.pow(6));
		case GHZ:
			return BigDecimal.valueOf(freqValue).multiply(BigDecimal.TEN.pow(9));
		}

		return null;
	}

	public static BigDecimal convertToMicroVolt(Voltage voltage) {
		if (voltage == null)
			return null;

		double voltValue = voltage.getValue();

		switch (voltage.getUnit()) {
		case _UNDEFINED_:
			return null;
		case UV:
			return BigDecimal.valueOf(voltValue);
		case MV:
			return BigDecimal.valueOf(voltValue).multiply(BigDecimal.TEN.pow(3));
		case V:
			return BigDecimal.valueOf(voltValue).multiply(BigDecimal.TEN.pow(6));
		}

		return null;
	}

	/**
	 * This method is used to compare Time objects on the basis of their values
	 * (obtained in pico seconds after applying the conversion based on TimeUnit)
	 * 
	 * @param t1
	 *            Time object
	 * @param t2
	 *            Time object
	 * @return -1 ,0 or 1
	 */
	public static int compareTimes(final Time t1, final Time t2) {
		if (t1 == null || t2 == null) {
			throw new NullPointerException();
		}

		if (t1.getUnit() == TimeUnit._UNDEFINED_) {
			throw new RuntimeException("Undefined time unit : " + t1);
		}

		if (t2.getUnit() == TimeUnit._UNDEFINED_) {
			throw new RuntimeException("Undefined time unit : " + t2);
		}

		if (t1 == t2) {
			return 0;
		}

		BigInteger value1 = convertToPicoSeconds(t1);
		BigInteger value2 = convertToPicoSeconds(t2);

		assert value1 != null;
		assert value2 != null;

		return value1.compareTo(value2);
	}

	/**
	 *  This method takes a time (in value and unit) and adjusts the TimeUnit 
	 *  so that the value is as small as possible, without losing precision
	 *  e.g. 1000us is converted to 1ms
	 * @param time
	 * @return new Time with adjusted value and unit
	 */
	public static Time adjustTimeUnit(Time time) {
		if (time.getValue() == BigInteger.ZERO) return time;
		if (time.getUnit() == TimeUnit._UNDEFINED_) return time;
		
		int index = TIME_UNIT_LIST.indexOf(time.getUnit());
		int maxIndex = TIME_UNIT_LIST.size() - 1;
		BigInteger value = time.getValue();
		BigInteger bigInt1000 = BigInteger.TEN.pow(3);
		
		while (value.mod(bigInt1000) == BigInteger.ZERO && index < maxIndex) {
			value = value.divide(bigInt1000);
			index++;
		}
		
		return createTime(value, TIME_UNIT_LIST.get(index));
	}

	public static Time addTime(Time t1, Time t2) {
		return applyToTimes(BigInteger::add, t1, t2);
	}

	public static Time subtractTime(Time t1, Time t2) {
		return applyToTimes(BigInteger::subtract, t1, t2);
	}

	public static double divideTime(Time t1, Time t2) {
		if (t1.getUnit() == TimeUnit._UNDEFINED_) return 0;
		if (t2.getUnit() == TimeUnit._UNDEFINED_) return 0;
		
		double v1 = convertToPicoSeconds(t1).doubleValue();
		double v2 = convertToPicoSeconds(t2).doubleValue();
		
		return v1 / v2;
	}

	public static Time multiply(Time t1, long value) {
		BigInteger v1 = t1.getValue();
		BigInteger v2 = BigInteger.valueOf(value);
		
		return createTime(v1.multiply(v2) , t1.getUnit());
	}

	public static Time multiply(Time t1, double value) {
		if (t1.getUnit() == TimeUnit._UNDEFINED_) {
			BigInteger newValue = BigDecimal.valueOf(t1.getValue().doubleValue() * value).toBigInteger();
			return createTime(newValue, TimeUnit._UNDEFINED_);
		}
		
		BigDecimal v1 = BigDecimal.valueOf(convertToPicoSeconds(t1).doubleValue());
		BigDecimal v2 = BigDecimal.valueOf(value);
		
		return createTime(v1.multiply(v2).toBigInteger(), TimeUnit.PS);
	}

	private static Time applyToTimes(BinaryOperator<BigInteger> func, Time t1, Time t2) {
		if (t1.getUnit() == TimeUnit._UNDEFINED_) return null;
		if (t2.getUnit() == TimeUnit._UNDEFINED_) return null;

		BigInteger v1 = t1.getValue();
		BigInteger v2 = t2.getValue();

		if (t1.getUnit() == t2.getUnit()) {
			return createTime(func.apply(v1, v2), t1.getUnit());
		}

		int index1 = TIME_UNIT_LIST.indexOf(t1.getUnit());
		int index2 = TIME_UNIT_LIST.indexOf(t2.getUnit());
		int minIndex = Math.min(index1, index2);
		v1 = (index1 > minIndex) ? v1.multiply(BigInteger.TEN.pow((index1 - minIndex) * 3)) : v1;
		v2 = (index2 > minIndex) ? v2.multiply(BigInteger.TEN.pow((index2 - minIndex) * 3)) : v2;
		
		return createTime(func.apply(v1, v2), TIME_UNIT_LIST.get(minIndex));
	}

	private static Time createTime(BigInteger value, TimeUnit unit) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(value);
		time.setUnit(unit);
		return time;
	}

	/**
	 * This method is used to compare DataRate objects on the basis of their values
	 * (obtained in bit per second after applying the conversion based on DataRateUnit)
	 * 
	 * @param r1
	 *            DataRate object
	 * @param r2
	 *            DataRate object
	 * @return -1 ,0 or 1
	 */
	public static int compareDataRates(final DataRate r1, final DataRate r2) {
		if (r1 == null || r2 == null) {
			throw new NullPointerException();
		}

		if (r1.getUnit() == DataRateUnit._UNDEFINED_) {
			throw new RuntimeException("Undefined data rate unit : " + r1);
		}

		if (r2.getUnit() == DataRateUnit._UNDEFINED_) {
			throw new RuntimeException("Undefined data rate unit : " + r2);
		}

		if (r1 == r2) {
			return 0;
		}

		BigInteger value1 = convertToBitPerSecond(r1);
		BigInteger value2 = convertToBitPerSecond(r2);

		assert value1 != null;
		assert value2 != null;

		return value1.compareTo(value2);
	}

	public static EList<QualifiedPort> getInnerPorts(ISystem system) {
		List<QualifiedPort> qualifiedPorts = new ArrayList<QualifiedPort>();
		for (ComponentInstance inst : system.getComponentInstances()) {
			if (inst.getType() != null) {
				for (Port port : inst.getType().getPorts()) {
					QualifiedPort qp = AmaltheaFactory.eINSTANCE.createQualifiedPort();
					qp.setInstance(inst);
					qp.setPort(port);
					qualifiedPorts.add(qp);
				}
			}
		}
		return unmodifiableEcoreEList(system, AmaltheaPackage.eINSTANCE.getISystem_InnerPorts(), qualifiedPorts);
	}

	public static EList<HwPort> getInnerPorts(HwStructure struct) {
		List<HwPort> ports = new ArrayList<HwPort>();
		for (HwStructure subStruct : struct.getStructures()) {
			ports.addAll(subStruct.getPorts());
		}
		for (HwModule module : getAllModules(struct)) {
			ports.addAll(module.getPorts());
		}
		return unmodifiableEcoreEList(struct, AmaltheaPackage.eINSTANCE.getHwStructure_InnerPorts(), ports);
	}

	public static EList<HwModule> getAllModules(HwStructure struct) {
		List<HwModule> moduleList = new ArrayList<HwModule>();
		for (HwModule module : struct.getModules()) {
			moduleList.add(module);
			if (module instanceof ProcessingUnit) {
				moduleList.addAll(((ProcessingUnit) module).getCaches());
			}
		}
		return unmodifiableEList(moduleList);
	}

	private static <T> EList<T> unmodifiableEcoreEList(final EObject eObject, final EReference eReference, List<? extends T> result) {
		final int size = result.size();
		final Object[] values = result.toArray();
		return new EcoreEList.UnmodifiableEList<T>((InternalEObject) eObject, eReference, size, values);
	}

	private static <T> EList<T> unmodifiableEList(List<? extends T> list) {
		if (list.isEmpty()) {
			return ECollections.emptyEList();
		} else {
			return ECollections.unmodifiableEList(list);
		}
	}

}
