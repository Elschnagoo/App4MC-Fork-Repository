/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.btf;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.eclipse.app4mc.multicore.execution.logic.btf.fsm.BtfTaskEvent;
import org.eclipse.app4mc.multicore.execution.logic.btf.fsm.BtfTaskFSM;
import org.eclipse.app4mc.multicore.execution.logic.btf.fsm.BtfTaskState;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEntityType;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfEvent;
import org.eclipse.app4mc.multicore.execution.logic.btf.model.BtfTrace;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMCore;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTask;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskState;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.types.EMTaskHistState.EMTaskHistStateFactory;

public class BtfComputer {
	
	
	/**
	 * Translation from BTF-State-Model to OSEK.
	 * 
	 * BTF-States are outlined by the following OSEK-States
	 * 
	 * BTF 							| OSEK
	 *_______________________________________
	 * ACTIVE; READY; PARKING 		| READY
	 * RUNNING; POLLING				| RUNNING
	 * WAITING 						| WAITING
	 * NOT_INITIALIZED; TERMINATED  | SUSPENDED
	 * 
	 */
	protected final static Map<BtfTaskState,EMTaskState> btfToOSEKState = new HashMap<>();

	static{
		btfToOSEKState.put(BtfTaskState.ACTIVE, EMTaskState.READY);
		btfToOSEKState.put(BtfTaskState.READY, EMTaskState.READY);
		btfToOSEKState.put(BtfTaskState.PARKING, EMTaskState.READY);
		
		btfToOSEKState.put(BtfTaskState.RUNNING, EMTaskState.RUNNING);
		btfToOSEKState.put(BtfTaskState.POLLING, EMTaskState.RUNNING);
		
		btfToOSEKState.put(BtfTaskState.WAITING, EMTaskState.WAITING);
		
		btfToOSEKState.put(BtfTaskState.NOT_INITIALIZED, EMTaskState.SUSPENDED);
		btfToOSEKState.put(BtfTaskState.TERMINATED, EMTaskState.SUSPENDED);
	}
	
//	private Map<String,EMTask> tasks = new HashMap<>();
//	
//	private Map<String,EMCore> cores = new HashMap<>();
	
	private final BtfTrace trace;
	
	private final ExecutionModel executionModel;
	
	private Map<String,BtfTaskFSM> taskFSMs=new HashMap<>();
	
	private String errorMsg="";
	

	
	private Map<BtfEntityType,Function<BtfEvent,Boolean>> translationMap = new HashMap<>();
	
	public BtfComputer(BtfTrace trace,ExecutionModel m){
		this.trace=trace;
		this.executionModel = m;
		setupMap();
	}
	
	private void setupMap(){
		translationMap.put(BtfEntityType.TASK,this::computeTaskEvent);
		translationMap.put(BtfEntityType.RUNNABLE, this::computeRunnableEvent);
	}
	
	public void compute() throws BtfException{
		
		/*Copy cores*/
		for(Map.Entry<String, BtfEntityType> centr:trace.getEntityTypeTable().entrySet()){
			if(centr.getValue()==BtfEntityType.CORE){
				EMCore c = new EMCore(centr.getKey());
				executionModel.addCore(c);
			}
		}
		/*process events*/
		for(BtfEvent e: trace.getEvents()){
			Function<BtfEvent,Boolean> comp=translationMap.get(e.getTargetType());
			if(comp!=null){
				//calls the registered method for the type
				if(!comp.apply(e)){
					//failed 
					throw new BtfException(errorMsg);
				}
			}else{
				//type not implemented yet
			}
		}
	}
	
	private Map<String,EMTaskHistState> histories= new HashMap<>();
	
	private Boolean computeTaskEvent(BtfEvent e){
		
		EMTask task=executionModel.getTasks().get(e.getTarget());
		if(task==null){
			//called at: first occurrence of event to target e.getTarget()
			task= new EMTask(e.getTarget());
			executionModel.addTask(task);
			taskFSMs.put(task.getName(),new BtfTaskFSM(BtfTaskState.NOT_INITIALIZED));
			EMTaskHistState currentHist = EMTaskHistStateFactory.create(btfToOSEKState.get(BtfTaskState.NOT_INITIALIZED));
			currentHist.setNote("StartState");
			currentHist.setEventSource("Init");
			currentHist.setEnd(e.getTime());
			executionModel.addTaskHistEntry(task.getName(), currentHist);
		}
		
		EMTaskHistState old = histories.get(task.getName());
		if(old!=null){
			old.setEnd(e.getTime());
			executionModel.addTaskHistEntry(task.getName(), old);
		}
		
		
		BtfEntityType t = trace.getEntityTypeTable().get(e.getSource());
		if(t==null){
			//type of source not in trace header
			errorMsg = "Type for source " + e.getSource() + " not in header!";
			return false;
		}
//		else if(t == BtfEntityType.CORE){
//			EMCore c = cores.get(e.getSource());
//			newEv.setCore(c);
//		}
		EMCore c = executionModel.getCores().get(e.getSource()); //null if no core found

		BtfTaskFSM tfsm = taskFSMs.get(task.getName());
		BtfTaskEvent te= BtfTaskEvent.valueOf(e.getEvent().toUpperCase());
		if(te==null){
			//event is not known
			errorMsg="Unknown event: " + e.getEvent();
			return false;
		}
		if(!tfsm.dispatchEvent(te)){
			//no task change 
			//every event should do an eventchange => previous dataloss 
			errorMsg = "Detected dataloss for tas" + task.getName();
			return false;
		}
		
		EMTaskHistState newStateHist= EMTaskHistStateFactory.create(btfToOSEKState.get(tfsm.getState()), c);
//		newEv.setEvent(te);
		newStateHist.setEventSource(e.getSource());
		if(newStateHist.getNote()==null){
			newStateHist.setNote(e.getNote());
		}
		newStateHist.setStart(e.getTime());
		histories.put(task.getName(), newStateHist);
		return true;
	}
	
	private Boolean computeRunnableEvent(BtfEvent e){
		//TODO implement runnable state compution
		return true;
	}
	
	public ExecutionModel getExecutionModel(){
		return this.executionModel;
	}

	
}
