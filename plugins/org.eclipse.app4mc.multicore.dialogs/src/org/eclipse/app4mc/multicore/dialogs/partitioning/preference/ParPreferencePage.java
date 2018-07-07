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

package org.eclipse.app4mc.multicore.dialogs.partitioning.preference;

import org.eclipse.app4mc.multicore.dialogs.partitioning.ParDialog;
import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class ParPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	/**
	 * Dialog Page
	 */
	private final ParDialog dialog;

	/**
	 * Constructor
	 */
	public ParPreferencePage() {
		super();

		setPreferenceStore(PartitioningPlugin.getDefault().getPreferenceStore());

		this.dialog = new ParDialog(getPreferenceStore());
	}

	/**
	 * Constructor
	 *
	 * @param title
	 *            title of the preference page
	 */
	public ParPreferencePage(final String title) {
		super(title);

		setPreferenceStore(PartitioningPlugin.getDefault().getPreferenceStore());

		this.dialog = new ParDialog(getPreferenceStore());
	}

	/**
	 * Constructor
	 *
	 * @param title
	 *            title of the preference page
	 * @param image
	 *            image of the preference page
	 */
	public ParPreferencePage(final String title, final ImageDescriptor image) {
		super(title, image);

		setPreferenceStore(PartitioningPlugin.getDefault().getPreferenceStore());

		this.dialog = new ParDialog(getPreferenceStore());
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(final Composite parent) {

		// Create control
		this.dialog.createControl(parent);
		// Load values from store
		this.dialog.load();

		return parent;
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();

		this.dialog.loadDefault();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		this.dialog.store();

		return true;
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(final IWorkbench arg0) {
		// TODO Auto-generated method stub

	}
}