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
package org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget;

public interface ITraceWidget {
	public void addCore(String core);
	public void addTask(String core, String task);
	
	/*Events*/
	public void addTaskDeadlineMissed(String core, String task, long time);
	public void addTaskActivation(String core, String task, long time);
	
	/*States*/
	public void addTaskRunning(String core, String task, long start, long stop);
	public void addTaskSuspended(String core, String task, long start, long stop);
	public void addTaskReady(String core, String task, long start, long stop);
	public void addTaskWaiting(String core, String task, String note,long start, long stop);
	
	public void reset();
}
