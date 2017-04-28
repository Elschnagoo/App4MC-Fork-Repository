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
