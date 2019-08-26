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
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;

public class FollowingDataFlowArrowViewElement extends AbstractGanttViewElement{

	private final TimeMarkModelElement model;
	private final static int HEIGT_ADDITION = 3;

	private Path arrow;

	private double height;
	private  long index1,index2;

	public FollowingDataFlowArrowViewElement(String style, long index1, long index2, TimeMarkModelElement model) {
		super(style);
		this.model=model;

		this.index1=index1;
		this.index2=index2;
		Tooltip t = new Tooltip(model.getTime()+" " + model.getLabel());
		Tooltip.install(arrow, t);

	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		double compheight= chart.getBlockHeight()+HEIGT_ADDITION;
		if(arrow!=null){
			//remove if chart has new blockheight
			//new one will be created below
			getChildren().remove(arrow);
			arrow=null;
		}

		if(arrow==null)
		{
			double offset;

			height = compheight;
			//System.out.println("h "+height);
			//arrow = createPath(height);

			offset=(index2-index1);


			//System.out.println("from "+ index1 +" to "+index2 +" eq: "+ offset );

			arrow = new Arrow(index1*chart.getNumberAxis().getScale(),10,index2*chart.getNumberAxis().getScale(),10, Color.GREEN,5);

			getChildren().add(arrow);
			setWidth( (index2-index1) * chart.getNumberAxis().getScale());
			setHeight(chart.getBlockHeight());
			
		}
	}
	private int abs(int val)
		{
			if (val>0)
				{
					return val;
				}
			else if(val<0)
				{

					return val*-1;
				}
			else
				{
					System.out.println("ABS ERROR");
					return 1;
				}
		}


}
