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

package org.eclipse.app4mc.amalthea.validations.misc;

import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskAllocation;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of Task -> Scheduler mapping
 * 
 * <ul>
 * <li>A task should have an allocation to a task scheduler</li>
 * </ul>
 */

@Validation(id = "AM-Mapping-Task-Scheduler")

public class AmMappingTaskScheduler extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getTask();
	}

	@Override
	public void validate(EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof Task) {
			Task task = (Task) object;
			
			Set<TaskAllocation> allocations = AmaltheaIndex.getReferringObjects(task, TaskAllocation.class);
			if (allocations.isEmpty()) {
				addIssue(results, task, null, "Unmapped task found: " + name(task));
			}

			// multiple allocations ?
		}
	}

}
