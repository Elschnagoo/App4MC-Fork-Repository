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

package org.eclipse.app4mc.multicore.dialogs.openmapping;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractMappingAlgorithm;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class OMMappingAlgorithmGroup extends AbstractGroup {
	/**
	 * Solver settings group
	 */
	protected final AbstractGroup groupSolverSettings;

	/**
	 * Listener to update Solver settings visibility
	 */
	private final IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {

			OMMappingAlgorithmGroup.this.groupSolverSettings
					.setEnabled(checkSolverSettingsVisibility(event.getNewValue().toString()));

		}
	};

	/**
	 * Constructor
	 *
	 * @param parent
	 *            parent composite
	 */
	public OMMappingAlgorithmGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(1, false);
		ComboFieldEditor comboBox;

		// Configure Group
		this.group.setText("Select mapping algorithm");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);

		// Mapping Algorithms Combobox
		final String[][] options = { { "Load balancing for DFG", AbstractMappingAlgorithm.LOAD_BALANCE_DFG },
				{ "ILP based load balancing", AbstractMappingAlgorithm.LOAD_BALANCE_ILP },
				{ "Energy efficient mapping (Experimental!)", AbstractMappingAlgorithm.ENERGY_MIN_ILP },
				{ "GA based load balancing", AbstractMappingAlgorithm.LOAD_BALANCE_GA },
				{ "GA based load balancing with constraints optimization",
						AbstractMappingAlgorithm.LOAD_BALANCE_CONSTRAINTS_GA } };

		comboBox = new ComboFieldEditor(IOMConstants.PRE_MAPPING_ALG, "", options, this.group);

		comboBox.setPropertyChangeListener(this.listener);

		addField(comboBox);

		// Solver settings group
		this.groupSolverSettings = new OMSolverSettingsGroup(parent, store);

	}

	/**
	 * Verify if solver settings should be visible or not
	 *
	 * @param mapAlg
	 *            selected mapping algorithm
	 * @return true if the solver settings should be visible and false otherwise
	 */
	protected boolean checkSolverSettingsVisibility(final String mapAlg) {

		switch (mapAlg) {
			case AbstractMappingAlgorithm.LOAD_BALANCE_ILP:
			case AbstractMappingAlgorithm.ENERGY_MIN_ILP:
				return true;
			default:
				return false;
		}
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#store()
	 */
	@Override
	public boolean store() {
		return super.store() && this.groupSolverSettings.store();
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#loadDefault()
	 */
	@Override
	public boolean loadDefault() {
		boolean success = true;
		final String currMapAlg = this.store.getDefaultString(IOMConstants.PRE_MAPPING_ALG);

		success &= super.loadDefault();

		// Change visibility of solver settings accordingly
		this.groupSolverSettings.setEnabled((checkSolverSettingsVisibility(currMapAlg)));

		success &= this.groupSolverSettings.loadDefault();

		return success;
	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#load()
	 */
	@Override
	public boolean load() {
		boolean success = true;
		final String currMapAlg = this.store.getString(IOMConstants.PRE_MAPPING_ALG);

		success &= super.load();

		// Change visibility of solver settings accordingly
		this.groupSolverSettings.setEnabled(checkSolverSettingsVisibility(currMapAlg));

		success &= this.groupSolverSettings.load();

		return success;

	}

}
