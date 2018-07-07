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
