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

package org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget;

import javafx.animation.AnimationTimer;
import javafx.beans.property.DoubleProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Cursor;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.util.converter.NumberStringConverter;
import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.model.XContainer;
import org.eclipse.app4mc.multicore.execution.model.XUtil;
import org.eclipse.app4mc.multicore.execution.model.elements.XEventChain;
import org.eclipse.app4mc.multicore.execution.model.elements.XEventElement;
import org.eclipse.app4mc.multicore.execution.model.elements.XScheduler;
import org.eclipse.app4mc.multicore.execution.ui.widget.comunication.ComUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.*;
import org.eclipse.app4mc.multicore.execution.ui.widget.misc.FXUtil;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;


public class TraceWidget extends GridPane implements ITraceWidget{

	XContainer xContainer;

	static class Core {
		String name;
		FXGanttWidget chart;
		VBox nav;
		Set<String> tasks;
	}
	private Map<String, ListView>  listView;
	private Button globalButton,chainButton;
	String listViewItem;
	HashMap<String,Stack<Promise>> promissList=new HashMap();

	private ExecutionModel em;

	private Map<String, Core> cores;

	private CheckBox cbScrollAllCharts;
	
	private Queue<QueueData> queue = new ConcurrentLinkedQueue<QueueData>();

	private int row = 0;
	
	private String axisLabel="";



	public TraceWidget() {
		cores = new HashMap<>();
		listView=new HashMap<>();

		setupPane();
		initDataPopulation();

	}
	

	public void setExMod(ExecutionModel em)
	{
			this.em=em;
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
		Button manual=new Button();
		manual.setOnMouseClicked(event -> {
			ComUtil.openManual();
		});
		manual.setText("\uD83D\uDEC8");
		manual.setPrefHeight(manual.getHeight()*0.8);
		manual.setPadding(new Insets(5));
		Tooltip t=new Tooltip("Show Documentation");
		Tooltip.install(manual,t);
		globalButton=new Button();
		globalButton.setPadding(new Insets(5));
		globalButton.setText("\uD83C\uDF10");//globe
		globalButton.setPrefHeight(globalButton.getHeight()*0.8);
		globalButton.setDisable(true);
		globalButton.setVisible(false);
		globalButton.setOnMouseClicked(event -> {
			ComUtil.showGlobalChains(xContainer);
		});

		chainButton=new Button();
		chainButton.setPadding(new Insets(5));
		chainButton.setText("\u26D3");//chain
		chainButton.setPrefHeight(globalButton.getHeight()*0.8);
		chainButton.setDisable(true);
		chainButton.setVisible(false);
		chainButton.setOnMouseClicked(event -> {
			ComUtil.showAllChains(xContainer);
		});
		;
		cbScrollAllCharts = new CheckBox("Scroll all charts");
		cbScrollAllCharts.setVisible(false);

		add(cbScrollAllCharts,1,row);
		add(new HBox(manual,chainButton,globalButton),0,row);
		row++;;

		GridPane.setColumnSpan(cbScrollAllCharts, 1);
		
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
	if (	core.compareTo("Core")!=0){
		xContainer.getChainByCore(core).addSort(task);
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

		XScheduler tmp;

		tmp=XUtil.getSchedulerByCore(xContainer,core);
		DurationModelElement tmElemnet = new DurationModelElement(start, stop - start, "running");

		if (XUtil.hasDepended(task,tmp))
			{
				XUtil.ResultObj tmpEff = XUtil.isAffected(xContainer.getChainByCore(core), task);


				addTaskEffect(c,task, tmpEff,0,start,tmElemnet);


			}
		else if (xContainer.isMergingArrow())

			{
				addTaskEffect(c,task, null,0,start,tmElemnet);


			}
		else {
			addToFXQueue(c, task, start,new ProgressViewElement("status-light-green",new DurationModelElement(start,stop-start,"running")));
		}

//		c.chart.addEvent(task, start,new ProgressViewElement(new DurationModelElement(stop-start,"", "status-light-green")));
		
		//add the overall utilization (all task on core)
//		c.chart.addEvent("Core", start, new ProgressViewElement(new DurationModelElement(stop-start,"","status-green")));
		solveAllPromise("run",task);
		addToFXQueue(c, "Core", start, new ProgressViewElement("status-green",new DurationModelElement(start,stop-start,"")));
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
		addToFXQueue(c, task, start,new ProgressViewElement("status-orange",new DurationModelElement(start,stop-start,"waiting\n"+note)));
	}
	
	@Override
	public void addTaskActivation(String core, String task, long time){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c, task, time,new ArrowTimeMarkerViewElement("activate",new TimeMarkModelElement(time, "")));
	}

