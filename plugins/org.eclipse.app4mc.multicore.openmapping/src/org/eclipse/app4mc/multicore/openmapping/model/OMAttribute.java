/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model;

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
