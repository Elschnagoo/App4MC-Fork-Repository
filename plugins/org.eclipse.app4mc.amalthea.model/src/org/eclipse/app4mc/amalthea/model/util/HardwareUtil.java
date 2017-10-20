/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.AccessPath;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.ComplexNode;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.ECU;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath;
import org.eclipse.app4mc.amalthea.model.LatencyAccessPathElement;
import org.eclipse.app4mc.amalthea.model.LatencyConstant;
import org.eclipse.app4mc.amalthea.model.LatencyDeviation;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.Microcontroller;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;

public class HardwareUtil {

	/**
	 * returns list of all cores in the systems
	 * @param model
	 * @return List<Core>
	 */
	public static List<Core> getCoresInSystem(Amalthea model) {
		ArrayList<Core> results = new ArrayList<>();
		if (model.getHwModel() != null && model.getHwModel().getSystem() != null && model.getHwModel().getSystem().getEcus() != null) {
			
			for (ECU ecu : model.getHwModel().getSystem().getEcus()) {
				if (ecu.getMicrocontrollers()!= null) {
					for (Microcontroller mc :ecu.getMicrocontrollers()) {
						results.addAll(mc.getCores());
					}
				}
			}
		}
		return results;
	}
	
	/**
	 * returns a list of all cores derived from a coreType  
	 * @param model
	 * @param coreType
	 * @return List<Core>
	 */
	public static List<Core> getAllCoresForCoreType(Amalthea model, CoreType coreType) {
		List<Core> coresWithGivenCoreType = new ArrayList<Core>();
		List<Core> coresInSystem = getCoresInSystem(model);
		
		if(coreType == null) {				//null is the key for default values!
			return new ArrayList<Core>();
		}
		
		for(Core core : coresInSystem) {
			if(coreType.equals(core.getCoreType())) {
				coresWithGivenCoreType.add(core);
			}
		}
		
		return coresWithGivenCoreType;
	}
	

	/**
	 * Returns all memories of a model
	 * @param model
	 * @return List<Memory>
	 */
	public static List<Memory> getMemoriesInSystem(Amalthea model)	{
		List<ECU> ecuList = model.getHwModel().getSystem().getEcus();
		List<Memory> memoryList= new ArrayList<Memory>();
		for (ECU ecu : ecuList) {
			List<Microcontroller> ucList = ecu.getMicrocontrollers();
			for (Microcontroller microcontroller : ucList) {
				memoryList.addAll(microcontroller.getMemories());
		        for(Core core : microcontroller.getCores()) {
		        	memoryList.addAll(core.getMemories());
		        }
			}
		}
		return memoryList;
	}
		
	/**
	 * List of all accessPaths from or to a specified hardware node
	 * @param hardware node
	 * @param model
	 * @return List<AccessPath> 
	 */
	public static List<AccessPath> getAccessPathsOfHardwareNode(ComplexNode hardwareNode, Amalthea model) {
		List<AccessPath> result = new ArrayList<AccessPath>(); 
		for (AccessPath accessPath : model.getHwModel().getAccessPaths()) {
//			if (accessPath.getSource().equals(hardwareNode) || accessPath.getTarget().equals(hardwareNode)) {	// 02.05.2017 Anh: update to prevent NullPointerException
			if ((accessPath.getSource() != null && accessPath.getSource().equals(hardwareNode)) 
					|| (accessPath.getTarget() != null && accessPath.getTarget().equals(hardwareNode))) {
				result.add(accessPath);
			}
		}
		return result;
	}
	
	/**
	 * smallest access Latency from complex node to complex node
	 * @param hardware node
	 * @param model
	 * @return long
	 */
	public static long getLatency(ComplexNode source, ComplexNode target, Amalthea model) {
		Map<ComplexNode, List<Long>> accessLatenciesForHardwareNode = getAccessLatenciesForHardwareNode(source, TimeType.WCET, model);
		List<Long> latencies = accessLatenciesForHardwareNode.get(target);
		if(latencies == null) {
			return 0L;
		}
		
		long latency = Long.MAX_VALUE;
		for(Long l : latencies) {
			if(l < latency) {
				latency = l;
			}
		}
		return latency;
	}
	
