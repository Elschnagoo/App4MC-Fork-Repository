/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters.ui.providers;

import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

public class StyledLabelProvider implements IStyledLabelProvider {

	@Override
	public void addListener(final ILabelProviderListener listener) {
		// empty block
	}

	@Override
	public void dispose() {
		// empty block
	}

	@Override
	public boolean isLabelProperty(final Object element, final String property) {
		return false;
	}

	@Override
	public void removeListener(final ILabelProviderListener listener) {
		// empty block
	}

	@Override
	public StyledString getStyledText(final Object element) {
		return null;
	}

	@Override
	public Image getImage(final Object element) {
		return null;
	}

}