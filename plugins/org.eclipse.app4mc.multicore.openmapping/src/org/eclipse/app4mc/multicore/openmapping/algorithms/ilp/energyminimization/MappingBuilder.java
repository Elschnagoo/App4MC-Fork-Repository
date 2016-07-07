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
package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CoreAllocation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.RunnableAllocation;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.ojalgo.optimisation.Variable;

public class MappingBuilder {
	private final List<VoltageLevel> lVoltageLevels = new LinkedList<VoltageLevel>();
	private final List<SimpleEntry<AdvancedCore, AdvancedRunnable>> mRunToCore = new LinkedList<SimpleEntry<AdvancedCore, AdvancedRunnable>>();
	private final List<SimpleEntry<ExtendedCore, Scheduler>> mCoreToScheduler = new LinkedList<SimpleEntry<ExtendedCore, Scheduler>>();
	private final Map<AdvancedCore, Long> mCoreUtilizationOrig = new HashMap<AdvancedCore, Long>();
	private final Map<AdvancedCore, Long> mCoreUtilizationReal = new HashMap<AdvancedCore, Long>();
	private final Map<AdvancedCore, Long> mCoreUtilizationSlower = new HashMap<AdvancedCore, Long>();
	private final AmaltheaFactory mmInstance = AmaltheaFactory.eINSTANCE;
	private final AmaltheaFactory commonInstance = AmaltheaFactory.eINSTANCE;
	private MappingModel mappingModel = null;
	private long lMaxUtil;
	private String sAllocation;
	private String sBarChart;
	private String sSlowDown;


	public void addRunnableToCore(final AdvancedCore c, final AdvancedRunnable r) {
		this.mRunToCore.add(new SimpleEntry<AdvancedCore, AdvancedRunnable>(c, r));
	}

	public void generateMapping() {
		generateMappingModel();
		generateAllocationString();
		generateBarChart();
		generateSlowDownText();
	}

	private void generateSlowDownText() {
		this.sSlowDown = "\nIncrease in execution time due to lower VoltageLevels:\n";
		for (final Entry<AdvancedCore, Long> entry : this.mCoreUtilizationReal.entrySet()) {
			this.sSlowDown += " " + entry.getKey().getCore().getName() + ":\t";
			final long origVal = this.mCoreUtilizationOrig.get(entry.getKey());
			final long realVal = entry.getValue();
			this.sSlowDown += String.format("+ %.5f", ((100.0 / origVal * realVal) - 100)) + "%\n";
		}

		this.sSlowDown += "\nInstructions running at lower VoltageLevels:\n";
		for (final Entry<AdvancedCore, Long> entry : this.mCoreUtilizationSlower.entrySet()) {
			this.sSlowDown += " " + entry.getKey().getCore().getName() + ":\t";
			final long origVal = this.mCoreUtilizationOrig.get(entry.getKey());
			final long realVal = entry.getValue();
			this.sSlowDown += String.format("+ %.5f", (100.0 / origVal * realVal)) + "%\n";
		}

	}

