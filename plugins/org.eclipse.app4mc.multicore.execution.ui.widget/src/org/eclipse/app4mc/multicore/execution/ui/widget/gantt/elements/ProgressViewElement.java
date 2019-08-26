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

package org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements;

import javafx.scene.control.Tooltip;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.TraceWidget;

public class ProgressViewElement extends AbstractGanttViewElement{
	
	private DurationModelElement model;


	//old Constructor
	public ProgressViewElement(String style,DurationModelElement model) {
		super(style);
		this.model=model;
		try {
			String tip="Time: " + model.getStart() + " to "+ (model.getStart()+model.getDuration()) + "\nInfo: "+model.getLabel();
			Tooltip t = new Tooltip(tip);
			Tooltip.install(this, t);
		}
		catch(Exception re){

		}


	}
	//new Constructor
	public ProgressViewElement(String style, DurationModelElement model, TraceWidget.ArrowTooltip el,boolean sel) {
		super(style);
		this.model=model;

		if (sel&&el!=null){
			Tooltip t = new Tooltip("Time: " + el.getStart() + " to "+ (el.getStart()+el.getTime()) + "\nInfo: "+el.getLabel());
			Tooltip.install(this, t);
		}


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
