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

package org.eclipse.app4mc.amalthea.model.test;

import java.math.BigInteger;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.core.runtime.Assert;
import org.junit.Test;

public class TimeComparisonTest {

	@Test
	public void case1() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000", "ms");

		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo == 0, "Failed to compare Time objects having TimeUnit Second and Millisecond");
	}

	@Test
	public void case2() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000", "us");

		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo == 0, "Failed to compare Time objects having TimeUnit Second and Microsecond");
	}

	@Test
	public void case3() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000000", "ns");

		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo == 0, "Failed to compare Time objects having TimeUnit Second and Nanosecond");
	}

	@Test
	public void case4() {

		Time t1 = createTime("1", "s");
		Time t2 = createTime("1000000000000", "ps");

		int compareTo = t1.compareTo(t2);

		Assert.isTrue(compareTo == 0, "Failed to compare Time objects having TimeUnit Second and Picosecond");
	}



	@Test
	public void case5() {

		Time t1 = createTime("1", "s");

		Assert.isTrue(t1.compareTo(t1) == 0, "Failed to compare Time objects which are same");
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

		Assert.isTrue(e.getMessage().contains("Invalid Time object"),
				"Failed to compare Time with undefined unit -> Exception is not thrown..");
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

		Assert.isTrue(isExceptionThrown, "Failed to compare Time object and null -> RuntimeException is not thrown..");
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

		Assert.isTrue(isExceptionThrown, "Failed to compare null and Time object - > IllegalArgumentException is not thrown..");
	}


	private Time createTime(String value1, String unit1) {

		Time time1 = AmaltheaFactory.eINSTANCE.createTime();

		time1.setValue(new BigInteger(value1));

		time1.setUnit(TimeUnit.get(unit1));

		return time1;
	}

}
