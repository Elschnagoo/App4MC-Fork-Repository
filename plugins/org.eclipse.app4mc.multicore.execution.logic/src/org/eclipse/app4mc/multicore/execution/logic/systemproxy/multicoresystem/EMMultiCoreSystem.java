/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *  
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
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
