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

package org.eclipse.app4mc.amalthea.converters.common.postprocessor;

class ElementRef {

	private String name;
	private String type;

	ElementRef parentRef;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}


	public String getType() {
		return this.type;
	}

	public void setType(final String type) {
		this.type = type;
	}

	public ElementRef getParentRef() {
		return this.parentRef;
	}

	public void setParentRef(final ElementRef parentRef) {
		this.parentRef = parentRef;
	}


}