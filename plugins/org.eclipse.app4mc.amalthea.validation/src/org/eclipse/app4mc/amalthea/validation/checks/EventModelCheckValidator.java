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

package org.eclipse.app4mc.amalthea.validation.checks;

import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.app4mc.amalthea.validation.checks.impl.EventModelCheckValidatorImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.sphinx.emf.check.AbstractCheckValidator;
import org.eclipse.sphinx.emf.check.Check;

/**
 * Checks beside the AMALTHEA EventsModel for all types of Event (e.g. LabelEvent) if each event has complete mapping
 * information
 */
public class EventModelCheckValidator extends AbstractCheckValidator implements IssueCreator {

	private final EventModelCheckValidatorImpl eventsModelImpl;

	public EventModelCheckValidator() {
		super();
		this.eventsModelImpl = new EventModelCheckValidatorImpl(this);
	}


	public EventModelCheckValidator(final boolean doNothing) {
		this.eventsModelImpl = new EventModelCheckValidatorImpl(this);
	}

	@Override
	public void issue(final EObject object, final EStructuralFeature feature, final Object... messageArguments) {
		super.issue(object, feature, messageArguments);
	}


	@Check(constraint = "LabelEvent", categories = { "EventModel" })
	public void checkLabelEventConstraint(final EventModel eventModel) {
		this.eventsModelImpl.checkLabelEventConstraint(eventModel);
	}

}
