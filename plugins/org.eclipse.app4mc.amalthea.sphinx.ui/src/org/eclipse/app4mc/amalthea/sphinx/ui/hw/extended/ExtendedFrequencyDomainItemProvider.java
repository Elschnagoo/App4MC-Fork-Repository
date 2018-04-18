/**
 * *******************************************************************************
 *  Copyright (c) 2018 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.hw.extended;

import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.provider.FrequencyDomainItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedHWModelItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedFrequencyDomainItemProvider extends FrequencyDomainItemProvider {

	public ExtendedFrequencyDomainItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object hwModel = super.getParent(object);
		final ExtendedHWModelItemProvider hwModelItemProvider = (ExtendedHWModelItemProvider) this.adapterFactory
				.adapt(hwModel, ITreeItemContentProvider.class);
		return hwModelItemProvider != null ? hwModelItemProvider.getHwDomains((HWModel) hwModel) : null;
	}

}
