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

package org.eclipse.app4mc.amalthea.model;

import static com.google.common.base.Preconditions.checkArgument;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BinaryOperator;

import org.apache.commons.math3.distribution.NormalDistribution;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * This class provides static methods that implement operations of the Amalthea
 * EMF model.
 * <p>
 * The methods are called from several generated model objects.
 */
public class AmaltheaServices {
	private static final BigInteger INT_8 = BigInteger.valueOf(8);
	private static final BigInteger INT_2_POW_10 = BigInteger.valueOf(2).pow(10);
	private static final BigInteger INT_2_POW_20 = BigInteger.valueOf(2).pow(20);
	private static final BigInteger INT_2_POW_30 = BigInteger.valueOf(2).pow(30);
	private static final BigInteger INT_2_POW_40 = BigInteger.valueOf(2).pow(40);
	private static final BigInteger INT_10_POW_3 = BigInteger.TEN.pow(3);
	private static final BigInteger INT_10_POW_6 = BigInteger.TEN.pow(6);
	private static final BigInteger INT_10_POW_9 = BigInteger.TEN.pow(9);
	private static final BigInteger INT_10_POW_12 = BigInteger.TEN.pow(12);
	private static final BigDecimal DEC_10_POW_3 = BigDecimal.TEN.pow(3);
	private static final BigDecimal DEC_10_POW_6 = BigDecimal.TEN.pow(6);
	private static final BigDecimal DEC_10_POW_9 = BigDecimal.TEN.pow(9);
	private static final String ARG_NULL_MESSAGE = "Argument is null, expected: %s";
	private static final String ARG_OBJECT_MESSAGE = "Object argument is null, expected: EObject";
	private static final String ARG_CLASS_MESSAGE = "Class argument is null, expected: Class<T extends EObject>";
	private static final String ARG_QUANTITY_MESSAGE = "Invalid %s object: value and unit must be set";
	private static final String DATA_SIZE = DataSize.class.getSimpleName();
	private static final String DATA_RATE = DataRate.class.getSimpleName();
	private static final String TIME = Time.class.getSimpleName();
	private static final String FREQUENCY = Frequency.class.getSimpleName();
	private static final String VOLTAGE = Voltage.class.getSimpleName();

	private static void checkDataSizeArgument(final DataSize size) {
		checkArgument(size != null, ARG_NULL_MESSAGE, DATA_SIZE);
		checkArgument(size.getValue() != null, ARG_QUANTITY_MESSAGE, DATA_SIZE);
		checkArgument(size.getUnit() != DataSizeUnit._UNDEFINED_, ARG_QUANTITY_MESSAGE, DATA_SIZE);
	}

	private static void checkDataRateArgument(final @NonNull DataRate rate) {
		checkArgument(rate != null, ARG_NULL_MESSAGE, DATA_RATE);
		checkArgument(rate.getValue() != null, ARG_QUANTITY_MESSAGE, DATA_RATE);
		checkArgument(rate.getUnit() != DataRateUnit._UNDEFINED_, ARG_QUANTITY_MESSAGE, DATA_RATE);
	}

	private static void checkTimeArgument(final @NonNull Time time) {
		checkArgument(time != null, ARG_NULL_MESSAGE, TIME);
		checkArgument(time.getValue() != null, ARG_QUANTITY_MESSAGE, TIME);
		checkArgument(time.getUnit() != TimeUnit._UNDEFINED_, ARG_QUANTITY_MESSAGE, TIME);
	}

	public static final List<TimeUnit> TIME_UNIT_LIST = Collections
			.unmodifiableList(Arrays.asList(TimeUnit.PS, TimeUnit.NS, TimeUnit.US, TimeUnit.MS, TimeUnit.S));

	public static <T extends EObject> T getContainerOfType(final @NonNull EObject object, final @NonNull Class<T> type) {
		checkArgument(object != null, ARG_OBJECT_MESSAGE);
		checkArgument(type != null, ARG_CLASS_MESSAGE);

		for (EObject parent = object.eContainer(); parent != null; parent = parent.eContainer()) {
			if (type.isInstance(parent))
				return type.cast(parent);
		}
		return type.cast(null);
	}

