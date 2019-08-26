/**
 ********************************************************************************
 * Copyright (c) 2019 Dortmund University of Applied Sciences and Arts and others.
 *
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.execution.ui.simmenu.wizards;

import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMCore;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMMapping;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMTask;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMUtil;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;

public class TaskVisuOverviewPage extends WizardPage {
	// private Text text1;
	private Composite container;
	@SuppressWarnings("unused")
	private TableViewer tv_allocations;
	private TableViewer tv_coreoverview;

	private final OMMapping model;

	public TaskVisuOverviewPage(OMMapping model) {
		super("Task Visualisation: Overview");
		setTitle("Task Visualisation: Overview");
		setDescription("This page gives an overview of the visualisation input.");
		this.model = model;
	}

	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 1;

		setupAllocsOverview();
		setupCoreOverview();

		// required to avoid an error in the system
		setControl(container);
		setPageComplete(true);
	}

	private void setupCoreOverview() {
		Label label1 = new Label(container, SWT.NONE);
		label1.setText("Cores");

		GridData gridData = new GridData();
		gridData.horizontalAlignment = GridData.FILL;
		gridData.horizontalSpan = 1;

		tv_coreoverview = new TableViewer(container,
				SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		final Table table = tv_coreoverview.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(gridData);

		final Map<OMCore, List<OMTask>> tmpmodel = OMUtil.getCoreTaskMap(model.getAllocationList());
		tv_coreoverview.setContentProvider(new ArrayContentProvider());
		tv_coreoverview.setInput(tmpmodel.keySet());

		TableViewerColumn colCore = new TableViewerColumn(tv_coreoverview, SWT.NONE);
		colCore.getColumn().setWidth(100);
		colCore.getColumn().setText("Core");
		colCore.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMCore core = (OMCore) element;
				return core.getCoreRef().getName();
			}
		});

		TableViewerColumn colIPs = new TableViewerColumn(tv_coreoverview, SWT.NONE);
		colIPs.getColumn().setWidth(100);
		colIPs.getColumn().setText("Freq.");
		colIPs.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMCore core = (OMCore) element;
				try {
					return "" + core.getFrequencyHz();
				} catch (MalformedModelException e) {
					e.printStackTrace();
					return "Malformed Model";
				}
			}
		});

		TableViewerColumn colUtilization = new TableViewerColumn(tv_coreoverview, SWT.NONE);
		colUtilization.getColumn().setWidth(100);
		colUtilization.getColumn().setText("Utilization");
		colUtilization.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMCore core = (OMCore) element;
				double util;
				try {
					util = OMUtil.getUtilization(core, tmpmodel.get(core));
					return String.format("%1$,.4f", util);
				} catch (MalformedModelException e) {
					e.printStackTrace();
					return "Malformed model";
				}

			}
		});
		tv_coreoverview.refresh(); // update to notify new columns
	}

	private void setupAllocsOverview() {
		Label label1 = new Label(container, SWT.NONE);
		label1.setText("Allocations");
		tv_allocations = new SWTAllocationTable(container, model.getAllocationList());
	}

}
