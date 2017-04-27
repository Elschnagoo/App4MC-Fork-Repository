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
