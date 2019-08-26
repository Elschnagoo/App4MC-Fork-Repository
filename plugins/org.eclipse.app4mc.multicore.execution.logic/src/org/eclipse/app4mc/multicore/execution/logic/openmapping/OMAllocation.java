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

import java.util.HashMap;

public class OMAllocation {
	private final OMTask task;
	private final OMCore core;
	private final OMScheduler scheduler;
	private final HashMap<String, Object> attributeList = new HashMap<String, Object>();

	public OMAllocation(final OMTask task, final OMCore core) {
		this.task = task;
		this.core = core;
		// TODO Likely an unoptimal approach...
		this.scheduler = null;
	}
	

	public OMTask getTask() {
		return this.task;
	}

	public OMCore getCore() {
		return this.core;
	}

	public OMScheduler getScheduler() {
		return this.scheduler;
	}

	// TODO Pragmatic solution, this should be improved according to a design
	// schema
	public void addAttribute(final String key, final Object value) {
		this.attributeList.put(key, value);
	}

	public Object getAttribute(final String key) {
		return this.attributeList.get(key);
	}

	/**
	 * Calculates the processing time in pico-seconds (ps) of a Task task on
	 * Core core.
	 *
	 * @param task
	 *            Task to be executed
	 * @param core
	 *            Core executing the task
	 * @return Execution time of Task task on Core core .
	 * @throws MalformedModelException 
	 */
	public long calculateProcessingTime() throws MalformedModelException {

		return OMUtil.getProcessingTime(core, task.getInstructionCount());
		
	}
}
