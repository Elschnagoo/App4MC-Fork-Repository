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
		final Object runnable = super.getParent(object);
		final ExtendedRunnableItemProvider runnableItemProvider = (ExtendedRunnableItemProvider) this.adapterFactory
				.adapt(runnable, ITreeItemContentProvider.class);
		return null != runnableItemProvider ? runnableItemProvider.getRunnableItems((Runnable) runnable) : null;
	}
}
