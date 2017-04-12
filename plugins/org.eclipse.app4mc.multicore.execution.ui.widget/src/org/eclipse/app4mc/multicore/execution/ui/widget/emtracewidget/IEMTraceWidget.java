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
package org.eclipse.app4mc.multicore.execution.ui.widget.emtracewidget;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;

public interface IEMTraceWidget {
	/**
	 * Add an execution model to the trace widget. 
	 * Previous added data will be displayed and 
	 * if the mentioned add methods of the <code>ExecutionModel</code> class are used to 
	 * populate data to the model the data added in the future will also be displayed.
	 * Therefore the view registers itself as an observer on the <code>ExecutionModel</code> instance.
	 * @param em
	 */
	public void addExecutionModel(ExecutionModel em);
}
