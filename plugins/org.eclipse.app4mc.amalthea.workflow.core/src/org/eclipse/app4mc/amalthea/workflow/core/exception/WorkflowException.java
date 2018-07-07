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

package org.eclipse.app4mc.amalthea.workflow.core.exception;

import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;

/**
 * {@link RuntimeException} to be used in case that a general exception is coming up in a {@link WorkflowComponent}.
 *
 */
public class WorkflowException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -3848146698384251480L;

	public WorkflowException() {
	}

	public WorkflowException(final String message) {
		super(message);
	}

	public WorkflowException(final Throwable cause) {
		super(cause);
	}

	public WorkflowException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public WorkflowException(final String message, final Throwable cause, final boolean enableSuppression,
			final boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
