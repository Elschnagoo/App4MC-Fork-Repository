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
package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerEventListener;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerTask;

public interface ISchedulerBase {
	public void init();
	public long getSimTime();
	public void addSchedulerEventListener(ISchedulerEventListener l);
	public void addTask(String name, long wcet,long period);
	public ISchedulerTask getTask(String name);

}
