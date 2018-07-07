/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/

package org.eclipse.app4mc.multicore.sharelibs.utframework;

import java.util.Arrays;
import java.util.List;

public class TestUtil {
	/**
	 * Flag to check the stack trace only once
	 */
	private static boolean testingChecked = false;
	/**
	 * Is testing flag
	 */
	private static boolean isTesting = false;

	/**
	 * Tells if the testing is running.
	 *
	 * @return true if testing is running and false otherwise
	 */
	public static boolean isTesting() {
		// Check if the stack trace has been checked if not check it
		if (!testingChecked) {
			isTesting = checkIsTesting();
			testingChecked = true;
		}

		return isTesting;
	}

	/**
	 * Check the Stack trace for a org.junit
	 *
	 * @return true if org.junit is present in the stack trace
	 */
	private static boolean checkIsTesting() {
		final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		final List<StackTraceElement> list = Arrays.asList(stackTrace);
		for (final StackTraceElement element : list) {
			if (element.getClassName().startsWith("org.junit.")) {
				return true;
			}
		}
		return false;
	}
}
