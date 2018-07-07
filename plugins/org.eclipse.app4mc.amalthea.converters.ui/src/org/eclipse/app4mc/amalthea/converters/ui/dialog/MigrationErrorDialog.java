/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.converters.ui.providers.MigrationVersionErrorDataProvider;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationInputFile;
import org.eclipse.app4mc.amalthea.converters.ui.utils.MigrationSettings;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.CellLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class MigrationErrorDialog extends Dialog {


	private final MigrationSettings migrationSettings;
	private Table table;

	public MigrationErrorDialog(final Shell parentShell, final MigrationSettings migrationSettings) {
		super(parentShell);
		this.migrationSettings = migrationSettings;
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

		final Composite parentComposite = (Composite) super.createDialogArea(parent);
		final GridLayout gridLayout = (GridLayout) parentComposite.getLayout();
		gridLayout.numColumns = 1;


		final Composite composite__1 = new Composite(parentComposite, SWT.NONE);
		composite__1.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite__1.setLayout(new GridLayout(1, false));

		final Label lblModelMigrationIs = new Label(composite__1, SWT.NONE);
		lblModelMigrationIs.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
		// lblModelMigrationIs
		// .setImage(ResourceManager.getPluginImage("org.eclipse.pde.ui", "/icons/obj16/error_st_obj.png"));
		lblModelMigrationIs.setText("Model migration stopped as selected model files belong to different versions");

		final Composite composite__2 = new Composite(parentComposite, SWT.NONE);

		composite__2.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 1, 1));
		composite__2.setLayout(new GridLayout(1, false));

		final TableViewer tableViewer = new TableViewer(composite__2,
				SWT.BORDER | SWT.FULL_SELECTION | SWT.H_SCROLL | SWT.V_SCROLL);
		tableViewer.setColumnProperties(new String[] { "File Name", "Model Version" });

		final TableViewerColumn tableColumn_0 = createTableViewerColumn(tableViewer, "File Name", 250);
		tableColumn_0.setLabelProvider(new CellLabelProvider() {

			@Override
			public void update(final ViewerCell cell) {
				final Object element = cell.getElement();

				if (element instanceof MigrationInputFile) {
					if (((MigrationInputFile) element).isVersionDifferent()) {
						cell.setForeground(new Color(Display.getCurrent(), 255, 0, 0));
					}

				}
			}
		});
		createTableViewerColumn(tableViewer, "Model Version", 112);


		tableViewer.getTable().addControlListener(new ControlAdapter() {
			@Override
			public void controlResized(final ControlEvent e) {
				final TableColumn[] columns = tableViewer.getTable().getColumns();
				final int columnWidth = tableViewer.getTable().getClientArea().width / columns.length;
				for (int index = 0; index < columns.length; index++) {
					columns[index].setWidth(columnWidth);
				}
			}
		});

		final MigrationVersionErrorDataProvider dataProvider = new MigrationVersionErrorDataProvider();
		tableViewer.setContentProvider(dataProvider);
		tableViewer.setLabelProvider(dataProvider);
		tableViewer.setInput(this.migrationSettings.getMigModelFiles());

		this.table = tableViewer.getTable();
		this.table.setLinesVisible(true);
		this.table.setHeaderVisible(true);
		final GridData gd_table = new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1);
		gd_table.heightHint = 98;
		gd_table.verticalSpan = 2;
		gd_table.widthHint = 362;
		this.table.setLayoutData(gd_table);

		final Composite composite__3 = new Composite(parentComposite, SWT.NONE);
		composite__3.setLayout(new FormLayout());
		final GridData gd_composite_3 = new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1);
		// gd_composite_3.heightHint = 100;
		gd_composite_3.widthHint = 407;
		gd_composite_3.verticalSpan = 2;
		composite__3.setLayoutData(gd_composite_3);

		return parentComposite;

	}

	@Override
	protected Control createButtonBar(final Composite parent) {
		// TODO mez2rng Auto-generated method stub
		return super.createButtonBar(parent);
	}


	private TableViewerColumn createTableViewerColumn(final TableViewer tableViewer, final String title,
			final int bound) {
		final TableViewerColumn viewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		final TableColumn column = viewerColumn.getColumn();
		column.setText(title);
		column.setWidth(bound);
		column.setResizable(true);
		column.setMoveable(true);
		return viewerColumn;
	}

	public MigrationSettings getMigrationSettings() {
		return this.migrationSettings;
	}


}
