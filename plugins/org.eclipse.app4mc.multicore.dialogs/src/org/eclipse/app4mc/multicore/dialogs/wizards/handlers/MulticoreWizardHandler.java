/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.dialogs.wizards.handlers;

import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;
import org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage;
import org.eclipse.app4mc.multicore.dialogs.wizards.MulticoreWizard;
import org.eclipse.app4mc.multicore.sharelibs.SelectionUtil;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;

/**
 * Class associated with the popupMenu for the folder Start the wizard in the
 * run method
 */

public class MulticoreWizardHandler extends AbstractHandler {
	/**
	 * Wizard
	 */
	protected MulticoreWizard wizard;
	/**
	 * Wizard's dialog
	 */
	protected WizardDialog dialog;
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
	 * Listener to update wizard's controls
	 */
	private final IPropertyChangeListener firstPageSelection = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {
			updateNextButton();
		}
	};

	/**
	 * Listener to store values on next button click and summary page update
	 */
	private final IPageChangedListener pageChanged = new IPageChangedListener() {

		@Override
		public void pageChanged(final PageChangedEvent event) {
			final AbstractWizardPage currPage = (AbstractWizardPage) event.getSelectedPage();

			// Store settings
			MulticoreWizardHandler.this.wizard.store();

			// Action done when page is selected
			currPage.doAction();
		}
	};


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
			final IStructuredSelection selection = SelectionUtil.getSelection(event);

			this.wizard = new MulticoreWizard();
			// Name the project after the SW model file (proposition)
			this.wizard.init(window.getWorkbench(), selection);

			// Enable debug logging
			// this.wizard.setLoggingEnabled(true);

			this.dialog = new WizardDialog(window.getShell(), this.wizard);

			// Save when clicking next button
			this.dialog.addPageChangedListener(this.pageChanged);
			this.dialog.create();

			updateNextButton();
			store.addPropertyChangeListener(this.firstPageSelection);


			this.dialog.open();

		}
		catch (final ExecutionException e) {
			e.printStackTrace();

			// Remove the listener
			store.removePropertyChangeListener(this.firstPageSelection);

			return null;
		}

		// Remove the listener
		store.removePropertyChangeListener(this.firstPageSelection);
		return null;
	}

	/**
	 * Update next button
	 */
	protected void updateNextButton() {

		if (this.wizard == null) {
			return;
		}

		final boolean canFlip = this.wizard.getPageCount() > 1;

		if (this.wizard.getStartingPage() != null) {
			((WizardPage) this.wizard.getStartingPage()).setPageComplete(canFlip);
			this.dialog.updateButtons();
		}
	}
}
