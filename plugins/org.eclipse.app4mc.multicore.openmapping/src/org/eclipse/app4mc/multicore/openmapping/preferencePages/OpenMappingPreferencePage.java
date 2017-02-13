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
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;

public class OpenMappingPreferencePage extends PreferencePage implements IWorkbenchPreferencePage {
	/**
	 * Enable logging console
	 */
	private Button checkEnableLogCon;
	/**
	 * Use default output radio button
	 */
	private Button radioOutputDefault; // 
	/**
	 * Relative path (project root) radio button
	 */
	private Button radioOutputRel;
	/**
	 * Absolute path radio button 
	 */
	private Button radioOutputAbs;
	/**
	 * Open directory dialog to specify output
	 */
	private Button btnSelectOutput;
	/**
	 * Text input for custom output location
	 */
	private Text txtOutputLocation;
	/**
	 * Optional outputs 
	 */
	private Label lOptionalOutputs;
	/**
	 * Generate MPS output file
	 */
	private Button checkGenerateMPS;
	/**
	 * Max. Gap label
	 */
	private Label lMaxGap;
	/**
	 * Max. Iterations for Abort label
	 */
	private Label lMaxItAbort;
	/**
	 * Max. Iterations for Abort after an feasible label
	 */
	private Label lMaxItSuffice;
	/**
	 * Max Time for Abort label
	 */
	private Label lMaxTimeAbort;
	/**
	 * Max Time for Abort after an feasible label
	 */
	private Label lMaxTimeSuffice; 
	/**
	 * Max. Gap input
	 */
	private Text txtMaxGap;
	/**
	 * Max. Iterations for Abort input
	 */
	private Text txtMaxItAbort;
	/**
	 * Max. Iterations for Abort after an feasible input
	 */
	private Text txtMaxItSuffice;
	/**
	 * Max Time for Abort input
	 */
	private Text txtMaxTimeAbort;
	/**
	 * Max Time for Abort after an feasible input
	 */
	private Text txtMaxTimeSuffice;
	/**
	 * Gap Hing label
	 */
	private Label lGapHint;
	/**
	 * Solver Hint label
	 */
	private Label lSolverHint;
	/**
	 * Select Mapping algorithm dropdown
	 */
	private Combo dropDownAlgorithm; 

	/**
	 * Constructor
	 */
	public OpenMappingPreferencePage() {
		super();
	}

	/**
	 * Constructor
	 * @param title title of the preference page
	 */
	public OpenMappingPreferencePage(final String title) {
		super(title);
	}

	/**
	 * Constructor
	 * @param title title of the preference page
	 * @param image image of the preference page
	 */
	public OpenMappingPreferencePage(final String title, final ImageDescriptor image) {
		super(title, image);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IWorkbenchPreferencePage#init(org.eclipse.ui.IWorkbench)
	 */
	@Override
	public void init(final IWorkbench workbench) {
		setPreferenceStore(OpenMappingPlugin.getDefault().getPreferenceStore());
	}

	/**
	 * Verify if solver settings should be visible or not
	 * @param mapAlg index of the selected mapping algorithm
	 * @return true if the solver settings should be visible and false otherwise
	 */
	private boolean checkSolverSettingsVisibility(int mapAlg) {
		
		switch (mapAlg) {
			case 1: // "ILP based load balancing"
			case 2: // "Energy efficient mapping (Experimental!)"
				return true;	
			default:
				return false;
		}
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#createContents(org.eclipse.swt.widgets.Composite)
	 */
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
		
		
		// Mapping Algorithms dropdown
		this.dropDownAlgorithm =  new Combo(groupAlgorithm, SWT.DROP_DOWN | SWT.BORDER);
		final String[] options = {"Load balancing for DFG", 
								  "ILP based load balancing",
								  "Energy efficient mapping (Experimental!)",
								  "GA based load balancing",
								  "GA based load balancing with constraints optimization"};
		
		this.dropDownAlgorithm.setItems(options);
		
		// fourth group, solver settings
		final Group groupSolverSettings = new Group(parent, SWT.SHADOW_ETCHED_IN);
		groupSolverSettings.setText("Solver Settings");
		groupSolverSettings.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		groupSolverSettings.setLayout(layout2row);
		groupSolverSettings.setVisible(false);

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

		
		this.dropDownAlgorithm.addSelectionListener(new SelectionListener()
	    {

			@Override
			public void widgetDefaultSelected(SelectionEvent arg0) {
				groupSolverSettings.setVisible(checkSolverSettingsVisibility(dropDownAlgorithm.getSelectionIndex()));
			}

			@Override
			public void widgetSelected(SelectionEvent arg0) {
				groupSolverSettings.setVisible(checkSolverSettingsVisibility(dropDownAlgorithm.getSelectionIndex()));
			}
	    });
		
		initValues();

		return parent;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		super.performDefaults();
		initDefaults();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jface.preference.PreferencePage#performOk()
	 */
	@Override
	public boolean performOk() {
		return storePreferences();
	}

	/**
	 * Store preferences into registry
	 * @return true if stored correctly false otherwise
	 */
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

		store.setValue(IOpenMappingConstants.PRE_RADIO_ALG, this.dropDownAlgorithm.getSelectionIndex());

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

	/**
	 * Initialize default values
	 */
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
		final int mappingAlgorithmChoice = store.getDefaultInt(IOpenMappingConstants.PRE_RADIO_ALG);		
		this.dropDownAlgorithm.select(mappingAlgorithmChoice);
		this.dropDownAlgorithm.notifyListeners(SWT.Selection, new Event());

		// Solver Settings
		this.checkGenerateMPS.setSelection(store.getDefaultBoolean(IOpenMappingConstants.PRE_CHECK_GENERATE_MPS));
		this.txtMaxGap.setText("" + store.getDefaultDouble(IOpenMappingConstants.PRE_MAX_GAP));
		this.txtMaxItAbort.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_IT_ABORT));
		this.txtMaxTimeAbort.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_TIME_ABORT));
		this.txtMaxItSuffice.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_IT_SUFFICE));
		this.txtMaxTimeSuffice.setText("" + store.getDefaultInt(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE));
	}

	/**
	 * Load preferences from registry
	 */
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
		final int mappingAlgorithmChoice = store.getInt(IOpenMappingConstants.PRE_RADIO_ALG);
		this.dropDownAlgorithm.select(mappingAlgorithmChoice);
		this.dropDownAlgorithm.notifyListeners(SWT.Selection, new Event());

		// Solver Settings
		this.checkGenerateMPS.setSelection(store.getBoolean(IOpenMappingConstants.PRE_CHECK_GENERATE_MPS));
		this.txtMaxGap.setText("" + store.getDouble(IOpenMappingConstants.PRE_MAX_GAP));
		this.txtMaxItAbort.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_IT_ABORT));
		this.txtMaxTimeAbort.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_TIME_ABORT));
		this.txtMaxItSuffice.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_IT_SUFFICE));
		this.txtMaxTimeSuffice.setText("" + store.getInt(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE));
	}

	/**
	 * Obtain the output location as Text
	 * @return output location
	 */
	public Text getTextOutputLocation() {
		return this.txtOutputLocation;
	}

	/**
	 * Obtain the output location button
	 * @return output location button
	 */
	public Button getBtnOutputLocation() {
		return this.btnSelectOutput;
	}
}
