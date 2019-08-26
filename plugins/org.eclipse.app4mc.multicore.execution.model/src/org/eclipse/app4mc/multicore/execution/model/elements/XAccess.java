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

import org.eclipse.app4mc.multicore.execution.model.XUtil;

public class XAccess
{
    private  int state;
    private XLabel label;
        XAccess (int state,XLabel label)
            {
                this.state=state;
                this.label=label;
            }

    private void print()
    {
        if (state==0)
            //      System.out.println("read from"+label.getName());
        XUtil.writeToLog("read from"+label.getName());
    }

    public int getState() {
        return state;
    }

    public XLabel getLabel() {
        return label;
    }
}
