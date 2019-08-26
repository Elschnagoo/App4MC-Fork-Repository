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

import org.eclipse.app4mc.amalthea.model.Runnable;

import java.util.LinkedList;

public class XRunnable {

private final int READ=0,WRITE=1;
private LinkedList <XAccess> list;
    private XTasks task;
    private String name;
    public XRunnable(Runnable next)
    {
                list = new LinkedList<>();
                this.name=next.getName();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public XAccess addAccess( int state,XLabel label)
        {
            XAccess out = new XAccess(state, label);
           // System.out.println(state +" "+label.getName());
            list.add(out);
            return  out;
        }
    public int size()
        {
           return list.size();
        }

    public LinkedList<XAccess> getList() {
        return list;
    }

    public XTasks getTask() {
        return task;
    }

    public void setTask(XTasks task) {
        this.task = task;
    }
}
