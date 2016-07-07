/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */
package org.eclipse.app4mc.amalthea.workflow.core;

import java.util.HashMap;
import java.util.Map;

/**
 * Default {@link Context} implementation which uses internally a {@link HashMap} to store the given data.
 *
 */
public class DefaultContext implements Context {

	private final Map<String, Object> elements = new HashMap<>();

	public DefaultContext() {
	}

	/**
	 * @see org.eclipse.app4mc.amalthea.workflow.core.Context#get(java.lang.String)
	 */
	@Override
	public Object get(final String slot) {
		return this.elements.get(slot);
	}

	/**
	 * @see org.eclipse.app4mc.amalthea.workflow.core.Context#set(java.lang.String, java.lang.Object)
	 */
	@Override
	public void set(final String slot, final Object object) {
		this.elements.put(slot, object);
	}

	/**
	 * @see org.eclipse.app4mc.amalthea.workflow.core.Context#getSlotNames()
	 */
	@Override
	public String[] getSlotNames() {
		return this.elements.keySet().toArray(new String[] {});
	}

	/**
	 * @see org.eclipse.app4mc.amalthea.workflow.core.Context#clear()
	 */
	@Override
	public void clear() {
		this.elements.clear();
	}

}
