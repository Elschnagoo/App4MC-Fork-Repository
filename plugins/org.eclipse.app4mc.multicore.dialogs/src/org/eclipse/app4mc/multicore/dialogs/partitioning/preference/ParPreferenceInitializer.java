/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
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
