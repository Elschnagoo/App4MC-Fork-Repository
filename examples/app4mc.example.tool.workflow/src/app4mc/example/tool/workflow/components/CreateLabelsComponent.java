/**
 * *******************************************************************************
 *  Copyright (c) 2013 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package app4mc.example.tool.workflow.components;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;

/**
 * Creates Labels with the specified names and associate them in SW Model
 *
 */
public class CreateLabelsComponent extends WorkflowComponent {


	private List<String> labelNames = new ArrayList<String>();


	@Override
	protected void runInternal(final Context ctx) {
		final Amalthea amaltheaModel = getAmaltheaModel(ctx);

		assert null != amaltheaModel;


		SWModel swModel = amaltheaModel.getSwModel();

		if (swModel == null) {
			/*- Creating object of SW Model from AmaltheaFactory */
			swModel = AmaltheaFactory.eINSTANCE.createSWModel();

			/*- Associating created SW Model object with AMALTHEA model */
			amaltheaModel.setSwModel(swModel);
		}

		for (final String labelName : this.labelNames) {

			final Label label = AmaltheaFactory.eINSTANCE.createLabel();

			label.setName(labelName);

			/*-adding created Label object to SW Model */

			swModel.getLabels().add(label);

		}

		this.log.info("completed execution of CreateLabelsComponent");

	}

	public List<String> getLabelNames() {
		return this.labelNames;
	}

	public void setLabelNames(final List<String> labelNames) {
		this.labelNames = labelNames;
	}

	public void addLabelName(final String labelName) {
		this.labelNames.add(labelName);
	}


}