	@Override
	public void addTaskEffect(Core core, String task1, XUtil.ResultObj list, int offsetX, long time,DurationModelElement element)
	{
		XEventChain ec=xContainer.getChainByCore(core.name);


		MultysamplingViewElement outPutBox = new MultysamplingViewElement(xContainer.getTasks().get(task1),"status-light-green",
																				element,
																				xContainer.isMergingArrow(),
																				core.name,
																				ec);

		if(!cores.containsKey(core.name)){
			return;
		}else if(!cores.get(core.name).tasks.contains(task1)){
			return;
		}

		Core c = cores.get(core.name);
		//System.out.println("t1 " +ec.getIndexOf(task1) +" t2: " +ec.getIndexOf(task2));
		// new ProgressViewElement("status-orange",);
		String affected=outPutBox.getAffected();
		while (list!=null&&!list.isEmpty()){

			XUtil.XEntry curer = list.pop();

			if (curer.getState()==1){
				affected+=curer.getEl().getName()+"[ true ]\n";

				addDependecyArrow(c,task1,curer,time,ec,outPutBox,false);

			}
			else if (curer.getState()==-1){
				affected+=curer.getEl().getName()+"[ Promise ]\n";

				addPromise(new ArrowPromise(  c,  task1,  list,  offsetX,  time, element,curer,ec,outPutBox));
			}
		}


		//isUnderSampling=xContainer.getTasks().get(task1).getLinked().size()!=list.size();
	//	System.out.println(xContainer.getTasks().get(task1).getLinked().size() +" "+list.size());
		element.setLabel(affected);


		if(ec.getFullList(task1).size()>1){
			Iterator<XEventElement> it=ec.getFullList(task1).descendingIterator();
			if (it.next().getStatus()==2){
				 XEventElement ttmp= it.next();
				 if (ttmp.getStatus()==1){

				    outPutBox.mergeMe((MultysamplingViewElement) ttmp.getAbstractGanttViewElement(),true);
				 	outPutBox.diableCount();
				 }

			}
		}
		addToFXQueue(core, task1, time,outPutBox);




	}

