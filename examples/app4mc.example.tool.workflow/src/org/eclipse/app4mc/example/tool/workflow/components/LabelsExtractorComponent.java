/**
 ********************************************************************************
 * Copyright (c) 2013 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.example.tool.workflow.components;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.emf.common.util.EList;

/**
 * This component is responsible for extracting the Label objects present inside SW Model and print their names
 *
 */
public class LabelsExtractorComponent extends WorkflowComponent {


	@Override
	protected void runInternal(final Context ctx) {


		final Amalthea amaltheaModel = getAmaltheaModel(ctx);

		assert null != amaltheaModel;

		this.log.info("Starting to extract Labels from the AMALTHEA models...");

		final SWModel swModel = amaltheaModel.getSwModel();

		assert swModel != null;

		if (swModel != null) {
			final EList<Label> labels = swModel.getLabels();

			for (final Label label : labels) {

				final String labelName = label.getName();

				this.log.info(labelName);
			}
		}
		else {
			this.log.warn("Unable to extract Labels as there is Software Model defined in supplied AMALTHEA models ");
		}

		this.log.info("completed execution of LabelsExtractorComponent");

	}

}
