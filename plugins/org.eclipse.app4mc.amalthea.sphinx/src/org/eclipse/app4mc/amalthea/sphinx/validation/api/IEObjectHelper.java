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

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface IEObjectHelper {
	<T> List<T> getAllInstancesOf(final EObject context, final Class<T> type);

	<T> List<T> getAllInstancesAndInheritedOf(final EObject contextObject, final Class<T> type);

	Object getName(final EObject element);
	
	Object getClassName(final EObject element);

	Object getAttributeValueOf(final EObject item, final String attribName);

	void printAllAttributesOf(final EObject item, final boolean... verbose);

}
