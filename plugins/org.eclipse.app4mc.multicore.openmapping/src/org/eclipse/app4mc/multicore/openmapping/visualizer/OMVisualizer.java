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

package org.eclipse.app4mc.multicore.openmapping.visualizer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;

import org.eclipse.app4mc.multicore.openmapping.model.OMAllocation;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMMapping;

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
			final String tasks = String.format("%3d", e.getValue().getTasksSize());
			final String runnables = String.format("%4d", e.getValue().getScheduledRunnableCount());
			final String utilization = drawUtilizationBar(e.getValue().getComputationTime(),
					lMaxComputationTime.getAsLong());
			final String cycles = String.format("%-,15d", e.getValue().getScheduledInstructionCount());
			final String percentage = String.format("(%3d%%)",
					(int) (100.0 / lMaxComputationTime.getAsLong() * e.getValue().getComputationTime()));
			final String compurationTime = String.format("%,19.5f µs",
					e.getValue().getComputationTime() / (1000.0 * 1000.0));
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
			// Check if core has been processed before
			if (!this.allCores.containsKey(core)) {
				final CoreElement c = new CoreElement(allocation.getCore());
				c.addAllocation(allocation);
				this.allCores.put(core, c);
			}
			else {
				final CoreElement c = this.allCores.get(core);
				c.addAllocation(allocation);
			}
		}
	}

	private class CoreElement {
		List<OMAllocation> allocations = new LinkedList<OMAllocation>();
		long iScheduledInstructionCount = -1;
		long iScheduledRunnableCount = -1;
		// Computation time is in milliseconds (ms)
		long iComputationTime = -1;

		CoreElement(final OMCore core) {
		}

		public void addAllocation(final OMAllocation allocation) {
			this.allocations.add(allocation);
		}

		public int getTasksSize() {
			return this.allocations.size();
		}

		public long getScheduledInstructionCount() {
			if (0 > this.iScheduledInstructionCount) {
				this.iScheduledInstructionCount = (long) Math.ceil(this.allocations.parallelStream()
						.mapToDouble((a) -> (double) a.getTask().getInstructionCount() / (double) a.getTask().getRecursionFactor()).sum());
			}
			return this.iScheduledInstructionCount;
		}

		public long getScheduledRunnableCount() {
			if (0 > this.iScheduledRunnableCount) {
				this.iScheduledRunnableCount = this.allocations.parallelStream().mapToLong((a) -> a.getTask().getRunnableCount()).sum();
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
				this.iComputationTime = this.allocations.parallelStream().mapToLong((a) -> a.calculateProcessingTime()).sum();
			}
			return this.iComputationTime;
		}
	}
}
