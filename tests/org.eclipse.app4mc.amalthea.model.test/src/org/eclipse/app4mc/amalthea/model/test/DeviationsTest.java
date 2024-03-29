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

package org.eclipse.app4mc.amalthea.model.test;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution;
import org.eclipse.app4mc.amalthea.model.TimeBoundaries;
import org.eclipse.app4mc.amalthea.model.TimeConstant;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.junit.Test;

public class DeviationsTest {

	AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;

	/**
	 * Method getAverage() - Simple tests: Constant, Boundaries,
	 * UniformDistribution, Statistics, Weibull
	 */
	@Test
	public void testGetAverage1() {
		Time avg;

		TimeConstant constant = fac.createTimeConstant();
		constant.setValue(createTime("75", "ms"));

		avg = constant.getAverage();
		assertTrue("TimeConstant getAverage()", avg.compareTo(createTime("75", "ms")) == 0);

		TimeBoundaries boundaries = fac.createTimeBoundaries();
		boundaries.setLowerBound(createTime("50", "ms"));
		boundaries.setUpperBound(createTime("100", "ms"));

		avg = boundaries.getAverage().adjustUnit();
		assertTrue("TimeBoundaries getAverage()", avg.compareTo(createTime("75", "ms")) == 0);

		TimeUniformDistribution uniform = fac.createTimeUniformDistribution();
		uniform.setLowerBound(createTime("50", "ms"));
		uniform.setUpperBound(createTime("100", "ms"));

		avg = uniform.getAverage().adjustUnit();
		assertTrue("TimeUniformDistribution getAverage()", avg.compareTo(createTime("75", "ms")) == 0);

		TimeStatistics statistics = fac.createTimeStatistics();
		statistics.setLowerBound(createTime("50", "ms"));
		statistics.setAverage(createTime("80", "ms"));
		statistics.setUpperBound(createTime("100", "ms"));

		avg = statistics.getAverage();
		assertTrue("TimeStatistics getAverage()", avg.compareTo(createTime("80", "ms")) == 0);

		TimeWeibullEstimatorsDistribution weibull = fac.createTimeWeibullEstimatorsDistribution();
		weibull.setLowerBound(createTime("50", "ms"));
		weibull.setAverage(createTime("80", "ms"));
		weibull.setUpperBound(createTime("100", "ms"));

		avg = weibull.getAverage();
		assertTrue("Weibull getAverage()", avg.compareTo(createTime("80", "ms")) == 0);
	}

	/**
	 * Method getAverage() - Extended tests: Histogram, BetaDistribution,
	 * GaussDistribution
	 */
	@Test
	public void testGetAverage2() {
		Time avg;

		TimeBetaDistribution beta = fac.createTimeBetaDistribution();
		beta.setLowerBound(createTime("50", "ms"));
		beta.setUpperBound(createTime("100", "ms"));
		// Symmetric case: alpha == beta
		beta.setAlpha(10.0);
		beta.setBeta(10.0);

		avg = beta.getAverage().adjustUnit();
		assertTrue("BetaDistribution getAverage()", avg.compareTo(createTime("75", "ms")) == 0);

		TimeGaussDistribution gauss = fac.createTimeGaussDistribution();
		gauss.setMean(createTime("75", "ms"));
		gauss.setSd(createTime("10", "ms"));

		// no truncation
		avg = gauss.getAverage().adjustUnit();
		assertTrue("GaussDistribution getAverage() - no truncation", avg.compareTo(createTime("75", "ms")) == 0);

		// symmetric bounds
		gauss.setLowerBound(createTime("50", "ms"));
		gauss.setUpperBound(createTime("100", "ms"));
		avg = gauss.getAverage().adjustUnit();
		assertTrue("GaussDistribution getAverage() - symmetric bounds", avg.compareTo(createTime("75", "ms")) == 0);

		// asymmetric bounds
		gauss.setLowerBound(createTime("70", "ms"));
		avg = gauss.getAverage().adjustUnit();
		System.out.println("Avg: " + avg);
		assertTrue("GaussDistribution getAverage() - asymmetric bounds",
				avg.subtract(createTime("79881950", "ns")).compareTo(createTime("1", "ns")) == -1);

	}

	private Time createTime(String value1, String unit1) {
		Time time1 = AmaltheaFactory.eINSTANCE.createTime();
		time1.setValue(new BigInteger(value1));
		time1.setUnit(TimeUnit.get(unit1));

		return time1;
	}

}
