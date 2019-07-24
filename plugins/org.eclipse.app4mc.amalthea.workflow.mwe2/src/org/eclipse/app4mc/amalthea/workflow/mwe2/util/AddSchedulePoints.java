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

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraphItem;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.app4mc.amalthea.workflow.mwe2.AmaltheaWorkflow;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
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

				EList<RunnableCall> calls = SoftwareUtil.collectCallGraphItems(task.getCallGraph(), null, RunnableCall.class);
				
				for (RunnableCall rc : calls) {
					EObject container = rc.eContainer();
					EStructuralFeature feature = rc.eContainingFeature();
					if (container != null && feature != null && feature.isMany()) {
						@SuppressWarnings("unchecked")
						EList<EObject> list = (EList<EObject>) container.eGet(feature);
						int index = list.indexOf(rc);
						list.add(index + 1, AmaltheaFactory.eINSTANCE.createSchedulePoint());
					}
				}
			}
		}
		this.log.info("Finished.");
	}

}
