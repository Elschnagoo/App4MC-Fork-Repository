/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.preferences;

import org.eclipse.app4mc.multicore.partitioning.PartitioningPlugin;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = PartitioningPlugin.getDefault().getPreferenceStore();
		store.setDefault(PreferenceConstants.P_ACTIVATION, false);
		store.setDefault(PreferenceConstants.P_GGP, false);
		store.setDefault(PreferenceConstants.P_MinEdges, false);
		store.setDefault(PreferenceConstants.P_EffEdge, false);
		store.setDefault(PreferenceConstants.P_CPP, false);
		store.setDefault(PreferenceConstants.P_GCP, false);
		store.setDefault(PreferenceConstants.P_ESSP, true);
		store.setDefault(PreferenceConstants.P_INT, "2");
		store.setDefault(PreferenceConstants.P_TA, false);
		store.setDefault(PreferenceConstants.P_Vis, false);
		store.setDefault(PreferenceConstants.P_DEBUG, false);
		store.setDefault(PreferenceConstants.P_LOC, "05_Target_Mapping");
	}

}
