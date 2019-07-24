/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder;
import org.eclipse.emf.ecore.EObject;


public class ConstraintsUtil {

	public static Time getDeadline(final AbstractProcess process) {
		return getDeadline(process, getConstraintsModel(process));
	}

	public static Time getDeadline(final AbstractProcess process, final ConstraintsModel constModel) {
		if (process == null || constModel == null) return null;
		
		List<Time> list = getDeadlineRequirements(process, constModel).stream()
				.map(req -> ((TimeRequirementLimit) req.getLimit()).getLimitValue())
				.filter(Objects::nonNull)
				.sorted(Time::compareTo)
				.collect(Collectors.toList());
		if (list.isEmpty()) return null;
		
		return list.get(0);
	}

	public static Time getDeadline(final Runnable runnable) {
		return getDeadline(runnable, getConstraintsModel(runnable));
	}

	public static Time getDeadline(final Runnable runnable, final ConstraintsModel constModel) {
		if (runnable == null || constModel == null) return null;
		
		List<Time> list = getDeadlineRequirements(runnable, constModel).stream()
				.map(req -> ((TimeRequirementLimit) req.getLimit()).getLimitValue())
				.filter(Objects::nonNull)
				.sorted(Time::compareTo)
				.collect(Collectors.toList());
		if (list.isEmpty()) return null;
		
		return list.get(0);
	}

	// ***** Deadline Requirements *****

	public static void addNewDeadlineRequirement(final ConstraintsModel container, final AbstractProcess process, final Time deadline) {
		if (container == null) return;

		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		limit.setMetric(TimeMetric.RESPONSE_TIME);
		limit.setLimitType(LimitType.UPPER_LIMIT);
		limit.setLimitValue(deadline);
		final ProcessRequirement req = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		req.setName("Process deadline");
		req.setProcess(process);
		req.setLimit(limit);
		container.getRequirements().add(req);
	}

	public static void addNewDeadlineRequirement(final ConstraintsModel container, final Runnable runnable, final Time deadline) {
		if (container == null) return;

		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		limit.setMetric(TimeMetric.RESPONSE_TIME);
		limit.setLimitType(LimitType.UPPER_LIMIT);
		limit.setLimitValue(deadline);
		final RunnableRequirement req = AmaltheaFactory.eINSTANCE.createRunnableRequirement();
		req.setName("Runnable deadline");
		req.setRunnable(runnable);
		req.setLimit(limit);
		container.getRequirements().add(req);
	}

	public static void updateDeadlineRequirement(Task task, Time deadline) {
		updateDeadlineRequirement(task, deadline, getConstraintsModel(task));
	}

	public static void updateDeadlineRequirement(Task task, Time deadline, ConstraintsModel constModel) {
		final List<ProcessRequirement> requirements = getDeadlineRequirements(task, constModel);
		
		if (requirements.isEmpty()) {
			// create deadline requirement
			addNewDeadlineRequirement(constModel, task, deadline);
		} else {
			// modify first deadline requirement
			ProcessRequirement first = requirements.remove(0);
			((TimeRequirementLimit) first.getLimit()).setLimitValue(deadline);
			// delete the rest
			AmaltheaIndex.deleteAll(requirements);
		}
	}

	public static void updateDeadlineRequirement(Runnable runnable, Time deadline) {
		updateDeadlineRequirement(runnable, deadline, getConstraintsModel(runnable));
	}

	public static void updateDeadlineRequirement(Runnable runnable, Time deadline, ConstraintsModel constModel) {
		final List<RunnableRequirement> requirements = getDeadlineRequirements(runnable, constModel);
		
		if (requirements.isEmpty()) {
			// create deadline requirement
			addNewDeadlineRequirement(constModel, runnable, deadline);
		} else {
			// modify first deadline requirement
			RunnableRequirement first = requirements.remove(0);
			((TimeRequirementLimit) first.getLimit()).setLimitValue(deadline);
			// delete the rest
			AmaltheaIndex.deleteAll(requirements);
		}
	}

	public static List<RunnableRequirement> getDeadlineRequirements(Runnable runnable, ConstraintsModel constModel) {
		if (runnable == null || constModel == null) return Collections.emptyList();

		return constModel.getRequirements().stream()
			.filter(req -> req.getLimit().getLimitType() == LimitType.UPPER_LIMIT
				&& req instanceof RunnableRequirement
				&& ((RunnableRequirement) req).getRunnable() == runnable
				&& req.getLimit() instanceof TimeRequirementLimit
				&& ((TimeRequirementLimit) req.getLimit()).getMetric() == TimeMetric.RESPONSE_TIME)
			.map(req -> (RunnableRequirement) req)
			.collect(Collectors.toList());
	}

	public static List<ProcessRequirement> getDeadlineRequirements(AbstractProcess process, ConstraintsModel constModel) {
		if (process == null || constModel == null) return Collections.emptyList();

		return constModel.getRequirements().stream()
		.filter(req -> req.getLimit().getLimitType() == LimitType.UPPER_LIMIT
			&& req instanceof ProcessRequirement
			&& ((ProcessRequirement) req).getProcess() == process
			&& req.getLimit() instanceof TimeRequirementLimit
			&& ((TimeRequirementLimit) req.getLimit()).getMetric() == TimeMetric.RESPONSE_TIME)
		.map(req -> (ProcessRequirement) req)
		.collect(Collectors.toList());
	}

	@SuppressWarnings("unused")
	private static ConstraintsModel getConstraintsModel(EObject object) {
		if (object == null) return null;
		
		Amalthea modelRoot = AmaltheaServices.getContainerOfType(object, Amalthea.class);
		if (modelRoot == null) return null;
		
		return ModelUtil.getOrCreateConstraintsModel(modelRoot);
	}

}
