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

package org.eclipse.app4mc.validation.util;

import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.emf.ecore.EClassifier;

/**
 * A cache object for a validator
 */
public class CachedValidator {

	private final Class<? extends IValidation> validatorClass;
	private final String validationID;
	private final IValidation validatorInstance;
	private final EClassifier targetEClassifier;
	private Severity severity;

	public CachedValidator(final Class<? extends IValidation> validatorClass, final Severity severity) {
		super();

		if (validatorClass == null) {
			throw new IllegalArgumentException("Loading aborted - Undefined validator class (null)");
		}
		if (severity == null) {
			throw new IllegalArgumentException("Loading aborted - Undefined validator severity (null)");
		}

		this.validatorClass = validatorClass;
		this.severity = severity;

		Validation validationInfo = validatorClass.getAnnotation(Validation.class);

		this.validationID = (validationInfo != null) ? validationInfo.id() : validatorClass.getSimpleName();

		try {
			this.validatorInstance = validatorClass.getDeclaredConstructor().newInstance();
		} catch (ReflectiveOperationException | IllegalArgumentException | SecurityException e) {
			// can't recover from this - programming error.
			throw new IllegalStateException(e);
		}

		this.targetEClassifier = this.validatorInstance.getEClassifier();
		if (this.targetEClassifier == null) {
			throw new IllegalArgumentException(
					"Loading aborted - Validation doesn't define a target: " + validatorClass);
		}
	}

	// *** public getters ***

	public Class<? extends IValidation> getValidatorClass() {
		return validatorClass;
	}

	public IValidation getValidatorInstance() {
		return validatorInstance;
	}

	public EClassifier getTargetEClassifier() {
		return targetEClassifier;
	}

	public Class<?> getTargetClass() {
		return targetEClassifier.getInstanceClass();
	}

	public String getValidationID() {
		return validationID;
	}

	// *** public getters and setters (only severity can be changed) ***

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		if (severity == null) return;

		this.severity = severity;
	}

}