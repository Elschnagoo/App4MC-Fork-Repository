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

package org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.AbstractGanttViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.ArrowTimeMarkerViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.DurationModelElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.FlashTimeMarkerViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.ProgressViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.TimeMarkModelElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.misc.FXUtil;
import javafx.animation.AnimationTimer;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.util.converter.NumberStringConverter;

public class TraceWidget extends GridPane implements ITraceWidget{


	static class Core {
		FXGanttWidget chart;
		VBox nav;
		Set<String> tasks;
	}

	private Map<String, Core> cores;

	private CheckBox cbScrollAllCharts;
	
	private Queue<QueueData> queue = new ConcurrentLinkedQueue<QueueData>();

	private int row = 0;
	
	private String axisLabel="";

	public TraceWidget() {
		cores = new HashMap<>();
		setupPane();
		initDataPopulation();
	}
	


	private void setupPane() {
		ColumnConstraints column = new ColumnConstraints();
		column.setPercentWidth(10);
		getColumnConstraints().add(column);

		column = new ColumnConstraints();
		column.setPercentWidth(90);
		getColumnConstraints().add(column);
		setVgap(10);
//		setGridLinesVisible(true);
		
		cbScrollAllCharts = new CheckBox("Scroll all charts");
		add(cbScrollAllCharts,0,row++);
		GridPane.setColumnSpan(cbScrollAllCharts, 2);
		
//		cbScrollAllCharts.setStyle("-fx-border-color: yellow");
		
		cbScrollAllCharts.selectedProperty().addListener(new ChangeListener<Boolean>() {
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				if(newValue){
					for(Core c: cores.values()){
						for(Core c2: cores.values()){
							if(c!=c2){
								c.chart.getNumberAxis().lowerBoundProperty().bindBidirectional(c2.chart.getNumberAxis().lowerBoundProperty());
								c.chart.getNumberAxis().upperBoundProperty().bindBidirectional(c2.chart.getNumberAxis().upperBoundProperty());
							}
						}
					}
				}else{
					for(Core c: cores.values()){
						for(Core c2: cores.values()){
							if(c!=c2){
								c.chart.getNumberAxis().lowerBoundProperty().unbindBidirectional(c2.chart.getNumberAxis().lowerBoundProperty());
								c.chart.getNumberAxis().upperBoundProperty().unbindBidirectional(c2.chart.getNumberAxis().upperBoundProperty());
							}
						}
					}
				}
			}
		});
	}
	
	

	/**
	 * Add a task to the specified core. Note the core have to be added first.
	 * @param core
	 * @param task
	 */
	public void addTask(String core, String task) {
		
		
		final Core c = cores.get(core);
		if(c==null){
			//TODO throw exception
			return;
		}
//		synchronized (c) {
			
			if(c.tasks.contains(task)){
				//allready present
				return;
			}

			
			try {
				FXUtil.runLaterWait(new java.lang.Runnable() {
					
					@Override
					public void run() {
						c.chart.addCategorie(task);
						c.tasks.add(task);
					}
				});
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			
//		}
		
		
		
	}
	
	

	public void addTaskRunning(String core, String task, long start, long stop) {
//		Task t = cores.get(core).tasks.get(task);
//		System.out.println("Task get data: " + t.name);
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		
		addToFXQueue(c.chart, task, start,new ProgressViewElement("status-light-green",new DurationModelElement(start,stop-start,"running")));
//		c.chart.addEvent(task, start,new ProgressViewElement(new DurationModelElement(stop-start,"", "status-light-green")));
		
		//add the overall utilization (all task on core)
//		c.chart.addEvent("Core", start, new ProgressViewElement(new DurationModelElement(stop-start,"","status-green")));
		addToFXQueue(c.chart, "Core", start, new ProgressViewElement("status-green",new DurationModelElement(start,stop-start,"")));
	}
	
	/**
	 * Add task waiting visualization. If core or task is unknown this call will be discarded.
	 * @param core
	 * @param task
	 * @param start
	 * @param stop
	 */
	@Override
	public void addTaskWaiting(String core, String task, String note,long start, long stop){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c.chart, task, start,new ProgressViewElement("status-orange",new DurationModelElement(start,stop-start,"waiting\n"+note)));
	}
	
	@Override
	public void addTaskActivation(String core, String task, long time){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c.chart, task, time,new ArrowTimeMarkerViewElement("activate",new TimeMarkModelElement(time, "")));
	}
	
	@Override
	public void addTaskReady(String core, String task, long start, long stop){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c.chart, task, start,new ProgressViewElement("status-yellow",new DurationModelElement(start,stop-start,"ready")));
	}
	
	@Override
	public void addTaskSuspended(String core, String task, long start, long stop){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c.chart, task, start,new ProgressViewElement("status-red",new DurationModelElement(start,stop-start,"suspended")));
	}
	
	@Override
	public void addTaskDeadlineMissed(String core, String task, long time) {
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		System.err.println("addTaskDeadlineMissed");
		Core c = cores.get(core);
		addToFXQueue(c.chart, task, time,new FlashTimeMarkerViewElement("",new TimeMarkModelElement(time,"deadline missed")));
	}

