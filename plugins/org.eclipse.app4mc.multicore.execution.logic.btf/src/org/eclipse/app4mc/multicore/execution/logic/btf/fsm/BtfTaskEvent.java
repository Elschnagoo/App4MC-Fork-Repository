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
package org.eclipse.app4mc.multicore.execution.logic.btf.fsm;

public enum BtfTaskEvent {
	WAIT(0),
	POLL(1),
	RUN(2),
	TERMINATE(3),
	ACTIVATE(4),
	RELEASE_PARKING(5),
	RELEASE(6),
	PARK(7),
	POLL_PARKING(8),
	PREEMPT(9),
	RESUME(10),
	START(11);
	
	public final static int COUNT = 12;
	
	private final int id;
	BtfTaskEvent(int id) { this.id = id; }
    public int val() { return id; }
}
