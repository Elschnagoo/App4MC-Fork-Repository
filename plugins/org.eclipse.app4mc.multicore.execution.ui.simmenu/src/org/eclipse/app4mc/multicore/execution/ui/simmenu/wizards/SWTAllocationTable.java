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

import org.eclipse.app4mc.multicore.execution.logic.openmapping.MalformedModelException;
import org.eclipse.app4mc.multicore.execution.logic.openmapping.OMAllocation;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;


public class SWTAllocationTable extends TableViewer{

	
	public SWTAllocationTable(Composite parent, List<OMAllocation> model) {
		super(parent,SWT.MULTI | SWT.H_SCROLL
                | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		
		setContentProvider(ArrayContentProvider.getInstance());
		setInput(model);
		setupColumns();
		refresh();
	}
	
	private void setupColumns() {
		final Table table = getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		
		
		TableViewerColumn colTask = new TableViewerColumn(this, SWT.NONE);
		colTask.getColumn().setWidth(100);
		colTask.getColumn().setText("Task");
		colTask.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMAllocation alloc = (OMAllocation) element;
				return alloc.getTask().getTaskRef().getName();
			}
		});
		
		TableViewerColumn colInst = new TableViewerColumn(this, SWT.NONE);
		colInst.getColumn().setWidth(150);
		colInst.getColumn().setText("Instructions");
		colInst.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMAllocation alloc = (OMAllocation) element;
				return Long.toString(alloc.getTask().getInstructionCount());
			}
		});
		
		TableViewerColumn colPeriod = new TableViewerColumn(this, SWT.NONE);
		colPeriod.getColumn().setWidth(150);
		colPeriod.getColumn().setText("Period (ps)");
		colPeriod.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMAllocation alloc = (OMAllocation) element;
				return Long.toString(alloc.getTask().getPeriod());
			}
		});
		
		
		TableViewerColumn colCore = new TableViewerColumn(this,SWT.NONE);
		colCore.getColumn().setWidth(100);
		colCore.getColumn().setText("Core");
		
		colCore.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMAllocation alloc = (OMAllocation) element;
				return alloc.getCore().getCoreRef().getName();
			}
		});
		TableViewerColumn colWCET = new TableViewerColumn(this, SWT.NONE);
		colWCET.getColumn().setWidth(150);
		colWCET.getColumn().setText("WCET (ps)");
		colWCET.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMAllocation alloc = (OMAllocation) element;
				try {
					return Long.toString(alloc.calculateProcessingTime());
				} catch (MalformedModelException e) {
					e.printStackTrace();
					return "Malformed Model";
				}
			}
		});
		
		TableViewerColumn colEP = new TableViewerColumn(this, SWT.NONE);
		colEP.getColumn().setWidth(100);
		colEP.getColumn().setText("WCET/P");
		colEP.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				OMAllocation alloc = (OMAllocation) element;
				double x;
				try {
					x = alloc.calculateProcessingTime();
				} catch (MalformedModelException e) {
					e.printStackTrace();
					return "Malformed Model";
				}
				x /= alloc.getTask().getPeriod();
				return String.format("%1$,.4f", x);
			}
		});
	}

}
