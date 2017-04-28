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

import javafx.scene.layout.Region;

public abstract class AbstractGanttViewElement extends Region{
	
	private String style;
	
	public AbstractGanttViewElement(String style) {
		this.style=style;
		getStyleClass().add(style);
	}

	public final void update(FXGanttWidget chart,double x, double y){
//		setStyle("-fx-border-color: red;");
		updateElement(chart);
		relocate(x, y);
	}
	
	protected abstract void updateElement(FXGanttWidget chart);
	
	protected String getGanttStyle(){
		return style;
	}
	
}
