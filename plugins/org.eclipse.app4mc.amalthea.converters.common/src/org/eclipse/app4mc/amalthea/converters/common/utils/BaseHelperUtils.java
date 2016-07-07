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
package org.eclipse.app4mc.amalthea.converters.common.utils;

public class BaseHelperUtils extends AbstractHelper {

	private BaseHelperUtils() {

	}

	private static BaseHelperUtils instance;

	public static BaseHelperUtils getInstance() {

		if (instance == null) {
			instance = new BaseHelperUtils();
		}

		return instance;
	}
}
