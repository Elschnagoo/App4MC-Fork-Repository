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
package org.eclipse.app4mc.multicore.execution.logic.btf.model;

public class BtfEvent {
	
	private long lineNum;
	private long time;
	private String source;
	private int sourceInstance;
	private BtfEntityType targetType;
	private String target;
	private int targetInstance;
	private String event;
	private String note;
	
	public BtfEvent(){
	}


	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public int getSourceInstance() {
		return sourceInstance;
	}

	public void setSourceInstance(int sourceInstance) {
		this.sourceInstance = sourceInstance;
	}

	public BtfEntityType getTargetType() {
		return targetType;
	}

	public void setTargetType(BtfEntityType targetType) {
		this.targetType = targetType;
	}

	public int getTargetInstance() {
		return targetInstance;
	}

	public void setTargetInstance(int targetInstance) {
		this.targetInstance = targetInstance;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public long getLineNum() {
		return lineNum;
	}

	public void setLineNum(long lineNum) {
		this.lineNum = lineNum;
	}


	public String getTarget() {
		return target;
	}


	public void setTarget(String target) {
		this.target = target;
	}
	
	
	
	

}
