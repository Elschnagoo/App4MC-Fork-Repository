/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.handlers;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class PerformMappingGUI extends TitleAreaDialog {
	String workingDirectory;
	private String initName;
	private String initSWModel;

	private String nameOfCompilation;
	private String pathToSWModel;
	private String pathToHWModel;
	// private String pathToOutput;

	private Text textProjectName;
	Text textSWModelFile;
	Text textHWModelFile;

	// Text textOutputLocation;

	public PerformMappingGUI(final Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("Mapping");
	}

	@Override
	protected Point getInitialSize() {
		return new Point(600, 380);
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final GridLayout layout = new GridLayout();
		// Number of Colums for the Dialog
		layout.numColumns = 3;
		parent.setLayout(layout);

		// The text fields will grow with the size of the dialog
		final GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		final Label label1 = new Label(parent, SWT.NONE);
		label1.setText("Name of the Project");
		this.textProjectName = new Text(parent, SWT.BORDER);
		this.textProjectName.setLayoutData(gridData);
		if (this.initName != null) {
			this.textProjectName.setText(this.initName);
		}
		new Label(parent, SWT.NONE);

		final Label label2 = new Label(parent, SWT.NONE);
		label2.setText("Path to Software Model");
		this.textSWModelFile = new Text(parent, SWT.BORDER);
		this.textSWModelFile.setLayoutData(gridData);
		if (this.initSWModel != null) {
			this.textSWModelFile.setText(this.initSWModel);
		}

		final Button btwSearchSWModel = new Button(parent, SWT.NONE);
		btwSearchSWModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final Shell shell = parent.getShell();
				final String selection = openFileDialog(shell, "Select Software Model", "*.amxmi; *.amxmi-sw",
						PerformMappingGUI.this.workingDirectory);
				if (selection != null) {
					PerformMappingGUI.this.textSWModelFile.setText(selection);
				}
			}
		});
		btwSearchSWModel.setText("Search");

		final Label label3 = new Label(parent, SWT.NONE);
		label3.setText("Path to Hardware Model");
		this.textHWModelFile = new Text(parent, SWT.BORDER);
		this.textHWModelFile.setLayoutData(gridData);

		final Button btwSearchHWModel = new Button(parent, SWT.NONE);
		btwSearchHWModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final Shell shell = parent.getShell();
				final String selection = openFileDialog(shell, "Select Hardware Model", "*.amxmi; *.amxmi-hw",
						PerformMappingGUI.this.workingDirectory);
				if (selection != null) {
					PerformMappingGUI.this.textHWModelFile.setText(selection);
				}
			}
		});
		btwSearchHWModel.setText("Search");

		return parent;
	}

	String openFileDialog(final Shell shell, final String text, final String extension, final String filterPath) {
		final FileDialog fileDialog = new FileDialog(shell);
		fileDialog.setText(text);
		fileDialog.setFilterExtensions(new String[] { extension });
		fileDialog.setFilterNames(new String[] { "(" + extension + ")" });
		fileDialog.setFilterPath(filterPath);
		try {
			final String selected = fileDialog.open();
			return selected;
		}
		catch (final Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		final GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 3;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.CENTER;

		parent.setLayoutData(gridData);
		// Create OK / CreateMapping button
		createButton(parent, OK, "Create Mapping", true);

		// Create Cancel button
		createButton(parent, CANCEL, "Cancel", false);
	}

	boolean isValidInput() {
		boolean valid = true;
		if (this.textProjectName.getText().length() == 0) {
			setErrorMessage("Please enter a valid Project Name.");
			valid = false;
		}
		if (this.textSWModelFile.getText().length() == 0) {
			setErrorMessage("Please select a valid SW Model.");
			valid = false;
		}
		if (this.textHWModelFile.getText().length() == 0) {
			setErrorMessage("Please select a valid HW Model.");
			valid = false;
		}
		// if (this.textOutputLocation.getText().length() == 0) {
		// setErrorMessage("Please select a valid Output location.");
		// valid = false;
		// }
		return valid;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// Coyy textFields because the UI gets disposed
	// and the Text Fields are not accessible any more.
	private void saveInput() {
		setNameOfCompilation(this.textProjectName.getText());
		setPathToSWModel(this.textSWModelFile.getText());
		setPathToHWModel(this.textHWModelFile.getText());
	}

	@Override
	protected void okPressed() {
		if (isValidInput()) {
			saveInput();
			super.okPressed();
		}
	}

	public String getWorkingDirectory() {
		return this.workingDirectory;
	}

	public void setWorkingDirectory(final String workingDirectory) {
		this.workingDirectory = workingDirectory;
	}

	public String getNameOfCompilation() {
		return this.nameOfCompilation;
	}

	public void setNameOfCompilation(final String nameOfCompilation) {
		this.nameOfCompilation = nameOfCompilation;
	}

	public String getPathToSWModel() {
		return this.pathToSWModel;
	}

	public void setPathToSWModel(final String pathToSWModel) {
		this.pathToSWModel = pathToSWModel;
	}

	public String getPathToHWModel() {
		return this.pathToHWModel;
	}

	public void setPathToHWModel(final String pathToHWModel) {
		this.pathToHWModel = pathToHWModel;
	}

	public void setProjectName(final String projectName) {
		this.initName = projectName;
	}

	public void setInitSWModel(final String pathToSWModel) {
		this.initSWModel = pathToSWModel;
	}
}
