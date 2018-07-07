/**
 ********************************************************************************
 * Copyright (c) 2015-2018 itemis AG and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 *  Contributors:
 *     itemis AG - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.editor;

import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedAmaltheaItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

public class ExtendedItemProviderAdapterFactory extends ComposedAdapterFactory {

	/**
	 * Singleton instance.
	 */
	public static final ExtendedItemProviderAdapterFactory INSTANCE = new ExtendedItemProviderAdapterFactory();

	public ExtendedItemProviderAdapterFactory() {
		super(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		addAdapterFactory(new ExtendedAmaltheaItemProviderAdapterFactory());
		// to be extended
		// e.g. addAdapterFactory(new ExtendedHwItemProviderAdapterFactory());
	}

}
