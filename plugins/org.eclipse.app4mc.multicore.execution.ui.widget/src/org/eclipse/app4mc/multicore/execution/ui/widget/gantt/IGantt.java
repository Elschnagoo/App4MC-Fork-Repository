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

package org.eclipse.app4mc.multicore.execution.ui.widget.gantt;

import org.eclipse.app4mc.multicore.execution.ui.widget.gantt.elements.AbstractGanttViewElement;

public interface IGantt {
	
	public void addCategorie(String categorie);
	
	public void setViewPort(double lower,double upper);
	
	public void moveViewPort(int move);

	public void addEvent(String categorie, long start, AbstractGanttViewElement v);
}
