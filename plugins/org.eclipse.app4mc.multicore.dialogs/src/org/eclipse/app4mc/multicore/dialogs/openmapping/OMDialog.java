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

import org.eclipse.app4mc.multicore.dialogs.AbstractDialogPage;
import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.dialogs.generic.OutputGroup;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public class OMDialog extends AbstractDialogPage {
	/**
	 * Logging group
	 */
	public final static int LOGGING_GROUP = 0;
	/**
	 * Output group
	 */
	public final static int OUTPUT_GROUP = 1;
	/**
	 * Mapping Algorithm Group
	 */
	public final static int MAPPING_ALGORITHM_GROUP = 2;
	/**
	 * Max group
	 */
	public final static int MAX_GROUP = 3;


	/**
	 * Constructor
	 *
	 * @param store
	 *            preferences store
	 */
	public OMDialog(final IPreferenceStore store) {
		super(store);
	}

	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {

		this.groups = new AbstractGroup[MAX_GROUP];

		// Logging group
		this.groups[LOGGING_GROUP] = new OMLoggingGroup(parent, this.store);

		// Output group
		this.groups[OUTPUT_GROUP] = new OutputGroup(parent, IOMConstants.PRE_RADIO_OUTDIR,
				IOMConstants.PRE_STRING_OUTDIR, this.store);

		// Mapping Algorithm Group
		this.groups[MAPPING_ALGORITHM_GROUP] = new OMMappingAlgorithmGroup(parent, this.store);

	}

}
