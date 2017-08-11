/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.helper;

public class TimeStep {
	volatile private long lastTime;
	
	public TimeStep() {
		lastTime = java.lang.System.nanoTime();
	}
	
	public TimeStep(long now) {
		lastTime = now;
	}
	
	public long getTimeStep(long now) {
		long diff = now - lastTime;
		lastTime = now;
		return diff;
	}
	
	public long getTimeStep() {
		long now = java.lang.System.nanoTime();
		long diff = now - lastTime;
		lastTime = now;
		return diff;
	}
	
	public void update(long now) {
		lastTime = now;
	}
	
	public void update() {
		lastTime = java.lang.System.nanoTime();
	}

}
