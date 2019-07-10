/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta;

import org.eclipse.app4mc.amalthea.validations.ta.misc.TAMiscSemaphore;
import org.eclipse.app4mc.validation.annotation.Profile;
import org.eclipse.app4mc.validation.annotation.ProfileGroup;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

/**
 * Validations for AMALTHEA models used in a Timing Architects Simulation
 */
@Profile(
	name = "Timing Architects Simulation",
	description = "Validations for AMALTHEA models used in a Timing Architects Simulation."
)
@ProfileGroup(
	profiles = {
		TABasicProfile.class,
		TAConstraintsProfile.class,
		TAHardwareProfile.class,
		TAStimuliProfile.class
	}
)
@ValidationGroup(
	severity = Severity.ERROR,
	validations = {
		TAMiscSemaphore.class
	}
)
public class TimingArchitectsProfile implements IProfile {
    // Do nothing
}
