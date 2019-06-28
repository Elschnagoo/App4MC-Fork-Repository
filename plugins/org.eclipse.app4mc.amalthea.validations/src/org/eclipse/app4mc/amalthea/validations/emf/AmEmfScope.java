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

package org.eclipse.app4mc.amalthea.validations.emf;

import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaIndex;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;


/**
 * Checks EMF scope
 * 
 * <ul>
 * <li>ID has to be unique in folder scope</li>
 * <li>ID has to be set for {@link IReferable}</li>
 * </ul>
 */

@Validation(id = "AM-EMF-SCOPE")

public class AmEmfScope extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getAmalthea();
	}

	@Override
	public void validate(final EObject object, final List<ValidationDiagnostic> results) {
		if (object instanceof Amalthea) {
			Amalthea root = (Amalthea) object;
			
			List<Set<IReferable>> conflictingObjects = AmaltheaIndex.getObjectsWithConflictingNames(root);

			for (Set<IReferable> set : conflictingObjects) {
				for (IReferable element : set) {
					addIssue(results, element, ePackage.getINamed_Name(),
							typeInfo(element) + ": duplicate name " + name(element));						
				}
			}
			
			Set<IReferable> unnamedObjects = AmaltheaIndex.getElements(root, "", IReferable.class);
			
			for (IReferable element : unnamedObjects) {
				addIssue(results, element, ePackage.getINamed_Name(),
						typeInfo(element) + ": missing name");						
			}
			
		}
	}

}
