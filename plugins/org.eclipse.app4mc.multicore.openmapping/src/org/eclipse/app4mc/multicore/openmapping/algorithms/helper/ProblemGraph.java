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

import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;

import com.google.common.collect.HashMultimap;

public class ProblemGraph {
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");
	ConstraintBuilder cb;
	private final Amalthea model;
	private List<OMTask> taskList;
	private List<OMCore> coreList;

	public ProblemGraph(final Amalthea model) {
		this.model = model;
	}
	
	public boolean initialize() {
		// Fetch tasks
		OMTask.init();
		if (null == (this.taskList = ListBuilder.getTaskList(model.getSwModel()))) {
			this.con.append("Error during TaskList generation, exiting.");
			return false;
		}
		
		// Create Task-Graph
		// TODO Not yet implemented. 
		
		// Fetch cores
		if (null == (this.coreList = ListBuilder.getCoreList(model.getHwModel()))) {
			this.con.append("Error during CoreList generation, exiting.");
			return false;
		}

		cb = new ConstraintBuilder();
		if(false == cb.fetchAllocationConstraints(this.taskList, this.coreList)) {
			this.con.append("Error during Constraint generation, exiting.");
			return false;
		}
		return true;
	}
	
	public List<OMTask> getTaskList() {
		return taskList;
	}

	public List<OMCore> getCoreList() {
		return coreList;
	}
	
	public HashMultimap<OMTask, OMCore> getValidAllocationMap() {
		return cb.getValidAllocationMap();
	}
	
	public Set<OMCore> getValidAlocationTargets(OMTask task) {
		return cb.getValidAlocationTargets(task);
	}
}
