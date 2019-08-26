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
package org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements;

import org.eclipse.app4mc.multicore.execution.ui.widget.tracewidget.TraceWidget;

public abstract class ArrowElement  extends ProgressViewElement{
    TraceWidget.ArrowTooltip  arrowModel;
    public ArrowElement(String style, DurationModelElement model,TraceWidget.ArrowTooltip el) {
        super(style, model); this.arrowModel=el;
    }

    public ArrowElement(String style, DurationModelElement model, TraceWidget.ArrowTooltip el, boolean sel) {
        super(style, model, el, sel);
        this.arrowModel=el;
    }
    public  String getStatistic(){
        return arrowModel.getTask2()+","+arrowModel.getStart();
    }
    public String getParrentTask(){
        return arrowModel.getTask2();
    }

}
