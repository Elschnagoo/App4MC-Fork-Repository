/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.validations.hardware;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.PortInterface;
import org.eclipse.app4mc.amalthea.model.PortType;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of HwPort enumerations
 * 
 * <ul>
 * <li>PortType must be set</li>
 * <li>PortInterface must be set</li>
 * </ul>
 */

@Validation(id = "AM-HW-Port-Definition")

public class AmHwPortEnumerations extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwPort();
	}

	@Override
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof HwPort) {
			HwPort port = (HwPort) object;
			
			// ***** PortType must be set
			
			if (port.getPortType() == PortType._UNDEFINED_) {
				// AmaltheaPackage.eINSTANCE.getHwPort_PortType()
				addIssue(results, port, "HW Port " + longName(port) + ": undefined port type");
			}
			
			// ***** PortInterface must be set
			
			if (port.getPortInterface() == PortInterface._UNDEFINED_) {
				// AmaltheaPackage.eINSTANCE.getHwPort_PortInterface()
				addIssue(results, port, "HW Port " + longName(port) + ": undefined port interface");
			}

		}
	}

}
