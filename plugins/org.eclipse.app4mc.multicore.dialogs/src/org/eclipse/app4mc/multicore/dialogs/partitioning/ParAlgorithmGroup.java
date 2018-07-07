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

package org.eclipse.app4mc.multicore.dialogs.partitioning;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.partitioning.IParConstants;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PerformPartitioning;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.ComboFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ParAlgorithmGroup extends AbstractGroup {
	/**
	 * Global Critical Path checkbox
	 */
	private final BooleanFieldEditor GCPheck;
	/**
	 * ESSP number of partitions
	 */
	private final IntegerFieldEditor ESSPPartitions;
	/**
	 * Listener to update options' visibility
	 */
	private final IPropertyChangeListener listener = new IPropertyChangeListener() {
		@Override
		public void propertyChange(final PropertyChangeEvent event) {
			updateEnable(event.getNewValue().toString());
		}
	};

	/**
	 * Constructor
	 *
	 * @param parent
	 *            parent composite
	 */
	public ParAlgorithmGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout = new GridLayout(2, false);

		// Configure Group
		this.group.setText("Partitioning Algorithm");
		this.group.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		this.group.setLayout(layout);

		ComboFieldEditor comboBox;

		// Mapping Algorithms Combobox
		final String[][] options = { { "Earliest Start Schedule Partitioning (ESSP)", PerformPartitioning.PART_ESSP },
				{ "Critical Path Partitioning (CPP)", PerformPartitioning.PART_CPP } };

		comboBox = new ComboFieldEditor(IParConstants.PRE_PARTITIONING_ALG, "Select Algorithm: ", options, this.group);

		comboBox.fillIntoGrid(this.group, 2);

		comboBox.setPropertyChangeListener(this.listener);

		addField(comboBox);

		// ESSP number of partitions
		this.ESSPPartitions = new IntegerFieldEditor(IParConstants.PRE_INT, "&Number of ESSP partitions: ", this.group);

		this.ESSPPartitions.setEnabled(true, this.group);

		this.ESSPPartitions.fillIntoGrid(this.group, 2);

		addField(this.ESSPPartitions);


		// GCP
		this.GCPheck = new BooleanFieldEditor(IParConstants.PRE_GCP,
				"Define one global critical path (otherwise CP is calculated for all existing partitions)", this.group);

		this.GCPheck.fillIntoGrid(this.group, 2);

		addField(this.GCPheck);


		// Update visibility depending on value
		updateEnable(store.getString(IParConstants.PRE_PARTITIONING_ALG));


	}

	/**
	 * Update visibility of dependent components
	 *
	 * @param partAlg
	 *            partitioning algorithm
	 */
	protected void updateEnable(final String partAlg) {

		switch (partAlg) {
			case PerformPartitioning.PART_ESSP:
				this.ESSPPartitions.setEnabled(true, this.group);
				this.GCPheck.setEnabled(false, this.group);
				break;
			case PerformPartitioning.PART_CPP:
				this.ESSPPartitions.setEnabled(false, this.group);
				this.GCPheck.setEnabled(true, this.group);
				break;
			default:
				this.ESSPPartitions.setEnabled(true, this.group);
				this.GCPheck.setEnabled(false, this.group);
				break;
		}

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#loadDefault()
	 */
	@Override
	public boolean loadDefault() {
		final boolean success = super.loadDefault();

		updateEnable(this.store.getString(IParConstants.PRE_PARTITIONING_ALG));

		return success;
	}


}
