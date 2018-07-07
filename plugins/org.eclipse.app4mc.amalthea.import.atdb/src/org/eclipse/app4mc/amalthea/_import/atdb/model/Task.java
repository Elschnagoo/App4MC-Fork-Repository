/**
 ********************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

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
