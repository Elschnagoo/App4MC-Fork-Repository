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

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader;
import org.eclipse.app4mc.multicore.execution.model.elements.*;
import org.eclipse.app4mc.multicore.execution.ui.widget.comunication.ComUtil;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class XUtil {

	private boolean debuger=false;
	private StringBuilder sb=new StringBuilder();
	public static XContainer startWithInput(int sel,String path)
		{
			XUtil x;
			switch (sel)
				{
					case 0:

						x=new XUtil();
						return x.openWithUI();
					case 1:
						x=new XUtil();
						return x.t1(path);
					default:
						return null;
				}

		}

	public static XScheduler getSchedulerByCore(XContainer xContainer, String core)
	{
		Iterator<String> iterator=xContainer.getScheduler().keySet().iterator();
		HashMap <String,XScheduler> map=xContainer.getScheduler();
		for (String sc:map.keySet())
			{
				if (map.get(sc).getCore().getName().compareTo(core)==0)
					{
						return map.get(sc);
					}
			}

	return null;
	}

	public static boolean hasDepended(String task, XScheduler tmp)
	{
		if (!XContainer.getInstance(null).isDataFlow()){
			return false;
		}
		for  (XTasks t: tmp.getTasks())
			{
				if (t.getName().compareTo(task)==0)
					{
						return t.getProducer().size()>0;
					}
			}
		return false;
	}

    public static LinkedList<ComUtil.ULabel> getAllLabels(XContainer xContainer)
	{
		LinkedList <ComUtil.ULabel> out=new LinkedList<>();
		HashMap<String, XTasks> tasks = xContainer.getTasks();
		HashMap<String, XRunnable> runnable = xContainer.getRunnables();
		String tmpTask="";
		String tmpRun="";

		for (String nt:tasks.keySet()){
			tmpTask=nt;
			for (String nr:tasks.get(nt).getMap().keySet()){
					tmpRun=nr;
					for (XAccess acc:runnable.get(nr).getList()){

						out.add(new ComUtil.ULabel(acc.getLabel().getName(),tmpRun,tmpTask));
					}
			}

		}

		return out;



    }

    public static class ResultObj extends Stack <XEntry>{
		int state;
		boolean havePrommise;
		public ResultObj() {
			state=-2;
			this.havePrommise=false;
		}

		public int getState() {
			return state;
		}

		public void setState(int state) {
			this.state = state;
		}

		public boolean isHavePrommise() {
			return havePrommise;
		}

		public void setHavePrommise(boolean havePrommise) {
			this.havePrommise = havePrommise;
		}
	}

	public  static class XEntry
	{
		XEventElement el;
		XEntry promiseAlternative;
		int state;

		public XEntry(XEventElement el, int state) {
			this.el = el;
			this.state = state;
			this.promiseAlternative=null;
		}

		public XEventElement getEl() {
			return el;
		}

		public int getState() {
			return state;
		}

		public boolean havePromiseAlternative(){
					return this.promiseAlternative!=null;
		}

		public XEntry getPromiseAlternative() {
			return promiseAlternative;
		}

		public void setPromiseAlternative(XEntry promiseAlternative) {
			this.promiseAlternative = promiseAlternative;
		}
	}
	public static ResultObj isAffected(XEventChain chainByCore, String task)
	{
		StringBuilder sb=new StringBuilder();

		ResultObj out =new ResultObj();
		out.setState(0);

		if (!XContainer.getInstance(null).isDataFlow()){
			out.setState(-300);
			return out;
		}
		LinkedList<XEventElement> tmplist = XUtil.getFilteredList(chainByCore, task);
		if (tmplist.size()>1)
			{

				Iterator<XEventElement> it = tmplist.descendingIterator();

                //			System.out.println();

				if (it.next().getStatus()==2 && it.next().getStatus()==1){
					out.setState(0);
					return out;}
			}


		for (XTasks t:chainByCore.getScheduler().getTasks())
			{
				if (t.getName().compareTo(task)==0)
					{
						if (t.getProducer().size()==0)
							{
								out.setState(0);
								return out;
							}
						else
							{
								sb.append("#########################"+t.getName()+"################################");
								sb.append("\n");
								out= isInFinishList(chainByCore,t,sb);
								sb.append("######################### "+"End"+" ################################");
								sb.append("\n");
                                //						System.out.println(sb);
							//	XUtil.writeToLog(sb.toString());

								return out;

							}
					}
			}
        //	System.out.println("use NULL");
		return out;

	}
	private static ResultObj isInFinishList(XEventChain cbc, XTasks linked, StringBuilder sb)
		{
			Iterator <String> it= linked.getProducer().keySet().iterator();
			Iterator <XEventElement> itt;
			ResultObj out=new ResultObj();
			out.setState(0);
			int count=0;

			XTasks tmpTask;
			XEventElement eventElement;
			while (it.hasNext())
				{
					count=0;
					XEntry currentOutput=null;
					tmpTask=linked.getProducer().get(it.next());

					sb.append("#");
					sb.append("\n");

					sb.append("# Search for "+tmpTask.getName());
					sb.append("\n");

					itt=XUtil.getFilteredList(cbc,tmpTask.getName()).descendingIterator();

				while	(itt.hasNext())
						{
							eventElement=itt.next();


							sb.append("# Compare with ->"+eventElement.getName()+"\n");
							sb.append("\n # @ "+eventElement.getStart() + "\n # for " + eventElement.getDuration());
							sb.append("# Status->"+eventElement.getStatus()+"\n");


								 if (count==0&&eventElement.getStatus()==1){
									 sb.append("## Found Prommise at "+count+"\n");
									 sb.append("##> "+eventElement.getStart()+"\n");

									 sb.append("#");
									 sb.append("\n");
									 currentOutput=new XEntry(eventElement,-1);
									 out.push(currentOutput);
									 out.setHavePrommise(true);
								}


							if (eventElement.getStatus()==0){

									sb.append("## Found Match at "+count+"\n");
									sb.append("##> "+eventElement.getStart()+"\n");

									sb.append("#");
									sb.append("\n");

									if (currentOutput==null){
										out.setState(1);
										out.push(new XEntry(eventElement,1));
									}
									else{

										currentOutput.setPromiseAlternative(new XEntry(eventElement,1));
										out.push(currentOutput);
										break;
									}
									count++;
									break;
							}
							count++;



							/*

								*/

						}


				}
			if (out.getState()==0){sb.append("## Found no Match \n");}
			else {
				sb.append("## Found "+out.size()+" Match(s) \n");
			}
			return out;
		}

	public static LinkedList <String>  getAffected(XEventChain ec, String task1)
	{
		LinkedList <String> out=new LinkedList<>();

		for (XTasks t:ec.getScheduler().getTasks())
		{
			if (t.getName().compareTo(task1)==0)
			{
				if (t.getProducer().size()==0)
				{
					return out;
				}
				else
				{
					ArrayList<String> ttmp=getInFinishList(ec,t.getProducer());
					for (String s:ttmp)	{
							out.add(s);
					}
					 {

					}


				}
			}
		}
		return out;
	}
	private static ArrayList <String> getInFinishList(XEventChain cbc, HashMap<String, XTasks> linked)
	{
		ArrayList <String> outPut=new ArrayList<>();
		Iterator <String> it= linked.keySet().iterator();
		XTasks tmpTask;
		boolean debug=true;
		while (it.hasNext())
		{
			tmpTask=linked.get(it.next());
			//if (debug){System.out.println("#Search for "+tmpTask.getName());}
			for (XEventElement s:cbc)
			{
				//if (debug){System.out.println("Compare with ->"+s.getName());}

				if (s.getName().compareTo(tmpTask.getName())==0)
				{
			//		if (debug){System.out.println("##Found Match");}
						outPut.add(s.getName());
				}


			}

		}
		//if (debug){System.out.println("##Found no Match");}

		return outPut;
	}
	private XContainer openWithUI() {
		final JFileChooser chooser = new JFileChooser("Please set Amalthea Model");
		chooser.setDialogType(JFileChooser.OPEN_DIALOG);
		chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		final File file = new File("/");

		chooser.setCurrentDirectory(file);

		chooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent e) {
				if (e.getPropertyName().equals(JFileChooser.SELECTED_FILE_CHANGED_PROPERTY)
						|| e.getPropertyName().equals(JFileChooser.DIRECTORY_CHANGED_PROPERTY)) {
					final File f = (File) e.getNewValue();
				}
			}
		});

		chooser.setVisible(true);
		final int result = chooser.showOpenDialog(null);

		if (result == JFileChooser.APPROVE_OPTION) {
			File inputVerzFile = chooser.getSelectedFile();
			String inputVerzStr = inputVerzFile.getPath();
			return t1(inputVerzStr);
		}
		//System.out.println("Abbruch");
		chooser.setVisible(false);
		return null;
	}

	private XContainer  t1 (String path)
	{

		Amalthea model;
		File inputFile;
		XContainer c=null;

			try
			{
				inputFile = new File(path);
				model = AmaltheaLoader.loadFromFile(inputFile);

				if (model == null) {
				//	System.out.println("Error: No model loaded!");
					XUtil.writeToLog("Error: No model loaded!");
				}
				c = XContainer.getInstance(null);
                c.prepare(model);
				//runFull(c);
			}
			catch (Exception e)
			{
				System.out.println("Error while loading Amalthea Model");

				System.out.println("#########################################");
				System.out.println(e.toString());
				System.out.println("#########################################");


			}
        //	System.out.println("done");

		return c;


	}



	private void runFull(XContainer c)
		{
		XScheduler s;
		Iterator <String> it;
			sb.append("###########Detail Scaduling info ################\n");

			if (c.validateExecutable())
			{
				Set<String> keySet=c.getScheduler().keySet();
				it=keySet.iterator();

				while (it.hasNext())
					{
						s=c.getScheduler().get(it.next());
						sb.append("\n# Name: ");
						sb.append(s.getName()+"\n");
						level00(s);
					}
			}
			if (debuger)
			{
                //		System.out.println(sb);
				//XUtil.writeToLog(sb.toString());
                //		System.out.println("###########Detail Scheduling info - Ende##########");

			}
		}
	private void level00(XScheduler s) //#level00 ist a testing level
	{
		//LinkedList<XTasks> list=s.getTasks();
		//se(list.getFirst(),list);

		//System.out.println();
		level01(s);

	}

	private void level01(XScheduler s)
		{
			sb.append("# CPU: "+s.getCore().getName()+"\n");
			LinkedList<XTasks> list=s.getTasks();



			level02(list);

		}
	private void level02(LinkedList<XTasks> list)
		{
			Iterator<XTasks> it=list.iterator();
			XTasks tmp;

			while (it.hasNext())
				{
					tmp=it.next();

					sb.append("\n## Task: "+tmp.getName()+"\n");

					level03(tmp);
				}


		}
	private void level03(XTasks t)
		{
			HashMap<String,XRunnable> map;
			map=t.getMap();
			Iterator<String> keys=map.keySet().iterator();
			XRunnable tmp;
			LinkedList <XAccess> read;
			LinkedList <XAccess> write;
			Iterator<XAccess> acc;
			XAccess aTmp;
			read=new LinkedList<>();
			write=new LinkedList<>();

			while (keys.hasNext())
			{
				tmp=map.get(keys.next());
				//sb.append("### Runnable: "+tmp.getName()+"\n");

				acc=tmp.getList().iterator();

				while (acc.hasNext())
					{
						aTmp=acc.next();

						switch (aTmp.getState())
							{
								case 0: read.add(aTmp);break;
								case 1: write.add(aTmp);break;
								default:break;
							}
					}

			}
			sb.append("#### Read: "+read.size()+" Write: "+write.size()+"\n");
		}

