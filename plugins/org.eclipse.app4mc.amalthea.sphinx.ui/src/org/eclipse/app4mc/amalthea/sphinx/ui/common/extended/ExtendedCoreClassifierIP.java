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

package org.eclipse.app4mc.amalthea.sphinx.ui.common.extended;


import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.provider.CoreClassifierItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedCommonElementsItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;


public class ExtendedCoreClassifierIP extends CoreClassifierItemProvider {

	public ExtendedCoreClassifierIP(final AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * @see org.eclipse.emf.edit.provider.ItemProviderAdapter#getParent(java.lang.Object)
	 */
	@Override
	public Object getParent(final Object object) {
		final Object commonElements = super.getParent(object);
		final ExtendedCommonElementsItemProvider commonElementsItemProvider = (ExtendedCommonElementsItemProvider) this.adapterFactory
				.adapt(commonElements, ITreeItemContentProvider.class);
		return commonElementsItemProvider != null ? commonElementsItemProvider.getCoreClassifiersContainerIP((CommonElements) commonElements) : null;
	}

}
