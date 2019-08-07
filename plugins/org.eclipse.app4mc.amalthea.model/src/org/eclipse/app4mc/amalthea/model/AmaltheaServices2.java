/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

import java.math.BigInteger;
import java.util.Collection;

import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

/**
 * This class provides static methods that implement operations of the Amalthea EMF model.
 * <p>
 * In case of inconsistent input the return value is null.
 * <p>
 * The methods are called from several generated model objects.
 */
public class AmaltheaServices2 {

	private static @NonNull Time createTime(final BigInteger value, final TimeUnit unit) {
		Time time = AmaltheaFactory.eINSTANCE.createTime();
		time.setValue(value);
		time.setUnit(unit);
		return time;
	}

	private static boolean isInvalid(final @NonNull Time time) {
		return (time.getValue() == null || time.getUnit() == TimeUnit._UNDEFINED_);
	}
	
	// ***** delegate methods *****
	
	private static @NonNull Time addTime(final @NonNull Time t1, final @NonNull Time t2) {
		return AmaltheaServices.addTime(t1, t2);
	}

	private static @NonNull Time subtractTime(final @NonNull Time t1, final @NonNull Time t2) {
		return AmaltheaServices.subtractTime(t1, t2);
	}

	private static @NonNull Time multiply(final @NonNull Time t1, long value) {
		return AmaltheaServices.multiply(t1, value);
	}

	private static @NonNull Time multiply(final @NonNull Time t1, double value) {
		return AmaltheaServices.multiply(t1, value);
	}

	private static int compareTimes(final @NonNull Time t1, final @NonNull Time t2) {
		return AmaltheaServices.compareTimes(t1, t2);
	}

	// ***** Deviations *****

	public static @Nullable Time getAverage(final @Nullable Time lowerBound, final @Nullable Time upperBound) {
		if (lowerBound == null || upperBound == null) return null;
		if (isInvalid(lowerBound) || isInvalid(upperBound)) return null;
		if (compareTimes(lowerBound, upperBound) > 0) return null;
		
		return addTime(lowerBound, multiply(subtractTime(upperBound, lowerBound), 0.5));
	}

	public static @Nullable Double getAverage(final @Nullable Number lowerBound, final @Nullable Number upperBound) {
		if (lowerBound == null || upperBound == null) return null;
		double lower = lowerBound.doubleValue();
		double upper = upperBound.doubleValue();
		if (lower > upper) return null;
		
		return lower + (upper - lower) / 2.0;
	}

	public static @Nullable Time getAverage_Time(final @NonNull Collection<TimeHistogramEntry> coll) {
		long count = 0;
		Time sum = createTime(BigInteger.ZERO, TimeUnit.PS);
		for (TimeHistogramEntry entry : coll) {
			if (entry == null) return null;
	
			Time avg = getAverage(entry.getLowerBound(), entry.getUpperBound());
			if (avg == null) return null;
			
			count = count + entry.getOccurrences();
			sum = addTime(sum, multiply(avg, entry.getOccurrences()));
		}
		if (count == 0) return null;
		
		return multiply(sum, 1.0 / count);
	}

	public static @Nullable Double getAverage_DV(final @NonNull Collection<DiscreteValueHistogramEntry> coll) {
		long count = 0;
		double sum = 0.0;
		for (DiscreteValueHistogramEntry entry : coll) {
			if (entry == null) return null;
	
			Double avg = getAverage(entry.getLowerBound(), entry.getUpperBound());
			if (avg == null) return null;
			
			count += entry.getOccurrences();
			sum += avg * entry.getOccurrences();
		}
		if (count == 0) return null;
		
		return sum / (double) count;
	}

	public static @Nullable Double getAverage_CV(final @NonNull Collection<ContinuousValueHistogramEntry> coll) {
		long count = 0;
		double sum = 0.0;
		for (ContinuousValueHistogramEntry entry : coll) {
			if (entry == null) return null;
			
			Double avg = getAverage(entry.getLowerBound(), entry.getUpperBound());
			if (avg == null) return null;
			
			count += entry.getOccurrences();
			sum += avg * entry.getOccurrences();
		}
		if (count == 0) return null;
		
		return sum / (double) count;
	}

	public static @Nullable Time getLowerBound_Time(final @NonNull Collection<? extends TimeInterval> coll) {
		Time min = null;
		for (TimeInterval interval : coll) {
			if (interval == null) return null;
			
			Time bound = interval.getLowerBound();
			if (bound == null || isInvalid(bound)) return null;
			
			if (min == null || compareTimes(min, bound) > 0)
				min = bound;
		}
		return min;
	}

