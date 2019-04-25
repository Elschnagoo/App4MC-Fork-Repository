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

package org.eclipse.app4mc.amalthea.validation.profile;

import org.eclipse.app4mc.amalthea.validations.hardware.AmHwAccessPath;
import org.eclipse.app4mc.amalthea.validations.hardware.AmHwConnection;
import org.eclipse.app4mc.amalthea.validations.hardware.AmHwDefinition;
import org.eclipse.app4mc.amalthea.validations.hardware.AmHwModuleDefinition;
import org.eclipse.app4mc.amalthea.validations.hardware.AmHwPort;
import org.eclipse.app4mc.amalthea.validations.hardware.AmHwPortEnumerations;
import org.eclipse.app4mc.amalthea.validations.hardware.AmHwStructure;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;


/**
 * Basic validations for AMALTHEA
 */
 
@ValidationGroup(
		severity = Severity.ERROR,
		validations =  {
				AmHwStructure.class,
				AmHwPort.class,
				AmHwConnection.class,
				AmHwAccessPath.class,
				AmHwDefinition.class
		}
)

@ValidationGroup(
		severity = Severity.WARNING,
		validations =  {
				AmHwModuleDefinition.class,
				AmHwPortEnumerations.class
		}
)

public class HardwareProfile implements IProfile {
    // Do nothing
}