	/**
	 * 
	 * @param hardware node
	 * @param model
	 * @return List of all LatencyPaths from or to a specified hardware node
	 */
	public static List<LatencyAccessPath> getLatencyAccessPathsOfHardwareNode(ComplexNode hardwareNode, Amalthea model) {
		List<LatencyAccessPath> result = new ArrayList<LatencyAccessPath>();
		for (AccessPath accessPath : getAccessPathsOfHardwareNode(hardwareNode, model)) {
			if (accessPath instanceof LatencyAccessPath) {
				LatencyAccessPath latencyPath =  (LatencyAccessPath) accessPath;
				result.add(latencyPath);
			}
		}
		return result;
	}
	
	/**
	 * returns a map of access latencies from each core to each memory
	 * @param model
	 * @return Map<Core, HashMap<Memory, Long>>
	 */
	public static Map<Core, HashMap<Memory, Long>> getAccessLatencies(Amalthea model)
	{
		Map<Core,HashMap<Memory,Long>> coreMemoryLatency = new HashMap<Core, HashMap<Memory, Long>>();
		HashMap<Memory, Long> memoryLatency = null;
		List<Core> coreList = HardwareUtil.getCoresInSystem(model);
		List<Memory> memoryList = HardwareUtil.getMemoriesInSystem(model);
		
		for(Core core : coreList)
		{
			memoryLatency = new HashMap<>();
			for(Memory memory : memoryList)
			{
				//System.out.println("Core " + core.getName() + "  to memory " + memory.getName());
				long accessLatency = HardwareUtil.getLatency(core, memory, model);		
				if(accessLatency != 0) {
					memoryLatency.put(memory, accessLatency);
					//logger.info("Core " + core.getName() + "  to memory " + memory.getName() + " latency is " + accessLatency.intValue());
				}			
			}
		  coreMemoryLatency.put(core, memoryLatency);
		}
		
		return coreMemoryLatency;
	} 
	
	/**
	 * returns a list of all HwAccessPath from or to a specified hardware node
	 * @param hardware node
	 * @param model
	 * @return List<HwAccessPath>
	 */
	public static List<HwAccessPath> getHardwareAccessPathsOfHardwareNode(ComplexNode hardwareNode, Amalthea model) {
		List<HwAccessPath> result = new ArrayList<HwAccessPath>();
		for (AccessPath accessPath : getAccessPathsOfHardwareNode(hardwareNode, model)) {
			if (accessPath instanceof HwAccessPath) {
				HwAccessPath latencyPath =  (HwAccessPath) accessPath;
				result.add(latencyPath);
			}
		}
		return result;
	}
	
