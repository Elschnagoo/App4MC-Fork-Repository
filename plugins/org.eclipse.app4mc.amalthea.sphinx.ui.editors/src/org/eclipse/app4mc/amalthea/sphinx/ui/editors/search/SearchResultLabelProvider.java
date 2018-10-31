/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 *  
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *     
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search;

import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.ui.provider.ExtendedImageRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

public class SearchResultLabelProvider extends ColumnLabelProvider {

	protected ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object element) {
		if (element instanceof EObject) {
			final IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(element, IItemLabelProvider.class);
			if (labelProvider != null) {
				return labelProvider.getText(element);
			}
		}
		return super.getText(element);
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(final Object element) {
		final IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(element, IItemLabelProvider.class);
		if (labelProvider != null) {
			final ImageDescriptor imageDesc = ImageDescriptor.createFromURL((URL) labelProvider.getImage(element));
			return ExtendedImageRegistry.INSTANCE.getImage(imageDesc);
		}
		return super.getImage(element);
	}

}
