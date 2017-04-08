/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.multicore.execution.logic.systemproxy;

import java.util.function.Supplier;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.EMMultiCoreSystem;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.MultiCoreSystem;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.SimUtil;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;

public class SystemProxyFactory {
	
	
	public static ISystemProxy createSystemProxy(long timeScale, Supplier<ISchedulerAlgorithm> schedulerAlgoFactory){
		return new MultiCoreSystem(timeScale, schedulerAlgoFactory);
	}
	
	
	
	/**
	 * Create system proxy which traces to the provided ExecutionModel. Already added content from the provided ExecutionModel 
	 * will not be considered. Therefore it's advised to pass an empty model.
	 * @param timescale
	 * @param schedulerAlgoFactory
	 * @param m
	 * @return
	 */
	public static ISystemProxy createEMSystemProxy(long timescale,Supplier<ISchedulerAlgorithm> schedulerAlgoFactory,ExecutionModel m){
		return new EMMultiCoreSystem(timescale, schedulerAlgoFactory, m);
	}
	
	
	public static ISystemProxy createEMSystemProxyFromOMMapping(long timescale,Supplier<ISchedulerAlgorithm> schedulerAlgoFactory,OMMapping omMapping,ExecutionModel m) throws SimException {
		
		
		SimUtil.validateModelForSimulation(omMapping);
		
		ISystemProxy sim = createEMSystemProxy( timescale,schedulerAlgoFactory,m);
		for(OMAllocation a:omMapping.getAllocationList()){
			try {
				sim.addTask(a.getCore().getCoreRef().getName(),a.getTask().getTaskRef().getName(),a.calculateProcessingTime(),a.getTask().getPeriod());
			} catch (MalformedModelException e) {
				throw new SimException(e.getMessage());
			}
		}
		return sim;
	}
	
}
