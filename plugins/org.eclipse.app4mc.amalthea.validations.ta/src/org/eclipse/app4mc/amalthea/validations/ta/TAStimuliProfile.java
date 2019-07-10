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

import org.eclipse.app4mc.amalthea.validations.ta.stimuli.TAStimuliArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.validations.ta.stimuli.TAStimuliClockMultiplierList;
import org.eclipse.app4mc.amalthea.validations.ta.stimuli.TAStimuliClockSinusFunction;
import org.eclipse.app4mc.amalthea.validations.ta.stimuli.TAStimuliClockTriangleFunction;
import org.eclipse.app4mc.amalthea.validations.ta.stimuli.TAStimuliPeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.validations.ta.stimuli.TAStimuliVRStimulus;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

@ValidationGroup(
		severity = Severity.ERROR,
		validations =  {
			TAStimuliArrivalCurveStimulus.class,
			TAStimuliClockMultiplierList.class,
			TAStimuliClockSinusFunction.class,
			TAStimuliClockTriangleFunction.class,
			TAStimuliPeriodicSyntheticStimulus.class,
			TAStimuliVRStimulus.class
		}
	)
public class TAStimuliProfile implements IProfile {
	// Do nothing
}
