/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs;

public class DebugUtil {

	public static void print(final String message) {
		System.out.println("[DEBUG] " + Thread.currentThread().getStackTrace()[2].getFileName() + ":"
				+ Thread.currentThread().getStackTrace()[2].getLineNumber() + " " + message);
	}

}