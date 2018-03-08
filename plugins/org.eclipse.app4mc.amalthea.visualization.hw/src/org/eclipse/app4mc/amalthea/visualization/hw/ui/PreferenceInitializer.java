/*******************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.visualization.hw.ui;

import org.eclipse.app4mc.amalthea.visualization.hw.Activator;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 *
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#
	 * initializeDefaultPreferences()
	 */
	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = Activator.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_DOT_PATH,
				store.getString(PreferenceConstants.P_DOT_PATH) != null
						? store.getString(PreferenceConstants.P_DOT_PATH)
						: "");
	}

}
