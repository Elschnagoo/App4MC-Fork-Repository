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

public interface ISchedulerEventListener {
	
	public String getCoreName();
	
	public void onTaskAdded(String t);
	
	public void onActivateTask(String task, long time);
	public void onStartTask(String task, long time);
	public void onPreemptTask(String task, long time);
	public void onTerminateTask(String task, long time);
	public void onWaitTask(String task, long time, String muxName, String holder);
	public void onReleaseTask(String task, long time);
	
	public void onTaskMissedDeadline(String task, long time, long remainingExectime);
	
	public void onStartIdleCore(long time);
	public void onStopIdleCore(long time);
	
}