	/**
	 * returns a list of all latencies from or to a specified hardware node - timeType defines the type of latency value (average, BCET, WCET)
	 * @param hardwareNode
	 * @param timeType
	 * @param model
	 * @return Map<ComplexNode, List<Long>>
	 * 
	 */
	public static Map<ComplexNode, List<Long>> getAccessLatenciesForHardwareNode(ComplexNode hardwareNode, TimeType timeType, Amalthea model) {
		HashMap<ComplexNode, List<Long>> result = new HashMap<ComplexNode, List<Long>>();
		List<LatencyAccessPath> latencyAccessPathsOfCore = getLatencyAccessPathsOfHardwareNode(hardwareNode, model);
		
		for (LatencyAccessPath latencyPath : latencyAccessPathsOfCore) {
			ComplexNode target = null;
			if (latencyPath.getSource().equals(hardwareNode)) {
				if (latencyPath.getTarget() != null) {
					target = latencyPath.getTarget();
				}
			} else {
				if (latencyPath.getSource() != null) {
					target = latencyPath.getSource();
				}
			}
			
			//System.out.println(hardwareNode.getName()+ "  -target "+target.getName());
			
			List<Long> latList = new ArrayList<Long>();
			for (LatencyAccessPathElement latency : latencyPath.getLatencies()) {
				if (latency instanceof LatencyConstant) {
					latList.add(((LatencyConstant)latency).getValue());
				}
				else if (latency instanceof LatencyDeviation) {
					Deviation<LongObject> deviation = ((LatencyDeviation)latency).getDeviation();
					if (timeType == null)
						latList.add(RuntimeUtil.getMean(deviation.getDistribution(), deviation.getLowerBound().getValue(), deviation.getUpperBound().getValue()));
					else {
						switch(timeType) {
						case ACET: 
							latList.add(RuntimeUtil.getMean(deviation.getDistribution(), deviation.getLowerBound().getValue(), deviation.getUpperBound().getValue()));
							break;
						case BCET:
							latList.add(deviation.getLowerBound().getValue());
							break;
						case WCET:
							latList.add(deviation.getUpperBound().getValue());
							break;
						default:
							break;
						}
					}
				}
			}
			if (result.get(target) != null) {
				result.get(target).addAll(latList);
			} else {
				result.put(target, latList);
			}
		}
		return result;
	}
	
	/**
	 * returns a list of access latencies for a ComplexNode (List Objects are LatencyConstant and LatencyDeviation)
	 * @param hardwareNode
	 * @param model
	 * @return  Map<ComplexNode, List<Object>>
	 */
	public static Map<ComplexNode, List<Object>> getAccessLatencyDeviationsForHardwareNode(ComplexNode hardwareNode, Amalthea model) {
		HashMap<ComplexNode, List<Object>> result = new HashMap<ComplexNode, List<Object>>();
		List<LatencyAccessPath> latencyAccessPathsOfCore = getLatencyAccessPathsOfHardwareNode(hardwareNode, model);
		for (LatencyAccessPath latencyPath : latencyAccessPathsOfCore) {
//			ComplexNode target;
//			if (latencyPath.getSource().equals(hardwareNode)) 
//				target = latencyPath.getTarget();
//			else
//				target = latencyPath.getSource();
			ComplexNode target = null;
			if (latencyPath.getSource().equals(hardwareNode))		//02.05.2017 Anh prevented the null value
			{
				if (latencyPath.getTarget() != null)
				{
					target = latencyPath.getTarget();
				}
			}
				
			else{
				if (latencyPath.getSource() != null)
				{
					target = latencyPath.getSource();
				}
			}			
			for (LatencyAccessPathElement latency : latencyPath.getLatencies()) {
				if (latency instanceof LatencyDeviation)
				{
					if (result.get(target) != null)
						result.get(target).add(latency);
					else {
						List<Object> tmp = new ArrayList<Object>();
						tmp.add(latency);
						result.put(target, tmp);
					}
				}					
			}
		}
		return result;
	}
	
	/**
	 * returns the frequency of a specific core
	 * @param core
	 * @return long
	 */
	public static long getFrequencyOfCore(Core core) {
		long preScaler = 1L;
		switch (core.getPrescaler().getQuartz().getFrequency().getUnit())
	  	{
	  		case GHZ:
	  			preScaler = 1000000000L;
	  			//executionTime.setUnit(TimeUnit.NS);
	  			break;
	  		case MHZ:
	  			preScaler = 1000000L;
	  			//executionTime.setUnit(TimeUnit.US);
	  			break;
	  		case KHZ:
	  			preScaler = 1000L;
	  			//executionTime.setUnit(TimeUnit.MS);
	  			break;
	  		case HZ:
	  			preScaler = 1L;
	  			//executionTime.setUnit(TimeUnit.S);
	  			break;
	  		default: 
	  			preScaler = 1L;
	  			//executionTime.setUnit(TimeUnit.S);
	  	}
		//frequency in Hertz
		long frequency = (long)(((core.getPrescaler().getQuartz().getFrequency().getValue())) * preScaler * core.getPrescaler().getClockRatio());
	  	return frequency;
	}
}
