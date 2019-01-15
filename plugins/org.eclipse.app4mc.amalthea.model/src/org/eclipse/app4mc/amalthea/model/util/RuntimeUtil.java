package org.eclipse.app4mc.amalthea.model.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CustomStimulus;
import org.eclipse.app4mc.amalthea.model.EventStimulus;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Frequency;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.InterProcessStimulus;
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.RelativePeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.SingleStimulus;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.ITimeDeviation;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.emf.common.util.EMap;

public class RuntimeUtil {
	
	public static enum TimeType {
		BCET, ACET, WCET
	}

	public static enum PositionType {
		FIRST, LAST
	}

	public static enum AccessDirection {
		READ, WRITE
	}
	
	
	public static Time getExecutionTimeForProcess(Process process, EMap<ModeLabel, ModeLiteral> modes, TimeType executionCase) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();
		result.setUnit(TimeUnit.MS);
		result.setValue(BigInteger.ZERO);
		Set<ProcessingUnit> processingUnits = DeploymentUtil.getAssignedCoreForProcess(process, (Amalthea) process.eContainer().eContainer());
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		if (processingUnits.size() == 1) {
			ProcessingUnit processingUnit = processingUnits.iterator().next(); 
			for (Runnable runnable : runnables ) {
				result.add(getExecutionTimeForRunnable(runnable, processingUnit, modes, executionCase));
			}
		}
		else {
			System.out.println("Mapping unclear. Process mapped to "+processingUnits.size()+" Cores - Use PU specific method");
		}
		return result;
	}
	
	public Time getExecutionTimeForProcess(Process process, ProcessingUnit processingUnit, EMap<ModeLabel, ModeLiteral> modes, TimeType executionCase) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();
		result.setUnit(TimeUnit.MS);
		result.setValue(BigInteger.ZERO);
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		for (Runnable runnable : runnables ) {
			result.add(getExecutionTimeForRunnable(runnable,processingUnit, modes, executionCase));
		}
		return result;
	}
	
	public static Time getExecutionTimeForRunnable(Runnable runnable, ProcessingUnit processingUnit, EMap<ModeLabel,  ModeLiteral> modes, TimeType executionCase) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();

