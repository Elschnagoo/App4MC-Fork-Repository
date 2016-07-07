/*******************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.app4mc.amalthea._import.atdb.model;

import java.util.HashSet;
import java.util.Set;

public class Task extends ANameable {
	
	Set<String> stimuli = new HashSet<String>();
	Set<String> runnables = new HashSet<String>();
	
	public Task(String name) {
		this.name = name;
	}
	
	public void process(long timeStamp, long instance, String action) {
		
	}
	
	public void addStimulus(String name) {
		this.stimuli.add(name);
	}
	
	public Set<String> getStimuli() {
		return this.stimuli;
	}
	
	public void addRunnableCall(String runnable) {
		this.runnables.add(runnable);
	}
	
	public Set<String> getRunnableCalls() {
		return this.runnables;
	}
}
