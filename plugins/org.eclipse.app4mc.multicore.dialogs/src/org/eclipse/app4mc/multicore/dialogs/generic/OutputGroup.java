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

package org.eclipse.app4mc.multicore.dialogs.generic;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.sharelibs.OutputPathParser;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.RadioGroupFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class OutputGroup extends AbstractGroup {
	/**
	 * Output directory Field editor
	 */
	private ProjectDirectoryFieldEditor outputDirectory;
	/**
	 * Radio button group for selecting output directory type
	 */
	private final RadioGroupFieldEditor radioOutputDirectory;
	/**
	 * Radio preference name
	 */
	private final String radioPreferenceName;
	/**
	 * Path preference name
	 */
	private final String pathPreferenceName;

	/**
	 * Extend of DirectoryFieldEdito to allow control on button
	 */
	private class ProjectDirectoryFieldEditor extends DirectoryFieldEditor {
		public ProjectDirectoryFieldEditor(final String preOutputPath, final String string, final Group group) {
			super(preOutputPath, string, group);
		}

		public void setChangeEnabled(final boolean enabled) {
			final Group group = getGroup();
			getChangeControl(group).setEnabled(enabled);
		}
	}

	/**
	 * Event listener for changes in output method
	 */
	private final IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {
			outputRadioEnable(event.getNewValue().toString());
		}
	};

	/**
	 * Constructor
	 *
	 * @param parent
	 *            parent composite
	 * @param store
	 *            preferences store
	 */
	public OutputGroup(final Composite parent, final String radioPreferenceName, final String pathPreferenceName,
			final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(3, false);
		final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);

		this.radioPreferenceName = radioPreferenceName;
		this.pathPreferenceName = pathPreferenceName;

		// Configure Group
		this.group.setText("Output");
		this.group.setLayoutData(gridData);
		this.group.setLayout(layout);

		gridData.widthHint = 200;

		final String[][] options = {
				{ "Default location ({ProjectRoot}/" + store.getDefaultString(pathPreferenceName) + ")",
						OutputPathParser.DEFAULT_OUTPUT },
				{ "Relative location", OutputPathParser.RELATIVE_OUTPUT },
				{ "Absolute location", OutputPathParser.ABSOLUTE_OUTPUT } };

		this.radioOutputDirectory = new RadioGroupFieldEditor(radioPreferenceName, "Output Location: ", 1, options,
				this.group);

		addField(this.radioOutputDirectory);
		this.radioOutputDirectory.fillIntoGrid(this.group, 3);
		this.radioOutputDirectory.setPropertyChangeListener(this.listener);

		addField(this.outputDirectory = new ProjectDirectoryFieldEditor(pathPreferenceName, "Path: ", this.group));


	}

	/**
	 * Enable outputDirectory field editor
	 *
	 * @param value
	 *            current output method
	 */
	protected void outputRadioEnable(final String value) {
		switch (value) {
			case OutputPathParser.DEFAULT_OUTPUT:
				this.outputDirectory.setStringValue(this.store.getDefaultString(this.pathPreferenceName));
				this.outputDirectory.setEnabled(false, this.group);
				break;
			case OutputPathParser.ABSOLUTE_OUTPUT:
				this.outputDirectory.setEnabled(true, this.group);
				this.outputDirectory.setChangeEnabled(true);
				break;
			case OutputPathParser.RELATIVE_OUTPUT:
				this.outputDirectory.setEnabled(true, this.group);
				this.outputDirectory.setChangeEnabled(false);
				break;
			default:
				this.outputDirectory.setEnabled(false, this.group);
				break;
		}
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#loadDefault()
	 */
	@Override
	public boolean loadDefault() {
		final boolean success = super.loadDefault();

		final String radioOutputChoice = this.store.getDefaultString(this.radioPreferenceName);
		outputRadioEnable(radioOutputChoice);

		return success;

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#load()
	 */
	@Override
	public boolean load() {
		final boolean success = super.load();

		// output location
		final String radioOutputChoice = this.store.getString(this.radioPreferenceName);
		outputRadioEnable(radioOutputChoice);

		return success;

	}

	/**
	 * Get the group of the Abstract group
	 *
	 * @return group
	 */
	public Group getGroup() {
		return this.group;
	}
}