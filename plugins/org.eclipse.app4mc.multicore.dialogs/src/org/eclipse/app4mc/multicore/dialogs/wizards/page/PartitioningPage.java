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
import org.eclipse.app4mc.multicore.dialogs.partitioning.ParDialogWizard;
import org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public class PartitioningPage extends AbstractWizardPage {
	/**
	 * Constructor for PartitioningPage.
	 *
	 * @param store
	 *            preferences store to use
	 */
	public PartitioningPage(final IPreferenceStore store) {
		super("Partitioning Page");
		setTitle("Partitioning Configuration");
		setDescription("This page configurates the partitioning feature");

		setPageComplete(true);

		this.dialog = new ParDialogWizard(store);
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		super.createControl(parent);
		this.dialog.store();
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#isEnabled()
	 */
	@Override
	public boolean isEnabled() {

		return this.dialog.getStore().getBoolean(IDialogsConstants.PRE_CHECK_PARTITIONING);

	}

}