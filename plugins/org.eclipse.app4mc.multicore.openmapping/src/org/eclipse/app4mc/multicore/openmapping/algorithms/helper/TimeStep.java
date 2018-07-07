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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

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
