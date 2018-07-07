/**
 ********************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Timing-Architects Embedded Systems GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea._import.atdb.model;

public class Stimulus extends ANameable {

	private long moment = 0;
	private int timeBase = 0;
	
	public Stimulus(String name) {
		this.name = name;
	}
	
	public void setMoment(long moment) {
		this.moment = moment;
	}
	
	public long getMoment() {
		return this.moment;
	}
	
	public void setTimeBase(int timeBase) {
		this.timeBase = timeBase;
	}
	
	public int getTimeBase() {
		return this.timeBase;
	}
}
