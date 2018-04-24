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

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.apache.commons.math3.special.Gamma;
import org.eclipse.app4mc.amalthea.model.AbstractTime;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.BetaDistribution;
import org.eclipse.app4mc.amalthea.model.Boundaries;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CustomStimulus;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.EventStimulus;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;

import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.NeedConstant;
import org.eclipse.app4mc.amalthea.model.NeedDeviation;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.UniformDistribution;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;
import org.eclipse.emf.common.util.EMap;


public class RuntimeUtil {
	
	public static enum TimeType {
	    BCET,
	    ACET,
	    WCET
	 }
	
	public static enum PositionType {
		FIRST,
		LAST
	}

	/**
	 * get the execution need value that the given process would need to execute
	 * on the given procUnitDef
	 * @param process
	 * @param execTimeType
	 * @param procUnitDef
	 * @param hwFeatures 
	 * @param modes
	 * @return execution need count for given process
	 */
	public static Long getExecutionNeedValueCountForProcess(Process process, TimeType execTimeType, ProcessingUnitDefinition procUnitDef, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		long executionNeedCount = 0L;
		for(Runnable runnable : runnables) {
			executionNeedCount += getExecutionNeedValueCountForRunnable(runnable, execTimeType, procUnitDef,  hwFeatures, modes);
		}
		
		return executionNeedCount;
	}	

	/**
	 * get the ExecutionNeed value count that the given runnable/hwFeature set would need to execute
	 * on the given procUnitDef
	 * @param runnable
	 * @param execTimeType
	 * @param procUnitDef
	 * @param modes
	 * @param hwFeatures 
	 * @return ExecutionNeed value count for given runnable
	 */
	public static Long getExecutionNeedValueCountForRunnable(Runnable runnable, TimeType execTimeType, ProcessingUnitDefinition procUnitDef, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		List<Entry<HwFeatureCategory, Need>> executionNeedEntries = SoftwareUtil.getExecutionNeedEntryList(runnable, procUnitDef, hwFeatures, modes);
		return getExecutionNeedValueCountForExecutionNeedList(executionNeedEntries, execTimeType);
	}

	
	
	
	/**
	 * converts a list of ExecutionNeed-Entry elements into a number (ExecutionNeeds executed)
	 * @param ExecutionNeedEntries
	 * @param execTimeType
	 * @return
	 */
	private static Long getExecutionNeedValueCountForExecutionNeedList(List<Entry<HwFeatureCategory, Need>> executionNeedEntries, TimeType execTimeType) {
		long result = 0L;
		for (Entry<HwFeatureCategory, Need> needEntry :executionNeedEntries) {
			result = result + getExecutionNeedValueCountForExecutionNeed(needEntry.getValue(), execTimeType);
		}
		return result;
	}
	
	/**
	 * converts a Need element into a number 
	 * @param needValue
	 * @param execTimeType
	 * @return long 
	 */
	private static Long getExecutionNeedValueCountForExecutionNeed(Need needValue, TimeType execTimeType) {
		if(needValue instanceof NeedDeviation) {
			NeedDeviation instDeviation = (NeedDeviation)needValue;
			switch(execTimeType) {
			case ACET: 
				return getMean(instDeviation.getDeviation().getDistribution(), instDeviation.getDeviation().getLowerBound().getValue(), instDeviation.getDeviation().getUpperBound().getValue());
			case BCET:
				return instDeviation.getDeviation().getLowerBound().getValue();
			case WCET:
				return instDeviation.getDeviation().getUpperBound().getValue();
			
			}
		} else if(needValue instanceof NeedConstant) {
			return ((NeedConstant)needValue).getValue();
		}
		return 0L;
	}

	
	/**
	 * get a map that contains the value of ExecutionNeedValueCounts for all (in the runnables) specified procUnitDefs
	 * @param process
	 * @param execTimeType
	 * @param modes
	 * @param hwFeatures 
	 * @return map ProcessingUnitDefinition->ExecutionNeed value count of the extended ExecutionNeeds of the process 
	 */
	public static HashMap<ProcessingUnitDefinition, Long> getExecutionNeedValueCountExtendedForProcess(Process process, TimeType execTimeType, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<ProcessingUnitDefinition, Long> procUnitDefToIcMap = new HashMap<ProcessingUnitDefinition, Long>();
		
		for(Runnable runnable : SoftwareUtil.getRunnableList(process, modes)) {
			HashMap<ProcessingUnitDefinition, Long> map = getExecutionNeedValueCountExtendedForRunnable(runnable, execTimeType, hwFeatures, modes);
			
			for(ProcessingUnitDefinition ct : map.keySet()) {
				Long ic = 0L;
				if(procUnitDefToIcMap.get(ct) != null) {
					ic = procUnitDefToIcMap.get(ct);
				}
				ic += map.get(ct);
				
				procUnitDefToIcMap.put(ct, ic);
			}
		}
			
		return procUnitDefToIcMap;
	}
		
	
	/**
	 * get a map that contains the ExecutionNeedValueCounts for all specified procUnitDefs
	 * 
	 * @param runnable
	 * @param execTimeType
	 * @param hwFeatures
	 * @param modes
	 * @return map ProcessingUnitDefinition->ExecutionNeed value count of the extended ExecutionNeeds of the runnable
	 */
	public static HashMap<ProcessingUnitDefinition, Long> getExecutionNeedValueCountExtendedForRunnable(Runnable runnable, TimeType execTimeType, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<ProcessingUnitDefinition, Long> procUnitDefToIcMap = new HashMap<ProcessingUnitDefinition, Long>();
		
		for(ExecutionNeed executionNeed : SoftwareUtil.getExecutionNeedsList(runnable, modes)) {
			if(executionNeed.getExtended() != null) {
				for(ProcessingUnitDefinition procUnitDef : executionNeed.getExtended().keySet()) {
					Long ic = 0L;
					if(procUnitDefToIcMap.get(procUnitDef) != null) {
						ic = procUnitDefToIcMap.get(procUnitDef);
					}
					for (Entry<HwFeatureCategory, Need> needEntry : executionNeed.getExtended().get(procUnitDef)) {
						if (hwFeatures.contains(needEntry.getKey())) {
							ic = ic + getExecutionNeedValueCountForExecutionNeed(needEntry.getValue(), execTimeType);
						}

					}
					procUnitDefToIcMap.put(procUnitDef, ic);
				}
			}
			if(executionNeed.getDefault() != null) {
				Long ic = 0L;
				if(procUnitDefToIcMap.get(null) != null) {
					ic = procUnitDefToIcMap.get(null);
				}
				for (Entry<HwFeatureCategory, Need> needEntry : executionNeed.getDefault()) {
					if (hwFeatures.contains(needEntry.getKey())) {
						ic = ic + getExecutionNeedValueCountForExecutionNeed(needEntry.getValue(), execTimeType);
				}

				}
				procUnitDefToIcMap.put(null, ic);
			}
		}

		return procUnitDefToIcMap;
	}

