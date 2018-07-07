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

package org.eclipse.app4mc.amalthea.editors.sirius.command;

import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Central entry point to provide a command for an AMALTHEA model element to open a Sirius based representation. <br>
 * Needs to be extended to provide the target class, which must be of type {@link IReferable}.<br>
 * Configuration as a normal Eclipse command in a plugin.xml using the <code>org.eclipse.ui.handlers</code> extension
 * point.<br>
 * 
 * @author daniel.kunz@de.bosch.com
 *
 */
public abstract class OpenEditorHandler<S extends IReferable> extends AbstractHandler {

	@SuppressWarnings("unchecked")
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		final ISelection currentSelectionChecked = HandlerUtil.getCurrentSelectionChecked(event);
		final Object selectedObject = ((IStructuredSelection) currentSelectionChecked).getFirstElement();
		if (selectedObject instanceof IReferable) {
			final OpenGraphicalEditorAction<S> openGraphicalEditorAction = new OpenGraphicalEditorAction<S>(
					getTargetClass(), (S) selectedObject);
			openGraphicalEditorAction.execute();
		}
		return null;
	}

	/**
	 * Method to return the class of the target element.
	 * 
	 * @return Class<S>
	 */
	protected abstract Class<S> getTargetClass();

}
