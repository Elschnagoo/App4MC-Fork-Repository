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

package org.eclipse.app4mc.validation.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 *  Simple diagnostic without children and exception
 */
public class ValidationDiagnostic implements Diagnostic {

	private static final String SOURCE = "org.eclipse.app4mc.validation";
	private static final int NO_INDEX = -1;
	
	private Severity severity = Severity.UNDEFINED;
	private String validationID;
	
	private final String message;
	private final EObject targetObject;
	private final EStructuralFeature targetFeature;

	/**
	 * @param message the message
	 * @param object  the problematic object
	 */
	public ValidationDiagnostic(final String message, final EObject object) {
		this(message, object, null);
	}

	/**
	 * @param message the message text
	 * @param object  the problematic object
	 * @param feature the problematic feature
	 */
	public ValidationDiagnostic(final String message, final EObject object, final EStructuralFeature feature) {
		if (object != null && feature != null) {
			if (object.eClass().getEStructuralFeature(feature.getName()) != feature) {
				throw new IllegalArgumentException(
						"The object of class " + object.eClass().getName() + " does not contain feature "
								+ feature.getEContainingClass().getName() + "#" + feature.getName());
			}
		}

		this.message = message;
		this.targetObject = object;
		this.targetFeature = feature;
	}


	public EObject getTargetObject() {
		return this.targetObject;
	}

	public EStructuralFeature getTargetFeature() {
		return targetFeature;
	}

	public String getValidationID() {
		return this.validationID;
	}

	public void setValidationID(String validationID) {
		this.validationID = validationID;
	}

	public Severity getSeverityLevel() {
		return this.severity;
	}

	public void setSeverityLevel(final Severity severity) {
		this.severity = severity;
	}

	@Override
	public String toString() {
		return this.validationID + ": " + this.message + " (" + this.targetObject + ")";
	}

	@Override
	public int getSeverity() {
		switch (this.severity) {
		case INFO:
			return INFO;
		case WARNING:
			return WARNING;
		case ERROR:
			return ERROR;
		default:
			return 0;
		}
	}

	@Override
	public String getMessage() {
		return this.message;
	}

	@Override
	public List<?> getData() {
		return Arrays.asList(targetObject, targetFeature);
	}

	@Override
	public String getSource() {
		return SOURCE;
	}

	@Override
	public List<Diagnostic> getChildren() {
		return Collections.emptyList();
	}

	@Override
	public int getCode() {
		return NO_INDEX;
	}

	@Override
	public Throwable getException() {
		return null;
	}
}
