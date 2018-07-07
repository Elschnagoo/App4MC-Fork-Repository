/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.algo;

import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.core.SchedulerTask;

public class PreemptiveRMSAlgo implements ISchedulerAlgorithm{
	@Override
	public int compare(SchedulerTask o1, SchedulerTask o2) {
		return Long.compare(o1.getPeriod(), o2.getPeriod());
	}


	@Override
	public boolean isPreemptiveScheduling() {
		return true;
	}

}
