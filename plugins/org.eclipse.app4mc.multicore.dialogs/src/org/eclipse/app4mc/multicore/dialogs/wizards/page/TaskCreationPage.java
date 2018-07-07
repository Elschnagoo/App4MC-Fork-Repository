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

package org.eclipse.app4mc.multicore.dialogs.wizards.page;

import org.eclipse.app4mc.multicore.dialogs.openmapping.OMTaskCreationDialog;
import org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public class TaskCreationPage extends AbstractWizardPage {
	/**
	 * Constructor for MappingPage.
	 *
	 * @param store
	 *            preference store to be used
	 */
	public TaskCreationPage(final IPreferenceStore store) {
		super("Task Creation Page");

		setTitle("Task Creation Configuration");
		setDescription("This page configurate the Task Creation feature");

		setPageComplete(true);

		this.dialog = new OMTaskCreationDialog(store);

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		this.dialog = new OMTaskCreationDialog(this.dialog.getStore());
		super.createControl(parent);
		this.dialog.store();
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#isEnabled()
	 */
	@Override
	public boolean isEnabled() {

		// return
		// this.dialog.getStore().getBoolean(IDialogsConstants.PRE_CHECK_CREATE_TASKS);

		// Don't display this page since doesn't have more than one option
		return false;
	}

}