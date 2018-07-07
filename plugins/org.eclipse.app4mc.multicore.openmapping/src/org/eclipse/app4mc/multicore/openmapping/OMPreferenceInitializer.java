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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class OMPreferenceInitializer extends AbstractPreferenceInitializer {
	
	protected IPreferenceStore store;
	
	public OMPreferenceInitializer() {
		this.store = OpenMappingPlugin.getDefault().getPreferenceStore();
	}
	
	public OMPreferenceInitializer(IPreferenceStore store) {
		this.store = store;
	}
	
	@Override
	public void initializeDefaultPreferences() {
		
		store.setDefault(IOMConstants.PRE_CHECK_LOGCON, true);
		store.setDefault(IOMConstants.PRE_MAPPING_ALG, 1);
		store.setDefault(IOMConstants.PRE_RADIO_OUTDIR, 0);
		store.setDefault(IOMConstants.PRE_STRING_OUTDIR, "output");

		store.setDefault(IOMConstants.PRE_MAX_GAP, 0.1);
		store.setDefault(IOMConstants.PRE_MAX_IT_ABORT, Integer.MAX_VALUE);
		store.setDefault(IOMConstants.PRE_MAX_TIME_ABORT, Integer.MAX_VALUE);
		store.setDefault(IOMConstants.PRE_MAX_IT_SUFFICE, Integer.MAX_VALUE);
		store.setDefault(IOMConstants.PRE_MAX_TIME_SUFFICE, Integer.MAX_VALUE);
	}
}
