/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

import static org.eclipse.app4mc.amalthea.model.LabelAccessEnum.READ;
import static org.eclipse.app4mc.amalthea.model.LabelAccessEnum.WRITE;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.ClearEvent;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.ICallGraphItemContainer;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum;
import org.eclipse.app4mc.amalthea.model.LabelAccessStatistic;
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.NumericStatistic;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.ServerCall;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.model.util.RuntimeUtil.TimeType;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

public class SoftwareUtil {

	/**
	 * Traverse the contained call graph items and collect all items.
	 * 
	 * @param container	call graph, group, ...
	 * @return
	 * 		List of CallGraphItems
	 */
	public static EList<CallGraphItem> collectCallGraphItems(final ICallGraphItemContainer container) {
		return collectCallGraphItems(container, null, CallGraphItem.class, null);
	}

	/**
	 * Traverse the contained call graph items and collect all items.
	 * Collection can be restricted to specific modes.
	 * 
	 * @param container	call graph, group, ...
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of CallGraphItems
	 */
	public static EList<CallGraphItem> collectCallGraphItems(final ICallGraphItemContainer container, final EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(container, modes, CallGraphItem.class, null);
	}

	/**
	 * Traverse the contained call graph items and collect all items.
	 * Collection can be restricted to specific modes and filtered by a lambda expression.
	 * 
	 * @param container	call graph, group, ...
	 * @param modes		(optional) - null works
	 * @param filter	lambda expression (e.g. "a -&gt; a instanceof LabelAccess")
	 * @return
	 * 		List of CallGraphItems
	 */
	public static EList<CallGraphItem> collectCallGraphItems(final ICallGraphItemContainer container, final EMap<ModeLabel, String> modes,
			final Function<CallGraphItem, Boolean> filter) {
		return collectCallGraphItems(container, modes, CallGraphItem.class, filter);
	}
	
	/**
	 * Traverse the runnable items graph of a runnable and collect all items.
	 * Collection can be restricted to specific modes and filtered by class.
	 * 
	 * @param container		call graph, group, ...
	 * @param modes			(optional) - null works
	 * @param targetClass	subclass of CallGraphItem that restricts the result
	 * @return
	 * 		List of T extends CallGraphItems
	 */
	public static <T extends CallGraphItem> EList<T> collectCallGraphItems(final ICallGraphItemContainer container, final EMap<ModeLabel, String> modes,
			final Class<T> targetClass) {
		return collectCallGraphItems(container, modes, targetClass, null);
	}
	
	/**
	 * Traverse the runnable items graph of a runnable and collect all items.
	 * Collection can be restricted to specific modes and filtered by class and lambda expression.
	 * 
	 * @param container		call graph, group, ...
	 * @param modes			(optional) - null works
	 * @param targetClass	subclass of CallGraphItem that restricts the result
	 * @param filter		lambda expression (e.g. "a -&gt; a instanceof LabelAccess")
	 * @return
	 * 		List of T extends CallGraphItems
	 */
	public static <T extends CallGraphItem> EList<T> collectCallGraphItems(final ICallGraphItemContainer container, final EMap<ModeLabel, String> modes,
			final Class<T> targetClass, final Function<T, Boolean> filter) {
		EList<T> itemList = new BasicEList<T>();
		collectCallGraphItems(container.getItems(), modes, targetClass, filter, itemList);
		return itemList;
	}


	private static <T extends CallGraphItem> void collectCallGraphItems(final EList<CallGraphItem> input, final EMap<ModeLabel, String> modes,
			final Class<T> targetClass, final Function<T, Boolean> filter, final List<T> itemList) {
		for (CallGraphItem item : input) {
			if (item instanceof Group) {
				collectCallGraphItems(((Group) item).getItems(), modes, targetClass, filter, itemList);
			} else if (item instanceof ProbabilitySwitch) {
				ProbabilitySwitch propSwitch = (ProbabilitySwitch) item;
				for (ProbabilitySwitchEntry pse : propSwitch.getEntries()) {
					collectCallGraphItems(pse.getItems(), modes, targetClass, filter, itemList);
				}
			} else if (item instanceof ModeSwitch) {
				ModeSwitch modeSwitch = (ModeSwitch) item;
				boolean includeDefault = true;
				for (ModeSwitchEntry mse : modeSwitch.getEntries()) {
					if (modes == null) {
						collectCallGraphItems(mse.getItems(), modes, targetClass, filter, itemList);
					} else if (mse.getCondition().isSatisfiedBy(modes)) {
						collectCallGraphItems(mse.getItems(), modes, targetClass, filter, itemList);
						includeDefault = false;
					}
				}
				if (includeDefault && modeSwitch.getDefaultEntry() != null) {
					collectCallGraphItems(modeSwitch.getDefaultEntry().getItems(), modes, targetClass, filter, itemList);
				}
			} else if (targetClass.isInstance(item)) {
				T castedItem = targetClass.cast(item);
				if (filter == null || filter.apply(castedItem)) {
					itemList.add(castedItem);
				}
			}
		}
	}


