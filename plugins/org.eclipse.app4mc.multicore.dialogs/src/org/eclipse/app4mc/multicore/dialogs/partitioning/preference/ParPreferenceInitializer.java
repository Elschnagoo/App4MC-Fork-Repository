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

package org.eclipse.app4mc.multicore.dialogs.partitioning.preference;

import org.eclipse.app4mc.multicore.dialogs.DialogsPlugin;

/**
 * Class used to initialize default preference values.
 */
public class ParPreferenceInitializer extends org.eclipse.app4mc.multicore.partitioning.ParPreferenceInitializer {

	/**
	 * Constructor to override the store of the super class
	 */
	public ParPreferenceInitializer() {
		this.store = DialogsPlugin.getDefaultPreferenceStore();
	}
}
