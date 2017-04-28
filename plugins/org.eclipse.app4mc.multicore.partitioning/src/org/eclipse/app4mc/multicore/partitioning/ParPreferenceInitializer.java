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
package org.eclipse.app4mc.multicore.partitioning;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class ParPreferenceInitializer extends AbstractPreferenceInitializer {
	
	protected IPreferenceStore store;
	
	public ParPreferenceInitializer() {
		store = PartitioningPlugin.getDefault().getPreferenceStore();
	}

	@Override
	public void initializeDefaultPreferences() {
		store.setDefault(IParConstants.PRE_ACTIVATION, false);
		store.setDefault(IParConstants.PRE_GGP, false);
		store.setDefault(IParConstants.PRE_MIN_EDGES, false);
		store.setDefault(IParConstants.PRE_EFF_EDGE, false);
//		store.setDefault(IParConstants.PRE_CPP, false);
		store.setDefault(IParConstants.PRE_GCP, false);
//		store.setDefault(IParConstants.PRE_ESSP, true);
		store.setDefault(IParConstants.PRE_INT, "2");
		store.setDefault(IParConstants.PRE_TA, false);
		store.setDefault(IParConstants.PRE_VIS, false);
		store.setDefault(IParConstants.PRE_DEBUG, false);
		store.setDefault(IParConstants.PRE_LOC_STRING, "output");
		store.setDefault(IParConstants.PRE_LOC_RADIO, "0");
		store.setDefault(IParConstants.PRE_PARTITIONING_ALG, "0"); // ESSP
	}
	
}
