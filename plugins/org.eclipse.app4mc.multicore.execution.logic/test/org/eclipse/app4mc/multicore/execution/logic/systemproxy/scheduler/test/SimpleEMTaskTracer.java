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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.test;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMCore;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState.EMTaskHistStateFactory;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;
/**
 * Logs only running states into Execution Model tasks.
 */
public class SimpleEMTaskTracer implements ISchedulerEventListener{
	
	private final Map<String,EMTask> tasks;
	private final EMCore core;
	
	private EMTaskHistState currentRunning;
	
	public SimpleEMTaskTracer(String corename) {
		core = new EMCore(corename);
		tasks=new HashMap<>();
	}
	public SimpleEMTaskTracer(Map<String,EMTask> tasks,EMCore c){
		this.core = c;
		this.tasks=tasks;
	}

	
	@Override
	public void onTaskAdded(String taskName) {
		tasks.put(taskName,new EMTask(taskName));
	}

	@Override
	public void onActivateTask(String task, long time) {
	}

	@Override
	public void onStartTask(String task, long time) {
		currentRunning = EMTaskHistStateFactory.create(EMTaskState.RUNNING, core);
		currentRunning.setEventSource(task);
		currentRunning.setStart(time);
	}

	@Override
	public void onTerminateTask(String task, long time) {
		currentRunning.setEnd(time);
		tasks.get(task).getStateHistory().add(currentRunning);
		currentRunning = null;
	}
	
	@Override
	public void onPreemptTask(String task, long time) {
		currentRunning.setEnd(time);
		tasks.get(task).getStateHistory().add(currentRunning);
		currentRunning = null;
	}


	@Override
	public void onStartIdleCore(long time) {

	}

	@Override
	public void onStopIdleCore(long time) {

	}

	public Map<String, EMTask> getEMTasks() {
		return tasks;
	}
	@Override
	public void onWaitTask(String task, long time, String muxName, String holder) {
		currentRunning.setEnd(time);
		tasks.get(task).getStateHistory().add(currentRunning);
		currentRunning = null;
	}
	
	@Override
	public void onReleaseTask(String task, long time) {
	}
	
	@Override
	public void onTaskMissedDeadline(String task, long time, long remainingExectime) {
		if(currentRunning!=null && currentRunning.getEventSource()==task){
			currentRunning.setEnd(time);
			tasks.get(task).getStateHistory().add(currentRunning);
			currentRunning = null;
		}
	}
	
	@Override
	public String getCoreName() {
		return core.getName();
	}

	

	

}
