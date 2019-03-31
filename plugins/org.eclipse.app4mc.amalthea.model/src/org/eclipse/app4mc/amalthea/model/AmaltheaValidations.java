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

import com.google.common.base.Strings;

/**
 * This class provides static methods that implement validations (invariants) of the Amalthea EMF model.
 * <p>
 * The methods are called from several generated model objects.
 */

public class AmaltheaValidations {

	private static final String DIAGNOSTIC_SOURCE = "org.eclipse.app4mc.amalthea.model";
	private static int NO_INDEX = -1;
	
	public static boolean validateInvariants(MinAvgMaxStatistic obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = obj.getMin() <= obj.getAvg() && obj.getAvg() <= obj.getMax();
		if (!isValid) {
			addError(obj, "MinAvgMaxStatistic: constraint min <= avg <= max violated", diagnostics);
		}
		return isValid;
	}

	public static boolean validateInvariants(IReferable obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean isValid = !Strings.isNullOrEmpty(obj.getName());
		if (!isValid) {
			addError(obj, obj.eClass().getName() + ": missing name", diagnostics);
		}
		return isValid;
	}

	public static boolean validateInvariants(ModeLabel obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return checkModeAndValue(obj, obj.getMode(), obj.getInitialValue(), diagnostics);
	}

	public static boolean validateInvariants(ModeValue obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ModeLabel modeLabel = obj.getLabel();
		if (modeLabel == null) {
			addError(obj, obj.eClass().getName() + ": missing mode label", diagnostics);
			return false;
		}
		
		return checkModeAndValue(obj, modeLabel.getMode(), obj.getValue(), diagnostics);
	}

	public static boolean validateInvariants(ModeLabelAccess obj, DiagnosticChain diagnostics, Map<Object, Object> context) {
		ModeLabel modeLabel = obj.getData();
		if (modeLabel == null) {
			addError(obj, obj.eClass().getName() + ": missing mode label", diagnostics);
			return false;
		}

		if (obj.getAccess() == ModeLabelAccessEnum.SET) {
			return checkModeAndValue(obj, modeLabel.getMode(), obj.getValue(), diagnostics);			
		}
		
		return true;
	}
	
	private static boolean checkModeAndValue(EObject obj, Mode mode, String value, DiagnosticChain diagnostics) {
		if (mode == null) {
			addWarning(obj, obj.eClass().getName() + ": unknown value type (mode)", diagnostics);
			return false;
		}
		
		if (value == null) {
			addError(obj, obj.eClass().getName() + ": missing value", diagnostics);
			return false;
		}
		
		String trimmedValue = value.trim();
		if (mode instanceof EnumMode) {
			if (((EnumMode) mode).getLiteral(trimmedValue) == null) {
				addError(obj, obj.eClass().getName() + " (EnumMode): value does not match a literal name", diagnostics);
				return false;
			}
		}

		if (mode instanceof NumericMode) {
			if (trimmedValue.matches("-?\\d+") == false) {
				addError(obj, obj.eClass().getName() + " (NumericMode): value is not an integer", diagnostics);
				return false;
			}
		}
		
		return true;
	}


	// private helper methods
	
	private static void addInfo(EObject object, String message, DiagnosticChain diagnostics) {
    	if (diagnostics != null) {
        	diagnostics.add(createIssue(Diagnostic.INFO, NO_INDEX, object, message));
    	}
	}

	private static void addWarning(EObject object, String message, DiagnosticChain diagnostics) {
    	if (diagnostics != null) {
        	diagnostics.add(createIssue(Diagnostic.WARNING, NO_INDEX, object, message));
    	}
	}

	private static void addError(EObject object, String message, DiagnosticChain diagnostics) {
    	if (diagnostics != null) {
        	diagnostics.add(createIssue(Diagnostic.ERROR, NO_INDEX, object, message));
    	}
	}

	private static BasicDiagnostic createIssue(int severity, int code, EObject object, String message) {
		return new BasicDiagnostic(
				severity,
				DIAGNOSTIC_SOURCE,
				code,
		 		message,
		 		new Object [] { object });
	}

}