	/**
	 * get the execution time for the given process on the given core
	 * @param process
	 * @param execTimeType
	 * @param core
	 * @param hwFeatures
	 * @return execution Time of the given process
	 */
	public static Time getExecutionTimeForProcess(Process process, TimeType execTimeType, ProcessingUnit core, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		Time executionTime = AmaltheaFactory.eINSTANCE.createTime();
		executionTime.setValue(new BigInteger("0"));
		executionTime.setUnit(TimeUnit.MS);
		
		for(Runnable runnable : runnables) {
			if(runnable != null) {
				executionTime = TimeUtil.addTimes(executionTime, getExecutionTimeForRunnable(runnable, execTimeType, core, hwFeatures, modes));
			}
		}
		
		return executionTime;
	}

	/**
	 * get the execution time for the given runnable on the given core
	 * @param runnable
	 * @param execTimeType
	 * @param core
	 * @param hwFeatures
	 * @return execution time of the given runnable
	 */
	public static Time getExecutionTimeForRunnable(Runnable runnable, TimeType execTimeType, ProcessingUnit core, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		long ExecutionNeedValueCount = getExecutionNeedValueCountForRunnable(runnable, execTimeType, core.getDefinition(), hwFeatures, modes);
		long frequency = (long) HardwareUtil.getFrequencyOfCore(core).getValue();
		List <HwFeature> features = core.getDefinition().getFeatures();
		Time executionTime =  AmaltheaFactory.eINSTANCE.createTime();
		//TODO: check
		double scaleFactor= 0;
		for (HwFeature feat:features) {
			if (hwFeatures.contains(feat)) {
				scaleFactor = feat.getValue();
				Time currentTime =  FactoryUtil.createTime(ExecutionNeedValueCount, scaleFactor, frequency);
				executionTime = TimeUtil.addTimes(executionTime, currentTime);
			}
		}
		//float ipc = 1; //core.getDefinition().getExecutionNeedsPerCycle();		
		return executionTime;
	}
	

	/**
	 * get a map that contains the execution for all core for which a procUnitDef has specified runtime
	 * 
	 * @param model
	 * @param process
	 * @param execTimeType
	 * @param modes
	 * @return  map ProcessingUnit->Execution time of the extended ExecutionNeeds of the process
	 */
	public static HashMap<ProcessingUnit, Time> getExecutionTimeExtendedForProcess(Amalthea model, Process process, TimeType execTimeType, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<ProcessingUnit, Time> executionTimes = new HashMap<>();
		
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		
		for(Runnable runnable : runnables) {
			if(runnable != null) {
				Map<ProcessingUnit, Time> map = getExecutionTimeExtendedForRunnable(model, runnable, execTimeType, hwFeatures, modes);
				for(ProcessingUnit c : map.keySet()) {
					Time executionTime = executionTimes.get(c);
					if(executionTime == null) {
						executionTime =  FactoryUtil.createTime("0ms");
					}
					executionTime = TimeUtil.addTimes(executionTime, map.get(c));
					executionTimes.put(c, executionTime);
				}
				
			}
		}
		
		return executionTimes;
	}
	
