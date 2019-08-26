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

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.algo.CooperativeEDFAlgo;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.algo.PreemptiveEDFAlgo;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.algo.PreemptiveRMSAlgo;

/**
 * Class referencing all known scheduling-algorithms by name and the factory (through java-funcional-interface supplier).
 * Class is used by the user-interface to provide configurable scheduling.
 */
public class SchedulerAlgorithmRegister {
	
	static Map<String,Supplier<ISchedulerAlgorithm>> factoryMap = new HashMap<>();
	static{
		factoryMap.put("Cooperative EDF", SchedulerAlgorithmRegister::createCooperativeEDF);
		factoryMap.put("Preemptive RMS", SchedulerAlgorithmRegister::createPreemptiveRMS);
		factoryMap.put("Preemptive EDF", SchedulerAlgorithmRegister::createPreemptiveEDF);
	}
	
	public static void update(String name,Supplier<ISchedulerAlgorithm> algoFactory){
		factoryMap.put(name, algoFactory);
	}
	
	public static String[] schedulerList(){
		return factoryMap.keySet().toArray(new String[factoryMap.keySet().size()]);
	}
	
	public static ISchedulerAlgorithm create(String name){
		Supplier<ISchedulerAlgorithm> sup = schedulerFactoryByName(name);
		if(sup!=null){
			return sup.get();
		}
		return null;
	}
	
	public static Supplier<ISchedulerAlgorithm> schedulerFactoryByName(String name){
		return factoryMap.get(name);
	}
	
	public static ISchedulerAlgorithm createCooperativeEDF(){
		return new CooperativeEDFAlgo();
	}
	
	public static ISchedulerAlgorithm createPreemptiveRMS(){
		return new PreemptiveRMSAlgo();
	}
	
	public static ISchedulerAlgorithm createPreemptiveEDF(){
		return new PreemptiveEDFAlgo();
	}
}
