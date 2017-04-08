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

import java.util.function.Consumer;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.IStepScheduler;

public class StepScheduler extends AbstractScheduler implements IStepScheduler{
	
	private boolean startedIdle =false;
	
	private enum ScheduleState{
		EXECUTED_RUN,EXECUTED_UPDATESYNC,EXECUTED_UPDATESET,UNINIT,EXECUTED_INIT
	}
	
	private ScheduleState currentState = ScheduleState.UNINIT;
	
	/**
	 * Run Sequence:
	 * {@link #runTaskOrIdleStep()}
	 * {@link #updateTaskSynchronisation()}
	 * {@link #updateTaskSet()}
	 */
	public StepScheduler(ISchedulerAlgorithm m) {
		super(m);
	}
	
	@Override
	public void init(){
		if(currentState==ScheduleState.UNINIT){
			for(String task:getTasks().keySet()){
				notifyObserver(x -> x.onTaskAdded(task));
				notifyObserver(x->x.onActivateTask(task, 0));
			}
			currentState=ScheduleState.EXECUTED_INIT;
		}else{
			throw new IllegalStateException("Init the scheduler once before start");
		}
	}
	
	@Override
	public void updateTaskSynchronisation() {
		if(currentState==ScheduleState.EXECUTED_RUN){
			updateTaskSynchronisationIntern();
			currentState=ScheduleState.EXECUTED_UPDATESYNC;
		}else{
			throw new IllegalStateException("Wrong method sequencing!");
		}
	}
	
	/**
	 * For all tasks free owned barrier if release-time is reached.
	 */
	private void updateTaskSynchronisationIntern() {
		getTasks().values().forEach(SchedulerTask::updateOwnedBarriers);
	}
	
	@Override
	public void updateTaskSet() {
		if(currentState==ScheduleState.EXECUTED_UPDATESYNC){
			updateTaskSetIntern();
			currentState=ScheduleState.EXECUTED_UPDATESET;
		}else{
			throw new IllegalStateException("Wrong method sequencing!");
		}
	}
	
	/**
	 * Call for each task:
	 * <ul>
	 * <li>{@link #updateTaskActivate(SchedulerTask)} </li>
	 * <li>{@link #updateTaskRelease(SchedulerTask)} </li>
	 * </ul>
	 */
	private void updateTaskSetIntern() {
			getTasks().values().forEach(
					((Consumer<SchedulerTask>)this::updateTaskActivate)
					.andThen(this::updateTaskRelease)
			);
	}
	
	
	
	/**
	 * If the next period is intersected the task gets the activation event. If
	 * the task was in suspended state (OSEK-Task-Model) the task is now in
	 * ready state and deadline etc. will be setup for next period.
	 * 
	 * @param t
	 */
	private void updateTaskActivate(SchedulerTask t) {
		if (getSimTime()>=t.getNextActivationTime()) {
			
			if (t.reachedWCET()) {
				if (t.ev_activate()) {
					// task was suspended and is now ready (normal activation)
					assert t.isReady();
				}else{
					//task wasn't in suspended mode but reached wcet...
					//not possible
					assert false;
				}
			}else{
				//missed deadline
				assert t.remainingExecutionTime() > 0;
				notifyObserver(x -> x.onTaskMissedDeadline(t.getName(), getSimTime(), t.remainingExecutionTime()));
				t.hardResetFSM();
			}
			
			assert t.isReady();
			t.resetForNextPeriod();
			notifyObserver(x -> x.onActivateTask(t.getName(), getSimTime()));
			
//			if (t.reachedWCET()) {
//				if (t.ev_activate()) {
//					// task was suspended and is now ready (normal activation)
//					assert t.isReady();
//					t.resetForNextPeriod();
//					notifyObserver(x -> x.onActivateTask(t.getName(), getSimTime()));
//				}else{
//					//task wasn't in suspended mode but reached wcet...
//					//not possible
//					assert false;
//				}
//			}else{
//				assert t.remainingExecutionTime() > 0;
//				notifyObserver(x -> x.onTaskMissedDeadline(t.getName(), getSimTime(), t.remainingExecutionTime()));
//				t.hardResetFSM(); 
//				t.resetForNextPeriod();
//				notifyObserver(x -> x.onActivateTask(t.getName(), getSimTime()));
//			}
		}
	}



