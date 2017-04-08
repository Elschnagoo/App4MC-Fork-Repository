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
package org.eclipse.app4mc.multicore.execution.ui.traceview.view;

import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.EMTraceWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget.IEMTraceWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.ITraceWidget;

import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;

public class FXViewPartTraceView extends FXViewPart implements ITraceWidgetProvider, IEMTraceWidgetProvider{
	
	private EMTraceWidget tw;
	@Override
	protected Scene createFxScene() {
		tw= new EMTraceWidget();
//		tw.getStylesheets().add(getClass().getResource("/icons/ganttchart.css").toExternalForm());
//		tw = TraceViewTest.createTraceViewWithSampleData();
		
		ScrollPane pane = new ScrollPane();
		pane.setContent(tw);
		pane.setFitToWidth(true);
		return new Scene(pane);
	}

//	private void disableMouseScroll(ScrollPane pane) {
//		Rectangle clipRectangle = new Rectangle(); 
//		clipRectangle.widthProperty().bind(pane.widthProperty()); 
//		clipRectangle.heightProperty().bind(pane.heightProperty()); 
//		pane.setClip(clipRectangle);
//	}

	@Override
	protected void setFxFocus() {
	}
	
	public ITraceWidget getTraceWidget(){
		return tw;
	}
	
	public IEMTraceWidget getEMTraceWidget(){
		return tw;
	}
	
	

}
