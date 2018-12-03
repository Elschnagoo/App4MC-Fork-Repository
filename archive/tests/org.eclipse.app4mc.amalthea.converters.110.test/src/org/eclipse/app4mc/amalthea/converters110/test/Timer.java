/*********************************************************************************
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

package org.eclipse.app4mc.amalthea.converters110.test;

public class Timer {


	private static long startTime;

	public static void start() {
		startTime = System.currentTimeMillis();
	}

	public static void end(final String st) {

		System.out.println("time taken in milli seconds for : \"" + st + "\" :"
				+ (System.currentTimeMillis() - startTime));
	}
}
