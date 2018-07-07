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

package org.eclipse.app4mc.amalthea.workflow.mwe2.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.workflow.mwe2.AmaltheaWorkflow;
import org.eclipse.emf.mwe.core.WorkflowContext;
import org.eclipse.emf.mwe.core.issues.Issues;
import org.eclipse.emf.mwe.core.monitor.ProgressMonitor;

/**
 * 
 *
 */
public class AddSchedulePoints extends AmaltheaWorkflow {

	public AddSchedulePoints() {
		super();
		this.log = Logger.getLogger("AddSchedulePoints");
	}

	/**
	 * @see org.eclipse.emf.mwe.core.lib.AbstractWorkflowComponent#invokeInternal(org.eclipse.emf.mwe.core.WorkflowContext,
	 *      org.eclipse.emf.mwe.core.monitor.ProgressMonitor, org.eclipse.emf.mwe.core.issues.Issues)
	 */
	@Override
	protected void invokeInternal(final WorkflowContext ctx, final ProgressMonitor monitor, final Issues issues) {
		if (null == getAmaltheaModel(ctx).getSwModel()) {
			issues.addError(this, "No proper SWModel available!", getModelSlot());
			return;
		}
		if (getAmaltheaModel(ctx).getSwModel().getTasks().isEmpty()) {
			issues.addWarning(this, "No Tasks available to check!", getModelSlot());
			return;
		}
		this.log.info("Starting...");
		for (final Task task : getAmaltheaModel(ctx).getSwModel().getTasks()) {
			if (null != task.getCallGraph() && task.getPreemption().equals(Preemption.COOPERATIVE)) {
				this.log.info("Adding schedule points to cooperative Task [" + task.getName() + "]");
				for (final GraphEntryBase graphEntry : task.getCallGraph().getGraphEntries()) {
					// TODO: Check needs to be extended to rest of items
					if (graphEntry instanceof CallSequence) {
						int index = 0;
						final List<CallSequenceItem> tmp = new ArrayList<CallSequenceItem>();
						for (final CallSequenceItem callSeqItem : ((CallSequence) graphEntry).getCalls()) {
							tmp.add(callSeqItem);
							if (callSeqItem instanceof TaskRunnableCall
									&& index != ((CallSequence) graphEntry).getCalls().size() - 1) {
								tmp.add(AmaltheaFactory.eINSTANCE.createSchedulePoint());
							}
							index++;
						}
						((CallSequence) graphEntry).getCalls().clear();
						((CallSequence) graphEntry).getCalls().addAll(tmp);
					}
				}
			}
		}
		this.log.info("Finished.");
	}

}
