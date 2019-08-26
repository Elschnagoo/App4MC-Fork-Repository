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

import org.eclipse.app4mc.amalthea.model.Label;

public class XLabel
{
    private String name;
    private long size;
    public XLabel (Label label)
        {
                   this.name=label.getName();
                   try {
                           this.size= label.getSize().getNumberBytes();
                       }
                       catch (Exception e){
                           this.size=-1;
                       }



        }
    public String getName()
        {
            return name;
        }
    public long getSizeInBytes(){
        return size;
    }
}
