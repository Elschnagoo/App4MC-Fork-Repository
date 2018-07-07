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

package org.eclipse.app4mc.multicore.execution.logic.btf.fsm;

public enum BtfTaskState {
	POLLING(0),
	RUNNING(1),
	TERMINATED(2),
	NOT_INITIALIZED(3),
	ACTIVE(4),
	READY(5),
	PARKING(6),
	WAITING(7);
	
	public final static int COUNT= 8;
	
	private final int id;
	BtfTaskState(int id) { this.id = id; }
    public int val() { return id; }
}
