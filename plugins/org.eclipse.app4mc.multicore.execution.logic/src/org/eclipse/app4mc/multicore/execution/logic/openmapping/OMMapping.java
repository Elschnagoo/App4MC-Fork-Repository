/*******************************************************************************
 * Copyright (c) 2015, 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.execution.logic.openmapping;

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