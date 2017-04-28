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

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;

public class LineChartTest {
	LineChart<Number,Number> chart;
	
	@SuppressWarnings("all")
	public Region create(){
		GridPane  p = new GridPane();
		// Setting columns size in percent
	    ColumnConstraints column = new ColumnConstraints();
	    column.setPercentWidth(20);
	    p.getColumnConstraints().add(column);

	    column = new ColumnConstraints();
	    column.setPercentWidth(70);
	    p.getColumnConstraints().add(column);
		
		p.setStyle("-fx-border-color: blue;");
		p.setGridLinesVisible(true);
		Button b = new Button("+");
		b.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("+1");
//				chart.moveViewPort(1);
				System.out.println("Chart");
				System.out.println("H: " + chart.getHeight());
				System.out.println("MaxH: " + chart.getMaxHeight());
				System.out.println("MinH: " + chart.getMinHeight());
				System.out.println("PrefH: " + chart.getPrefHeight());
				System.out.println("Axis");
				System.out.println("MinH: " + chart.getYAxis().getMinHeight());
			}
		});
		p.add(b,1,0);
		
		Button a = new Button("-");
		a.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				System.out.println("-");
//				chart.moveViewPort(-1);
			}
			
		});
		p.add(a,0,0);
		
		final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        chart = new LineChart<Number,Number>(xAxis,yAxis);
                
        chart.setTitle("Stock Monitoring, 2010");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        series.getData().add(new XYChart.Data(1, 23));
        series.getData().add(new XYChart.Data(2, 14));
        series.getData().add(new XYChart.Data(3, 15));
        series.getData().add(new XYChart.Data(4, 24));
        series.getData().add(new XYChart.Data(5, 34));
        series.getData().add(new XYChart.Data(6, 1));
        series.getData().add(new XYChart.Data(7, 22));
        series.getData().add(new XYChart.Data(8, 100));
        series.getData().add(new XYChart.Data(9, 43));
        series.getData().add(new XYChart.Data(10, 17));
        series.getData().add(new XYChart.Data(11, 29));
        series.getData().add(new XYChart.Data(12, 25));
        chart.getData().add(series);
        
        p.add(chart,0,1,2,1);
        
        return p;
	}
}
