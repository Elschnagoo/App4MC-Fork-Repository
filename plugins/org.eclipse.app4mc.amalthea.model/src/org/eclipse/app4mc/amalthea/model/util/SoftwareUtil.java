/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

public class SoftwareUtil {

	/**
	 * Traverse the call graph of a process and collect all items of the call sequences.
	 * 
	 * @param process
	 * 		- Process (Task or ISR)
	 * @return list of CallSequenceItems
	 */
	public static EList<CallSequenceItem> collectCalls(final Process process) {
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
	public static EList<CallSequenceItem> collectCalls(final Process process, final EMap<ModeLabel, ModeLiteral> modes) {
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
	 * 		- lambda expression (e.g. "a -&gt; a instanceof TaskRunnableCall")
	 * @return list of CallSequenceItems
	 */
	public static EList<CallSequenceItem> collectCalls(final Process process, final EMap<ModeLabel, ModeLiteral> modes,
			final Function<CallSequenceItem, Boolean> filter) {
		EList<CallSequenceItem> itemList = new BasicEList<CallSequenceItem>();
		if (process.getCallGraph() != null) {
			collectCallSequenceItems(process.getCallGraph().getGraphEntries(), modes, filter, itemList);
		}
		return itemList;
	}

	private static void collectCallSequenceItems(final EList<GraphEntryBase> input, final EMap<ModeLabel, ModeLiteral> modes,
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
					} else if (mse.getCondition().isSatisfiedBy(modes)) {
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
	public static EList<RunnableItem> collectRunnableItems(final Runnable runnable) {
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
	public static EList<RunnableItem> collectRunnableItems(final Runnable runnable, final EMap<ModeLabel, ModeLiteral> modes) {
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
	 * 		- lambda expression (e.g. "a -&gt; a instanceof LabelAccess")
	 * @return list of RunnableItems
	 */
	public static EList<RunnableItem> collectRunnableItems(final Runnable runnable, final EMap<ModeLabel, ModeLiteral> modes,
			final Function<RunnableItem, Boolean> filter) {
		EList<RunnableItem> itemList = new BasicEList<RunnableItem>();
		collectRunnableItems(runnable.getRunnableItems(), modes, filter, itemList);
		return itemList;
	}

	private static void collectRunnableItems(final EList<RunnableItem> input, final EMap<ModeLabel, ModeLiteral> modes,
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
					} else if (mse.getCondition().isSatisfiedBy(modes)) {
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
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	public static Set<Label> getAccessedLabelSet(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
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
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	public static Set<Label> getWriteLabelSet(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
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
	 * @param modes (optional) - null works
	 * @return  List of LabelAccesses
	 */
	public static List<LabelAccess> getWriteLabelAccessList(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
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
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	public static Set<Label> getReadLabelSet(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
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
	 * @param modes (optional) - null works
	 * @return  List of LabelAccesses
	 */
	public static List<LabelAccess> getReadLabelAccessesList(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
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
	 * @param modes (optional) - null works
	 * @return List of LabelAccesses
	 */
	public static List<LabelAccess> getLabelAccessList(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<LabelAccess> result = new ArrayList<>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
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
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccesses
	 */
	public static Map<Label, List<LabelAccess>> getLabelToLabelAccessMap(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		Map<Label, List<LabelAccess>> result = new HashMap<>(); 
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess) {
				Label label = ((LabelAccess) ri).getData();
				if (result.get(label) == null) {
					result.put(label, new ArrayList<>());
				}
				result.get(label).add((LabelAccess) ri);
			}
		}
		return result;
		
	}
	
	/**
	 * Set of all accessed Labels with the corresponding LabelAccessStatistics for one Runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccessStatistics
	 */
	public static Map<Label, List<LabelAccessStatistic>> getLabelAccessStatisticsMap(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		Map<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess && ((LabelAccess) ri).getStatistic() != null) {
				LabelAccess la = (LabelAccess) ri;	
				if(!result.containsKey(la.getData())) {					
					result.put(la.getData(), new ArrayList<LabelAccessStatistic>());
				}
				result.get(la.getData()).add(la.getStatistic());
			}
		}
		return result;
	}
	
	/**
	 * Set of all read Labels with the corresponding LabelAccessStatistics for one Runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccessStatistics
	 */
	public static Map<Label, List<LabelAccessStatistic>> getReadLabelAccessStatisticsMap(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		Map<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess && ((LabelAccess) ri).getStatistic() != null && ((LabelAccess) ri).getAccess().equals(LabelAccessEnum.READ)) {
				LabelAccess la = (LabelAccess) ri;	
				if(!result.containsKey(la.getData())) {
					result.put(la.getData(), new ArrayList<LabelAccessStatistic>());
				}
				result.get(la.getData()).add(la.getStatistic());
			}
		}
		return result;
	}
	
	
	/**
	 * Set of all written Labels with the corresponding LabelAccessStatistics for one Runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccessStatistics
	 */
	public static Map<Label, List<LabelAccessStatistic>> getWriteLabelAccessStatisticsMap(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		Map<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
		for (RunnableItem ri : runItem) {
			if (ri instanceof LabelAccess && ((LabelAccess) ri).getStatistic() != null && ((LabelAccess) ri).getAccess().equals(LabelAccessEnum.WRITE)) {
				LabelAccess la = (LabelAccess) ri;	
				if(!result.containsKey(la.getData())) {
					result.put(la.getData(), new ArrayList<LabelAccessStatistic>());
				}
				result.get(la.getData()).add(la.getStatistic());		
			}
		}
		return result;
	}
	
	
	/**
	 *  Set of Labels accessed by the process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	public static Set<Label> getAccessedLabelSet(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashSet<Label> result = new HashSet<>();
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getAccessedLabelSet(r, modes));
		return result;
	}
	
	/**
	 * Set of labels written by the process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	
	public static Set<Label> getWriteLabelSet(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashSet<Label> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getWriteLabelSet(r, modes));
		return result;
		
	}
	
	/**
	 * Set of labels read by the process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	public static Set<Label> getReadLabelSet(Process  process, EMap<ModeLabel, ModeLiteral> modes) {
		HashSet<Label> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getReadLabelSet(r, modes));
		return result;
		
	}
	
	/**
	 * List of all LabelAccesses from process
	 * @param process
	 * @param modes (optional) - null works
	 * @return List of LabelAccesses
	 */
	public static List<LabelAccess> getLabelAccessList(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<LabelAccess> result = new ArrayList<>(); 
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getLabelAccessList(r, modes));
		
		return result;
		
	}
	
	/**
	 * Returns set of all accessed Labels with the corresponding LabelAccess for one Process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccess
	 */
	public static Map<Label, List<LabelAccess>> getLabelToLabelAccessMap(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		
		HashMap<Label, List<LabelAccess>> result = new HashMap<>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccess>> labelToLabelAccessMap = SoftwareUtil.getLabelToLabelAccessMap(r, modes);
			for(Label label : labelToLabelAccessMap.keySet()) {
				if(!result.containsKey(label)) {
					result.put(label, new ArrayList<>());
				} 
				result.get(label).addAll(labelToLabelAccessMap.get(label));
			}
		}
		return result;
	}
	
	
	
	/**
	 * Returns set of all accessed Labels with the corresponding LabelAccessStatistics for one Process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccessStatistic
	 */
	public static Map<Label, List<LabelAccessStatistic>> getLabelAccessStatisticsMap(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccessStatistic>> labelToLabelAccessMap = SoftwareUtil.getLabelAccessStatisticsMap(r, modes);
			for(Label l : labelToLabelAccessMap.keySet()) {
				if(!result.containsKey(l)) {
					result.put(l, new ArrayList<>());
				} 
				result.get(l).addAll(labelToLabelAccessMap.get(l));
			}
		}
		return result;
	}
	
	/**
	 * Returns set of all read Labels with the corresponding LabelAccessStatistics for one Process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccessStatistic
	 */
	public static Map<Label, List<LabelAccessStatistic>> getReadLabelAccessStatisticsMap(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccessStatistic>> readLabelAccessStatisticsMap = SoftwareUtil.getReadLabelAccessStatisticsMap(r, modes);
			for(Label l : readLabelAccessStatisticsMap.keySet()) {
				if(!result.containsKey(l)) {
					result.put(l, new ArrayList<>());
				} 
				result.get(l).addAll(readLabelAccessStatisticsMap.get(l));
			}
		}
		return result;
	}
	
	
	/**
	 * Returns set of all written Labels with the corresponding LabelAccessStatistic for one Process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Map: Label -&gt; List of LabelAccessStatistic
	 */
	public static Map<Label, List<LabelAccessStatistic>> getWriteLabelAccessStatisticsMap(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashMap<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccessStatistic>> writeLabelAcessStatisticsMap = SoftwareUtil.getWriteLabelAccessStatisticsMap(r, modes);
			for(Label l : writeLabelAcessStatisticsMap.keySet()) {
				if(!result.containsKey(l)) {
					result.put(l, new ArrayList<>());
				} 
				result.get(l).addAll(writeLabelAcessStatisticsMap.get(l));
			}
		}
		return result;
	}	


	/**
	 * Returns the reads from a process to a certain label. evaluates the LabelAccessStatistic. 
	 * Definition of TimeType is possible. Null value returns the average case
	 * @param label
	 * @param process
	 * @param modes (optional) - null works
	 * @param timeType
	 * @return float
	 */
	
	public static float getLabelReadCount(Label label, Process process, EMap<ModeLabel, ModeLiteral> modes, TimeType timeType) {
		float reads = 0f;
		if (timeType == null)
			timeType = TimeType.ACET;
		
		for(Runnable r : getRunnableList(process, modes)) {
			List<LabelAccess> readLabelAccessesOfRunnable = getReadLabelAccessesList(r, modes);
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
	 * Returns the writes from a process to a certain label. evaluates the LabelAccessStatistic. 
	 * Definition of TimeType is possible. Null value returns the average case
	 * @param label
	 * @param process
	 * @param modes (optional) - null works
	 * @param timeType
	 * @return float
	 */
	public static float getLabelWriteCount(Label label, Process process, EMap<ModeLabel, ModeLiteral> modes, TimeType timeType) {
		float writes = 0f;
		if (timeType == null)
			timeType = TimeType.ACET;
		for(Runnable r : getRunnableList(process, modes)) {
			List<LabelAccess> writeLabelAccessesOfRunnable = getWriteLabelAccessList(r, modes);
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
	 * Returns a list of runnables called by the process
	 * @param process
	 * @param modes (optional) - null works
	 * @return List of Runnables
	 */
	public static List<Runnable> getRunnableList(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		List<CallSequenceItem> callItems;
		callItems = SoftwareUtil.collectCalls(process, modes);
		for (CallSequenceItem call: callItems) {
			if (call instanceof TaskRunnableCall)
				result.add(((TaskRunnableCall) call).getRunnable());
		}
		return result;
	}
	
	/**
	 * Returns a Set of runnables called by the process - no duplicates 
	 * @param process
	 * @param modes (optional) - null works 
	 * @return Set of runnables called by the process
	 */
	public static Set<Runnable> getRunnableSet(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		return new HashSet<>(getRunnableList(process, modes));
	}
	
	/**
	 * Returns the number of label accesses from a statistic - the accType defines if the minimum, maximum or average accesses are returned
	 * @param labelAcc
	 * @param accType
	 * @return  The number of accesses from a statistic
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
	 * Returns list of Runnables reading the label
	 * @param label
	 * @param modes (optional) - null works
	 * @return List of Runnables 
	 */
	public static List<Runnable> getReaderListOfLabel(Label label, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (LabelAccess la : label.getLabelAccesses()) {
			if (la.getAccess().equals(LabelAccessEnum.READ)) {
				Runnable run = AmaltheaServices.getContainerOfType(la, Runnable.class);
				if (modes == null || modes.isEmpty() || (collectRunnableItems(run, modes)).contains(la)) {
					result.add((Runnable) AmaltheaServices.getContainerOfType(la, Runnable.class));
				}
			}
		}
		return result;
	}
	
	
	/**
	 * Collects a list of set events calls for a process
	 * @param process
	 * @param modes (optional) - null works
	 */
	public static List<SetEvent> collectSetEvents(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		List<SetEvent>result = new ArrayList<>();
		for (CallSequenceItem call : collectEventsOfProcess(process, modes)) {
			if (call instanceof SetEvent)
				result.add((SetEvent) call);
		}
		return result;
	}
	
	/**
	 * Collects a list of clear event calls for a process
	 * @param process
	 * @param modes (optional) - null works
	 * @return List of ClearEvents
	 */
	public static List<ClearEvent> collectClearEvents(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		List<ClearEvent>result = new ArrayList<>();
		for (CallSequenceItem call : collectEventsOfProcess(process, modes)) {
			if (call instanceof ClearEvent)
				result.add((ClearEvent) call);
		}
		return result;
	}
	
	/**
	 * Collects a list of wait event calls for a process
	 * @param process
	 * @param modes (optional) - null works
	 * @return List of WaitEvents
	 */
	public static List<WaitEvent> collectWaitEvents(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		List<WaitEvent>result = new ArrayList<>();
		for (CallSequenceItem call : collectEventsOfProcess(process, modes)) {
			if (call instanceof WaitEvent)
				result.add((WaitEvent) call);
		}
		return result;
	}
	
	
	/**
	 * Collects a list of callSequenceItems calling an event of a process
	 * @param process
	 * @param modes (optional) - null works
	 * @return List of CallSequenceItems
	 */
	public static List<CallSequenceItem> collectEventsOfProcess(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		List<CallSequenceItem>result = new ArrayList<>();
		List<CallSequenceItem> calls = SoftwareUtil.collectCalls(process, modes);
		for (CallSequenceItem call : calls) {
			if (call instanceof ClearEvent || call instanceof SetEvent || call instanceof WaitEvent) {
				result.add(call);
			}
		}
		return result;
	}
	
	
	/**
	 * Returns a set of Runnables reading the label
	 * @param label
	 * @param modes (optional) - null works
	 * @return Set of Labels
	 */
	public static Set<Runnable> getReadersSetOfLabel(Label label, EMap<ModeLabel, ModeLiteral> modes) {
		return new HashSet<>(getReaderListOfLabel(label, modes));
	}
	
	/**
	 * Returns list of runnables writing the label
	 * @param label
	 * @param modes (optional) - null works
	 * @return List of Runnables
	 */
	public static List<Runnable> getWriterListOfLabel(Label label, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (LabelAccess la : label.getLabelAccesses()) {
			if (la.getAccess().equals(LabelAccessEnum.WRITE)) {
				Runnable run = AmaltheaServices.getContainerOfType(la, Runnable.class);
				if (modes == null || modes.isEmpty() || (collectRunnableItems(run, modes)).contains(la)) {
					result.add((Runnable) AmaltheaServices.getContainerOfType(la, Runnable.class));
				}
			}
		}
		return result;
	}
	
	/**
	 * Returns set of runnables writing the label
	 * @param label
	 * @param modes (optional) - null works
	 * @return Set of Labels 
	 */
	public static Set<Runnable> getWriterSetOfLabel(Label label, EMap<ModeLabel, ModeLiteral> modes) {
		return new HashSet<>(getWriterListOfLabel(label, modes));
	}
	
	/**
	 * This method returns a list of all exchanged labels that are written by the sender process and read by the receiver process
	 * @param sender
	 * @param receiver
	 * @param modes (optional) - null works
	 * @return List of Labels
	 */
	 public static List<Label> getInterTaskCommunication(Process sender, Process receiver, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<Label> result = new ArrayList<Label>();
		result.addAll(getWriteLabelSet(sender, modes));
		result.retainAll(getReadLabelSet(receiver, modes));
		return result;
	}	
	 
	/**
	 * Returns a list of processes calling the runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return List of Processes
	 */
	public static List<Process> getProcesses(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<Process> result = new ArrayList<>();
		for (TaskRunnableCall trc : runnable.getTaskRunnableCalls()) {
			Process proc = trc.getContainingProcess(); // null if container is not of type Process
			if (proc == null) continue;
			
			if (modes != null && !modes.isEmpty()) {
				if (getRunnableList(proc, modes).contains(runnable)) {
					result.add((Process) proc);
				}
			} else {
				result.add(proc);
			}
		}
		return result;
	}
	
	/**
	 * Returns list of runnables directly calling the runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return List of Runnables
	 */
	public static List<Runnable> getRunnableCallParents(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (RunnableCall rc : runnable.getRunnableCalls()) {
			Runnable run = rc.getContainingRunnable();
			if (run == null) continue;
			
			if (modes != null && !modes.isEmpty()) {
				EList<RunnableItem> runItems = collectRunnableItems(run, modes);
				if (runItems != null  && runItems.isEmpty() ) {
					for (RunnableItem runItem : runItems) {
						if (runItem instanceof RunnableCall) {
							if (((RunnableCall) runItem).getRunnable().equals(runnable)) {
								result.add(run);
							}
						}
					}
				}
			}
			else
				result.add(run);
		}
		return result;
	}
	
	/**
	 * Returns list of runnables directly called by the runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return List of Runnables
	 */
	public static List<Runnable> getCalledRunnables(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		List<Runnable> result = new ArrayList<Runnable>();
		List<RunnableItem> collectRunnableItems = collectRunnableItems(runnable, modes);
		for (RunnableItem runItem : collectRunnableItems) {
			if (runItem instanceof RunnableCall)
				result.add(((RunnableCall)runItem).getRunnable());
		}
		return result;
	}
	
	/**
	 * Returns a list of all ExecutionNeeds for a given runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return List of ExecutionNeeds
	 */
	public static List<ExecutionNeed> getExecutionNeedsList(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		List<ExecutionNeed> result = new ArrayList<>();
		List<RunnableItem> runnableItems = collectRunnableItems(runnable, modes) ;
		
		for(RunnableItem ri : runnableItems) {
			if(ri instanceof ExecutionNeed) {
				result.add((ExecutionNeed)ri);
			}
		}
		return result; 
	}
	
	/**
	 * Returns a list of all RunnableExecutionNeeds for a given process
	 * @param process
	 * @param modes (optional) - null works
	 * @return List of RunnableExecutionNeeds
	 */
	public static List<ExecutionNeed> getExecutionNeedsList(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		List<ExecutionNeed> result = new ArrayList<>();
		List<Runnable> runnableSet = getRunnableList(process, modes);
		for (Runnable run : runnableSet) {
			result.addAll(getExecutionNeedsList(run, modes)) ;
		}
		return result; 
	}
	
	


	/** 
	 * Returns a list of all ExecutionNeeds for a given process 
	 * @param process
	 * @param hwFeatures 
	 * @param modes (optional) - null works
	 * @param puDefinition - now needed to connect features to procUnits - null returns empty list
	 * @return List of Entry(String, Need)
	 */
	public static List<Entry<String, Ticks>> getExecutionNeedEntryList(Process process, ProcessingUnitDefinition puDefinition, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		List<Runnable> runnables = getRunnableList(process, modes);
		List<Entry<String, Ticks>> result = new ArrayList<>();
		
		for(Runnable runnable : runnables) {
			result.addAll(getExecutionNeedEntryList(runnable, puDefinition, hwFeatures, modes));
		}
		return result;
	}

	
	/** 
	 * Returns a list of all ExecutionNeeds for a given runnable 
	 * @param runnable
	 * @param modes (optional) - null works
	 * @param puDefinition - now needed to connect features to procUnits - null returns empty list
	 * @return List of Entry(String, Need)
	 */
	public static List<Entry<String, Ticks>> getExecutionNeedEntryList(Runnable runnable, ProcessingUnitDefinition puDefinition, List<HwFeature> hwFeatures, EMap<ModeLabel, ModeLiteral> modes) {
		List<Entry<String, Ticks>> result = new ArrayList<>();
		if (puDefinition == null || hwFeatures == null ) {
			return result;
		}
// TODO: Fix it (use Ticks)
//		List<RunnableItem> runnableItems = collectRunnableItems(runnable, modes) ;
//		
//		for(RunnableItem ri : runnableItems) {
//			if(ri instanceof ExecutionNeed) {
//				ExecutionNeed runnableExecutionNeed = (ExecutionNeed)ri;
//				if(runnableExecutionNeed.getExtended().get(puDefinition) != null) {
//					for (Entry<String, Need> needEntry :runnableExecutionNeed.getExtended().get(puDefinition)) {
//						for (HwFeature feature : hwFeatures) {
//							if (feature.getContainingCategory().getName().equals(needEntry.getKey()) && puDefinition.getFeatures().contains(feature)) {
//								result.add(needEntry);
//							}
//						}
//					}
//					 // all should be needed
//				} else if(runnableExecutionNeed.getDefault() != null) {
//					for (Entry<String, Need> needEntry : runnableExecutionNeed.getDefault()) {
//						for (HwFeature feature : hwFeatures) {
//							if (feature.getContainingCategory().getName().equals(needEntry.getKey()) && puDefinition.getFeatures().contains(feature)) {
//								result.add(needEntry);
//							}
//						}
//					}
//				}
//			}
//		}
		return result;
	}
	
	
	/**
	 * Returns a set of ServerCalls for a process
	 * @param process
	 * @param modes (optional) - null works
	 * @return Set of ServerCall
	 */
	public static Set<ServerCall> getServerCallSet(Process process, EMap<ModeLabel, ModeLiteral> modes) {
		HashSet<ServerCall> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modes)) {
			result.addAll(getServerCallSet(r, modes));
		}
		return result;
	}

	/**
	 * Returns a set of ServerCalls for a runnable
	 * @param runnable
	 * @param modes (optional) - null works
	 * @return Set of ServerCall
	 */
	public static Set<ServerCall> getServerCallSet(Runnable runnable, EMap<ModeLabel, ModeLiteral> modes) {
		ArrayList<RunnableItem> runItem = new ArrayList<>();
		runItem.addAll(collectRunnableItems(runnable, modes));
		HashSet<ServerCall> result = new HashSet<>(); 
		for (RunnableItem ri : runItem) {
			if (ri instanceof ServerCall) {
				result.add((ServerCall)ri);
			}
		}
		return result;
	}
}
