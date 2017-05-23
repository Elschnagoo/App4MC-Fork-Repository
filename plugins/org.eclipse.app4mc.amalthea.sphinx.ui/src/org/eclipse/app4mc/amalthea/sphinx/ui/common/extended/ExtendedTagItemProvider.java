/**
 * *******************************************************************************
 *  Copyright (c) 2017 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.common.extended;


import org.eclipse.app4mc.amalthea.model.CommonElements;
import org.eclipse.app4mc.amalthea.model.provider.TagItemProvider;
import org.eclipse.app4mc.amalthea.sphinx.ui.ExtendedCommonElementsItemProvider;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;


public class ExtendedTagItemProvider extends TagItemProvider {

	public ExtendedTagItemProvider(final AdapterFactory adapterFactory) {
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
		return commonElementsItemProvider != null ? commonElementsItemProvider.getTags((CommonElements) commonElements) : null;
	}

}