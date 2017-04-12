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
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class ArrowTimeMarkerViewElement extends AbstractGanttViewElement{
	
	private final TimeMarkModelElement model;
	private final static int ARROW_HEAD_LEG_OFF=3;
	
	private final static int HEIGT_ADDITION = 3;
	
	private Path arrow;
	
	private double height;
	

	public ArrowTimeMarkerViewElement(String style,TimeMarkModelElement model) {
		super(style);
		this.model=model;
	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		double compheight= chart.getBlockHeight()+HEIGT_ADDITION;
		if(height!=compheight && arrow!=null){
			//remove if chart has new blockheight
			//new one will be created below
			getChildren().remove(arrow);
			arrow=null;
		}

		if(arrow==null){
			height = compheight;
			arrow = createPath(height);
			Tooltip t = new Tooltip(model.getTime()+" " + model.getLabel());
			Tooltip.install(arrow, t);
			getChildren().add(arrow);
			
		}
	}
	
	
	protected Path createPath(double height){
		Path path = new Path();

		MoveTo moveTo = new MoveTo();
		moveTo.setX(0);
		moveTo.setY(0);

		LineTo verticalLine = new LineTo();
		verticalLine.setX(0);
		verticalLine.setY(height);
		
		LineTo arwHead1 = new LineTo();
		arwHead1.setX(ARROW_HEAD_LEG_OFF);
		arwHead1.setY(height-ARROW_HEAD_LEG_OFF);
		
		MoveTo backToPeak = new MoveTo();
		backToPeak.setX(0);
		backToPeak.setY(height);
		
		LineTo arwHead2 = new LineTo();
		arwHead2.setX(-ARROW_HEAD_LEG_OFF);
		arwHead2.setY(height-ARROW_HEAD_LEG_OFF);

		path.getElements().add(moveTo);
		path.getElements().add(verticalLine);
		path.getElements().add(arwHead1);
		path.getElements().add(backToPeak);
		path.getElements().add(arwHead2);
		path.setStrokeWidth(2);
		return path;
	}

}
