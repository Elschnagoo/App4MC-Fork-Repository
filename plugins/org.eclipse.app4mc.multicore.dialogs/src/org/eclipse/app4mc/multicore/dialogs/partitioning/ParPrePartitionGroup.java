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
		this.group.setText("PrePartitioning Algorithm");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);

		// Create activation partitions
		addField(new BooleanFieldEditor(IParConstants.PRE_ACTIVATION, "Create activation partitions", this.group));

		// Create independent graph partitions
		addField(new BooleanFieldEditor(IParConstants.PRE_GGP, "Create independent graph partitions", this.group));

		// Minimal dependency decompositions for cycle elimination
		addField(new BooleanFieldEditor(IParConstants.PRE_MIN_EDGES,
				"Minimal dependency decompositions for cycle elimination", this.group));

		// Increase parallelization potential for cycle elimination result
		addField(new BooleanFieldEditor(IParConstants.PRE_EFF_EDGE,
				"Increase parallelization potential for cycle elimination result", this.group));

	}

}
