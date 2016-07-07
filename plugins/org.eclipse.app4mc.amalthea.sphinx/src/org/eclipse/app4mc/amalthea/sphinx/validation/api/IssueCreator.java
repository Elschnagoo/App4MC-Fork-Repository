/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
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