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
