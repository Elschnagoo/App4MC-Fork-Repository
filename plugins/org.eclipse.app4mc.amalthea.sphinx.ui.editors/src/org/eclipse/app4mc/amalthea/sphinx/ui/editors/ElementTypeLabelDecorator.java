/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors;

import org.apache.commons.lang.StringUtils;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.swt.graphics.Image;

public class ElementTypeLabelDecorator extends BaseLabelProvider implements ILabelDecorator {

	/**
	 * @see org.eclipse.jface.viewers.ILabelDecorator#decorateImage(org.eclipse.swt.graphics.Image, java.lang.Object)
	 */
	@Override
	public Image decorateImage(final Image image, final Object element) {
		return null;
	}

	/**
	 * @see org.eclipse.jface.viewers.ILabelDecorator#decorateText(java.lang.String, java.lang.Object)
	 */
	@Override
	public String decorateText(final String text, final Object element) {
		if (StringUtils.isBlank(text)) {
			return text;
		}

		final String type = getTypeOfElement(element);
		if (StringUtils.isBlank(type)) {
			return text;
		}

		return text + " [" + type + "]"; //$NON-NLS-1$//$NON-NLS-2$
	}

	/**
	 * @param element
	 *            The element to get the type of, should be an instance of {@link EObject}
	 * @return The name of the {@link EClass}, <code>null</code> otherwise
	 */
	public String getTypeOfElement(final Object element) {
		if (element instanceof EObject) {
			return ((EObject) element).eClass().getName();
		}
		return null;
	}

}
