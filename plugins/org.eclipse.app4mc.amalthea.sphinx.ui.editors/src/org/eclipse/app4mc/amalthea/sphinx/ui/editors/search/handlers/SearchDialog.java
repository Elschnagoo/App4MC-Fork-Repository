/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class SearchDialog extends TitleAreaDialog {
	
	private SearchDialogSettings settings;

	private Text txtNamePattern;
	private Label lblSyntaxDescription;
	private Button btnCaseSensitive;
	private Button btnRegularExpression;	
	private Combo cmbClassFilter;
	private Composite composite;
	private Button btnScopeCurrentFile;
	private Button btnScopeFolder;

	/**
	 * Create the dialog.
	 * @param parentShell
	 * @param settings
	 */
	public SearchDialog(Shell parentShell, SearchDialogSettings set) {
		super(parentShell);
		setShellStyle(SWT.APPLICATION_MODAL | SWT.DIALOG_TRIM | SWT.RESIZE);
		setHelpAvailable(false);
		
		if (set != null)
			settings = set;
		else
			settings = new SearchDialogSettings();
	}

	private void copySettings2UI() {
		txtNamePattern.setText(settings.m_namePattern);
		btnCaseSensitive.setSelection(settings.m_caseSensitive);
		btnRegularExpression.setSelection(settings.m_regularExpression);
		lblSyntaxDescription.setVisible(!settings.m_regularExpression);
		cmbClassFilter.setItems(settings.getFilterClassNames());
		cmbClassFilter.setText(settings.m_filterClassName);
		btnScopeCurrentFile.setSelection(settings.m_restrictToFile);
		btnScopeFolder.setSelection(!settings.m_restrictToFile);
	}

	private void copyUI2Settings() {
		settings.m_namePattern = txtNamePattern.getText();
		settings.m_caseSensitive = btnCaseSensitive.getSelection();
		settings.m_regularExpression = btnRegularExpression.getSelection();
		settings.m_filterClassName = cmbClassFilter.getText();
		settings.m_restrictToFile = btnScopeCurrentFile.getSelection();
	}

	@Override
	public void create() {
		super.create();
		
		// handle settings - initialize UI
		copySettings2UI();
	}

	@Override
	protected void setReturnCode(int code) {
		// handle settings - save UI content
		if (code == Window.OK) {
			settings.m_success = true;
			copyUI2Settings();
		}
		
		super.setReturnCode(code);
	}

	/**
	 * Create contents of the dialog.
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Search for model elements");
		setMessage("Query the name attribute of model elements.");
		Composite dialog = (Composite) super.createDialogArea(parent);
		
		Composite container = new Composite(dialog, SWT.NONE);
		container.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		GridLayout layout = new GridLayout();
		layout.marginTop = 4;
		layout.verticalSpacing = 5;
		layout.horizontalSpacing = 10;
		layout.makeColumnsEqualWidth = false;
		layout.numColumns = 2;
		container.setLayout(layout);
		
		Label lblName = new Label(container, SWT.NONE);
		lblName.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblName.setText("Name:");
		
		txtNamePattern = new Text(container, SWT.BORDER);
		txtNamePattern.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		new Label(container, SWT.NONE);
		lblSyntaxDescription = new Label(container, SWT.NONE);
		lblSyntaxDescription.setText("(* = any string, ? = any character, \\ = escape for literals: * ? \\)");
		
		Label separator0 = new Label(container, SWT.NONE);
		GridData gd_separator0 = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_separator0.heightHint = 8;
		separator0.setLayoutData(gd_separator0);
		
		new Label(container, SWT.NONE);
		btnCaseSensitive = new Button(container, SWT.CHECK);
		btnCaseSensitive.setText("Case sensitive");
		
		new Label(container, SWT.NONE);
		btnRegularExpression = new Button(container, SWT.CHECK);
		btnRegularExpression.setText("Regular expression");
		
		Label separator1 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_separator1 = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_separator1.heightHint = 8;
		separator1.setLayoutData(gd_separator1);
		
		Label lblFilter = new Label(container, SWT.NONE);
		lblFilter.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblFilter.setText("Filter:");
		
		cmbClassFilter = new Combo(container, SWT.READ_ONLY);
		cmbClassFilter.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblScope = new Label(container, SWT.NONE);
		lblScope.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		lblScope.setText("Scope:");
		
		composite = new Composite(container, SWT.NONE);
		FillLayout fl_composite = new FillLayout(SWT.HORIZONTAL);
		fl_composite.spacing = 10;
		composite.setLayout(fl_composite);
		composite.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		
		btnScopeCurrentFile = new Button(composite, SWT.RADIO);
		btnScopeCurrentFile.setText("Current file");
		
		btnScopeFolder = new Button(composite, SWT.RADIO);
		btnScopeFolder.setText("Folder");
		btnScopeFolder.setSelection(true);

		Label separator2 = new Label(container, SWT.SEPARATOR | SWT.HORIZONTAL);
		GridData gd_separator2 = new GridData(SWT.FILL, SWT.CENTER, false, false, 2, 1);
		gd_separator2.heightHint = 8;
		separator2.setLayoutData(gd_separator2);

		btnRegularExpression.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lblSyntaxDescription.setVisible(!btnRegularExpression.getSelection());
			}
		});
		
		return container;
	}

	/**
	 * Create contents of the button bar.
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		super.createButtonsForButtonBar(parent);
		
		Button searchButton = getButton(IDialogConstants.OK_ID);
		searchButton.setText("Search");
	}

}
