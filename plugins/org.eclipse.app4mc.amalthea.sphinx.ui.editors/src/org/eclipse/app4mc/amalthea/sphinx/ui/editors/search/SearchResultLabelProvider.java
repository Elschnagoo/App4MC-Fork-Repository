/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *     
 * *******************************************************************************
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
