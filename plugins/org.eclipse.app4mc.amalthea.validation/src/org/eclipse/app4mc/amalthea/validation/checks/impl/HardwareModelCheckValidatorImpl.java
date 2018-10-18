/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.HwPort;
import org.eclipse.app4mc.amalthea.model.HwStructure;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.PortInterface;
import org.eclipse.app4mc.amalthea.model.PortType;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class HardwareModelCheckValidatorImpl extends AbstractValidatorImpl {

	public HardwareModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}

	public HardwareModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}


	/**
	 * Checks structures of the hardware model
	 * <ul>
	 * <li>Connections must only refer to contained HwPorts</li>
	 * <li>Inner connections always need one Initiator and one Responder HwPort</li>
	 * <li>Delegated connections always connect HwPorts of the same type</li>
	 * </ul>
	 */
	public void checkSystemStructure(final HwStructure structure) {
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
			if (port1 == null || port2 == null || port1 == port2) break;
			
			
			EObject container1 = port1.eContainer();
			if (subModules.contains(container1) || subStructures.contains(container1)) {
				p1InnerPort = true;
			} else if (container1 == structure) {
				p1OuterPort = true;
			} else {
				this.issueCreator.issue(conn, AmaltheaPackage.eINSTANCE.getHwConnection_Port1(),
						"HW Connection", conn.getName(), "Port 1 is not contained in structure");
			}
			
			EObject container2 = port2.eContainer();
			if (subModules.contains(container2) || subStructures.contains(container2)) {
				p2InnerPort = true;
			} else if (container2 == structure) {
				p2OuterPort = true;
			} else {
				this.issueCreator.issue(conn, AmaltheaPackage.eINSTANCE.getHwConnection_Port2(),
						"HW Connection", conn.getName(), "Port 2 is not contained in structure");
			}
			
			if ((p1InnerPort && p2InnerPort) || (p1OuterPort && p2OuterPort)) {

				// ***** regular test: HwConnections always need one Initiator and one Responder HwPort
				if ((port1.getPortType() == PortType.INITIATOR && port2.getPortType() == PortType.INITIATOR)
						|| (port1.getPortType() == PortType.RESPONDER && port2.getPortType() == PortType.RESPONDER)) {
					this.issueCreator.issue(conn, AmaltheaPackage.eINSTANCE.getHwConnection_Port1(),
							"HW Connection", conn.getName(), "Port types do not fulfill initiator -> responder");
				}
				
			} else if ((p1InnerPort && p2OuterPort) || (p1OuterPort && p2InnerPort)) {
				
				// ***** delegate test: HwConnections always need one Initiator and one Responder HwPort
				if ((port1.getPortType() == PortType.INITIATOR && port2.getPortType() == PortType.RESPONDER)
						|| (port1.getPortType() == PortType.RESPONDER && port2.getPortType() == PortType.INITIATOR)) {
					this.issueCreator.issue(conn, AmaltheaPackage.eINSTANCE.getHwConnection_Port1(),
							"HW Connection", conn.getName(), "Port types of delegate connection do not match");
				}
			}
		}
	}

	/**
	 * Checks the correctness of HwConnection definitions
	 * 
	 * <ul>
	 * <li>HwConnections must refer to two HwPorts</li>
	 * <li>HwConnections must be linked to HwPorts of the same Interface</li>
	 * </ul>
	 */
	public void checkHwConnection(final HwConnection connection) {
		boolean continueChecks = true;
		HwPort port1 = connection.getPort1();
		HwPort port2 = connection.getPort2();

		// ***** HwConnections must refer to two HwPorts

		if (port1 == null) {
			this.issueCreator.issue(connection, AmaltheaPackage.eINSTANCE.getHwConnection_Port1(),
					connection.getName(), "Port 1 is missing");
			continueChecks = false;
		}

		if (port2 == null) {
			this.issueCreator.issue(connection, AmaltheaPackage.eINSTANCE.getHwConnection_Port2(),
					connection.getName(), "Port 2 is missing");
			continueChecks = false;
		}

		if (port1 != null && port1 == port2) {
			this.issueCreator.issue(connection, AmaltheaPackage.eINSTANCE.getHwConnection_Port1(),
					connection.getName(), "Port 1 equals port 2");
			continueChecks = false;
		}

		if (!continueChecks) return;  // fundamental error -> no further checks

		
		// ***** HwConnections must be linked to HwPorts of the same Interface

		if (!connection.isInternal() // internal connection -> no error
			&& port1.getPortInterface() != PortInterface._UNDEFINED_ // undefined -> no error
			&& port2.getPortInterface() != PortInterface._UNDEFINED_
			&& port1.getPortInterface() != port2.getPortInterface()) {
			this.issueCreator.issue(connection, AmaltheaPackage.eINSTANCE.getHwConnection_Port1(),
					connection.getName(), "Port interfaces do not match");
		}
	}

	/**
	 * Checks the correctness of HwPort definitions
	 * 
	 * <ul>
	 * <li>A HwPort can only have one (non internal) HwConnection</li>
	 * </ul>
	 */
	public void checkHwPort(final HwPort port) {

		// ***** A HwPort can only have one (non internal) HwConnection

		if (port.isDelegated()) return; // ignore HwStructure ports
		
		EList<HwConnection> connections = port.getConnections();
		if (connections.size() > 1) {
			int counter = 0;
			for (HwConnection con : connections) {
				if (!con.isInternal()) counter++; // ignore internal connections of connection handlers
			}
			if (counter > 1) {
				this.issueCreator.issue(port, AmaltheaPackage.eINSTANCE.getHwPort_Connections(),
						port.getName(), "Port has " + counter + " connections, only 1 is allowed");
			}
		}
	}

	/**
	 * Checks the correctness of HwAccessPath definitions
	 * 
	 * <ul>
	 * <li>HwAccessPath ranges and memory size must be consistent</li>
	 * <li>HwAccessPath elements must be consistent</li>
	 * </ul>
	 */
	public void checkAccessPath(final HwAccessPath path) {
		boolean performRangeCheck = true;
		Memory memory = null;
		MemoryDefinition memoryDef = null;

		// ***** HwAccessPath ranges and memory size must be consistent

		long addressRange = path.getEndAddress() - path.getStartAddress();
		long requiredSize = path.getMemOffset() + addressRange;

		if (addressRange <= 0) {
			this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_EndAddress(),
					path.getName(), "Start address >= End address");
			performRangeCheck = false; // address range is invalid
		}

		if (path.getDestination() instanceof Memory) {
			memory = (Memory) path.getDestination();
			memoryDef = memory.getDefinition();
			if (memoryDef == null) {
				this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwPath_Destination(),
						path.getName(), "Destination (Memory) size is undefined");
				performRangeCheck = false; // memory size is not available
			}
		} else {
			performRangeCheck = false; // destination is not of type Memory
		}
		
		if (performRangeCheck && requiredSize > memoryDef.getSize().getNumberBytes()) {
			this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_EndAddress(),
					path.getName(), "Address range > Memory size");
		}
		
		// ***** HwAccessPath elements must be consistent

		EList<HwPathElement> pathElements = path.getPathElements();
		
		if (pathElements.isEmpty()) return; // no further checks possible
		
		ProcessingUnit source = path.getSource();
		HwDestination destination = path.getDestination();
		HwPathElement first = pathElements.get(0);
		HwPathElement last = pathElements.get(pathElements.size() - 1);
		
		if (first instanceof HwConnection) {
			// check if source has a common port with the first path element 
			if (Collections.disjoint(source.getPorts(), first.getPorts())) {
				this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements(),
						path.getName(), "No common port at the beginning of the path");
			}
		} else {
			this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements(),
					path.getName(), "First path element must be a connection");
		}
		
		if (last instanceof HwConnection) {
			if (destination == null) {
				this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwPath_Destination(),
						path.getName(), "Destination is undefined");
			} else {
				// check if destination has a common port with the last path element 
				if (Collections.disjoint(destination.getPorts(), last.getPorts())) {
					this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements(),
							path.getName(), "No common port at the end of the path");
				}
			}
		} else {
			this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements(),
					path.getName(), "Last path element must be a connection");
		}
		
		if (pathElements.size() < 2) return;  // no further checks possible
		
		// iterate over list
		
		for (int i = 0; i < pathElements.size() - 1; i++) {
			HwPathElement item1 = pathElements.get(i);
			HwPathElement item2 = pathElements.get(i + 1);
			
			if (Collections.disjoint(item1.getPorts(), item2.getPorts())) {
				this.issueCreator.issue(path, AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements(),
						path.getName(), "No common port between element[" + i + "] and element[" + (i+1) + "]");
			}
		}
	}

	/**
	 * Checks the correctness of HwPort enumerations
	 * 
	 * <ul>
	 * <li>PortType must be set</li>
	 * <li>PortInterface must be set</li>
	 * </ul>
	 */
	public void checkPortForUndefined(HwPort port) {
		
		// ***** PortType must be set
		
		if (port.getPortType() == PortType._UNDEFINED_) {
			this.issueCreator.issue(port, AmaltheaPackage.eINSTANCE.getHwPort_PortType(),
					"Port \"" + port.getName() + "\" - undefined port type");
		}

		// ***** PortInterface must be set

		if (port.getPortInterface() == PortInterface._UNDEFINED_) {
			this.issueCreator.issue(port, AmaltheaPackage.eINSTANCE.getHwPort_PortInterface(),
					"Port \"" + port.getName() + "\" - undefined port interface");
		}
	}

	/**
	 * Checks the correctness of HwModule definitions
	 * 
	 * <ul>
	 * <li>Memory definition must be set</li>
	 * <li>ProcessingUnit definition must be set</li>
	 * <li>ConnectionHandler definition must be set</li>
	 * <li>Cache definition must be set</li>
	 * </ul>
	 */
	public void checkModuleForMissingDefinition(HwModule module) {

		// ***** Memory definition must be set
		
		if (module instanceof Memory) {
			if (((Memory) module).getDefinition() == null) {
				this.issueCreator.issue(module, AmaltheaPackage.eINSTANCE.getMemory_Definition(),
						"Memory \"" + module.getName() + "\" - missing definition");
			}	
		}
		
		// ***** ProcessingUnit definition must be set
		
		if (module instanceof ProcessingUnit) {
			if (((ProcessingUnit) module).getDefinition() == null) {
				this.issueCreator.issue(module, AmaltheaPackage.eINSTANCE.getProcessingUnit_Definition(),
						"ProcessingUnit \"" + module.getName() + "\" - missing definition");
			}	
		}
		
		// ***** ConnectionHandler definition must be set
		
		if (module instanceof ConnectionHandler) {
			if (((ConnectionHandler) module).getDefinition() == null) {
				this.issueCreator.issue(module, AmaltheaPackage.eINSTANCE.getConnectionHandler_Definition(),
						"ConnectionHandler \"" + module.getName() + "\" - missing definition");
			}	
		}
		
		// ***** Cache definition must be set
		
		if (module instanceof Cache) {
			if (((Cache) module).getDefinition() == null) {
				this.issueCreator.issue(module, AmaltheaPackage.eINSTANCE.getCache_Definition(),
						"Cache \"" + module.getName() + "\" - missing definition");
			}	
		}
	}

	/**
	 * Checks the correctness of HwDefinitions
	 * 
	 * <ul>
	 * <li>Only one feature of a category can be referred</li>
	 * </ul>
	 */
	public void checkDefinitions(HwDefinition definition) {
		// currently only ProcessingUnitDefinitions have references to HwFeatures
		if (definition instanceof ProcessingUnitDefinition) {
			ProcessingUnitDefinition puDef = (ProcessingUnitDefinition) definition;
			// Map of category -> first feature of category
			final Map<HwFeatureCategory, HwFeature> visitedCategories = new HashMap<HwFeatureCategory, HwFeature>();
			for (final HwFeature feature : puDef.getFeatures()) {
				final HwFeatureCategory category = feature.getContainingCategory();
				
				if (visitedCategories.containsKey(category)) {
					final HwFeature firstFeature = visitedCategories.put(category, null);
					if (firstFeature != null) {
						// report error for first occurrence
						this.issueCreator.issue(definition, AmaltheaPackage.eINSTANCE.getHWModel_Definitions(),
								definition.getName(), "Reference to multiple features of one category - " + category.getName() + "::" + firstFeature.getName());
					}
					// report error for current occurrence
					this.issueCreator.issue(definition, AmaltheaPackage.eINSTANCE.getHWModel_Definitions(),
							definition.getName(), "Reference to multiple features of one category - " + category.getName() + "::" + feature.getName());
				} else {
					// first occurrence
					visitedCategories.put(category, feature);
				}
			}
		}
	}

}

