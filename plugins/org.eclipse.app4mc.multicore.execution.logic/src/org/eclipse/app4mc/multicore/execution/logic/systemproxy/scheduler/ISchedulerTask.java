/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.Barrier;

/**
 * API-User Interface for SchedulerTask.
 */
public interface ISchedulerTask {
	
	public static long BARRIER_LOCK_AT_ACTIVATION=Long.MIN_VALUE;
	public static long BARRIER_UNLOCK_AT_SUSPENSION=Long.MAX_VALUE;
	public long getWCET();
	public long getPeriod();
	public void addDependentBarrier(Barrier m);
	public void addOwnedBarrier(Barrier barrier,long releaseTime);
}
