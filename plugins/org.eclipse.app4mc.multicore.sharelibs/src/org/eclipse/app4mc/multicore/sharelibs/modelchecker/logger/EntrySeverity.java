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

public class EntrySeverity implements Comparable<EntrySeverity> {
	private EntrySeverityLevel severity;

	public static EntrySeverity of(final EntrySeverityLevel severity) {
		final EntrySeverity sev = new EntrySeverity();

		sev.severity = severity;

		return sev;
	}

	public boolean check(final EntrySeverityLevel severity) {
		return this.severity.ordinal() > severity.ordinal();
	}

	@Override
	public int compareTo(final EntrySeverity arg0) {
		final Integer thisLevel = this.severity.ordinal();
		final Integer otherLevel = arg0.severity.ordinal();

		return thisLevel.compareTo(otherLevel);
	}

	public EntrySeverityLevel getSeverityLevel() {
		return this.severity;
	}

}
