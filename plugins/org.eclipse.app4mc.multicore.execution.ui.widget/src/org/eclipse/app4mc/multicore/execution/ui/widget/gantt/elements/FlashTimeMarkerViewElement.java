/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
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

package org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements;

import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class FlashTimeMarkerViewElement extends ArrowTimeMarkerViewElement {

	public FlashTimeMarkerViewElement(String style,TimeMarkModelElement model) {
		super(style,model);
	}
	
	@Override
	protected Path createPath(double height) {
		Path path = new Path();

		MoveTo moveTo = new MoveTo();
		moveTo.setX(-5);
		moveTo.setY(-7);

		LineTo line1 = new LineTo();
		line1.setX(-2);
		line1.setY(height/2);
		
		LineTo line2 = new LineTo();
		line2.setX(-4);
		line2.setY((height*3)/4);
		
		LineTo line3 = new LineTo();
		line3.setX(0);
		line3.setY(height);
		
		path.getElements().add(moveTo);
		path.getElements().add(line1);
		path.getElements().add(line2);
		path.getElements().add(line3);
		path.setStrokeWidth(4);
		path.setStroke(Color.DARKRED);
		return path;
	}

}
