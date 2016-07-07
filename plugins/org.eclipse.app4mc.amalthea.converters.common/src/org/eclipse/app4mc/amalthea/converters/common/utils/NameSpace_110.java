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

public enum NameSpace_110 {

	central("http://www.amalthea.itea2.org/model/1.2.0/central"), common(
			"http://www.amalthea.itea2.org/model/1.2.0/common"), hw("http://www.amalthea.itea2.org/model/1.2.0/hw"), os(
			"http://www.amalthea.itea2.org/model/1.2.0/os"), stimuli(
			"http://www.amalthea.itea2.org/model/1.2.0/stimuli"), sw("http://www.amalthea.itea2.org/model/1.2.0/sw"), propertyconstraints(
			"http://www.amalthea.itea2.org/model/1.2.0/propertyconstraints"), mapping(
			"http://www.amalthea.itea2.org/model/1.2.0/mapping"), events(
			"http://www.amalthea.itea2.org/model/1.2.0/events"), constraints(
			"http://www.amalthea.itea2.org/model/1.2.0/constraints"), config(
			"http://www.amalthea.itea2.org/model/1.2.0/config"), components(
			"http://amalthea.itea2.org/model/1.2.0/components");

	private String value;

	private NameSpace_110(final String v) {
		this.value = v;
	}

	public String getNSValue() {
		return this.value;
	}

}
