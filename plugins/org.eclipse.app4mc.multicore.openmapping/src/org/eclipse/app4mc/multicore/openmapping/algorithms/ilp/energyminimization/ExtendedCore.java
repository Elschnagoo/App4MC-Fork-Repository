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

package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization;

import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;

public class ExtendedCore implements Comparable<ExtendedCore> {
	private ProcessingUnit core;
	private TaskScheduler sched;
	private double frequencyQuartz; // The frequency from the attached quartz
	// element
	private double ratioPrescaler; // The ratio between the quartz' frequency
	// and the the input frequency
	// (i.e. ticks) for a associated core
	private double ticksPerSecond; // How many ticks does the core receive per
	// second
	// (frequencyQuartz * ratioPrescaler)
	private double ticksPerCycle; // How many processor ticks are required to
	// process one execution cycle
	private double cyclesPerSecond; // How many cycles can be processed per
	// second
	// (frequencyQuartz * ratioPrescaler *
	// ticksPerCycle)


	private double relativePerformance; // might be required
	private double load; // load of the core

	public ExtendedCore(final ProcessingUnit core, final boolean debug) {
		UniversalHandler.getInstance().logCon("  Creating Core '" + core.getName() + "'");
		setCore(core);
		fetchFrequency();
	}

	public void fetchFrequency() {
		
// TODO implement
		
//		// Check if prescaler is set
//		final Prescaler ps = this.core.getPrescaler();
//		if (ps == null) {
//			UniversalHandler.getInstance().log("   Unexpected HWModel: Core contains no Prescaler.\nSkipping Core...",
//					null);
//			return;
//		}
//
//		// Check if clockRatio is valid
//		if (ps.getClockRatio() <= 0) {
//			UniversalHandler.getInstance()
//					.log("   Unexpected HWModel: clockRatio in Prescaler must be > 0.\nSkipping Core...", null);
//			this.ratioPrescaler = 1;
//		}
//		else {
//			this.ratioPrescaler = ps.getClockRatio();
//		}
//
//		final Quartz q = ps.getQuartz();
//		if (q == null) {
//			UniversalHandler.getInstance()
//					.log("   Unexpected HWModel: Prescaler has an unset reference to Quartz.\nSkipping Core...", null);
//			return;
//		}
//
//		final ProcessingUnitDefinition ct = this.core.getDefinition();
//		if (ct == null) {
//			UniversalHandler.getInstance()
//					.log("   Unexpected HWModel: Core has an unset reference to CoreType.\nSkipping Core...", null);
//			return;
//		}
//		this.ticksPerCycle = ct.getInstructionsPerCycle();
//		
//		BigDecimal frequency = AmaltheaServices.convertToHz(q.getFrequency());
//
//		this.frequencyQuartz = frequency.doubleValue();
//		this.ticksPerSecond = this.frequencyQuartz * this.ratioPrescaler;
//		this.cyclesPerSecond = this.ticksPerSecond * this.ticksPerCycle;
//		System.out.println("DEBUG::"+this.frequencyQuartz);
//		UniversalHandler.getInstance().logCon(toString());
	}

	@Override
	public int compareTo(final ExtendedCore c) {
		if (this.cyclesPerSecond > c.cyclesPerSecond) {
			return -1;
		}
		if (this.cyclesPerSecond < c.cyclesPerSecond) {
			return 1;
		}
		return 0;
	}

	public ProcessingUnit getCore() {
		return this.core;
	}

	public void setCore(final ProcessingUnit core) {
		this.core = core;
	}

	public double getCyclesPerSecond() {
		return this.cyclesPerSecond;
	}

	public double getTicksPerSecond() {
		return this.ticksPerSecond;
	}

	public double getRelativePerfomance() {
		return this.relativePerformance;
	}

	public void setRelativePerfomance(final double relativePerformance) {
		this.relativePerformance = relativePerformance;
	}

	public double getLoad() {
		return this.load;
	}

	public void setLoad(final double load) {
		this.load = load;
	}

	public TaskScheduler getScheduler() {
		return this.sched;
	}

	public void setScheduler(final TaskScheduler sched) {
		this.sched = sched;
	}

	@Override
	public String toString() {
		String out = "Technical Information for Core '" + getCore().getName() + "'\n";
		out += "Quartz Frequency: " + this.frequencyQuartz + "\n";
		out += "Quartz Prescaler: " + this.ratioPrescaler + "\n";
		out += "Ticks p. Second:  " + this.ticksPerSecond + "\n";
		out += "Ticks p. Cycle:   " + this.ticksPerCycle + "\n";
		out += "Cycles p. Second: " + this.cyclesPerSecond + "\n";
		return out;
	}
}
