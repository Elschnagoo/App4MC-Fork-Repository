/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta.constraints;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.EarliestDeadlineFirst;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates whether a task that is mapped to a scheduler with EDF scheduling policy
 * has a deadline requirement.
 * 
 * <ul>
 * <li>EDF tasks must have a deadline requirement</li>
 * </ul>
 */

@Validation(id = "TA-Constraints-EDFTaskMustHaveDeadline")
public class TAConstraintsEDFTaskMustHaveDeadline extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTask();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof Task) {
			Task task = (Task) eObject;
			if (AmaltheaIndex.getReferringObjects(task, TaskAllocation.class, ePackage.getTaskAllocation_Task()).stream()
					// check if at least one task scheduler that schedules this task has an EDF scheduling algorithm
					.anyMatch(ta -> ta.getScheduler() != null && ta.getScheduler().getSchedulingAlgorithm() instanceof EarliestDeadlineFirst)) {
				if (AmaltheaIndex.getReferringObjects(task, ProcessRequirement.class, ePackage.getProcessRequirement_Process()).stream()
						// if there is no process requirement with and upper limit
						.noneMatch(pr -> pr.getLimit() != null && pr.getLimit().getLimitType() == LimitType.UPPER_LIMIT &&
							// and the limit is not a TimeRequirementLimit with metric RESPONSE_TIME
							pr.getLimit() instanceof TimeRequirementLimit &&
							// then there is no deadline
							((TimeRequirementLimit)pr.getLimit()).getMetric() == TimeMetric.RESPONSE_TIME)) {
					addIssue(results, task, null, "There is no deadline ProcessRequirement for " + objectInfo(task) +
							", since it is scheduled by an Earliest Deadline First scheduler a deadline must be specified.");
				}
			}
		}
	}

}
