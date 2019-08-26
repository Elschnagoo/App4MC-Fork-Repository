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

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;

public abstract class AbstractScheduler implements ISchedulerBase {

	/**Simulation time.*/
	protected long simTime = 0;

	/**Map of tasks accessible by their names*/
	private final Map<String, SchedulerTask> tasks = new HashMap<>();

	/**Listners or observers that gets informed about scheduling information like task state changes.**/
	private List<ISchedulerEventListener> osHookListeners = new LinkedList<>();

	/**Algorithm to choose high prio task and determine if is cooperative or preemptive scheduling.**/
	private final ISchedulerAlgorithm schedulingAlgo;

	/**Current task in execution**/
	protected SchedulerTask currentTask=null;

	public AbstractScheduler(ISchedulerAlgorithm m) {
		this.schedulingAlgo = m;
	}

	protected void notifyObserver(Consumer<? super ISchedulerEventListener> action) {
		this.osHookListeners.forEach(action);
	}

	protected Map<String, SchedulerTask> getTasks() {
		return this.tasks;
	}
	
	protected List<ISchedulerEventListener> getOsHookListeners() {
		return osHookListeners;
	}

	/**
	 * Search for the task with the highest priority, which is in ready state.
	 * Uses {@link #compare(SchedulerTask, SchedulerTask)} to determine higher/ lower prio.
	 * @return Task with highest prio or null if no ready task is available.
	 */
	protected SchedulerTask getReadyPriorityTask() {
		SchedulerTask highTask = null;
		for (SchedulerTask t : tasks.values()) {
			if (t.isReady()) {
				if (highTask == null || compare(t, highTask) < 0) {
					highTask = t;
				}
			}
		}
		return highTask;
	}

	/**
	 * Get simulation time.
	 */
	@Override
	public long getSimTime() {
		return simTime;
	}
	
	/**
	 * Increment simulation time by one.
	 */
	protected void timeStep() {
		simTime++;
	}

	
	protected boolean isPreemptiveScheduling(){
		return schedulingAlgo.isPreemptiveScheduling();
	}
	
	/**
	 * Compare two tasks regarding its priority.
	 * Therefore the provided scheduling algorithm is used. If the algorithm
	 * determines the same priority the earliest added task wins.
	 * @param t1
	 * @param t2
	 * @return 
	 * <ul>
	 * <li>t1 has highest priority: < 0 (-1)</li>
	 * <li>t2 has highest priority: > 0 (1)</li>
	 * <ul>
	 */
	protected int compare(SchedulerTask t1,SchedulerTask t2){
		int tmp = schedulingAlgo.compare(t1, t2);
		if(tmp==0){
			//same prio => lowest id wins (earliest added task)
			tmp = Integer.compare(t1.getId(), t2.getId());
		}
		return tmp;
	}
	
	@Override
	public SchedulerTask getTask(String name) {
		return getTasks().get(name);
	}
	
	@Override
	public void addTask(String name,long wcet, long period) {
		SchedulerTask t = new SchedulerTask(name, wcet, period);
		t.setId(getTasks().size());
		getTasks().put(t.getName(), t);
	}
	@Override
	public void addSchedulerEventListener(ISchedulerEventListener l) {
		getOsHookListeners().add(l);
	}

}
