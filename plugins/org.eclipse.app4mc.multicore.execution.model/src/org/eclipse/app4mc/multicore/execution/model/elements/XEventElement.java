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

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.AbstractGanttViewElement;

public class XEventElement
{
    private String name;
    private XTasks tasks;
    private boolean finish;
    private int status;
    private long start;
    private double duration;
    private AbstractGanttViewElement abstractGanttViewElement;

    public XEventElement(String name, XTasks tasks, boolean finish, int status,  long start, double duration)
    {
        this.name = name;
        this.tasks = tasks;
        this.finish = finish;
        this.status = status;
        this.start=start;
        this.duration=duration;
        this.abstractGanttViewElement=null;
     //   System.out.println("Name: "+name+" Status: "+status+" Fin: "+finish+" "+ "" + start+" "+duration);
    }

    @Override
    public String toString() {
        return "##########EntryView#################\n"+
                "name "+ name+ "\n"+
                " tasks "+tasks.getName() +"\n"+
                " finish "+finish +"\n"+
                " status "+status +"\n"+
                " start "+ start +"\n"+
                " duration "+" "+duration +"\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public XTasks getTasks() {
        return tasks;
    }

    public void setTasks(XTasks tasks) {
        this.tasks = tasks;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getStart() {
        return start;
    }

    public double getDuration() {
        return duration;
    }

    public void setGantElement(AbstractGanttViewElement abstractGanttViewElement) {
        this.abstractGanttViewElement=abstractGanttViewElement;
    }

    public AbstractGanttViewElement getAbstractGanttViewElement() {
        return abstractGanttViewElement;
    }
}