	public static @Nullable Long getLowerBound_DV(final @NonNull Collection<? extends DiscreteValueInterval> coll) {
		Long min = null;
		for (DiscreteValueInterval interval : coll) {
			if (interval == null) return null;
			
			Long bound = interval.getLowerBound();
			
			if (min == null || min > bound)
				min = bound;
		}
		return min;
	}

	public static @Nullable Double getLowerBound_CV(final @NonNull Collection<? extends ContinuousValueInterval> coll) {
		Double min = null;
		for (ContinuousValueInterval interval : coll) {
			if (interval == null) return null;
			
			Double bound = interval.getLowerBound();
			if (bound == null) return null;
			
			if (min == null || min > bound)
				min = bound;
		}
		return min;
	}
	
	public static @Nullable Time getUpperBound_Time(final @NonNull Collection<? extends TimeInterval> coll) {
		Time max = null;
		for (TimeInterval interval : coll) {
			if (interval == null) return null;
			
			Time bound = interval.getUpperBound();
			if (bound == null || isInvalid(bound)) return null;
			
			if (max == null || compareTimes(bound, max) > 0)
				max = bound;
		}
		return max;
	}

	public static @Nullable Long getUpperBound_DV(final @NonNull Collection<? extends DiscreteValueInterval> coll) {
		Long max = null;
		for (DiscreteValueInterval interval : coll) {
			if (interval == null) return null;
			
			Long bound = interval.getUpperBound();
			if (bound == null) return null;
			
			if (max == null || max < bound)
				max = bound;
		}
		return max;
	}

	public static @Nullable Double getUpperBound_CV(final @NonNull Collection<? extends ContinuousValueInterval> coll) {
		Double max = null;
		for (ContinuousValueInterval interval : coll) {
			if (interval == null) return null;
			
			Double bound = interval.getUpperBound();
			if (bound == null) return null;
			
			if (max == null || max < bound)
				max = bound;
		}
		return max;
	}

	public static @Nullable Time getAverageOfTruncatedNormalDistribution(final @Nullable Time a, final @Nullable Time b, final @Nullable Time mean, final @Nullable Time sd) {
		if (mean == null || sd == null) return null;
		if (isInvalid(mean) || isInvalid(sd)) return null;
		if (a != null && isInvalid(a)) return null;
		if (b != null && isInvalid(b)) return null;
	
		if (a != null && b != null) {
			if (compareTimes(a, b) > 0) return null;
		}
		
		return AmaltheaServices.getAverageOfTruncatedNormalDistribution(a, b, mean, sd);
	}

	public static @Nullable Double getAverageOfTruncatedNormalDistribution(final @Nullable Number a, final @Nullable Number b, @Nullable Double mean, @Nullable Double sd) {
		if (mean == null || sd == null) return null;

		if (a != null && b != null) {
			if (a.doubleValue() > b.doubleValue()) return null;
		}

		return AmaltheaServices.getAverageOfTruncatedNormalDistribution(a, b, mean, sd);
	}

	public static @Nullable Time getAverageOfBetaDistribution(final @Nullable Time a, final @Nullable Time b, final @Nullable Double alpha, final @Nullable Double beta) {
		if (a == null || b == null || alpha == null || beta == null) return null;
		if (isInvalid(a) || isInvalid(b)) return null;
		if (compareTimes(a, b) > 0) return null;
		if (alpha <= 0) return null;
		if (beta <= 0) return null;
		
		double ratio = 1.0 / (1.0 + (beta / alpha)); // mean in interval [0,1] is 1 / (1 + (beta/alpha))
		return addTime(a, multiply(subtractTime(b, a), ratio));
	}

	public static @Nullable Double getAverageOfBetaDistribution(final @Nullable Number a, final @Nullable Number b, final @Nullable Double alpha, final @Nullable Double beta) {
		if (a == null || b == null || alpha == null || beta == null) return null;
		double a_double = a.doubleValue();
		double b_double = b.doubleValue();
		if (a_double > b_double) return null;
		if (alpha <= 0) return null;
		if (beta <= 0) return null;

		double ratio = 1.0 / (1.0 + (beta / alpha)); // mean in interval [0,1] is 1 / (1 + (beta/alpha))
		return a_double + (b_double - a_double) * ratio;
	}

}
