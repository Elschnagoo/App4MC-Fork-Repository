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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.model.HwDefinition;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Result;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Checks the correctness of HwDefinition
 * 
 * <ul>
 * <li>Only one feature of a category can be referred</li>
 * </ul>
 */

@Validation(id = "AM-HW-Definition")

public class AmHwDefinition extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getHwDefinition();
	}

	@Override
	public void validate(final EObject object, List<Result> results) {
		if (object instanceof HwDefinition) {
			HwDefinition definition = (HwDefinition) object;
			
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
							// AmaltheaPackage.eINSTANCE.getHWModel_Definitions()
							addIssue(results, definition, "HW Definition " + name(definition)
							+ ": Reference to multiple features of one category - " + category.getName() + "::" + firstFeature.getName());
						}
						// report error for current occurrence
						// AmaltheaPackage.eINSTANCE.getHWModel_Definitions()
						addIssue(results, definition, "HW Definition " + name(definition)
						+ ": Reference to multiple features of one category - " + category.getName() + "::" + feature.getName());
					} else {
						// first occurrence
						visitedCategories.put(category, feature);
					}
				}
			}

		}
	}

}
