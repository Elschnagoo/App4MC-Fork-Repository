/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping.model;

import java.util.ArrayList;

/**
 * The OM Mapping Class stores the allocations from tasks to cores.
 */
public class OMMapping {
	private final ArrayList<OMAllocation> allocations = new ArrayList<OMAllocation>();

	public void addAllocation(final OMAllocation allocation) {
		this.allocations.add(allocation);
	}

	public ArrayList<OMAllocation> getAllocationList() {
		return this.allocations;
	}
}
