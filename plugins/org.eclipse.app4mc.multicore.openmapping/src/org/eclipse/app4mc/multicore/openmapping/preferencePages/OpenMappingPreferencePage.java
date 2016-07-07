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
package org.eclipse.app4mc.multicore.openmapping.preferencePages;

import org.eclipse.app4mc.multicore.openmapping.IOpenMappingConstants;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class OpenMappingPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	private Button checkEnableLogCon;
	private Button radioOutputDefault; // ./output/ in current project
	private Button radioOutputRel; // relative path (project root)
	private Button radioOutputAbs; // absolute path
	private Button btnSelectOutput; // Open directory dialog to specify output
	// path
	private Text txtOutputLocation; // Textfield for custom output location
	// string
	private Label lOptionalOutputs; // Opt. Outputs
	private Button checkGenerateMPS; // Generate MPS output file
	private Label lMaxGap; // Max. Gap
	private Label lMaxItAbort; // Max. Iterations for Abort
	private Label lMaxItSuffice; // Max. Iterations for Abort after an feasible
	// solution has been found
	private Label lMaxTimeAbort; // Max Time for Abort
	private Label lMaxTimeSuffice; // Max Time for Abort after an feasible
	// solution has been found
	private Text txtMaxGap; // Max. Gap
	private Text txtMaxItAbort;
	private Text txtMaxItSuffice;
	private Text txtMaxTimeAbort;
	private Text txtMaxTimeSuffice;
	private Label lGapHint;
	private Label lSolverHint;
	private Button radioAlgorithm1; // DFG Load Balancing
	private Button radioAlgorithm2; // ILP Load Balancing
	private Button radioAlgorithm3; // Energy efficient mapping
	private Button radioAlgorithm4; // GA Load Balancing

	public OpenMappingPreferencePage() {
		super();
	}

	public OpenMappingPreferencePage(final String title) {
		super(title);
	}

	public OpenMappingPreferencePage(final String title, final ImageDescriptor image) {
		super(title, image);
	}

	@Override
	public void init(final IWorkbench workbench) {
		setPreferenceStore(OpenMappingPlugin.getDefault().getPreferenceStore());
	}

	@Override
	protected Control createContents(final Composite parent) {
		final GridLayout layout = new GridLayout(1, false);
		final GridLayout layout2row = new GridLayout(2, false);

		// first group, preferences w.r.t. logging
		final Group groupLog = new Group(parent, SWT.SHADOW_ETCHED_IN);
		groupLog.setText("Logging");
		// fill the cell horizontally and fit to the remaining horizontal space.
		groupLog.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		groupLog.setLayout(layout);

		// Checkbox: Enable logging
		this.checkEnableLogCon = new Button(groupLog, SWT.CHECK);
		this.checkEnableLogCon.setText("Enable verbose logging to console");

		// second group, selection of output location
		final Group groupOutput = new Group(parent, SWT.SHADOW_ETCHED_IN);
		groupOutput.setText("Select output location");
		groupOutput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		groupOutput.setLayout(layout);

		// Default output location (./output/ in project root)
		this.radioOutputDefault = new Button(groupOutput, SWT.RADIO);
		this.radioOutputDefault.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				getTextOutputLocation().setEnabled(false);
				getBtnOutputLocation().setEnabled(false);
			}
		});
		this.radioOutputDefault.setText("Default location ({ProjectRoot}/output/)");
		// Custom location (relative path)
		this.radioOutputRel = new Button(groupOutput, SWT.RADIO);
		this.radioOutputRel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				getTextOutputLocation().setEnabled(true);
				getBtnOutputLocation().setEnabled(false);
			}
		});
		this.radioOutputRel.setText("Custom location (relative to project root)");
		// Custom location (absolute path)
		this.radioOutputAbs = new Button(groupOutput, SWT.RADIO);
		this.radioOutputAbs.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				getTextOutputLocation().setEnabled(true);
				getBtnOutputLocation().setEnabled(true);
			}
		});
		this.radioOutputAbs.setText("Custom location (absolute path)");
		// Textfield for custom output location, will grow with dialog
		this.txtOutputLocation = new Text(groupOutput, SWT.BORDER);
		this.txtOutputLocation.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		// Output selection
		this.btnSelectOutput = new Button(groupOutput, SWT.NONE);
		this.btnSelectOutput.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				final Shell shell = parent.getShell();
				final DirectoryDialog dirDialog = new DirectoryDialog(shell);
				dirDialog.setText("Select the output directory");
				// dirDialog.setFilterPath(PerformMappingGUI.this.workingDirectory);
				final String sOutputLocation = dirDialog.open();
				if (sOutputLocation != null) {
					getTextOutputLocation().setText(sOutputLocation);
				}
			}
		});
		this.btnSelectOutput.setText("Select");


		// third group, selection of algorithm
		final Group groupAlgorithm = new Group(parent, SWT.SHADOW_ETCHED_IN);
		groupAlgorithm.setText("Select mapping algorithm");
		groupAlgorithm.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		groupAlgorithm.setLayout(layout);

		// Load balancing for DFG based software models
		this.radioAlgorithm1 = new Button(groupAlgorithm, SWT.RADIO);
		this.radioAlgorithm1.setText("Load balancing for DFG");
		// ILP based load balancing
		this.radioAlgorithm2 = new Button(groupAlgorithm, SWT.RADIO);
		this.radioAlgorithm2.setText("ILP based load balancing");
		// Energy efficient mapping
		this.radioAlgorithm3 = new Button(groupAlgorithm, SWT.RADIO);
		this.radioAlgorithm3.setText("Energy efficient mapping (Experimental!)");
		// Energy efficient mapping
		this.radioAlgorithm4 = new Button(groupAlgorithm, SWT.RADIO);
		this.radioAlgorithm4.setText("GA based load balancing");

		// fourth group, solver settings
		final Group groupSolverSettings = new Group(parent, SWT.SHADOW_ETCHED_IN);
		groupSolverSettings.setText("Solver Settings");
		groupSolverSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		groupSolverSettings.setLayout(layout2row);

		this.lOptionalOutputs = new Label(groupSolverSettings, SWT.NULL);
		this.lOptionalOutputs.setText("Optional outputs");
		this.checkGenerateMPS = new Button(groupSolverSettings, SWT.CHECK);
		this.checkGenerateMPS.setText("Generate MPS file of ILP problem");
		this.lMaxGap = new Label(groupSolverSettings, SWT.NULL);
		this.lMaxGap.setText("Max. Gap");
		this.txtMaxGap = new Text(groupSolverSettings, SWT.BORDER);
		this.txtMaxGap.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Label(groupSolverSettings, SWT.NULL); // Placeholder
		this.lGapHint = new Label(groupSolverSettings, SWT.NONE);
		this.lGapHint.setText("Valid values: 0.0 (best accuracy) - 1.0 (worst accuracy)");
		this.lMaxItAbort = new Label(groupSolverSettings, SWT.NULL);
		this.lMaxItAbort.setText("Max. Iterations (Abort)");
		this.txtMaxItAbort = new Text(groupSolverSettings, SWT.BORDER);
		this.txtMaxItAbort.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.lMaxTimeAbort = new Label(groupSolverSettings, SWT.NULL);
		this.lMaxTimeAbort.setText("Max. Time (Abort)");
		this.txtMaxTimeAbort = new Text(groupSolverSettings, SWT.BORDER);
		this.txtMaxTimeAbort.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.lMaxItSuffice = new Label(groupSolverSettings, SWT.NULL);
		this.lMaxItSuffice.setText("Max. Iterations (Suffice)");
		this.txtMaxItSuffice = new Text(groupSolverSettings, SWT.BORDER);
		this.txtMaxItSuffice.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.lMaxTimeSuffice = new Label(groupSolverSettings, SWT.NULL);
		this.lMaxTimeSuffice.setText("Max. Time (Suffice)");
		this.txtMaxTimeSuffice = new Text(groupSolverSettings, SWT.BORDER);
		this.txtMaxTimeSuffice.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		new Label(groupSolverSettings, SWT.NULL); // Placeholder
		this.lSolverHint = new Label(groupSolverSettings, SWT.NONE);
		this.lSolverHint.setText("Hint: Entering 0 will disable the constraint (i.e. set the value to INT_MAX).");

		initValues();

		return parent;
	}

	@Override
	protected void performDefaults() {
		super.performDefaults();
		initDefaults();
	}

	@Override
	public boolean performOk() {
		return storePreferences();
	}

	private boolean storePreferences() {
		boolean success = true;
		final IPreferenceStore store = getPreferenceStore();

		// Checkbox for Logging
		store.setValue(IOpenMappingConstants.PRE_CHECK_LOGCON, this.checkEnableLogCon.getSelection());

		// Output location
		int d = 0;
		if (this.radioOutputDefault.getSelection()) {
			d = 0; // Default
		}
		else if (this.radioOutputRel.getSelection()) {
			d = 1; // Relative
		}
		else if (this.radioOutputAbs.getSelection()) {
			d = 2; // Absolute
		}
		store.setValue(IOpenMappingConstants.PRE_RADIO_OUTDIR, d);
		store.setValue(IOpenMappingConstants.PRE_STRING_OUTDIR, this.txtOutputLocation.getText());

		// Mapping algorithms
		int c = 0;
		if (this.radioAlgorithm1.getSelection()) {
			c = 0;
		}
		else if (this.radioAlgorithm2.getSelection()) {
			c = 1;
		}
		else if (this.radioAlgorithm3.getSelection()) {
			c = 2;
		}
		else if (this.radioAlgorithm4.getSelection()) {
			c = 3;
		}

		store.setValue(IOpenMappingConstants.PRE_RADIO_ALG, c);

		// Solver Settings
		store.setValue(IOpenMappingConstants.PRE_CHECK_GENERATE_MPS, this.checkGenerateMPS.getSelection());
		try {
			final double fMaxGap = Double.parseDouble(this.txtMaxGap.getText());
			final int iMaxItAbort = Integer.parseInt(this.txtMaxItAbort.getText());
			final int iMaxTimeAbort = Integer.parseInt(this.txtMaxTimeAbort.getText());
			final int iMaxItSuffice = Integer.parseInt(this.txtMaxItSuffice.getText());
			final int iMaxTimeSuffice = Integer.parseInt(this.txtMaxTimeSuffice.getText());
			if (fMaxGap < 0 || fMaxGap > 1) {
				throw new NumberFormatException("Max. Gap must have a double value between 0.0 and 1.0");
			}

			if (iMaxItAbort < 0 || iMaxTimeAbort < 0 || iMaxItSuffice < 0 || iMaxTimeSuffice < 0) {
				throw new NumberFormatException("Max. Iterations and Max. Time must have values between 0 and "
						+ Integer.MAX_VALUE);
			}

			store.setValue(IOpenMappingConstants.PRE_MAX_GAP, fMaxGap);
			store.setValue(IOpenMappingConstants.PRE_MAX_IT_ABORT, iMaxItAbort);
			store.setValue(IOpenMappingConstants.PRE_MAX_TIME_ABORT, iMaxTimeAbort);
			store.setValue(IOpenMappingConstants.PRE_MAX_IT_SUFFICE, iMaxItSuffice);
			store.setValue(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE, iMaxTimeSuffice);
		}
		catch (final NumberFormatException e) {
			success = false;
			MessageDialog.openError(getShell(), "Error",
					"Incorrect values in Solver Settings section:\n" + e.getMessage());
		}
		return success;
	}

	private void initDefaults() {
		final IPreferenceStore store = getPreferenceStore();
		// Checkbox for Logging
		this.checkEnableLogCon.setSelection(store.getDefaultBoolean(IOpenMappingConstants.PRE_CHECK_LOGCON));

		// Output location
		this.radioOutputDefault.setSelection(false);
		this.radioOutputRel.setSelection(false);
		this.radioOutputAbs.setSelection(false);
		final int radioOutputChoice = store.getDefaultInt(IOpenMappingConstants.PRE_RADIO_OUTDIR);
		switch (radioOutputChoice) {
		case 0:
			this.radioOutputDefault.setSelection(true);
			this.txtOutputLocation.setEnabled(false);
			this.btnSelectOutput.setEnabled(false);
			break;
		case 1:
			this.radioOutputRel.setSelection(true);
			this.txtOutputLocation.setEnabled(true);
			this.btnSelectOutput.setEnabled(false);
			break;
		case 2:
			this.radioOutputAbs.setSelection(true);
			this.txtOutputLocation.setEnabled(true);
			this.btnSelectOutput.setEnabled(true);
			break;
		default:
			break;
		}
		this.txtOutputLocation.setText(store.getDefaultString(IOpenMappingConstants.PRE_STRING_OUTDIR));

		// Mapping algorithms
		this.radioAlgorithm1.setSelection(false);
		this.radioAlgorithm2.setSelection(false);
		this.radioAlgorithm3.setSelection(false);
		this.radioAlgorithm4.setSelection(false);
		final int radioAlgorithmChoice = store.getDefaultInt(IOpenMappingConstants.PRE_RADIO_ALG);
		switch (radioAlgorithmChoice) {
		case 0:
			this.radioAlgorithm1.setSelection(true);
			break;
		case 1:
			this.radioAlgorithm2.setSelection(true);
			break;
		case 2:
			this.radioAlgorithm3.setSelection(true);
			break;
		case 3:
			this.radioAlgorithm4.setSelection(true);
			break;
		default:
			break;
		}

		// Solver Settings
		this.checkGenerateMPS.setSelection(store.getDefaultBoolean(IOpenMappingConstants.PRE_CHECK_GENERATE_MPS));
		this.txtMaxGap.setText("" + store.getDefaultDouble(IOpenMappingConstants.PRE_MAX_GAP));
		this.txtMaxItAbort.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_IT_ABORT));
		this.txtMaxTimeAbort.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_TIME_ABORT));
		this.txtMaxItSuffice.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_IT_SUFFICE));
		this.txtMaxTimeSuffice.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE));
	}

	private void initValues() {
		final IPreferenceStore store = getPreferenceStore();
		// checkboxes
		this.checkEnableLogCon.setSelection(store.getBoolean(IOpenMappingConstants.PRE_CHECK_LOGCON));

		// output location
		this.radioOutputDefault.setSelection(false);
		this.radioOutputRel.setSelection(false);
		this.radioOutputAbs.setSelection(false);
		final int radioOutputChoice = store.getInt(IOpenMappingConstants.PRE_RADIO_OUTDIR);
		switch (radioOutputChoice) {
		case 0:
			this.radioOutputDefault.setSelection(true);
			this.txtOutputLocation.setEnabled(false);
			this.btnSelectOutput.setEnabled(false);
			break;
		case 1:
			this.radioOutputRel.setSelection(true);
			this.txtOutputLocation.setEnabled(true);
			this.btnSelectOutput.setEnabled(false);
			break;
		case 2:
			this.radioOutputAbs.setSelection(true);
			this.txtOutputLocation.setEnabled(true);
			this.btnSelectOutput.setEnabled(true);
			break;
		default:
			break;
		}
		this.txtOutputLocation.setText(store.getString(IOpenMappingConstants.PRE_STRING_OUTDIR));

		// radio buttons
		final int radioAlgorithmChoice = store.getInt(IOpenMappingConstants.PRE_RADIO_ALG);
		switch (radioAlgorithmChoice) {
		case 0:
			this.radioAlgorithm1.setSelection(true);
			break;
		case 1:
			this.radioAlgorithm2.setSelection(true);
			break;
		case 2:
			this.radioAlgorithm3.setSelection(true);
			break;
		case 3:
			this.radioAlgorithm4.setSelection(true);
			break;
		default:
			break;
		}
		// Solver Settings
		this.checkGenerateMPS.setSelection(store.getBoolean(IOpenMappingConstants.PRE_CHECK_GENERATE_MPS));
		this.txtMaxGap.setText("" + store.getDouble(IOpenMappingConstants.PRE_MAX_GAP));
		this.txtMaxItAbort.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_IT_ABORT));
		this.txtMaxTimeAbort.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_TIME_ABORT));
		this.txtMaxItSuffice.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_IT_SUFFICE));
		this.txtMaxTimeSuffice.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE));
	}

	public Text getTextOutputLocation() {
		return this.txtOutputLocation;
	}

	public Button getBtnOutputLocation() {
		return this.btnSelectOutput;
	}
}
