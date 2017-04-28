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
package org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc;

public enum EMTimeType {
	NONE(0),
	PS(1),
	NS(1000L),
	US(1000L*1000L),
	MS(1000L*1000L*1000L),
	S(1000L*1000L*1000L*1000L);
	
	
	
	private final long picos;
	
	EMTimeType(final long picos){
		this.picos=picos;
	}
	
	/**
	 * Computes the amount of picoseconds depending on the object.
	 * Example:
	 * EMTimeType.NS.toPicos(2) => 2000 
	 * @param val
	 * @return
	 */
	public long toPicos(long val){
		return val*picos;
	}
	
	/**
	 * Get amount of pico seconds.
	 * @return
	 */
	public long picos(){
		return picos;
	}

}
