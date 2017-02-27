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
package org.eclipse.app4mc.multicore.dialogs.wizards;

import org.eclipse.app4mc.multicore.dialogs.AbstractDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public abstract class AbstractWizardPage extends WizardPage {
	/**
	 * Dialog page
	 */
	protected AbstractDialogPage dialog;

	/**
	 * Constructor
	 *
	 * @param pageName
	 *            page's name
	 */
	protected AbstractWizardPage(final String pageName) {
		super(pageName);
		setPageComplete(true);
	}

	/**
	 * Get enable status
	 *
	 * @return true if is enable and will be displayed and false otherwise
	 */
	public abstract boolean isEnabled();

	/**
	 * Get the dialog page
	 *
	 * @return dialog page
	 */
	public AbstractDialogPage getDialog() {
		return this.dialog;
	}

	/**
	 * Get the preferences store
	 *
	 * @return preferences store
	 */
	public boolean store() {
		return this.dialog.store();
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		final Composite container = new Composite(parent, SWT.NULL);
		final GridLayout layout = new GridLayout();
		container.setLayout(layout);

		this.dialog.createControl(container);
		this.dialog.load();

		setControl(container);

		/*
		 * This is a good idea because of the nature of AbstractWizard, which
		 * extends Wizard by adding the possibility of having disabled
		 * WizardPages.
		 */
		container.setVisible(false);
	}


	/**
	 * To allow external agents to perform some action
	 *
	 * @return true if no errors occur false otherwise
	 */
	public boolean doAction() {
		return true;
	}

}
