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
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.CoreType;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.Instructions;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableInstructions;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;

public class SoftwareUtil {

	/**
	 * Traverse the call graph of a process and collect all items of the call sequences.
	 * 
	 * @param process
	 * 		- Process (Task or ISR)
	 * @return list of CallSequenceItems
	 */
	public static List<CallSequenceItem> collectCalls(final Process process) {
		return collectCalls(process, null, null);
	}

	/**
	 * Traverse the call graph of a process and collect all items of the call sequences.
	 * Collection can be restricted to specific modes.
	 * 
	 * @param process
	 * 		- Process (Task or ISR)
	 * @param modes
	 * 		- list of mode literals that should be considered
	 * @return list of CallSequenceItems
	 */
	public static List<CallSequenceItem> collectCalls(final Process process, final List<ModeLiteral> modes) {
		return collectCalls(process, modes, null);
	}

	
	/**
	 * Traverse the call graph of a process and collect all items of the call sequences.
	 * Collection can be restricted to specific modes and filtered by a lambda expression.
	 * 
	 * @param process
	 * 		- Process (Task or ISR)
	 * @param modes
	 * 		- list of mode literals that should be considered
	 * @param filter
	 * 		- lambda expression (e.g. "a -> a instanceof TaskRunnableCall")
	 * @return list of CallSequenceItems
	 */
	public static List<CallSequenceItem> collectCalls(final Process process, final List<ModeLiteral> modes,
			final Function<CallSequenceItem, Boolean> filter) {
		List<CallSequenceItem> itemList = new ArrayList<CallSequenceItem>();
		if (process.getCallGraph() != null) {
			collectCallSequenceItems(process.getCallGraph().getGraphEntries(), modes, filter, itemList);
		}
		return itemList;
	}

	private static void collectCallSequenceItems(final List<GraphEntryBase> input, final List<ModeLiteral> modes,
			final Function<CallSequenceItem, Boolean> filter, final List<CallSequenceItem> itemList) {
		for (GraphEntryBase entry : input) {
			if (entry instanceof ProbabilitySwitch) {
				ProbabilitySwitch propSwitch = (ProbabilitySwitch) entry;
				for (ProbabilitySwitchEntry<GraphEntryBase> pse : propSwitch.getEntries()) {
					collectCallSequenceItems(pse.getItems(), modes, filter, itemList);
				}
			} else if (entry instanceof ModeSwitch) {
				ModeSwitch modeSwitch = (ModeSwitch) entry;
				boolean includeDefault = true;
				for (ModeSwitchEntry<GraphEntryBase> mse : modeSwitch.getEntries()) {
					if (modes == null) {
						collectCallSequenceItems(mse.getItems(), modes, filter, itemList);
					} else if (!Collections.disjoint(mse.getValues(), modes)) {
						collectCallSequenceItems(mse.getItems(), modes, filter, itemList);
						includeDefault = false;
					}
				}
				if (includeDefault && modeSwitch.getDefaultEntry() != null) {
					collectCallSequenceItems(modeSwitch.getDefaultEntry().getItems(), modes, filter, itemList);
				}
			} else if (entry instanceof CallSequence) {
				for (CallSequenceItem item : ((CallSequence) entry).getCalls()) {
					if (filter == null || filter.apply(item))
						itemList.add(item);
				}
			}
		}
	}

	/**
	 * Traverse the runnable items graph of a runnable and collect all items.
	 * 
	 * @param runnable
	 * 		- Runnable
	 * @return list of RunnableItems
	 */
	public static List<RunnableItem> collectRunnableItems(final Runnable runnable) {
		return collectRunnableItems(runnable, null, null);
	}

	/**
	 * Traverse the runnable items graph of a runnable and collect all items.
	 * Collection can be restricted to specific modes.
	 * 
	 * @param runnable
	 * 		- Runnable
	 * @param modes
	 * 		- list of mode literals that should be considered
	 * @return list of RunnableItems
	 */
	public static List<RunnableItem> collectRunnableItems(final Runnable runnable, final List<ModeLiteral> modes) {
		return collectRunnableItems(runnable, modes, null);
	}

