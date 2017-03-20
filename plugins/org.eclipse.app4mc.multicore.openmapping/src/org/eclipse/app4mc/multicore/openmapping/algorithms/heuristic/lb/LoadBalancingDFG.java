/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.heuristic.lb;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.helper.ListBuilder;
import org.eclipse.app4mc.multicore.openmapping.model.OMAllocation;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMMapping;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;


public class LoadBalancingDFG extends AbstractMappingAlgorithm {
	private List<OMTask> taskList = new ArrayList<OMTask>();
	private List<OMCore> coreList = new ArrayList<OMCore>();
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	private Boolean parseConstraints() {
		// Work in progress
		return true;
	}

	@Override
	public void calculateMapping() {
		final long timeStart, timeStep1, timeStep2, timeStep3, timeStep4;

		this.con.appendln("Performing heuristic DFG Mapping");
		if (!initModels()) {
			this.con.appendln("Error during Model initialization, exiting.");
			return;
		}
		// Create lists of Cores and Tasks

		// Get list of tasks and calculate their execution time
		timeStart = java.lang.System.nanoTime();
		this.con.appendln("Step 1: Building Task-List...");
		if (null == (this.taskList = ListBuilder.getTaskList(getMergedModel().getSwModel()))) {
			this.con.append("Error during Task generation, exiting.");
			return;
		}
		timeStep1 = java.lang.System.nanoTime();
		this.con.appendln(" Success! (" + (timeStep1 - timeStart) / 1000000 + "ms)");

		// Get list of cores and calculate their performance
		this.con.appendln("Step 2: Building Core-List...");
		if (null == (this.coreList = ListBuilder.getCoreList(getMergedModel().getHwModel()))) {
			this.con.appendln("Error during Core generation, exiting.");
			return;
		}
		timeStep2 = java.lang.System.nanoTime();
		this.con.appendln(" Success! (" + (timeStep2 - timeStep1) / 1000000 + "ms)");

		this.con.appendln("Step 3: Determining Constraints and narrowing down the solution space... ");
		// Any Constraints set?
		if (!hasConstraints()) {
			this.con.appendln(" There are no propertyConstraints set, skipping this step.");
			timeStep3 = java.lang.System.nanoTime();
		}
		else {
			if (!parseConstraints()) {
				this.con.appendln("Error during constrain analysis, exiting.");
				return;
			}
			timeStep3 = java.lang.System.nanoTime();
			this.con.appendln(" Success! (" + (timeStep3 - timeStep2) / 1000000 + "ms)");
		}

		// Perform the actual Mapping
		this.con.appendln("Step 4: Creating Mapping...");
		if (!performMappingAlgorithm()) {
			this.con.appendln("Error during performMappingAlgorithm, exiting.");
			return;
		}
		timeStep4 = java.lang.System.nanoTime();
		this.con.appendln("Success after " + (timeStep4 - timeStep3) / 1000000 + "ms.");
		this.con.appendln("Leaving mapping algorithm.");
	}

	private boolean performMappingAlgorithm() {
		final Map<OMCore, Long> coreLoad = new HashMap<OMCore, Long>();
		final OMMapping hMapping = new OMMapping();

		// If just one core is available theres no need to run the algorithm
		if (this.coreList.size() == 1) {
			return mapToFirstCore();
		}

		// Sort tasks and cores according to their complexity/performance
		UniversalHandler.getInstance().logCon("Sorting...");
		Collections.sort(this.taskList, new SortTasks());
		Collections.sort(this.coreList, new SortCores());

		for (final OMTask task : this.taskList) {
			OMCore targetCore = null;
			long minLoad = 0;
			for (final OMCore core : this.coreList) {
				final long taskLoad = new OMAllocation(task, core).calculateProcessingTime();
				final long resultLoad = coreLoad.getOrDefault(core, 0l) + taskLoad;

				if (targetCore == null || resultLoad < minLoad) {
					UniversalHandler.getInstance().logCon("+     Setting this core as Target!");
					minLoad = resultLoad;
					targetCore = core;
				}
			}
			if (targetCore != null) {
				coreLoad.put(targetCore, minLoad);
				final OMAllocation allocation = new OMAllocation(task, targetCore);
				hMapping.addAllocation(allocation);
			}
		}

		updateModel(hMapping);

		return true;
	}

	private class SortTasks implements Comparator<OMTask> {
		public SortTasks() {
		}

		@Override
		public int compare(final OMTask o1, final OMTask o2) {
			if (o1.getInstructionCount() == o2.getInstructionCount()) {
				return 0;
			}
			if (o1.getInstructionCount() < o2.getInstructionCount()) {
				return 1;
			}
			return -1;
		}
	}

	private class SortCores implements Comparator<OMCore> {
		public SortCores() {
		}

		@Override
		public int compare(final OMCore o1, final OMCore o2) {
			if (o1.getInstructionsPerSecond() == o2.getInstructionsPerSecond()) {
				return 0;
			}
			if (o1.getInstructionsPerSecond() < o2.getInstructionsPerSecond()) {
				return 1;
			}
			return -1;
		}

	}

}
