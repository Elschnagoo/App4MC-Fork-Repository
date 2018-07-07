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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.converters.ui.providers;

import java.util.List;

import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Display;

public class MigrationVersionErrorDataProvider implements IStructuredContentProvider, ITableLabelProvider, IColorProvider {


	@Override
	public void dispose() {
		// empty block
	}

	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// empty block
	}

	@Override
	public void addListener(final ILabelProviderListener listener) {
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
	public Image getColumnImage(final Object element, final int columnIndex) {

		return null;
	}

	@Override
	public String getColumnText(final Object element, final int columnIndex) {

		String retString = "";

		final MigrationInputFile migModelFile = (MigrationInputFile) element;

		switch (columnIndex) {
		case 0: {

			// building relative path from the project location

			retString = migModelFile.getMigrationSettings().getProject().toURI()
					.relativize(migModelFile.getFile().toURI()).getPath();


			// retString = st.getFile().getAbsolutePath();
			break;
		}
		case 1: {
			retString = migModelFile.getModelVersion();
			break;
		}
		}
		return retString;


	}

	@Override
	public Object[] getElements(final Object inputElement) {

		if (inputElement instanceof List<?>) {
			return ((List<?>) inputElement).toArray();
		}

		return null;
	}

	@Override
	public Color getForeground(final Object element) {

		if (element instanceof MigrationInputFile) {
			if (((MigrationInputFile) element).isVersionDifferent()) {
				return (new Color(Display.getCurrent(), 255, 0, 0));
			}

		}

		return null;
	}

	@Override
	public Color getBackground(final Object element) {
		// TODO mez2rng Auto-generated method stub
		return null;
	}

}
