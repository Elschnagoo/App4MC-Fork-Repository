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
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * 
 * 
 */
public class SearchResultLabelProvider extends ColumnLabelProvider {

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getText(java.lang.Object)
	 */
	@Override
	public String getText(final Object element) {
		if (element instanceof EObject) {
			final EObject elem = (EObject) element;
			final IItemLabelProvider labelProvider = (IItemLabelProvider) Util.getAdapterFactoryForType(elem,
					IItemLabelProvider.class);
			if (null != labelProvider) {
				return labelProvider.getText(elem);
			}
		}
		return super.getText(element);
	}

	/**
	 * @see org.eclipse.jface.viewers.ColumnLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(final Object element) {
		final IItemLabelProvider labelProvider = (IItemLabelProvider) Util.getAdapterFactoryForType((EObject) element,
				IItemLabelProvider.class);
		if (null != labelProvider) {
			final ImageDescriptor image = ImageDescriptor.createFromURL((URL) labelProvider.getImage(element));
			return image.createImage();
		}
		return super.getImage(element);
	}

}
