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
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.btf.model;

/**
 * Types of an entity on which an event targets on. 
 * Specification: BTF-Specification V 2.1.3
 * @author Tobi
 *
 */
public enum BtfEntityType {
	STIMULUS,
	TASK,
	ISR,
	RUNNABLE,
	INSTRUCTION_BLOCK,
	ECU,
	PROCESSOR,
	CORE,
	SCHEDULER,
	SIGNAL,
	SEMAPHORE,
	SIMULATION;
	
	public static BtfEntityType byTypeID(String id){
		switch (id){
		case "STI":
			return STIMULUS;
		case "T":
			return TASK;
		case "ISR":
			return ISR;
		case "R":
			return RUNNABLE;
		case "IB":
			return INSTRUCTION_BLOCK;
		case "ECU":
			return ECU;
		case "P":
			return PROCESSOR;
		case "C":
			return CORE;
		case "SCHED":
			return SCHEDULER;
		case "SIG":
			return SIGNAL;
		case "SEM":
			return SEMAPHORE;
		case "SIM":
			return SIMULATION;
		default:
			return null;
		}
	}
}
