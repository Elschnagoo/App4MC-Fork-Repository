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

import javafx.scene.control.Tooltip;

public class ProgressViewElement extends AbstractGanttViewElement{
	
	private DurationModelElement model;
	
	public ProgressViewElement(String style,DurationModelElement model) {
		super(style);
		this.model=model;
		Tooltip t = new Tooltip("Time: " + model.getStart() + " to "+ (model.getStart()+model.getDuration()) + "\nInfo: "+model.getLabel());
		Tooltip.install(this, t);
	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		setWidth(model.getDuration() * chart.getNumberAxis().getScale());
		setHeight(chart.getBlockHeight());
	}
	
	public DurationModelElement getModel(){
		return model;
	}

	
}
