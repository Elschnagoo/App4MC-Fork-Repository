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
package org.eclipse.app4mc.multicore.execution.ui.widget.example;

import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.TraceWidget;


public class TraceViewTest {
	public static TraceWidget createTraceViewWithSampleData(){
		TraceWidget t = new TraceWidget();
		t.addCore("Core1");
		t.addTask("Core1", "T1");
		t.addTask("Core1", "T2");
		t.addCore("Core2");
		t.addTask("Core2", "T4");
		t.addTaskRunning("Core1", "T1", 10, 13);
		t.addTaskRunning("Core1", "T1", 18, 22);
		t.addTaskRunning("Core1", "T2", 14, 18);
		t.addTaskRunning("Core2", "T4", 13, 14);
		return t;
	}
}
