/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;


public class HardwareModelCheckValidatorImpl extends AbstractValidatorImpl {

	public HardwareModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public HardwareModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	// ===========================================================================
	// TODO
	// ===========================================================================


	/*
	 * Checks for the entire AMALTHEA Hardware model instance if ...
	 */
	public void checkSystemStructure(final HWModel hwModel) {

	}
}
