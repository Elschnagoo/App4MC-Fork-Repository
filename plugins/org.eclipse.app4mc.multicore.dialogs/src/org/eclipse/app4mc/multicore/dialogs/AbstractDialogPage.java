/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/
package org.eclipse.app4mc.multicore.dialogs;

import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.preference.IPreferenceStore;

public abstract class AbstractDialogPage extends DialogPage {
	/**
	 * Abstract Groups contained by dialog
	 */
	protected AbstractGroup[] groups;
	/**
	 * Preference Store to use
	 */
	protected IPreferenceStore store;

	/**
	 * Constructor
	 */
	public AbstractDialogPage(final IPreferenceStore store) {
		this.store = store;
	}

	/**
	 * Store preferences into registry
	 * 
	 * @param store
	 *            registry to store preferences
	 * @return true if stored correctly false otherwise
	 */
	public boolean store() {
		boolean success = true;

		for (final AbstractGroup group : this.groups) {
			success &= group.store();
		}

		return success;
	}

	/**
	 * Initialize default values
	 * 
	 * @param store
	 *            registry to store preferences
	 * @return true if no error false otherwise
	 */
	public boolean loadDefault() {
		boolean success = true;

		for (final AbstractGroup group : this.groups) {
			success &= group.loadDefault();
		}

		return success;
	}

	/**
	 * Load preferences from registry
	 * 
	 * @return true is successfully done and false otherwise
	 */
	public boolean load() {
		boolean success = true;

		for (final AbstractGroup group : this.groups) {
			success &= group.load();
		}

		return success;
	}

	/**
	 * Obtain Preferences Store
	 * 
	 * @return preferences store
	 */
	public IPreferenceStore getStore() {
		return this.store;
	}

	/**
	 * Obtain groups
	 * 
	 * @return groups array
	 */
	public AbstractGroup[] getGroups() {
		return this.groups;
	}

}
