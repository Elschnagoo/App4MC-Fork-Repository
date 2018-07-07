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

import java.util.ArrayList;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public abstract class AbstractGroup {
	/**
	 * Group control
	 */
	protected Group group;
	/**
	 * Preference store
	 */
	protected IPreferenceStore store;
	/**
	 * Field editors array
	 */
	protected ArrayList<FieldEditor> fields;

	/**
	 * Constructor
	 * 
	 * @param parent
	 *            parent composite
	 */
	public AbstractGroup(final Composite parent, final IPreferenceStore store) {

		this.group = new Group(parent, SWT.SHADOW_ETCHED_IN);

		this.fields = new ArrayList<FieldEditor>();

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
		for (final FieldEditor field : this.fields) {
			field.store();
		}
		return true;
	}

	/**
	 * Initialize default values
	 * 
	 * @param store
	 *            registry to store preferences
	 * @return true if no error false otherwise
	 */
	public boolean loadDefault() {
		for (final FieldEditor field : this.fields) {
			field.loadDefault();
		}
		return true;
	}

	/**
	 * Load preferences from registry
	 * 
	 * @return true if no error false otherwise
	 */
	public boolean load() {
		for (final FieldEditor field : this.fields) {
			field.load();
		}
		return true;
	}

	/**
	 * Add field editor to the group
	 * 
	 * @param field
	 *            field editor to add
	 */
	public void addField(final FieldEditor field) {
		this.fields.add(field);
		field.setPreferenceStore(this.store);
	}

	/**
	 * Set enable to all components inside the group
	 * 
	 * @param enabled
	 *            enable state
	 */
	public void setEnabled(final boolean enabled) {
		for (final FieldEditor field : this.fields) {
			field.setEnabled(enabled, this.group);
		}
		this.group.setEnabled(enabled);
	}

	/**
	 * Trigger group's update
	 * 
	 * @return true if no errors and false otherwise
	 */
	public boolean update() {
		return true;
	}

}
