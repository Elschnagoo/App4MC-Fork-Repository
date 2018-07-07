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

import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.app4mc.multicore.dialogs.generic.SummaryDialog;
import org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;

public class SummaryPage extends AbstractWizardPage {
	/**
	 * Constructor for MappingPage.
	 *
	 * @param store
	 *            preference store to be used
	 */
	public SummaryPage(final IPreferenceStore store) {
		super("Summary Page");

		setTitle("Summary");
		setDescription("This page shows the summary of the workflow to be applied");
		this.dialog = new SummaryDialog(store);

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#isEnabled()
	 */
	@Override
	public boolean isEnabled() {
		boolean enabled = false;

		enabled |= this.dialog.getStore().getBoolean(IDialogsConstants.PRE_CHECK_MAPPING);
		enabled |= this.dialog.getStore().getBoolean(IDialogsConstants.PRE_CHECK_PARTITIONING);
		enabled |= this.dialog.getStore().getBoolean(IDialogsConstants.PRE_CHECK_CREATE_TASKS);

		return enabled;

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#doAction()
	 */
	@Override
	public boolean doAction() {
		return this.dialog.getGroups()[SummaryDialog.DEFAULT_GROUP].update();
	}


}