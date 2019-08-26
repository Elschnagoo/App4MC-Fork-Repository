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

package org.eclipse.app4mc.multicore.execution.logic.executionmodel.types;

import java.util.LinkedList;
import java.util.List;

public class EMTask  {
	
	private List<EMTaskHistState> history= new LinkedList<>();
	
	public static class DeadlineEntry{
		public final long time;
		public final EMCore core;
		
		public DeadlineEntry(long time,EMCore core){
			this.time=time;
			this.core=core;
		}
	}
	
	private List<DeadlineEntry> missedDeadlines = new LinkedList<>();
	
	private final String name;
	
	public EMTask(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public List<EMTaskHistState> getStateHistory() {
		return history;
	}
	

	public List<DeadlineEntry> getMissedDeadlines() {
		return missedDeadlines;
	}

	
	



}
