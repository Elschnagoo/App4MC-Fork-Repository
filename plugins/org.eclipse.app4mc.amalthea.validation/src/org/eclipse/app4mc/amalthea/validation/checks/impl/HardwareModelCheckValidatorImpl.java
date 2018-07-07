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
