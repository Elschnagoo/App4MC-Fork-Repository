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
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.CustomStimulus;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.Distribution;
import org.eclipse.app4mc.amalthea.model.EventStimulus;
import org.eclipse.app4mc.amalthea.model.GaussDistribution;
import org.eclipse.app4mc.amalthea.model.Instructions;
import org.eclipse.app4mc.amalthea.model.InstructionsConstant;
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation;
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.SporadicStimulus;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.SyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.UniformDistribution;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.WeibullDistribution;
import org.eclipse.app4mc.amalthea.model.WeibullEstimators;
import org.eclipse.app4mc.amalthea.model.WeibullParameters;


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
	 * get the number of instructions that the given process would need to execute
	 * on the given coretype
	 * @param process
	 * @param execTimeType
	 * @param coreType
	 * @param modeLiterals
	 * @return instruction count for given process
	 */
	public static Long getInstructionCountForProcess(Process process, TimeType execTimeType, CoreType coreType, List<ModeLiteral> modeLiterals) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modeLiterals);
		long instructionCount = 0L;
		
		for(Runnable runnable : runnables) {
			instructionCount += getInstructionCountForRunnable(runnable, execTimeType, coreType, modeLiterals);
		}
		
		return instructionCount;
	}	

	/**
	 * get the number of instructions that the given runnable would need to execute
	 * on the given coretype
	 * @param runnable
	 * @param execTimeType
	 * @param coreType
	 * @param modeLiterals
	 * @return instruction count for given runnable
	 */
	public static Long getInstructionCountForRunnable(Runnable runnable, TimeType execTimeType, CoreType coreType, List<ModeLiteral> modeLiterals) {
		List<Instructions> instructionElements = SoftwareUtil.getInstructionsList(runnable, coreType, modeLiterals);
		return getInstructionCountForInstructionList(instructionElements, execTimeType);
	}

	
	
	
	/**
	 * converts a list of Instruction elements into a number (instructions executed)
	 * @param instructionElements
	 * @param execTimeType
	 * @return
	 */
	private static Long getInstructionCountForInstructionList(List<Instructions> instructionElements, TimeType execTimeType) {
		long instructionCount = 0L;
		
		for(Instructions inst : instructionElements) {
			instructionCount = instructionCount + getInstructionCountForInstruction(inst, execTimeType);
		}
		
		return instructionCount;
	}
	
	/**
	 * converts an Instruction element into a number (instructions executed)
	 * @param instruction
	 * @param execTimeType
	 * @return
	 */
	private static Long getInstructionCountForInstruction(Instructions instruction, TimeType execTimeType) {
		if(instruction instanceof InstructionsDeviation) {
			InstructionsDeviation instDeviation = (InstructionsDeviation)instruction;
			switch(execTimeType) {
			case ACET: 
				return getMean(instDeviation.getDeviation().getDistribution(), instDeviation.getDeviation().getLowerBound().getValue(), instDeviation.getDeviation().getUpperBound().getValue());
			case BCET:
				return instDeviation.getDeviation().getLowerBound().getValue();
			case WCET:
				return instDeviation.getDeviation().getUpperBound().getValue();
			
			}
		} else if(instruction instanceof InstructionsConstant) {
			return ((InstructionsConstant)instruction).getValue();
		}
		return 0L;
	}

	
	/**
	 * get a map that contains the instructionCounts for all (in the runnables) specified coreTypes
	 * @param process
	 * @param execTimeType
	 * @param modeLiterals
	 * @return map CoreType->Instruction count of the extended instructions of the process 
	 */
	public static HashMap<CoreType, Long> getInstructionCountExtendedForProcess(Process process, TimeType execTimeType, List<ModeLiteral> modeLiterals) {
		HashMap<CoreType, Long> coreTypeToIcMap = new HashMap<CoreType, Long>();
		
		for(Runnable runnable : SoftwareUtil.getRunnableList(process, modeLiterals)) {
			HashMap<CoreType, Long> map = getInstructionCountExtendedForRunnable(runnable, execTimeType, modeLiterals);
			
			for(CoreType ct : map.keySet()) {
				Long ic = 0L;
				if(coreTypeToIcMap.get(ct) != null) {
					ic = coreTypeToIcMap.get(ct);
				}
				ic += map.get(ct);
				
				coreTypeToIcMap.put(ct, ic);
			}
		}
			
		return coreTypeToIcMap;
	}
		
	
	/**
	 * get a map that contains the instructionCounts for all specified coreTypes
	 * 
	 * @param runnable
	 * @param execTimeType
	 * @param modeLiterals
	 * @return map CoreType->Instruction count of the extended instructions of the runnable
	 */
	public static HashMap<CoreType, Long> getInstructionCountExtendedForRunnable(Runnable runnable, TimeType execTimeType, List<ModeLiteral> modeLiterals) {
		HashMap<CoreType, Long> coreTypeToIcMap = new HashMap<CoreType, Long>();
		

		for(RunnableInstructions runnableInstruction : SoftwareUtil.getRunnableInstructionsList(runnable, modeLiterals)) {
			if(runnableInstruction.getExtended() != null) {
				for(CoreType ct : runnableInstruction.getExtended().keySet()) {
					Long ic = 0L;
					if(coreTypeToIcMap.get(ct) != null) {
						ic = coreTypeToIcMap.get(ct);
					}
					ic += getInstructionCountForInstruction(runnableInstruction.getExtended().get(ct), execTimeType);
					
					coreTypeToIcMap.put(ct, ic);
				}
			}
			
			if(runnableInstruction.getDefault() != null) {
				Long ic = 0L;
				if(coreTypeToIcMap.get(null) != null) {
					ic = coreTypeToIcMap.get(null);
				}
				ic += getInstructionCountForInstruction(runnableInstruction.getDefault(), execTimeType);
				
				coreTypeToIcMap.put(null, ic);
			}
		}

		return coreTypeToIcMap;
	}

	/**
	 * get the execution time for the given process on the given core
	 * @param process
	 * @param execTimeType
	 * @return execution Time of the given process
	 */
	public static Time getExecutionTimeForProcess(Process process, TimeType execTimeType, Core core, List<ModeLiteral> modeLiterals) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modeLiterals);
		Time executionTime = AmaltheaFactory.eINSTANCE.createTime();
		executionTime.setValue(new BigInteger("0"));
		executionTime.setUnit(TimeUnit.MS);
		
		for(Runnable runnable : runnables) {
			if(runnable != null) {
				executionTime = TimeUtil.addTimes(executionTime, getExecutionTimeForRunnable(runnable, execTimeType, core, modeLiterals));
			}
		}
		
		return executionTime;
	}

	/**
	 * get the execution time for the given runnable on the given core
	 * @param runnable
	 * @param execTimeType
	 * @return execution time of the given runnable
	 */
	public static Time getExecutionTimeForRunnable(Runnable runnable, TimeType execTimeType, Core core, List<ModeLiteral> modeLiterals) {
		long instructionCount = getInstructionCountForRunnable(runnable, execTimeType, core.getCoreType(), modeLiterals);
		
		float ipc = core.getCoreType().getInstructionsPerCycle();
		long frequency = HardwareUtil.getFrequencyOfCore(core);
		
	  	Time executionTime =  FactoryUtil.createTime(instructionCount, ipc, frequency);
		return executionTime;
	}
	

	/**
	 * get a map that contains the execution for all core for which a coreType has specified runtime
	 * 
	 * @param model
	 * @param process
	 * @param execTimeType
	 * @param modeLiterals
	 * @return  map Core->Execution time of the extended instructions of the process
	 */
	public static HashMap<Core, Time> getExecutionTimeExtendedForProcess(Amalthea model, Process process, TimeType execTimeType, List<ModeLiteral> modeLiterals) {
		HashMap<Core, Time> executionTimes = new HashMap<>();
		
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modeLiterals);
		
		for(Runnable runnable : runnables) {
			if(runnable != null) {
				Map<Core, Time> map = getExecutionTimeExtendedForRunnable(model, runnable, execTimeType, modeLiterals);
				for(Core c : map.keySet()) {
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
	 * Gets execution times for given runnable on all possible cores (with specified coreType)
	 * @param model
	 * @param runnable
	 * @param execTimeType
	 * @param modeLiterals
	 * @return  map Core->Execution time of the extended instructions of the process for all possible cores
	 */
	public static Map<Core, Time> getExecutionTimeExtendedForRunnable(Amalthea model, Runnable runnable, TimeType execTimeType, List<ModeLiteral> modeLiterals) {
		HashMap<Core, Time> executionTimes = new HashMap<>();
		
		HashMap<CoreType, Long> coreTypeToInstructionCountMap = getInstructionCountExtendedForRunnable(runnable, execTimeType, modeLiterals);
		
		for(CoreType ct : coreTypeToInstructionCountMap.keySet()) {
			List<Core> coreWithGivenCoreType = HardwareUtil.getAllCoresForCoreType(model, ct);
			
			for(Core core : coreWithGivenCoreType) {
				executionTimes.put(core, getExecutionTimeForInstructionCount(coreTypeToInstructionCountMap.get(ct), core, null));
			}
		}
		
		
		
		
		
		return executionTimes;
	}





	/**
	 * convert a number (instructions) into execution time on the given core
	 * @param runnable
	 * @param execTimeType
	 * @return time on given core for given instruction count 
	 */
	public static Time getExecutionTimeForInstructionCount(long instructionCount, Core core, List<ModeLiteral> modeLiterals) {
		float ipc = core.getCoreType().getInstructionsPerCycle();
		long frequency = HardwareUtil.getFrequencyOfCore(core);

	  	Time executionTime =  FactoryUtil.createTime(instructionCount, ipc, frequency);
		return executionTime;
	}
	
	/**
	 * Calculates the utilization for a given core 
	 * @param core
	 * @param model
	 * @param tt
	 * @param modeLiterals (optional) - null works
	 * @return utilization of that core
	 */
	public static double getCoreUtilization(Core core, Amalthea model, TimeType tt, List<ModeLiteral> modeLiterals) {
		double utilization = 0.0;
		
		for(Process proc : DeploymentUtil.getProcessesMappedToCore(core, model)) {
			utilization += getProcessUtilization(proc, core, model, tt, modeLiterals);
		}
		
		return utilization;
	}	
	
	
	/**
	 * Calculates the utilization for a given process
	 * @param process
	 * @param model
	 * @param tt
	 * @param modeLiterals (optional) - null works
	 * @return map core -> utilization
	 */
	public static Map<Core, Double> getProcessUtilization(Process process, Amalthea model, TimeType tt, List<ModeLiteral> modeLiterals) {
		HashMap<Core, Double> utilizations = new HashMap<>(); 
		
		
		Set<Core> cores = DeploymentUtil.getAssignedCoreForProcess(process, model);
		
		for(Core core : cores) {
			double utilization = getProcessUtilization(process, core, model, tt, modeLiterals);
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
	 * @param modeLiterals (optional) - if none apply, null should be given
	 * @return utilization
	 */
	public static double getProcessUtilization(Process process, Core core, Amalthea model, TimeType tt, List<ModeLiteral> modeLiterals) {
		double utilization = 0.0;
		
		List<Time> periods = getPeriodsOfProcess(model, process, tt, modeLiterals);
		Time time = getExecutionTimeForProcess(process, tt, core, modeLiterals);
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
	 * @param modeLiterals
	 * @return utilization
	 */
	public static double getProcessUtilization(Process process, Time period, Core core, Amalthea model, TimeType tt, List<ModeLiteral> modeLiterals) {
		Time time = getExecutionTimeForProcess(process, tt, core, modeLiterals);
		double utilization = (TimeUtil.divideTimes(time, period));
		return utilization;
	}


	/**
	 * Returns the cumulative process utilization, i.e. runtime on every core summed up
	 * @param model
	 * @param tt
	 * @param modeLiterals
	 * @return map process -> sum of utilization on all cores
	 */
	public static Map<Process, Double> getCumulativeProcessUtilizations(Amalthea model, TimeType tt, List<ModeLiteral> modeLiterals) {
		HashMap<Process, Double> utilizations = new HashMap<>();
		
		List<Process> procs = new ArrayList<Process>();
		procs.addAll(model.getSwModel().getTasks());
		procs.addAll(model.getSwModel().getIsrs());
		
		for(Process proc : procs) {
			Map<Core, Double> processUtilization = getProcessUtilization(proc, model, tt, modeLiterals);
			double util = 0.0;
			for(Core c : processUtilization.keySet()) {
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
	public static Map<Process, List<Time>> getPeriodsOfAllProcesses(Amalthea model, TimeType tt, List<ModeLiteral> modeLiterals) {
		Map<Process, List<Time>> result = new HashMap<>();
		
		List<Process> processes = new ArrayList<Process>(); 
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
		for(Process process : processes) {
			List<Time> periods = getPeriodsOfProcess(model, process, tt, modeLiterals);	
			result.put(process, periods);
		}
		
		return result;
	}

	/**
	 * 	Returns a list of all triggering periods. Sorted by shortest period first!
	 * @param model
	 * @param process
	 * @param tt
	 * @param modeLiterals
	 * @return
	 */
	public static List<Time> getPeriodsOfProcess(Amalthea model, Process process, TimeType tt, List<ModeLiteral> modeLiterals) {
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
				/*for(Runnable runnable : getRunnableListOfProcess(process, modeLiterals)) {
					for(Runnable caller : model.getSwModel().getRunnables()) {
						Set<ServerCall> serverCallsOfRunnable = getServerCallsOfRunnable(caller, modeLiterals);
						for(ServerCall sc : serverCallsOfRunnable) {
							if(sc.getServerRunnable() != null && sc.getServerRunnable().equals(runnable)) {
								//we have found a serverCall from "caller" to "runnable" -> add Periods of Processes of Caller to list
								List<Process> processesOfRunnable = getProcessesOfRunnable(caller, modeLiterals);
								for(Process callerProcess : processesOfRunnable) {
									result.addAll(getPeriods(model, callerProcess, tt, modeLiterals));
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
				Map<Process,Long> triggeringProcesses = getTriggeringProcesses(model, ip, modeLiterals);
				if(triggeringProcesses.containsKey(process)) {
					//TODO decided what to do with self triggering processes
					triggeringProcesses.remove(process);
				}
				
				for(Process triggeringProcess : triggeringProcesses.keySet()) {
					//System.out.println("    --triggered by "+triggeringProcess.getName());
//					InterProcessActivation ipa = getIpaForStimulus(stimulus, triggeringProcess, modeLiterals);
					List<Time> periods = getPeriodsOfProcess(model, triggeringProcess, tt, modeLiterals);
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
				VariableRateStimulus pe = ((VariableRateStimulus)stimulus);
				//System.out.println(s);
				Time time = null;
				switch(tt) {
				case ACET:	
					if(pe.getStimulusDeviation() != null) {
						time = getMean(pe.getStimulusDeviation());
					}
					break;
				case BCET:
					if(pe.getStimulusDeviation() != null) {
						time = pe.getStimulusDeviation().getUpperBound();
					}
					break;
				case WCET:
					if(pe.getStimulusDeviation() != null) {
						time = pe.getStimulusDeviation().getLowerBound();
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
			} else if(stimulus instanceof SporadicStimulus) {
				SporadicStimulus s = ((SporadicStimulus)stimulus);
				Time time = null;
				switch(tt) {
				case ACET:
					if(s.getStimulusDeviation() != null) {
						time = getMean(s.getStimulusDeviation());
					}
					break;
				case BCET:
					if(s.getStimulusDeviation() != null) {
						time = (s.getStimulusDeviation().getUpperBound());
					}
					break;
				case WCET:
					if(s.getStimulusDeviation() != null) {
						time = (s.getStimulusDeviation().getLowerBound());
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
			} else if(stimulus instanceof SyntheticStimulus) {
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
	 * @param modeLiterals
	 * @return map process -> prescaler value
	 */
	public static Map<Process,Long> getTriggeringProcesses(Amalthea model, InterProcessStimulus ip, List<ModeLiteral> modeLiterals) {
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
	public static HashMap<Stimulus, Long> getTriggeredStimuli(Process process, List<ModeLiteral> modeLiterals) {
		HashMap<Stimulus, Long> stimuliMap = new HashMap<Stimulus, Long>();
		List<InterProcessTrigger> interProcessTriggers = SoftwareUtil.collectCalls(process, modeLiterals, s -> s instanceof InterProcessTrigger).stream().map(s -> (InterProcessTrigger)s).collect(Collectors.toList());

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
	public static Map<Process, List<Time>> getProcessesWithSporadicStimulus(Amalthea model, TimeType tt) {
		Set<Process> processes = new HashSet<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
		Map<Process, List<Time>> result = processes.stream().collect(
				Collectors.toMap(p -> p, p -> p.getStimuli().stream().filter(s -> (s instanceof SporadicStimulus))
				.map(s -> getActivationTimeFromDeviation(((SporadicStimulus)s).getStimulusDeviation(), tt))
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
	public static Map<Process, List<Deviation<Time>>> getProcessesWithSporadicStimulus(Amalthea model) {
		List<Process> processes = new ArrayList<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		processes.stream().filter(p -> p.getStimuli().stream().filter(s -> (s instanceof SporadicStimulus)).collect(Collectors.toList()).size() > 0 );
		
		Map<Process, List<Deviation<Time>>> result = processes.stream().collect(
				Collectors.toMap(p -> p, p -> p.getStimuli().stream().filter(s -> (s instanceof SporadicStimulus))
				.map(s -> ((SporadicStimulus)s).getStimulusDeviation())
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
				} else if(stimulus instanceof SporadicStimulus) {
					SporadicStimulus s = ((SporadicStimulus)stimulus);
					map.put(s, depthCounter);
				} else if(stimulus instanceof SyntheticStimulus) {
					SyntheticStimulus p = ((SyntheticStimulus)stimulus);
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
		if(stimulus instanceof SporadicStimulus) {
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
	 * This method returns a list of all coreTypes for which the given runnable
	 * contains runtime in a RunnableInstruction element
	 * @param runnable
	 * @param execTimeType
	 * @param modeLiterals
	 * @return List<CoreType>
	 */
	public static List<CoreType> getCoreTypesWithSpecifiedInstructionsOfRunnable(Runnable runnable, List<ModeLiteral> modeLiterals) {
		List<CoreType> coreTypes = new ArrayList<CoreType>();
		List<RunnableItem> runnableItems = SoftwareUtil.collectRunnableItems(runnable, modeLiterals) ;
		
		for(RunnableItem ri : runnableItems) {
			if(ri instanceof RunnableInstructions) {
				RunnableInstructions runnableInstruction = (RunnableInstructions)ri;
				
				coreTypes.addAll(runnableInstruction.getExtended().keySet());
			}
		}

		return coreTypes;
	}
	
	/**
	 * add Runtime (given as RunnableInstructions) to an existing Runnable
	 * currently without consideration of modes
	 * //TODO: Mode-based API 
	 * @param runnable
	 * @param instructions
	 */
	public static void addRuntimeToRunnable(Runnable runnable, RunnableInstructions instructions) {
		runnable.getRunnableItems().add(instructions);
	}
	
	/**
	 * Create a new Runnable with the given runtime and
	 * create a Callsequence at beginning / end of the given process
	 * @param process
	 * @param instructions
	 */
	public static Runnable addRuntimeToProcessAsNewRunnable(Process process, RunnableInstructions instructions, String runnableName, PositionType positon) {
		
		Runnable run  = AmaltheaFactory.eINSTANCE.createRunnable();
		run.setName(runnableName);
		run.getRunnableItems().add(instructions);
		
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
	 * clears all runtime information, for all coreTypes, for all modes
	 * @param runnable
	 * if coreType == null, delete all InstructionRunnable from that runnable that has default Instruction,
	 * if coreType != null, delete only the extended instruction
	 */
	public static void clearRuntimeOfRunnable(Runnable runnable, CoreType coreType, List<ModeLiteral> modeLiterals) {
		List<Instructions> instructionElements = SoftwareUtil.getInstructionsList(runnable, coreType, modeLiterals);
		instructionElements.remove(null);
		if (coreType == null)
		{
			for (Instructions instr : instructionElements){
				runnable.getRunnableItems().remove(instr.eContainer());
			}			
		}
		else
		{
			for (Instructions instr : instructionElements){
				if (!(instr.eContainer() instanceof RunnableInstructions)) {
					
					((RunnableInstructions)((instr.eContainer().eContainer()))).getExtended().removeKey(instr);
				}
			}			
		}
		
			
	}
	
	/**
	 * Removes all runtimes set in the given process
	 * If the coreType is null, the complete RunnableInstruction is deleted
	 * if it is not null, then only the runtime for the given coretype is removed
	 * @param process
	 */
	public static void clearRuntimeOfProcess(Process process, CoreType coreType,  List<ModeLiteral> modeLiterals) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modeLiterals);
		for(Runnable runnable : runnables) {
			clearRuntimeOfRunnable(runnable, coreType, modeLiterals);
		}
	}
	
	/**
	 * Removes all runtimes of the whole model
	 * If the coreType is null, the complete RunnableInstruction is deleted
	 * if it is not null, then only the runtime for the given coretype is removed
	 * @param model
	 */
	public static void clearRuntimeOfModel(Amalthea model, CoreType coreType, List<ModeLiteral> modeLiterals) {
		List<Process> processes = new ArrayList<Process>(); 
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		
		for(Process process : processes) {
			clearRuntimeOfProcess(process, coreType, modeLiterals);
		}
	}
	
	/**
	 * set the runtime of the given runnable to the given runnable instruction
	 * @param runnable
	 * @param instructions
	 */
	public static void setRuntimeOfRunnable(Runnable runnable, RunnableInstructions instructions, CoreType coreType, List<ModeLiteral> modeLiteral) {
		clearRuntimeOfRunnable(runnable, coreType, modeLiteral);
		addRuntimeToRunnable(runnable, instructions);
	}
	
	/**
	 * convert a time into an instruction count
	 * @param core
	 * @param time
	 * @return instruction count
	 */
	public static LongObject getInstructionCountForTime(Core core, Time time) {
		LongObject instructions = AmaltheaFactory.eINSTANCE.createLongObject();
		double ipc = core.getCoreType().getInstructionsPerCycle();
		long frequency = HardwareUtil.getFrequencyOfCore(core);
		int power = TimeUnit.VALUES.indexOf(time.getUnit()) - TimeUnit.VALUES.indexOf(TimeUnit.S) ; 
		double factor = Math.pow(1000, power);
		if (factor < 1.0) 
			factor = 1/factor;
		
		double multi = factor/frequency;
		//time to ticks
		double ticks = time.getValue().doubleValue() /multi;
		//ticks with ipc to instrcutions
		instructions.setValue((long) (ticks/ipc));
		return instructions;
	}
	
	
}
