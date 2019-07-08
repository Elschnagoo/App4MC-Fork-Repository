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

import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsDataAgeTime;
import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsDelayConstraint;
import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsECLConstraint;
import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsEDFTaskMustHaveDeadline;
import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsRTLimitMustBePositive;
import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsRepetitionConstraint;
import org.eclipse.app4mc.amalthea.validations.ta.constraints.TAConstraintsSynchronizationToleranceNotNegative;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

@ValidationGroup(
	severity = Severity.ERROR,
	validations =  {
		TAConstraintsDataAgeTime.class,
		TAConstraintsDelayConstraint.class,
		TAConstraintsECLConstraint.class,
		TAConstraintsEDFTaskMustHaveDeadline.class,
		TAConstraintsRepetitionConstraint.class,
		TAConstraintsRTLimitMustBePositive.class,
		TAConstraintsSynchronizationToleranceNotNegative.class
	}
)
public class TAConstraintsProfile implements IProfile {

}
