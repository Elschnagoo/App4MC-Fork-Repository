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
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class FlowLoggingGroup extends AbstractGroup {
	/**
	 * Listener to automatically store values when changed
	 */
	private final IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {
			if (event.getSource() instanceof BooleanFieldEditor) {
				((BooleanFieldEditor) event.getSource()).store();
				setAllLoggingPreferencesEnabled(((BooleanFieldEditor) event.getSource()).getBooleanValue());
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
	public FlowLoggingGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(3, false);
		final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);

		BooleanFieldEditor checkBox;

		// Configure Group
		this.group.setText("Logging");
		this.group.setLayoutData(gridData);
		this.group.setLayout(layout);

		checkBox = new BooleanFieldEditor(IDialogsConstants.PRE_GLOBAL_LOGGING, "Enable Verbose Logging to console",
				this.group);

		checkBox.setPropertyChangeListener(this.listener);

		setAllLoggingPreferencesEnabled(checkBox.getBooleanValue());

		addField(checkBox);

	}

	/**
	 * Set logging enabled for all steps in the flow
	 *
	 * @param enabled
	 */
	protected void setAllLoggingPreferencesEnabled(final boolean enabled) {
		this.store.setValue(IParConstants.PRE_DEBUG, enabled);
		this.store.setValue(IOMConstants.PRE_CHECK_LOGCON, enabled);
	}

}
