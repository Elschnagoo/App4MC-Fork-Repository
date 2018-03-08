/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 *   
 *******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.algorithms.helper;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.multicore.openmapping.model.OMCore;
import org.eclipse.app4mc.multicore.openmapping.model.OMTask;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;

public class ListBuilder {
	public static ArrayList<OMCore> getCoreList(final HWModel hw) {
		UniversalHandler.getInstance().logCon("Building CoreList");
		final ArrayList<OMCore> coreList = new ArrayList<OMCore>();

// TODO implement
		
//		final HwSystem system;
//		if ((system = hw.getSystem()) == null) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the System element is missing.", null);
//			return null;
//		}
//
//		// Check if the system has ECUs
//		if (system.getEcus().size() <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model, the System contains no ECU's.", null);
//			return null;
//		}
//
//		// Check the ECUs of the System and find nested Cores
//		final Iterator<ECU> itEcus = system.getEcus().iterator();
//		while (itEcus.hasNext()) {
//			final ECU ecu = itEcus.next();
//			UniversalHandler.getInstance().logCon("Found ECU '" + ecu.getName() + "'");
//
//			// If the ECU has no Microcontrollers, it will skipped
//			if (ecu.getMicrocontrollers().size() <= 0) {
//				UniversalHandler.getInstance().logCon("No Microcontrollers on ECU, skipping...");
//				continue;
//			}
//
//			final Iterator<Microcontroller> mcs = ecu.getMicrocontrollers().iterator();
//			while (mcs.hasNext()) {
//				final Microcontroller mc = mcs.next();
//				UniversalHandler.getInstance().logCon("Found Microcontroller '" + mc.getName() + "'");
//				final Iterator<ProcessingUnit> cores = mc.getCores().iterator();
//				if (null == cores) {
//					UniversalHandler.getInstance().logCon("No cores on Microcontroller, skipping...");
//					continue;
//				}
//
//				while (cores.hasNext()) {
//					final ProcessingUnit core = cores.next();
//					UniversalHandler.getInstance().logCon("Found Core '" + core.getName() + "'");
//					coreList.add(new OMCore(core));
//				}
//			}
//		}
//
//		if (coreList.size() <= 0) {
//			UniversalHandler.getInstance().log("Invalid Hardware Model! No Core elements could be found.", null);
//			return null;
//		}

		return coreList;
	}

	public static ArrayList<OMTask> getTaskList(final SWModel sw) {
		UniversalHandler.getInstance().logCon("Building TaskList");
		final ArrayList<OMTask> taskList = new ArrayList<OMTask>();

		// Check for Tasks in SWModel
		if (sw.getTasks().size() <= 0) {
			UniversalHandler.getInstance().log("Invalid Software Model, the Task elements are missing.", null);
			return null;
		}

		// Fetch Tasks, create ExtendedTasks with additional information
		UniversalHandler.getInstance().logCon("Found " + sw.getTasks().size() + " Task(s).");
		final Iterator<Task> itTasks = sw.getTasks().iterator();
		while (itTasks.hasNext()) {
			taskList.add(new OMTask(itTasks.next()));
		}

		if (taskList.size() <= 0) {
			UniversalHandler.getInstance().log("Invalid Software Model, the Task list is empty.", null);
			return null;
		}
		return taskList;
	}
}
