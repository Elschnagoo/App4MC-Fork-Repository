/**
 ********************************************************************************
 * Copyright (c) 2015, 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.execution.logic.openmapping;

public class OMAttribute<T> {
	private final String key;
	private final T val;

	public OMAttribute(final String key, final T val) {
		this.key = key;
		this.val = val;
	}

	public String getKey() {
		return this.key;
	}

	public T getValue() {
		return this.val;
	}
}