	/**
	 * Traverse the runnable items graph of a runnable and collect all items.
	 * Collection can be restricted to specific modes and filtered by a lambda expression.
	 * 
	 * @param runnable
	 * 		- Runnable
	 * @param modes
	 * 		- list of mode literals that should be considered
	 * @param filter
	 * 		- lambda expression (e.g. "a -> a instanceof LabelAccess")
	 * @return list of RunnableItems
	 */
	public static List<RunnableItem> collectRunnableItems(final Runnable runnable, final List<ModeLiteral> modes,
			final Function<RunnableItem, Boolean> filter) {
		List<RunnableItem> itemList = new ArrayList<RunnableItem>();
		collectRunnableItems(runnable.getRunnableItems(), modes, filter, itemList);
		return itemList;
	}

	private static void collectRunnableItems(final List<RunnableItem> input, final List<ModeLiteral> modes,
			final Function<RunnableItem, Boolean> filter, final List<RunnableItem> itemList) {
		for (RunnableItem item : input) {
			if (item instanceof Group) {
				collectRunnableItems(((Group) item).getItems(), modes, filter, itemList);
			} else if (item instanceof RunnableProbabilitySwitch) {
				RunnableProbabilitySwitch propSwitch = (RunnableProbabilitySwitch) item;
				for (ProbabilitySwitchEntry<RunnableItem> pse : propSwitch.getEntries()) {
					collectRunnableItems(pse.getItems(), modes, filter, itemList);
				}
			} else if (item instanceof RunnableModeSwitch) {
				RunnableModeSwitch modeSwitch = (RunnableModeSwitch) item;
				boolean includeDefault = true;
				for (ModeSwitchEntry<RunnableItem> mse : modeSwitch.getEntries()) {
					if (modes == null) {
						collectRunnableItems(mse.getItems(), modes, filter, itemList);
					} else if (!Collections.disjoint(mse.getValues(), modes)) {
						collectRunnableItems(mse.getItems(), modes, filter, itemList);
						includeDefault = false;
					}
				}
				if (includeDefault && modeSwitch.getDefaultEntry() != null) {
					collectRunnableItems(modeSwitch.getDefaultEntry().getItems(), modes, filter, itemList);
				}
			} else {
				if (filter == null || filter.apply(item))
					itemList.add(item);
			}
		}
	}
	
