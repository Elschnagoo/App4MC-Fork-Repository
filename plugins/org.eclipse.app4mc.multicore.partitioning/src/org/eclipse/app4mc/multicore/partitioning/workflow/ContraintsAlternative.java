/*******************************************************************************
 * Copyright (c) 2016 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Dortmund University of Applied Sciences and Arts - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.multicore.partitioning.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.multicore.partitioning.algorithms.CreateTAInput;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.multicore.partitioning.algorithms.PartLog;

public class ContraintsAlternative extends WorkflowComponent  {

	private final String resultSlot = "constraintsAlternative";
	private final boolean enableLog = false;

	@Override
	protected void runInternal(Context ctx) {
		final Amalthea modelCopy = getAmaltheaModelCopy(ctx);
		assert null != modelCopy.getSwModel() && null != modelCopy.getConstraintsModel();
		if (modelCopy.getSwModel() == null || modelCopy.getConstraintsModel() == null) {
			PartLog.getInstance().log(
					"No available SWmodel or Constraints model for generating the alternative constraints model. Stopping.",
					null);
			return;
		}
		if (isEnableLog()) {
			PartLog.getInstance().setEnableSourceConsoleLog(true);
		}
		final CreateTAInput ctai = new CreateTAInput();
		ctai.setCm(modelCopy.getConstraintsModel());
		ctai.combineSimilarRSCs();
		modelCopy.setConstraintsModel(ctai.getCm());
		PartLog.getInstance().log("Setting result model in slot: " + getResultSlot());
		ctx.set(getResultSlot(), modelCopy);
		PartLog.getInstance().logSimple("Alternative constraints model generation finished.");
	}

	private String getResultSlot() {
		return this.resultSlot;
	}

	private boolean isEnableLog() {
		return this.enableLog;
	}

}
