/*******************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *  
 *  SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 * Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.model;


import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.*;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.multicore.execution.model.elements.*;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.AbstractGanttViewElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.MultysamplingViewElement;
import org.eclipse.emf.common.util.EList;

import java.lang.System;
import java.util.*;
import java.util.function.Consumer;


public class XContainer
{
StringBuilder sb;
private LinkedList <LinkedList <ChainElement>> globalChain;

private HashMap<String,XCore> cores;
private HashMap <String,XTasks> tasks;
private HashMap <String,XRunnable> runnables;
private HashMap <String,XLabel> labels;
private HashMap <String, XScheduler> scheduler;
private HashMap <String,XEventChain> chain;
private boolean s1,s2,s3,s4,s5;
private static XContainer self;
private  boolean labelView,dataFlow,mergingArrow,alternativeArrow,haveglobal;
public   boolean isRun;

public static XContainer getInstance(Amalthea model){
			if (model!=null&&self==null){

				self=new XContainer(model);
				self.isRun =true;
			}
			else if (model==null&&self==null){
				self=new XContainer();
				self.isRun=false;
			}
		return self;
	}

public static XContainer newInstance(){

				self=new XContainer();
		return self;
	}

public  XContainer (){
//	System.out.println("Start XContainer withoud Model");
	XUtil.writeToLog("Start XContainer withoud Model");
}
public	XContainer (Amalthea model)
		{
            prepare(model);
		}
public void prepare(Amalthea model)
	{
		XUtil.writeToLog("######################"+new Date().toLocaleString()+"########################");
		globalChain=new LinkedList<>();

		runnables=new HashMap<>();
		labels=new HashMap<>();
		cores=new HashMap<>();
		tasks=new HashMap<>();
		scheduler=new HashMap<>();
		chain=new HashMap<>();
		s1=false;
		s2=false;
		s3=false;
		s4=false;
		s5=false;
		haveglobal=false;


		try {
			addLabel(model);
			addRunnables(model);
			addCores(model);
			addTasks(model);

			if (s1 && s2 && s3 && s4)
			{
				XMappingUtil.getScaduler(model.getMappingModel(),scheduler,cores);
				XMappingUtil.addTasks(model.getMappingModel(),scheduler,tasks);
				if (scheduler.size()>0)
					{
						s5=true;
						linkUser();
					}
			}
			//XMappingUtil.printAlloc(model.getMappingModel());
			printStatistics();

		}
		catch (Exception e)
		{
			System.err.println("No Software Model defined");
			e.printStackTrace();
			printStatistics();

		}
	}

	private void linkUser()
	{
		Iterator <String> it=scheduler.keySet().iterator();
		XScheduler xx;
		while (it.hasNext())
			{
				xx=scheduler.get(it.next());
				XMappingUtil.LinkTasks(xx);

				chain.put(xx.getCore().getName(),new XEventChain(xx));

			}

	}
private void addCores(Amalthea model)
	{
	HwModule hw;
	String tmp;

	Iterator <HwModule> it=
		model.getHwModel()
				.getStructures().get(0)
					.getStructures().get(0)
						.getStructures().get(0)
							.getModules().iterator();
	while (it.hasNext())
	{
		hw=it.next();
		tmp=hw.getClass().toString();
		tmp=tmp.substring(tmp.lastIndexOf(".")+1);


		if (tmp.compareTo("ProcessingUnitImpl")==0)
			{
			//	System.out.println("#######");
			//	System.out.println(hw.getName());
			//	System.out.println(tmp);
        		cores.put(hw.getName(),new XCore(hw.getName()));
			}
		if (cores.size()>0)
			{
				s3=true;
			}
	}
}
public static class ChainElement{

	XLabel label;
	LinkedList <XRunnable> read;
	LinkedList <XRunnable> write;

	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder();
		sb.append("\n##########"+label.getName()+"#########\n");
		sb.append("#\n");

		for (XRunnable run:write){
			if (run.getTask()!=null){
				sb.append("#w "+run.getTask().getName()+" - "+run.getName()+" \n");
			}else{
				sb.append("#w error");
			}

		}
		for (XRunnable run:read){
			if (run.getTask()!=null){
				sb.append("#r "+run.getTask().getName()+" - "+run.getName()+" \n");
			}
			else
			{
				sb.append("#r error");
			}

		}
		return sb.toString();
	}
	public  void saveAdd(XRunnable cc,XAccess inpu){

		if (inpu.getLabel().equals(label)){

			if (inpu.getState()==0){
				read.add(cc);
			}else if  (inpu.getState()==1) {
				write.add(cc);
			}

		}

	}
	public void printElement(){

		System.out.print(this.toString());

	}
	public ChainElement(XLabel label) {
		this.label=label;
		read=new LinkedList<>();
		write=new LinkedList<>();
	}

	public XLabel getLabel() {
		return label;
	}

	public LinkedList<XRunnable> getRead() {
		return read;
	}

	public void setRead(LinkedList<XRunnable> read) {
		this.read = read;
	}

	public LinkedList<XRunnable> getWrite() {
		return write;
	}

	public void setWrite(LinkedList<XRunnable> write) {
		this.write = write;
	}
}
private void addTasks(Amalthea model) throws NullPointerException
	{

		if (model!=null)
		{
			EList <Task> pp=model.getSwModel().getTasks();
			Iterator<Task> it=pp.iterator();
			Task tmp;
			XTasks xT;

			while (it.hasNext())
				{
					tmp=it.next();
					List <Runnable> list =SoftwareUtil.getRunnableList(tmp,null);
					Iterator <Runnable> iterator=list.iterator();
					Runnable run;
					//System.out.println(tmp.getName()+" + "+list.size());
					xT=new XTasks(tmp);

					while (iterator.hasNext())
						{
							run=iterator.next();
							//System.out.println(tmp.getName()+" - "+run.getName());
							xT.addRunnable(run.getName(), runnables.get(run.getName()));

						}
				//	System.out.println(xT.size());

					tasks.put(tmp.getName(),xT);
					for (String runer: xT.getMap().keySet()
						 ) {
						xT.getMap().get(runer).setTask(xT);
					}

				}
			if (tasks.size()>1){s4=true;}

		}



	}
private void addLabel(Amalthea model) throws NullPointerException
	{
		if (model!=null)
		{
			EList <Label> pp=model.getSwModel().getLabels();
			Iterator<Label> it=pp.iterator();
			Label tmp;
//			SoftwareUtil.
			while (it.hasNext())
				{
					tmp=it.next();
					labels.put(tmp.getName(),new XLabel(tmp));
				}
			if (labels.size()>0)
				{
					s1=true;
				}

		}



	}

private void addGlobalChains(Amalthea model) throws NullPointerException {
	if (model.getConstraintsModel().getEventChains().size()>0){
		haveglobal=true;

		for (EventChain ec:model.getConstraintsModel().getEventChains()){

			globalChain.add(new LinkedList<>());
			ec.getSegments().forEach(new Consumer<EventChainItem>() {
				@Override
				public void accept(EventChainItem eventChainItem) {


					globalChain.getLast().add(new ChainElement(labels.get(eventChainItem.getEventChain().getName().substring(3))));

				}
			});

		}

		globalChain.forEach(xLabels -> {

			//System.out.println("Chain");
			xLabels.forEach(label->{
		//		System.out.println(label.getLabel().getName());
			});


		});



	}

}

	private void addRunnables(Amalthea model) throws NullPointerException
	{
		if (model!=null)
		{
			addGlobalChains(model);
			EList <Runnable> pp=model.getSwModel().getRunnables();
			Iterator<Runnable> it=pp.iterator();
			Iterator<LabelAccess> itt;
			Runnable run;
			LabelAccess xL;
			XRunnable XRun;
			String tmp;

			while (it.hasNext())
				{
					run=it.next();
					XRun=new XRunnable(run);
					//System.out.println("### "+run.getName());
					itt=SoftwareUtil.getLabelAccessList(run,null).iterator();
					while (itt.hasNext())
						{
							xL=itt.next();
							//System.out.println("#######");
							if (labels.size()>0)
								{
									XAccess cici =null;
									if (xL.getAccess().getName().compareTo("write")==0)
									{
										cici=XRun.addAccess(1,labels.get(xL.getData().getName()));
									}
									else
									{
										cici=XRun.addAccess(0,labels.get(xL.getData().getName()));
									}

									for (LinkedList <ChainElement> list:globalChain
										 ) {
										for (ChainElement ce:list
											 ) {
													 ce.saveAdd(XRun,cici);

										}
									}
								}
						}
					runnables.put(run.getName(),XRun);
				}
			if (runnables.size()>0){s2=true;}
		}

	}

public String printStatistics()
	{
		StringBuilder sb=new StringBuilder();
		p1(sb);
		p2(sb);
		short c=1;
		for (LinkedList<ChainElement>chainElements:globalChain){

			sb.append("# Chain "+c+"\n");
			for (ChainElement element:chainElements){
				sb.append(element.toString()+"\n");
			}
			c++;
	}
		//	System.out.println(sb);
		XUtil.writeToLog(sb.toString());
		System.out.println(sb);
		return (sb.toString());



	}
private void p1(StringBuilder sb)
	{
		sb.append("#### XContainer - Level I - Statistic ####\n");
		sb.append("#           TOTAL\n");
		sb.append("#\n");
		sb.append("#    Cores: ");
		sb.append(this.cores.size());
		sb.append("\n");
		sb.append("#    Tasks: ");
		sb.append(this.tasks.size());
		sb.append("\n");
		sb.append("#    Runables: ");
		sb.append(this.runnables.size());
		sb.append("\n");
		sb.append("#    Label: ");
		sb.append(this.labels.size());
		sb.append("\n");
	}
private void p2(StringBuilder sb)
	{
		sb.append("#### XContainer - Level II - Statistic ####\n");
		sb.append("#           TOTAL\n");
		sb.append("#\n");
		sb.append("#    Scheduler: ");
		sb.append(this.scheduler.size());
		sb.append("\n");
		if (scheduler.size()>0){
			Iterator <String> it=scheduler.keySet().iterator();
			XScheduler xS;
			while (it.hasNext())
			{
				xS=scheduler.get(it.next());
				sb.append("#    "+xS.getName()+": "+xS.size() +"\n");
			}
		}
		sb.append("#\n");
		sb.append("#    Tasks: ");
		sb.append(this.tasks.size());
		sb.append("\n");
		if (tasks.size()>0){
			Iterator <String> it=tasks.keySet().iterator();
			XTasks xT;
			while (it.hasNext())
			{
				xT=tasks.get(it.next());
				sb.append("#    "+xT.getName()+": "+xT.size() +" l:"+xT.getConsumer().size()+"\n");
			}
		}
		sb.append("#\n");

		sb.append("#    Runnable: ");
		sb.append(this.runnables.size());
		sb.append("\n");
		int countRead=0,coundWrite=0;
		if (runnables.size()>0){
			Iterator <String> it=runnables.keySet().iterator();
			Iterator <XAccess> itt;
			XRunnable xR;
			while (it.hasNext())
			{
				xR=runnables.get(it.next());
				itt=xR.getList().iterator();
				while (itt.hasNext())
				{
					if (itt.next().getState()==0)
					{
						countRead++;
					}
					else
					{
						coundWrite++;
					}
				}

			}
		}
		sb.append("#   AccessCount read:"+countRead+" write:"+coundWrite);
		sb.append("\n");
		sb.append("#"+validateExecutableString()+"\n");

	}
private String validateExecutableString()
		{
			if (s1 && s2 && s3 && s4 && s5)
				{
					return "    Amalthea is rdy for Visualization";
				}
			else
				{
					return "  !!! Warning  !!!  Amalthea is NOT rdy for Visualization";
				}
		}
public XEventChain getChainByCore(String core)
	{
		return  this.chain.get(core);
	}
public XEventElement addtoChainByCore(String taskName, String core, int status,long start, double duration)
	{
		XEventChain cc;
		XEventElement element;
		LinkedList <XEventElement> list;
		if (chain.get(core)==null || tasks.get(taskName)==null)
			{
			System.err.println("LINKING ERROR");
			}
		else
			{

				cc=chain.get(core);


				if (status==0)
					{
				//	    System.err.println(taskName+" "+start);
				//		XUtil.writeToLog(taskName+" "+start);

					 element=new XEventElement(taskName,tasks.get(taskName),true,status,start,duration);

						cc.betterAdd(element);
						//cc.addReplaceFinish(element);
						return element;


					}
				else {
					element=new XEventElement(taskName,tasks.get(taskName),false,status,start,duration);
					cc.betterAdd(element);
					return element;

				}

			//	System.out.println("Add "+taskName +" to "+core);
				//cc.printList();
			}
		return null;
	}
public boolean validateExecutable()
	{
		return s1 && s2 && s3 && s4 && s5;
	}

public HashMap<String, XScheduler> getScheduler() {
		return scheduler;
	}

public HashMap<String, XCore> getCores() {
		return cores;
	}
public HashMap<String, XTasks> getTasks() { return tasks; }

	public boolean isLabelView() {
		return labelView;
	}

	public void setLabelView(boolean labelView) {
		this.labelView = labelView;
	}

	public boolean isDataFlow() {
		return dataFlow;
	}

	public void setDataFlow(boolean dataFlow) {
		this.dataFlow = dataFlow;
	}

	public boolean isMergingArrow() {
		return this.mergingArrow;
	}

	public void setMergingArrow(boolean value) {
		this.mergingArrow = value;
	}
	public boolean isAlternativeArrow() {
		return this.alternativeArrow;
	}
	public void setAlternativeArrow(boolean value) {
		this.alternativeArrow = value;
	}
	public String getReport(){

	sb=new StringBuilder();


		for (String sel:chain.keySet())
		{
				if (sel!=null){

					int r=0;
					Iterator<XEventElement> it =chain.get(sel).iterator();
					while (it.hasNext())
					{
						if (it.next().getStatus()==0){
							r++;
						}
					}
					sb.append("\n" +	sel +"\n"
										+"Total Tasks Complete: " + r +"\n"
					);

				}
				else{
					return sb.toString();
				}

		}

	return sb.toString();
	}

	public LinkedList<LinkedList<ChainElement>> getGlobalChain() {
		return globalChain;
	}

	public HashMap<String, XRunnable> getRunnables() {
		return runnables;
	}

	public HashMap<String, XLabel> getLabels() {
		return labels;
	}

	public HashMap<String, XEventChain> getChain() {
		return chain;
	}

	public boolean isRun() {
		return isRun;
	}

	public Object [] [] generateReport() throws  NullPointerException
	{ 
		int refactor=1,width=4;

		cores.size();
	Object [] [] out=new Object[cores.size()*refactor][width];

		Iterator<String> it = scheduler.keySet().iterator();

	for (int i=0;i+refactor-1<out.length;i=i+refactor)
	{
		XScheduler sc=scheduler.get(it.next());
		XEventChain cc=getChainByCore(sc.getCore().getName());

		int countRun=0,countOver=0,countUnde=0;

		for (XTasks tas:sc.getTasks()){
			for (XEventElement zzmp:cc.getFullList(tas.getName())){
				AbstractGanttViewElement agv= zzmp.getAbstractGanttViewElement();
				if (zzmp.getStatus()==0){
					countRun++;
				}
				if (agv instanceof MultysamplingViewElement){

					MultysamplingViewElement  mmb=(MultysamplingViewElement) agv;


					if (mmb.isCountable()) {
						if (mmb.isOverSampling()){
							countOver++;
						}
						if (mmb.isUnderSampling()){
							countUnde++;
						}
					}
				}
			}
		}


			out[i]=new Object[]		{sc.getCore().getName(),countRun,countOver,countUnde};

	}


	return out;
	}

	public XResult getLabelAcces(String sel, String core){

	XTasks tmpTask=getTasks().get(sel);
	long read=0,write=0,count=0;

		for (String curRun:tmpTask.getMap().keySet()
			 ) {
			for (XAccess access:tmpTask.getMap().get(curRun).getList()
				 ) {
				switch (access.getState()){
					case 0:
						read++;
						break;
					case 1:
						write++;
						break;

				}
			}
		}

	Iterator<XEventElement> it=getChainByCore(core).getFullList(sel).iterator();

		while (it.hasNext()){
			XEventElement xEl=it.next();
			if(xEl.getAbstractGanttViewElement() instanceof MultysamplingViewElement)
		{
				MultysamplingViewElement el= (MultysamplingViewElement) xEl.getAbstractGanttViewElement();
				if (el.isCountable()&&xEl.getStatus()==1){
					count++;
				}
			}
		}


	return new XResult(read*count,write*count);
	}

	public boolean isHaveglobal() {
		return haveglobal;
	}

	public class XResult{

	long read ,write;

		public XResult(long read, long write) {
			this.read = read;
			this.write = write;
		}

		public long getRead() {
			return read;
		}

		public long getWrite() {
			return write;
		}
	}
}
