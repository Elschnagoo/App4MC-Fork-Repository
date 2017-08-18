/*********************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.Core;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.Task;

public class MappingService {

	public List<Core> getCoresOfMappingModel(final MappingModel mappingModel) {
		final List<Core> result = new ArrayList<>();
		if (null != mappingModel) {
			mappingModel.getSchedulerAllocation().forEach(alloc -> {
				result.addAll(alloc.getResponsibility());
			});
		}
		return result;
	}

	public List<Scheduler> getSchedulersOfMappingModel(final MappingModel mappingModel) {
		final List<Scheduler> result = new ArrayList<>();
		if (null != mappingModel) {
			mappingModel.getSchedulerAllocation().forEach(alloc -> {
				if (null != alloc.getScheduler())
					result.add(alloc.getScheduler());
			});
		}
		return result;
	}

	public List<Core> getCoresForScheduler(final Scheduler scheduler) {
		final List<Core> result = new ArrayList<>();
		if (null != scheduler) {
			final Amalthea amalthea = getAmaltheaForScheduler(scheduler);
			if (null != amalthea && null != amalthea.getMappingModel()) {
				amalthea.getMappingModel().getSchedulerAllocation().forEach(alloc -> {
					if (alloc.getScheduler().equals(scheduler)) {
						result.addAll(alloc.getResponsibility());
					}
				});
			}
		}
		return result;
	}

	private Amalthea getAmaltheaForScheduler(Scheduler scheduler) {
		if (null != scheduler) {
			// TODO: Dirty hack to get mapping model, needs to be improved to generic design
			if (null != scheduler.eContainer() && null != scheduler.eContainer().eContainer()
					&& null != scheduler.eContainer().eContainer().eContainer()) {
				return (Amalthea) scheduler.eContainer().eContainer().eContainer();
			}
		}
		return null;
	}

	public List<Task> getTasksForScheduler(final Scheduler scheduler) {
		final List<Task> result = new ArrayList<>();
		if (null != scheduler) {
			final Amalthea amalthea = getAmaltheaForScheduler(scheduler);
			if (null != amalthea && null != amalthea.getMappingModel()) {
				amalthea.getMappingModel().getTaskAllocation().stream().map(alloc -> alloc).forEach(alloc -> {
					if (alloc.getScheduler().equals(scheduler)) {
						result.add(alloc.getTask());
					}
				});
			}
		}
		return result;
	}

}
