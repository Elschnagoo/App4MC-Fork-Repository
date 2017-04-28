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

import org.eclipse.app4mc.multicore.dialogs.AbstractDialogPage;
import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public class ParDialogWizard extends AbstractDialogPage {
	/**
	 * Partitioning Algorithm Group
	 */
	public final static int PARTITIONING_ALGORITHM_GROUP = 0;
	/**
	 * Prepartitioning Algorithm Group
	 */
	public final static int PRE_PARTITIONING_ALGORITHM_GROUP = 1;
	/**
	 * Max group
	 */
	public final static int MAX_GROUP = 2;

	/**
	 * Constructor
	 *
	 * @param store
	 *            preferences store
	 */
	public ParDialogWizard(final IPreferenceStore store) {
		super(store);
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		this.groups = new AbstractGroup[MAX_GROUP];

		// PrePartitioning group
		this.groups[PRE_PARTITIONING_ALGORITHM_GROUP] = new ParPrePartitionGroup(parent, this.store);

		// Partitioning group
		this.groups[PARTITIONING_ALGORITHM_GROUP] = new ParAlgorithmGroup(parent, this.store);

	}


}
