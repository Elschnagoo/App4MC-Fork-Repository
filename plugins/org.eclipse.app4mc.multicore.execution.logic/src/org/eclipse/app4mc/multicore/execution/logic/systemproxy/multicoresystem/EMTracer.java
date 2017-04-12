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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMCore;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskEvent;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState.EMTaskHistStateFactory;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;

public class EMTracer implements ISchedulerEventListener {
	
	private ExecutionModel executionModel;
	
	private EMCore emCore;
	
	private Map<String,EMTaskHistState> currentHist = new HashMap<>();
	
	public EMTracer(String coreName,ExecutionModel m) {
		this.executionModel=m;
		this.emCore=new EMCore(coreName);
		m.addCore(emCore);
	}

	@Override
	public void onTaskAdded(String taskName) {
		executionModel.addTask(new EMTask(taskName));
	}

	@Override
	public void onStartTask(String task, long time) {
		EMTaskHistState leaving = currentHist.get(task);
		if(leaving!=null){
			leaving.setEnd(time);
			executionModel.addTaskHistEntry(task, leaving);
		}
		
		EMTaskHistState currentRunning = EMTaskHistStateFactory.create(EMTaskState.RUNNING, emCore);
		currentRunning.setStart(time);
		currentHist.put(task, currentRunning);
//		executionModel.addTaskHistEntry(task, currentRunning);
	}


	@Override
	public void onTerminateTask(String task, long time) {
		EMTaskHistState leavingRunning= currentHist.get(task);
		if(leavingRunning!=null){
			leavingRunning.setEnd(time);
			executionModel.addTaskHistEntry(task, leavingRunning);
		}
		
		
		EMTaskHistState suspendedTask = EMTaskHistStateFactory.create(EMTaskState.SUSPENDED, emCore);
		suspendedTask.setStart(time);
		suspendedTask.setEvent(EMTaskEvent.TERMINATE);
		currentHist.put(task, suspendedTask);
	}
	
	@Override
	public void onPreemptTask(String task, long time) {
		EMTaskHistState leavingRunning= currentHist.get(task);
		if(leavingRunning!=null){
			leavingRunning.setEnd(time);
			executionModel.addTaskHistEntry(task, leavingRunning);
		}
		
		EMTaskHistState readyTask=EMTaskHistStateFactory.create(EMTaskState.READY, emCore);
		readyTask.setStart(time);
		readyTask.setEvent(EMTaskEvent.PREEMPT);
		currentHist.put(task, readyTask);
	}

	@Override
	public void onStartIdleCore(long time) {
	}

	@Override
	public void onStopIdleCore(long time) {
	}

	@Override
	public void onActivateTask(String task, long time) {
		EMTaskHistState leavingSuspend=currentHist.get(task);
		if(leavingSuspend!=null){
			leavingSuspend.setEnd(time);
			executionModel.addTaskHistEntry(task, leavingSuspend);
		}
		
		EMTaskHistState readyTask=EMTaskHistStateFactory.create(EMTaskState.READY, emCore);
		readyTask.setStart(time);
		readyTask.setEvent(EMTaskEvent.ACTIVATE);
		currentHist.put(task, readyTask);
	}

	@Override
	public void onWaitTask(String task, long time, String muxName, String holder) {
		EMTaskHistState leavingRunning= currentHist.get(task);
		if(leavingRunning!=null){
			leavingRunning.setEnd(time);
			executionModel.addTaskHistEntry(task, leavingRunning);
		}
		
		EMTaskHistState waitingTask= EMTaskHistStateFactory.create(EMTaskState.WAITING,emCore);
		waitingTask.setStart(time);
		waitingTask.setEventCause(muxName);
		waitingTask.setNote(holder);
		currentHist.put(task, waitingTask);
	}

	@Override
	public void onReleaseTask(String task, long time) {
		EMTaskHistState leavingWaiting=currentHist.get(task);
		if(leavingWaiting!=null){
			leavingWaiting.setEnd(time);
			executionModel.addTaskHistEntry(task, leavingWaiting);
		}

		EMTaskHistState readyTask=EMTaskHistStateFactory.create(EMTaskState.READY, emCore);
		readyTask.setStart(time);
		readyTask.setEvent(EMTaskEvent.RELEASE);
		currentHist.put(task, readyTask);
	}

	@Override
	public void onTaskMissedDeadline(String task, long time, long remainingExectime) {
		EMTaskHistState before= currentHist.get(task);
		if(before!=null){
			before.setEnd(time);
			executionModel.addTaskHistEntry(task, before);
			currentHist.remove(task); //next will be activation
		}
		executionModel.addTaskDeadlineMissedEntry(task, emCore.getName(), time);
	}

	@Override
	public String getCoreName() {
		return emCore.getName();
	}

	

	
}