	public static BigInteger convertToBit(final @NonNull DataSize size) {
		checkDataSizeArgument(size);

		BigInteger bitBase = size.getValue();
		BigInteger byteBase = size.getValue().multiply(INT_8);

		switch (size.getUnit()) {
		case BIT:
			return bitBase;
		case KBIT:
			return bitBase.multiply(INT_10_POW_3);
		case MBIT:
			return bitBase.multiply(INT_10_POW_6);
		case GBIT:
			return bitBase.multiply(INT_10_POW_9);
		case TBIT:
			return bitBase.multiply(INT_10_POW_12);

		case KIBIT:
			return bitBase.multiply(INT_2_POW_10);
		case MIBIT:
			return bitBase.multiply(INT_2_POW_20);
		case GIBIT:
			return bitBase.multiply(INT_2_POW_30);
		case TIBIT:
			return bitBase.multiply(INT_2_POW_40);

		case B:
			return byteBase;
		case KB:
			return byteBase.multiply(INT_10_POW_3);
		case MB:
			return byteBase.multiply(INT_10_POW_6);
		case GB:
			return byteBase.multiply(INT_10_POW_9);
		case TB:
			return byteBase.multiply(INT_10_POW_12);

		case KI_B:
			return byteBase.multiply(INT_2_POW_10);
		case MI_B:
			return byteBase.multiply(INT_2_POW_20);
		case GI_B:
			return byteBase.multiply(INT_2_POW_30);
		case TI_B:
			return byteBase.multiply(INT_2_POW_40);

		default:
			return null; // should never happen
		}
	}

	public static BigInteger convertToBitPerSecond(final @NonNull DataRate rate) {
		checkDataRateArgument(rate);

		BigInteger bitBase = rate.getValue();
		BigInteger byteBase = rate.getValue().multiply(INT_8);

		switch (rate.getUnit()) {
		case BIT_PER_SECOND:
			return bitBase;
		case KBIT_PER_SECOND:
			return bitBase.multiply(INT_10_POW_3);
		case MBIT_PER_SECOND:
			return bitBase.multiply(INT_10_POW_6);
		case GBIT_PER_SECOND:
			return bitBase.multiply(INT_10_POW_9);
		case TBIT_PER_SECOND:
			return bitBase.multiply(INT_10_POW_12);

		case KIBIT_PER_SECOND:
			return bitBase.multiply(INT_2_POW_10);
		case MIBIT_PER_SECOND:
			return bitBase.multiply(INT_2_POW_20);
		case GIBIT_PER_SECOND:
			return bitBase.multiply(INT_2_POW_30);
		case TIBIT_PER_SECOND:
			return bitBase.multiply(INT_2_POW_40);

		case BPER_SECOND:
			return byteBase;
		case KB_PER_SECOND:
			return byteBase.multiply(INT_10_POW_3);
		case MB_PER_SECOND:
			return byteBase.multiply(INT_10_POW_6);
		case GB_PER_SECOND:
			return byteBase.multiply(INT_10_POW_9);
		case TB_PER_SECOND:
			return byteBase.multiply(INT_10_POW_12);

		case KI_BPER_SECOND:
			return byteBase.multiply(INT_2_POW_10);
		case MI_BPER_SECOND:
			return byteBase.multiply(INT_2_POW_20);
		case GI_BPER_SECOND:
			return byteBase.multiply(INT_2_POW_30);
		case TI_BPER_SECOND:
			return byteBase.multiply(INT_2_POW_40);

		default:
			return null; // should never happen
		}
	}

	/**
	 * This method is used to convert the value of Time/TimeObject element's value
	 * to BigInteger in Pico Seconds
	 * 
	 * @param time Time object
	 * @return value BigInteger in Pico Seconds
	 */
	public static BigInteger convertToPicoSeconds(final @NonNull Time time) {
		checkTimeArgument(time);

		@SuppressWarnings("null")
		@NonNull BigInteger timeValue = time.getValue();

		switch (time.getUnit()) {
		case PS:
			return timeValue;
		case NS:
			return timeValue.multiply(INT_10_POW_3);
		case US:
			return timeValue.multiply(INT_10_POW_6);
		case MS:
			return timeValue.multiply(INT_10_POW_9);
		case S:
			return timeValue.multiply(INT_10_POW_12);
		
		default:
			return null; // should never happen
		}
	}

	public static BigDecimal convertToHertz(final @NonNull Frequency frequency) {
		checkArgument(frequency != null, ARG_NULL_MESSAGE, FREQUENCY);
		checkArgument(frequency.getUnit() != FrequencyUnit._UNDEFINED_, ARG_QUANTITY_MESSAGE, FREQUENCY);

		double freqValue = frequency.getValue();

		switch (frequency.getUnit()) {
		case HZ:
			return BigDecimal.valueOf(freqValue);
		case KHZ:
			return BigDecimal.valueOf(freqValue).multiply(DEC_10_POW_3);
		case MHZ:
			return BigDecimal.valueOf(freqValue).multiply(DEC_10_POW_6);
		case GHZ:
			return BigDecimal.valueOf(freqValue).multiply(DEC_10_POW_9);
		
		default:
			return null; // should never happen
		}
	}

