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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.eclipse.app4mc.validation.annotation.ValidationGroup;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A validator for EMF models. Loads a configuration from a class annotated by
 * {@link ValidationGroup}.
 */
public class ValidationExecutor {

	private final ValidationManager validatorManager;
	private final List<ValidationDiagnostic> results = new ArrayList<>();

	public ValidationExecutor(final Class<? extends IProfile> profileClass) {
		this(Collections.singletonList(profileClass));
	}
	
	public ValidationExecutor(final List<Class<? extends IProfile>> profileClassList) {
		if (profileClassList == null) {
			throw new IllegalArgumentException("Loading aborted - Undefined profile class list");
		}

		validatorManager = new ValidationManager(profileClassList);
	}

	/**
	 * @param model   validates the model
	 * @return the list of results
	 */
	public List<ValidationDiagnostic> validate(final EObject model) {
		return validate(model, new NullProgressMonitor());
	}

	/**
	 * @param model   validates the model
	 * @param monitor the progress monitor
	 * @return the list of results
	 */
	public List<ValidationDiagnostic> validate(final EObject model, final IProgressMonitor monitor) {
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(model, false);
		validateObject(model); // need to validate the root, because the iterator misses this one
		int i = 0;
		while (iterator.hasNext()) {
			if (((i++ % 1000) == 0) && monitor.isCanceled()) {
				return this.results;
			}

			EObject next = iterator.next();
			validateObject(next);
		}

		return this.results;
	}

	private void validateObject(final EObject object) {
		
		Set<ValidatorConfig> validations = validatorManager.getValidations(object.eClass());
		for (ValidatorConfig validator : validations) {
			List<ValidationDiagnostic> resultList = new ArrayList<>();
			try {
				validator.getValidatorInstance().validate(object, resultList);
			} catch (Exception ex) {
				addExceptionResult(object, validator.getValidatorClass(), ex);
				continue;
			}
			
			// set message id and severity
			for (ValidationDiagnostic result : resultList) {
				result.setValidationID(validator.getValidationID());
				if (validator.getSeverity() != Severity.UNDEFINED) {
					result.setSeverityLevel(validator.getSeverity());					
				}
				this.results.add(result);
			}
		}
	
	}

	private void addExceptionResult(final EObject object, Class<? extends IValidation> validatorClass, Exception ex) {
		ValidationDiagnostic exception = new ValidationDiagnostic("Validation exception in " + validatorClass + ": " + ex.getMessage(), object);
		exception.setValidationID("AM-Runtime-Exception");
		exception.setSeverityLevel(Severity.ERROR);
		this.results.add(exception);
	}

}
