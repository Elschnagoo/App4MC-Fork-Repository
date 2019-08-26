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

import org.eclipse.app4mc.amalthea.model.Task;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class XTasks {

    private XCore xc;

    private String name;
    private HashMap <String,XTasks> producer=new HashMap<>();
    private HashMap <String,XTasks> consumer=new HashMap<>();

    private HashMap <String,XRunnable> map=new HashMap<>();

    public HashMap<String, XTasks> getProducer() {
        return producer;
    }
    public HashMap<String, XTasks> getConsumer() { return consumer; }

    public void addProducer(XTasks linked) {
        this.producer.put(linked.getName(),linked) ;
    }
    public void addConsumer(XTasks linked) { this.consumer.put(linked.getName(),linked) ; }


    public   XTasks (Task t)
        {

    //        System.out.println("Task Creaded: "+t.getName());
            name=t.getName();
         //prepare(t);
        }
    public   XTasks (Task t,XCore c)
        {
            this.xc=c;

    //        System.out.println("Task Creaded: "+t.getName());
            name=t.getName();
         //prepare(t);
        }



    public void addRunnable(String name,XRunnable run)
        {
                map.put(name,run);
        }

    public int size()
        {
            return map.size();
        }

    public String getName() {
        return name;
    }

    public HashMap<String, XRunnable> getMap() {
        return map;
    }

    public LinkedList<XAccess> getBySel(int sel)
        {
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
            if (sel==0)
                {
                    return read;
                }
            else
                {
                    return write;
                }
        }


}
