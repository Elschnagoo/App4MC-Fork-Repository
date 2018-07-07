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

/**
 * The context defines convenient methods to store and retrieve objects / data using {@link String} based slot names.
 * It is mainly used by {@link WorkflowComponent} to transfer data between different component implementations.
 *
 */
public interface Context {

	/**
	 * Searches for the given slot name and returns the set value.
	 * @param slot The name of the slot as {@link String}
	 * @return Found {@link Object}, <code>null</code> otherwise
	 */
	Object get(String slot);

	/**
	 * Stores a given {@link Object} at a defined slot. If the slot is already existent, the value is overwritten.
	 * @param slot {@link String} name of the slot
	 * @param object {@link Object} to be stored
	 */
	void set(String slot, Object object);

	/**
	 * Returns an array of all available slot names.
	 * @return Array of {@link String}
	 */
	String[] getSlotNames();

	/**
	 * Clears all available data.
	 */
	void clear();
}