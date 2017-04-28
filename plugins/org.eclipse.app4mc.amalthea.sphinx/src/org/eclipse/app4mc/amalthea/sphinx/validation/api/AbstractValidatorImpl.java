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
