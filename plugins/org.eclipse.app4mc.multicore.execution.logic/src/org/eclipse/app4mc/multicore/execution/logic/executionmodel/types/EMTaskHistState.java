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
package org.eclipse.app4mc.multicore.execution.logic.executionmodel.types;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.ExecutionModelException;

public class EMTaskHistState {
	/*Constants*/
	public static final long UNKNOWN_PAST = Long.MIN_VALUE;
	public static final long UNKNOWN_FUTURE =Long.MAX_VALUE;
	
	private static final String UNKNOWN_STRING="unknown";

	private EMCore core;
	/**Time at event occurrence*/
	private long start  = UNKNOWN_PAST;
	/**Time the */
	private long end = UNKNOWN_FUTURE;
	/**The state the task remains between start and stop*/
	private EMTaskState state;
	/**Additional information*/
	private String note=UNKNOWN_STRING;
	/**The entity the event fired*/
	private String eventSource=UNKNOWN_STRING;
	/**The event type*/
	private EMTaskEvent event;
	/**Cause of the event. E.g. wait event caused by mutex "mux_xy"*/
	private String eventCause=UNKNOWN_STRING;
	
	public static class EMTaskHistStateFactory{
		public static EMTaskHistState create(EMTaskState state,EMCore core) throws ExecutionModelException {
			if((state == EMTaskState.RUNNING )&& core ==null){
				throw new ExecutionModelException("");
			}
			EMTaskHistState entry = new EMTaskHistState();
			entry.setCore(core);
			entry.setState(state);
			return entry;
		}
		public static EMTaskHistState create(EMTaskState state) throws ExecutionModelException{
			return create(state,null);
		}
	}
	
	private EMTaskHistState(){
	}
	
	public EMCore getCore() {
		return core;
	}
	private void setCore(EMCore core) {
		this.core = core;
	}
	public long getStart() {
		return start;
	}
	public void setStart(long start) {
		this.start = start;
	}
	public long getEnd() {
		return end;
	}
	public void setEnd(long end) {
		this.end = end;
	}
	public EMTaskState getState() {
		return state;
	}
	private void setState(EMTaskState state) {
		this.state = state;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getEventSource() {
		return eventSource;
	}
	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
	}
	public void setEventCause(String eventCause){
		this.eventCause=eventCause;
	}
	public String getEventCause(){
		return eventCause;
	}
	public EMTaskEvent getEvent() {
		return event;
	}
	public void setEvent(EMTaskEvent event) {
		this.event = event;
	}
	
	public boolean isCompleted(){
		return start!=UNKNOWN_PAST && end!=UNKNOWN_FUTURE;
	}
	
	
}
