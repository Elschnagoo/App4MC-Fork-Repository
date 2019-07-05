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

	// TODO: Should the process requirement's limit be a TimeRequirementLimit with metric RESPONSE_TIME?
	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof Task) {
			Task task = (Task) eObject;
			if (AmaltheaIndex.getReferringObjects(task, ePackage.getTaskAllocation_Task(), TaskAllocation.class).stream()
					// check if at least one task scheduler that schedules this task has an EDF scheduling algorithm
					.anyMatch(ta -> ta.getScheduler() != null && ta.getScheduler().getSchedulingAlgorithm() instanceof EarliestDeadlineFirst)) {
				if (AmaltheaIndex.getReferringObjects(task, ePackage.getProcessRequirement_Process(), ProcessRequirement.class).stream()
						// if there is no process requirement with and upper limit then there is not deadline specified for this task
						.noneMatch(pr -> pr.getLimit() != null && pr.getLimit().getLimitType() == LimitType.UPPER_LIMIT)) {
					addIssue(results, task, null, "There is no deadline ProcessRequirement for task " + task.getName() +
							", since it is scheduled by an Earliest Deadline First scheduler a deadline must be specified.");
				}
			}
		}
	}

}
