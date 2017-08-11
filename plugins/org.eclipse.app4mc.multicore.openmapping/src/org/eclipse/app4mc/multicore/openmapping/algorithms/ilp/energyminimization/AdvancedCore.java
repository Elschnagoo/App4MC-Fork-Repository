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
package org.eclipse.app4mc.multicore.openmapping.algorithms.ilp.energyminimization;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Core;

public class AdvancedCore extends ExtendedCore {
	private static long minAvailableTime = 0;
	private static long maxAvailableTime = 0;
	private long availableTime = 0;
	private final List<AdvancedRunnable> lRunnables = new LinkedList<AdvancedRunnable>();
	private long psPerInstruction = -1;

	AdvancedCore(final Core core, final boolean debug) {
		super(core, debug);
	}

	private long calcPsPerInstruction() {
		return Math.round((1.0 / getCyclesPerSecond()) * Math.pow(10, 12)); // 12
	}

	public void setAvailTime(final long at) {
		// Remember the highest value
		if (AdvancedCore.getMaxAvailTime() < at) {
			AdvancedCore.maxAvailableTime = at;
		}
		this.availableTime = at;
	}

	public long getAvailTime() {
		return this.availableTime;
	}

	public void addRunnable(final AdvancedRunnable ar) {
		this.lRunnables.add(ar);
	}

	public List<AdvancedRunnable> getRunnables() {
		return this.lRunnables;
	}

	public long getPsPerInstruction() {
		if (this.psPerInstruction < 0) {
			this.psPerInstruction = calcPsPerInstruction();
		}
		return this.psPerInstruction;
	}

	public static void setMinAvailTime(final long minAvailTime) {
		AdvancedCore.minAvailableTime = minAvailTime;
	}

	public static void resetMaxAvailTime() {
		AdvancedCore.maxAvailableTime = 0;
	}

	public static long getMinAvailTime() {
		return AdvancedCore.minAvailableTime;
	}

	public static long getMaxAvailTime() {
		return AdvancedCore.maxAvailableTime;
	}

	@Override
	public String toString() {
		return super.toString() + "\nps per Instruction:\t" + getPsPerInstruction() + "("
				+ (1.0 / getCyclesPerSecond()) * Math.pow(10, 12) + ") / ("
				+ Math.round((1.0 / getCyclesPerSecond()) * Math.pow(10, 12)) + ")";
	}
}
