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

package org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget;

import org.eclipse.app4mc.multicore.execution.model.XUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.DurationModelElement;

public interface ITraceWidget {
	public void addCore(String core);
	public void addTask(String core, String task);
	
	/*Events*/
	public void addTaskDeadlineMissed(String core, String task, long time);
	public void addTaskActivation(String core, String task, long time);
	public void addTaskEffect(TraceWidget.Core core, String task1, XUtil.ResultObj list, int offsetX, long time, DurationModelElement element);
	public void addTaskEffectFollow(String core, String task1, long start,long end, long time);

	/*States*/
	public void addTaskRunning(String core, String task, long start, long stop);
	public void addTaskSuspended(String core, String task, long start, long stop);
	public void addTaskReady(String core, String task, long start, long stop);
	public void addTaskWaiting(String core, String task, String note,long start, long stop);


	public void reset();
}
