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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerTask;
public class SchedulerTask extends TaskFSM implements ISchedulerTask{

	/**
	 * Barriers are task-synchronization-points. This implementation relies on simulated barriers.
	 * All owned barriers will be locked at beginning of every task-period. It will be
	 * released after barrier release time is reached.
	 */
	private final List<BarrierAccess> ownedBarriers = new LinkedList<>();

	/**
	 * Barriers are used for synchronization of dependent tasks. The current task
	 * has to wait until all dependentMutexes are unlocked.
	 */
	private final List<Barrier> dependentBarrier = new LinkedList<>();

	/**Task name*/
	private final String name;

	/**Worst case execution time.*/
	private final long wcet;

	/**Fix period of the task.*/
	private final long period;

	/**Count of the current period.*/
	private int periodCount = 0;

	/**Relative earliest start time or activation time.*/
	private long esTime=0;

	/**Current consumed execution time.*/
	private long currentExecTime = 0;
	
	/**Unique upcounting number in a scheduler*/
	private int id;

	public SchedulerTask(String name, long wcet, long period) {
		super(TState.READY);
		this.name = name;
		this.wcet = wcet;
		this.period = period;
		this.esTime = 0;
	}

	public String getName() {
		return name;
	}

	@Override
	public long getWCET() {
		return wcet;
	}

	@Override
	public long getPeriod() {
		return period;
	}

	/**
	 * @return the periodCount
	 */
	public int getPeriodCount() {
		return periodCount;
	}

	/**
	 * @param periodCount
	 *            the periodCount to set
	 */
	public void incrementPeriodCount() {
		this.periodCount++;
	}

	public long getCurrentExecTime() {
		return currentExecTime;
	}

	/**
	 * Run one time slot.
	 */
	public void run() {
		assert isRunning();
		currentExecTime= Math.addExact(currentExecTime, 1); //one time step
		assert currentExecTime <= wcet;
	}

	/**
	 * Check if current execution time of the task reached WCET.
	 * @return
	 */
	public boolean reachedWCET() {
		return currentExecTime == wcet;
	}


	/**
	 * Get the remaining execution time to WCET.
	 * @return
	 */
	public long remainingExecutionTime() {
		return wcet - currentExecTime;
	}


	/**
	 * Reset the task to be ready for the next period. 
	 * <ul>
	 * <li>set current execution time to zero</li>
	 * <li>set the next earliest start time to the start of the next period</li>
	 * </ul>
	 */
	public void resetForNextPeriod() {
		this.currentExecTime = 0;
		this.esTime += period;
		lockOwnedBarriers();
		incrementPeriodCount();
	}


	/**
	 * Get current absolute earliest start time.
	 * 
	 * @return
	 */
	public long getEearliestStartTime() {
		return esTime;
	}

	public long getNextActivationTime() {
		return getEearliestStartTime() + period;
	}

	/**
	 * Check if has blocking barriers (by mutexes).
	 * @return
	 */
	public boolean hasBlockingBarrier() {
		for (Barrier m : dependentBarrier) {
			if (m.isLocked()) {
				return true;
			}
		}
		return false;
	}
	
	public Barrier getFirstBlockingMutex(){
		for(Barrier m: dependentBarrier){
			if(m.isLocked()){
				return m;
			}
		}
		return null;
	}

	/**
	 * Get the current (absolute) deadline.
	 * 
	 * @return
	 */
	public long getDeadline() {
		return getEearliestStartTime() + getPeriod();
	}

	
	/**
	 * Unlock owned barriers/ mutexes that reached release time.
	 */
	public void updateOwnedBarriers(){
		for(BarrierAccess ma:ownedBarriers){
			long releaseTime = ma.getReleaseTime();
			assert releaseTime <=getCurrentExecTime() ||releaseTime==ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION;
			if(releaseTime==getCurrentExecTime()){
				ma.getBarrier().unlock();
			}else if(releaseTime==ISchedulerTask.BARRIER_UNLOCK_AT_SUSPENSION&& isSuspended()){
				ma.getBarrier().unlock();
			}
		}
	}
	
	/**
	 * Lock all owned barriers (mutexes)
	 */
	public void lockOwnedBarriers(){
		
		for(BarrierAccess ma:ownedBarriers){
			if(!ma.getBarrier().tryLock(getName())){
				//with owned mutexes the locking will always be possible
				//because current thread have to be the only task
				//that locks it.
				
				//Despite the task overrun an deadline and some owned barriers 
				//arent 
			}
		}
	}
	
	/**
	 * Get identifier for the task. Unique in a scheduler.
	 * Indicates the adding order for the scheduler.
	 * @return
	 */
	public int getId(){
		return id;
	}
	
	/**
	 * Set identification. 
	 * @param id
	 */
	public void setId(int id){
		this.id=id;
	}

	/**
	 * Add an owned barrier to the task. Owned barriers are used for setting up task precedence.
	 * The owner is the predecessor task. The successor task is dependent of the same barrier instance ({@link #addDependentBarrier(Barrier m)}).
	 * 
	 * Barrier requirements
	 * <ul>
	 * <li>Passed instance have to be unlocked (free)</li>
	 * <li>Passed instance have to be added to one owning task and to one or multiple depending tasks</li>
	 * <li>Only the owner task locks and unlocks the barrier. Dependants only query if is unlocked</li>
	 * </ul>
	 * @see
	 * #addDependentBarrier(Barrier)
	 * @param barrier Barrier that have to be unlocked.
	 * @param releaseTime Execution time of the task when the barrier gets unlocked in each period.
	 */
	@Override
	public void addOwnedBarrier(Barrier barrier,long releaseTime) {
		//implementation through barriers and not through predecessor task
		//so  unlocking can happen at random release times and not only at suspension
		//lock initially
		if(!barrier.tryLock(getName())){
			//not free 
			assert false; //precondition free
		}
		BarrierAccess ma= new BarrierAccess(ISchedulerTask.BARRIER_LOCK_AT_ACTIVATION, releaseTime, barrier);
		ownedBarriers.add(ma);
	}
	
	/**
	 * Add dependent barrier. 
	 * @see 
	 * #addOwnedBarrier(Barrier, long)
	 * @param m
	 */
	@Override
	public void addDependentBarrier(Barrier m){
		dependentBarrier.add(m);
	}


}