//	@Override
//	public void addRunnable(String core, String task, String runnable) {
//		//TODO implement addRunnable
//	}
//	
//	@Override	
//	public void addRunnableRunning(String core, String task, String runnable,long start, long stop){
//		//TODO implement addRunnableComp.
//	}
	
	public void setAxisLabels(String label){
		this.axisLabel=label;
		for(Core c:cores.values()){
			c.chart.getNumberAxis().setLabel(label);
		}
	}

	public void addCore(String core) {
		
		final Core c = new Core();
		c.chart = new FXGanttWidget(30);
		c.chart.getStylesheets().add(getClass().getResource("/icons/ganttchart.css").toExternalForm());
		c.chart.getNumberAxis().setLabel(axisLabel);
		c.tasks = new HashSet<String>();
		cores.put(core, c);
		c.chart.addCategorie("Core");
		
		c.nav = new VBox();
		//Add diagram and core image to the view pane
		StackPane sp = createIcon(core,getClass().getResource("/icons/coreIcon.png").toExternalForm());
		c.nav.getChildren().add(sp);
		Region nav= createNav(c.chart.getNumberAxis().lowerBoundProperty(), 
				c.chart.getNumberAxis().upperBoundProperty());
		c.nav.getChildren().add(nav);
		VBox.setMargin(c.nav, new Insets(10));
//		p.setStyle("-fx-border-color: red");
//		c.chart.setStyle("-fx-border-color: black");
		
		
		try {
			FXUtil.runLaterWait(new java.lang.Runnable() {
				@Override
				public void run() {
					add(c.nav, 0, row); //navigation
					add(c.chart, 1, row); // chart
					row++;
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}
	
	private static Region createNav(DoubleProperty lower,	DoubleProperty upper) {
		VBox navPane = new VBox();
		
		Text labLb= new Text("Lower Bound");
		navPane.getChildren().add(labLb);
		TextField txtLowerBond = new TextField();
		navPane.getChildren().add(txtLowerBond);
		txtLowerBond.textProperty().bindBidirectional(lower,new NumberStringConverter());
		
		Text labUb= new Text("Upper Bound");
		navPane.getChildren().add(labUb);
		TextField txtUpperBond = new TextField();
		navPane.getChildren().add(txtUpperBond);
		txtUpperBond.textProperty().bindBidirectional(upper,new NumberStringConverter());
		
//		navPane.getChildren().add(btnZoomOut);
//		navPane.getChildren().add(btnZoom);
		
		return navPane;
	}
	
	private static StackPane createIcon(String txt,String url){
		StackPane sp = new StackPane();
		ImageView ic = new ImageView(url);
		ic.setPreserveRatio(true);
		ic.setFitHeight(100);
		sp.getChildren().add(ic);
		sp.getChildren().add(new Text(txt));
		return sp;
	}

//	private void chartsMoveViewPorts(int ports) {
//		for (Core c : cores.values()) {
//			c.chart.moveViewPort(ports);
//		}
//	}
	
	/**
	 * Remove present cores and data from view.
	 */
	public void reset(){
		try {
			FXUtil.runLaterWait(new java.lang.Runnable() {
				@Override
				public void run() {
					cores.values().forEach(x->{
						getChildren().remove(x.chart);
						getChildren().remove(x.nav);
					});
					cores.clear();
					row=getChildren().size();
				}
			});
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
	}

	
	static class QueueData{
		final String categorie;
		final long start;
		final AbstractGanttViewElement v;
		final FXGanttWidget chart;
		public QueueData(FXGanttWidget chart,String categorie,long start, AbstractGanttViewElement v) {
			this.chart=chart;
			this.categorie=categorie;
			this.start=start;
			this.v=v;
		}
	}

	
	
	private void addToFXQueue(FXGanttWidget chart,String categorie,long start, AbstractGanttViewElement v){
		QueueData d = new QueueData(chart,categorie, start, v);
		queue.add(d);
	}
	
//	public void refresh(){
//		for(Core c:cores.values()){
//			if(c.chart.getCatAxi().isAutoRanging()){
//				System.err.println("Autoranging");
//			}
//		}
//	}
	
	private void initDataPopulation(){
		new AnimationTimer() {
            @Override
            public void handle(long now) {
            	//called every frame render on fx thread
                QueueData d = queue.poll();
                if(d!=null){
                	d.chart.addEvent(d.categorie, d.start, d.v);
                }else{
                }
            }
        }.start();
	}

}
