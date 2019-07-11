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

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.ModeCondition;
import org.eclipse.app4mc.amalthea.model.ModeConditionDisjunction;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.RelationalOperator;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * Validates (only simple) whether a disjunction of mode conditions always yields true.
 * 
 * <ul>
 * <li>checks whether the logical disjunction (OR) of all entries of type ModeCondition will be fulfilled</li>
 * </ul>
 */

@Validation(id = "TA-Software-ModeConditionDisjunctionAlwaysTrue")
public class TASoftwareModeConditionDisjunctionAlwaysTrue extends AmaltheaValidation {

	@Override
	public EClassifier getEClassifier() {
		return ePackage.getModeConditionDisjunction();
	}

	@Override
	public void validate(EObject eObject, List<ValidationDiagnostic> results) {
		if (eObject instanceof ModeConditionDisjunction) {
			ModeConditionDisjunction mcd = (ModeConditionDisjunction) eObject;
			List<ModeCondition> oredEMCs = mcd.getEntries().stream().filter(ModeCondition.class::isInstance).map(ModeCondition.class::cast)
					// only consider mode conditions which are for enum modes and have valid literals as values
					.filter(mc -> mc.eIsSet(ePackage.getModeValue_Value()) && mc.eIsSet(ePackage.getModeValue_Label()) && mc.getLabel().isEnum() && mc.getLiteral() != null)
					.distinct().collect(Collectors.toList());
			// convert to map so that the key is the referred label and the value is a list of mode conditions referring to this label
			oredEMCs.stream().collect(Collectors.groupingBy(ModeCondition::getLabel)).forEach((ml, mcs) -> {
				// first check special case where all different modes are checked upon equality, then the ORing of these will always be true
				Set<ModeLiteral> allLiterals = new HashSet<>(((EnumMode)ml.getMode()).getLiterals());
				Set<ModeLiteral> allEQLiterals = mcs.stream().filter(mc -> mc.getRelation() == RelationalOperator.EQUAL).map(ModeCondition::getLiteral).collect(Collectors.toSet());
				INamed namedContainer = AmaltheaServices.getContainerOfType(mcd, INamed.class);
				if (allLiterals.equals(allEQLiterals)) {
					addIssue(results, mcd, ePackage.getModeConditionDisjunction_Entries(), "Disjoining all possible mode literals in " + objectInfo(namedContainer) +
							" always evaluates to TRUE, which might not be intended here.");
				}
				// second check if at least two mode conditions referring to the same mode literal occurs with EQUAL and NOT_EQUAL relation
				// for this group again by literals
				mcs.stream().collect(Collectors.groupingBy(ModeCondition::getLiteral)).forEach((lit, litMCs) -> {
					List<RelationalOperator> usedRelations = litMCs.stream().map(ModeCondition::getRelation).distinct().collect(Collectors.toList());
					if (usedRelations.contains(RelationalOperator.EQUAL) && usedRelations.contains(RelationalOperator.NOT_EQUAL)) {
						addIssue(results, mcd, ePackage.getModeConditionDisjunction_Entries(), "Disjoining mode conditions on the same " + objectInfo(lit) + " with relations " +
								usedRelations + " in " + objectInfo(namedContainer) + " always evaluates to TRUE, which might not be intended here.");
					}
				});
			});
		}
	}

}
