/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger;

public class LoggerEntry implements Comparable<LoggerEntry> {
	/**
	 * Entry's logging severity
	 */
	private EntrySeverity severity;
	/**
	 * Entry's message
	 */
	private String message;
	/**
	 * Entry's type
	 */
	private String type;
	/**
	 * Entry's resource resource
	 */
	private String resource;

	/**
	 * Static builder.
	 *
	 * @return new instance
	 */
	public static LoggerEntry builder() {
		return new LoggerEntry();
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return this.severity.toString() + ": " + this.message + " (" + this.type + ")";
	}

	/**
	 * Get the type of the entry
	 *
	 * @return type
	 */
	public String getType() {
		return this.type;
	}

	/**
	 * Set the type of the entry
	 *
	 * @param type
	 *            entry's type
	 *
	 * @return the entry instance
	 */
	public LoggerEntry setType(final String type) {
		this.type = type;
		return this;
	}

	/**
	 * Get the message of the entry
	 *
	 * @return message
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Set the message of the entry
	 *
	 * @param message
	 *            entry's message
	 *
	 * @return the entry instance
	 */
	public LoggerEntry setMessage(final String message) {
		this.message = message;
		return this;
	}

	/**
	 * Get the entry's severity.
	 *
	 * @return severity
	 */
	public EntrySeverity getSeverity() {
		return this.severity;
	}

	/**
	 * Set the entry's severity.
	 *
	 * @param severity
	 *            logging severity
	 *
	 * @return the entry instance
	 */
	public LoggerEntry setSeverity(final EntrySeverity severity) {
		this.severity = severity;
		return this;
	}

	/**
	 * Get the resource.
	 *
	 * @return resource
	 */
	public String getResource() {
		return this.resource;
	}

	/**
	 * Set the resource.
	 *
	 * @param resource
	 *            resource
	 * @return the entry instance
	 */
	public LoggerEntry setResource(final String resource) {
		this.resource = resource;
		return this;
	}

	/**
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(final LoggerEntry other) {
		return this.severity.compareTo(other.getSeverity());
	}

}
