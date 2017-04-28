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
package org.eclipse.app4mc.multicore.dialogs.wizards.handlers;

import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;
import org.eclipse.app4mc.multicore.dialogs.wizards.PerformMappingWizard;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Class associated with the popupMenu for the folder Start the wizard in the
 * run method
 */

public class PerformMappingWizardHandler extends AbstractHandler {

	/**
	 * Preferences store
	 */
	private final static IPreferenceStore store = DialogsPlugin.getDefaultPreferenceStore();

	/**
	 * Get preferences store
	 *
	 * @return preferences store
	 */
	public static IPreferenceStore getPreferenceStore() {
		return store;
	}

	/**
	 * @see org.eclipse.core.commands.IHandler#execute(org.eclipse.core.commands.ExecutionEvent)
	 */
	@Override
	public Object execute(final ExecutionEvent event) throws ExecutionException {

		// Init Handler
		UniversalHandler.getInstance().setPluginId(DialogsPlugin.getPluginId());
		UniversalHandler.getInstance().setLog(DialogsPlugin.getDefault().getLog());

		// Create GUI for user input
		try {
			// Fetch workbench window context
			final IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
			final IStructuredSelection selection = UniversalHandler.getInstance().getSelection(event);

			// Initialize dialog
			final PerformMappingWizard wizard = new PerformMappingWizard(event);
			// Name the project after the SW model file (proposition)
			wizard.init(window.getWorkbench(), selection);

			final WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
			dialog.create();
			dialog.open();

		}
		catch (final ExecutionException e) {
			e.printStackTrace();
			return null;
		}


		return null;
	}


}