	/**
	 * If the task has no blocking mutexes it gets the release event. If the
	 * current state was waiting the new state is ready.
	 */
	protected void updateTaskRelease(SchedulerTask t) {
		if (!t.hasBlockingBarrier()) {
			if (t.ev_release()) {
				assert t.isReady();
				notifyObserver(x -> x.onReleaseTask(t.getName(), getSimTime()));
			}
		}
	}

	
	
	
	
	
	@Override
	public void runTaskOrIdleStep(){
		if(currentState==ScheduleState.EXECUTED_UPDATESET||currentState==ScheduleState.EXECUTED_INIT){
			runTaskOrIdleStepIntern();
			currentState=ScheduleState.EXECUTED_RUN;
		}else{
			throw new IllegalStateException("Wrong method sequencing!");
		}
	}
	
	/**
	 * <ul>
	 * <li>preempt currentTask if is set, is preemtive scheduling and there is a higher prio task</li>
	 * <li>
	 */
	protected void runTaskOrIdleStepIntern() {
//		updateTaskSetIntern();
		updatePreemptCurrentTask();
		
		do{
			if (currentTask == null) {
				currentTask = getReadyPriorityTask();
			}
			if(currentTask==null){
				//no rdy task
				if(!startedIdle){
					//starting idle
					startedIdle=true;
					notifyObserver((x) -> x.onStartIdleCore(getSimTime()));
				}
				timeStep();
				return; //nothing more to do
			}else if (currentTask!=null && startedIdle){
				//got task after idle
				notifyObserver((x) -> x.onStopIdleCore(getSimTime()));
				startedIdle=false;
			}
			
			assert currentTask!=null;
			assert currentTask.isReady()||currentTask.isRunning();
			
			if (currentTask.ev_start()) {
				//only if task was ready
				notifyObserver(x -> x.onStartTask(currentTask.getName(), getSimTime()));
			}else{
				//task were already running
			}
			
			assert currentTask.isRunning();
			
			//if task is blocked by mutexes set it to wait
			if(currentTask.hasBlockingBarrier()){
				if(currentTask.ev_wait()){
					//should always be true but for convention we use if for notify regarding task state changes
					Barrier m = currentTask.getFirstBlockingMutex();
					notifyObserver(x -> x.onWaitTask(currentTask.getName(), getSimTime(), m.getName(), m.getHolder()));
				}
				assert currentTask.isWaiting();
				currentTask=null; //drop task
			}
		}while(currentTask==null); //look for new task because current one (before set to null) is now waiting
		
		assert currentTask !=null;
		assert !currentTask.hasBlockingBarrier();
		assert currentTask.isRunning();

		currentTask.run();
		timeStep();
		
		updateCurrenTaskSuspension();
	}
	
	
	
	private void updatePreemptCurrentTask(){
		if (currentTask != null && isPreemptiveScheduling()) {
			assert currentTask.isRunning();
			
			// scheduling with preemption, so high prio tasks
			// can suppress lower tasks
			SchedulerTask t = getReadyPriorityTask();
			if (t != null && compare(t, currentTask) < 0) {
				// current task has a lower prio than t
				if (currentTask.ev_preempt()) {
					notifyObserver(x -> x.onPreemptTask(currentTask.getName(), getSimTime()));
				}
				assert currentTask.isReady();
				currentTask = null;// look for other task next round
			}
		}
	}
	
	
	/**
	 * If a currenTask is set and this have reached WCET terminate it, so new state is suspended.
	 * Unset currentTaks.
	 */
	private void updateCurrenTaskSuspension(){
		if (currentTask != null && currentTask.reachedWCET()) {
			// currentTask.unlockOwnedMutexes();
			if (currentTask.ev_terminate()) {
				//should always be true
				notifyObserver(x -> x.onTerminateTask(currentTask.getName(), getSimTime()));
			}
			assert currentTask.isSuspended();
			// currentTask execution finished for this period or is (newly)
			// blocked
			// => next round we have to lookup for a new task
			currentTask = null;// look for other task next round
		}
	}

	

	
}