//## compare with Other Tasks

public static boolean se(XTasks t,Iterable <XTasks>iterable)
		// Compare Tasks: if one of the Iterable Tasks writes to one label that t reads
		{
			boolean output=false;
			LinkedList <XAccess> toCompaer;
			toCompaer=t.getBySel(0);
			Iterator<XTasks> it=iterable.iterator();
			XTasks x;

			while (it.hasNext())
				{
					x=it.next();
					output=compareAccess(toCompaer,x.getBySel(1));
					if (output)
					{
						t.addProducer(x);
					//	System.out.println(t.getName() +" ->  "+x.getName());

						output = true;
					}
					if (!output)
						{

						}

				}


			return output;

		}
public static boolean compareAccess(Iterable<XAccess> first, Iterable<XAccess> next)
	{
		Iterator <XAccess> it1,it2;
		it1=first.iterator();
		XAccess tmp1,tmp2;
		while (it1.hasNext())
			{
				it2=next.iterator();
				tmp1=it1.next();
				while (it2.hasNext())
					{
						tmp2=it2.next();

						if (tmp1.getLabel().getName().compareTo(tmp2.getLabel().getName())==0)
							{
								return true;
							}
					}
			}

		return false;
	}

public static String compareTasks (XTasks read,XTasks write)
		{

			Iterator <XAccess> rr,ww;
			String out="";

			XAccess tmpA;
			XAccess tmpB;

			rr=read.getBySel(0).iterator();

			while (rr.hasNext())
				{
					tmpA=rr.next();

					ww=write.getBySel(1).iterator();
					while (ww.hasNext())
						{
							tmpB=ww.next();

							if (tmpA.getLabel().getName().compareTo(tmpB.getLabel().getName())==0)
								{
									out+=tmpA.getLabel().getName()+",";
								}
						}

				}



			return out;
		}



public static LinkedList<XEventElement> getFilteredList(XEventChain  chain,String name)
{
	LinkedList <XEventElement> output=new LinkedList<>();
	Iterator <XEventElement> it=chain.iterator();
	XEventElement tmp;

	while (it.hasNext())
		{
				tmp=it.next();
				if(tmp.getName().compareTo(name)==0)
					{
						output.add(tmp);
					}
		}

return output;

}

public static void writeToLog(String inString)

{
		File f = new File("log.txt");
		boolean existsFlag = f.exists();
//		System.out.println(f.getAbsolutePath());
		if(!existsFlag)
		{
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("could not create new log file");
				//e.printStackTrace();


				System.out.println(inString);
				return;

			}

		}

		FileWriter fstream;
		try {
			fstream = new FileWriter(f, true);
			BufferedWriter out = new BufferedWriter(fstream);
			out.write(inString+"\n");
			out.newLine();
			out.close();
		} catch (IOException e) {
			System.out.println("could not write to the file");
			e.printStackTrace();
		}


		return;
	}

}


