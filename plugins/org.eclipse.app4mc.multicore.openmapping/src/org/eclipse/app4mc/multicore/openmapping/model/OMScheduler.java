/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.model;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;

public class OMScheduler {
	private final TaskScheduler schedulerRef;

	public OMScheduler(final TaskScheduler schedulerRef) {
		this.schedulerRef = schedulerRef;
	}

	public OMScheduler(final OMCore core) {
		final String coreName = core.getCoreRef().getName();
		this.schedulerRef = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		this.schedulerRef.setName("SCHED_" + coreName);
	}

	public OMScheduler(final Core core) {
		final String coreName = core.getName();
		this.schedulerRef = AmaltheaFactory.eINSTANCE.createTaskScheduler();
		this.schedulerRef.setName("SCHED_" + coreName);
	}

	public TaskScheduler getSchedulerRef() {
		return this.schedulerRef;
	}
}
