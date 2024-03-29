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

package org.eclipse.app4mc.multicore.dialogs.partitioning;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ParAltOutputGroup extends AbstractGroup {
	/**
	 * Constructor
	 * 
	 * @param parent
	 *            parent composite
	 */
	public ParAltOutputGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(1, false);

		// Configure Group
		this.group.setText("Alternative Outputs");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);


		// Create additional prepartitioning file and combine edges in less
		// sequence constraints
		addField(new BooleanFieldEditor(IParConstants.PRE_TA,
				"Create additional prepartitioning file and combine edges in less sequence constraints", this.group));

		// Create applet for visualization
		addField(new BooleanFieldEditor(IParConstants.PRE_VIS, "Create applet for visualization", this.group));

	}

}
