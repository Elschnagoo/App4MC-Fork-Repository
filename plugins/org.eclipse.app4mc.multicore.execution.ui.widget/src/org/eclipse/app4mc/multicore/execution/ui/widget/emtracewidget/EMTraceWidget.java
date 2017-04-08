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
package org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget;

import java.util.function.BiConsumer;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMCore;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskEvent;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask.DeadlineEntry;
import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.TraceWidget;

public class EMTraceWidget extends TraceWidget implements IEMTraceWidget{
	

	@Override
	public void addExecutionModel(ExecutionModel em){
		reset();
		
		if(em.getTimeScale()!=EMTimeType.NONE){
			setAxisLabels(em.getTimeScale().toString().toLowerCase());
		}
		
		//compute already present data in the model
		for (EMCore c : em.getCores().values()) {
			addEMCore(c);
		}
		for (EMTask h : em.getTasks().values()) {
			// task state is chosen
			addEMTask(h);
			if (h.getStateHistory().size() > 1) {
				for (EMTaskHistState he : h.getStateHistory()) {
					addEMTaskHist(h,he);
				}
			}
			for(DeadlineEntry entry:h.getMissedDeadlines()){
				addDeadlineMissed(h, entry);
			}
		}
		
		em.addTaskHistEntryAddedListener(new BiConsumer<EMTask, EMTaskHistState>() {
			@Override
			public void accept(EMTask t, EMTaskHistState u) {
				System.out.println("Task: "+t.getName());
				System.out.println("State:" + u.getState());
			}
		});
		
		
		//register listener => if the model changes the view will present the new data also.
		//same as implementing Consumer<EMTask> and pass this but more flexible
		//because we can also register static methods and we don't need a bunch of
		//interfaces for every event (with the same parameter) and can use the 
		//generic Consumer<Type>.
		em.addTaskAddedListener(this::addEMTask); 
		em.addCoreAddedListener(this::addEMCore); 
		em.addTaskHistEntryAddedListener(this::addEMTaskHist);
		em.addTaskDeadlineListener(this::addDeadlineMissed);
	}
	
	private void addEMCore(final EMCore c){
		addCore(c.getName());
	}
	
	private void addEMTask(final EMTask t){
		//in the view we have a direct allocation of a task to a core
		//therefore we wait until addEMTaskHist gets invoked
	}

	/**
	 * Add EMTaskHist to the view. This will only work if it has a reference to a core because
	 * the view has a direct allocation from core to task 
	 * (one gantt-chart for every core; each line in the core represents a task).
	 * @param t
	 * @param e
	 */
	private void addEMTaskHist(final EMTask t,final EMTaskHistState e){
		
		if(e.getCore()!=null){
			
			addTask(e.getCore().getName(), t.getName()); //multiple calls have no effect
			
			switch (e.getState()) {
			case RUNNING:
				addTaskRunning(e.getCore().getName(), t.getName(), e.getStart(), e.getEnd());
				break;
			case WAITING:
				String note = "\nSuppressor: "+e.getNote();
				addTaskWaiting(e.getCore().getName(), t.getName(), note,e.getStart(), e.getEnd());
				break;
			case READY:
				addTaskReady(e.getCore().getName(), t.getName(), e.getStart(),e.getEnd());
				if(e.getEvent()==EMTaskEvent.ACTIVATE){
					addTaskActivation(e.getCore().getName(), t.getName(), e.getStart());
				}
				break;
			case SUSPENDED:
				addTaskSuspended(e.getCore().getName(), t.getName(), e.getStart(), e.getEnd());
	
			default:
				break;
			}
		}
	}
	
	private void addDeadlineMissed(final EMTask t, DeadlineEntry entry){
		addTaskDeadlineMissed(entry.core.getName(),t.getName(),entry.time);
	}

	
	
}