	private void addDependecyArrow(Core c, String task1, XUtil.XEntry curer, long time, XEventChain ec,MultysamplingViewElement outPutBox ,boolean isPromise) {

		//System.out.println(c.name+":"+curer.getEl().getTasks().getName() +" to "+outPutBox.getTask().getName());
		//System.out.println(c.name+":"+curer.getEl().getStart() +" to "+outPutBox.getModel().getStart());

		XEventElement haveToTell=null;
		Iterator<XEventElement> it=ec.getFullList(curer.getEl().getTasks().getName()).descendingIterator();
		while (xContainer.isMergingArrow()&&it.hasNext()){
				haveToTell=it.next();
				if ((haveToTell.getStart()+haveToTell.getDuration())==curer.getEl().getStart()){

					if ( haveToTell.getAbstractGanttViewElement() instanceof MultysamplingViewElement && ((MultysamplingViewElement)(haveToTell.getAbstractGanttViewElement())).isCountable() ){
					//	System.out.println(c.name+": found -> "+ haveToTell.getStatus()+ " "+	haveToTell.getAbstractGanttViewElement().toString() );

					}
					else{
						while (it.hasNext()){
							haveToTell=it.next();
							if ( haveToTell.getAbstractGanttViewElement() instanceof MultysamplingViewElement&& ((MultysamplingViewElement)(haveToTell.getAbstractGanttViewElement())).isCountable() ){
						//		System.out.println(c.name+": found -> "+ haveToTell.getStatus()+ " "+	haveToTell.getAbstractGanttViewElement().toString() );
								break;
							}
							else if (haveToTell.getStatus()==0){
						//		System.out.println(c.name+": foundError -> "+ haveToTell.getStatus()+ " "+	haveToTell.getAbstractGanttViewElement().toString() );
								haveToTell=null;
								break;
							}
							else {
						//		System.out.println(c.name+": search -> "+ haveToTell.getStatus()+" "+	haveToTell.getAbstractGanttViewElement().toString() );

							}

						}


					}
					break;
				}
				else {
					haveToTell=null;
				}
		}
	if (xContainer.isMergingArrow() && haveToTell!=null ){
		//System.out.println(c.name+": result -> "+ haveToTell.getStatus()+" "+ haveToTell.getAbstractGanttViewElement().toString()	 );
		((MultysamplingViewElement)haveToTell.getAbstractGanttViewElement()).tellProducer(task1,time);
	}





		long ofsE=time;
		long ofsS=curer.getEl().getStart();
		long cals=ofsE-ofsS;
		boolean oversamp=false;
		if (outPutBox.contains(curer.getEl().getName())){
			return;
		}
		ArrowElement arrow;

		/*
		if (((ProgressViewElement)curer.getEl().getAbstractGanttViewElement()).getLast() instanceof MultysamplingViewElement)
		{
			((MultysamplingViewElement) ((ProgressViewElement)curer.getEl().getAbstractGanttViewElement()).getLast()).tellProducer(task1);
		}else{
			System.out.println("Cant tells");
		}
*/





		XUtil.writeToLog("Add Task Effect "+" from "+task1+" to  "+curer.getEl().getName()+" "+ofsE+" "+ofsS +" = "+cals+"\nTime=> "+(time));
		String label="";
		;
		label=XUtil.compareTasks(xContainer.getTasks().get(task1),
				xContainer.getTasks().get(curer.getEl().getName()));

		boolean sell;
			if (isPromise){
				sell= outPutBox.isMergeArrow() && ec.getLastPrmFinish(curer.getEl().getName())!= null && ec.getLastPrmFinish(curer.getEl().getName()).getStart() == curer.getEl().getStart();
			}
			else {
				sell= outPutBox.isMergeArrow() && ec.getLastFinish(curer.getEl().getName())!= null && ec.getLastFinish(curer.getEl().getName()).getStart() == curer.getEl().getStart();
			}
		if (sell)
		{
		//	System.out.print("OverSampling!!!");
			oversamp=true;
			arrow=new DataFlowArrowViewElement("activate",
					ec.getIndexOf(task1),
					ec.getIndexOf(curer.getEl().getName()),
					cals,
					new ArrowTooltip(task1,curer.getEl().getName(),ofsS,cals,label) );
			ec.addReplaceFinish(curer.getEl());

		}
		else
		{


			if (xContainer.isAlternativeArrow()){
				arrow=new DataFlowArrowViewElementAlternative("activate",
						ec.getIndexOf(task1),
						ec.getIndexOf(curer.getEl().getName()),
						cals,
						new ArrowTooltip(task1,curer.getEl().getName(),ofsS,cals,label) );
				addToFXQueue(c, task1,  time,arrow);
				arrow.toFront();
			}
			else{
				arrow=new DataFlowArrowViewElement("activate",
						ec.getIndexOf(task1),
						ec.getIndexOf(curer.getEl().getName()),
						cals,
						new ArrowTooltip(task1,curer.getEl().getName(),ofsS,cals,label) );
				addToFXQueue(c, task1,  time, arrow);
				arrow.toFront();

			}

			ec.addReplaceFinish(curer.getEl());

		}
		outPutBox.addArrow(arrow);
		if (oversamp){
			outPutBox.setOverSampling(curer.getEl().getName());
		}

	}