	private void generateMappingModel() {
		// Create "orig" MappingModel
		this.mappingModel = this.mmInstance.createMappingModel();

		for (final SimpleEntry<ExtendedCore, Scheduler> entry : this.mCoreToScheduler) {
			final CoreAllocation ca = this.mmInstance.createCoreAllocation();
			final ExtendedCore c = entry.getKey();
			final Scheduler s = entry.getValue();
			try {
				ca.setScheduler(s);
				ca.getCore().add(c.getCore());
				this.mappingModel.getCoreAllocation().add(ca);
			}
			catch (final Exception e) {
				e.printStackTrace();
			}
		}

		final VoltageLevel vlBest = this.lVoltageLevels.get(0);
		// Add runnable allocations
		for (final SimpleEntry<AdvancedCore, AdvancedRunnable> entry : this.mRunToCore) {
			final AdvancedCore c = entry.getKey();
			final AdvancedRunnable r = entry.getValue();
			long leftCycles = r.getNumberOfInstructions();

			// Prepare Utilization map
			final long tmpCycles;
			if (this.mCoreUtilizationOrig.containsKey(c)) {
				tmpCycles = this.mCoreUtilizationOrig.get(c) + leftCycles;
			}
			else {
				tmpCycles = leftCycles;
			}
			this.mCoreUtilizationOrig.put(c, tmpCycles);

			long tmpProcCycles = 0;
			if (this.mCoreUtilizationReal.containsKey(c)) {
				tmpProcCycles = this.mCoreUtilizationReal.get(c);
			}

			long slowerCycles = 0;
			if (this.mCoreUtilizationSlower.containsKey(c)) {
				slowerCycles = this.mCoreUtilizationSlower.get(c);
			}

			// Iterate over all Voltage levels and determine the resp no of
			// instructions
			final RunnableAllocation ra = this.mmInstance.createRunnableAllocation();
			ra.setEntity(r.getRunnableRef());
			ra.setScheduler(c.getScheduler());
			// Add the voltage levels for each runnable
			final Iterator<Entry<VoltageLevel, Variable>> itVols = r.getVarNuis().entrySet().iterator();
			while (itVols.hasNext()) {
				final Entry<VoltageLevel, Variable> e = itVols.next();
				final String vlName = e.getKey().getName();
				final long vlCycles = e.getValue().getValue().longValue();
				leftCycles -= vlCycles;
				final LongObject v = this.commonInstance.createLongObject();
				v.setValue(vlCycles);
				ra.getCustomProperties().put("EnEf-VoltageLevel_" + vlName, v);
				getMappingModel().getRunnableAllocation().add(ra);
				// Update value of the "real" proc. cycles it takes
				tmpProcCycles += Math.round(vlCycles / e.getKey().getScale());
			}
			// Add missing entry for highest voltage level
			final LongObject v = this.commonInstance.createLongObject();
			v.setValue(leftCycles);
			ra.getCustomProperties().put("EnEf-VoltageLevel_" + vlBest.getName(), v);
			// Store entry
			getMappingModel().getRunnableAllocation().add(ra);
			// System.out.println("LAST " + vlBest.getName() + "/" +
			// r.getRunnableRef().getName());

			// Update the number of really required processor cycles
			tmpProcCycles += Math.round(leftCycles / vlBest.getScale());
			this.mCoreUtilizationReal.put(c, tmpProcCycles);
			this.mCoreUtilizationSlower.put(c, slowerCycles + r.getNumberOfInstructions() - leftCycles);
		}
	}

	private void generateAllocationString() {
		this.sAllocation = "";
		for (final SimpleEntry<AdvancedCore, AdvancedRunnable> entry : this.mRunToCore) {
			final AdvancedCore c = entry.getKey();
			final AdvancedRunnable r = entry.getValue();
			this.sAllocation += "Allocation: '" + r.getRunnableRef().getName() + "' <=> '" + c.getCore().getName()
					+ "'\n";
		}
	}

	private void generateBarChart() {
		this.lMaxUtil = Collections.max(this.mCoreUtilizationReal.values());
		System.out.println(this.lMaxUtil);
		this.sBarChart = "Core (#Runnables) - Utilization                              - Cycles          - Time (round to 5 fig.)\n";
		this.sBarChart += "-------------------------------------------------------------------------------------------------------\n";
		for (final Entry<AdvancedCore, Long> entry : this.mCoreUtilizationReal.entrySet()) {
			final AdvancedCore c = entry.getKey();
			final Long cycles = entry.getValue();
			final double curUtil = 40 / (double) this.lMaxUtil * cycles;
			this.sBarChart += String.format("%-12s %4s - ", c.getCore().getName(), "(" + c.getRunnables().size() + ")");
			int i = 0;
			while (i < 40) {
				if (i < curUtil) {
					this.sBarChart += "X";
				}
				else {
					this.sBarChart += " ";
				}
				i++;
			}

			this.sBarChart += String.format(" - %-,15d - %-,18.5f ms\n", cycles,
					entry.getValue() / entry.getKey().getCyclesPerSecond() * 1000);
			// System.out.println("Core: " + c.getCore().getName());
			// System.out.println("Time: " + entry.getValue() /
			// entry.getKey().getCyclesPerSecond() * 1000);
			// System.out.println("R" + this.mCoreUtilizationReal.get(c) + " O"
			// + this.mCoreUtilizationOrig.get(c));
			// System.out.println("CurUtil" + curUtil);
		}
	}

	public MappingModel getMappingModel() {
		return this.mappingModel;
	}

	public String getAllocation() {
		return this.sAllocation;
	}

	public String getBarChart() {
		return this.sBarChart;
	}

	public String getSlowDownText() {
		return this.sSlowDown;
	}

	public void setVoltageLevels(final List<VoltageLevel> vl) {
		// Improper usage of this method if its called more then once
		assert (0 == this.lVoltageLevels.size());
		this.lVoltageLevels.addAll(vl);
		// Ensure highest voltage level comes first
		Collections.sort(this.lVoltageLevels);
	}

	public void addCoreToSchedulder(final ExtendedCore c, final Scheduler s) {
		this.mCoreToScheduler.add(new SimpleEntry<ExtendedCore, Scheduler>(c, s));
	}
}
