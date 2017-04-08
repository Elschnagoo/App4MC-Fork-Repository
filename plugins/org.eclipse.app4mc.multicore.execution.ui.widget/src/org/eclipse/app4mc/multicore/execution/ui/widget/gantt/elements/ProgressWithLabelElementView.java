/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements;

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;

import javafx.scene.text.Text;

public class ProgressWithLabelElementView extends ProgressViewElement{
	
	public final static int TEXTMARGIN =2;
	
	final boolean textontop;
	private final Text t;

	public ProgressWithLabelElementView(boolean textontop,String style,DurationModelElement model) {
		super(style,model);
		t = new Text();
		t.setText(model.getLabel().replace("\n", "; "));
		this.textontop=textontop;
		getChildren().addAll(t);
	}
	
	@Override
	protected void updateElement(FXGanttWidget chart) {
		super.updateElement(chart);
		t.setX(0);
		double offs = 0;
		if(!textontop){
			//text in the element
			offs= getHeight();
			if ( t.getLayoutBounds().getWidth()>getWidth()){
				t.setText("");
			}else{
				t.setText(getModel().getLabel());
			}
		}
		t.setY(offs-TEXTMARGIN);

	}

}
