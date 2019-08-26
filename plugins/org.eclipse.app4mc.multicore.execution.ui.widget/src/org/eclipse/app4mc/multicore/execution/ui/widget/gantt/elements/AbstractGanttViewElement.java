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


import org.eclipse.app4mc.multicore.execution.model.elements.XEventElement;
import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;

import javafx.scene.layout.Region;

public abstract class AbstractGanttViewElement extends Region{
	private String style;
	private XEventElement ref;


	public AbstractGanttViewElement(String style) {
		this.style=style;
		this.ref=null;

		getStyleClass().add(style);
	}
	public final void update(FXGanttWidget chart,double x, double y){
//		setStyle("-fx-border-color: red;");
		updateElement(chart);
		relocate(x, y);
	}
	
	protected abstract void updateElement(FXGanttWidget chart);
	
	public String getGanttStyle(){
		return style;
	}
	public XEventElement getRef() {
		return ref;
	}

	public void setRef(XEventElement ref) {
		this.ref = ref;
		
		this.ref.setGantElement(this);
		//System.out.print(ref.toString());

	}


}
