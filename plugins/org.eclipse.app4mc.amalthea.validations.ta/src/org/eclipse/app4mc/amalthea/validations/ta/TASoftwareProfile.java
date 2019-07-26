/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta;

import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareModeConditionConjunctionAlwaysFalse;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareModeConditionDisjunctionAlwaysTrue;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareModeLabel;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareModeLabelAccess;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareModeValue;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareOsEvent;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareRunnableCall;
import org.eclipse.app4mc.amalthea.validations.ta.software.TASoftwareServerCall;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

@ValidationGroup(
	severity = Severity.ERROR,
	validations =  {
		TASoftwareModeLabel.class,
		TASoftwareModeLabelAccess.class,
		TASoftwareModeValue.class,
		TASoftwareOsEvent.class,
		TASoftwareRunnableCall.class,
		TASoftwareServerCall.class
	}
)
@ValidationGroup(
	severity = Severity.WARNING,
	validations = {
		TASoftwareModeConditionConjunctionAlwaysFalse.class,
		TASoftwareModeConditionDisjunctionAlwaysTrue.class
	}
)
public class TASoftwareProfile implements IProfile {
	// Do nothing
}
