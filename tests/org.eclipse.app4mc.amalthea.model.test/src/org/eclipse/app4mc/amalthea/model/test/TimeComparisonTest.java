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
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.junit.Test;

public class TimeComparisonTest {

	@Test
	public void case1() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000", "ms");

		int compareTo = t1.compareTo(t2);

		assertTrue("Failed to compare Time objects having TimeUnit Second and Millisecond", compareTo == 0);
	}

	@Test
	public void case2() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000", "us");

		int compareTo = t1.compareTo(t2);

		assertTrue("Failed to compare Time objects having TimeUnit Second and Microsecond", compareTo == 0);
	}

	@Test
	public void case3() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000000", "ns");

		int compareTo = t1.compareTo(t2);

		assertTrue("Failed to compare Time objects having TimeUnit Second and Nanosecond", compareTo == 0);
	}

	@Test
	public void case4() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000000000", "ps");

		int compareTo = t1.compareTo(t2);

		assertTrue("Failed to compare Time objects having TimeUnit Second and Picosecond", compareTo == 0);
	}

	@Test
	public void case5() {

		Time t1 = createTime("1", "s");

		assertTrue("Failed to compare Time objects which are same", t1.compareTo(t1) == 0);
	}

	@Test
	public void case6() {

		Time t1 = createTime("1000000000000", "_undefined_");
		Time t2 = createTime("1000000000000", "ps");

		Exception e = null;
		try {
			t1.compareTo(t2);
		} catch (Exception e1) {
			e = e1;
		}

		assertTrue("Failed to compare Time with undefined unit -> Exception is not thrown..",
				e.getMessage().contains("Invalid Time object"));
	}

	@Test
	public void case7() {

		Time t1 = createTime("1", "s");
		Time t2 = null;

		boolean isExceptionThrown = false;

		try {
			t1.compareTo(t2);
		} catch (RuntimeException e) {
			isExceptionThrown = true;
		}

		assertTrue("Failed to compare Time object and null -> RuntimeException is not thrown..", isExceptionThrown);
	}

	@Test
	public void case8() {

		Time t1 = null;
		Time t2 = createTime("1000000000000", "ps");

		boolean isExceptionThrown = false;

		try {
			AmaltheaServices.compareTimes(t1, t2);
		} catch (IllegalArgumentException e1) {
			isExceptionThrown = true;
		}

		assertTrue("Failed to compare null and Time object - > IllegalArgumentException is not thrown..",
				isExceptionThrown);
	}

	private Time createTime(String value1, String unit1) {

		Time time1 = AmaltheaFactory.eINSTANCE.createTime();

		time1.setValue(new BigInteger(value1));

		time1.setUnit(TimeUnit.get(unit1));

		return time1;
	}

}
