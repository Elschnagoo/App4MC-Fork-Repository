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

import org.eclipse.app4mc.multicore.dialogs.AbstractDialogPage;
import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.dialogs.generic.OutputGroup;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public class ParDialog extends AbstractDialogPage {
	/**
	 * Logging group
	 */
	public final static int LOGGING_GROUP = 0;
	/**
	 * Output group
	 */
	public final static int OUTPUT_GROUP = 1;
	/**
	 * Alternative Output group
	 */
	public final static int ALT_OUTPUT_GROUP = 2;
	/**
	 * Partitioning Algorithm Group
	 */
	public final static int PARTITIONING_ALGORITHM_GROUP = 3;
	/**
	 * Prepartitioning Algorithm Group
	 */
	public final static int PRE_PARTITIONING_ALGORITHM_GROUP = 4;
	/**
	 * Max group
	 */
	public final static int MAX_GROUP = 5;

	/**
	 * Constructor
	 *
	 * @param store
	 *            preferences store
	 */
	public ParDialog(final IPreferenceStore store) {
		super(store);
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		this.groups = new AbstractGroup[MAX_GROUP];

		// Logging group
		this.groups[LOGGING_GROUP] = new ParLoggingGroup(parent, this.store);

		// Output group
		this.groups[OUTPUT_GROUP] = new OutputGroup(parent, IParConstants.PRE_LOC_RADIO, IParConstants.PRE_LOC_STRING,
				this.store);

		// Alternative output group
		this.groups[ALT_OUTPUT_GROUP] = new ParAltOutputGroup(parent, this.store);

		// PrePartitioning group
		this.groups[PRE_PARTITIONING_ALGORITHM_GROUP] = new ParPrePartitionGroup(parent, this.store);

		// Partitioning group
		this.groups[PARTITIONING_ALGORITHM_GROUP] = new ParAlgorithmGroup(parent, this.store);

	}


}
