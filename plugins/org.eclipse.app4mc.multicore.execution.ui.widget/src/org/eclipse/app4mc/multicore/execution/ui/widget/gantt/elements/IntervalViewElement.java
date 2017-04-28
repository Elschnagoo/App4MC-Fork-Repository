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
package org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements;

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;

import javafx.scene.shape.Line;

/**
 * Gantt view element representing an interval by drawing a line for the 
 * duration provided by the <code>DurationEventModel</code>. The line 
 * is placed above the section of interest.
 */
public class IntervalViewElement extends ProgressViewElement{
	
	private Line line;

	public IntervalViewElement(String style,DurationModelElement model) {
		super(style,model);
		line = new Line();
		line.setStrokeWidth(2.0);
		getChildren().addAll(line);
	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		super.updateElement(chart);
		
		double offs = 2*line.getStrokeWidth();
		
		setTranslateY(-offs);
		setHeight(getHeight()+offs);
		
		line.setStartX(0);
		line.setStartY(0);
		line.setEndX(getWidth());
		line.setEndY(0);
		
	}

}
