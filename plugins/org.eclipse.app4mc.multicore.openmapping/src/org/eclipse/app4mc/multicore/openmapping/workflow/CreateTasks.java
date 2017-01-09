/**
 * *******************************************************************************
 *  Copyright (c) 2015 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.multicore.openmapping.workflow;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic.PragmaticTaskGenerator;
import org.eclipse.app4mc.multicore.openmapping.sharedlibs.UniversalHandler;

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
		createTasksAlg.setCommonElements(model.getCommonElements());
		createTasksAlg.setSwModel(model.getSwModel());
		createTasksAlg.setConstraintsModel(model.getConstraintsModel());
		// createTasksAlg.setStimuliModel(model.getStimuliModel());
		createTasksAlg.createTasks();
		assert null != createTasksAlg.getStimuliModel() && null != createTasksAlg.getSwModel();
		model.setSwModel(createTasksAlg.getSwModel());
		// Adding generated stimuli to current stimuli model
		if (null != model.getStimuliModel()) {
			model.getStimuliModel().getStimuli().addAll(createTasksAlg.getStimuliModel().getStimuli());
			model.getStimuliModel().getClocks().addAll(createTasksAlg.getStimuliModel().getClocks());
		}
		else {
			model.setStimuliModel(createTasksAlg.getStimuliModel());
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
