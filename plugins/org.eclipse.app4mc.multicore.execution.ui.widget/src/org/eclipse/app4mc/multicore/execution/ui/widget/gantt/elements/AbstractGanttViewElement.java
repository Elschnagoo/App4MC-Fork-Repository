/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

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
