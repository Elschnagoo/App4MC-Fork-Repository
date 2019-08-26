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

import java.util.LinkedList;

public class XScheduler
{
   private LinkedList <XTasks> tasks;
   private XCore core;
   private String name;

   public XScheduler(String name, XCore core){
            tasks=new LinkedList<>();
            //System.out.println("Add Scaduler "+name+" "+core.getName());
            this.core=core;
            this.name=name;
        }

    public XScheduler() {

    }

    public void add(XTasks task)
        {
            tasks.add(task);
        }
    public int size()
        {
            return tasks.size();
        }
    public String getName()
        {
            return this.name;
        }


    public LinkedList<XTasks> getTasks() {
        return tasks;
    }

    public XCore getCore() {
        return core;
    }
}
