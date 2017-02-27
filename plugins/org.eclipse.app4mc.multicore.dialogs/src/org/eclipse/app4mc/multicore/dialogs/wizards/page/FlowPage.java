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
package org.eclipse.app4mc.multicore.dialogs.wizards.page;

import org.eclipse.app4mc.multicore.dialogs.generic.FlowDialog;
import org.eclipse.app4mc.multicore.dialogs.wizards.AbstractWizardPage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

/**
 * @author pjcuadra
 *
 */
public class FlowPage extends AbstractWizardPage {

	/**
	 * Constructor for MappingPage.
	 *
	 * @param store
	 *            preference store to be used
	 */
	public FlowPage(final IPreferenceStore store) {
		super("Flow Page");

		setTitle("Flow Configuration");
		setDescription("This page sets the steps to be included into this workflow");
		this.dialog = new FlowDialog(store);

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

		return true;

	}

}