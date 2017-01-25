/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended;

import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.provider.ProcessPrototypeItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSWModelItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedProcessPrototypeItemProvider extends ProcessPrototypeItemProvider {

	public ExtendedProcessPrototypeItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object swModel = super.getParent(object);
		final ExtendedSWModelItemProvider swModelItemProvider = (ExtendedSWModelItemProvider) this.adapterFactory
				.adapt(swModel, ITreeItemContentProvider.class);
		return swModelItemProvider != null ? swModelItemProvider.getPrototypes((SWModel) swModel) : null;
	}

}
