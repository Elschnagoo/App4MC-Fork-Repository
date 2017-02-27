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
package org.eclipse.app4mc.multicore.dialogs.openmapping;

import org.eclipse.app4mc.multicore.dialogs.AbstractGroup;
import org.eclipse.app4mc.multicore.openmapping.IOMConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.IntegerFieldEditor;
import org.eclipse.jface.preference.StringFieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class OMSolverSettingsGroup extends AbstractGroup {
	/**
	 * Generate MPS files
	 */
	BooleanFieldEditor genMPS;
	/**
	 * Max. Gap
	 */
	private final StringFieldEditor maxGap;
	/**
	 * Integer Fields array
	 */
	private final IntegerFieldEditor[] integerFields;
	/**
	 * Max Iterations Abort
	 */
	private final static int MAX_IT_ABORT = 0;
	/**
	 * Max Time Abort
	 */
	private final static int MAX_TIME_ABORT = 1;
	/**
	 * Max Iterations Suffice
	 */
	private final static int MAX_IT_SUFFICE = 2;
	/**
	 * Max Time Suffice
	 */
	private final static int MAX_TIME_SUFFICE = 3;

	/**
	 * Constructor
	 *
	 * @param parent
	 *            parent composite
	 * @param store
	 *            preferences store
	 */
	public OMSolverSettingsGroup(final Composite parent, final IPreferenceStore store) {
		super(parent, store);

		final GridLayout layout2row = new GridLayout(2, false);
		final GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		this.integerFields = new IntegerFieldEditor[4];

		// Configure Group
		this.group.setText("Solver Settings");
		this.group.setLayoutData(gridData);
		this.group.setLayout(layout2row);

		this.genMPS = new BooleanFieldEditor(IOMConstants.PRE_CHECK_GENERATE_MPS, "Generate MPS file of ILP problem ",
				this.group);

		this.genMPS.fillIntoGrid(this.group, 2);

		addField(this.genMPS);

		this.maxGap = new StringFieldEditor(IOMConstants.PRE_MAX_GAP, "Max. Gap ", this.group);

		this.maxGap.getTextControl(this.group)
				.setToolTipText("Valid values: 0.0 (best accuracy) - 1.0 (worst accuracy)");

		this.maxGap.fillIntoGrid(this.group, 2);

		addField(this.maxGap);

		// Maximum Iterations to abort
		this.integerFields[MAX_IT_ABORT] = new IntegerFieldEditor(IOMConstants.PRE_MAX_IT_ABORT,
				"Max. Iterations (Abort) ", this.group);

		this.integerFields[MAX_IT_ABORT].setValidRange(0, Integer.MAX_VALUE);

		addField(this.integerFields[MAX_IT_ABORT]);

		// Maximum time to abort
		this.integerFields[MAX_TIME_ABORT] = new IntegerFieldEditor(IOMConstants.PRE_MAX_TIME_ABORT,
				"Max. Time (Abort) ", this.group);

		this.integerFields[MAX_TIME_ABORT].setValidRange(0, Integer.MAX_VALUE);

		addField(this.integerFields[MAX_TIME_ABORT]);

		// Maximum Iterations Suffice
		this.integerFields[MAX_IT_SUFFICE] = new IntegerFieldEditor(IOMConstants.PRE_MAX_IT_SUFFICE,
				"Max. Iterations (Suffice) ", this.group);

		this.integerFields[MAX_IT_SUFFICE].setValidRange(0, Integer.MAX_VALUE);

		addField(this.integerFields[MAX_IT_SUFFICE]);

		// Maximum time suffice
		this.integerFields[MAX_TIME_SUFFICE] = new IntegerFieldEditor(IOMConstants.PRE_MAX_TIME_SUFFICE,
				"Max. Time (Suffice) ", this.group);

		this.integerFields[MAX_TIME_SUFFICE].setValidRange(0, Integer.MAX_VALUE);

		addField(this.integerFields[MAX_TIME_SUFFICE]);


		for (final IntegerFieldEditor field : this.integerFields) {
			field.fillIntoGrid(this.group, 2);
			field.getTextControl(this.group)
					.setToolTipText("Hint: Entering 0 will disable the constraint (i.e. set the value to INT_MAX).");
		}

	}

	/**
	 * @see org.eclipse.app4mc.multicore.dialogs.AbstractGroup#store()
	 */
	@Override
	public boolean store() {

		// Store Generate MPS
		this.genMPS.store();

		// Verify all integer fields
		for (final IntegerFieldEditor integerField : this.integerFields) {
			if (!integerField.isValid()) {
				MessageDialog.openError(this.group.getShell(), "Error", "Incorrect values in Solver Settings section:\n"
						+ integerField.getLabelText() + "accepts values between 0 and " + Integer.MAX_VALUE);
				return false;
			}

			integerField.store();
		}

		// Verify Max Gap
		try {
			final double fMaxGap = Double.parseDouble(this.maxGap.getStringValue());

			if (fMaxGap < 0 || fMaxGap > 1) {
				throw new NumberFormatException("Max. Gap must have a double value between 0.0 and 1.0");
			}

			this.maxGap.store();
		}
		catch (final NumberFormatException e) {
			MessageDialog.openError(this.group.getShell(), "Error",
					"Incorrect values in Solver Settings section:\n" + e.getMessage());

			return false;
		}

		return true;
	}

}
