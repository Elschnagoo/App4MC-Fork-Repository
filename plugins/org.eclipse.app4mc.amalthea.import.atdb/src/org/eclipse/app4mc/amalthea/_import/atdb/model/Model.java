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

import java.util.ArrayList;
import java.util.List;

public class Model {
	
	private List<Task> tasks = new ArrayList<Task>();
	private List<Isr> isrs = new ArrayList<Isr>();
	private List<Runnable> runnables = new ArrayList<Runnable>();
	private List<Signal> signals = new ArrayList<Signal>();
	private List<Stimulus> stimuli = new ArrayList<Stimulus>();
			
	public void setTasks(List<Task> tasks) {
		this.tasks.addAll(tasks);
	}
	
	public List<Task> getTasks() {
		return this.tasks;
	}
	
	public void setIsrs(List<Isr> isrs) {
		this.isrs.addAll(isrs);
	}
	
	public List<Isr> getIsrs() {
		return this.isrs;
	}
	
	public void setRunnables(List<Runnable> runnables) {
		this.runnables.addAll(runnables);
	}
	
	public List<Runnable> getRunnables() {
		return this.runnables;
	}
	
	public void setSignals(List<Signal> signals) {
		this.signals.addAll(signals);
	}
	
	public List<Signal> getSignals() {
		return this.signals;
	}
	
	public void setStimuli(List<Stimulus> stimuli) {
		this.stimuli.addAll(stimuli);
	}
	
	public List<Stimulus> getStimuli() {
		return this.stimuli;
	}
}
