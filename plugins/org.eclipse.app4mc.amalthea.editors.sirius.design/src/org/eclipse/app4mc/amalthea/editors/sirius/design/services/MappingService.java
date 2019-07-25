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

package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.MappingModel;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.Task;

public class MappingService {

	public List<ProcessingUnit> getCoresOfMappingModel(final MappingModel mappingModel) {
		final List<ProcessingUnit> result = new ArrayList<>();
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

	public List<ProcessingUnit> getCoresForScheduler(final Scheduler scheduler) {
		final List<ProcessingUnit> result = new ArrayList<>();
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
		if (scheduler == null) return null;
		
		return AmaltheaServices.getContainerOfType(scheduler, Amalthea.class);
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
