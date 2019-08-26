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


public enum EMTaskState {
	SUSPENDED(0),
	RUNNING(1),
	READY(2),
	WAITING(3);
	
	public final static int COUNT= 8;
	
	private final int id;
	EMTaskState(int id) { this.id = id; }
    public int val() { return id; }
}
