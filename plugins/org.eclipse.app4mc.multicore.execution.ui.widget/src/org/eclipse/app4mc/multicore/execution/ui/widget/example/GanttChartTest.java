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

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.ArrowTimeMarkerViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.DurationModelElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.FlashTimeMarkerViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.IntervalViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.ProgressViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.ProgressWithLabelElementView;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.TimeMarkModelElement;

import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;

public class GanttChartTest {

	
	public static Region create(){

		FXGanttWidget chart = new FXGanttWidget(20);
//		String strCore1= "Task 1";
//		chart.addCategorie(strCore1);
		String strTaskX= "Task 1";
		chart.addCategorie(strTaskX);
		String strCoreY= "Task 2";
		chart.addCategorie(strCoreY);
		
//		chart.addEvent(strCore1, 0, new ProgressViewElement("status-red",
//				new DurationModelElement(0,1,"Test")));
//		chart.addEvent(strCore1, 4, new ProgressViewElement("status-green",
//				new DurationModelElement(4,2,"Test")));
//		chart.addEvent(strCore1, 7, new ProgressViewElement("status-red",
//				new DurationModelElement(7,3,"Test")));
//		chart.addEvent(strCore1, 14, new ProgressViewElement("status-green",
//				new DurationModelElement(14,4,"Test")));
		
		chart.addEvent(strTaskX, 0, new ProgressWithLabelElementView(false,"status-green",
				new DurationModelElement(0,5,"Test")));
		chart.addEvent(strTaskX, 10, new ProgressViewElement("status-green",
				new DurationModelElement(10,2,"Test")));
		chart.addEvent(strTaskX, 15, new ProgressViewElement("status-red",
				new DurationModelElement(15,2,"Test")));
		
		chart.addEvent(strCoreY, 0, new ProgressWithLabelElementView(true,"status-red",
				new DurationModelElement(0,2,"Can't\ntouch\nthis")));
		chart.addEvent(strCoreY, 5, new ArrowTimeMarkerViewElement("",
				new TimeMarkModelElement(5, "")));
		chart.addEvent(strCoreY, 10, new IntervalViewElement("interval-rep",
				new DurationModelElement(10,5,"Test")));
		chart.addEvent(strCoreY, 10, new ArrowTimeMarkerViewElement("",
				new TimeMarkModelElement(10, "")));
		chart.addEvent(strCoreY, 4, new FlashTimeMarkerViewElement("",
				new TimeMarkModelElement(4, "deadline")));
		
//		XYChart.Series<Number,String> series1 = new XYChart.Series<>();
//		series1.getData().add(new XYChart.Data<Number, String>(0, strCore1, new GanttDurationModel(1,"Test", "status-red")));
//		series1.getData().add(new XYChart.Data<Number, String>(4, strCore1, new GanttDurationModel(2 ,"Test", "status-green")));
//		series1.getData().add(new XYChart.Data<Number, String>(7, strCore1, new GanttDurationModel(3,"Test", "status-red")));
//		series1.getData().add(new XYChart.Data<Number, String>(20, strCore1, new GanttDurationModel(9,"Test", "status-green")));
//
//		XYChart.Series<Number,String> series2 = new XYChart.Series<>();
//		series2.getData().add(new XYChart.Data<Number, String>(0, strCore2, new GanttDurationModel(10,"Test", "status-green")));
//		series2.getData().add(new XYChart.Data<Number, String>(10, strCore2, new GanttDurationModel(2,"Test", "status-green")));
//		series2.getData().add(new XYChart.Data<Number, String>(15, strCore2, new GanttDurationModel(2,"Test", "status-red")));
//
//		XYChart.Series<Number,String> series3 = new XYChart.Series<>();
//		series3.getData().add(new XYChart.Data<Number, String>(0, strCore3, new GanttDurationModel(10,"Test", "status-green")));
//		
//		chart.getData().addAll(series1, series2, series3);
		
		StackPane x = new StackPane();
        x.getChildren().add(chart);
       	return x;
	}
	

}

