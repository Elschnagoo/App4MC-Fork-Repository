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
