/**
 * *******************************************************************************
 *  Copyright (c) 2013 itemis AG and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *     itemis AG - initial API and implementation
 *
 * *******************************************************************************
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
