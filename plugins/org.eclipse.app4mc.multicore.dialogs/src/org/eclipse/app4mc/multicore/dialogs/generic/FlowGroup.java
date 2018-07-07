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

package org.eclipse.app4mc.multicore.dialogs.generic;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class FlowGroup extends AbstractGroup {
	/**
	 * Hardware model file selector
	 */
	private FileFieldEditor hwModel;
	/**
	 * Hardware model file selector
	 */
	private BooleanFieldEditor mappingCheck;
	/**
	 * Listener to automatically store values when changed
	 */
	private final IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {

			if (event.getSource() instanceof BooleanFieldEditor) {
				((BooleanFieldEditor) event.getSource()).store();
			}

			update();

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
	public FlowGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(3, false);
		final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);

		gridData.widthHint = 200;

		// Configure Group
		this.group.setText("Flow");
		this.group.setLayoutData(gridData);
		this.group.setLayout(layout);

		addField(new BooleanFieldEditor(IDialogsConstants.PRE_CHECK_PARTITIONING, "Perform Partitioning", this.group));

		addField(new BooleanFieldEditor(IDialogsConstants.PRE_CHECK_CREATE_TASKS, "Perform Task Creation", this.group));

		addField(this.mappingCheck = new BooleanFieldEditor(IDialogsConstants.PRE_CHECK_MAPPING, "Perform Mapping",
				this.group));

		// Create the browser for HW model
		addField(this.hwModel = new FileFieldEditor(IDialogsConstants.PRE_HW_MODEL_LOCATION, "Hardware Model: ",
				this.group));


		// Extensions allowed
		final String[] extensions = new String[1];
		extensions[0] = "*." + IDialogsConstants.EXTENSION;

		this.hwModel.setFileExtensions(extensions);

		for (final FieldEditor editor : this.fields) {
			editor.setPropertyChangeListener(this.listener);
			editor.fillIntoGrid(this.group, 3);
		}

		// Update
		update();

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#update()
	 */
	@Override
	public boolean update() {
		this.hwModel.setEnabled(this.store.getBoolean(this.mappingCheck.getPreferenceName()), this.group);

		return true;
	}

}
