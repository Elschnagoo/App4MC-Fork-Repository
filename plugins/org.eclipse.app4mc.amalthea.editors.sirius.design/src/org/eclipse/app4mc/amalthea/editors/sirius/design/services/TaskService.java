/*********************************************************************************
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
package org.eclipse.app4mc.amalthea.editors.sirius.design.services;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.editors.sirius.command.OpenGraphicalEditorAction;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.LabelAccess;
import org.eclipse.app4mc.amalthea.model.Preemption;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.Task;
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.sirius.diagram.DNodeContainer;

public class TaskService {

	public boolean checkTaskPreemptive(final Task task) {
		if (null != task && task.getPreemption().equals(Preemption.PREEMPTIVE)) {
			return true;
		}
		return false;
	}

	public boolean checkTaskPreemptionUnknown(final Task task) {
		if (null != task && task.getPreemption().equals(Preemption._UNDEFINED_)) {
			return true;
		}
		return false;
	}

	public List<Runnable> getRunnablesFromTask(final Task task) {
		final List<Runnable> result = new ArrayList<>();
		if (null != task && null != task.getCallGraph()) {
			final TreeIterator<EObject> iter = EcoreUtil.getAllContents(task.getCallGraph().getGraphEntries());
			while (iter.hasNext()) {
				final EObject item = iter.next();
				if (item instanceof TaskRunnableCall && null != ((TaskRunnableCall) item).getRunnable()) {
					result.add(((TaskRunnableCall) item).getRunnable());
				}
			}
		}
		return result;
	}

	public List<Label> getAccessedLabelsOfTask(final Task task) {
		final List<Label> result = new ArrayList<>();
		final List<Runnable> runnables = getRunnablesFromTask(task);
		for (final Runnable runnable : runnables) {
			final TreeIterator<EObject> iter = EcoreUtil.getAllContents(runnable.getRunnableItems());
			while (iter.hasNext()) {
				final EObject item = iter.next();
				if (item instanceof LabelAccess && ((LabelAccess) item).getData() != null) {
					result.add(((LabelAccess) item).getData());
				}
			}
		}
		return result;
	}

	public void openTaskEditor(final DNodeContainer container, final Task task) {
		new OpenGraphicalEditorAction<Task>(Task.class, task).executeWithUIThread();
	}

}
