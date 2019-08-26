/**
 ********************************************************************************
 * Copyright (c)  2019 Dortmund University of Applied Sciences and Arts and others.
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

package org.eclipse.app4mc.multicore.execution.ui.widget.eventcanves;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import org.eclipse.app4mc.multicore.execution.model.XUtil;
import org.eclipse.app4mc.multicore.execution.model.elements.XAccess;
import org.eclipse.app4mc.multicore.execution.model.elements.XScheduler;
import org.eclipse.app4mc.multicore.execution.model.elements.XTasks;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class SimpleLabelChain implements EventCanvas
{

    private Canvas canvas;
    private int elements;
    private GraphicsContext gc;
    private XScheduler sc;
    LinkedList <XAccess> list;

    //start point
    private double x=30;
    private double y=10;

    //box Value
    private double w=90;
    private double h=30;

    //Scale
    private int scale=200;
    private int hiScale=150;
    private boolean consumer;

    public SimpleLabelChain(XScheduler sc,boolean consumer)
                {
                    this.sc=sc; this.consumer=consumer;
                }

    private void runWithArrow(String runableN[],int row)
        {
            double offset=y +(row*hiScale)+5;
            String runableName[]=runableN;



            for (int i=0;i<runableN.length;i++)
            {
                gc.setFill(Color.GRAY);
                if(i!=runableN.length-1)
                {
                    gc.setStroke(Color.BLACK);
                    gc.setLineWidth(5);
                    gc.strokeLine((x+w+(i*scale)),offset+15,x+w+(i*scale)+(scale-w),offset+15);

                    gc.strokeLine((x+w+(i*scale))+((scale-w))*0.33,offset+8,(x+w+(i*scale)),offset+15);
                    gc.strokeLine((x+w+(i*scale))+((scale-w))*0.33,offset+22,(x+w+(i*scale)),offset+15);



                }
                if (i==0)
                    {
                        gc.setFill(Color.GREEN);

                    }
                gc.fillRect(x+(i*scale),offset,w,h);

                gc.setStroke(Color.BLACK);
                gc.setLineWidth(1);
                gc.strokeText(runableName[i], (x+(i*scale)), offset+h+15,scale-5);
            }
        }
    private void runWithSync(String[] runableN, int row, LinkedList<String> varChange)
        {
            double offset=y +(row*hiScale)+5;
            String runableName[]=runableN;
            Iterator <String> val=varChange.iterator();
            String []tmpArr;
            int runOffset;

            for (int i=0;i<runableN.length;i++)
            {

                gc.setFill(Color.GRAY);
                if(i!=runableN.length )
                {
                    gc.setStroke(Color.BLACK);
                    gc.setLineWidth(3);
                    if(i!=runableN.length-1 )
                        {
                            gc.strokeLine((x+(w/2)+(i*scale)  ),offset-11,(x+w+(i*scale)+(scale-w) +(w/2)) ,offset-11);
                        }
                    gc.strokeLine((x+(w/2)+(i*scale)  ),offset-11,(x+(w/2)+(i*scale)) ,offset);


                    //gc.strokeLine((x+w+(i*scale))+((scale-w))*0.33,offset+8,(x+w+(i*scale)),offset+15);
                    //gc.strokeLine((x+w+(i*scale))+((scale-w))*0.33,offset+22,(x+w+(i*scale)),offset+15);



                }
                if (i==0)
                    {
                        if (consumer){
                            gc.setFill(Color.BLUE);
                        }
                        else {
                            gc.setFill(Color.RED);
                        }


                    }
                gc.fillRect(x+(i*scale),offset,w,h);

                gc.setStroke(Color.BLACK);
                gc.setLineWidth(1);
                gc.strokeText(runableName[i], (x+(i*scale)), offset+h+15,scale-5);

                if (i!=0  && val.hasNext())
                    {
                        gc.setStroke(Color.BLUE);
                        tmpArr =val.next().split(",");
                        runOffset=0;
                        for (String st:tmpArr)
                            {
                                //gc.strokeText(st, (x+(i*scale))+(w/2), offset+h+30+(runOffset*10),scale-5);
                                if (runOffset>3){
                                    gc.strokeText("("+(tmpArr.length-(runOffset+1))+" more)", (x+(i*scale)), offset+h+30+(runOffset*15));
                                    break;
                                }
                                gc.strokeText(st, (x+(i*scale)), offset+h+30+(runOffset*15),scale);
                                runOffset++;
                            }

                        //gc.strokeText("var2", (x+(i*scale))+(w/2), offset+h+45,scale-5);
                    }

            }
        }
    private void runSync(String[] runableN, int row, String sel, LinkedList<String> varChange)
        {
            if (runableN!= null && runableN.length>0&& sel!= null && row>=0)
            {

            String runableName[]=runableN;
            String []arr = new String[runableName.length+1];
            arr[0]=sel;
            for (int i=1;i<arr.length;i++)
            {
                arr[i]=runableName[i-1];
            }

                runWithSync(arr,row,varChange);
            }
        }
    private void prepare(String sel)
        {
            elements=sc.getTasks().size();
            Iterator<XTasks> it =    sc.getTasks().iterator();
            int rows=0;
            int maxElements=0;

            LinkedList <String[]> list =new LinkedList<>();
            LinkedList <LinkedList <String>> varList =new LinkedList<>();
            LinkedList <String>   nameList=new LinkedList<>();
            XTasks xs,xxs;
            HashMap<String, XTasks> xmp;
            Iterator<String>  iterator;

            while (it.hasNext())
                {
                    xs=it.next();

                    if (consumer){
                        xmp = xs.getConsumer();
                    }
                    else {
                        xmp = xs.getProducer();
                    }

                    if (xmp.size()>0) {
                        list.add(new String[xmp.size()]);
                        varList.add(new LinkedList<>());

                        nameList.add(xs.getName());
                        if (xmp.size() > maxElements)
                        {
                            maxElements = xmp.size();
                        }

                        iterator = xmp.keySet().iterator();

                        for (int i = 0; iterator.hasNext(); i++)
                        {
                            xxs=xmp.get(iterator.next());
                            if (consumer){
                                varList.getLast().add("");
                            }
                            else {
                                varList.getLast().add(XUtil.compareTasks(xs,xxs));
                            }


                            list.get(rows)[i] = xxs.getName();
                            System.out.println(xs.getName() + " - > " + list.get(rows)[i] + " " + " " + (i + 1) + " /" + xmp.size()+" ==> "+varList.getLast().getLast());

                        }


                        rows++;
                    }
                }

            maxElements++;
            if (sel!=null){
                canvas=new Canvas(maxElements*scale, hiScale);
            }
            else {
                canvas=new Canvas(maxElements*scale, hiScale*rows);
            }

            gc = canvas.getGraphicsContext2D();

            Iterator<String[]>  itRun= list.iterator();

            System.out.println("list: "+list.size() +" rows: "+rows+"  varlist: "+varList.size());
            for (int i=0;itRun.hasNext() && list.size()==varList.size() ;i++)
                {
                    if (sel!=null&& nameList.get(i).compareTo(sel)==0)
                    {
                        runSync( itRun.next(), 0 , nameList.get(i), varList.get(i));
                        System.out.println("found :_> "+sel);
                        break;
                    }
                    else if  (sel!=null&& nameList.get(i).compareTo(sel)!=0){
                        System.out.println("Skip");
                        itRun.next();
                    }
                    else {
                        System.out.println("ohne");
                        runSync( itRun.next(), i , nameList.get(i), varList.get(i));
                    }


                }

        }

    @Override
    public Canvas getCanvas() {
        prepare(null);
        return canvas;
    }
    public Canvas getCanvas(String task) {
        prepare(task);
        return canvas;
    }

}
