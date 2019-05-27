/* Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Strings;

/**
 * This class provides static methods that implement validations (invariants) of the Amalthea EMF model.
 * <p>
 * The methods are called from several generated model objects.
 */

public class AmaltheaValidations {

	private static final String DIAGNOSTIC_SOURCE = "org.eclipse.app4mc.amalthea.model";
	private static final int NO_INDEX = -1;
	
	private static final AmaltheaPackage PACKAGE = AmaltheaPackage.eINSTANCE;
	
	public static boolean validateInvariants(MinAvgMaxStatistic obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = obj.getMin() <= obj.getAvg() && obj.getAvg() <= obj.getMax();
		if (!isValid) {
			addError(obj, PACKAGE.getMinAvgMaxStatistic_Avg(), "MinAvgMaxStatistic: constraint min <= avg <= max violated", diagnostics);
		}
		return isValid;
	}

	public static boolean validateInvariants(IReferable obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = !Strings.isNullOrEmpty(obj.getName());
		if (!isValid) {
			addError(obj, PACKAGE.getINamed_Name(), obj.eClass().getName() + ": missing name", diagnostics);
		}
		return isValid;
	}

	public static boolean validateInvariants(ModeLabel obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return checkModeAndValue(obj, PACKAGE.getModeLabel_InitialValue(), obj.getMode(), obj.getInitialValue(), diagnostics);
	}

	public static boolean validateInvariants(ModeValue obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ModeLabel modeLabel = obj.getLabel();
		if (modeLabel == null) {
			addError(obj, PACKAGE.getModeValue_Label(), obj.eClass().getName() + ": missing mode label", diagnostics);
			return false;
		}
		
		return checkModeAndValue(obj, PACKAGE.getModeValue_Value(), modeLabel.getMode(), obj.getValue(), diagnostics);
	}

	public static boolean validateInvariants(ModeLabelAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ModeLabel modeLabel = obj.getData();
		if (modeLabel == null) {
			addError(obj, PACKAGE.getModeLabelAccess_Data(), obj.eClass().getName() + ": missing mode label", diagnostics);
			return false;
		}

		if (obj.getAccess() == ModeLabelAccessEnum.SET) {
			return checkModeAndValue(obj, PACKAGE.getModeLabelAccess_Value(), modeLabel.getMode(), obj.getValue(), diagnostics);			
		}
		
		return true;
	}
	
	private static boolean checkModeAndValue(EObject obj, EStructuralFeature feature, Mode mode, String value, DiagnosticChain diagnostics) {
		if (mode == null) {
			addWarning(obj, feature, obj.eClass().getName() + ": unknown value type (mode)", diagnostics);
			return false;
		}
		
		if (value == null) {
			addError(obj, feature, obj.eClass().getName() + ": missing value", diagnostics);
			return false;
		}
		
		String trimmedValue = value.trim();
		if (mode instanceof EnumMode) {
			if (((EnumMode) mode).getLiteral(trimmedValue) == null) {
				addError(obj, feature, obj.eClass().getName() + " (EnumMode): value does not match a literal name", diagnostics);
				return false;
			}
		}

		if (mode instanceof NumericMode) {
			if (trimmedValue.matches("-?\\d+") == false) {
				addError(obj, feature, obj.eClass().getName() + " (NumericMode): value is not an integer", diagnostics);
				return false;
			}
		}
		
		return true;
	}


	// private helper methods
	
	private static void addInfo(EObject object, EStructuralFeature feature, String message, DiagnosticChain diagnostics) {
    	if (diagnostics != null) {
        	diagnostics.add(createIssue(Diagnostic.INFO, object, feature, message));
    	}
	}

	private static void addWarning(EObject object, EStructuralFeature feature, String message, DiagnosticChain diagnostics) {
    	if (diagnostics != null) {
        	diagnostics.add(createIssue(Diagnostic.WARNING, object, feature, message));
    	}
	}

	private static void addError(EObject object, EStructuralFeature feature, String message, DiagnosticChain diagnostics) {
    	if (diagnostics != null) {
        	diagnostics.add(createIssue(Diagnostic.ERROR, object, feature, message));
    	}
	}

	private static BasicDiagnostic createIssue(int severity, EObject object, EStructuralFeature feature, String message) {
		return new BasicDiagnostic(
				severity,
				DIAGNOSTIC_SOURCE,
				NO_INDEX,
		 		message,
		 		new Object [] { object, feature });
	}

}
