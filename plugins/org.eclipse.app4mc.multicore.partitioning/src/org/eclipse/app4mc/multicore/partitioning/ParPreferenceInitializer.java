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
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.partitioning;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * Class used to initialize default preference values.
 */
public class ParPreferenceInitializer extends AbstractPreferenceInitializer {

	protected IPreferenceStore store;

	public ParPreferenceInitializer() {
		this.store = PartitioningPlugin.getDefault().getPreferenceStore();
	}

	@Override
	public void initializeDefaultPreferences() {
		this.store.setDefault(IParConstants.PRE_ACTIVATION, true);
		this.store.setDefault(IParConstants.PRE_GGP, false);
		this.store.setDefault(IParConstants.PRE_MIN_EDGES, false);
		this.store.setDefault(IParConstants.PRE_EFF_EDGE, false);
		// store.setDefault(IParConstants.PRE_CPP, false);
		this.store.setDefault(IParConstants.PRE_GCP, false);
		// store.setDefault(IParConstants.PRE_ESSP, true);
		this.store.setDefault(IParConstants.PRE_INT, "4");
		this.store.setDefault(IParConstants.PRE_TA, false);
		this.store.setDefault(IParConstants.PRE_VIS, false);
		this.store.setDefault(IParConstants.PRE_DEBUG, false);
		this.store.setDefault(IParConstants.PRE_LOC_STRING, "output");
		this.store.setDefault(IParConstants.PRE_LOC_RADIO, "0");
		this.store.setDefault(IParConstants.PRE_PARTITIONING_ALG, "essp"); // ESSP
		this.store.setDefault(IParConstants.PRE_ASIL, false);
		this.store.setDefault(IParConstants.PRE_RPC, false);
		this.store.setDefault(IParConstants.PRE_RCPC, false);
		this.store.setDefault(IParConstants.PRE_TAGS, false);
	}

}
