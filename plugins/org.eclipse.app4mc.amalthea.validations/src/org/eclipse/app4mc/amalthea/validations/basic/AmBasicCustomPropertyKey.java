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

package org.eclipse.app4mc.amalthea.validations.basic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.model.IAnnotatable;
import org.eclipse.app4mc.amalthea.model.Value;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;


/**
 * Checks the correctness of objects with custom properties
 * 
 * <ul>
 * <li>Custom property keys have to be unique</li>
 * </ul>
 */

@Validation(id = "AM-Basic-CustomProperty-Key")

public class AmBasicCustomPropertyKey extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getIAnnotatable();
	}

	@Override
	public void validate(final EObject object, final List<ValidationDiagnostic> results) {
		if (object instanceof IAnnotatable) {
			IAnnotatable anno = (IAnnotatable) object;
			
			// Map of key -> isFirst
			final Map<String, Boolean> visitedKeys = new HashMap<String, Boolean>();

			for (final Entry<String, Value> entry : anno.getCustomProperties().entrySet()) {
				final String key = entry.getKey();
				if (visitedKeys.containsKey(key)) {
					if (visitedKeys.get(key)) {
						// second entry: report duplicate
						
						// AmaltheaPackage.eINSTANCE.getCustomProperty_Key()
						addIssue(results, anno, ePackage.getIAnnotatable_CustomProperties(),
								"CustomProperty: duplicate key \"" + key + "\" ( in " + objectInfo(anno) + " )");
						
						// mark key as duplicate that already has been reported
						visitedKeys.put(key, false);
					}
				} else {
					// first entry
					visitedKeys.put(key, true);
				}
			}

		}
	}

}
