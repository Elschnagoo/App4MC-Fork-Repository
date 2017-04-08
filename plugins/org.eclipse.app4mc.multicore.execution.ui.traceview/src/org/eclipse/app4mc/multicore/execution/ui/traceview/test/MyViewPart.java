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
package org.eclipse.app4mc.multicore.execution.ui.traceview.test;

import org.eclipse.app4mc.multicore.execution.ui.traceview.view.FXViewPart;
import org.eclipse.app4mc.multicore.execution.ui.widget.example.GanttChartTest;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Region;

public class MyViewPart extends FXViewPart {
	@Override
	protected Scene createFxScene() {
//		TraceViewTest t=new TraceViewTest();
		
		GanttChartTest t = new GanttChartTest();

		ScrollPane pane= new ScrollPane();
		Region r = t.create();
		r.getStylesheets().add(getClass().getResource("/icons/ganttchart.css").toExternalForm());
		
		pane.setContent(r);
		pane.setFitToWidth(true);
		return new Scene(pane);
	}


	@Override
	protected void setFxFocus() {
		// TODO Auto-generated method stub
		
	}
}