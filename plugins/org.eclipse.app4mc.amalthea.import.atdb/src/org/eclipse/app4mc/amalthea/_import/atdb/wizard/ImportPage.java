/*******************************************************************************
 * Copyright (c) 2015 Timing-Architects Embedded Systems GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.app4mc.amalthea._import.atdb.wizard;

import java.io.File;

import org.eclipse.core.resources.IContainer;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.WizardResourceImportPage;

public class ImportPage extends WizardResourceImportPage {

	private Text sourceNameField;

	protected ImportPage(final IStructuredSelection selection) {
		this("atdbImportPage", selection);
		setTitle("Import Model");
		this.setMessage("Select an existing ATDB File for Model Creation");
	}

	protected ImportPage(final String name, final IStructuredSelection selection) {
		super(name, selection);
	}

	@Override
	protected void createSourceGroup(final Composite parent) {
		final Composite sourceContainerGroup = new Composite(parent, SWT.NONE);
		final GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		sourceContainerGroup.setLayout(layout);
		sourceContainerGroup.setFont(parent.getFont());
		sourceContainerGroup.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL));

		// source label
		final Label groupLabel = new Label(sourceContainerGroup, SWT.NONE);
		groupLabel.setText("From directory:");
		groupLabel.setFont(parent.getFont());

		// source name entry field
		this.sourceNameField = new Text(sourceContainerGroup, SWT.READ_ONLY | SWT.BORDER);
		final GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL | GridData.GRAB_HORIZONTAL);
		data.widthHint = SIZING_TEXT_FIELD_WIDTH;
		this.sourceNameField.setLayoutData(data);
		this.sourceNameField.setFont(parent.getFont());

		// source browse button
		final Button sourceBrowseButton = new Button(sourceContainerGroup, SWT.PUSH);
		sourceBrowseButton.setText("Browse...");
		sourceBrowseButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				selectFile();
				update();
			}
		});
		sourceBrowseButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_FILL));
		sourceBrowseButton.setFont(parent.getFont());
		setButtonLayoutData(sourceBrowseButton);
	}

	@Override
	protected ITreeContentProvider getFileProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected ITreeContentProvider getFolderProvider() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean determinePageCompletion() {
		boolean result = super.determinePageCompletion();

		final String path = this.sourceNameField.getText();
		final File file = new File(path);
		result &= file.exists();

		return result;
	}

	private void selectFile() {
		final FileDialog fileDialog = new FileDialog(getShell(), SWT.OPEN);
		fileDialog.setText("Select file");
		fileDialog.setFilterExtensions(new String[] { "*.atdb" });
		final String open = fileDialog.open();
		if (open != null) {
			this.sourceNameField.setText(open);
			update();
		}
	}

	protected void update() {
		setPageComplete(determinePageCompletion());
	}

	protected String getSource() {
		return this.sourceNameField.getText();
	}

	protected IContainer getTargetContainer() {
		return getSpecifiedContainer();
	}

}
