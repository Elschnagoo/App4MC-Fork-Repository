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

public class TimeMarkModelElement {
	private final long time;
	private final String label;
	
	public TimeMarkModelElement(long time, String label) {
		super();
		this.time = time;
		this.label = label;
	}

	public long getTime() {
		return time;
	}

	public String getLabel() {
		return label;
	}
	
	
	
	
}
