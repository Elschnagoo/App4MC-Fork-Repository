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
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem;

import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMCore;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMTask;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.SimException;

public class SimUtil {
	
	public static void validateModelForSimulation(OMMapping mapping) throws SimException {
		validateOnlyPeriodicTasks(mapping);
		try {
			validateUtilizationPerCore(mapping);
		} catch (MalformedModelException e) {
			throw new SimException(e.getMessage());
		}
	}
	
	public static void validateOnlyPeriodicTasks(OMMapping model) throws SimException{
		for(OMAllocation alloc:model.getAllocationList()){
			long p =alloc.getTask().getPeriod();
			if(p==0){
				throw new SimException("Non-periodic or unset period at task: " + alloc.getTask().getTaskRef().getName());
			}
		}
	}
	
	/**
	 * Check if every core has a utilization less 100%.
	 * @param model
	 * @return
	 * @throws SimException 
	 * @throws MalformedModelException 
	 */
	public static void validateUtilizationPerCore(OMMapping model) throws SimException, MalformedModelException{
		Map<OMCore,List<OMTask>> tasksPerCore = OMUtil.getCoreTaskMap(model.getAllocationList());
		validateUtilizationPerCore(tasksPerCore);
	}
	
	/**
	 * Check if every core has a utilization less 100%.
	 * @param model
	 * @return
	 * @throws MalformedModelException 
	 */
	public static void validateUtilizationPerCore(Map<OMCore,List<OMTask>> model)throws SimException, MalformedModelException{
		for(OMCore c: model.keySet()){
			double utila =OMUtil.getUtilization(c, model.get(c)); 
			if(utila>1){
//				"Mapping for simulation has at least one core with an utilization greater 1!"
				throw new SimException("Core " + c.getCoreRef().getName() + " has a utilization greater 1 ( " + utila+").");
			}
		}
	}
	
	/**
	 * Scale the passed positive value with roundup.
	 * Example:
	 * <ul>
	 * <li> val = 141; scale = 10 => 15</li>
	 * <li> val = 2611; scale = 1000 => 3</li>
	 * </ul>
	 * @param val Value to scale down (rounding up).
	 * @param scale Divisor for scale down.
	 * @return Scaled down value (rounded up).
	 */
	public static long scaleRoundUp(long val, long scale){
		return val/scale + ((val%scale)!=0?1:0);
	}
}

