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

import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Line;
import org.eclipse.app4mc.multicore.execution.ui.widget.comunication.ComUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.TraceWidget;

public class DataFlowArrowViewElement extends ArrowElement{

	private final static int HEIGT_ADDITION = 3;

	private CubicCurve cubic;
	private Line p1,p2;

	private double height;
	private  long index1,index2,cals;
	private  String tooltipTxt="";
	public DataFlowArrowViewElement(String style, long index1, long index2, long cals, TraceWidget.ArrowTooltip model) {

		super(style,new DurationModelElement(index1,1,model.getTask2() +" to "+model.getTask1()+" \n" + model.getLabel()),model ,false);

		Color main=Color.BLACK;
		Double strokeSize=2.0;
		this.index1=index1;
		this.index2=index2;
		this.cals=cals;
		this.setPickOnBounds(false);
		cubic = new CubicCurve();
		cubic.setStroke(main);
		cubic.setStrokeWidth(2.0);
		cubic.setFill(null);
		cubic.setStyle(": ");

		tooltipTxt="Time: " + model.getStart() + " to "+ (model.getStart()+model.getTime()) + "\nInfo: "
				+ model.getTask2() +" to "+model.getTask1()
					+ "\n" +
				"[Left Click] - Get more information"
				+ "\n" +
				"[Right Click] - Move selected item to front"
		;
		Tooltip t = new Tooltip(tooltipTxt) ;


		p1 = new Line();
		//p1.setStrokeWidth(2.0);
		p1.setStroke(main);

		p2 = new Line();
		p2.setStrokeWidth(2.0);
		p2.setStroke(main);


		getChildren().addAll(cubic);
		getChildren().addAll(p1);
		getChildren().addAll(p2);
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {

				switch (event.getButton()){

					case SECONDARY:
						DataFlowArrowViewElement.this.toFront();
						break;
					case PRIMARY:
						ComUtil.PopUpTable("Data Propagation",
								model.getTask2() + " to " + model.getTask1(),
								"Time: " + model.getStart() + " to " + (model.getStart() + model.getTime()),
								model.getLabel());
						break;

				}

			}
		};

		getChildren().forEach(node -> {

			Tooltip.install(node, t);
			node.setCursor(Cursor.HAND);
			node.setOnMouseClicked(handler);


			node.addEventHandler(MouseEvent.MOUSE_ENTERED,
					new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent e) {
							cubic.setStroke(Color.RED);
							p1.setStroke(Color.RED);
							p2.setStroke(Color.RED);

						}
					});

			node.addEventHandler(MouseEvent.MOUSE_EXITED,
					new EventHandler<MouseEvent>() {
						@Override
						public void handle(MouseEvent e) {
							cubic.setStroke(main);
							p1.setStroke(main);
							p2.setStroke(main);
						//

						}
					});
		});



	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		super.updateElement(chart);
		double compheight= chart.getBlockHeight()+HEIGT_ADDITION;
		setHeight(getHeight());
		double offset;
		height = compheight;
		//arrow = createPath(height);

		offset=(index2-index1)*(height+Math.abs(index2-index1));


		if ( offset>=0 ){ offset+=height/2; }

		//System.out.println("from "+ index1 +" to "+index2 +" eq: "+ offset );
		double crycyOffset =-cals*chart.getNumberAxis().getScale()*1.0;




		cubic.setStartX(crycyOffset);
		cubic.setStartY(offset);

		cubic.setControlX1(0);
		cubic.setControlY1(offset);

		cubic.setControlX2(crycyOffset);
		cubic.setControlY2(height/2);

		cubic.setEndX(0);
		cubic.setEndY(height/2);




		double angle;

		 angle = Math.atan2((height/2 - 0), (0 - crycyOffset)) - Math.PI / 2.0;

		double sin = Math.sin(angle);
		double cos = Math.cos(angle);
		//point1
		double x1 = (- 1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * 8 + 0;
		double y1 = (- 1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * 8 + height/2;
		//point2
		double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * 8 + 0;
		double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * 8 + height/2;


		p1.setStartX(x1);
		p1.setStartY(y1);
		p1.setEndX(0);
		p1.setEndY(height/2);

		p2.setStartX(x2);
		p2.setStartY(y2);
		p2.setEndX(0);
		p2.setEndY(height/2);




	}


}
