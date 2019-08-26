/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.multicore.execution.logic.systemproxy;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.EMMultiCoreSystem;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.MultiCoreSystem;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem.SimUtil;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;

import java.util.function.Supplier;

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
