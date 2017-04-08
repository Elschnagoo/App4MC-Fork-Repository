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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;

public interface ISystemProxy {
	
	public static int TIME_SCALE_PS=1;
	public static int TIME_SCALE_NS=1000;
	public static int TIME_SCALE_US=1000*1000;
	public static int TIME_SCALE_MS=1000*1000*1000;
	
	public void compute(long time) throws SimException;
	
	public void addTask(String core, String name, long wcet, long period);
	
	public void addCoreScheduler(String corename);
	
	public void addListener(String coreName, ISchedulerEventListener l);
	
	public void addTaskPrecedence(String preCore,String preTask,String postCore,String postTask) throws SimException;
	
	public void addTaskPrecedence(String preCore, String preTask, long releaseTime, String postCore, String postTask) throws SimException;
	
	public void interruptComputation();
}
