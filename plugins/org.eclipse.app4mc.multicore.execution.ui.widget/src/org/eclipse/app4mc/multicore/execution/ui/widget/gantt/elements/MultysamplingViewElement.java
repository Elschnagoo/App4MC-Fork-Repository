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
import org.eclipse.app4mc.multicore.execution.model.elements.XEventChain;
import org.eclipse.app4mc.multicore.execution.model.elements.XTasks;
import org.eclipse.app4mc.multicore.execution.ui.widget.comunication.ComUtil;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;
import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.TraceWidget.ArrowTooltip;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Gantt view element representing an interval by drawing a line for the 
 * duration provided by the <code>DurationEventModel</code>. The line 
 * is placed above the section of interest.
 */
public class MultysamplingViewElement extends ProgressViewElement{

	private boolean mergeArrow ,underSampling,overSampling,follow,countable;
	private String core;
    private	XEventChain ec;
	private String affected;
	private LinkedList<ArrowElement> list;

	private MultysamplingViewElement nextLink;

	private LinkedList<Boolean> overBooList;
	private HashMap<String,Long> underBooList;
    private XTasks task;
    private String style;
    private Tooltip t;

	public MultysamplingViewElement(XTasks task, String style, DurationModelElement model, boolean mergeArrow, String core, XEventChain ec) {
		super(style, model,new ArrowTooltip(task.getName(),null,model.getStart(),(long)model.getDuration(),"Running"),false);
        nextLink=null;
		this.mergeArrow = mergeArrow;
		this.underSampling = true;
		this.overSampling = false;
		this.core = core;
		this.ec = ec;
		this.follow=false;
		this.affected="";
		this.style=style;
		list=new LinkedList<>();
        overBooList=new LinkedList<>();
        underBooList=new HashMap<>();
        this.task=task;
        countable=true;





        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                switch (event.getButton()){


                    case PRIMARY:
                        LinkedList <ComUtil.CollumEntry> outOver = new LinkedList<>();
                        LinkedList <ComUtil.CollumEntry> outUnder = new LinkedList<>();

                        for (String tt:task.getProducer().keySet()){
                            XTasks cur=task.getProducer().get(tt);
                            boolean found=false;
                            for (ArrowElement element :list){
                                if (element.getParrentTask().compareTo(cur.getName())==0)
                                {
                                    String [] arr=element.getStatistic().split(",");
                                    String ttspm="";
                                if (overBooList.get(containsInt(cur.getName()))){
                                        ttspm="Oversampling";
                                }
                                else{

                                }
                                    outOver.add(new ComUtil.CollumEntry(arr[0],""+arr[1],"[ have data ]",""+ttspm));

                                    found=true;
                                }

                            }
                            if (!found){
                                outOver.add(new ComUtil.CollumEntry(""+cur.getName(),"","[ no data ]",""));

                            }
                        }
                        for (String tt:task.getConsumer().keySet()){
                            XTasks cur=task.getConsumer().get(tt);
                            boolean found=false;
                            for (String element :underBooList.keySet()){
                                if (element.compareTo(tt)==0)
                                {
                                    outUnder.add(new ComUtil.CollumEntry(tt,""+underBooList.get(element),"[ have data ]",""));

                                    found=true;
                                }

                            }
                            if (!found){
                                outUnder.add(new ComUtil.CollumEntry(""+cur.getName(),"","[ no data ]","Undersampling"));

                            }
                        }

                        ComUtil.taskInfo(task.getName(),
                                        model.getStart(),
                                        (model.getStart()+model.getDuration()),
                                        underSampling,
                                        overSampling,
                                        outOver,
                                        outUnder
                                );

                        StringBuilder sb= new StringBuilder();
                        sb.append("\n");
                        sb.append(underBooList.size() +" / "+task.getConsumer().size());
                        sb.append("Sollen:\n");
                        for (String cur:task.getConsumer().keySet())
                        {


                            sb.append(cur);
                            sb.append(" should linked");
                            sb.append("\n");

                        }
                        sb.append("Sind:\n");
                        for (String cur:underBooList.keySet()){


                            sb.append(cur);
                            sb.append(" islinked");
                            sb.append("\n");

                        }

                     //   ComUtil.PopUpWindow("Assert",sb.toString());
                        break;

                }

            }
        };
        if (mergeArrow){
            this.setCursor(Cursor.HAND);
            this.setOnMouseClicked(handler);

            t= new Tooltip("Task " +task.getName()+" running\n"+

                    model.getStart()+" to "+(model.getStart()+model.getDuration())+"\n"+
                    "[Left Click] - Get more information"
                    + "\n"

            );
        }
        else {

            t= new Tooltip("Task " +task.getName()+" running\n"+

                    model.getStart()+" to "+(model.getStart()+model.getDuration())+"\n"

            );
        }

        Tooltip.install(this,t);

        validateUndersampling();

        styleCollection();
	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		super.updateElement(chart);

		setHeight(getHeight());

		
	}

	public void setOverSampling(String task){
			overSampling=true;
        overBooList.set(containsInt(task),true);
			styleCollection();
	}
    public boolean getOverSampling(String task){

        return overBooList.get(containsInt(task));

    }
	public void setUnderSampling(){

		underSampling=false;
		styleCollection();
	}

	public void styleCollection (){

	    if (nextLink!=null){
           // nextLink.mergeMe(nextLink,false);
         //   nextLink.styleCollection();
        }
			String in="";
		if (underSampling&&overSampling){
			in="multy";
		}
		if (!underSampling&&overSampling){
			in="over";

		}
		if (underSampling&&!overSampling){
			in="under";

		}
       // System.out.println(in+" ->"+task.getName());
		switch (in){
			case "multy":
						getStyleClass().remove(style);
						style="status-multi";
						getStyleClass().add("status-multi");
			            break;
			case "over":
                        getStyleClass().remove(style);
                        style="status-over";
                        getStyleClass().add("status-over");
                        break;
			case "under":
                        getStyleClass().remove(style);
                        style="status-under";
                        getStyleClass().add("status-under");
				        break;
			default:
                        getStyleClass().remove(style);
                        style="status-light-green";
                        getStyleClass().add("status-light-green");
				        break;
		}
	}

	public boolean isMergeArrow() {
		return mergeArrow;
	}

	public boolean isUnderSampling() {
		return underSampling;
	}

	public boolean isOverSampling() {
		return overSampling;
	}

	public String getCore() {
		return core;
	}

	public XEventChain getEc() {
		return ec;
	}

	public String getAffected() {
		return affected;
	}
	public void addArrow(ArrowElement elen){
	        list.add(elen);
        overBooList.add(false);
    }
    public void validateUndersampling(){
        if(task.getConsumer()==null||!mergeArrow ) {
            underSampling=false;
            styleCollection();
        }
        else  if (task.getConsumer()!=null && underBooList.size()==task.getConsumer().size()){
            setUnderSampling();
        }

    }
    public boolean contains(String in){
	    for (ArrowElement el:list){
	      //  System.out.println(el.getParrentTask() +" "+ in);

	        if (el.getParrentTask().compareTo(in)==0){
	            return true;
            }
        }
	    return false;
    }
    private int containsInt(String in){
	    int a=0;
	    for (ArrowElement el:list){
	    //    System.out.println(el.getParrentTask() +" "+ in);

	        if (el.getParrentTask().compareTo(in)==0){
	            return a;
            }
            a++;
	    }
	    return -1;
    }

    public void tellProducer (String name,long start){

	    if (underBooList.get(name)==null){
	       underBooList.put(name,start);
	       System.out.println(name +" tells "+ task.getName());
        }
        validateUndersampling();

    }
    public boolean isFollow() {
        return follow;
    }

    public void setFollow(boolean follow) {
        this.follow = follow;
        if (follow){
            underSampling=false;
            overSampling=false;
            styleCollection();
        }
    }
    public void mergeMe(MultysamplingViewElement inEl,boolean val){
	    inEl.nextLink=this;
	    this.overBooList=inEl.overBooList;
	    this.underBooList=inEl.underBooList;
	    this.mergeArrow=inEl.mergeArrow;
	    this.overSampling=inEl.overSampling;
	    this.affected=inEl.affected;
	    this.underSampling=inEl.underSampling;
	    this.list=inEl.list;

	    styleCollection();

	    if (val){
            new Thread(() -> {
                try {
                    Thread.sleep(1000*20);
                    mergeMe(inEl,false);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

	         }
    public void diableCount(){
	    this.countable=false;
    }

    public boolean isCountable() {
        return countable;
    }


    public XTasks getTask() {
        return task;
    }
}
