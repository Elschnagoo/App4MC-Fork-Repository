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

package org.eclipse.app4mc.amalthea.validations;

import org.eclipse.app4mc.validation.annotation.Profile;
import org.eclipse.app4mc.validation.annotation.ProfileGroup;
import org.eclipse.app4mc.validation.core.IProfile;

/**
 * Basic validations for AMALTHEA
 */

@Profile(
	name = "Amalthea Standard Validations",
	description = "This profile should be valid for *ALL* use cases."
)

@ProfileGroup(
	profiles = {
		BasicProfile.class,
		HardwareProfile.class,
		SoftwareProfile.class,
		ConstraintsProfile.class,
		MappingProfile.class
	}
)

public class AmaltheaProfile implements IProfile {
	// Do nothing
}
