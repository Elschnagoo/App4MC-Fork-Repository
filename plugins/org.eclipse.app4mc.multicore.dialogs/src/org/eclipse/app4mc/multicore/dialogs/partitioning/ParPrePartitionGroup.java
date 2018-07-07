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

public class ParPrePartitionGroup extends AbstractGroup {
	/**
	 * Constructor
	 *
	 * @param parent
	 *            parent composite
	 */
	public ParPrePartitionGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(1, false);

		// Configure Group
		this.group.setText("PrePartitioning features");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);

		// Minimal dependency decompositions for cycle elimination
		addField(new BooleanFieldEditor(IParConstants.PRE_MIN_EDGES, "Minimal dependency decompositions for cycle elimination", this.group));

		// Increase parallelization potential for cycle elimination result
		addField(new BooleanFieldEditor(IParConstants.PRE_EFF_EDGE, "Increase parallelization potential for cycle elimination result", this.group));

		// Create activation partitions
		addField(new BooleanFieldEditor(IParConstants.PRE_ACTIVATION, "Group Runnables via activations", this.group));

		// Create independent graph partitions
		addField(new BooleanFieldEditor(IParConstants.PRE_GGP, "Group independent Runnable graphs", this.group));

		// TAGS
		addField(new BooleanFieldEditor(IParConstants.PRE_TAGS, "Group Runnables via tags", this.group));

		// ASIL
		addField(new BooleanFieldEditor(IParConstants.PRE_ASIL, "Group Runnables via ASIL-levels", this.group));

		// RCPC
		addField(new BooleanFieldEditor(IParConstants.PRE_RCPC, "Group Runnable-Core-Pairing-Constraints", this.group));

		// RPC
		addField(new BooleanFieldEditor(IParConstants.PRE_RPC, "Consider Runnable-Pairing-Constraints", this.group));

	}

}
