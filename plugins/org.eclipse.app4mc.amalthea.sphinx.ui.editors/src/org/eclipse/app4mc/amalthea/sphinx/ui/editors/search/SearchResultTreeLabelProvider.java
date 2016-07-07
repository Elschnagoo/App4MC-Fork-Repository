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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.TreeNode;
import org.eclipse.swt.graphics.Image;

public class SearchResultTreeLabelProvider implements IStyledLabelProvider {

	@SuppressWarnings("javadoc")
	public SearchResultTreeLabelProvider() {

	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#addListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void addListener(final ILabelProviderListener listener) {
		// nothing to do
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#dispose()
	 */
	@Override
	public void dispose() {
		// nothing to do
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#isLabelProperty(java.lang.Object, java.lang.String)
	 */
	@Override
	public boolean isLabelProperty(final Object element, final String property) {

		return false;
	}

	/**
	 * @see org.eclipse.jface.viewers.IBaseLabelProvider#removeListener(org.eclipse.jface.viewers.ILabelProviderListener)
	 */
	@Override
	public void removeListener(final ILabelProviderListener listener) {
		// nothing to do
	}

	/**
	 * @see org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider#getStyledText(java.lang.Object)
	 */
	@Override
	public StyledString getStyledText(final Object element) {
		if (element instanceof TreeNode) {
			final TreeNode node = (TreeNode) element;
			if (node.getValue() instanceof EClass) {
				final EClass value = (EClass) node.getValue();
				return new StyledString(value.getName());
			}
			else if (node.getValue() instanceof EObject) {
				final EObject elem = (EObject) ((TreeNode) element).getValue();
				final IItemLabelProvider labelProvider = (IItemLabelProvider) Util.getAdapterFactoryForType(elem,
						IItemLabelProvider.class);
				if (null != labelProvider) {
					return new StyledString(labelProvider.getText(elem));
				}
			}
			else {
				return new StyledString(node.getValue().toString());
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider#getImage(java.lang.Object)
	 */
	@Override
	public Image getImage(final Object element) {
		if (element instanceof TreeNode) {
			final TreeNode node = (TreeNode) element;
			if (((node).getValue() instanceof EClass)) {
				// try to get image from children
				if (node.hasChildren()) {
					final TreeNode[] childs = node.getChildren();
					if (null != childs && childs.length > 0) {
						return getImageForObject((EObject) childs[0].getValue());
					}
				}
			}
			if ((node).getValue() instanceof EObject) {
				return getImageForObject((EObject) node.getValue());
			}
		}
		return null;
	}

	private Image getImageForObject(final EObject element) {
		final IItemLabelProvider labelProvider = (IItemLabelProvider) Util.getAdapterFactoryForType(element,
				IItemLabelProvider.class);
		if (null != labelProvider) {
			final ImageDescriptor image = ImageDescriptor.createFromURL((URL) labelProvider.getImage(element));
			return image.createImage();
		}
		return null;
	}

}
