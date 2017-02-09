package org.eclipse.app4mc.multicore.openmapping.algorithms.helper;

import java.util.HashMap;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.ConsoleOutputHandler;

public class ProblemGraph {
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");
	private final Amalthea model;
	private List<OMTask> taskList;
	private List<OMCore> coreList;
	private HashMap<OMTask, OMCore> validCores = new HashMap<OMTask, OMCore>();
	private HashMap<OMTask, OMCore> invalidCores = new HashMap<OMTask, OMCore>();

	public ProblemGraph(final Amalthea model) {
		this.model = model;
	}
	
	public boolean initialize() {
		// Fetch tasks
		if (null == (this.taskList = ListBuilder.getTaskList(model.getSwModel()))) {
			this.con.append("Error during Task generation, exiting.");
			return false;
		}
		
		// Create Task-Graph
		// TODO Not yet implemented. 
		
		// Fetch cores
		if (null == (this.coreList = ListBuilder.getCoreList(model.getHwModel()))) {
			this.con.append("Error during Task generation, exiting.");
			return false;
		}

		ConstraintBuilder cb = new ConstraintBuilder();
		if(false == cb.fetchAllocationConstraints(this.taskList, this.coreList)) {
			this.con.append("Error during Task generation, exiting.");
			return false;
		}
		this.validCores = cb.getValidCores();
		this.invalidCores = cb.getInvalidCores();
		// 
		return true;
	}
	
	public List<OMTask> getTaskList() {
		return taskList;
	}

	public List<OMCore> getCoreList() {
		return coreList;
	}
	
	public HashMap<OMTask, OMCore> getValidCores() {
		return this.validCores;
	}
	
	public HashMap<OMTask, OMCore> getInvalidCores() {
		return this.invalidCores;
	}

}
