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
package org.eclipse.app4mc.amalthea.validations.ta.software;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.EnforcedMigration;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.TaskScheduler;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of enforced migration.
 * 
 * <ul>
 * <li>resource owner must be set and refer to a task scheduler</li>
 * </ul>
 */

@Validation(id = "TA-Software-EnforcedMigration")
public class TASoftwareEnforcedMigration extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getEnforcedMigration();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof EnforcedMigration) {
			EnforcedMigration em = (EnforcedMigration) eObject;
			Scheduler s = em.getResourceOwner();
			INamed namedContainer = AmaltheaServices.getContainerOfType(em, INamed.class);
			if (s == null) {
				addIssue(results, em, ePackage.getEnforcedMigration_ResourceOwner(), "The resource owner of the " + objectInfo(em) + " in " +
						objectInfo(namedContainer) + " must be set.");
			} else if (!(s instanceof TaskScheduler)) {
				addIssue(results, em, ePackage.getEnforcedMigration_ResourceOwner(), "The resource owner of the " + objectInfo(em) + " in " +
						objectInfo(namedContainer) + " must refer to a task scheduler (instead of " + objectInfo(s) + ").");
			}
		}
	}

}
