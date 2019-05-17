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
import org.eclipse.app4mc.amalthea.model.PortInterface;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of HwConnection
 * 
 * <ul>
 * <li>HwConnections must refer to two HwPorts</li>
 * <li>HwConnections must be linked to HwPorts of the same Interface</li>
 * </ul>
 */

@Validation(id = "AM-HW-Connection")

public class AmHwConnection extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwConnection();
	}

	@Override
	public void validate(final EObject object, List<ValidationDiagnostic> results) {
		if (object instanceof HwConnection) {
			HwConnection connection = (HwConnection) object;
			
			boolean continueChecks = true;
			HwPort port1 = connection.getPort1();
			HwPort port2 = connection.getPort2();
			
			// ***** HwConnections must refer to two HwPorts
			
			if (port1 == null) {
				addIssue(results, connection, ePackage.getHwConnection_Port1(),
						"HW Connection " + longName(connection) + ": Port 1 is missing");
				continueChecks = false;
			}
			
			if (port2 == null) {
				addIssue(results, connection, ePackage.getHwConnection_Port2(),
						"HW Connection " + longName(connection) + ": Port 2 is missing");
				continueChecks = false;
			}
			
			if (port1 != null && port1 == port2) {
				addIssue(results, connection, ePackage.getHwConnection_Port1(),
						"HW Connection " + longName(connection) + ": Port 1 equals port 2");
				continueChecks = false;
			}
			
			if (!continueChecks)
				return; // fundamental error -> no further checks
			
			// ***** HwConnections must be linked to HwPorts of the same Interface
			
			if (!connection.isInternal() // internal connection -> no error
					&& port1.getPortInterface() != PortInterface._UNDEFINED_ // undefined -> no error
					&& port2.getPortInterface() != PortInterface._UNDEFINED_
					&& port1.getPortInterface() != port2.getPortInterface()) {
				addIssue(results, connection, ePackage.getHwConnection_Port1(),
						"HW Connection " + longName(connection) + ": Port interfaces do not match");
			}

		}
	}

}
