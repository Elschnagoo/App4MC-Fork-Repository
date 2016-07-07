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
package org.eclipse.app4mc.multicore.openmapping.visualizer;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;

import org.eclipse.app4mc.multicore.openmapping.model.OMAllocation;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMMapping;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;

public class OMVisualizer {
	private final OMMapping mapping;
	private final Map<OMCore, CoreElement> allCores = new HashMap<OMCore, CoreElement>();

	public OMVisualizer(final OMMapping mapping) {
		this.mapping = mapping;
	}

	public String getASCIIChart() {
		String output;
		if (0 >= this.allCores.size()) {
			fillCache();
		}

		final OptionalLong lMaxComputationTime = this.allCores.values().parallelStream()
				.mapToLong(CoreElement::getComputationTime).max();
		assert null != lMaxComputationTime;
		output = "+---------------------------------------+-------------------------------------------------+-----------------+------------------------+\n";
		output += "| Core              (#Tasks/#Runnables) | Utilization                        (Percentage) | Cycles          | Time (round to 5 fig.) |\n";
		output += "+---------------------------------------+-------------------------------------------------+-----------------+------------------------+\n";
		for (final Map.Entry<OMCore, CoreElement> e : this.allCores.entrySet()) {
			final String name = String.format("%-26s", e.getKey().getCoreRef().getUniqueName());
			final String tasks = String.format("%3d", e.getValue().getTaskList().size());
			final String runnables = String.format("%4d", e.getValue().getScheduledRunnableCount());
			final String utilization = drawUtilizationBar(e.getValue().getComputationTime(),
					lMaxComputationTime.getAsLong());
			final String cycles = String.format("%-,15d", e.getValue().getScheduledInstructionCount());
			final String percentage = String.format("(%3d%%)", (int) (100.0 / lMaxComputationTime.getAsLong() * e
					.getValue().getComputationTime()));
			final String compurationTime = String.format("%,19.5f �s", e.getValue().getComputationTime()
					/ (1000.0 * 1000.0));
			output += String.format("| %s (%s/%s) | %s %s | %s | %s |\n", name, tasks, runnables, utilization,
					percentage, cycles, compurationTime);
		}
		output += "+---------------------------------------+-------------------------------------------------+-----------------+------------------------+\n";
		return output;
	}

	private String drawUtilizationBar(final long lComputationTime, final long lMaxComputationTime) {
		final int maxWidth = 40;
		final double curUtilPercentage = 1.0 / lMaxComputationTime * lComputationTime;
		final int curUtilAbs = (int) (curUtilPercentage * maxWidth);
		String output = "";
		for (int i = 0; i < maxWidth; i++) {
			if (i <= curUtilAbs) {
				output += "X";
			}
			else {
				output += " ";
			}
		}
		return output;
	}

	private void fillCache() {
		assert this.mapping.getAllocationList().size() > 0;
		final Iterator<OMAllocation> itAllocations = this.mapping.getAllocationList().iterator();

		// Fills the list of cores, which are used for the bar-chart
		while (itAllocations.hasNext()) {
			final OMAllocation allocation = itAllocations.next();
			final OMCore core = allocation.getCore();
			final OMTask task = allocation.getTask();
			// Check if core has been processed before
			if (!this.allCores.containsKey(core)) {
				final CoreElement c = new CoreElement(allocation.getCore());
				c.addTask(task);
				this.allCores.put(core, c);
			}
			else {
				final CoreElement c = this.allCores.get(core);
				c.addTask(task);
			}
		}
	}

	private class CoreElement {
		final OMCore coreRef;
		List<OMTask> tasks = new LinkedList<OMTask>();
		long iScheduledInstructionCount = -1;
		long iScheduledRunnableCount = -1;
		// Computation time is in milliseconds (ms)
		long iComputationTime = -1;

		CoreElement(final OMCore core) {
			this.coreRef = core;
		}

		public void addTask(final OMTask task) {
			this.tasks.add(task);
		}

		public List<OMTask> getTaskList() {
			return this.tasks;
		}

		public long getScheduledInstructionCount() {
			if (0 > this.iScheduledInstructionCount) {
				// this.iScheduledInstructionCount = this.tasks.parallelStream().mapToLong(OMTask::getInstructionCount)
				// .sum();
				this.iScheduledInstructionCount = (long) Math.ceil(this.tasks.parallelStream()
						.mapToDouble((t) -> t.getInstructionCount() / t.calcRecursionFactor()).sum());
				// this.iScheduledInstructionCount = (long) Math.ceil(this.tasks.parallelStream()
				// .mapToDouble(OMTask::getRelativeCycles).sum());
				// this.iScheduledInstructionCount = this.tasks.parallelStream().mapToLong((k) ->
				// OMAllocation(k,this).calculateProcessingTime).;
			}
			return this.iScheduledInstructionCount;
		}

		public long getScheduledRunnableCount() {
			if (0 > this.iScheduledRunnableCount) {
				this.iScheduledRunnableCount = this.tasks.parallelStream().mapToLong(OMTask::getRunnableCount).sum();
			}
			return this.iScheduledRunnableCount;
		}

		/**
		 * Returns the computation time of all tasks scheduled on this core
		 *
		 * @return Computation time scaled to piko-Seconds
		 */
		public long getComputationTime() {
			if (0 > this.iComputationTime) {
				// Instructions per Second
				final BigInteger ips = BigInteger.valueOf(getCoreRef().getInstructionsPerSecond());
				// Number of Instructions
				final BigInteger ins = BigInteger.valueOf(getScheduledInstructionCount());
				// Piko-Seconds per Second
				final BigInteger psps = BigInteger.valueOf(1000L * 1000L * 1000L * 1000L);
				final BigInteger computationTime = psps.multiply(ins).divide(ips);

				// TODO Not sure if we will ever reach a number so high, so lets better be prepared.
				this.iComputationTime = computationTime.longValueExact();
			}
			return this.iComputationTime;
		}

		public OMCore getCoreRef() {
			return this.coreRef;
		}
	}
}
