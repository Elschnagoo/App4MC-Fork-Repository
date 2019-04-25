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

import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.validations.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of HwPort
 * 
 * <ul>
 * <li>A HwPort can only have one (non internal) HwConnection</li>
 * </ul>
 */

@Validation(id = "AM-HW-Port")

public class AmHwPort extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwPort();
	}

	@Override
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof HwPort) {
			HwPort port = (HwPort) object;
			
			// ***** A HwPort can only have one (non internal) HwConnection
			
			if (port.isDelegated())
				return; // ignore HwStructure ports
			
			EList<HwConnection> connections = port.getConnections();
			if (connections.size() > 1) {
				int counter = 0;
				for (HwConnection con : connections) {
					if (!con.isInternal())
						counter++; // ignore internal connections of connection handlers
				}
				if (counter > 1) {
					// AmaltheaPackage.eINSTANCE.getHwPort_Connections(),
					addIssue(results, port, "HW Port " + longName(port) + ": found " + counter + " connections, only 1 is allowed");
				}
			}

		}
	}

}
