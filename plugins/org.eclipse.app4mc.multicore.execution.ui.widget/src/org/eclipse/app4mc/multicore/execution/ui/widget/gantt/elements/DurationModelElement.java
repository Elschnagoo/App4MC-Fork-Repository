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

public class DurationModelElement {
	
	/**Start time*/
	private  long start;
	/**Label describing the event*/
	private  String label;
	/**Duration of the event*/
	private  double duration;
	
	
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


	public void setStart(long start) {
		this.start = start;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}
}
