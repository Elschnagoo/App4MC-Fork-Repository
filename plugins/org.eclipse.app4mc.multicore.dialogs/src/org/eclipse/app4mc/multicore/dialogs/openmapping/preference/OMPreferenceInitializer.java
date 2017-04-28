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
package org.eclipse.app4mc.multicore.dialogs.openmapping.preference;

import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;

/**
 * Initialize DialogsPlugin's Preference Store with the same values as
 * OpenMapping's
 */
public class OMPreferenceInitializer extends org.eclipse.app4mc.multicore.openmapping.OMPreferenceInitializer {

	/**
	 * Constructor
	 */
	public OMPreferenceInitializer() {
		this.store = DialogsPlugin.getDefault().getPreferenceStore();
	}

}
