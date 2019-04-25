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

import org.eclipse.app4mc.amalthea.model.Cache;
import org.eclipse.app4mc.amalthea.model.ConnectionHandler;
import org.eclipse.app4mc.amalthea.model.HwModule;
import org.eclipse.app4mc.amalthea.model.Memory;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.validations.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

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

@Validation(id = "AM-HW-Module-Definition")

public class AmHwModuleDefinition extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwModule();
	}

	@Override
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof HwModule) {
			HwModule module = (HwModule) object;
			
			// ***** Memory definition must be set
			
			if (module instanceof Memory) {
				if (((Memory) module).getDefinition() == null) {
					// AmaltheaPackage.eINSTANCE.getMemory_Definition()
					addIssue(results, module, "HW Module (Memory) " + name(module) + ": missing definition");
				}
			}
			
			// ***** ProcessingUnit definition must be set
			
			if (module instanceof ProcessingUnit) {
				if (((ProcessingUnit) module).getDefinition() == null) {
					// AmaltheaPackage.eINSTANCE.getProcessingUnit_Definition()
					addIssue(results, module, "HW Module (ProcessingUnit) " + name(module) + ": missing definition");
				}
			}
			
			// ***** ConnectionHandler definition must be set
			
			if (module instanceof ConnectionHandler) {
				if (((ConnectionHandler) module).getDefinition() == null) {
					// AmaltheaPackage.eINSTANCE.getConnectionHandler_Definition()
					addIssue(results, module, "HW Module (ConnectionHandler) " + name(module) + ": missing definition");
				}
			}
			
			// ***** Cache definition must be set
			
			if (module instanceof Cache) {
				if (((Cache) module).getDefinition() == null) {
					// AmaltheaPackage.eINSTANCE.getCache_Definition()
					addIssue(results, module, "HW Module (Cache) " + name(module) + ": missing definition");
				}
			}

		}
	}

}
