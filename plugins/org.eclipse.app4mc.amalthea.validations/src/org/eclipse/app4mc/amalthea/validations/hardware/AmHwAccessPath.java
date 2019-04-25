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

import java.util.Collections;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.HwAccessPath;
import org.eclipse.app4mc.amalthea.model.HwConnection;
import org.eclipse.app4mc.amalthea.model.HwDestination;
import org.eclipse.app4mc.amalthea.model.HwPathElement;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.MemoryDefinition;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.validations.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;


/**
 * Checks the correctness of HwAccessPath
 * 
 * <ul>
 * <li>HwAccessPath ranges and memory size must be consistent</li>
 * <li>HwAccessPath elements must be consistent</li>
 * </ul>
 */

@Validation(id = "AM-HW-AccessPath")

public class AmHwAccessPath extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwAccessPath();
	}

	@Override
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof HwAccessPath) {
			HwAccessPath path = (HwAccessPath) object;
			
			boolean performRangeCheck = true;
			Memory memory = null;
			MemoryDefinition memoryDef = null;
			
			// ***** HwAccessPath ranges and memory size must be consistent
			
			long addressRange = path.getEndAddress() - path.getStartAddress();
			long requiredSize = path.getMemOffset() + addressRange;
			
			if (addressRange < 0) {
				// AmaltheaPackage.eINSTANCE.getHwAccessPath_EndAddress()
				addIssue(results, path, "HW Access Path " + name(path) + ": Start address > End address");
				performRangeCheck = false; // address range is invalid
			}
			
			if (path.getDestination() instanceof Memory) {
				memory = (Memory) path.getDestination();
				memoryDef = memory.getDefinition();
				if (memoryDef == null) {
					// AmaltheaPackage.eINSTANCE.getHwPath_Destination()
					addIssue(results, path, "HW Access Path " + name(path) + ": Destination (Memory) size is undefined");
					performRangeCheck = false; // memory size is not available
				}
			} else {
				performRangeCheck = false; // destination is not of type Memory
			}
			
			if (performRangeCheck && requiredSize > memoryDef.getSize().getNumberBytes()) {
				// AmaltheaPackage.eINSTANCE.getHwAccessPath_EndAddress()
				addIssue(results, path, "HW Access Path " + name(path) + ": Address range > Memory size");
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
					// AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements()
					addIssue(results, path, "HW Access Path " + name(path) + ": No common port at the beginning of the path");
				}
			} else {
				// AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements()
				addIssue(results, path, "HW Access Path " + name(path) + ": First path element must be a connection");
			}
			
			if (last instanceof HwConnection) {
				if (destination == null) {
					// AmaltheaPackage.eINSTANCE.getHwPath_Destination()
					addIssue(results, path, "HW Access Path " + name(path) + ": Destination is undefined");
				} else {
					// check if destination has a common port with the last path element 
					if (Collections.disjoint(destination.getPorts(), last.getPorts())) {
						// AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements()
						addIssue(results, path, "HW Access Path " + name(path) + ": No common port at the end of the path");
					}
				}
			} else {
				// AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements()
				addIssue(results, path, "HW Access Path " + name(path) + ": Last path element must be a connection");
			}
			
			if (pathElements.size() < 2) return;  // no further checks possible
			
			// iterate over list
			
			for (int i = 0; i < pathElements.size() - 1; i++) {
				HwPathElement item1 = pathElements.get(i);
				HwPathElement item2 = pathElements.get(i + 1);
				
				if (Collections.disjoint(item1.getPorts(), item2.getPorts())) {
					// AmaltheaPackage.eINSTANCE.getHwAccessPath_PathElements()
					addIssue(results, path, "HW Access Path " + name(path) + ": No common port between element[" + i + "] and element[" + (i+1) + "]");
				}
			}

		}
	}

}