	/**
	 *  Set of Labels accessed from a Runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Set<Label>
	 */
	public static Set<Label> getAccessedLabelSet(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		HashSet<Label> result = new HashSet<>(); 
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess)
				result.add(((LabelAccess)ri).getData());
		}
		return result;
	}

	
	/**
	 * Set of labels written by runnable
	 * @param runnable 
	 * @param modeLiterals (optional) - null works
	 * @return Set<Label>
	 */
	public static Set<Label> getWriteLabelSet(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		HashSet<Label> result = new HashSet<>();
		for (RunnableItem ri : runItem) {
			if ((ri instanceof LabelAccess) && ((LabelAccess)ri).getAccess().equals(LabelAccessEnum.WRITE)) {
				result.add(((LabelAccess)ri).getData());
			}
		}
		return result;
	}
	
	/**
	 * List of write LabelAccesses from a runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return  List<LabelAccess> 
	 */
	public static List<LabelAccess> getWriteLabelAccessList(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		List<LabelAccess> result = new ArrayList<LabelAccess>();
		for (RunnableItem ri : runItem) {
			if ((ri instanceof LabelAccess) && ((LabelAccess)ri).getAccess().equals(LabelAccessEnum.WRITE)) {
				result.add(((LabelAccess)ri));
			}
		}
		return result;
		
	}
	
	/**
	 * Set of labels read by runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Set<Label>  
	 */
	public static Set<Label> getReadLabelSet(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		HashSet<Label> result = new HashSet<>();
		for (RunnableItem ri : runItem) {
			if ((ri instanceof LabelAccess) && ((LabelAccess)ri).getAccess().equals(LabelAccessEnum.READ)) {
				result.add(((LabelAccess)ri).getData());
			}
		}
		return result;
	}
	
	
	/**
	 * List of read label accesses by runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return  List<LabelAccess>
	 */
	public static List<LabelAccess> getReadLabelAccessesList(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		List<LabelAccess> result = new ArrayList<LabelAccess>();
		for (RunnableItem ri : runItem) {
			if ((ri instanceof LabelAccess) && ((LabelAccess)ri).getAccess().equals(LabelAccessEnum.READ)) {
				result.add(((LabelAccess)ri));
			}
		}
		return result;
	}
	
	/**
	 * List of all Label accessed from Runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return List<LabelAccess>
	 */
	public static List<LabelAccess> getLabelAccessList(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<LabelAccess> result = new ArrayList<>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess) {
				result.add((LabelAccess) ri);
			}
		}
		return result;
		
	}
	

	/**
	 * Set of all Labels accessed from Runnable and the corresponding label accesses
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, List<LabelAccess>> 
	 */
	public static Map<Label, List<LabelAccess>> getLabelToLabelAccessMap(Runnable runnable, List<ModeLiteral> modeLiterals) {
		Map<Label, List<LabelAccess>> result = new HashMap<>(); 
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess) {
				if (result.get(((LabelAccess) ri).getData()) != null)
					result.get(((LabelAccess) ri).getData()).add((LabelAccess) ri);
				else
				{
					List<LabelAccess> la = new ArrayList<LabelAccess>();
					la.add((LabelAccess) ri);
					result.put(((LabelAccess) ri).getData(), la);
				}
			}
		}
		return result;
		
	}
	
	/**
	 * Set of all accessed Labels with the corresponding LabelAccessStatistic for one Runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, LabelAccessStatistic>
	 */
	public static Map<Label, LabelAccessStatistic> getLabelAccessStatisticsMap(Runnable runnable, List<ModeLiteral> modeLiterals) {
		Map<Label, LabelAccessStatistic> result = new HashMap<Label, LabelAccessStatistic>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess && ((LabelAccess) ri).getStatistic() != null) {
				result.put(((LabelAccess) ri).getData(), ((LabelAccess) ri).getStatistic());
			}
		}
		return result;
	}
	
	/**
	 * Set of all read Labels with the corresponding LabelAccessStatistic for one Runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, LabelAccessStatistic>
	 */
	public static Map<Label, LabelAccessStatistic> getReadLabelAccessStatisticMap(Runnable runnable, List<ModeLiteral> modeLiterals) {
		Map<Label, LabelAccessStatistic> result = new HashMap<Label, LabelAccessStatistic>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess && ((LabelAccess) ri).getStatistic() != null && ((LabelAccess) ri).getAccess().equals(LabelAccessEnum.READ)) {
				result.put(((LabelAccess) ri).getData(), ((LabelAccess) ri).getStatistic());
			}
		}
		return result;
	}
	
	
	/**
	 * Set of all written Labels with the corresponding LabelAccessStatistic for one Runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, LabelAccessStatistic>
	 */
	public static Map<Label, LabelAccessStatistic> getWriteLabelAccessStatisticMap(Runnable runnable, List<ModeLiteral> modeLiterals) {
		Map<Label, LabelAccessStatistic> result = new HashMap<Label, LabelAccessStatistic>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess && ((LabelAccess) ri).getStatistic() != null && ((LabelAccess) ri).getAccess().equals(LabelAccessEnum.WRITE)) {
				result.put(((LabelAccess) ri).getData(), ((LabelAccess) ri).getStatistic());
			}
		}
		return result;
	}
	
	
	/**
	 *  Set of Labels accessed by the process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return Set<Label>
	 */
	public static Set<Label> getAccessedLabelSet(Process process, List<ModeLiteral> modeLiterals) {
		HashSet<Label> result = new HashSet<>();
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.addAll(getAccessedLabelSet(r, modeLiterals));
		return result;
	}
	
	/**
	 * Set of labels written by the process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return Set<Label>  
	 */
	
	public static Set<Label> getWriteLabelSet(Process process, List<ModeLiteral> modeLiterals) {
		HashSet<Label> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.addAll(getWriteLabelSet(r, modeLiterals));
		return result;
		
	}
	
	/**
	 * Set of labels read by the process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return Set<Label> 
	 */
	public static Set<Label> getReadLabelSet(Process  process, List<ModeLiteral> modeLiterals) {
		HashSet<Label> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.addAll(getReadLabelSet(r, modeLiterals));
		return result;
		
	}
	
	/**
	 * List of all LabelAccesses from process
	 * @param Process
	 * @param modeLiterals (optional) - null works
	 * @return List<LabelAccess>
	 */
	public static List<LabelAccess> getLabelAccessList(Process process, List<ModeLiteral> modeLiterals) {
		ArrayList<LabelAccess> result = new ArrayList<>(); 
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.addAll(getLabelAccessList(r, modeLiterals));
		
		return result;
		
	}
	
	/**
	 * Set of all accessed Labels with the corresponding LabelAccess for one Process
	 * @param Process
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, List<LabelAccess>>
	 */
	public static Map<Label, List<LabelAccess>> getLabelToLabelAccessMap(Process process, List<ModeLiteral> modeLiterals) {
		HashMap<Label, List<LabelAccess>> result = new HashMap<>(); 
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.putAll(getLabelToLabelAccessMap(r, modeLiterals));
		return result;
		
	}
	
	
	
	
	/**
	 * Set of all accessed Labels with the corresponding LabelAccessStatistic for one Process
	 * @param Process
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, LabelAccessStatistic>
	 */
	public static Map<Label, LabelAccessStatistic> getLabelAccessStatisticsMap(Process process, List<ModeLiteral> modeLiterals) {
		HashMap<Label, LabelAccessStatistic> result = new HashMap<Label, LabelAccessStatistic>();
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.putAll(getLabelAccessStatisticsMap(r, modeLiterals));
		return result;
	}
	
	/**
	 * Set of all read Labels with the corresponding LabelAccessStatistic for one Process
	 * @param Process
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, LabelAccessStatistic>
	 */
	public static Map<Label, LabelAccessStatistic> getReadLabelAccessStatisticMap(Process process, List<ModeLiteral> modeLiterals) {
		HashMap<Label, LabelAccessStatistic> result = new HashMap<Label, LabelAccessStatistic>();
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.putAll(getReadLabelAccessStatisticMap(r, modeLiterals));
		return result;
	}
	
	
	/**
	 * Set of all written Labels with the corresponding LabelAccessStatistic for one Process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return Map<Label, LabelAccessStatistic>
	 */
	public static Map<Label, LabelAccessStatistic> getWriteLabelAccessStatisticMap(Process process, List<ModeLiteral> modeLiterals) {
		HashMap<Label, LabelAccessStatistic> result = new HashMap<Label, LabelAccessStatistic>();
		for (Runnable r : getRunnableList(process, modeLiterals))
			result.putAll(getWriteLabelAccessStatisticMap(r, modeLiterals));
		return result;
	}	


	/**
	 * returns the reads from a process to a certain label. evaluates the LabelAccessStatistic. 
	 * Definition of TimeType is possible. Null value returns the average case
	 * @param label
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @param timeType
	 * @return float
	 */
	
	public static float getLabelReadCount(Label label, Process process, List<ModeLiteral> modeLiterals, TimeType timeType) {
		float reads = 0f;
		if (timeType == null)
			timeType = TimeType.ACET;
		
		for(Runnable r : getRunnableList(process, modeLiterals)) {
			List<LabelAccess> readLabelAccessesOfRunnable = getReadLabelAccessesList(r, modeLiterals);
			for(LabelAccess la : readLabelAccessesOfRunnable) {
				NumericStatistic statistic = la.getStatistic().getValue();
				if(statistic instanceof SingleValueStatistic) {
					SingleValueStatistic svs = (SingleValueStatistic)statistic;
					reads += svs.getValue();
				} else if(statistic instanceof MinAvgMaxStatistic) {
					MinAvgMaxStatistic stat = (MinAvgMaxStatistic)statistic;
					
					switch (timeType) {
					case ACET:
						reads += stat.getAvg();
						break;
					case BCET:
						reads += stat.getMin();
						break;
					case WCET:
						reads += stat.getMax();
						break;

					}
				}
			}
		}
		return reads;
	}
	
	/**
	 * returns the writes from a process to a certain label. evaluates the LabelAccessStatistic. 
	 * Definition of TimeType is possible. Null value returns the average case
	 * @param label
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @param timeType
	 * @return float
	 */
	public static float getLabelWriteCount(Label label, Process process, List<ModeLiteral> modeLiterals, TimeType timeType) {
		float writes = 0f;
		if (timeType == null)
			timeType = TimeType.ACET;
		for(Runnable r : getRunnableList(process, modeLiterals)) {
			List<LabelAccess> writeLabelAccessesOfRunnable = getWriteLabelAccessList(r, modeLiterals);
			for(LabelAccess la : writeLabelAccessesOfRunnable) {
				NumericStatistic statistic = la.getStatistic().getValue();
				if(statistic instanceof SingleValueStatistic) {
					SingleValueStatistic svs = (SingleValueStatistic)statistic;
					writes += svs.getValue();
				} else if(statistic instanceof MinAvgMaxStatistic) {
					MinAvgMaxStatistic stat = (MinAvgMaxStatistic)statistic;
					switch (timeType) {
					case ACET:
						writes += stat.getAvg();
						break;
					case BCET:
						writes += stat.getMin();
						break;
					case WCET:
						writes += stat.getMax();
						break;
					}
				}
			}
		}
		return writes;
	}
	
	
	/**
	 * returns a list of runnables called by the process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<Runnable>
	 */
	public static List<Runnable> getRunnableList(Process process, List<ModeLiteral> modeLiterals) {
		ArrayList<Runnable> result = new ArrayList<>();
		List<CallSequenceItem> callItems;
		callItems = SoftwareUtil.collectCalls(process, modeLiterals);
		for (CallSequenceItem call: callItems) {
			if (call instanceof TaskRunnableCall)
				result.add(((TaskRunnableCall) call).getRunnable());
		}
		return result;
	}
	
	/**
	 * returns a Set of runnables called by the process - no duplicates 
	 * @param process
	 * @param modeLiterals (optional) - null works 
	 * @return Set of runnables called by the process
	 */
	public static Set<Runnable> getRunnableSet(Process process, List<ModeLiteral> modeLiterals) {
		return new HashSet<>(getRunnableList(process, modeLiterals));
	}
	
	/**
	 * returns the number of label accesses from a statistic - the accType defines if the minimum, maximum or average accesses are returned
	 * @param labelAcc
	 * @param accType
	 * @return  the number of accesses from a statistic
	 */
	public static float getLabelAccessCountFromStatistics(LabelAccess labelAcc, TimeType accType) {
		float accesses = 1;
		if (labelAcc.getStatistic() == null)
		return 1;
		if (labelAcc.getStatistic().getValue() instanceof SingleValueStatistic) {
			accesses = ((SingleValueStatistic)labelAcc.getStatistic().getValue()).getValue();
		}
		else if (labelAcc.getStatistic().getValue() instanceof MinAvgMaxStatistic) {
			switch(accType) {
			case ACET: 
				accesses = ((MinAvgMaxStatistic)labelAcc.getStatistic().getValue()).getAvg();
				break;
			case BCET:
				accesses = ((MinAvgMaxStatistic)labelAcc.getStatistic().getValue()).getMin();
				break;
			case WCET:
				accesses = ((MinAvgMaxStatistic)labelAcc.getStatistic().getValue()).getMax();
				break;
			default:
				accesses = ((MinAvgMaxStatistic)labelAcc.getStatistic().getValue()).getAvg();
			}
		}
		return accesses;
						
	}
	
	/** 
	 * returns list of Runnables reading the label
	 * @param label
	 * @param modeLiterals (optional) - null works
	 * @return List<Runnable> 
	 */
	public static List<Runnable> getReaderListOfLabel(Label label, List<ModeLiteral> modeLiterals) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (LabelAccess la : label.getLabelAccesses()) {
			if (la.getAccess().equals(LabelAccessEnum.READ)) {
				Runnable run = ModelUtil.getParentContainer(la, Runnable.class);
				if (modeLiterals == null || modeLiterals.isEmpty() || (SoftwareUtil.collectRunnableItems(run, modeLiterals)).contains(la)) {
					result.add((Runnable) ModelUtil.getParentContainer(la, Runnable.class));
				}
			}
		}
		return result;
	}
	
	
	/**
	 * collects a list of set events calls for a process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<SetEvent>
	 */
	public static List<SetEvent> collectSetEvents(Process process, List<ModeLiteral> modeLiterals) {
		List<SetEvent>result = new ArrayList<>();
		for (CallSequenceItem call : collectEventsOfProcess(process, modeLiterals)) {
			if (call instanceof SetEvent)
				result.add((SetEvent) call);
		}
		return result;
	}
	
	/**
	 * collects a list of clear event calls for a process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<ClearEvent>
	 */
	public static List<ClearEvent> collectClearEvents(Process process, List<ModeLiteral> modeLiterals) {
		List<ClearEvent>result = new ArrayList<>();
		for (CallSequenceItem call : collectEventsOfProcess(process, modeLiterals)) {
			if (call instanceof ClearEvent)
				result.add((ClearEvent) call);
		}
		return result;
	}
	
	/**
	 * collects a list of wait event calls for a process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<WaitEvent>
	 */
	public static List<WaitEvent> collectWaitEvents(Process process, List<ModeLiteral> modeLiterals) {
		List<WaitEvent>result = new ArrayList<>();
		for (CallSequenceItem call : collectEventsOfProcess(process, modeLiterals)) {
			if (call instanceof WaitEvent)
				result.add((WaitEvent) call);
		}
		return result;
	}
	
	
	/**
	 * collects a list of callSequenceItems calling an event of a process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<CallSequenceItem>
	 */
	public static List<CallSequenceItem> collectEventsOfProcess(Process process, List<ModeLiteral> modeLiterals) {
		List<CallSequenceItem>result = new ArrayList<>();
		List<CallSequenceItem> calls = SoftwareUtil.collectCalls(process, modeLiterals);
		for (CallSequenceItem call : calls) {
			if (call instanceof ClearEvent || call instanceof SetEvent || call instanceof WaitEvent) {
				result.add(call);
			}
		}
		return result;
	}
	
	
	/**
	 * returns a set of Runnables reading the label
	 * @param label
	 * @param modeLiterals (optional) - null works
	 * @return Set<Runnable>
	 */
	public static Set<Runnable> getReadersSetOfLabel(Label label, List<ModeLiteral> modeLiterals) {
		return new HashSet<>(getReaderListOfLabel(label, modeLiterals));
	}
	
	/** returns list of runnables writing the label
	 * @param label
	 * @param modeLiterals (optional) - null works
	 * @return List<Runnable>
	 */
	public static List<Runnable> getWriterListOfLabel(Label label, List<ModeLiteral> modeLiterals) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (LabelAccess la : label.getLabelAccesses()) {
			if (la.getAccess().equals(LabelAccessEnum.WRITE)) {
				Runnable run = ModelUtil.getParentContainer(la, Runnable.class);
				if (modeLiterals == null || modeLiterals.isEmpty() || (SoftwareUtil.collectRunnableItems(run, modeLiterals)).contains(la)) {
					result.add((Runnable) ModelUtil.getParentContainer(la, Runnable.class));
				}
			}
		}
		return result;
	}
	
	/**
	 * returns set of runnables writing the label
	 * @param label
	 * @param modeLiterals (optional) - null works
	 * @return Set<Runnable> 
	 */
	public static Set<Runnable> getWriterSetOfLabel(Label label, List<ModeLiteral> modeLiterals) {
		return new HashSet<>(getWriterListOfLabel(label, modeLiterals));
	}
	
	/**
	 * This method returns a list of all exchanged labels that are written by the sender process and read by the receiver process
	 * @param Process sender
	 * @param Process receiver
	 * @param modeLiterals (optional) - null works
	 * @return List<Label>
	 */
	 public static List<Label> getInterTaskCommunication(Process sender, Process receiver, List<ModeLiteral> modeLiterals) {
		ArrayList<Label> result = new ArrayList<Label>();
		result.addAll(getWriteLabelSet(sender, modeLiterals));
		result.retainAll(getReadLabelSet(receiver, modeLiterals));
		return result;
	}	
	 
	/** returns a list of processes calling the runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return List<Process>
	 */
	public static List<Process> getProcesses(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<Process> result = new ArrayList<>();
		for (TaskRunnableCall trc : runnable.getTaskRunnableCalls()) {
			Process proc = ModelUtil.getParentContainer(trc, Process.class);
			if (modeLiterals != null && !modeLiterals.isEmpty()) {
				if (getRunnableList(proc, modeLiterals).contains(runnable)) {
					result.add((Process) proc);
				}
			} else {
				result.add(proc);
			}
		}
		return result;
	}
	
	/**
	 * returns list of runnables directly calling the runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return List<Runnable>
	 */
	public static List<Runnable> getRunnableCallParents(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (RunnableCall rc : runnable.getRunnableCalls()) {
			Runnable run = ModelUtil.getParentContainer(rc, Runnable.class);
			if (modeLiterals != null && !modeLiterals.isEmpty()) {
				if (SoftwareUtil.collectRunnableItems(run, modeLiterals).contains(runnable))
						result.add(run);
			}
			else
				result.add(run);
		}
		return result;
	}
	
	/**
	 * returns list of runnables directly called by the runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return List<Runnables>
	 */
	public static List<Runnable> getCalledRunnables(Runnable runnable, List<ModeLiteral> modeLiterals) {
		List<Runnable> result = new ArrayList<Runnable>();
		List<RunnableItem> collectRunnableItems = SoftwareUtil.collectRunnableItems(runnable, modeLiterals);
		for (RunnableItem runItem : collectRunnableItems) {
			if (runItem instanceof RunnableCall)
				result.add(((RunnableCall)runItem).getRunnable());
		}
		return result;
	}
	
	/**
	 * returns a list of all RunnableInstructions for a given runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return List<RunnableInstructions>
	 */
	public static List<RunnableInstructions> getRunnableInstructionsList(Runnable runnable, List<ModeLiteral> modeLiterals) {
		List<RunnableInstructions> result = new ArrayList<>();
		List<RunnableItem> runnableItems = SoftwareUtil.collectRunnableItems(runnable, modeLiterals) ;
		
		for(RunnableItem ri : runnableItems) {
			if(ri instanceof RunnableInstructions) {
				result.add((RunnableInstructions)ri);
			}
		}
		return result; 
	}
	
	/**
	 * returns a list of all RunnableInstructions for a given process
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return List<RunnableInstructions>
	 */
	public static List<RunnableInstructions> getRunnableInstructionsList(Process process, List<ModeLiteral> modeLiterals) {
		List<RunnableInstructions> result = new ArrayList<>();
		List<Runnable> runnableSet = getRunnableList(process, modeLiterals);
		for (Runnable run : runnableSet) {
			result.addAll(getRunnableInstructionsList(run, modeLiterals)) ;
		}
		return result; 
	}
	
	


	/** 
	 * returns a list of all Instructions for a given process 
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<Instructions>
	 */
	public static List<Instructions> getInstructionsList(Process process, CoreType coreType, List<ModeLiteral> modeLiterals) {
		List<Runnable> runnables = getRunnableList(process, modeLiterals);
		List<Instructions> result = new ArrayList<>();
		
		for(Runnable runnable : runnables) {
			result.addAll(getInstructionsList(runnable, coreType, modeLiterals));
		}
		
		return result;
	}

	
	/** 
	 * returns a list of all Instructions for a given runnable 
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return List<Instructions>
	 */
	public static List<Instructions> getInstructionsList(Runnable runnable, CoreType coreType, List<ModeLiteral> modeLiterals) {
		List<Instructions> result = new ArrayList<>();
		List<RunnableItem> runnableItems = SoftwareUtil.collectRunnableItems(runnable, modeLiterals) ;
		
		for(RunnableItem ri : runnableItems) {
			if(ri instanceof RunnableInstructions) {
				RunnableInstructions runnableInstruction = (RunnableInstructions)ri;
				
				if(coreType == null && runnableInstruction.getDefault() != null) {
					result.add(runnableInstruction.getDefault());
				} else {
					//return extended for coreType
					if(runnableInstruction.getExtended().get(coreType) != null) {
						result.add(runnableInstruction.getExtended().get(coreType)); //Should contain RunnableInstructions for given coreType
					} else {
						//No runtime for coreType available - return default
						if (runnableInstruction.getDefault() != null)
							{
								result.add(runnableInstruction.getDefault());						
							}
					}
				}
			}
		}
		
		return result;
	}
	
	
	/**
	 * returns a set of ServerCalls for a process
	 * @param process
	 * @param modeLiterals (optional) - null works
	 * @return Set<ServerCall>
	 */
	public static Set<ServerCall> getServerCallSet(Process process, List<ModeLiteral> modeLiterals) {
		HashSet<ServerCall> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modeLiterals)) {
			result.addAll(getServerCallSet(r, modeLiterals));
		}
		return result;
	}

	/**
	 * returns a set of ServerCalls for a runnable
	 * @param runnable
	 * @param modeLiterals (optional) - null works
	 * @return Set<ServerCall>
	 */
	public static Set<ServerCall> getServerCallSet(Runnable runnable, List<ModeLiteral> modeLiterals) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(SoftwareUtil.collectRunnableItems(runnable, modeLiterals));
		HashSet<ServerCall> result = new HashSet<>(); 
		for (RunnableItem ri : runItem) {
			if (ri instanceof ServerCall) {
				result.add((ServerCall)ri);
			}
		}
		return result;
	}


}
