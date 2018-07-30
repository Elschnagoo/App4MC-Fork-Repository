/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.sw.extended;

import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.provider.ChannelItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedSWModelItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedChannelIP extends ChannelItemProvider {

	public ExtendedChannelIP(final AdapterFactory adapterFactory) {
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
		return swModelItemProvider != null ? swModelItemProvider.getChannelsContainerIP((SWModel) swModel) : null;
	}

}
