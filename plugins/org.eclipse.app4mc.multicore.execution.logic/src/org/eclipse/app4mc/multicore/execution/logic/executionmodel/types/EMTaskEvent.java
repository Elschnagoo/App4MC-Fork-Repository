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

package org.eclipse.app4mc.multicore.execution.logic.executionmodel.types;

public enum EMTaskEvent {
	WAIT(0),
	TERMINATE(1),
	ACTIVATE(2),
	RELEASE(3),
	PREEMPT(4),
	START(5),
	NONE(6);
	
	public final static int COUNT = 5;
	
	private final int id;
	EMTaskEvent(int id) { this.id = id; }
    public int val() { return id; }
	
}
