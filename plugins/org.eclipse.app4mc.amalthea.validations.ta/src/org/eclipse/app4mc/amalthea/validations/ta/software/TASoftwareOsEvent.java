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
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.EventMask;
import org.eclipse.app4mc.amalthea.model.OsEvent;
import org.eclipse.app4mc.amalthea.model.SetEvent;
import org.eclipse.app4mc.amalthea.model.WaitEvent;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates sanity of usage of OsEvents.
 * 
 * <ul>
 * <li>if there is at least one wait event for this os event, there must also be at least one set event for this os event</li>
 * </ul>
 */

@Validation(id = "TA-Stimuli-ArrivalCurveStimulus")
public class TASoftwareOsEvent extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getOsEvent();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof OsEvent) {
			OsEvent oe = (OsEvent) eObject;
			Set<EventMask> ems = AmaltheaIndex.getReferringObjects(oe, ePackage.getEventMask_Events(), EventMask.class);
			Optional<WaitEvent> we = ems.stream().map(em -> AmaltheaServices.getContainerOfType(em, WaitEvent.class)).filter(Objects::nonNull).findAny();
			Optional<SetEvent> sw = ems.stream().map(em -> AmaltheaServices.getContainerOfType(em, SetEvent.class)).filter(Objects::nonNull).findAny();
			if (we.isPresent() && !sw.isPresent()) {
				addIssue(results, oe, null, objectInfo(oe) + " is waited upon, but it is never set.");
			}
		}
	}

}
