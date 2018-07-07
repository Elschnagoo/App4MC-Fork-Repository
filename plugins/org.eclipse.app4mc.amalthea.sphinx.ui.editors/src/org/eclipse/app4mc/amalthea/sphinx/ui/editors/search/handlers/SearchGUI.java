/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.sphinx.ui.editors.search.handlers;

import org.eclipse.app4mc.amalthea.sphinx.ui.editors.messages.Messages;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SearchGUI extends TitleAreaDialog {

	private String searchInput;

	private Text searchInputField;

	public SearchGUI(final Shell parentShell) {
		super(parentShell);
		setHelpAvailable(false);
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#create()
	 */
	@Override
	public void create() {
		super.create();
		getButton(IDialogConstants.OK_ID).setText(Messages.SearchGUI_button);
		setTitle(Messages.SearchGUI_title);
		setMessage(Messages.SearchGUI_description);
	}

	/**
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#createDialogArea(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	protected Control createDialogArea(final Composite parent) {
		final GridLayout layout = new GridLayout();
		parent.setLayout(layout);
		final GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;
		final Label inputLabel = new Label(parent, SWT.NONE);
		inputLabel.setText(Messages.SearchGUI_label);
		this.searchInputField = new Text(parent, SWT.BORDER);
		this.searchInputField.setLayoutData(gridData);
		return parent;
	}

	/**
	 * @see org.eclipse.jface.dialogs.Dialog#okPressed()
	 */
	@Override
	protected void okPressed() {
		setSearchInput(this.searchInputField.getText());
		super.okPressed();
	}

	/**
	 * @see org.eclipse.jface.dialogs.TitleAreaDialog#getInitialSize()
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(400, 200);
	}

	public String getSearchInput() {
		return this.searchInput;
	}

	public void setSearchInput(final String searchInput) {
		this.searchInput = searchInput;
	}

}
