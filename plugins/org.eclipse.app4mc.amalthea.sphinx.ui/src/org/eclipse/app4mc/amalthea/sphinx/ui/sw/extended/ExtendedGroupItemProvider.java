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

import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.provider.GroupItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ExtendedGroupItemProvider extends GroupItemProvider {

	public ExtendedGroupItemProvider(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object parent = super.getParent(object);

		if (parent instanceof Runnable) {
			final Runnable runnable = (Runnable) parent;
			final ExtendedRunnableItemProvider runnableItemProvider = (ExtendedRunnableItemProvider) this.adapterFactory
					.adapt(runnable, ITreeItemContentProvider.class);
			return runnableItemProvider != null ? runnableItemProvider.getRunnableItems((Runnable) runnable) : null;
		}

		return parent;
	}

}
