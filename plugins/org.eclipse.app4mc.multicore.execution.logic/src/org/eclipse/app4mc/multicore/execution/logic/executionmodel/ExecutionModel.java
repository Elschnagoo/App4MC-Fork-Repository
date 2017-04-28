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
package org.eclipse.app4mc.multicore.execution.logic.executionmodel;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMCore;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask.DeadlineEntry;

public class ExecutionModel{
	
	private final Map<String,EMCore> cores = new HashMap<>();
	
	private final List<Consumer<EMCore>> coreAddedListener = new LinkedList<>();
	
	private final Map<String,EMTask> tasks = new HashMap<>();
	
	private final List<Consumer<EMTask>> taskAddedListener = new LinkedList<>();
	
	private List<BiConsumer<EMTask, EMTaskHistState>> histEntryListener = new LinkedList<>();

	private List<BiConsumer<EMTask, DeadlineEntry>> deadlineListener=new LinkedList<>();
	
	private EMTimeType timeScale=EMTimeType.NONE;
	
	public Map<String, EMCore> getCores() {
		return cores;
	}
	
	/**
	 * Tasks in of after execution.
	 * @see EMTask 
	 * @return
	 */
	public Map<String, EMTask> getTasks() {
		return tasks;
	}
	
	public void setTimeScale(EMTimeType t){
		this.timeScale=t;
	}
	
	public EMTimeType getTimeScale(){
		return timeScale;
	}
	
	public void addTaskDeadlineMissedEntry(String taskName,String core,Long time){
		final EMTask t =tasks.get(taskName);
		DeadlineEntry d= new DeadlineEntry(time, cores.get(core));
		t.getMissedDeadlines().add(d);
		notifyTaskDeadlineMissed(t, d);
	}
	
	/**
	 * Add a history entry to a task (e.g state running from time point 1000 to 1223).
	 * By adding the entry with this method observer will be notified about completed task hist entries.
	 * @param taskName
	 * @param e
	 */
	public void addTaskHistEntry(String taskName,EMTaskHistState e){
		final EMTask t =tasks.get(taskName);
		t.getStateHistory().add(e);
		notifyTaskHistEntryListener(t,e);
	}
	
	/**
	 * Add a task to the model. Only this method will notify observers about added tasks.
	 * @param t
	 */
	public synchronized void addTask(EMTask t){
		tasks.put(t.getName(), t);
		notifyTaskAddedListener(t);
	}
	
	/**
	 * Add a core to the model. Only this method will notify observers about added cores.
	 * @param c
	 */
	public void addCore(EMCore c){
		cores.put(c.getName(), c);
		notifyAllCoreAddedObserver(c);
	}
	
	private void notifyAllCoreAddedObserver(EMCore c) {
		coreAddedListener.forEach(x->x.accept(c));
	}

	private void notifyTaskAddedListener(EMTask t){
		taskAddedListener.forEach(x->x.accept(t));
	}
	
	private void notifyTaskHistEntryListener(EMTask t, EMTaskHistState e){
		histEntryListener.forEach(x->x.accept(t, e));
	}
	
	public void addTaskHistEntryAddedListener(BiConsumer<EMTask, EMTaskHistState> e ){
		histEntryListener.add(e);
	}
	
	public void addTaskAddedListener(Consumer<EMTask> t){
		taskAddedListener.add(t);
	}
	
	public void addCoreAddedListener(Consumer<EMCore> c){
		coreAddedListener.add(c);
	}

	public void addTaskDeadlineListener(BiConsumer<EMTask, DeadlineEntry> e) {
		deadlineListener.add(e);
	}
	
	private void notifyTaskDeadlineMissed(EMTask t, DeadlineEntry e){
		deadlineListener.forEach(x->x.accept(t, e));
	}

}
