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

import java.util.HashSet;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.PortType;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of HwStructure
 * <ul>
 * <li>Connections must only refer to contained HwPorts</li>
 * <li>Inner connections always need one Initiator and one Responder HwPort</li>
 * <li>Delegated connections always connect HwPorts of the same type</li>
 * </ul>
 */

@Validation(id = "AM-HW-Structure")

public class AmHwStructure extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwStructure();
	}

	@Override
	public void validate(final EObject object, final List<ValidationDiagnostic> results) {
		if (object instanceof HwStructure) {
			HwStructure structure = (HwStructure) object;
			
			final HashSet<HwModule> subModules = new HashSet<HwModule>(AmaltheaServices.getAllModules(structure));
			final HashSet<HwStructure> subStructures = new HashSet<HwStructure>(structure.getStructures());
			
			// check for each connection of structure
			for (HwConnection conn : structure.getConnections()) {
				boolean p1InnerPort = false;
				boolean p1OuterPort = false;
				boolean p2InnerPort = false;
				boolean p2OuterPort = false;
				
				HwPort port1 = conn.getPort1();
				HwPort port2 = conn.getPort2();
				// fundamental checks are handled in method checkHwConnection(HwConnection)
				if (port1 == null || port2 == null || port1 == port2)
					break;
				
				EObject container1 = port1.eContainer();
				if (subModules.contains(container1) || subStructures.contains(container1)) {
					p1InnerPort = true;
				} else if (container1 == structure) {
					p1OuterPort = true;
				} else {
// It is only a recommendation (perhaps a future warning)
//				addIssue(results, conn, "HW Connection " + name(conn) + ": Port 1 is not contained in structure");
				}
				
				EObject container2 = port2.eContainer();
				if (subModules.contains(container2) || subStructures.contains(container2)) {
					p2InnerPort = true;
				} else if (container2 == structure) {
					p2OuterPort = true;
				} else {
// It is only a recommendation (perhaps a future warning)
//				addIssue(results, conn, "HW Connection " + name(conn) + ": Port 2 is not contained in structure");
				}
				
				if ((p1InnerPort && p2InnerPort) || (p1OuterPort && p2OuterPort)) {
					
					// ***** regular test: HwConnections always need one Initiator and one Responder
					// HwPort
					if ((port1.getPortType() == PortType.INITIATOR && port2.getPortType() == PortType.INITIATOR)
							|| (port1.getPortType() == PortType.RESPONDER && port2.getPortType() == PortType.RESPONDER)) {
						addIssue(results, conn, ePackage.getHwConnection_Port1(),
								"HW Connection " + longName(conn) + ": Port types do not fulfill initiator -> responder");
					}
					
				} else if ((p1InnerPort && p2OuterPort) || (p1OuterPort && p2InnerPort)) {
					
					// ***** delegate test: HwConnections always need one Initiator and one
					// Responder HwPort
					if ((port1.getPortType() == PortType.INITIATOR && port2.getPortType() == PortType.RESPONDER)
							|| (port1.getPortType() == PortType.RESPONDER && port2.getPortType() == PortType.INITIATOR)) {
						addIssue(results, conn, ePackage.getHwConnection_Port1(),
								"HW Connection " + longName(conn) + ": Port types of delegate connection do not match");
					}
				}
			}

		}
	}

}
