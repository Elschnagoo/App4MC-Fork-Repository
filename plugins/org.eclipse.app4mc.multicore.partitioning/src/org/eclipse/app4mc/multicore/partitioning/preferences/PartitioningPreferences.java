/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.preferences;

import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.jface.preference.BooleanFieldEditor;
//import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FieldEditorPreferencePage;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPreferencePage;


public class PartitioningPreferences extends FieldEditorPreferencePage implements IWorkbenchPreferencePage {

	public PartitioningPreferences() {
		super(GRID);
		setPreferenceStore(PartitioningPlugin.getDefault().getPreferenceStore());
		setDescription("This page configurates the prepartitioning and the partitioning process. \n"
				+ "Please check the help documentation for a more detailed description.");
	}

	private BooleanFieldEditor bfegcp;
	private BooleanFieldEditor bfecpp;
	private BooleanFieldEditor bfeessp;
	private IntegerFieldEditor ifeessp;

	public BooleanFieldEditor getBfegcp() {
		return this.bfegcp;
	}

	public BooleanFieldEditor getBfecpp() {
		return this.bfecpp;
	}

	public BooleanFieldEditor getBfeessp() {
		return this.bfeessp;
	}

	public IntegerFieldEditor getIfeessp() {
		return this.ifeessp;
	}

	@Override
	public void createFieldEditors() {
		addField(new BooleanFieldEditor(PreferenceConstants.P_ACTIVATION, "&Create activation partitions",
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_GGP, "&Create independent graph partitions",
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_MinEdges,
				"&Minimal dependency decompositions for cycle elimination", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_EffEdge,
				"&Increase parallelization potential for cycle elimination result", getFieldEditorParent()));

		this.bfecpp = new BooleanFieldEditor(PreferenceConstants.P_CPP, "&Perform critcal path partitioning (CPP)",
				getFieldEditorParent()) {
			@SuppressWarnings("synthetic-access")
			@Override
			protected void fireValueChanged(final String property, final Object oldValue, final Object newValue) {
				super.fireValueChanged(property, oldValue, newValue);
				if ((boolean) newValue) {
					getBfegcp().setEnabled(true, getFieldEditorParent());
					getBfeessp().setEnabled(false, getFieldEditorParent());
					getIfeessp().setEnabled(false, getFieldEditorParent());
				}
				else {
					getBfegcp().setEnabled(false, getFieldEditorParent());
					getBfeessp().setEnabled(true, getFieldEditorParent());
				}
			}
		};
		addField(this.bfecpp);

		this.bfegcp = new BooleanFieldEditor(PreferenceConstants.P_GCP,
				"&Define one global critical path (otherwise CP is calculated for all existing partitions)",
				getFieldEditorParent());

		addField(this.bfegcp);

		this.bfeessp = new BooleanFieldEditor(PreferenceConstants.P_ESSP,
				"&Perform earliest start schedule partitioning (ESSP)", getFieldEditorParent()) {
			@SuppressWarnings("synthetic-access")
			@Override
			protected void fireValueChanged(final String property, final Object oldValue, final Object newValue) {
				super.fireValueChanged(property, oldValue, newValue);
				if ((boolean) newValue) {
					getIfeessp().setEnabled(true, getFieldEditorParent());
					getBfecpp().setEnabled(false, getFieldEditorParent());
					getBfegcp().setEnabled(false, getFieldEditorParent());
				}
				else {
					getIfeessp().setEnabled(false, getFieldEditorParent());
					getBfecpp().setEnabled(true, getFieldEditorParent());
				}
			}
		};
		addField(this.bfeessp);

		this.ifeessp = new IntegerFieldEditor(PreferenceConstants.P_INT, "&Number of ESSP partitions: ",
				getFieldEditorParent());
		this.ifeessp.setEnabled(true, getFieldEditorParent());
		addField(this.ifeessp);
		addField(new BooleanFieldEditor(PreferenceConstants.P_TA,
				"&Create additional prepartitioning file and combine edges in less sequence constraints",
				getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_Vis, "&Create applet for visualization",
				getFieldEditorParent()));
		addField(new StringFieldEditor(PreferenceConstants.P_LOC, "&Save directory", getFieldEditorParent()));
		addField(new BooleanFieldEditor(PreferenceConstants.P_DEBUG, "&Write debug information into console.",
				getFieldEditorParent()));

		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		if (store.getBoolean("boolESSP")) {
			this.bfegcp.setEnabled(false, getFieldEditorParent());
			this.bfecpp.setEnabled(false, getFieldEditorParent());
			this.bfeessp.setEnabled(true, getFieldEditorParent());
			this.ifeessp.setEnabled(true, getFieldEditorParent());
		}
		else {
			this.bfegcp.setEnabled(true, getFieldEditorParent());
			this.bfecpp.setEnabled(true, getFieldEditorParent());
			this.bfeessp.setEnabled(false, getFieldEditorParent());
			this.ifeessp.setEnabled(false, getFieldEditorParent());
		}
	}

	@Override
	public void init(final IWorkbench workbench) {
		setPreferenceStore(PartitioningPlugin.getDefault().getPreferenceStore());
	}

	@Override
	protected void performDefaults() {
		super.performDefaults();
		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		store.setValue("boolCPP", false);
		store.setValue("boolESSP", true);
		store.setValue("intThreads", 2);
		store.setValue("boolGCP", false);
		getBfecpp().setEnabled(false, getFieldEditorParent());
		getBfeessp().setEnabled(true, getFieldEditorParent());
		getBfegcp().setEnabled(false, getFieldEditorParent());
		getIfeessp().setEnabled(true, getFieldEditorParent());
	}
}