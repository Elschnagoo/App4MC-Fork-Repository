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

package org.eclipse.app4mc.multicore.execution.logic.executionmodel.types;


public class EMTaskFSM {


	
	private final static EMTaskState[][] multi = new EMTaskState[EMTaskState.COUNT][EMTaskEvent.COUNT];
	
	static{
		//every non transition is null
		/*outgoing transitions for state RUNNING*/
		makeTransition(EMTaskState.RUNNING,EMTaskEvent.TERMINATE,EMTaskState.SUSPENDED);
		makeTransition(EMTaskState.RUNNING,EMTaskEvent.PREEMPT,EMTaskState.READY);
		makeTransition(EMTaskState.RUNNING,EMTaskEvent.WAIT,EMTaskState.WAITING);

		/*outgoing transitions for state READY*/
		makeTransition(EMTaskState.READY,EMTaskEvent.START,EMTaskState.RUNNING);
		
		/*outgoing transitions for state WAITING*/
		makeTransition(EMTaskState.WAITING,EMTaskEvent.RELEASE,EMTaskState.READY);	
		
		/*outgoing transitions for state SUSPENDED*/
		makeTransition(EMTaskState.SUSPENDED,EMTaskEvent.ACTIVATE,EMTaskState.READY);	
	}
	
	private static void makeTransition(EMTaskState oldState,EMTaskEvent e, EMTaskState newState){
		multi[oldState.val()][e.val()]=newState;
	}
	
	private EMTaskState currentState;
	
	public EMTaskFSM(EMTaskState start){
		currentState=start;
	}
	
	public void setState(EMTaskState state){
		this.currentState=state;
	}
	
	public EMTaskState getState(){
		return currentState;
	}
	
	public boolean dispatchEvent(EMTaskEvent event){
		EMTaskState newState=multi[currentState.val()][event.val()];
		if(newState!=null){
			currentState=newState;
			return true;
		}else{
			//no state change
			return false;
		}
	}

}
