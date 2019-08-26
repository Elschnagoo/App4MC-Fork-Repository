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

/**
 * Implementation of the OSEK Task Model.
 * Note: We do not use state design pattern because every event delegates only to one state. 
 * Therefore the design pattern would produce overhead.
 */
public class TaskFSM {
	

	public enum TState{
		NONE,WAITING,RUNNING,READY,SUSPENDED
	}
	
	private TState currentState;
	private TState previousState;
	
	@SuppressWarnings("unused")
	private final TState startState;
	
	
	public TaskFSM(final TState startState){
		this.startState=startState;
		this.currentState=startState;
		this.previousState=TState.NONE;
	}
	
	/**
	 * Set current-state to READY. Previous state will be saved.
	 */
	public void hardResetFSM(){
		this.previousState=currentState;
		this.currentState=TState.READY;
	}
	
	public boolean isReady() {
		return currentState == TState.READY;
	}

	public boolean isSuspended() {
		return currentState == TState.SUSPENDED;
	}

	public boolean isWaiting() {
		return currentState == TState.WAITING;
	}

	public boolean isRunning() {
		return currentState == TState.RUNNING;
	}
	
//	
//	private class State{
//		public boolean ev_wait(){
//			return false;
//		}
//		public boolean ev_terminate(){
//			return false;
//		}
//		public boolean ev_activate(){
//			return false;
//		}
//		public boolean ev_release(){
//			return false;
//		}
//		public boolean ev_start(){
//			return false;
//		}
//		public boolean ev_preempt(){
//			return false;
//		}
//	}
//	
//	public class StateRunning extends State{
//		public boolean ev_terminate(){
//			setState(newState);
//		}
//	}
	

	
	
	public boolean ev_preempt() {
		if(isRunning()){
			setState(TState.READY);
			return true;
		}
		return false;
	}
	
	public boolean ev_terminate(){
		if(isRunning()){
			setState(TState.SUSPENDED);
			return true;
		}
		return false;
	}

	public boolean ev_start() {
		if(isReady()){
			setState(TState.RUNNING);
			return true;
		}
		return false;
	}
	
	public boolean ev_wait(){
		if(isRunning()){
			setState(TState.WAITING);
			return true;
		}
		return false;
	}
	
	public boolean ev_release(){
		if(isWaiting()){
			setState(TState.READY);
			return true;
		}
		return false;
	}
	
	public boolean ev_activate(){
		if(isSuspended()){
			setState(TState.READY);
			return true;
		}
		return false;
	}
	
	
	protected void setState(TState newState) {
		this.previousState=this.currentState;
		this.currentState=newState;
	}

	public TState getCurrentState() {
		return currentState;
	}

	public TState getPreviousState() {
		return previousState;
	}
	
	
	

	
}
