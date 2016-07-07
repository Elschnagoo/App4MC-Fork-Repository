/*******************************************************************************
 * Copyright (c) 2015 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.openmapping.preferencePages;

import org.eclipse.app4mc.multicore.openmapping.IOpenMappingConstants;
import org.eclipse.app4mc.multicore.openmapping.OpenMappingPlugin;
import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

public class OpenMappingPreferenceInitializer extends AbstractPreferenceInitializer {

	public OpenMappingPreferenceInitializer() {
		super();
	}

	@Override
	public void initializeDefaultPreferences() {
		final IPreferenceStore store = OpenMappingPlugin.getDefault().getPreferenceStore();
		store.setDefault(IOpenMappingConstants.PRE_CHECK_LOGCON, true);
		store.setDefault(IOpenMappingConstants.PRE_RADIO_ALG, 1);
		store.setDefault(IOpenMappingConstants.PRE_RADIO_OUTDIR, 0);
		store.setDefault(IOpenMappingConstants.PRE_STRING_OUTDIR, "");

		store.setDefault(IOpenMappingConstants.PRE_MAX_GAP, 0.1);
		store.setDefault(IOpenMappingConstants.PRE_MAX_IT_ABORT, Integer.MAX_VALUE);
		store.setDefault(IOpenMappingConstants.PRE_MAX_TIME_ABORT, Integer.MAX_VALUE);
		store.setDefault(IOpenMappingConstants.PRE_MAX_IT_SUFFICE, Integer.MAX_VALUE);
		store.setDefault(IOpenMappingConstants.PRE_MAX_TIME_SUFFICE, Integer.MAX_VALUE);
	}
}