	/**
	 * Returns a set of labels accessed from the runnable
	 * @param runnable runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Label> getAccessedLabelSet(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class)
			.stream().map(la -> la.getData()).filter(Objects::nonNull).collect(Collectors.toSet());
	}

	/**
	 * Returns a set of labels read by the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Label> getReadLabelSet(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class, (la -> la.getAccess() == READ))
				.stream().map(la -> la.getData()).filter(Objects::nonNull).collect(Collectors.toSet());
	}

	/**
	 * Returns a set of labels written by the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Label> getWriteLabelSet(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class, (la -> la.getAccess() == WRITE))
			.stream().map(la -> la.getData()).filter(Objects::nonNull).collect(Collectors.toSet());
	}

	/**
	 * Returns a list of all label accesses of the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of LabelAccesses
	 */
	public static List<LabelAccess> getLabelAccessList(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class);	
	}

	/**
	 * Returns a list of read label accesses of the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of LabelAccesses
	 */
	public static List<LabelAccess> getReadLabelAccessList(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class, (la -> la.getAccess() == READ));	
	}

	/**
	 * Returns a list of write label accesses of the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of LabelAccesses
	 */
	public static List<LabelAccess> getWriteLabelAccessList(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class, (la -> la.getAccess() == WRITE));	
	}

	/**
	 * Returns a map: labels accessed from runnable -&gt; the corresponding label accesses
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccesses
	 */
	public static Map<Label, List<LabelAccess>> getLabelToLabelAccessMap(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class, (la -> la.getData() != null))
			.stream().collect(Collectors.groupingBy(LabelAccess::getData));
	}

	/**
	 * Returns a map: labels accessed by the runnable -&gt; the corresponding LabelAccessStatistics
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return Map:
	 * 		Label -&gt; List of LabelAccessStatistics
	 */
	public static Map<Label, List<LabelAccessStatistic>> getLabelAccessStatisticsMap(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class,
					(la -> la.getData() != null && la.getStatistic() != null))
				.stream().collect(Collectors.groupingBy(
						LabelAccess::getData,
						Collectors.mapping(LabelAccess::getStatistic, Collectors.toList()) ));
	}

	/**
	 * Returns a map: labels read by the runnable -&gt; the corresponding LabelAccessStatistics
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccessStatistics
	 */
	public static Map<Label, List<LabelAccessStatistic>> getReadLabelAccessStatisticsMap(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class,
				(la -> la.getData() != null && la.getStatistic() != null && la.getAccess() == READ))
			.stream().collect(Collectors.groupingBy(
					LabelAccess::getData,
					Collectors.mapping(LabelAccess::getStatistic, Collectors.toList()) ));
	}

	/**
	 * Returns a map: labels written by the runnable -&gt; the corresponding LabelAccessStatistics
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccessStatistics
	 */
	public static Map<Label, List<LabelAccessStatistic>> getWriteLabelAccessStatisticsMap(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, LabelAccess.class,
				(la -> la.getData() != null && la.getStatistic() != null && la.getAccess() == WRITE))
			.stream().collect(Collectors.groupingBy(
					LabelAccess::getData,
					Collectors.mapping(LabelAccess::getStatistic, Collectors.toList()) ));
	}
	
	/**
	 * Returns a set of labels accessed by the process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Label> getAccessedLabelSet(Process process, EMap<ModeLabel, String> modes) {
		HashSet<Label> result = new HashSet<>();
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getAccessedLabelSet(r, modes));
		return result;
	}

	/**
	 * Returns a set of labels read by the process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Label> getReadLabelSet(Process  process, EMap<ModeLabel, String> modes) {
		HashSet<Label> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getReadLabelSet(r, modes));
		return result;
	}

	/**
	 * Returns a set of labels written by the process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Label> getWriteLabelSet(Process process, EMap<ModeLabel, String> modes) {
		HashSet<Label> result = new HashSet<>(); 
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getWriteLabelSet(r, modes));
		return result;
	}

	/**
	 * Returns a list of all label accesses of the process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of LabelAccesses
	 */
	public static List<LabelAccess> getLabelAccessList(Process process, EMap<ModeLabel, String> modes) {
		ArrayList<LabelAccess> result = new ArrayList<>(); 
		for (Runnable r : getRunnableList(process, modes))
			result.addAll(getLabelAccessList(r, modes));
		return result;
	}

	/**
	 * Returns a map: accessed labels of the process -&gt; the corresponding label accesses
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccess
	 */
	public static Map<Label, List<LabelAccess>> getLabelToLabelAccessMap(Process process, EMap<ModeLabel, String> modes) {
		HashMap<Label, List<LabelAccess>> result = new HashMap<>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccess>> labelToLabelAccessMap = SoftwareUtil.getLabelToLabelAccessMap(r, modes);
			for(Label key : labelToLabelAccessMap.keySet()) {
				if(!result.containsKey(key)) {
					result.put(key, new ArrayList<>());
				} 
				result.get(key).addAll(labelToLabelAccessMap.get(key));
			}
		}
		return result;
	}

	/**
	 * Returns a map: labels accessed by the process -&gt; the corresponding label access statistics
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccessStatistic
	 */
	public static Map<Label, List<LabelAccessStatistic>> getLabelAccessStatisticsMap(Process process, EMap<ModeLabel, String> modes) {
		HashMap<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccessStatistic>> labelToLabelAccessMap = SoftwareUtil.getLabelAccessStatisticsMap(r, modes);
			for(Label key : labelToLabelAccessMap.keySet()) {
				if(!result.containsKey(key)) {
					result.put(key, new ArrayList<>());
				} 
				result.get(key).addAll(labelToLabelAccessMap.get(key));
			}
		}
		return result;
	}

	/**
	 * Returns a map: labels read the process -&gt; the corresponding label access statistics
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccessStatistic
	 */
	public static Map<Label, List<LabelAccessStatistic>> getReadLabelAccessStatisticsMap(Process process, EMap<ModeLabel, String> modes) {
		HashMap<Label, List<LabelAccessStatistic>> result = new HashMap<Label, List<LabelAccessStatistic>>();
		for (Runnable r : getRunnableList(process, modes)) {
			Map<Label, List<LabelAccessStatistic>> readLabelAccessStatisticsMap = SoftwareUtil.getReadLabelAccessStatisticsMap(r, modes);
			for(Label key : readLabelAccessStatisticsMap.keySet()) {
				if(!result.containsKey(key)) {
					result.put(key, new ArrayList<>());
				} 
				result.get(key).addAll(readLabelAccessStatisticsMap.get(key));
			}
		}
		return result;
	}

	/**
	 * Returns a map: labels written by the process -&gt; the corresponding label access statistics
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Map: Label -&gt; List of LabelAccessStatistic
	 */
	public static Map<Label, List<LabelAccessStatistic>> getWriteLabelAccessStatisticsMap(Process process, EMap<ModeLabel, String> modes) {
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
	 * Returns the reads from a process to a certain label. Evaluates the LabelAccessStatistic. 
	 * Definition of TimeType is possible. Null value returns the average case.
	 */
	public static float getLabelReadCount(Label label, Process process, EMap<ModeLabel, String> modes, TimeType timeType) {
		float reads = 0f;
		if (timeType == null)
			timeType = TimeType.ACET;
		
		for(Runnable r : getRunnableList(process, modes)) {
			List<LabelAccess> readLabelAccessesOfRunnable = getReadLabelAccessList(r, modes);
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
	 * Returns the writes from a process to a certain label. Evaluates the LabelAccessStatistic. 
	 * Definition of TimeType is possible. Null value returns the average case.
	 */
	public static float getLabelWriteCount(Label label, Process process, EMap<ModeLabel, String> modes, TimeType timeType) {
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
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Runnables
	 */
	public static List<Runnable> getRunnableList(Process process, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(process.getCallGraph(), modes, RunnableCall.class)
			.stream().map(call -> call.getRunnable()).filter(Objects::nonNull).collect(Collectors.toList());
	}

	/**
	 * Returns a set of runnables called by the process - no duplicates 
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works 
	 * @return
	 * 		Set of runnables called by the process
	 */
	public static Set<Runnable> getRunnableSet(Process process, EMap<ModeLabel, String> modes) {
		return new HashSet<>(getRunnableList(process, modes));
	}

	/**
	 * Returns the number of label accesses from a statistic.
	 * The accType defines if the minimum, maximum or average accesses are returned.
	 */
	public static float getLabelAccessCountFromStatistics(LabelAccess labelAcc, TimeType accType) {
		float accesses = 1;
		if (labelAcc.getStatistic() == null)
		return 1;
		if (labelAcc.getStatistic().getValue() instanceof SingleValueStatistic) {
			accesses = ((SingleValueStatistic)labelAcc.getStatistic().getValue()).getValue();
		} else if (labelAcc.getStatistic().getValue() instanceof MinAvgMaxStatistic) {
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
	 * Returns a list of runnables reading the label
	 * @param label		label
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Runnables 
	 */
	public static List<Runnable> getReaderListOfLabel(Label label, EMap<ModeLabel, String> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (LabelAccess la : label.getLabelAccesses()) {
			if (la.getAccess() == LabelAccessEnum.READ) {
				Runnable run = AmaltheaServices.getContainerOfType(la, Runnable.class);
				if (modes == null || modes.isEmpty() || (collectCallGraphItems(run.getCallGraph(), modes)).contains(la)) {
					result.add((Runnable) AmaltheaServices.getContainerOfType(la, Runnable.class));
				}
			}
		}
		return result;
	}

	/**
	 * Returns a set of runnables reading the label
	 * @param label		label
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Labels
	 */
	public static Set<Runnable> getReadersSetOfLabel(Label label, EMap<ModeLabel, String> modes) {
		return new HashSet<>(getReaderListOfLabel(label, modes));
	}

	/**
	 * Returns a list of runnables writing the label
	 * @param label		label
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Runnables
	 */
	public static List<Runnable> getWriterListOfLabel(Label label, EMap<ModeLabel, String> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (LabelAccess la : label.getLabelAccesses()) {
			if (la.getAccess().equals(LabelAccessEnum.WRITE)) {
				Runnable run = AmaltheaServices.getContainerOfType(la, Runnable.class);
				if (modes == null || modes.isEmpty() || (collectCallGraphItems(run.getCallGraph(), modes)).contains(la)) {
					result.add((Runnable) AmaltheaServices.getContainerOfType(la, Runnable.class));
				}
			}
		}
		return result;
	}

	/**
	 * Returns a set of runnables writing the label
	 * @param label		label
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of Runnables 
	 */
	public static Set<Runnable> getWriterSetOfLabel(Label label, EMap<ModeLabel, String> modes) {
		return new HashSet<>(getWriterListOfLabel(label, modes));
	}

	/**
	 * Collects a list of set events calls for a process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of SetEvents
	 */
	public static List<SetEvent> collectSetEvents(Process process, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(process.getCallGraph(), modes, SetEvent.class);
	}

	/**
	 * Collects a list of clear event calls for a process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of ClearEvents
	 */
	public static List<ClearEvent> collectClearEvents(Process process, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(process.getCallGraph(), modes, ClearEvent.class);
	}

	/**
	 * Collects a list of wait event calls for a process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of WaitEvents
	 */
	public static List<WaitEvent> collectWaitEvents(Process process, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(process.getCallGraph(), modes, WaitEvent.class);
	}

	/**
	 * Collects a list of event calls (clear, set or wait) of a process
	 * @param process	process (Task or ISR)
	 * @param modes 	(optional) - null works
	 * @return
	 * 		List of CallSequenceItems
	 */
	public static List<CallGraphItem> collectEventsOfProcess(Process process, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(process.getCallGraph(), modes,
				(call -> call instanceof ClearEvent || call instanceof SetEvent || call instanceof WaitEvent));
	}

	/**
	 * Returns a list of all exchanged labels that are written by the sender process and read by the receiver process
	 * @param sender	process (Task or ISR)
	 * @param receiver	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Labels
	 */
	 public static List<Label> getInterTaskCommunication(Process sender, Process receiver, EMap<ModeLabel, String> modes) {
		ArrayList<Label> result = new ArrayList<Label>();
		result.addAll(getWriteLabelSet(sender, modes));
		result.retainAll(getReadLabelSet(receiver, modes));
		return result;
	}

	/**
	 * Returns a list of processes calling the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Processes
	 */
	public static List<Process> getCallingProcesses(Runnable runnable, EMap<ModeLabel, String> modes) {
		ArrayList<Process> result = new ArrayList<>();
		for (RunnableCall callerRC : runnable.getRunnableCalls()) {
			Process caller = callerRC.getContainingProcess(); // null if container is not of type Process
			if (caller == null) continue;
			
			if (modes != null && !modes.isEmpty()) {
				for (RunnableCall rc : collectCallGraphItems(caller.getCallGraph(), modes, RunnableCall.class)) {
					if (rc.getRunnable() == runnable) {
						result.add(caller);
						break;
					}
				}
			} else {
				result.add(caller);
			}
		}
		return result;
	}

	/**
	 * Returns a list of runnables directly calling the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Runnables
	 */
	public static List<Runnable> getCallingRunnables(Runnable runnable, EMap<ModeLabel, String> modes) {
		ArrayList<Runnable> result = new ArrayList<>();
		for (RunnableCall callerRC : runnable.getRunnableCalls()) {
			Runnable caller = callerRC.getContainingRunnable();	// null if container is not of type Runnable
			if (caller == null) continue;
			
			if (modes != null && !modes.isEmpty()) {
				for (RunnableCall rc : collectCallGraphItems(caller.getCallGraph(), modes, RunnableCall.class)) {
					if (rc.getRunnable() == runnable) {
						result.add(caller);
						break;
					}
				}
			}
			else
				result.add(caller);
		}
		return result;
	}

	/**
	 * Returns a list of runnables directly called by the runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Runnables
	 */
	public static List<Runnable> getCalledRunnables(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, RunnableCall.class)
			.stream().map(rc -> rc.getRunnable()).filter(Objects::nonNull).collect(Collectors.toList());
	}

	/**
	 * Returns a list of all execution needs for a given runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of ExecutionNeeds
	 */
	public static List<ExecutionNeed> getExecutionNeeds(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, ExecutionNeed.class);
		
		//TODO Should nested runnable calls also be included ? (potential cycles)
	}

	/**
	 * Returns a list of all execution needs for a given process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of ExecutionNeeds
	 */
	public static List<ExecutionNeed> getExecutionNeeds(Process process, EMap<ModeLabel, String> modes) {
		List<ExecutionNeed> result = new ArrayList<>();
		// add needs on process level
		result.addAll(collectCallGraphItems(process.getCallGraph(), modes, ExecutionNeed.class));
		// add needs of called runnables
		for (Runnable run : getRunnableList(process, modes)) {
			result.addAll(getExecutionNeeds(run, modes));
		}
		return result; 
	}

	/** 
	 * Returns a list of all ticks for a given runnable 
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Ticks
	 */
	public static List<Ticks> getTicks(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, Ticks.class);
		
		//TODO Should nested runnable calls also be included ? (potential cycles)
	}

	/** 
	 * Returns a list of all ticks for a given process 
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		List of Ticks
	 */
	public static List<Ticks> getTicks(Process process, EMap<ModeLabel, String> modes) {
		List<Ticks> result = new ArrayList<>();
		// add needs on process level
		result.addAll(collectCallGraphItems(process.getCallGraph(), modes, Ticks.class));
		// add needs of called runnables
		for(Runnable run : getRunnableList(process, modes)) {
			result.addAll(getTicks(run, modes));
		}
		return result;
	}

	/**
	 * Returns a set of server calls for a runnable
	 * @param runnable	runnable
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of ServerCall
	 */
	public static Set<ServerCall> getServerCallSet(Runnable runnable, EMap<ModeLabel, String> modes) {
		return collectCallGraphItems(runnable.getCallGraph(), modes, ServerCall.class).stream().collect(Collectors.toSet());
	}

	/**
	 * Returns a set of server calls for a process
	 * @param process	process (Task or ISR)
	 * @param modes		(optional) - null works
	 * @return
	 * 		Set of ServerCall
	 */
	public static Set<ServerCall> getServerCallSet(Process process, EMap<ModeLabel, String> modes) {
		HashSet<ServerCall> result = new HashSet<>(); 
		for (Runnable run : getRunnableList(process, modes)) {
			result.addAll(getServerCallSet(run, modes));
		}
		return result;
	}
}
