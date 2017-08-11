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
package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.lb;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractILPBasedMappingAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.helper.ListBuilder;
import org.eclipse.app4mc.multicore.openmapping.model.OMAllocation;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMMapping;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.sharelibs.ConsoleOutputHandler;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.ojalgo.OjAlgoUtils;
import org.ojalgo.optimisation.Expression;
import org.ojalgo.optimisation.Optimisation;
import org.ojalgo.optimisation.Variable;
import org.ojalgo.type.context.NumberContext;

public class ILPBasedLoadBalancing extends AbstractILPBasedMappingAlgorithm {
	private List<OMTask> taskList = new ArrayList<OMTask>();
	private List<OMCore> coreList = new ArrayList<OMCore>();
	private final ConsoleOutputHandler con = new ConsoleOutputHandler("OpenMapping Console");

	private Boolean parseConstraints() {
		// Work in progress
		return true;
	}

	@SuppressWarnings("deprecation")
	private Boolean performMappingAlgorithm() {

		final int noCores = this.coreList.size();
		final int noTasks = this.taskList.size();

		// If just one core is available theres no need to run the algorithm
		if (noCores == 1) {
			return mapToFirstCore();
		}

		// Task-Core Assignment: Vars[Task][Core]
		final Variable vars[][] = new Variable[noTasks][noCores];

		// Minimize objective, Z (max execution time minus Z lower 0 --> min Z)
		final Variable z = new Variable("z").integer(false);
		getEbm().addVariable(z);
		final Expression obj = getEbm().addExpression("Objective");
		obj.setLinearFactor(z, 1);
		obj.weight(new BigDecimal(1));
		UniversalHandler.getInstance().logCon("Setting Objective...");
		UniversalHandler.getInstance().logCon(
				" " + obj.getName() + " - " + obj.getLinearFactor(z) + " x " + z.getName() + " = " + z.getValue());

		/*
		 * Allocation Map The allocation of each task to a core will be stored
		 * the Array() vars. For each allocation to a core, an Expression with
		 * the respective execution time on the actual core for each task will
		 * be specified
		 */

		// Process cores
		UniversalHandler.getInstance()
				.logCon("Setting constraints (hint: Z and the upper bound won't be listed here)...");
		// for (final ExtendedCore c : ILPBasedLoadBalancing.coreList) {
		for (final OMCore c : this.coreList) {
			final int coreIndex = this.coreList.indexOf(c);

			// Create constraining expression
			final Expression coreExp = getEbm().addExpression(" Utilization_Core" + coreIndex);
			// coreExp.weight(BigDecimal.valueOf(1));

			// Process tasks
			for (final OMTask t : this.taskList) {
				final int taskIndex = this.taskList.indexOf(t);
				final BigDecimal exCore = BigDecimal.valueOf(new OMAllocation(t, c).calculateProcessingTime());
				final Variable tmp = Variable.makeBinary("map_c" + coreIndex + "_t" + taskIndex);

				getEbm().addVariable(tmp);
				coreExp.setLinearFactor(tmp, exCore);
				vars[taskIndex][coreIndex] = tmp;
				UniversalHandler.getInstance().logCon(coreExp.getName() + " - " + coreExp.getLinearFactor(tmp) + " x "
						+ tmp.getName() + " = " + tmp.getValue());
			}
			coreExp.setLinearFactor(z, -1);
			coreExp.upper(new BigDecimal("0", MathContext.DECIMAL128));
		}

		// Set the limit of assignments for each task to 1 (e.g.
		// Task1@Core1+Task1@Core2+... = 1)
		UniversalHandler.getInstance()
				.logCon("Setting one-task-per-core constraints (hint: bounds wont be listed here)...");
		for (final OMTask tmp : this.taskList) {
			final int taskIndex = this.taskList.indexOf(tmp);
			final Expression assignLimit = getEbm().addExpression(" AssignLimit_Task" + taskIndex);
			// assignLimit.weight(BigDecimal.valueOf(1));
			for (final OMCore cTmp : this.coreList) {
				final int coreIndex = this.coreList.indexOf(cTmp);
				assignLimit.setLinearFactor(vars[taskIndex][coreIndex], 1);
				UniversalHandler.getInstance()
						.logCon(assignLimit.getName() + " - " + assignLimit.getLinearFactor(vars[taskIndex][coreIndex])
								+ " x " + vars[taskIndex][coreIndex].getName() + " = "
								+ vars[taskIndex][coreIndex].getValue());
			}
			assignLimit.level(BigDecimal.valueOf(1));
		}

		// Print some of the predefined settings
		this.con.appendln("ILP solver settings");
		this.con.appendln(" Max gap: " + getEbm().options.mip_gap);
		this.con.appendln(" Max iterations (abort): " + getEbm().options.iterations_abort);
		this.con.appendln(" Max iterations (suffice): " + getEbm().options.iterations_suffice);
		this.con.appendln(" Max time (abort): " + getEbm().options.time_abort);
		this.con.appendln(" Max time (suffice): " + getEbm().options.time_suffice);
		this.con.appendln("Working...");

		// Set the precision and scale
		// TODO It might be nice to change this options in the preferences page.
		// Wrong settings might break the solver though...
		getEbm().options.problem = NumberContext.getGeneral(16, 16);
		// ebm.options.debug(LinearSolver.class);

		// Perform the optimization and output results
		final Optimisation.Result res = getEbm().minimise();

		this.con.appendln("Objective Minimization done!");
		this.con.appendln(" Objective value: " + res.getValue());
		this.con.appendln(" Solution state: " + res.getState().toString());
		this.con.appendln("");

		final OMMapping mapping = generateOMMapping(vars);

		updateModel(mapping);

		this.con.focus();

		return true;
	}

	private OMMapping generateOMMapping(final Variable[][] vars) {
		final OMMapping mapping = new OMMapping();
		// Process the tasks and assign them to the cores schedulers
		for (final OMTask t : this.taskList) {
			// Fetch the Variables holding the mapping data
			final int taskIndex = this.taskList.indexOf(t);
			final Variable allocation[] = vars[taskIndex];
			// Search for the core where this task is assigned to
			for (int i = 0; i < allocation.length; i++) {
				if (allocation[i].getValue().intValue() == 1) { //compareTo(BigDecimal.ONE) == 0) {
					// Create a new ProcessAllocation element and set core &
					// task references
					try {
						final OMCore core = this.coreList.get(i);
						final OMAllocation alloc = new OMAllocation(t, core);
						mapping.addAllocation(alloc);
					}
					catch (final Exception e) {
						// This schouldn't happen at all
						e.printStackTrace();
					}
				}
			}
		}
		return mapping;
	}

	@Override
	public void calculateMapping() {
		final long timeStart, timeStep1, timeStep2, timeStep3, timeStep4;
		final String sVersion = "Using: " + OjAlgoUtils.getTitle() + " " + OjAlgoUtils.getVersion() + " ("
				+ OjAlgoUtils.getDate() + ")";

		this.con.appendln("Performing ILP based Load Balancing");
		this.con.appendln(sVersion);
		// Create lists of Cores and Tasks

		this.con.appendln("Preparing Models...");
		if (!initModels()) {
			this.con.appendln("Error during Model initialization, exiting.");
			return;
		}

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
}
