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

package org.eclipse.app4mc.amalthea.sphinx.validation.api;


public abstract class AbstractValidatorImpl {

	protected final IssueCreator issueCreator;
	private final IEObjectHelper eObjectHelper;


	public AbstractValidatorImpl(final IssueCreator issueCreator) {
		this.issueCreator = issueCreator;
		this.eObjectHelper = new EObjectHelper();
	}


	public AbstractValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		this.issueCreator = issueCreator;
		this.eObjectHelper = objectHelper;
	}

	public IEObjectHelper getObjectHelper() {
		return this.eObjectHelper;
	}

}