	@Override
	public void addTaskEffectFollow(String core, String task1, long start,long end, long time)
	{
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task1)){
			return;
		}
		Core c = cores.get(core);
		XEventChain ec=xContainer.getChainByCore(core);
		XEventElement tmp;
		Iterator<XEventElement> it= XUtil.getFilteredList(ec, task1).descendingIterator();


				if (XUtil.hasDepended (task1,ec.getScheduler()))
				{

					if (it.hasNext()){

						tmp=it.next();
						if (it.hasNext()){
							tmp=it.next();
						//	System.out.println("PRE "+ task1 +" "+ tmp.getName() +" "+ tmp.getStatus());
							switch (tmp.getStatus()){
								case 1:
									break;
								default:
									//				System.out.println("ERRR3 "+ task1 +" "+ tmp.getStatus());
									break;
							}

						}
						else
						{
							//			System.out.println("ERRR1 "+ task1);
						}


					}
					else
					{
						//			System.out.println("ERRR2 "+ task1);
					}



				}
		//System.out.println("t1 " +ec.getIndexOf(task1) +" t2: " +ec.getIndexOf(task2));
	}

	@Override
	public void addTaskReady(String core, String task, long start, long stop){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c, task, start,new ProgressViewElement("status-yellow",new DurationModelElement(start,stop-start,"ready")));

		solveAllPromise("Ready",task);
	}
	
	@Override
	public void addTaskSuspended(String core, String task, long start, long stop){
		if(!cores.containsKey(core)){
			return;
		}else if(!cores.get(core).tasks.contains(task)){
			return;
		}
		Core c = cores.get(core);
		addToFXQueue(c, task, start,new ProgressViewElement("status-red",new DurationModelElement(start,stop-start,"suspended")));
		solveAllPromise("Suspend",task);
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
		addToFXQueue(c, task, time,new FlashTimeMarkerViewElement("",new TimeMarkModelElement(time,"deadline missed")));
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

		if (!cbScrollAllCharts.isVisible()){

			cbScrollAllCharts.setVisible(true);

			if (xContainer.isDataFlow()){
				globalButton.setVisible(true);

				chainButton.setVisible(true);
				chainButton.setDisable(false);
				Tooltip t=new Tooltip("Simulate custom event chains");
				Tooltip.install(chainButton,t);
			}

			if (xContainer.isHaveglobal()){
				globalButton.setDisable(false);
				Tooltip t=new Tooltip("Show global event chains");
				Tooltip.install(globalButton,t);
			}
			else {
				Tooltip t=new Tooltip("No global event chains");
				Tooltip.install(globalButton,t);
			}
		}
		final Core c = new Core();
		c.chart = new FXGanttWidget(30);
		c.chart.getStylesheets().add(getClass().getResource("/icons/ganttchart.css").toExternalForm());
		c.chart.getNumberAxis().setLabel(axisLabel);
		c.tasks = new HashSet<String>();
		c.name=core;
		cores.put(core, c);
		c.chart.addCategorie("Core");



		c.nav = new VBox();
		//Add diagram and core image to the view pane
		StackPane sp = createIcon(core,getClass().getResource("/icons/coreIcon.png").toExternalForm());
		sp.setStyle("-fx-border-color: white");
		if (xContainer.isDataFlow()){

			Tooltip t = new Tooltip("Show Task Dependency's") ;
			Tooltip.install(sp,t);
			EventHandler<MouseEvent> eventHandlerButton01 = e -> ComUtil.ShowTaskDepend(core);
			EventHandler<MouseEvent> eventHandlerButton02 = e -> sp.setStyle("-fx-border-color: black");
			EventHandler<MouseEvent> eventHandlerButton03 = e -> sp.setStyle("-fx-border-color: white");

			sp.setPadding(new Insets(2));
			sp.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandlerButton01);
			sp.addEventFilter(MouseEvent.MOUSE_ENTERED, eventHandlerButton02);
			sp.addEventFilter(MouseEvent.MOUSE_EXITED, eventHandlerButton03);
			sp.setCursor(Cursor.HAND);

		}


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

				//####################Task List #####################






					VBox vbox;

					if (xContainer==null || !xContainer.validateExecutable())
						{
							throw new NullPointerException();
						}

					//####################TaskViw #####################


						  vbox = new VBox(20,c.chart);



					add(c.nav, 0, row); //navigation
					add(vbox, 1, row); // chart



					row++;
					//		System.out.println();
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

		//System.out.println("RESET START ");
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

	
	
	private void addToFXQueue(Core c,String categorie,long start, AbstractGanttViewElement v)
	{



		if (v instanceof ProgressViewElement&&xContainer.isDataFlow())
			{
				ProgressViewElement pe=(ProgressViewElement) v;


				if (categorie.compareTo("Core")!=0
				)
					{

						switch (pe.getGanttStyle())
						{

                        case "status-red":
							v.setRef(
									xContainer.addtoChainByCore(categorie,c.name,0,pe.getModel().getStart(),pe.getModel().getDuration())
							);

                            break;

                        case "status-yellow":
							v.setRef(
									xContainer.addtoChainByCore(categorie,c.name,2,pe.getModel().getStart(),pe.getModel().getDuration())
							);
                            break;
/*
							case "activate":
								v.setRef(
										xContainer.addtoChainByCore(categorie,c.name,3,pe.getModel().getStart(),pe.getModel().getDuration())
								);
								break;
  */
                        case "status-over":
						case "status-under":
						case "status-multi":
						case "status-light-green":

							v.setRef(
									xContainer.addtoChainByCore(categorie,c.name,1,pe.getModel().getStart(),pe.getModel().getDuration())
							);

                            break;
						}
					//	System.out.println("addToFXQueue -> "+categorie+" "+xContainer.getChainByCore(c.name).getIndexOf(categorie)+" -> "+c.name);

					}

			}

		QueueData d = new QueueData(c.chart,categorie, start, v);
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

                }else{ //TODO Clear up stuff like this
                }
            }
        }.start();
	}

	public XContainer getxContainer() {
		return xContainer;
	}

	public void setxContainer(XContainer xContainer) {
		this.xContainer = xContainer;
	}

	private void solveAllPromise(String run, String name){
		Stack <Promise> prom;

		prom=promissList.get(name);

		if (prom !=null)
		{
		//	System.out.print("\n# Activate ->"+run+"\n");
			while (!prom.empty()){
					prom.pop().trySolvePromise();
			}
	//		System.out.print("\n# End ->"+run+"\n");
		}
	}
	public void addPromise(Promise promise){

		if (promissList.get(promise.task)==null){
			Stack <Promise> stak=new Stack<>();
			stak.add(promise);
			promissList.put(promise.task,stak);
		}
		else{
			promissList.get(promise.task).push(promise);
		}


	}
   abstract class Promise {
		public int type;
		public String task;
		public Core core;
		Promise(Core c,String task,int t){
			this.type=t;
			this.task=task;
			this.core=c;
		}
		abstract public void trySolvePromise();
	}


	private class  ArrowPromise extends  Promise{

		XUtil.ResultObj list;
		int offsetX;
		long time;
		DurationModelElement element;
		XUtil.XEntry curer;
		XEventChain ec;
		String task1,task2;
		MultysamplingViewElement box;
		public ArrowPromise(Core c, String task1, XUtil.ResultObj list, int offsetX, long time, DurationModelElement element, XUtil.XEntry curer, XEventChain ec, MultysamplingViewElement box)
		{
			super(c,curer.getEl().getTasks().getName(),3);
			this.task1=task1;
			this.list=list;
			this.offsetX=offsetX;
			this.time=time;
			this.element=element;
			this.curer=curer;
			this.ec=ec;
			this.task2=curer.getEl().getTasks().getName();
			this.box=box;
			//System.out.println("Create new promisse: "+task2+" to " + task1);
			//System.out.println("time "+curer.getEl().getStart() +" to " + time);
		}
		public Promise getMe(){
			return  this;
		}

		@Override
		public void trySolvePromise ()
			{
			//	System.out.println("Solve : "+task2+" to " + task1);
			//	System.out.println("time "+curer.getEl().getStart() +" to " +time);

				XEventChain chain=xContainer.getChainByCore(core.name);



				int tmp=chain.getIndexxOf(curer.getEl());
				LinkedList<XEventElement> linkedList=chain.getFullList(task2);

			//	System.out.println("tmpitemIndex of "+task2+" is "+tmp+" listSize> " +linkedList.size());

					if (linkedList.size()>tmp+1){


/*
						System.out.println("Inspect");

								System.out.println(
									linkedList.get(tmp).getStatus()+" "+
									linkedList.get(tmp).getStart()
						);
						System.out.println(
								linkedList.get(tmp+1).getStatus()+" "+
								linkedList.get(tmp+1).getStart()

						);

*/


						if (linkedList.get(tmp+1).getStatus()==0){

							//		System.out.println("Promisse Soled"+curer.getEl().getTasks().getName());
							addDependecyArrow(core,task1,new XUtil.XEntry(linkedList.get(tmp+1),0),time,ec,box,true);

						}
						else {

							if (curer.havePromiseAlternative()){
						//		System.out.println("Promisse Alternative "+curer.getEl().getTasks().getName());

								addDependecyArrow(core,task1,curer.getPromiseAlternative(),time,ec,box,false);
							}
							else {
								return;
							}

						}

					}
					else{

						if (linkedList.size()>0)
						{
						//	System.out.println("Last Element");

				/*			System.out.println(
									linkedList.getLast().getStatus()+" "+
											linkedList.getLast().getStart()
							);*/
						}
						else {
							//System.out.println("emptyChain");

						}
					}





			}


	}



	public static class ArrowTooltip{

		String task1,task2,label;
		long start,time;

		public ArrowTooltip(String task1, String task2,long start,long time,String label) {
			this.task1 = task1;
			this.task2 = task2;
			this.label=label;

			this.time=time;
			this.start=start;
		}

		public String getTask1() {
			return task1;
		}

		public String getTask2() {
			return task2;
		}

		public String getLabel() {
			return label;
		}

		public long getStart() {
			return start;
		}

		public long getTime() {
			return time;
		}
	}


}
