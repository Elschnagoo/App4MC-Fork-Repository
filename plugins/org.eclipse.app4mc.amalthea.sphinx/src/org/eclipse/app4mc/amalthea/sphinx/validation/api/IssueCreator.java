/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.sphinx.validation.api;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public interface IssueCreator {

	/**
	 * Mark an {@link EObject} with an error.
	 *
	 * @param object
	 *            The {@link EObject} which is marked as error
	 * @param feature
	 *            {@link EStructuralFeature}
	 * @param messageArguments
	 *            Additional arguments for the message
	 */
	void issue(EObject object, EStructuralFeature feature, Object... messageArguments);
}