	/**
	 * Gets execution times for given runnable on all possible cores (with specified procUnitDef)
	 * @param model
	 * @param runnable
	 * @param execTimeType
	 * @param modes
	 * @return  map ProcessingUnit->Execution time of the extended ExecutionNeeds of the process for all possible cores
	 */
	public static Map<ProcessingUnit, Time> getExecutionTimeExtendedForRunnable(Amalthea model, Runnable runnable, TimeType execTimeType, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<ProcessingUnit, Time> executionTimes = new HashMap<>();
		
		HashMap<ProcessingUnitDefinition, Long> procUnitDefToExecutionNeedValueCountMap = getExecutionNeedValueCountExtendedForRunnable(runnable, execTimeType, hwFeatures, modes);
		
		for(ProcessingUnitDefinition ct : procUnitDefToExecutionNeedValueCountMap.keySet()) {
			List<ProcessingUnit> coreWithGivenprocUnitDef = HardwareUtil.getAllCoresForCoreType(model, ct);
			
			for(ProcessingUnit core : coreWithGivenprocUnitDef) {
				executionTimes.put(core, getExecutionTimeForExecutionNeedValueCount(procUnitDefToExecutionNeedValueCountMap.get(ct), core, hwFeatures, null));
			}
		}
		
		return executionTimes;
	}





	/**
	 * convert a number (ExecutionNeeds) into execution time on the given core
	 * @param runnable
	 * @param execTimeType
	 * @return time on given core for given ExecutionNeed value count 
	 */
	public static Time getExecutionTimeForExecutionNeedValueCount(long ExecutionNeedValueCount, ProcessingUnit core, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		//float ipc = 1; //core.getDefinition().getExecutionNeedsPerCycle();

		long frequency = (long) HardwareUtil.getFrequencyOfCore(core).getValue();
		List <HwFeature> features = core.getDefinition().getFeatures();
		Time executionTime =  AmaltheaFactory.eINSTANCE.createTime();
		//TODO: check
		double scaleFactor= 0;
		for (HwFeature feat:features) {
			if (hwFeatures.contains(feat)) {
				scaleFactor = feat.getValue();
				Time currentTime =  FactoryUtil.createTime(ExecutionNeedValueCount, scaleFactor, frequency);
				executionTime = TimeUtil.addTimes(executionTime, currentTime);
			}
		}
		return executionTime;
	}
	
	/**
	 * Calculates the utilization for a given core 
	 * @param core
	 * @param model
	 * @param tt
	 * @param modes (optional) - null works
	 * @return utilization of that core
	 */
	public static double getCoreUtilization(ProcessingUnit core, Amalthea model, TimeType tt, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		double utilization = 0.0;
		
		for(Process proc : DeploymentUtil.getProcessesMappedToCore(core, model)) {
			utilization += getProcessUtilization(proc, core, model, tt, hwFeatures, modes);
		}
		
		return utilization;
	}	
	
	
	/**
	 * Calculates the utilization for a given process
	 * @param process
	 * @param model
	 * @param tt
	 * @param modes (optional) - null works
	 * @return map core -> utilization
	 */
	public static Map<ProcessingUnit, Double> getProcessUtilization(Process process, Amalthea model, TimeType tt, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<ProcessingUnit, Double> utilizations = new HashMap<>(); 
		
		
		Set<ProcessingUnit> cores = DeploymentUtil.getAssignedCoreForProcess(process, model);
		
		for(ProcessingUnit core : cores) {
			double utilization = getProcessUtilization(process, core, model, tt,  hwFeatures, modes);
			utilizations.put(core, utilization); 
		}
		
		return utilizations;
	}

	
	/**
	 * Calculates the utilization for a given process on a given core
	 * Assumption (wrong): All triggers activate the process on all cores together! (at the same time)
	 * @param process
	 * @param core
	 * @param model
	 * @param tt
	 * @param modes (optional) - if none apply, null should be given
	 * @return utilization
	 */
	public static double getProcessUtilization(Process process, ProcessingUnit core, Amalthea model, TimeType tt, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		double utilization = 0.0;
		
		List<Time> periods = getPeriodsOfProcess(model, process, tt, modes);
		Time time = getExecutionTimeForProcess(process, tt, core,  hwFeatures, modes);
		if(time.getValue().compareTo(new BigInteger("0")) < 0) {
			System.err.println("execTime "+TimeUtil.timeToString(time));
		}
		for(Time period : periods) {
			//System.out.println(process.getName() + "  Period: "+TimeUtil.timeToString(period) + "  ET: "+TimeUtil.timeToString(time));
			if(period != null && period.getValue().intValue() != 0) {
				utilization += (TimeUtil.divideTimes(time, period));
			}
		}
		
		return utilization;
	}
	
	/**
	 * calculate the process utilization
	 * @param process
	 * @param period
	 * @param core
	 * @param model
	 * @param tt
	 * @param modes
	 * @return utilization
	 */
	public static double getProcessUtilization(Process process, Time period, ProcessingUnit core, Amalthea model, TimeType tt, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		Time time = getExecutionTimeForProcess(process, tt, core, hwFeatures, modes);
		double utilization = (TimeUtil.divideTimes(time, period));
		return utilization;
	}


	/**
	 * Returns the cumulative process utilization, i.e. runtime on every core summed up
	 * @param model
	 * @param tt
	 * @param hwFeatures
	 * @param modes
	 * @return map process -> sum of utilization on all cores
	 */
	public static Map<Process, Double> getCumulativeProcessUtilizations(Amalthea model, TimeType tt, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Process, Double> utilizations = new HashMap<>();
		
		List<Process> procs = new ArrayList<Process>();
		procs.addAll(model.getSwModel().getTasks());
		procs.addAll(model.getSwModel().getIsrs());
		
		for(Process proc : procs) {
			Map<ProcessingUnit, Double> processUtilization = getProcessUtilization(proc, model, tt, hwFeatures, modes);
			double util = 0.0;
			for(ProcessingUnit c : processUtilization.keySet()) {
				util += processUtilization.get(c);
			}
			utilizations.put(proc, util);
		}
		
		return utilizations;
	}
	
