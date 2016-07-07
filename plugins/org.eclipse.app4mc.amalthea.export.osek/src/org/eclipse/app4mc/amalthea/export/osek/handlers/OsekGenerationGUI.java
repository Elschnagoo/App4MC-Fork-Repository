package org.eclipse.app4mc.amalthea.export.osek.handlers;

import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.resource.JFaceResources;
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

public class OsekGenerationGUI extends TitleAreaDialog {
	String workingDirectory;
	private String initName;

	private String nameOfCompilation;
	private String pathToMappingModel;
	private String pathToOutput;

	private Text textProjectName;
	Text textMappingModelFile;

	public OsekGenerationGUI(final Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		setTitle("OSEK Files");
	}

	@Override
	protected Point getInitialSize() {
		return new Point(600, 250);
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


		final Label label3 = new Label(parent, SWT.NONE);
		label3.setText("Path to Mapping Model (*.amxmi; *.amxmi-mapping)");
		this.textMappingModelFile = new Text(parent, SWT.BORDER);
		this.textMappingModelFile.setLayoutData(gridData);

		final Button btwSearchMappingModel = new Button(parent, SWT.NONE);
		btwSearchMappingModel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {

				final Shell shell = parent.getShell();
				// File standard dialog
				final FileDialog fileDialog = new FileDialog(shell);
				// Set the text
				fileDialog.setText("Select Mapping Model");
				// Set filter on .amxmi files
				// TODO Important: *-mapping.amxmi is not a valid ending! It
				// wont be supported on Macs
				fileDialog.setFilterExtensions(new String[] { "*.amxmi; *.amxmi-mapping" });
				// Put in a readable name for the filter
				fileDialog.setFilterNames(new String[] { "(*.amxmi; *.amxmi-mapping)" });
				fileDialog.setFilterPath(OsekGenerationGUI.this.workingDirectory);
				// Open Dialog and save result of selection
				final String selected = fileDialog.open();
				// System.out.println(selected);
				OsekGenerationGUI.this.textMappingModelFile.setText(selected);
			}
		});
		btwSearchMappingModel.setText("Search");
		return parent;
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
		// Create OK button
		// Own method as we need to overview the SelectionAdapter
		createOkButton(parent, OK, "Generate OSEK-Files", true);
		// Add a SelectionListener

		// Create Cancel button
		final Button cancelButton = createButton(parent, CANCEL, "Cancel", false);
		// Add a SelectionListener
		cancelButton.addSelectionListener(new SelectionAdapter() {
			@SuppressWarnings("synthetic-access")
			@Override
			public void widgetSelected(final SelectionEvent e) {
				setReturnCode(CANCEL);
				close();
			}
		});
	}

	protected Button createOkButton(final Composite parent, final int id, final String label,
			final boolean defaultButton) {
		// increment the number of columns in the button bar
		((GridLayout) parent.getLayout()).numColumns++;
		final Button button = new Button(parent, SWT.PUSH);
		button.setText(label);
		button.setFont(JFaceResources.getDialogFont());
		button.setData(new Integer(id));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent event) {
				if (isValidInput()) {
					okPressed();
				}
			}
		});
		if (defaultButton) {
			final Shell shell = parent.getShell();
			if (shell != null) {
				shell.setDefaultButton(button);
			}
		}
		setButtonLayoutData(button);
		return button;
	}

	boolean isValidInput() {
		boolean valid = true;
		if (this.textProjectName.getText().length() == 0) {
			setErrorMessage("Please enter a valid Project Name.");
			valid = false;
		}
		if (this.textMappingModelFile.getText().length() == 0) {
			setErrorMessage("Please select a valid Mapping Model.");
			valid = false;
		}
		return valid;
	}

	@Override
	protected boolean isResizable() {
		return true;
	}

	// Coyy textFields because the UI gets disposed
	// and the Text Fields are not accessible any more.
	private void saveInput() {
		setPathToMappingModel(this.textMappingModelFile.getText());
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
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

	public String getPathToMappingModel() {
		return this.pathToMappingModel;
	}

	public void setPathToMappingModel(final String pathToMappingModel) {
		this.pathToMappingModel = pathToMappingModel;
	}

	public String getPathToOutput() {
		return this.pathToOutput;
	}

	public void setPathToOutput(final String pathToOutput) {
		this.pathToOutput = pathToOutput;
	}

	public void setProjectName(final String projectName) {
		this.initName = projectName;
	}
}
