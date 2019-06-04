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

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collectors;

import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.JobGroup;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A validator for EMF models. Loads the validations from a list of
 * {@link IProfile} classes
 */
public class ValidationExecutor {

	private final ConcurrentHashMap<EClassifier, CopyOnWriteArraySet<CachedValidator>> validationMap;
	private final List<ValidationDiagnostic> results = new ArrayList<>();

	public ValidationExecutor(final Class<? extends IProfile> profileClass) {
		this(Collections.singletonList(profileClass));
	}

	public ValidationExecutor(final List<Class<? extends IProfile>> profileClassList) {
		if (profileClassList == null) {
			throw new IllegalArgumentException("Loading aborted - Undefined profile class list");
		}

		ValidationAggregator validationAggregator = new ValidationAggregator(profileClassList);
		this.validationMap = validationAggregator.getConcurrentValidationMap();
	}

	/**
	 * @param model		the model to validate
	 * @return the status
	 */
	public IStatus validate(final EObject model) {
		return validate(model, new NullProgressMonitor());
	}

	/**
	 * @param model		the model to validate
	 * @param monitor	the progress monitor
	 * @return the status
	 */
	public IStatus validate(final EObject model, final IProgressMonitor monitor) {
		this.results.clear();

		try {
			int count = getModelObjectCount(model);
			monitor.beginTask("Validating objects", count / 1000 + 1);

			TreeIterator<EObject> iterator = EcoreUtil.getAllContents(model, false);
			validateObject(model); // need to validate the root, because the iterator misses this one

			int i = 0;
			while (iterator.hasNext()) {
				if ((i++ % 1000) == 0) {
					monitor.worked(1);
					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}
				}

				EObject next = iterator.next();
				validateObject(next);
			}
			return Status.OK_STATUS;
		} finally {
			monitor.done();
		}
	}

	public IStatus validateParallel(final EObject model, final IProgressMonitor monitor) {
		
		final JobGroup jobGroup = new JobGroup("Validate model", Runtime.getRuntime().availableProcessors(), 1);
		
		// TODO
		
		TreeIterator<EObject> iterator = EcoreUtil.getAllContents(model, false);
		
		//Streams.stream(iterator).parallel(). ...
		
		//StreamSupport.stream(iterable.spliterator(), false) ...
		
		return null;
		
	}
	
	
	public List<ValidationDiagnostic> getResults() {
		return this.results;
	}

	private int getModelObjectCount(EObject object) {
		int count = 1; // root object
		for (Iterator<?> iter = ((EObject) object).eAllContents(); iter.hasNext(); iter.next()) {
			count++;
		}

		return count;
	}

	private void validateObject(final EObject object) {
		if (object == null) return;
		
		Set<CachedValidator> validations = validationMap.get(object.eClass());
		if (validations == null) return;
		
		for (CachedValidator validator : validations) {
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
		ValidationDiagnostic exception = new ValidationDiagnostic(
				"Validation exception in " + validatorClass + ": " + ex.getMessage(), object);
		exception.setValidationID("AM-Runtime-Exception");
		exception.setSeverityLevel(Severity.ERROR);
		this.results.add(exception);
	}

	public void dumpValidationMap(PrintStream stream) {
		PrintStream out = (stream == null) ? System.out : stream;
		
		List<EClassifier> classifiers = validationMap.keySet().stream()
				.sorted(Comparator.comparing(EClassifier::getName))
				.collect(Collectors.toList());
		
		for (EClassifier cl : classifiers) {
			out.println("Validations for " + cl.getName() + ":");
			for (CachedValidator vConf : validationMap.get(cl)) {
				out.println("    " + vConf.getSeverity() + " - " + vConf.getValidationID());
			}
		}
	}

}
