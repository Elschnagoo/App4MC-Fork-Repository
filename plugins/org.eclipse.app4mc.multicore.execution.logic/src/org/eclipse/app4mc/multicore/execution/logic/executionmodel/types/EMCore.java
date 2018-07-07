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

package org.eclipse.app4mc.multicore.execution.logic.executionmodel.types;

public class EMCore {
	
	private final String name;
	
//	private long fequency=0; //example additional data
	
	public EMCore(String name){
		this.name = name;
	}
	
	
	public String getName() {
		return name;
	}
	
//	public long getFequency() {
//		return fequency;
//	}
//	
//	public void setFequency(long fequency) {
//		this.fequency = fequency;
//	}
	
}
