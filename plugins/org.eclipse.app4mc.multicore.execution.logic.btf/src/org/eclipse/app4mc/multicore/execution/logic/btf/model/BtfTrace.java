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

package org.eclipse.app4mc.multicore.execution.logic.btf.model;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.misc.EMTimeType;

public class BtfTrace {
	/*Header Information*/
	//TODO add additional btf header information
	private String name = "xxx";
	
	private EMTimeType timeScale= EMTimeType.NS;

	private Map<String,BtfEntityType> entityTypeTable = new HashMap<>();
	
	/*Body Information*/
	
	private List<BtfEvent> events= new LinkedList<>();

	public EMTimeType getTimeScale() {
		return timeScale;
	}

	public void setTimeScale(EMTimeType timeScale) {
		this.timeScale = timeScale;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<BtfEvent> getEvents() {
		return events;
	}

	public Map<String,BtfEntityType> getEntityTypeTable(){
		return entityTypeTable;
	}
	
	
}
