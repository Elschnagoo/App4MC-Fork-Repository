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


import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;


public class Arrow extends Path{
    private static final double defaultArrowHeadSize = 5.0;

    public Arrow(double startX, double startY, double endX, double endY, Color c, double arrowHeadSize){
        super();
        strokeProperty().bind(fillProperty());
        setFill(c);
        //Line
        getElements().add(new MoveTo(endX, endY));
        //ArrowHead
        double angle = Math.atan2((endY - startY), (endX - startX)) - Math.PI / 2.0;
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        //point1
        double x1 = (- 1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + endX;
        double y1 = (- 1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + endY;
        //point2
        double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + endX;
        double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + endY;

        getElements().add(new LineTo(x1, y1));
        getElements().add(new LineTo(x2, y2));
        getElements().add(new LineTo(endX, endY));
        setStrokeWidth(2);
    }



    public Arrow(double startX, double startY, double endX, double endY){
        this(startX, startY, endX, endY,Color.BLACK, defaultArrowHeadSize);
    }
}