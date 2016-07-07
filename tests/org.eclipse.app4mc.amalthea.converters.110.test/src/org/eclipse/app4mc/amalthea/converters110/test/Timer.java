/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
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
