package org.eclipse.app4mc.amalthea.export.osek.handlers;

import org.eclipse.jface.dialogs.IMessageProvider;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class TextWindow extends TitleAreaDialog {

	private Text textInput;
	private String input;

	public TextWindow(final Shell parentShell) {
		super(parentShell);
	}

	@Override
	public void create() {
		super.create();
		// Set the title
		setTitle("Mapping model required!");
		// Set the message
		setMessage("Please select the mapping model!", IMessageProvider.INFORMATION);
	}

	@Override
	protected Control createDialogArea(final Composite parent) {
		final GridLayout layout = new GridLayout();
		// Number of Colums for the Dialog
		final Composite area = (Composite) super.createDialogArea(parent);
		final Composite container = new Composite(area, SWT.NONE);
		container.setLayout(new GridLayout(3, false));
		container.setLayoutData(new GridData(GridData.FILL_BOTH));

		layout.numColumns = 1;
		parent.setLayout(layout);


		final GridData gridData = new GridData();
		gridData.grabExcessHorizontalSpace = true;
		gridData.horizontalAlignment = GridData.FILL;

		final Label label1 = new Label(parent, SWT.NONE);
		label1.setText("Mapping model file:");

		this.textInput = new Text(parent, SWT.BORDER);
		this.textInput.setLayoutData(gridData);

		return parent;
	}

	@Override
	protected Point getInitialSize() {
		return new Point(300, 200);
	}

	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		final GridData gridData = new GridData();
		gridData.verticalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;
		gridData.grabExcessHorizontalSpace = true;
		gridData.grabExcessVerticalSpace = true;
		gridData.horizontalAlignment = SWT.CENTER;

		parent.setLayoutData(gridData);
		// Create OK button
		// Own method as we need to overview the SelectionAdapter
		createOkButton(parent, OK, "Save", true);
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
		if (this.textInput.getText().length() == 0) {
			setErrorMessage("Please select mapping file!");
			valid = false;
		}
		return valid;
	}

	@Override
	protected boolean isResizable() {
		return false;
	}

	// Coyy textFields because the UI gets disposed
	// and the Text Fields are not accessible any more.
	private void saveInput() {
		this.input = this.textInput.getText();
	}

	@Override
	protected void okPressed() {
		saveInput();
		super.okPressed();
	}

	public String getInput() {
		return this.input;
	}
}