	public static BigDecimal convertToMicroVolt(final @NonNull Voltage voltage) {
		checkArgument(voltage != null, ARG_NULL_MESSAGE, VOLTAGE);
		checkArgument(voltage.getUnit() != VoltageUnit._UNDEFINED_, ARG_QUANTITY_MESSAGE, VOLTAGE);

		double voltValue = voltage.getValue();

		switch (voltage.getUnit()) {
		case UV:
			return BigDecimal.valueOf(voltValue);
		case MV:
			return BigDecimal.valueOf(voltValue).multiply(DEC_10_POW_3);
		case V:
			return BigDecimal.valueOf(voltValue).multiply(DEC_10_POW_6);
		
		default:
			return null; // should never happen
		}
	}

	/**
	 * This method is used to compare DataRate objects on the basis of their values
	 * (obtained in bit per second after applying the conversion based on DataRateUnit)
	 * 
	 * @param r1 DataRate object
	 * @param r2 DataRate object
	 * @return -1 ,0 or 1
	 */
	public static int compareDataRates(final @NonNull DataRate r1, final @NonNull DataRate r2) {
		checkDataRateArgument(r1);
		checkDataRateArgument(r2);
	
		if (r1 == r2) {
			return 0;
		}
	
		BigInteger value1 = convertToBitPerSecond(r1);
		BigInteger value2 = convertToBitPerSecond(r2);
	
		assert value1 != null;
		assert value2 != null;
	
		return value1.compareTo(value2);
	}

