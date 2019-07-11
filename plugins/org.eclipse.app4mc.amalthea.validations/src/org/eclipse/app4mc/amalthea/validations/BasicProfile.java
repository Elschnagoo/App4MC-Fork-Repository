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

import org.eclipse.app4mc.amalthea.validations.basic.AmBasicCounter;
import org.eclipse.app4mc.amalthea.validations.basic.AmBasicCustomPropertyKey;
import org.eclipse.app4mc.amalthea.validations.basic.AmBasicDataSize;
import org.eclipse.app4mc.amalthea.validations.basic.AmBasicQuantity;
import org.eclipse.app4mc.amalthea.validations.basic.AmBasicTimeRange;
import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;

 
@ValidationGroup(
		severity = Severity.ERROR,
		validations =  {
				AmBasicCounter.class,
				AmBasicDataSize.class,
				AmBasicQuantity.class,
				AmBasicTimeRange.class
		}
)

@ValidationGroup(
		severity = Severity.WARNING,
		validations =  {
				AmBasicCustomPropertyKey.class
		}
)

public class BasicProfile implements IProfile {
    // Do nothing
}
