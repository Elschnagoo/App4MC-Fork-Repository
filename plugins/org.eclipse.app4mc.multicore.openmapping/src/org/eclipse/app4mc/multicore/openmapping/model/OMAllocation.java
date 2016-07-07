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

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
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

	// public OMAllocation(final OMTask task, final OMScheduler scheduler) {
	// this.task = task;
	// this.scheduler = scheduler;
	// // TODO Likely an unoptimal approach...
	// this.core = null;
	// }

	public OMTask getTask() {
		return this.task;
	}

	public OMCore getCore() {
		return this.core;
	}

	public OMScheduler getScheduler() {
		return this.scheduler;
	}

	// TODO Pragmatic solution, this should be improved according to a design schema
	public void addAttribute(final String key, final Object value) {
		this.attributeList.put(key, value);
	}

	public Object getAttribute(final String key) {
		return this.attributeList.get(key);
	}

	/**
	 * Calculates the processing time in pico-seconds (ps) of a Task task on Core core.
	 *
	 * @param task
	 *            Task to be executed
	 * @param core
	 *            Core executing the task
	 * @return Execution time of Task task on Core core .
	 */
	public long calculateProcessingTime() {
		final BigDecimal ips = BigDecimal.valueOf(this.core.getInstructionsPerSecond());
		// final BigInteger ins = BigInteger.valueOf(task.getInstructionCount());
		final BigDecimal ins = BigDecimal.valueOf(this.task.getInstructionCount());
		// Piko-Seconds per Second
		final BigDecimal psps = BigDecimal.valueOf(1000L * 1000L * 1000L * 1000L);
		// final BigDecimal computationTime = psps.multiply(ins).divide(ips);
		final BigDecimal computationTime = psps.multiply(ins).divide(ips, 5, RoundingMode.CEILING)
				.divide(BigDecimal.valueOf(this.task.calcRecursionFactor()), MathContext.DECIMAL128);
		// return (long) Math.ceil(instructions * 1000000000000d / ips);
		return computationTime.longValue();
	}
}
