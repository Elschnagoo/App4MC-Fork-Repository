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
import org.eclipse.app4mc.multicore.dialogs.openmapping.OMPerformMappingDialog;
import org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;

public class PerformMappingPage extends AbstractWizardPage {
	/**
	 * Constructor for MappingPage.
	 *
	 * @param store
	 *            preference store to be used
	 */
	public PerformMappingPage(final IPreferenceStore store) {
		super("Mapping Page");

		setTitle("Mapping Configuration");
		setDescription("This page configurate the mapping feature");
		this.dialog = new OMPerformMappingDialog(store);

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage#isEnabled()
	 */
	@Override
	public boolean isEnabled() {

		return this.dialog.getStore().getBoolean(IDialogsConstants.PRE_CHECK_MAPPING);

	}

}