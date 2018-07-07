/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.workflow.component;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.CallSequence;
import org.eclipse.app4mc.amalthea.model.CallSequenceItem;
import org.eclipse.app4mc.amalthea.model.GraphEntryBase;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.SchedulePoint;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.app4mc.amalthea.workflow.core.Context;
import org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent;
import org.eclipse.app4mc.amalthea.workflow.core.exception.WorkflowException;

/**
 * This component adds so called {@link SchedulePoint}s to a {@link CallGraph} of a {@link Task}.
 * The {@link Task} must be configured as {@link Preemption#COOPERATIVE}.
 *
 */
public class AddSchedulePoints extends WorkflowComponent {

	/**
	 *
	 */
	public AddSchedulePoints() {
		super();
	}


	/**
	 * @see org.eclipse.app4mc.amalthea.workflow.core.WorkflowComponent#runInternal(org.eclipse.app4mc.amalthea.workflow.core.Context)
	 */
	@Override
	protected void runInternal(final Context ctx) {
		if (null == getAmaltheaModel(ctx).getSwModel()) {
			throw new WorkflowException("No proper SWModel available in slot " + getModelSlot());
		}
		if (getAmaltheaModel(ctx).getSwModel().getTasks().isEmpty()) {
			throw new WorkflowException("No Tasks available to check in slot " + getModelSlot());
		}
		addSchedulePointsToTasks(getAmaltheaModel(ctx).getSwModel().getTasks());
	}
	
	public void addSchedulePointsToTasks(List<Task> tasks) {
		for (final Task task : tasks) {
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
	}
}
