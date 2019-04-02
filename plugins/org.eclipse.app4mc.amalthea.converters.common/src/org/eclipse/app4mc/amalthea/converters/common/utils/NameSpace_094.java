/**
 ********************************************************************************
 * Copyright (c) 2017-2018 Robert Bosch GmbH and others.
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

public enum NameSpace_094 {

	am("http://app4mc.eclipse.org/amalthea/0.9.4");

	private String value;

	private NameSpace_094(final String v) {
		this.value = v;
	}

	public String getNSValue() {
		return this.value;
	}

}