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