// FIXME
//		List<Ticks> tickList = SoftwareUtil.getTicks(runnable, modes);
//		if (!tickList.isEmpty()) {												//Simon 11.01.2019:	I think, this check is unnecessary. if the list is empty, the for loop won't be used
//			for (Ticks tick : tickList) {
//				result.add(getExecutionTimeForTicks(tick, processingUnit, executionCase));
//			}
//		}

		List<ExecutionNeed> executionNeedList = SoftwareUtil.getExecutionNeeds(runnable, modes);		
		if (!executionNeedList.isEmpty()) {
			for (ExecutionNeed executionNeeds : executionNeedList) {
				result.add(getExecutionTimeForExecutionNeeds(executionNeeds, processingUnit, executionCase));
			}
		}
		return result;			
	}
	
	
	//Simon 11.01.2019: Idea/Discussion: Why ist TimeType needed here? If an extended tick is given, probably also a ITimeDeviation shall be returned? (I guess, this heavily depends on the use case) --> Second step would now then be ITimeDeviation + TimeType -> Time
	public static Time getExecutionTimeForTicks(Ticks tick, ProcessingUnit processingUnit, TimeType executionCase) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();
		if (tick.getExtended().get(processingUnit.getDefinition()) != null) {
			IDiscreteValueDeviation IDiscreteValueDeviation = tick.getExtended().get(processingUnit.getDefinition());
			result = getExecutionTimeForTickDiscreteDistribution(IDiscreteValueDeviation, processingUnit, executionCase);
		}
		else {
			result = getExecutionTimeForTickDiscreteDistribution(tick.getDefault(), processingUnit, executionCase);
		}
		return result;
	}
	
	public static Time getExecutionTimeForExecutionNeeds(ExecutionNeed executionNeeds, ProcessingUnit processingUnit, TimeType executionCase) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();
		HWModel hwModel = (HWModel) processingUnit.getDefinition().eContainer();
		for (Entry<String, IDiscreteValueDeviation> need : executionNeeds.getNeeds()) {
			Set<HwFeatureCategory> hwFeatureCategory = (Set<HwFeatureCategory>) AmaltheaIndex.getElements(hwModel, need.getKey(), HwFeatureCategory.class);
			if (hwFeatureCategory.size() == 1) {
				result = getExecutionTimeForExecutionNeedEntry(need.getValue(), hwFeatureCategory.iterator().next(), processingUnit, executionCase);
			}
			else {
				//should not happen since name is unique identifier
				System.out.println("Mutliple Categories with the same name: "+need.getKey());
			}
		}
		return result;
	}
	
	public static Time getExecutionTimeForExecutionNeedEntry(IDiscreteValueDeviation IDiscreteValueDeviation, HwFeatureCategory hwFeatureCategory, ProcessingUnit processingUnit, TimeType executionCase) {
		double ticks = 0d;
		switch (executionCase) {
		case  BCET:
			ticks = IDiscreteValueDeviation.getLowerBound().doubleValue();
		case  ACET:
			ticks = IDiscreteValueDeviation.getAverage();
		case  WCET:
			ticks = IDiscreteValueDeviation.getUpperBound().doubleValue();
		}
		double scaleFactor = 0;
		for (HwFeature feature : processingUnit.getDefinition().getFeatures()) {
			if (feature.getContainingCategory().equals(hwFeatureCategory)) {
				scaleFactor = feature.getValue();
			}
		}
		ticks = ticks*scaleFactor;
		Time result = getExecutionTimeForCycles(ticks, processingUnit.getFrequencyDomain().getDefaultValue());
		return result;
	}
	
	public static Time getExecutionTimeForTickDiscreteDistribution(IDiscreteValueDeviation IDiscreteValueDeviation, ProcessingUnit processingUnit, TimeType executionCase) {
		double ticks = 0d;
		switch (executionCase) {
		case  BCET:
			ticks = IDiscreteValueDeviation.getLowerBound().doubleValue();
		case  ACET:
			ticks = IDiscreteValueDeviation.getAverage();
		case  WCET:
			ticks = IDiscreteValueDeviation.getUpperBound().doubleValue();
		}
		Time result = getExecutionTimeForCycles(ticks, processingUnit.getFrequencyDomain().getDefaultValue());
		return result;
	}
	
	
	public static Time getExecutionTimeForCycles (Double ticks, Frequency puFrequency) {
		Time result = AmaltheaFactory.eINSTANCE.createTime();
		Long frequencyValue = AmaltheaServices.convertToHertz(puFrequency).longValue();
		int timeUnitIndex = 0;
		while(frequencyValue % 1000 == 0 && (frequencyValue > 0)) {		//as long as frequency is multiple of 1000
			timeUnitIndex++;
			frequencyValue = frequencyValue / 1000L;
		}
		double runtime = ((double)ticks) / ((double)frequencyValue);
		result.setValue(BigInteger.valueOf(Math.round(runtime)));
		switch (timeUnitIndex) {
			case 0:
				result.setUnit(TimeUnit.S);
			case 1:
				result.setUnit(TimeUnit.MS);
			case 2:
				result.setUnit(TimeUnit.US);
			case 3:
				result.setUnit(TimeUnit.NS);
			case 4:
				result.setUnit(TimeUnit.PS);
		}
		result = AmaltheaServices.adjustTimeUnit(result);
		return result;
	}
	
	//TODO: Time to ticks?
	
	
	/**
	 * set the runtime of the given runnable to the given runnable ExecutionNeed
	 * 
	 * @param runnable
	 * @param ExecutionNeeds
	 */
	public static void setRuntimeOfRunnable(Runnable runnable, ExecutionNeed ExecutionNeeds, EMap<ModeLabel, ModeLiteral> modes) {
		clearRuntimeOfRunnable(runnable,  modes);
		addRuntimeToRunnable(runnable, ExecutionNeeds);
	}
	
	/**
	 * set the runtime of the given runnable to the given runnable ExecutionNeed
	 * 
	 * @param runnable
	 * @param ExecutionNeeds
	 */
	public static void setRuntimeOfRunnable(Runnable runnable, Ticks ticks, EMap<ModeLabel, ModeLiteral> modes) {
		clearRuntimeOfRunnable(runnable,  modes);
		addRuntimeToRunnable(runnable, ticks);
	}
	
	
	/**
	 * Adds Runtime (given as ExecutionNeed) to an existing Runnable currently
	 * without consideration of modes //TODO: Mode-based API
	 * 
	 * @param runnable
	 * @param executionNeeds
	 */
	public static void addRuntimeToRunnable(Runnable runnable, ExecutionNeed executionNeeds) {
		runnable.getRunnableItems().add(executionNeeds);
	}
	
	
	public static void addRuntimeToRunnable(Runnable runnable, Ticks ticks) {
		runnable.getRunnableItems().add(ticks);
	}
	
	
	/**
	 * Removes all runtimes of the whole model If the procUnitDef is null, the
	 * complete ExecutionNeed is deleted if it is not null, then only the runtime
	 * for the given procUnitDef is removed
	 * 
	 * @param model
	 */
	public static void clearRuntimeOfModel(Amalthea model, EMap<ModeLabel, ModeLiteral> modes) {
		List<Process> processes = new ArrayList<Process>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());

		for (Process process : processes) {
			clearRuntimeOfProcess(process, modes);
		}
	}
	
	
	/**
	 * Removes all runtimes set in the given process If the procUnitDef is null, the
	 * complete ExecutionNeed is deleted if it is not null, then only the runtime
	 * for the given procUnitDef is removed
	 * 
	 * @param process
	 */
	public static void clearRuntimeOfProcess(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		List<Runnable> runnables = SoftwareUtil.getRunnableList(process, modes);
		for (Runnable runnable : runnables) {
			clearRuntimeOfRunnable(runnable, modes);
		}
	}
	
	/**
	 * Clears all runtime information
	 * 
	 * @param runnable
	 *            if procUnitDef == null, delete all ExecutionNeed from that
	 *            runnable that has default ExecutionNeed, if procUnitDef != null,
	 *            delete only the extended ExecutionNeed
	 */
	public static void clearRuntimeOfRunnable(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		List<ExecutionNeed> executionNeeds = SoftwareUtil.getExecutionNeeds(runnable, modes);
		executionNeeds.remove(null);
		for (ExecutionNeed executionNeed : executionNeeds) {
			runnable.getRunnableItems().remove(executionNeed);
		}
// FIXME		
//		List<Ticks> ticks = SoftwareUtil.getTicks(runnable, modes);
//		ticks.remove(null);
//		
//		for (Ticks tick : ticks) {
//			runnable.getRunnableItems().remove(tick);
//		}

	}
	
	
	/**
	 * Creates a new Runnable with the given runtime and create a CallSequence at
	 * beginning / end of the given process
	 * 
	 * @param process
	 * @param executionNeeds
	 */
	public static Runnable addRuntimeToProcessAsNewRunnable(Process process, ExecutionNeed executionNeeds, String runnableName, PositionType positon) {

		Runnable run = AmaltheaFactory.eINSTANCE.createRunnable();
		run.setName(runnableName);
		run.getRunnableItems().add(executionNeeds);

		TaskRunnableCall tCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		tCall.setRunnable(run);

		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cs.getCalls().add(tCall);
		cs.setName("Call " + runnableName);

		if (positon.equals(PositionType.FIRST)) {
			process.getCallGraph().getGraphEntries().add(0, cs);
		} else {
			// process.getCallGraph().getGraphEntries().add(process.getCallGraph().getGraphEntries().size()
			// -1 , cs);
			process.getCallGraph().getGraphEntries().add(cs);
		}

		return run;
	}		
	
	
	/**
	 * Creates a new Runnable with the given runtime and create a CallSequence at
	 * beginning / end of the given process
	 * 
	 * @param process
	 * @param executionNeeds
	 */
	public static Runnable addRuntimeToProcessAsNewRunnable(Process process, Ticks ticks, String runnableName, PositionType positon) {

		Runnable run = AmaltheaFactory.eINSTANCE.createRunnable();
		run.setName(runnableName);
		run.getRunnableItems().add(ticks);

		TaskRunnableCall tCall = AmaltheaFactory.eINSTANCE.createTaskRunnableCall();
		tCall.setRunnable(run);

		CallSequence cs = AmaltheaFactory.eINSTANCE.createCallSequence();
		cs.getCalls().add(tCall);
		cs.setName("Call " + runnableName);

		if (positon.equals(PositionType.FIRST)) {
			process.getCallGraph().getGraphEntries().add(0, cs);
		} else {
			// process.getCallGraph().getGraphEntries().add(process.getCallGraph().getGraphEntries().size()
			// -1 , cs);
			process.getCallGraph().getGraphEntries().add(cs);
		}

		return run;
	}		
	
	
	//#######################################################

	
	/**
	 * Calculates the utilization for a given procUnit
	 * 
	 * @param procUnit
	 * @param model
	 * @param tt
	 * @param modes
	 *            (optional) - null works
	 * @return utilization of that procUnit
	 */
	public static double getprocUnitUtilization(ProcessingUnit procUnit, Amalthea model, TimeType tt,		//Simon 11.01.2019: getProcUnitUtilization (capital "P")
			List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		double utilization = 0.0;

		for (Process proc : DeploymentUtil.getProcessesMappedToCore(procUnit, model)) {
			utilization += getProcessUtilization(proc, procUnit, model, tt, hwFeatures, modes);
		}

		return utilization;
	}

	/**
	 * Calculates the utilization for a given process
	 * 
	 * @param process
	 * @param model
	 * @param tt
	 * @param hwFeatures
	 * @param modes
	 *            (optional) - null works
	 * @return map procUnit -&gt; utilization
	 */
	public static Map<ProcessingUnit, Double> getProcessUtilization(Process process, Amalthea model, TimeType tt,
			List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<ProcessingUnit, Double> utilizations = new HashMap<>();

		Set<ProcessingUnit> procUnits = DeploymentUtil.getAssignedCoreForProcess(process, model);

		for (ProcessingUnit procUnit : procUnits) {
			double utilization = getProcessUtilization(process, procUnit, model, tt, hwFeatures, modes);
			utilizations.put(procUnit, utilization);
		}

		return utilizations;
	}

	/**
	 * Calculates the utilization for a given process on a given procUnit Assumption
	 * (wrong): All triggers activate the process on all procUnits together! (at the
	 * same time)
	 * 
	 * @param process
	 * @param procUnit
	 * @param model
	 * @param tt
	 * @param hwFeatures
	 * @param modes
	 *            (optional) - if none apply, null should be given
	 * @return utilization
	 */
	public static double getProcessUtilization(Process process, ProcessingUnit procUnit, Amalthea model, TimeType tt,
			List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		double utilization = 0.0;

		List<Time> periods = getPeriodsOfProcess(model, process, tt, modes);
		Time time = getExecutionTimeForProcess(process, modes, tt);
		if (time.getValue().compareTo(new BigInteger("0")) < 0) {
			System.err.println("execTime " + time);
		}
		for (Time period : periods) {
			// System.out.println(process.getName() + " Period:
			// "+TimeUtil.timeToString(period) + " ET: "+TimeUtil.timeToString(time));
			if (period != null && period.getValue().intValue() != 0) {
				utilization += time.divide(period);
			}
		}

		return utilization;
	}

	/**
	 * Calculates the process utilization
	 * 
	 * @param process
	 * @param period
	 * @param procUnit
	 * @param model
	 * @param tt
	 * @param modes
	 * @return utilization
	 */
	public static double getProcessUtilization(Process process, Time period, TimeType tt, EMap<ModeLabel, ModeLiteral> modes) {
		Time time = getExecutionTimeForProcess(process, modes, tt);
		return time.divide(period);
	}

	/**
	 * Returns the cumulative process utilization, i.e. runtime on every procUnit summed
	 * up
	 * 
	 * @param model
	 * @param tt
	 * @param hwFeatures
	 * @param modes
	 * @return map process -&gt; sum of utilization on all procUnits
	 */
	public static Map<Process, Double> getCumulativeProcessUtilizations(Amalthea model, TimeType tt,
			List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Process, Double> utilizations = new HashMap<>();

		List<Process> procs = new ArrayList<Process>();
		procs.addAll(model.getSwModel().getTasks());
		procs.addAll(model.getSwModel().getIsrs());

		for (Process proc : procs) {
			Map<ProcessingUnit, Double> processUtilization = getProcessUtilization(proc, model, tt, hwFeatures, modes);
			double util = 0.0;
			for (ProcessingUnit c : processUtilization.keySet()) {
				util += processUtilization.get(c);
			}
			utilizations.put(proc, util);
		}

		return utilizations;
	}

	/**
	 * gets all Period ranges from the model
	 * 
	 * @param model
	 * @param tt
	 * @param modes
	 */
	public static Map<Process, List<Time>> getPeriodsOfAllProcesses(Amalthea model, TimeType tt,
			EMap<ModeLabel, ModeLiteral> modes) {
		Map<Process, List<Time>> result = new HashMap<>();

		List<Process> processes = new ArrayList<Process>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());

		for (Process process : processes) {
			List<Time> periods = getPeriodsOfProcess(model, process, tt, modes);
			result.put(process, periods);
		}

		return result;
	}

	/**
	 * Returns a list of all triggering periods. Sorted by shortest period first!
	 * 
	 * @param model
	 * @param process
	 * @param tt
	 * @param modes
	 */
	public static List<Time> getPeriodsOfProcess(Amalthea model, Process process, TimeType tt,
			EMap<ModeLabel, ModeLiteral> modes) {
		List<Time> result = new ArrayList<Time>();
		// System.out.println(process.getName());
		for (Stimulus stimulus : process.getStimuli()) {
			// System.out.println(" Stimulus "+stimulus);
			if (stimulus instanceof PeriodicStimulus) {
				PeriodicStimulus p = ((PeriodicStimulus) stimulus);
				result.add(p.getRecurrence());
				} else if (stimulus instanceof ArrivalCurveStimulus) {			//Simon 11.01.2019: TODO
					switch (tt) {
				case ACET:
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if (stimulus instanceof CustomStimulus) {					//Simon 11.01.2019: remove the comment! This was a test for het systems with synchronous server calls
				// check if task is serverTask of async/sync-ServerCalls
				/*
				 * for(Runnable runnable : getRunnableListOfProcess(process, modes)) {
				 * for(Runnable caller : model.getSwModel().getRunnables()) { Set<ServerCall>
				 * serverCallsOfRunnable = getServerCallsOfRunnable(caller, modes);
				 * for(ServerCall sc : serverCallsOfRunnable) { if(sc.getServerRunnable() !=
				 * null && sc.getServerRunnable().equals(runnable)) { //we have found a
				 * serverCall from "caller" to "runnable" -> add Periods of Processes of Caller
				 * to list List<Process> processesOfRunnable = getProcessesOfRunnable(caller,
				 * modes); for(Process callerProcess : processesOfRunnable) {
				 * result.addAll(getPeriods(model, callerProcess, tt, modes)); } } } } }
				 */

				switch (tt) {
				case ACET:
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if (stimulus instanceof EventStimulus) {
				switch (tt) {
				case ACET:
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if (stimulus instanceof InterProcessStimulus) {
				InterProcessStimulus ip = ((InterProcessStimulus) stimulus);
				long ipPrescaler = 1L;
				if (ip.getCounter() != null) {
					ipPrescaler = ip.getCounter().getPrescaler();
				}
				// System.out.println(" IP found");
				Map<Process, Long> triggeringProcesses = getTriggeringProcesses(model, ip, modes);
				if (triggeringProcesses.containsKey(process)) {
					// TODO decided what to do with self triggering processes
					triggeringProcesses.remove(process);
				}

				for (Process triggeringProcess : triggeringProcesses.keySet()) {
					// System.out.println(" --triggered by "+triggeringProcess.getName());
					// InterProcessActivation ipa = getIpaForStimulus(stimulus, triggeringProcess,
					// modes);
					List<Time> periods = getPeriodsOfProcess(model, triggeringProcess, tt, modes);
					for (Time t : periods) {
						long ipaPrescaler = triggeringProcesses.get(triggeringProcess);
						// if(ipa.getCounter() != null) {
						// ipaPrescaler = ipa.getCounter().getPrescaler();
						// }
						result.add(t.multiply(ipaPrescaler * ipPrescaler));
					}
				}

				// System.out.println("InterProcess eContainer: "+ip.eContainer());
				// System.out.println(ip);
				// System.out.println(getTriggeringProcess(model, ip));
				// result.addAll(getPeriods(model, getTriggeringProcess(model, ip), tt));

			} else if (stimulus instanceof VariableRateStimulus) {							//Simon 11.01.2019: TODO
				VariableRateStimulus vr = ((VariableRateStimulus) stimulus);
				// System.out.println(s);
				Time time = null;
				switch (tt) {
				case ACET:
					// TODO fix it
					// if(vr.getStimulusDeviation() != null) {
					// time = getMean(vr.getStimulusDeviation());
					// }
					// break;
					// case BCET:
					// if(vr.getStimulusDeviation() != null) {
					// time = vr.getStimulusDeviation().getUpperBound();
					// }
					// break;
					// case WCET:
					// if(vr.getStimulusDeviation() != null) {
					// time = vr.getStimulusDeviation().getLowerBound();
					// }
					break;
				default:
					break;
				}

				if (time == null) {
					/*
					 * time = AmaltheaFactory.eINSTANCE.createTime(); time.setValue(0);
					 * time.setUnit(TimeUnit.MS);
					 */
				} else {
					result.add(time);
				}
			} else if (stimulus instanceof SingleStimulus) {
				switch (tt) {
				case ACET:
					break;
				case BCET:
					break;
				case WCET:
					break;
				default:
					break;
				}
			} else if (stimulus instanceof RelativePeriodicStimulus) {
				RelativePeriodicStimulus rp = ((RelativePeriodicStimulus) stimulus);
				Time time = null;
				switch (tt) {
				case ACET:
					// TODO check changes
					if (rp.getNextOccurrence() != null) {
						time = rp.getNextOccurrence().getAverage();
					}
					break;
				case BCET:
					if (rp.getNextOccurrence() != null) {
						time = (rp.getNextOccurrence().getUpperBound());
					}
					break;
				case WCET:
					if (rp.getNextOccurrence() != null) {
						time = (rp.getNextOccurrence().getLowerBound());
					}
					break;
				default:
					break;
				}

				if (time == null) {
					/*
					 * time = AmaltheaFactory.eINSTANCE.createTime(); time.setValue(0);
					 * time.setUnit(TimeUnit.MS);
					 */
				} else {
					result.add(time);
				}
			} else if (stimulus instanceof PeriodicSyntheticStimulus) {							//Simon 11.01.2019: TODO
				switch (tt) {
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
	 * Returns all Processes that trigger the given InterProcessStimulus
	 * 
	 * @param model
	 * @param ip
	 * @param modes
	 * @return map process -&gt; prescaler value
	 */
	public static Map<Process, Long> getTriggeringProcesses(Amalthea model, InterProcessStimulus ip,
			EMap<ModeLabel, ModeLiteral> modes) {
		Map<Process, Long> result = new HashMap<>();

		for (InterProcessTrigger interProcessTrigger : ip.getExplicitTriggers()) {
			Process parentProcess = AmaltheaServices.getContainerOfType(interProcessTrigger, Process.class);
			if (interProcessTrigger.getCounter() != null) {
				result.put(parentProcess, interProcessTrigger.getCounter().getPrescaler());
			} else {
				result.put(parentProcess, 1L);
			}
		}

		return result;
	}

	/**
	 * Returns a map of all stimuli, triggered by this process, associated with its
	 * prescaler.
	 * 
	 * @param process
	 * @param modes
	 */
	public static HashMap<Stimulus, Long> getTriggeredStimuli(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Stimulus, Long> stimuliMap = new HashMap<Stimulus, Long>();
		List<InterProcessTrigger> interProcessTriggers = SoftwareUtil
				.collectCalls(process, modes, s -> s instanceof InterProcessTrigger).stream()
				.map(s -> (InterProcessTrigger) s).collect(Collectors.toList());

		interProcessTriggers.forEach(ipa -> {
			if (ipa.getCounter() != null) {
				stimuliMap.put(ipa.getStimulus(), ipa.getCounter().getPrescaler());
			} else {
				stimuliMap.put(ipa.getStimulus(), 1L);
			}
		});

		return stimuliMap;

	}

	/**
	 * Returns a Map of all sporadically triggered processes with their prescaler
	 * 
	 * @param model
	 * @param tt
	 * @return Map of processes with a sporadic activation and depending on tt the
	 *         time between activations
	 */
	public static Map<Process, List<Time>> getProcessesWithRelativePeriodicStimulus(Amalthea model, TimeType tt) {
		Set<Process> processes = new HashSet<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());

		// TODO check
		Map<Process, List<Time>> result = processes.stream().collect(Collectors.toMap(p -> p,
				p -> p.getStimuli().stream().filter(s -> (s instanceof RelativePeriodicStimulus)).map(
						s -> getActivationTimeFromDeviation(((RelativePeriodicStimulus) s).getNextOccurrence(), tt))
						.collect(Collectors.toList())));

		return result;
	}

	private static Time getActivationTimeFromDeviation(ITimeDeviation deviation, TimeType tt) {
		switch (tt) {
		case ACET:
			return deviation.getAverage();
		case BCET:
			return deviation.getUpperBound();
		case WCET:
			return deviation.getLowerBound();
		}
		return null;
	}

	/**
	 * Returns a Map of all sporadically triggered processes with their prescaler
	 * 
	 * @param model
	 * @return Map of processes with a sporadic activation and the deviation of the
	 *         activations
	 */
	public static Map<Process, List<ITimeDeviation>> getProcessesWithRelativePeriodicStimulus(Amalthea model) {
		List<Process> processes = new ArrayList<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());
		processes.stream().filter(p -> p.getStimuli().stream().filter(s -> (s instanceof RelativePeriodicStimulus))
				.collect(Collectors.toList()).size() > 0);

		// TODO check
		Map<Process, List<ITimeDeviation>> result = processes.stream()
				.collect(Collectors.toMap(p -> p,
						p -> p.getStimuli().stream().filter(s -> (s instanceof RelativePeriodicStimulus))
								.map(s -> ((RelativePeriodicStimulus) s).getNextOccurrence())
								.collect(Collectors.toList())));

		return result;
	}

	/**
	 * Returns a map from process to all stimuli (matching filter) that
	 * lead to that process with the correct prescaler
	 * 
	 * @param model
	 * @param filter
	 */
	public static <T> Map<Process, Map<Stimulus, Long>> getPlainTriggersForModel(Amalthea model,
			Function<Stimulus, Boolean> filter) {
		HashMap<Process, Map<Stimulus, Long>> map = new HashMap<>();
		List<Process> processes = new ArrayList<>();
		processes.addAll(model.getSwModel().getTasks());
		processes.addAll(model.getSwModel().getIsrs());

		for (Process p : processes) {
			Map<Stimulus, Long> plainTriggerForProcess = getPlainTriggerForProcess(model, p, 1, filter);
			if (plainTriggerForProcess != null && !plainTriggerForProcess.isEmpty()) {
				map.put(p, plainTriggerForProcess);
			}
		}
		return map;
	}

	/**
	 * Returns all stimuli (matching filter) that trigger the given process
	 * 
	 * @param model
	 * @param process
	 * @param depthCounter
	 */
	public static <T> Map<Stimulus, Long> getPlainTriggerForProcess(Amalthea model, Process process, long depthCounter,
			Function<Stimulus, Boolean> filter) {
		HashMap<Stimulus, Long> map = new HashMap<>();

		for (Stimulus stimulus : process.getStimuli()) {

			if ((filter == null) || (filter.apply(stimulus))) {

				if (stimulus instanceof PeriodicStimulus) {
					PeriodicStimulus p = ((PeriodicStimulus) stimulus);
					map.put(p, depthCounter);
				} else if (stimulus instanceof ArrivalCurveStimulus) {
					ArrivalCurveStimulus p = ((ArrivalCurveStimulus) stimulus);
					map.put(p, depthCounter);
				} else if (stimulus instanceof CustomStimulus) {
					CustomStimulus p = ((CustomStimulus) stimulus);
					map.put(p, depthCounter);
				} else if (stimulus instanceof EventStimulus) {
					EventStimulus p = ((EventStimulus) stimulus);
					map.put(p, depthCounter);
				} else if (stimulus instanceof InterProcessStimulus) {
					InterProcessStimulus ip = ((InterProcessStimulus) stimulus);
					long ipPrescaler = 1L;
					if (ip.getCounter() != null) {
						ipPrescaler = ip.getCounter().getPrescaler();
					}
					Map<Process, Long> triggeringProcesses = getTriggeringProcesses(model, ip, null);
					for (Process triggeringProcess : triggeringProcesses.keySet()) {
						if (triggeringProcess.equals(process)) {
							continue; // don't follow loops
						}
						long ipaPrescaler = triggeringProcesses.get(triggeringProcess);
						Map<Stimulus, Long> plainTriggerForProcess = getPlainTriggerForProcess(model, triggeringProcess,
								depthCounter * ipaPrescaler * ipPrescaler, filter);
						map.putAll(plainTriggerForProcess);
					}

				} else if (stimulus instanceof VariableRateStimulus) {
					VariableRateStimulus p = ((VariableRateStimulus) stimulus);
					map.put(p, depthCounter);
				} else if (stimulus instanceof SingleStimulus) {
					SingleStimulus p = ((SingleStimulus) stimulus);
					map.put(p, depthCounter);
				} else if (stimulus instanceof RelativePeriodicStimulus) {
					RelativePeriodicStimulus s = ((RelativePeriodicStimulus) stimulus);
					map.put(s, depthCounter);
				} else if (stimulus instanceof PeriodicSyntheticStimulus) {
					PeriodicSyntheticStimulus p = ((PeriodicSyntheticStimulus) stimulus);
					map.put(p, depthCounter);
				}
			} else {
				// not in filter
			}
		}
		return map;
	}

	public static boolean periodicStimulusFilter(Stimulus stimulus) {
		if (stimulus instanceof PeriodicStimulus) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean sporadicStimulusFilter(Stimulus stimulus) {
		if (stimulus instanceof RelativePeriodicStimulus) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean customStimulusFilter(Stimulus stimulus) {
		if (stimulus instanceof CustomStimulus) {
			return true;
		} else {
			return false;
		}
	}

}
	
	

