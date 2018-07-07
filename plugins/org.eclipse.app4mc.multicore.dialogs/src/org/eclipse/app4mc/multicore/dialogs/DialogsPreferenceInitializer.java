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

package org.eclipse.app4mc.multicore.dialogs;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class DialogsPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = DialogsPlugin.getDefault().getPreferenceStore();

		store.setDefault(IDialogsConstants.PRE_CHECK_PARTITIONING, true);
		store.setDefault(IDialogsConstants.PRE_CHECK_CREATE_TASKS, true);
		store.setDefault(IDialogsConstants.PRE_CHECK_MAPPING, true);
		store.setDefault(IDialogsConstants.PRE_GLOBAL_LOGGING, true);
		store.setDefault(IDialogsConstants.PRE_OUTPUT_PATH, "wizard");
		store.setDefault(IDialogsConstants.PRE_OUTPUT_PATH_RADIO, "0");
	}
}
