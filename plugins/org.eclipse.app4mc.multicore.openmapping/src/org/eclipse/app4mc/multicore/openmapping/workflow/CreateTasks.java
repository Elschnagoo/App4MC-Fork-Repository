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
 *   Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.multicore.openmapping.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic.PragmaticTaskGenerator;
import org.eclipse.app4mc.multicore.sharelibs.UniversalHandler;

/**
 *
 *
 */
public class CreateTasks extends WorkflowComponent {

	private String resultSlot = "createtasks";

	private boolean enableLog = false;

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext,
	 *      org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void runInternal(Context ctx) {
		assert null != getAmaltheaModel(ctx).getSwModel() && null != getAmaltheaModel(ctx).getConstraintsModel();
		if (isEnableLog()) {
			UniversalHandler.getInstance().enableVerboseOutput();
		}
		final PragmaticTaskGenerator createTasksAlg = new PragmaticTaskGenerator();
		final Amalthea model = getAmaltheaModelCopy(ctx);
		createTasksAlg.setAmaltheaModel(model);
		createTasksAlg.createTasks();
		
		// Check StimuliModel and SWModel are set
		assert null != createTasksAlg.getAmaltheaOutputModel().getStimuliModel() && null != createTasksAlg.getAmaltheaOutputModel().getSwModel();
		
		model.setSwModel(createTasksAlg.getAmaltheaOutputModel().getSwModel());
		
		// Adding generated stimuli to current stimuli model
		if (null != model.getStimuliModel()) {
			model.getStimuliModel().getStimuli().addAll(createTasksAlg.getAmaltheaOutputModel().getStimuliModel().getStimuli());
			model.getStimuliModel().getClocks().addAll(createTasksAlg.getAmaltheaOutputModel().getStimuliModel().getClocks());
		}
		else {
			model.setStimuliModel(createTasksAlg.getAmaltheaOutputModel().getStimuliModel());
		}
		this.log.info("result saved in model slot [" + getResultSlot() + "]");
		ctx.set(getResultSlot(), model);
	}

	/**
	 * @return the resultSlot
	 */
	public String getResultSlot() {
		return this.resultSlot;
	}

	/**
	 * @param resultSlot
	 *            the resultSlot to set
	 */
	public void setResultSlot(final String resultSlot) {
		this.resultSlot = resultSlot;
	}

	/**
	 * @return the enableLog
	 */
	public boolean isEnableLog() {
		return this.enableLog;
	}

	/**
	 * @param enableLog
	 *            the enableLog to set
	 */
	public void setEnableLog(final boolean enableLog) {
		this.enableLog = enableLog;
	}
}