	/**
	 * This method is used to compare Time objects on the basis of their values
	 * (obtained in pico seconds after applying the conversion based on TimeUnit)
	 * 
	 * @param t1 Time object
	 * @param t2 Time object
	 * @return -1 ,0 or 1
	 */
	public static int compareTimes(final @NonNull Time t1, final @NonNull Time t2) {
		checkTimeArgument(t1);
		checkTimeArgument(t2);

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
	 * This method takes a time (in value and unit) and adjusts the TimeUnit so that
	 * the value is as small as possible, without losing precision e.g. 1000us is
	 * converted to 1ms
	 * 
	 * @param time
	 * @return new Time with adjusted value and unit
	 */
	public static Time adjustTimeUnit(final @NonNull Time time) {
		checkTimeArgument(time);

		if (time.getValue() == BigInteger.ZERO)
			return time;

		int index = TIME_UNIT_LIST.indexOf(time.getUnit());
		int maxIndex = TIME_UNIT_LIST.size() - 1;
		BigInteger value = time.getValue();
		BigInteger bigInt1000 = INT_10_POW_3;

		while (value.mod(bigInt1000) == BigInteger.ZERO && index < maxIndex) {
			value = value.divide(bigInt1000);
			index++;
		}

		return createTime(value, TIME_UNIT_LIST.get(index));
	}

	public static Time addTime(final @NonNull Time t1, final @NonNull Time t2) {
		checkTimeArgument(t1);
		checkTimeArgument(t2);

		return applyToTimes(BigInteger::add, t1, t2);
	}

	public static Time subtractTime(final @NonNull Time t1, final @NonNull Time t2) {
		checkTimeArgument(t1);
		checkTimeArgument(t2);

		return applyToTimes(BigInteger::subtract, t1, t2);
	}

	public static double divideTime(final @NonNull Time t1, final @NonNull Time t2) {
		checkTimeArgument(t1);
		checkTimeArgument(t2);

		double v1 = convertToPicoSeconds(t1).doubleValue();
		double v2 = convertToPicoSeconds(t2).doubleValue();

		return v1 / v2;
	}

	public static Time multiply(final @NonNull Time t1, long value) {
		checkTimeArgument(t1);

		BigInteger v1 = t1.getValue();
		BigInteger v2 = BigInteger.valueOf(value);

		return createTime(v1.multiply(v2), t1.getUnit());
	}

	public static Time multiply(final @NonNull Time t1, double value) {
		checkTimeArgument(t1);

		BigDecimal v1 = BigDecimal.valueOf(convertToPicoSeconds(t1).doubleValue());
		BigDecimal v2 = BigDecimal.valueOf(value);

		return createTime(v1.multiply(v2).toBigInteger(), TimeUnit.PS);
	}

	private static Time applyToTimes(final @NonNull BinaryOperator<BigInteger> func, final @NonNull Time t1, final @NonNull Time t2) {
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
	 * Computes the average (mean) of the truncated normal distribution
	 * 
	 * <p>
	 * See
	 * <a href="https://en.wikipedia.org/wiki/Truncated_normal_distribution" target=
	 * "_top">Truncated normal distribution (Wikipedia)</a>
	 * </p>
	 * 
	 * @param a    lower bound (null = not truncated from below)
	 * @param b    upper bound (null = not truncated from above)
	 * @param mean mean or expectation of the (unlimited) distribution
	 * @param sd   standard deviation
	 * @return Average of the truncated distribution
	 */
	public static Time getAverageOfTruncatedNormalDistribution(final @Nullable Time a, final @Nullable Time b, final @NonNull Time mean, final @NonNull Time sd) {
		checkTimeArgument(mean);
		checkTimeArgument(sd);

		Double alpha = null;
		Double beta = null;
		if (a != null) { // truncated from below
			alpha = a.subtract(mean).divide(sd);
		}
		if (b != null) { // truncated from above
			beta = b.subtract(mean).divide(sd);
		}

		double factor = computeTruncatedNormalDistFactor(alpha, beta);

		return mean.add(sd.multiply(factor));
	}

	/**
	 * Computes the average (mean) of the truncated normal distribution
	 * 
	 * <p>
	 * See
	 * <a href="https://en.wikipedia.org/wiki/Truncated_normal_distribution" target=
	 * "_top">Truncated normal distribution (Wikipedia)</a>
	 * </p>
	 * 
	 * @param a    lower bound (null = not truncated from below)
	 * @param b    upper bound (null = not truncated from above)
	 * @param mean mean or expectation of the (unlimited) distribution
	 * @param sd   standard deviation
	 * @return Average of the truncated distribution
	 */
	public static double getAverageOfTruncatedNormalDistribution(final @Nullable Number a, final @Nullable Number b, double mean, double sd) {
		Double alpha = null;
		Double beta = null;
		if (a != null) { // truncated from below
			alpha = (a.doubleValue() - mean) / sd;
		}
		if (b != null) { // truncated from above
			beta = (b.doubleValue() - mean) / sd;
		}

		double factor = computeTruncatedNormalDistFactor(alpha, beta);

		return mean + factor * sd;
	}

	private static double computeTruncatedNormalDistFactor(Double alpha, Double beta) {
		// Standard normal distribution (mean = 0, sd = 1)
		NormalDistribution normDist = new NormalDistribution(null, 0, 1);

		// values are initialized for a range from negative infinity to infinity (no
		// truncation)
		double pdf_alpha = 0.0;
		double cdf_alpha = 0.0;
		double pdf_beta = 0.0;
		double cdf_beta = 1.0;

		if (alpha != null) { // truncated from below
			pdf_alpha = normDist.density(alpha);
			cdf_alpha = normDist.cumulativeProbability(alpha);
		}
		if (beta != null) { // truncated from above
			pdf_beta = normDist.density(beta);
			cdf_beta = normDist.cumulativeProbability(beta);
		}

		return (pdf_alpha - pdf_beta) / (cdf_beta - cdf_alpha);
	}

	public static EList<QualifiedPort> getInnerPorts(final @NonNull ISystem system) {
		checkArgument(system != null, ARG_NULL_MESSAGE, "ISystem");

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
		
		@SuppressWarnings("null")
		final @NonNull EReference eReference = AmaltheaPackage.eINSTANCE.getISystem_InnerPorts();
		return unmodifiableEcoreEList(system, eReference, qualifiedPorts);
	}

	public static EList<HwPort> getInnerPorts(final @NonNull HwStructure struct) {
		checkArgument(struct != null, ARG_NULL_MESSAGE, "HwStructure");

		List<HwPort> ports = new ArrayList<HwPort>();
		for (HwStructure subStruct : struct.getStructures()) {
			ports.addAll(subStruct.getPorts());
		}
		for (HwModule module : getAllModules(struct)) {
			ports.addAll(module.getPorts());
		}
		
		@SuppressWarnings("null")
		final @NonNull EReference eReference = AmaltheaPackage.eINSTANCE.getHwStructure_InnerPorts();
		return unmodifiableEcoreEList(struct, eReference, ports);
	}

	public static EList<HwModule> getAllModules(final @NonNull HwStructure struct) {
		checkArgument(struct != null, ARG_NULL_MESSAGE, "HwStructure");

		List<HwModule> moduleList = new ArrayList<HwModule>();
		for (HwModule module : struct.getModules()) {
			moduleList.add(module);
			if (module instanceof ProcessingUnit) {
				moduleList.addAll(((ProcessingUnit) module).getCaches());
			}
		}
		return unmodifiableEList(moduleList);
	}

	private static <T> EList<T> unmodifiableEcoreEList(final @NonNull EObject eObject, final @NonNull EReference eReference,
			final @NonNull List<? extends T> result) {
		final int size = result.size();
		final Object[] values = result.toArray();
		return new EcoreEList.UnmodifiableEList<T>((InternalEObject) eObject, eReference, size, values);
	}

	private static <T> EList<T> unmodifiableEList(final @NonNull List<? extends T> list) {
		if (list.isEmpty()) {
			return ECollections.emptyEList();
		} else {
			return ECollections.unmodifiableEList(list);
		}
	}

}
