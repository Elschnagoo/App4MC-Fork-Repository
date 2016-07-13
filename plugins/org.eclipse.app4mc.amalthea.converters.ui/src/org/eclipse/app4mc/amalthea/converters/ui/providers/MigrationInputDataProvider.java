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

import java.io.File;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.jface.resource.FontDescriptor;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.swt.widgets.Display;

public class MigrationInputDataProvider extends DelegatingStyledCellLabelProvider
		implements IStructuredContentProvider {

	private final Logger logger=LogManager.getLogger("Model-Migration");

	public MigrationInputDataProvider(final IStyledLabelProvider labelProvider) {
		super(labelProvider);
	}


	@Override
	public Object[] getElements(final Object inputElement) {

		if (inputElement instanceof List) {
			return ((List<?>) inputElement).toArray();
		}

		return new Object[] { inputElement };
	}


	@Override
	public StyledString getStyledText(final Object element) {


		if (element instanceof MigrationInputFile) {

			final MigrationInputFile migModelFile = (MigrationInputFile) element;

			final File file = (migModelFile).getFile();
			if (file != null) {

				try {
					// building relative path from the project location

					final String path = migModelFile.getMigrationSettings().getProject().toURI()
							.relativize(file.toURI()).getPath();

					if ((migModelFile).isSelectedFile()) {
						return new StyledString(path, new BoldFontStyler());
					}

					return new StyledString(path);
				}
				catch (final Exception e) {
					
					logger.warn("unable to build the relative path for file : " + file.getAbsolutePath(), e);

					/*- Displaying the absolute path of the file, as it is not possible to construct relative path*/
					return new StyledString(file.getAbsolutePath());
				}


			}
		}

		return null;
	}


	@Override
	public void inputChanged(final Viewer viewer, final Object oldInput, final Object newInput) {
		// empty block
	}


	class BoldFontStyler extends Styler {
		@Override
		public void applyStyles(final TextStyle textStyle) {
			// final FontDescriptor boldDescriptor = FontDescriptor.createFrom(new FontData()).setStyle(SWT.BOLD);
			// final Font boldFont = boldDescriptor.createFont(Display.getCurrent());
			// textStyle.font = boldFont;
			textStyle.foreground = new Color(Display.getCurrent(), 0, 0, 255);

		}
	}

	class ItalicFontStyler extends Styler {
		@Override
		public void applyStyles(final TextStyle textStyle) {
			final FontDescriptor italicDescriptor = FontDescriptor.createFrom(new FontData()).setStyle(SWT.ITALIC);
			final Font italic = italicDescriptor.createFont(Display.getCurrent());
			textStyle.font = italic;
			// textStyle.foreground = new Color(Display.getCurrent(), 0, 0, 255);

		}
	}


}
