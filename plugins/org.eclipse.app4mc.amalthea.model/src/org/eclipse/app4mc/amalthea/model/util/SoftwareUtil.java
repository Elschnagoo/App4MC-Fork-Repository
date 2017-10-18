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
import java.util.List;
import java.util.function.Function;

import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Group;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeSwitch;
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitch;
import org.eclipse.app4mc.amalthea.model.ProbabilitySwitchEntry;
import org.eclipse.app4mc.amalthea.model.Process;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch;
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch;

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

}
