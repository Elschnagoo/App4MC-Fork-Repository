/**
 ********************************************************************************
 * Copyright (c)  2019 Dortmund University of Applied Sciences and Arts and others.
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

package org.eclipse.app4mc.multicore.execution.ui.widget.eventcanves;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class SimpleEventChain implements EventCanvas
{

    private Canvas canvas;
    private int elements;
    GraphicsContext gc;
    String runableName[];

    double x=10;
    double y=10;
    double w=90;
    double h=30;
    int scale=200;



    public SimpleEventChain(String runableName[])
                {
                    this.runableName=runableName;
                    this.elements=runableName.length;
                }

    private void prepare()
        {
            canvas=new Canvas(elements*scale, 150);
            gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.GRAY);

            for (int i=0;i<elements;i++)
            {
                if(i!=elements-1)
                {
                    gc.setStroke(Color.BLACK);
                    gc.setLineWidth(5);
                    gc.strokeLine((x+w+(i*scale)),y+15,x+w+(i*scale)+(scale-w),y+15);

                    gc.strokeLine((x+w+(i*scale))+((scale-w))*0.66,y+8,x+w+(i*scale)+(scale-w),y+15);
                    gc.strokeLine((x+w+(i*scale))+((scale-w))*0.66,y+22,x+w+(i*scale)+(scale-w),y+15);



                }
                gc.fillRect(x+(i*scale),y,w,h);

                gc.setStroke(Color.BLACK);
                gc.setLineWidth(1);
                gc.strokeText(runableName[i], (x+(i*scale)), y+h+15,scale-5);
            }
        }

    @Override
    public Canvas getCanvas() {
        prepare();
        return canvas;
    }

}
