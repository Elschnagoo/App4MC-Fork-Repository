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

public class DurationModelElement {
	
	/**Start time*/
	private final long start;
	/**Label describing the event*/
	private final String label;
	/**Duration of the event*/
	private final double duration;
	
	
	public DurationModelElement(long start,double duration, String label){
		this.start = start;
//		this.label= "Time: "+getStart() + "-"+(getStart()+duration)+" \nInfo: "+ label;
		this.label=label;
		this.duration=duration;
	}
	
	public double getDuration(){
		return duration;
	}
	
	public String getLabel(){
		return label;
	}
	
	public long getStart(){
		return start;
	}
	

}