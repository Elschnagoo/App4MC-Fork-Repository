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


}
