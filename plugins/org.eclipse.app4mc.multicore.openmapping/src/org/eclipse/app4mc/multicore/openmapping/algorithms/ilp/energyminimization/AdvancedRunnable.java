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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.ojalgo.optimisation.Variable;

public class AdvancedRunnable extends ExtendedRunnable implements Comparable<AdvancedRunnable> {
	private static long lastIndex = 0;
	final private long index;
	// lFinishTime = min(dl, lFinishTime_succesor - T_succesor)
	private long lFinishTime = -1;
	// Time when all predecessors finished
	private long readyTime = 0;
	private long startTime = 0;
	// earliestStartTime = max(readyTime, min(ProcessorReadyTime))
	// private long earliestStartTime = Integer.MAX_VALUE;
	// Execution time on quickest core
	private long fastestExecTime; // in piko-second accuracy

	private Variable varDu;
	private Variable varNu;
	private final Map<VoltageLevel, Variable> varNui = new HashMap<VoltageLevel, Variable>();

	public AdvancedRunnable(final Runnable ref) {
		super(ref);
		this.index = lastIndex++;
	}

	void setLft(final long lft) {
		assert lft > 0; // TODO DEBUG, Requires handling!
		this.lFinishTime = lft;
	}

	long getLft() {
		return this.lFinishTime;
	}

	void setExecTime(final long psPerInstruction) {
		// The best execution time is based on the exec. cycles divded by
		// the cycles per second
		// The internal "timer" here is based on piko-seconds, hence we need
		// to divide the cycles per second into cycles per piko-second
		// cps / 1000 ^ 4 )
		this.fastestExecTime = getNumberOfInstructions() * psPerInstruction;
		// (cps * Math.pow(10, -12)));
	}

	long getExecTime() {
		return this.fastestExecTime;
	}

	long getPriority() {
		return this.lFinishTime + getEarliestStartTime();
	}

	void setReadyTime(final long readyTime) {
		this.readyTime = readyTime;
	}

	long getReadyTime() {
		return this.readyTime;
	}

	void setStartTime(final long startTime) {
		this.startTime = startTime;
	}

	long getStartTime() {
		return this.startTime;
	}

	// void setEarliestStartTime() {
	// if(this.readyTime < AdvancedCore.getMinAvailTime())
	// this.earliestStartTime = this.readyTime;
	// else
	// this.earliestStartTime = AdvancedCore.getMinAvailTime();
	//
	// // this.earliestStartTime = esTime;
	// }

	long getEarliestStartTime() {
		if (this.readyTime < AdvancedCore.getMinAvailTime()) {
			return this.readyTime;
		}
		return AdvancedCore.getMinAvailTime();
	}

	public Variable getVarDu() {
		return this.varDu;
	}

	public void setVarDu(final Variable du) {
		this.varDu = du;
	}

	public Variable getVarNui(final VoltageLevel v) {
		return this.varNui.get(v);
	}

	public Map<VoltageLevel, Variable> getVarNuis() {
		return this.varNui;
	}

	public void setVarNu(final Variable nu) {
		this.varNu = nu;
	}

	public Variable getVarNu() {
		return this.varNu;
	}

	public void addVarNui(final VoltageLevel v, final Variable nui) {
		this.varNui.put(v, nui);
	}

	public long getIndex() {
		return this.index;
	}

	@Override
	public int compareTo(final AdvancedRunnable ar) {
		if (getPriority() > ar.getPriority()) {
			return 1;
		}
		if (getPriority() < ar.getPriority()) {
			return -1;
		}
		return 0;
	}
}
