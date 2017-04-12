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
package org.eclipse.app4mc.multicore.execution.logic.btf.fsm;

public class BtfTaskFSM {
	
private final static BtfTaskState[][] multi = new BtfTaskState[BtfTaskState.COUNT][BtfTaskEvent.COUNT];
	
	static{
		//every non transition is null
		/*outgoing transitions for state POLLING*/
		makeTransition(BtfTaskState.POLLING,BtfTaskEvent.RUN,BtfTaskState.RUNNING);
		makeTransition(BtfTaskState.POLLING,BtfTaskEvent.PARK,BtfTaskState.PARKING);
		/*outgoing transitions for state RUNNING*/
		makeTransition(BtfTaskState.RUNNING,BtfTaskEvent.TERMINATE,BtfTaskState.TERMINATED);
		makeTransition(BtfTaskState.RUNNING,BtfTaskEvent.PREEMPT,BtfTaskState.READY);
		makeTransition(BtfTaskState.RUNNING,BtfTaskEvent.POLL,BtfTaskState.POLLING);
		makeTransition(BtfTaskState.RUNNING,BtfTaskEvent.WAIT,BtfTaskState.WAITING);
		/*outgoing transitions for state TERMINATED*/
		//none
		/*outgoing transitions for state NOT_INITIALIZED*/
		makeTransition(BtfTaskState.NOT_INITIALIZED,BtfTaskEvent.ACTIVATE,BtfTaskState.ACTIVE);
		/*outgoing transitions for state ACTIVE*/
		makeTransition(BtfTaskState.ACTIVE,BtfTaskEvent.START,BtfTaskState.RUNNING);
		/*outgoing transitions for state READY*/
		makeTransition(BtfTaskState.READY,BtfTaskEvent.RESUME,BtfTaskState.RUNNING);
		/*outgoing transitions for state PARKING*/
		makeTransition(BtfTaskState.PARKING,BtfTaskEvent.RELEASE_PARKING,BtfTaskState.READY);
		makeTransition(BtfTaskState.PARKING,BtfTaskEvent.POLL_PARKING,BtfTaskState.POLLING);
		/*outgoing transitions for state WAITING*/
		makeTransition(BtfTaskState.WAITING,BtfTaskEvent.RELEASE,BtfTaskState.READY);	
	}
	
	private static void makeTransition(BtfTaskState oldState,BtfTaskEvent e, BtfTaskState newState){
		multi[oldState.val()][e.val()]=newState;
	}
	
	private BtfTaskState currentState;
	
	public BtfTaskFSM(BtfTaskState start){
		currentState=start;
	}
	
	public void setState(BtfTaskState state){
		this.currentState=state;
	}
	
	public BtfTaskState getState(){
		return currentState;
	}
	
	public boolean dispatchEvent(BtfTaskEvent event){
		BtfTaskState newState=multi[currentState.val()][event.val()];
		if(newState!=null){
			currentState=newState;
			return true;
		}else{
			//no state change
			return false;
		}
	}

}
