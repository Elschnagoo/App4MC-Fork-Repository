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
package org.eclipse.app4mc.multicore.dialogs.openmapping.preference;

import org.eclipse.app4mc.multicore.dialogs.openmapping.OMDialog;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class OMPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	/**
	 * Dialog page
	 */
	private final OMDialog dialog;

	/**
	 * Constructor
	 */
	public OMPreferencePage() {
		super();

		setPreferenceStore(OpenMappingPlugin.getDefault().getPreferenceStore());

		this.dialog = new OMDialog(getPreferenceStore());
	}

	/**
	 * Constructor
	 *
	 * @param title
	 *            title of the preference page
	 */
	public OMPreferencePage(final String title) {
		super(title);

		setPreferenceStore(OpenMappingPlugin.getDefault().getPreferenceStore());

		this.dialog = new OMDialog(getPreferenceStore());
	}

	/**
	 * Constructor
	 *
	 * @param title
	 *            title of the preference page
	 * @param image
	 *            image of the preference page
	 */
	public OMPreferencePage(final String title, final ImageDescriptor image) {
		super(title, image);

		setPreferenceStore(OpenMappingPlugin.getDefault().getPreferenceStore());
		this.dialog = new OMDialog(getPreferenceStore());

	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createContents(final Composite parent) {

		this.dialog.createControl(parent);
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

		return this.dialog.store();
	}

	/**
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(final IWorkbench arg0) {
		// TODO Auto-generated method stub
	}

}
