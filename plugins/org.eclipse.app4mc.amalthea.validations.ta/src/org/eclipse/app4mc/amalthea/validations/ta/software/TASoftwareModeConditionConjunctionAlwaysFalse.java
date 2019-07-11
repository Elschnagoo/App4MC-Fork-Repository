/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.amalthea.validations.ta.software;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionConjunction;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.RelationalOperator;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates (only simple) whether a conjunction of mode conditions always yields true.
 * 
 * <ul>
 * <li>checks whether the logical conjunction (AND) of all entries will never be fulfilled</li>
 * </ul>
 */

@Validation(id = "TA-Software-ModeConditionConjunctionAlwaysFalse")
public class TASoftwareModeConditionConjunctionAlwaysFalse extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getModeConditionConjunction();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ModeConditionConjunction) {
			ModeConditionConjunction mcc = (ModeConditionConjunction) eObject;
			List<ModeCondition> andedEMCs = mcc.getEntries().stream().filter(ModeCondition.class::isInstance).map(ModeCondition.class::cast)
					// only consider mode conditions which are for enum modes and have valid literals as values
					.filter(mc -> mc.eIsSet(ePackage.getModeValue_Value()) && mc.eIsSet(ePackage.getModeValue_Label()) && mc.getLabel().isEnum() && mc.getLiteral() != null)
					.distinct().collect(Collectors.toList());
			// convert to map so that the key is the referred label and the value is a list of mode conditions referring to this label
			andedEMCs.stream().collect(Collectors.groupingBy(ModeCondition::getLabel)).forEach((ml, mcs) -> {
				INamed namedContainer = AmaltheaServices.getContainerOfType(mcc, INamed.class);
				// first check special case where at least two different modes are checked upon equality/unequality, then the ANDing of these will always be false
				List<String> allEQLiterals = mcs.stream().filter(mc -> mc.getRelation() == RelationalOperator.EQUAL).map(ModeCondition::getLiteral)
						// remove duplicates and map to string (for warning message)
						.distinct().map(ModeLiteral::getName).collect(Collectors.toList());
				if (allEQLiterals.size() > 1) {
					addIssue(results, mcc, ePackage.getModeConditionConjunction_Entries(), "Conjoining equality of mode literals " + allEQLiterals + " in " + objectInfo(namedContainer) +
							" always evaluates to FALSE, which might not be intended here.");
				}
				List<String> allUnEQLiterals = mcs.stream().filter(mc -> mc.getRelation() == RelationalOperator.NOT_EQUAL).map(ModeCondition::getLiteral)
						// remove duplicates and map to string (for warning message)
						.distinct().map(ModeLiteral::getName).collect(Collectors.toList());
				if (allUnEQLiterals.size() > 1) {
					addIssue(results, mcc, ePackage.getModeConditionConjunction_Entries(), "Conjoining unequality of mode literals " + allUnEQLiterals + " in " + objectInfo(namedContainer) +
							" always evaluates to FALSE, which might not be intended here.");
				}
				// second check if at least two mode conditions referring to the same mode literal occur with EQUAL and NOT_EQUAL relation
				// for this group again by literals
				mcs.stream().collect(Collectors.groupingBy(ModeCondition::getLiteral)).forEach((lit, litMCs) -> {
					List<RelationalOperator> usedRelations = litMCs.stream().map(ModeCondition::getRelation).distinct().collect(Collectors.toList());
					if (usedRelations.contains(RelationalOperator.EQUAL) && usedRelations.contains(RelationalOperator.NOT_EQUAL)) {
						addIssue(results, mcc, ePackage.getModeConditionConjunction_Entries(), "Conjoining mode conditions on the same " + objectInfo(lit) + " with relations " +
								usedRelations + " in " + objectInfo(namedContainer) + " always evaluates to FALSE, which might not be intended here.");
					}
				});
			});
		}
	}

}
