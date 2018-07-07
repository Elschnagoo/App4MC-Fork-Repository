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
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core;

public class BarrierAccess {
	

    //not used yet... but future use 
	private final long lockTime;
	private final long releaseTime;
	private final Barrier barrier;
	
	public BarrierAccess(long lockTime, long releaseTime, Barrier mutex) {
		super();
		this.lockTime = lockTime;
		this.releaseTime = releaseTime;
		this.barrier = mutex;
	}

	public long getLockTime() {
		return lockTime;
	}

	public long getReleaseTime() {
		return releaseTime;
	}

	public Barrier getBarrier() {
		return barrier;
	}
	
	
}
