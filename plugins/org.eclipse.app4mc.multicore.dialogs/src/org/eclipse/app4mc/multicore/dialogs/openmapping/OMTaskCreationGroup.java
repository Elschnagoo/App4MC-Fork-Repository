/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.dialogs.openmapping;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractTaskCreationAlgorithm;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class OMTaskCreationGroup extends AbstractGroup {

	/**
	 * Constructor
	 * 
	 * @param parent
	 *            parent composite
	 * @param store
	 *            preferences store
	 */
	public OMTaskCreationGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(1, false);
		ComboFieldEditor comboBox;

		// Configure Group
		this.group.setText("Select Task Creation Algorithm");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);

		// Mapping Algorithms Combobox
		final String[][] options = {
				{ "Pragmatic Task Creation", AbstractTaskCreationAlgorithm.PRAGMATIC_TASK_CREATION } };

		comboBox = new ComboFieldEditor(IOMConstants.PRE_TASK_CREATION_ALG, "", options, this.group);

		// Disabled for now only one task creation algorithm supported
		comboBox.setEnabled(false, this.group);

		addField(comboBox);
	}

}
