/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.sharelibs;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public class SelectionUtil {

	/**
	 * Returns the selection when while calling the plugin
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return IStructuredSelection selection
	 */
	public static IStructuredSelection getSelection(final ExecutionEvent event) {

		// Fetch current selection
		final IStructuredSelection ssel = (IStructuredSelection) HandlerUtil.getActiveSite(event).getSelectionProvider()
				.getSelection();

		// Check if function was called properly
		if (ssel == null) {
			return null;
		}

		// return first element of selection
		return ssel;
	}

	/**
	 * Returns the object which has been selecting while calling the plugin
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return Object storing the first element of the selection
	 */
	private static Object getFirstSelection(final ExecutionEvent event) {

		// return first element of selection
		return getSelection(event).getFirstElement();
	}

	/**
	 * Returns the IFile of the file where a popup command was executed
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return IFile of the chosen file on success, otherwise null
	 */
	public static IFile getSelectedFile(final ExecutionEvent event) {
		final Object selection = getFirstSelection(event);

		// Check if selected item is a file
		if (selection instanceof IFile) {
			final IFile file = (IFile) selection;
			return file;
		}
		return null;
	}

	/**
	 * Returns the URI of the project where a popup command was executed
	 *
	 * @param event
	 *            ExecutionEvent
	 * @return URI of the project containing the selected file on success,
	 *         otherwise null
	 */
	public static URI getProjectDir(final ExecutionEvent event) {
		final Object selection = getFirstSelection(event);

		// Check if selected item is an IResource
		if (!(selection instanceof IResource)) {
			return null;
		}

		final IResource file = (IResource) selection;
		final String projectDir = file.getProject().getLocationURI().toString();
		return URI.createURI(projectDir);

	}

}