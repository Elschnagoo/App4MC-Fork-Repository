/**
 ********************************************************************************
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters.ui.dialog;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.ui.jobs.IMigrationJobConstants;
import org.eclipse.app4mc.amalthea.converters.ui.providers.MigrationInputDataProvider;
import org.eclipse.app4mc.amalthea.converters.ui.providers.StyledLabelProvider;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationSettings;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ModelMigrationDelegator;
import org.eclipse.app4mc.amalthea.converters.ui.utils.ModelVersions;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.PojoProperties;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.jface.databinding.swt.ISWTObservableValue;
import org.eclipse.jface.databinding.swt.IWidgetValueProperty;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

public class ModelMigrationDialog extends Dialog {
	private MigrationSettings migrationSettings;
	private Text txtInputModelVersion;
	private Text txtOutputDirectory;
	private TableViewer tableViewer;
	private Label lblOutputDirectory;
	private Combo mig_model_version_combo;
	private Button cancelMigrationButton;
	private Button migrateModelsButton;
	private String outputDirectoryLocation;

	final Logger logger;


	public ModelMigrationDialog(final Shell parentShell, final MigrationSettings migrationSettings) {
		super(parentShell);
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

		setMigrationSettings(migrationSettings);

		if (getMigrationSettings() == null) {
			setMigrationSettings(new MigrationSettings());
		}
	}

	@Override
	protected void configureShell(final Shell newShell) {
		super.configureShell(newShell);
		// newShell.setSize(800, 500);
		newShell.setText("AMALTHEA Model Migration");
	}

	@Override
	protected Control createDialogArea(final Composite parent) {

		parent.setToolTipText("AMALTHEA Model Migration");

		final Composite shlAmalthea = (Composite) super.createDialogArea(parent);
		final GridLayout gridLayout = (GridLayout) shlAmalthea.getLayout();
		gridLayout.numColumns = 1;
		final Group grpInitialModel = new Group(shlAmalthea, SWT.NONE);
		// gd_grpInitialModel.widthHint = 588;
		grpInitialModel.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		grpInitialModel.setText("AMALTHEA Models");
		grpInitialModel.setLayout(new GridLayout(5, false));

		this.tableViewer = new TableViewer(grpInitialModel, SWT.V_SCROLL | SWT.H_SCROLL | SWT.FULL_SELECTION);

		final Table table = this.tableViewer.getTable();
		// table.setSize(400, 100);
		// tableViewerInputModels.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		final GridData tableViewerGridData = new GridData(SWT.FILL, SWT.FILL, true, true, 5, 1);
		tableViewerGridData.widthHint = 400;
		tableViewerGridData.heightHint = 100;
		table.setLayoutData(tableViewerGridData);
		table.getHorizontalBar().setEnabled(true);

		// this.tableViewer.setColumnProperties(new String[] { "Relative file paths",
		// "Folder " });
		createTableViewerColumn(this.tableViewer, "Relative file paths");

		final MigrationInputDataProvider provider = new MigrationInputDataProvider(new StyledLabelProvider());
		this.tableViewer.setContentProvider(provider);
		this.tableViewer.setLabelProvider(provider);
		getMigrationSettings().getMigModelFiles().sort(new Comparator<MigrationInputFile>() {

			@Override
			public int compare(final MigrationInputFile o1, final MigrationInputFile o2) {
				if (o1.isSelectedFile()) {
					return -1;
				}
				return 1;
			}
		});
		this.tableViewer.setInput(getMigrationSettings().getMigModelFiles());

		table.addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				final TableColumn[] columns = table.getColumns();
				final int columnWidth = table.getClientArea().width / columns.length;
				for (int index = 0; index < columns.length; index++) {

					columns[index].setWidth(columnWidth + 200);
				}

			}
		});

		final Label lblInputModelsIdentificationInfo = new Label(grpInitialModel, SWT.NONE);
		lblInputModelsIdentificationInfo.setText("* Blue color: Selected Model files. Black color: Model scope files");
		lblInputModelsIdentificationInfo.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 5, 1));

		final Label lblModelVersion = new Label(grpInitialModel, SWT.NONE);
		lblModelVersion.setText("Model Version : ");

		this.txtInputModelVersion = new Text(grpInitialModel, SWT.BORDER);
		this.txtInputModelVersion.setEnabled(false);
		this.txtInputModelVersion.setBackground(Display.getCurrent().getSystemColor(SWT.COLOR_WHITE));
		this.txtInputModelVersion.setEditable(false);
		this.txtInputModelVersion.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));

		this.txtInputModelVersion.addModifyListener(new ModifyListener() {

			@Override
			public void modifyText(final ModifyEvent e) {

				final String version = ModelMigrationDialog.this.getTxtInputModelVersion().getText();

				if (version != null) {

					List<String> allSupportedVersions = ModelVersions.get();

					int totalVersionSize = allSupportedVersions.size();

					int startIndex = allSupportedVersions.indexOf(version);

					if (startIndex != -1) {

						List<String> subList = allSupportedVersions.subList(startIndex + 1, totalVersionSize);
						Collections.reverse(subList);
						ModelMigrationDialog.this.getMig_model_version_combo()
								.setItems(subList.toArray(new String[] {}));
						ModelMigrationDialog.this.getMig_model_version_combo().select(0);
					}

				}

			}
		});

		addEmptyLabels(grpInitialModel);

		final Group grpMigrationModels = new Group(shlAmalthea, SWT.NONE);
		grpMigrationModels.setText("Migration details");
		grpMigrationModels.setLayout(new FormLayout());
		grpMigrationModels.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 5, 1));

		final Composite mig_model_version_composite = new Composite(grpMigrationModels, SWT.NONE);
		final FormData fd_mig_model_version_composite = new FormData();
		fd_mig_model_version_composite.top = new FormAttachment(0, 16);
		fd_mig_model_version_composite.left = new FormAttachment(0, 7);
		mig_model_version_composite.setLayoutData(fd_mig_model_version_composite);

		final Label mig_model_version_text = new Label(mig_model_version_composite, SWT.NONE);
		mig_model_version_text.setBounds(0, 0, 84, 15);
		mig_model_version_text.setText("Model Version");

		this.mig_model_version_combo = new Combo(mig_model_version_composite, SWT.READ_ONLY);
		this.mig_model_version_combo.setBounds(150, 0, 91, 23);
		// this.mig_model_version_combo.setItems(new String[] { "0.7.0", "itea.111",
		// "itea.110" });
		this.mig_model_version_combo.select(0);

		final Composite mig_folder_selection_composite = new Composite(grpMigrationModels, SWT.NONE);
		final StackLayout sl_mig_folder_selection_composite = new StackLayout();
		mig_folder_selection_composite.setLayout(sl_mig_folder_selection_composite);
		final FormData fd_mig_folder_selection_composite = new FormData();
		fd_mig_folder_selection_composite.top = new FormAttachment(0, 51);
		fd_mig_folder_selection_composite.left = new FormAttachment(0, 7);
		mig_folder_selection_composite.setLayoutData(fd_mig_folder_selection_composite);

		final Composite empty_composite = new Composite(mig_folder_selection_composite, SWT.NONE);
		empty_composite.setLayout(new GridLayout(1, false));

		final Composite mig_output_directory_selection_composite = new Composite(mig_folder_selection_composite,
				SWT.NONE);

		this.lblOutputDirectory = new Label(mig_output_directory_selection_composite, SWT.NONE);
		this.lblOutputDirectory.setBounds(0, 3, 96, 15);
		this.lblOutputDirectory.setText("Output directory");

		this.txtOutputDirectory = new Text(mig_output_directory_selection_composite, SWT.BORDER);
		this.txtOutputDirectory.setEditable(false);
		this.txtOutputDirectory.setBounds(150, 0, 269, 21);
		this.txtOutputDirectory.setTouchEnabled(true);

		this.outputDirectoryLocation = this.migrationSettings.getOutputDirectoryLocation();

		final Button btnBrowse = new Button(mig_output_directory_selection_composite, SWT.NONE);
		btnBrowse.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {

				final DirectoryDialog dialog = new DirectoryDialog(e.display.getActiveShell());

				dialog.setFilterPath(getMigrationSettings().getProject().getAbsolutePath());

				final String selectedPath = dialog.open();

				if (selectedPath != null) {
					ModelMigrationDialog.this.logger
							.info(ModelMigrationDialog.this.getMigrationSettings().getOutputDirectoryLocation());

					ModelMigrationDialog.this.setOutputDirectoryLocation(selectedPath);

					// AmaltheaModelMigrationDialog.this.migDataModel.setOutputDirectoryLocation(selectedPath);

					ModelMigrationDialog.this.getTxtOutputDirectory().setText(selectedPath);

				}

			}
		});
		btnBrowse.setBounds(442, 0, 75, 25);
		btnBrowse.setText("Browse...");

		sl_mig_folder_selection_composite.topControl = mig_output_directory_selection_composite;

		mig_folder_selection_composite.layout();

		/*
		 * createButton(buttonsComposite, IDialogConstants.OK_ID,
		 * IDialogConstants.OK_LABEL, true); createButton(buttonsComposite,
		 * IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		 */

		/*- Added SWT.Modify listener to Checkbox (for selection of output model version) - this is work around for JFace databinding issue reported on MAC */
		this.mig_model_version_combo.addListener(SWT.Modify, new Listener() {

			@Override
			public void handleEvent(final Event event) {

				final String selection_outputModelVersion = ModelMigrationDialog.this.getMig_model_version_combo()
						.getText();

				if (selection_outputModelVersion != null && selection_outputModelVersion.length() > 0) {
					getMigrationSettings().setMigrationModelVersion(selection_outputModelVersion);

				}

			}
		});

		this.mig_model_version_combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {

				final String selection = ModelMigrationDialog.this.getMig_model_version_combo().getText();

				if (selection != null && selection.equals("itea.110")) {
					ModelMigrationDialog.this.getTxtOutputDirectory().setText("");
					sl_mig_folder_selection_composite.topControl = empty_composite;
					mig_folder_selection_composite.layout();

				} else {

					ModelMigrationDialog.this.getTxtOutputDirectory()
							.setText(ModelMigrationDialog.this.getOutputDirectoryLocation());

					sl_mig_folder_selection_composite.topControl = mig_output_directory_selection_composite;
					mig_folder_selection_composite.layout();

				}

			}
		});
		initDataBindings();

		return shlAmalthea;
	}

	private void addEmptyLabels(final Group grpInitialModel) {
		new Label(grpInitialModel, SWT.NONE);
		new Label(grpInitialModel, SWT.NONE);
		new Label(grpInitialModel, SWT.NONE);
	}

	private TableViewerColumn createTableViewerColumn(final TableViewer tableViewer, final String title) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setResizable(true);
		column.setMoveable(true);
		column.setWidth(1000);
		return viewerColumn;
	}

	/**
	 * Create contents of the button bar.
	 *
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(final Composite parent) {
		this.migrateModelsButton = createButton(parent, IDialogConstants.OK_ID, "Migrate Models", true);
		this.migrateModelsButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(final SelectionEvent e) {
				/*
				 * perform model migration
				 */
				ModelMigrationDelegator migrationJob = new ModelMigrationDelegator(
						ModelMigrationDialog.this.getMigrationSettings(), ModelMigrationDialog.this.logger);
				migrationJob.execute();

			}
		});
		this.cancelMigrationButton = createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL,
				false);
		this.cancelMigrationButton.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(final SelectionEvent e) {
				super.widgetSelected(e);

				Job.getJobManager().cancel(IMigrationJobConstants.FAMILY);

			}
		});
		initDataBindings();
	}

	public MigrationSettings getMigrationSettings() {
		return this.migrationSettings;
	}

	public void setMigrationSettings(final MigrationSettings migrationSettings) {
		this.migrationSettings = migrationSettings;
	}

	protected DataBindingContext initDataBindings() {
		final DataBindingContext bindingContext = new DataBindingContext();
		//
		final IWidgetValueProperty text = WidgetProperties.text(SWT.Modify);
		final ISWTObservableValue observeTextTxtInputModelVersionObserveWidget = text
				.observe(this.txtInputModelVersion);
		final ISWTObservableValue observeTextTxtOutputDirectoryObserveWidget = WidgetProperties.text(SWT.Modify)
				.observe(this.txtOutputDirectory);
		final ISWTObservableValue observeSelectionMig_model_version_comboObserveWidget = WidgetProperties.selection()
				.observe(this.mig_model_version_combo);
		//
		@SuppressWarnings("unchecked")
		final IObservableValue<?> inputModelVersionMigDataModelObserveValue = PojoProperties.value("inputModelVersion")
				.observe(getMigrationSettings());
		bindingContext.bindValue(observeTextTxtInputModelVersionObserveWidget,
				inputModelVersionMigDataModelObserveValue, null, null);
		//
		@SuppressWarnings("unchecked")
		final IObservableValue<?> outputDirectoryLocationMigDataModelObserveValue = PojoProperties
				.value("outputDirectoryLocation").observe(getMigrationSettings());
		bindingContext.bindValue(observeTextTxtOutputDirectoryObserveWidget,
				outputDirectoryLocationMigDataModelObserveValue, null, null);
		//
		@SuppressWarnings("unchecked")
		final IObservableValue<?> migrationModelVersionMigrationSettingsObserveValue = PojoProperties
				.value("migrationModelVersion").observe(this.migrationSettings);
		bindingContext.bindValue(observeSelectionMig_model_version_comboObserveWidget,
				migrationModelVersionMigrationSettingsObserveValue, null, null);

		return bindingContext;
	}

	public Combo getMig_model_version_combo() {
		return this.mig_model_version_combo;
	}

	public void setMig_model_version_combo(final Combo mig_model_version_combo) {
		this.mig_model_version_combo = mig_model_version_combo;
	}

	public String getOutputDirectoryLocation() {
		return this.outputDirectoryLocation;
	}

	public void setOutputDirectoryLocation(final String outputDirectoryLocation) {
		this.outputDirectoryLocation = outputDirectoryLocation;
	}

	public Text getTxtInputModelVersion() {
		return this.txtInputModelVersion;
	}

	public void setTxtInputModelVersion(final Text txtInputModelVersion) {
		this.txtInputModelVersion = txtInputModelVersion;
	}

	public Text getTxtOutputDirectory() {
		return this.txtOutputDirectory;
	}

	public void setTxtOutputDirectory(final Text txtOutputDirectory) {
		this.txtOutputDirectory = txtOutputDirectory;
	}

	public Label getLblOutputDirectory() {
		return this.lblOutputDirectory;
	}

	public void setLblOutputDirectory(final Label lblOutputDirectory) {
		this.lblOutputDirectory = lblOutputDirectory;
	}

	public Button getCancelMigrationButton() {
		return this.cancelMigrationButton;
	}

	public void setCancelMigrationButton(final Button cancelMigrationButton) {
		this.cancelMigrationButton = cancelMigrationButton;
	}

}
