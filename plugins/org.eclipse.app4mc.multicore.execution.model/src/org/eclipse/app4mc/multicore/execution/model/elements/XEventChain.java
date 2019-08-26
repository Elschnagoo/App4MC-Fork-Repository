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
package org.eclipse.app4mc.multicore.execution.model.elements;

import java.util.HashMap;
import java.util.LinkedList;

public class XEventChain extends LinkedList<XEventElement>
{
    private XScheduler scheduler;
    private  LinkedList <String> orderlist;
    private HashMap <String,XEventElement> lastFinish=new HashMap<>();
    private HashMap <String,XEventElement> lastPromFinish=new HashMap<>();
    private HashMap <String,LinkedList<XEventElement>> fullrun=new HashMap<>();

    public XEventChain(XScheduler scheduler) {
        super();
        orderlist=new LinkedList<>();
        fullrun=new HashMap<>();
        this.scheduler = scheduler;
    }

    public XScheduler getScheduler() {
        return scheduler;
    }
    public void betterAdd(XEventElement element){

        switch (element.getStatus()){
            default:
                break;
            case 0:
            case 1:
            case 2:
                this.add(element);
            break;
        }

        if (fullrun.get(element.getTasks().getName())==null) {
            fullrun.put(element.getTasks().getName(),new LinkedList<>());
        }
        fullrun.get(element.getTasks().getName()).add(element);
    }
    public LinkedList<XEventElement> getFullList(String task){
        return this.fullrun.get(task);
    }
    public int getIndexOf(String s)
        {
            if (orderlist.size()>0)
                {
                    for (int i=0;i<orderlist.size();i++)
                        {
                            if (orderlist.get(i).compareTo(s)==0)
                                {
                                    return i;
                                }
                        }
                        }
            return -1;
        }
    public int getIndexxOf(XEventElement ob)
        {
            ;
        LinkedList <XEventElement> list=fullrun.get(ob.getTasks().getName());


            return  list.indexOf(ob);
        }

    public void addSort(String s)
        {
            this.orderlist.add(s);
        //    System.out.println("Add" +s+" "+scheduler.getName());
        }


    public void addReplaceFinish(XEventElement el)
        {

      //     XUtil.writeToLog("Update "+el.getName());

           if (lastFinish.get(el.getName())==null){
               lastFinish.put(el.getName(),el);
       //        System.out.println("Update "+el.getName());
           }
           else {
               if (lastPromFinish.get(el.getName())==null){
                   lastPromFinish.put(el.getName(), lastFinish.get(el.getName()));
               }
               else{
                   lastPromFinish.replace(el.getName(), lastFinish.get(el.getName()));
               }
               lastFinish.replace(el.getName(),el);

   //            System.out.println("Replace "+el.getName());
           }

        }
    public XEventElement getLastFinish(String key)
        {
            return lastFinish.get(key);
        }
    public XEventElement getLastPrmFinish(String key)
    {
        return lastPromFinish.get(key);
    }
    public void printList()
        {
         //   System.out.println("#######################");
            for (XEventElement et:
                    this
            ) {
    ////        System.out.println("#");
                ////           System.out.println("# "+et.getName()+" "+et.getStatus());
                //            System.out.println("#");


            }
            //       System.out.println("# size: "+this.size());
            //     System.out.println("#######################");

        }

}


