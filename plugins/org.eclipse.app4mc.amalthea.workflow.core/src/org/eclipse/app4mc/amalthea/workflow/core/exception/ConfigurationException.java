/**
 * *******************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.workflow.core.exception;

/**
 * {@link RuntimeException} to be thrown in case of an error based on a configuration.
 *
 */
public class ConfigurationException extends RuntimeException {

	/**
	 *
	 */
	private static final long serialVersionUID = -4715314726573183190L;

	public ConfigurationException() {
		super();
	}

	public ConfigurationException(final String string) {
		super(string);
	}

	public ConfigurationException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public ConfigurationException(final Throwable cause) {
		super(cause);
	}

}