	/**
	 * gets all Period ranges from the model
	 * @param model
	 * @return
	 */
	public static Map<Process, List<Time>> getPeriodsOfAllProcesses(Amalthea model, TimeType tt, EMap<ModeLabel, ModeLiteral> modes) {
		Map<Process, List<Time>> result = new HashMap<>();
		
		List<Process> processes = new ArrayList<Process>(); 
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
		for(Process process : processes) {
			List<Time> periods = getPeriodsOfProcess(model, process, tt, modes);	
			result.put(process, periods);
		}
		
		return result;
	}

	/**
	 * 	Returns a list of all triggering periods. Sorted by shortest period first!
	 * @param model
	 * @param process
	 * @param tt
	 * @param modes
	 * @return
	 */
	public static List<Time> getPeriodsOfProcess(Amalthea model, Process process, TimeType tt, EMap<ModeLabel, ModeLiteral> modes) {
		List<Time> result = new ArrayList<Time>();
		//System.out.println(process.getName());
		for(Stimulus stimulus : process.getStimuli()) {
			//System.out.println("  Stimulus "+stimulus);
			if(stimulus instanceof PeriodicStimulus) {
				PeriodicStimulus p = ((PeriodicStimulus)stimulus);
				result.add(p.getRecurrence());
			} else if(stimulus instanceof ArrivalCurveStimulus) {
				switch(tt) {
				case ACET:			
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if(stimulus instanceof CustomStimulus) {
				//check if task is serverTask of async/sync-ServerCalls
				/*for(Runnable runnable : getRunnableListOfProcess(process, modes)) {
					for(Runnable caller : model.getSwModel().getRunnables()) {
						Set<ServerCall> serverCallsOfRunnable = getServerCallsOfRunnable(caller, modes);
						for(ServerCall sc : serverCallsOfRunnable) {
							if(sc.getServerRunnable() != null && sc.getServerRunnable().equals(runnable)) {
								//we have found a serverCall from "caller" to "runnable" -> add Periods of Processes of Caller to list
								List<Process> processesOfRunnable = getProcessesOfRunnable(caller, modes);
								for(Process callerProcess : processesOfRunnable) {
									result.addAll(getPeriods(model, callerProcess, tt, modes));
								}
							}
						}
					}
				}*/
					
				switch(tt) {
				case ACET:			
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if(stimulus instanceof EventStimulus) {
				switch(tt) {
				case ACET:				
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if(stimulus instanceof InterProcessStimulus) {
				InterProcessStimulus ip = ((InterProcessStimulus)stimulus);
				long ipPrescaler = 1L;
				if(ip.getCounter() != null) {
					ipPrescaler = ip.getCounter().getPrescaler();
				}
				//System.out.println("    IP found");
				Map<Process,Long> triggeringProcesses = getTriggeringProcesses(model, ip, modes);
				if(triggeringProcesses.containsKey(process)) {
					//TODO decided what to do with self triggering processes
					triggeringProcesses.remove(process);
				}
				
				for(Process triggeringProcess : triggeringProcesses.keySet()) {
					//System.out.println("    --triggered by "+triggeringProcess.getName());
//					InterProcessActivation ipa = getIpaForStimulus(stimulus, triggeringProcess, modes);
					List<Time> periods = getPeriodsOfProcess(model, triggeringProcess, tt, modes);
					for(Time t : periods) {
						long ipaPrescaler = triggeringProcesses.get(triggeringProcess);
//						if(ipa.getCounter() != null) {
//							ipaPrescaler = ipa.getCounter().getPrescaler();
//						}
						result.add(TimeUtil.multiplyTime(t, ipaPrescaler*ipPrescaler));
					}
				}
				
				//System.out.println("InterProcess eContainer: "+ip.eContainer());
				//System.out.println(ip);
				//System.out.println(getTriggeringProcess(model, ip));
				//result.addAll(getPeriods(model, getTriggeringProcess(model, ip), tt));
		
			} else if(stimulus instanceof VariableRateStimulus) {
				VariableRateStimulus vr = ((VariableRateStimulus)stimulus);
				//System.out.println(s);
				Time time = null;
				switch(tt) {
				case ACET:	
// TODO fix it
//					if(vr.getStimulusDeviation() != null) {
//						time = getMean(vr.getStimulusDeviation());
//					}
//					break;
//				case BCET:
//					if(vr.getStimulusDeviation() != null) {
//						time = vr.getStimulusDeviation().getUpperBound();
//					}
//					break;
//				case WCET:
//					if(vr.getStimulusDeviation() != null) {
//						time = vr.getStimulusDeviation().getLowerBound();
//					}
					break;
				default:
					break;
				}
				
				if(time == null) {
					/*time = AmaltheaFactory.eINSTANCE.createTime();
					time.setValue(0);
					time.setUnit(TimeUnit.MS);*/
				} else {
					result.add(time);
				}
			} else if(stimulus instanceof SingleStimulus) {
				switch(tt) {
				case ACET:		
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if(stimulus instanceof RelativePeriodicStimulus) {
				RelativePeriodicStimulus rp = ((RelativePeriodicStimulus)stimulus);
				Time time = null;
				switch(tt) {
				case ACET:
// TODO check changes
					if(rp.getNextOccurrence() != null) {
						time = getMean(rp.getNextOccurrence());
					}
					break;
				case BCET:
					if(rp.getNextOccurrence() != null) {
						time = (rp.getNextOccurrence().getUpperBound());
					}
					break;
				case WCET:
					if(rp.getNextOccurrence() != null) {
						time = (rp.getNextOccurrence().getLowerBound());
					}
					break;
				default:
					break;
				}
				
				if(time == null) {
					/*time = AmaltheaFactory.eINSTANCE.createTime();
					time.setValue(0);
					time.setUnit(TimeUnit.MS);*/
				} else {
					result.add(time);
				}
			} else if(stimulus instanceof PeriodicSyntheticStimulus) {
				switch(tt) {
				case ACET:			
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			}
		}
		
		Collections.sort(result);
		
		return result;
	}
	
	
	/**
	 * this method return all Processes that trigger the given InterProcessStimulus
	 * 
	 * @param model
	 * @param ip
	 * @param modes
	 * @return map process -> prescaler value
	 */
	public static Map<Process,Long> getTriggeringProcesses(Amalthea model, InterProcessStimulus ip, EMap<ModeLabel, ModeLiteral> modes) {
		Map<Process,Long> result = new HashMap<>();
		
		for (InterProcessTrigger interProcessTrigger : ip.getExplicitTriggers()) {
			Process parentProcess = ModelUtil.getParentContainer(interProcessTrigger, Process.class);
			if (interProcessTrigger.getCounter() != null) {
				result.put(parentProcess, interProcessTrigger.getCounter().getPrescaler());
			} else {
				result.put(parentProcess, 1L);
			}
		}
		
		return result;
	}
	
	/** 
	 * Returns a map of all stimuli, triggered by this process, associated with its prescaler.
	 * 
	 * @param p - the process
	 * @return
	 */
	public static HashMap<Stimulus, Long> getTriggeredStimuli(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Stimulus, Long> stimuliMap = new HashMap<Stimulus, Long>();
		List<InterProcessTrigger> interProcessTriggers = SoftwareUtil.collectCalls(process, modes, s -> s instanceof InterProcessTrigger).stream().map(s -> (InterProcessTrigger)s).collect(Collectors.toList());

		interProcessTriggers.forEach(ipa -> {if (ipa.getCounter() != null) {
			stimuliMap.put(ipa.getStimulus(), ipa.getCounter().getPrescaler());
		} else {
			stimuliMap.put(ipa.getStimulus(), 1L);
		}});
		
		return stimuliMap;
		
	}
	
	/**
	 * get a Map of all sporadically triggered processes with their prescaler
	 * @param model
	 * @param tt
	 * @param processes
	 * @return Map of processes with a sporadic activation and depending on tt the time between activations
	 */
	public static Map<Process, List<Time>> getProcessesWithRelativePeriodicStimulus(Amalthea model, TimeType tt) {
		Set<Process> processes = new HashSet<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
// TODO check
		Map<Process, List<Time>> result = processes.stream().collect(
				Collectors.toMap(p -> p, p -> p.getStimuli().stream().filter(s -> (s instanceof RelativePeriodicStimulus))
				.map(s -> getActivationTimeFromDeviation(((RelativePeriodicStimulus)s).getNextOccurrence(), tt))
				.collect(Collectors.toList())));
		
		return result;
	}
	
	private static Time getActivationTimeFromDeviation(Deviation<Time> deviation, TimeType tt) {
		switch(tt) {
		case ACET:
			return getMean(deviation);
		case BCET:
			return deviation.getUpperBound();
		case WCET:
			return deviation.getLowerBound();
		}
		return null;
	}

	/**
	 * get a Map of all sporadically triggered processes with their prescaler
	 * @param model
	 * @param tt
	 * @param processes
	 * @return Map of processes with a sporadic activation and the deviation of the activations
	 */
	public static Map<Process, List<Deviation<Time>>> getProcessesWithRelativePeriodicStimulus(Amalthea model) {
		List<Process> processes = new ArrayList<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		processes.stream().filter(p -> p.getStimuli().stream().filter(s -> (s instanceof RelativePeriodicStimulus)).collect(Collectors.toList()).size() > 0 );

// TODO check
		Map<Process, List<Deviation<Time>>> result = processes.stream().collect(
				Collectors.toMap(p -> p, p -> p.getStimuli().stream().filter(s -> (s instanceof RelativePeriodicStimulus))
				.map(s -> ((RelativePeriodicStimulus)s).getNextOccurrence())
				.collect(Collectors.toList())));
	
		return result;
	}
		
	
	/**
	 * this method returns a map from process to all stimuli (matching filter) that lead to that process with the correct prescaler
	 * @param model
	 * @param targetClass
	 * @return Map<Process, Map<Stimulus, Long>>
	 */
	public static <T> Map<Process, Map<Stimulus, Long>> getPlainTriggersForModel(Amalthea model, Function<Stimulus, Boolean> filter) {
		HashMap<Process, Map<Stimulus, Long>> map = new HashMap<>();
		List<Process> processes = new ArrayList<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
		for(Process p : processes) {
			Map<Stimulus, Long> plainTriggerForProcess = getPlainTriggerForProcess(model, p, 1, filter);
			if(plainTriggerForProcess != null && !plainTriggerForProcess.isEmpty()) {
				map.put(p, plainTriggerForProcess);
			}
		}
		return map;
	}
	
	
	/**
	 * this method returns all stimuli (matching filter) that trigger the given process
	 * @param model
	 * @param process
	 * @param depthCounter
	 * @param targetClass
	 * @return Map<Stimulus, Long>
	 */
	public static <T> Map<Stimulus, Long> getPlainTriggerForProcess(Amalthea model, Process process, long depthCounter, Function<Stimulus, Boolean> filter) {
		HashMap<Stimulus, Long> map = new HashMap<>();
		
		for(Stimulus stimulus : process.getStimuli()) {
			
			if((filter == null) || (filter.apply(stimulus))) {
			
				if(stimulus instanceof PeriodicStimulus) {
					PeriodicStimulus p = ((PeriodicStimulus)stimulus);
					map.put(p, depthCounter);
				} else if(stimulus instanceof ArrivalCurveStimulus) {
					ArrivalCurveStimulus p = ((ArrivalCurveStimulus)stimulus);
					map.put(p, depthCounter);
				} else if(stimulus instanceof CustomStimulus) {
					CustomStimulus p = ((CustomStimulus)stimulus);
					map.put(p, depthCounter);
				} else if(stimulus instanceof EventStimulus) {
					EventStimulus p = ((EventStimulus)stimulus);
					map.put(p, depthCounter);
				} else if(stimulus instanceof InterProcessStimulus) {
					InterProcessStimulus ip = ((InterProcessStimulus)stimulus);
					long ipPrescaler = 1L;
					if(ip.getCounter() != null) {
						ipPrescaler = ip.getCounter().getPrescaler();
					}
					Map<Process, Long> triggeringProcesses = getTriggeringProcesses(model, ip, null);
					for(Process triggeringProcess : triggeringProcesses.keySet()) {
						if(triggeringProcess.equals(process)) {
							continue; //don't follow loops
						}
						long ipaPrescaler = triggeringProcesses.get(triggeringProcess);
						Map<Stimulus, Long> plainTriggerForProcess = getPlainTriggerForProcess(model, triggeringProcess, depthCounter*ipaPrescaler*ipPrescaler, filter);
						map.putAll(plainTriggerForProcess);
					}
				
				} else if(stimulus instanceof VariableRateStimulus) {
					VariableRateStimulus p = ((VariableRateStimulus)stimulus);
					map.put(p, depthCounter);
				} else if(stimulus instanceof SingleStimulus) {
					SingleStimulus p = ((SingleStimulus)stimulus);
					map.put(p, depthCounter);
				} else if(stimulus instanceof RelativePeriodicStimulus) {
					RelativePeriodicStimulus s = ((RelativePeriodicStimulus)stimulus);
					map.put(s, depthCounter);
				} else if(stimulus instanceof PeriodicSyntheticStimulus) {
					PeriodicSyntheticStimulus p = ((PeriodicSyntheticStimulus)stimulus);
					map.put(p, depthCounter);
				}
			} else {
				//not in filter
			}
		}
		return map;
	}
	
		
	public static boolean periodicStimulusFilter(Stimulus stimulus) {
		if(stimulus instanceof PeriodicStimulus) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean sporadicStimulusFilter(Stimulus stimulus) {
		if(stimulus instanceof RelativePeriodicStimulus) {
			return true;
		} else {
			return false;
		}
	}
	public static boolean customStimulusFilter(Stimulus stimulus) {
		if(stimulus instanceof CustomStimulus) {
			return true;
		} else {
			return false;
		}
	}

	public static Time getMean(Deviation<? extends Time> deviation) {
		return getMean(deviation.getDistribution(), deviation.getLowerBound(), deviation.getUpperBound());
	}
	public static Time getMean(Distribution<? extends Time> distribution2, Time lowerBound, Time upperBound) {
		Time mean = null;
		Distribution<? extends Time> distribution = ((Distribution<? extends Time>)distribution2);
		if(distribution instanceof BetaDistribution) {
			BetaDistribution<? extends Time> bd = (BetaDistribution<? extends Time>)distribution;
			//mean = 1 / (1 + (beta/alpha))
			double m =  1.0 / (1.0 + (bd.getBeta()/bd.getAlpha()));
			mean = TimeUtil.addTimes(lowerBound, TimeUtil.multiplyTime(TimeUtil.subtractTimes(upperBound, lowerBound),m));
		} else if(distribution instanceof Boundaries) {
			//mean = ((Boundaries)distribution).getSamplingType().g
		} else if(distribution instanceof GaussDistribution) {
			GaussDistribution<? extends Time> gd = (GaussDistribution<? extends Time>)distribution;
			//mean = gd.getMean();
			if (gd.getMean() == null || !(gd.getMean() instanceof AbstractTime)) {
				mean = TimeUtil.multiplyTime(TimeUtil.addTimes(lowerBound, upperBound), 0.5);
			} else { 
				mean = gd.getMean();
			}
		} else if(distribution instanceof UniformDistribution) {
			//mean = ((UniformDistribution)distribution).
			//mean = (upperBound+lowerBound)/2;
			mean = TimeUtil.multiplyTime(TimeUtil.addTimes(lowerBound, upperBound), 0.5);
		} else if(distribution instanceof WeibullDistribution) {
			WeibullDistribution<? extends Time> wd = (WeibullDistribution<? extends Time>)distribution;
			if(wd instanceof WeibullEstimators) {
				WeibullEstimators<? extends Time> we = (WeibullEstimators<? extends Time>)wd;
				mean = we.getMean();
			} else if(wd instanceof WeibullParameters) {
				WeibullParameters<? extends Time> wp = (WeibullParameters<? extends Time>)wd;
				double m =  1.0/wp.getLambda() * Gamma.gamma(1.0 + 1/wp.getKappa()); 
//				mean = lowerBound + (long)((upperBound-lowerBound)*m);
				mean = TimeUtil.addTimes(lowerBound, TimeUtil.multiplyTime(TimeUtil.subtractTimes(upperBound, lowerBound),m));
			}
		}
		return mean;
	}
	
	
	public static <T> long getMean(Distribution<T> distribution, long lowerBound, long upperBound) {
		long mean = 0;
		if(distribution instanceof BetaDistribution) {
			BetaDistribution<T> bd = (BetaDistribution<T>)distribution;
			//mean = 1 / (1 + (beta/alpha))
			double m =  1.0 / (1.0 + (bd.getBeta()/bd.getAlpha()));
			mean = lowerBound + (long)((upperBound-lowerBound)*m);
		} else if(distribution instanceof Boundaries) {
			//mean = ((Boundaries)distribution).getSamplingType().g
		} else if(distribution instanceof GaussDistribution) {
			GaussDistribution<T> gd = (GaussDistribution<T>)distribution;
			if (gd.getMean() == null || !(gd.getMean() instanceof LongObject)) {
				mean = (upperBound+lowerBound)/2;
			} else { 
				mean = ((LongObject) gd.getMean()).getValue();
			}
		} else if(distribution instanceof UniformDistribution) {
			//mean = ((UniformDistribution)distribution).
			mean = (upperBound+lowerBound)/2;
		} else if(distribution instanceof WeibullDistribution) {
			WeibullDistribution<T> wd = (WeibullDistribution<T>)distribution;
			if(wd instanceof WeibullEstimators) {
				WeibullEstimators<T> we = (WeibullEstimators<T>)wd;
				//	we.getMean() should be a LongObject
				if (we.getMean() instanceof LongObject)
					mean = ((LongObject) we.getMean()).getValue();
				else if (we.getMean() instanceof String)
					mean = Long.parseLong(we.getMean().toString());
			} else if(wd instanceof WeibullParameters) {
				WeibullParameters<T> wp = (WeibullParameters<T>)wd;
				double m =  1.0/wp.getLambda() * Gamma.gamma(1.0 + 1/wp.getKappa()); 
				mean = lowerBound + (long)((upperBound-lowerBound)*m);
			}
		}
		return mean;
	}
	
	public static <T> void setMean(Distribution<T> distribution, long l) {
		if(distribution instanceof GaussDistribution) {
			GaussDistribution<T> gd = (GaussDistribution<T>)distribution;
			if(gd.getMean() instanceof LongObject) {
				((LongObject)gd.getMean()).setValue(l);
			}
		} else if(distribution instanceof UniformDistribution) {
			//mean = ((UniformDistribution)distribution).
			//mean = (upperBound+lowerBound)/2;
		} else if(distribution instanceof WeibullDistribution) {
			WeibullDistribution<T> wd = (WeibullDistribution<T>)distribution;
			if(wd instanceof WeibullEstimators) {
				WeibullEstimators<T> we = (WeibullEstimators<T>)wd;
				if (we.getMean() instanceof LongObject) {
					((LongObject) we.getMean()).setValue(l);
				} else if (we.getMean() instanceof String) {
					//we.setMean(""+l);
				}
			} else if(wd instanceof WeibullParameters) {
				/*WeibullParameters<T> wp = (WeibullParameters<T>)wd;
				double m =  1.0/wp.getLambda() * Gamma.gamma(1.0 + 1/wp.getKappa()); 
				mean = lowerBound + (long)((upperBound-lowerBound)*m);
				*/
			}
		}
	}	
	
	
	/**
	 * This method returns a list of all procUnitDefs for which the given runnable
	 * contains runtime in a ExecutionNeed element
	 * @param runnable
	 * @param execTimeType
	 * @param modes
	 * @return List<ProcessingUnitDefinition>
	 */
	public static List<ProcessingUnitDefinition> getprocUnitDefsWithSpecifiedExecutionNeedsOfRunnable(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		List<ProcessingUnitDefinition> procUnitDefs = new ArrayList<ProcessingUnitDefinition>();
		List<RunnableItem> runnableItems = SoftwareUtil.collectRunnableItems(runnable, modes) ;
		
		for(RunnableItem ri : runnableItems) {
			if(ri instanceof ExecutionNeed) {
				ExecutionNeed runnableExecutionNeed = (ExecutionNeed)ri;
				
				procUnitDefs.addAll(runnableExecutionNeed.getExtended().keySet());
			}
		}

		return procUnitDefs;
	}
	
	/**
	 * add Runtime (given as ExecutionNeed) to an existing Runnable
	 * currently without consideration of modes
	 * //TODO: Mode-based API 
	 * @param runnable
	 * @param ExecutionNeeds
	 */
	public static void addRuntimeToRunnable(Runnable runnable, ExecutionNeed executionNeeds) {
		runnable.getRunnableItems().add(executionNeeds);
	}
	
	/**
	 * Create a new Runnable with the given runtime and
	 * create a Callsequence at beginning / end of the given process
	 * @param process
	 * @param ExecutionNeeds
	 */
	public static Runnable addRuntimeToProcessAsNewRunnable(Process process, ExecutionNeed executionNeeds, String runnableName, PositionType positon) {
		
		Runnable run  = AmaltheaFactory.eINSTANCE.createRunnable();
		run.setName(runnableName);
		run.getRunnableItems().add(executionNeeds);
		
		TaskRunnableCall tCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();		
		tCall.setRunnable(run);
		
		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cs.getCalls().add(tCall);
		cs.setName("Call "+runnableName);
				
		if (positon.equals(PositionType.FIRST)) {
			process.getCallGraph().getGraphEntries().add(0, cs);
		} else {
//			process.getCallGraph().getGraphEntries().add(process.getCallGraph().getGraphEntries().size() -1 , cs);
			process.getCallGraph().getGraphEntries().add(cs);
		}
		
		return run;
	}
		
	/**
	 * clears all runtime information, for all procUnitDefs, for all modes
	 * @param runnable
	 * if procUnitDef == null, delete all ExecutionNeed from that runnable that has default ExecutionNeed,
	 * if procUnitDef != null, delete only the extended ExecutionNeed
	 */
	public static void clearRuntimeOfRunnable(Runnable runnable, ProcessingUnitDefinition procUnitDef, EMap<ModeLabel, ModeLiteral> modes) {
		List<ExecutionNeed> executionNeeds = SoftwareUtil.getExecutionNeedsList(runnable, modes);//getExecutionNeedsList(runnable, procUnitDef, modes);
		executionNeeds.remove(null);
		if (procUnitDef == null)
		{
			for (ExecutionNeed executionNeed : executionNeeds){
				runnable.getRunnableItems().remove(executionNeed);
			}			
		}
		else
		{
			for (ExecutionNeed executionNeed : executionNeeds){
				executionNeed.getExtended().removeKey(procUnitDef);
			}
		}
			
	}
	
	/**
	 * Removes all runtimes set in the given process
	 * If the procUnitDef is null, the complete ExecutionNeed is deleted
	 * if it is not null, then only the runtime for the given procUnitDef is removed
	 * @param process
	 */
	public static void clearRuntimeOfProcess(Process process, ProcessingUnitDefinition procUnitDef,  EMap<ModeLabel, ModeLiteral> modes) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		for(Runnable runnable : runnables) {
			clearRuntimeOfRunnable(runnable, procUnitDef, modes);
		}
	}
	
	/**
	 * Removes all runtimes of the whole model
	 * If the procUnitDef is null, the complete ExecutionNeed is deleted
	 * if it is not null, then only the runtime for the given procUnitDef is removed
	 * @param model
	 */
	public static void clearRuntimeOfModel(Amalthea model, ProcessingUnitDefinition procUnitDef, EMap<ModeLabel, ModeLiteral> modes) {
		List<Process> processes = new ArrayList<Process>(); 
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
		for(Process process : processes) {
			clearRuntimeOfProcess(process, procUnitDef, modes);
		}
	}
	
	/**
	 * set the runtime of the given runnable to the given runnable ExecutionNeed
	 * @param runnable
	 * @param ExecutionNeeds
	 */
	public static void setRuntimeOfRunnable(Runnable runnable, ExecutionNeed ExecutionNeeds, ProcessingUnitDefinition procUnitDef, EMap<ModeLabel, ModeLiteral> modes) {
		clearRuntimeOfRunnable(runnable, procUnitDef, modes);
		addRuntimeToRunnable(runnable, ExecutionNeeds);
	}
	
	/**
	 * convert a time into an ExecutionNeed value count
	 * @param core
	 * @param time
	 * @return ExecutionNeed value count
	 */
	public static LongObject getExecutionNeedValueCountForTime(ProcessingUnit core, Time time, HwFeature hwFeature) {
		LongObject needs = AmaltheaFactory.eINSTANCE.createLongObject();
		//double ipc = 1; //core.getDefinition().getExecutionNeedsPerCycle();
		long frequency = (long) HardwareUtil.getFrequencyOfCore(core).getValue();
		double scaleFactor = 1;
		for (HwFeature feature : core.getDefinition().getFeatures()) {
			if (feature.equals(hwFeature)) {
				scaleFactor = feature.getValue();
			}
		}
		
		int power = TimeUnit.VALUES.indexOf(time.getUnit()) - TimeUnit.VALUES.indexOf(TimeUnit.S) ; 
		double factor = Math.pow(1000, power);
		if (factor < 1.0) 
			factor = 1/factor;
		
		double multi = factor/frequency;
		//time to ticks
		double ticks = time.getValue().doubleValue() /multi;
		//ticks with ipc to instrcutions
		needs.setValue((long) (ticks/scaleFactor));
		return needs;
	}
	

		
		
		
	
	
}
