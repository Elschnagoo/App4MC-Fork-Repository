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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy.tracing;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;

public class PrintStreamSchedulerTracer implements ISchedulerEventListener {
	
	private PrintStream out;
	
	private final  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("mm:ss:SSS");
	
	private final String label;
	
	public PrintStreamSchedulerTracer(String label,PrintStream s){
		out=s;
		this.label=label;
	}
	
	public PrintStreamSchedulerTracer(String label) {
		this.label=label;
	}
	
	public void setPtrintStream(PrintStream s){
		this.out=s;
	}
	
	public PrintStream getPrintStream(){
		return out;
	}

	@Override
	public void onTaskAdded(String taskName) {
		write("Added task to StepScheduler: "+taskName);
	}

	@Override
	public void onActivateTask(String task, long time) {
		write(time + " | onActivateTask "+ task );
	}

	@Override
	public void onStartTask(String task, long time) {
		write(time + " | onStartTask "+ task );
	}


	@Override
	public void onTerminateTask(String task, long time) {
		write(time + " | onTerminateTask "+ task );
	}
	
	@Override
	public void onPreemptTask(String task, long time) {
		write(time + " | onPreemptTask "+ task );
	}
	
	@Override
	public void onWaitTask(String task, long time, String muxName, String holder) {
		write(time + " | onWaitTask " + task);
	}

	@Override
	public void onReleaseTask(String task, long time) {
		write(time + " | onReleaseTask " + task);
	}
	
	@Override
	public void onTaskMissedDeadline(String task, long time, long remainingExectime) {
		write(time + " | onTaskMissedDeadline "+task);
	}

	@Override
	public void onStartIdleCore(long time) {
		write(time + " | onStartIdleCore " );
	}

	@Override
	public void onStopIdleCore(long time) {
		write(time + " | onStopIdleCore " );
	}
	
	private void write(String w){
		String x = LocalDateTime.now().format(formatter);
		out.println(x + " "+getCoreName()+" -> " + w);
	}

	@Override
	public String getCoreName() {
		return label;
	}

	


}
