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
package org.eclipse.app4mc.multicore.dialogs.generic;

import org.eclipse.app4mc.multicore.dialogs.AbstractDialogPage;
import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.dialogs.IDialogsConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.widgets.Composite;

public class FlowDialog extends AbstractDialogPage {
	/**
	 * Default group index
	 */
	public final static int DEFAULT_GROUP = 0;
	/**
	 * Logging group index
	 */
	public final static int LOGGING_GROUP = 1;
	/**
	 * Output group
	 */
	public final static int OUTPUT_GROUP = 2;
	/**
	 * Max Group
	 */
	public final static int MAX_GROUP = 3;


	/**
	 * Constructor
	 *
	 * @param store
	 *            preferences store
	 */
	public FlowDialog(final IPreferenceStore store) {
		super(store);
	}


	/**
	 * @see org.eclipse.jface.dialogs.IDialogPage#createControl(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createControl(final Composite parent) {
		this.groups = new AbstractGroup[MAX_GROUP];

		this.groups[DEFAULT_GROUP] = new FlowGroup(parent, this.store);

		this.groups[LOGGING_GROUP] = new FlowLoggingGroup(parent, this.store);

		this.groups[OUTPUT_GROUP] = new OutputGroup(parent, IDialogsConstants.PRE_OUTPUT_PATH_RADIO,
				IDialogsConstants.PRE_OUTPUT_PATH, this.store);

	}

}
