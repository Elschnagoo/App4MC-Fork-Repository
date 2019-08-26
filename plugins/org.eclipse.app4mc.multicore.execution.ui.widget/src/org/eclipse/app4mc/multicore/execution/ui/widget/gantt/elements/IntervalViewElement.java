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

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.FXGanttWidget;

/**
 * Gantt view element representing an interval by drawing a line for the 
 * duration provided by the <code>DurationEventModel</code>. The line 
 * is placed above the section of interest.
 */
public class IntervalViewElement extends ProgressViewElement{

	public IntervalViewElement(String style,DurationModelElement model) {
		super(style,model);

		setStyle( "-fx-border-style: solid inside;"
				+ "-fx-border-width: 2;" + "-fx-border-insets: 5;"
				+ "-fx-border-radius: 5;" + "-fx-border-color: blue;");
	}

	@Override
	protected void updateElement(FXGanttWidget chart) {
		super.updateElement(chart);

		setHeight(getHeight());

		
	}

}
