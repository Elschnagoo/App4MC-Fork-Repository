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

import org.eclipse.app4mc.amalthea.model.Algorithm;
import org.eclipse.app4mc.amalthea.model.Grouping;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of Scheduler -> ProcessingUnit mapping
 * 
 * <ul>
 * <li>A scheduler should be responsible for at least one processing unit</li>
 * </ul>
 */

@Validation(id = "AM-Mapping-Scheduler-ProcessingUnit")


public class AmMappingSchedulerProcessingUnit extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getScheduler();
	}

	@Override
	public void validate(EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof Scheduler) {
			Scheduler sched = (Scheduler) object;
			
			Algorithm algo = sched.getSchedulingAlgorithm();
			if (algo != null && algo instanceof Grouping ) return;	// no core responsibility required
			
			EList<SchedulerAllocation> allocations = sched.getSchedulerAllocations();
			if (allocations.isEmpty()) {
				addIssue(results, sched, null, "Scheduler not responsible for any core: " + name(sched));
			}

		}
	}

}
