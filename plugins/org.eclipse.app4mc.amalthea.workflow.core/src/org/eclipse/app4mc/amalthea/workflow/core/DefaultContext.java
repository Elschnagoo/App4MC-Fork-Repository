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
