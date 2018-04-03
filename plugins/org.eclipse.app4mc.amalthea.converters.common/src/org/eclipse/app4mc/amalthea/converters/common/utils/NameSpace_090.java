/*******************************************************************************
 * Copyright (c) 2017 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.common.utils;

public enum NameSpace_090 {

	am("http://app4mc.eclipse.org/amalthea/0.9.0");

	private String value;

	private NameSpace_090(final String v) {
		this.value = v;
	}

	public String getNSValue() {
		return this.value;
	}

}