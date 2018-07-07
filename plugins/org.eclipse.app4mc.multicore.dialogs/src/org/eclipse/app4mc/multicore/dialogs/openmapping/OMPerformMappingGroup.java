/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.dialogs.openmapping;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class OMPerformMappingGroup extends AbstractGroup {

	/**
	 * Listener to automatically store values when changed
	 */
	private final IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {
			if (((FieldEditor) event.getSource()).isValid()) {
				((FieldEditor) event.getSource()).store();
			}
			else {
				// FIXME: Error!
			}
		}
	};

	/**
	 * Constructor
	 * 
	 * @param parent
	 *            parent composite
	 * @param store
	 *            preferences store
	 */
	public OMPerformMappingGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(1, false);
		FileFieldEditor swModel;

		// Configure Group
		this.group.setText("Hardware Model Selection");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);

		// Create Text input for project name
		addField(new StringFieldEditor(IDialogsConstants.PRE_PROJECT_NAME, "Project Name: ", this.group));

		final Label newGroup = new Label(this.group, 0);
		newGroup.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		newGroup.setVisible(false);

		// Create the browser for SW model
		addField(
				swModel = new FileFieldEditor(IDialogsConstants.PRE_SW_MODEL_LOCATION, "Software Model: ", this.group));

		swModel.setEnabled(false, this.group);


		// Create the browser for HW model
		addField(new FileFieldEditor(IDialogsConstants.PRE_HW_MODEL_LOCATION, "Hardware Model: ", this.group));

		for (final FieldEditor field : this.fields) {
			field.setPropertyChangeListener(this.listener);
		}

	}

}
