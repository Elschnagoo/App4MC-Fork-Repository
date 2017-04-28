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

	public static List<CallSequenceItem> collectCalls(final Process process) {
		return collectCalls(process, null);
	}

	public static List<CallSequenceItem> collectCalls(final Process process, final List<ModeLiteral> modes) {
		List<CallSequenceItem> itemList = new ArrayList<CallSequenceItem>();
		if (process.getCallGraph() != null) {
			collectCallSequenceItems(process.getCallGraph().getGraphEntries(), modes, itemList);
		}
		return itemList;
	}

	private static void collectCallSequenceItems(final List<GraphEntryBase> input, final List<ModeLiteral> modes,
			final List<CallSequenceItem> itemList) {
		for (GraphEntryBase entry : input) {
			if (entry instanceof ProbabilitySwitch) {
				ProbabilitySwitch propSwitch = (ProbabilitySwitch) entry;
				for (ProbabilitySwitchEntry<GraphEntryBase> pse : propSwitch.getEntries()) {
					collectCallSequenceItems(pse.getItems(), modes, itemList);
				}
			} else if (entry instanceof ModeSwitch) {
				ModeSwitch modeSwitch = (ModeSwitch) entry;
				boolean includeDefault = true;
				for (ModeSwitchEntry<GraphEntryBase> mse : modeSwitch.getEntries()) {
					if (modes == null) {
						collectCallSequenceItems(mse.getItems(), modes, itemList);
					} else if (!Collections.disjoint(mse.getValues(), modes)) {
						collectCallSequenceItems(mse.getItems(), modes, itemList);
						includeDefault = false;
					}
				}
				if (includeDefault && modeSwitch.getDefaultEntry() != null) {
					collectCallSequenceItems(modeSwitch.getDefaultEntry().getItems(), modes, itemList);
				}
			} else if (entry instanceof CallSequence) {
				itemList.addAll(((CallSequence) entry).getCalls());
			}
		}
	}

	public static List<RunnableItem> collectRunnableItems(final Runnable run) {
		return collectRunnableItems(run, null);
	}

	public static List<RunnableItem> collectRunnableItems(final Runnable run, final List<ModeLiteral> modes) {
		List<RunnableItem> itemList = new ArrayList<RunnableItem>();
		collectRunnableItems(run.getRunnableItems(), modes, itemList);
		return itemList;
	}

	private static void collectRunnableItems(final List<RunnableItem> input, final List<ModeLiteral> modes,
			final List<RunnableItem> itemList) {
		for (RunnableItem item : input) {
			if (item instanceof Group) {
				collectRunnableItems(((Group) item).getItems(), modes, itemList);
			} else if (item instanceof RunnableProbabilitySwitch) {
				RunnableProbabilitySwitch propSwitch = (RunnableProbabilitySwitch) item;
				for (ProbabilitySwitchEntry<RunnableItem> pse : propSwitch.getEntries()) {
					collectRunnableItems(pse.getItems(), modes, itemList);
				}
			} else if (item instanceof RunnableModeSwitch) {
				RunnableModeSwitch modeSwitch = (RunnableModeSwitch) item;
				boolean includeDefault = true;
				for (ModeSwitchEntry<RunnableItem> mse : modeSwitch.getEntries()) {
					if (modes == null) {
						collectRunnableItems(mse.getItems(), modes, itemList);
					} else if (!Collections.disjoint(mse.getValues(), modes)) {
						collectRunnableItems(mse.getItems(), modes, itemList);
						includeDefault = false;
					}
				}
				if (includeDefault && modeSwitch.getDefaultEntry() != null) {
					collectRunnableItems(modeSwitch.getDefaultEntry().getItems(), modes, itemList);
				}
			} else {
				itemList.add(item);
			}
		}
	}

}
