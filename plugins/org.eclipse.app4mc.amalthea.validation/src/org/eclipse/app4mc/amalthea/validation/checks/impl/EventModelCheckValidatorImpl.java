/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;

public class EventModelCheckValidatorImpl extends AbstractValidatorImpl {

	public EventModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}


	public EventModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the information for all {@link LabelEvent} are
	 * complete and correct.
	 */
	public void checkLabelEventConstraint(final EventModel eventModel) {			
		// all references are optional !
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link ProcessEvent}
	 * are complete and correct.
	 */
	public void checkProcessEventConstraint(final EventModel eventModel) {
		// all references are optional !
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link RunnableEvent}
	 * are complete and correct.
	 */
	public void checkRunnableEventConstraint(final EventModel eventModel) {
		// all references are optional !
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link SemaphoreEvent}
	 * are complete and correct.
	 */
	public void checkSemaphoreEventConstraint(final EventModel eventModel) {
		// all references are optional !
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link StimulusEvent}
	 * are complete and correct.
	 */
	public void checkStimulusEventConstraint(final EventModel eventModel) {

		// all references are optional !
	}
}
