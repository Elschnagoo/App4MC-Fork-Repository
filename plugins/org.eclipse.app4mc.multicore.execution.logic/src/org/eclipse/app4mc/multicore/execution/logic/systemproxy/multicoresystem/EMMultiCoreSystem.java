/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.logic.systemproxy.multicoresystem;

import java.util.function.Supplier;

import org.eclipse.app4mc.multicore.execution.logic.executionmodel.ExecutionModel;
import org.eclipse.app4mc.multicore.execution.logic.systemproxy.scheduler.ISchedulerAlgorithm;

public class EMMultiCoreSystem extends MultiCoreSystem{
	
	private final ExecutionModel execModel;
	
	public EMMultiCoreSystem(long timeinc,Supplier<ISchedulerAlgorithm> schedulerSuplier,ExecutionModel m) {
		super(timeinc,schedulerSuplier);
		this.execModel=m;
	}
	
	@Override
	public void addCoreScheduler(String corename) {
		if(!getSchedulers().containsKey(corename)){
			super.addCoreScheduler(corename);
			addListener(corename, new EMTracer(corename, execModel));
		}
	}
	
}
