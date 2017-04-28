/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
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
