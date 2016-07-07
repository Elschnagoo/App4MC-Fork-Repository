/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory.Descriptor;

/**
 * 
 *
 */
public class Util {

	/**
	 * @param target
	 *            The target object to look for the corresponding adapter.
	 * @param type
	 *            The type of the adapter to return.
	 * @return TargetAdapter if found, null otherwise.
	 */
	public static Object getAdapterFactoryForType(final EObject target, final Class<?> type) {
		final Descriptor descriptor = ComposedAdapterFactory.Descriptor.Registry.INSTANCE.getDescriptor(Arrays
				.asList(new Object[] { target.eClass().getEPackage().getNsURI(), type.getName() }));
		return descriptor.createAdapterFactory().adapt(target, type);
	}


}
