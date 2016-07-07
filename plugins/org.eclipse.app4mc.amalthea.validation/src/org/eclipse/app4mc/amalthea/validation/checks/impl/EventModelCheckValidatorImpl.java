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

package org.eclipse.app4mc.amalthea.validation.checks.impl;

import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.ProcessEvent;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.SemaphoreEvent;
import org.eclipse.app4mc.amalthea.model.StimulusEvent;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.AbstractValidatorImpl;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IEObjectHelper;
import org.eclipse.app4mc.amalthea.sphinx.validation.api.IssueCreator;

public class EventModelCheckValidatorImpl extends AbstractValidatorImpl {

	public EventModelCheckValidatorImpl(final IssueCreator issueCreator) {
		super(issueCreator);
	}


	public EventModelCheckValidatorImpl(final IssueCreator issueCreator, final IEObjectHelper objectHelper) {
		super(issueCreator, objectHelper);
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link LabelEvent} are
	 * complete and correct. If there is a missing mapping information (i.e. no {@link Entity}, {@link Process} or
	 * {@link Runnable}) it will be handled as an error.
	 */
	public void checkLabelEventConstraint(final EventModel eventModel) {

		for (final LabelEvent labelEvent : getObjectHelper().getAllInstancesOf(eventModel, LabelEvent.class)) {

			String eventName = "MISSING_NAME";
			if (labelEvent.getName() != null && !labelEvent.getName().isEmpty()) {
				eventName = labelEvent.getName();
			}

			if (labelEvent.getEntity() == null) {
				this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Entity(), eventName,
						"Entity");
			}

			if (labelEvent.getProcess() == null) {
				this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Process(), eventName,
						"Process (i.e. Task)");
			}

			if (labelEvent.getRunnable() == null) {
				this.issueCreator.issue(labelEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Runnable(), eventName,
						"Runnable");
			}
		}
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link ProcessEvent}
	 * are complete and correct. If there is a missing mapping information (i.e. no {@link Entity} or {@link Core}) it
	 * will be handled as an error.
	 */
	public void checkProcessEventConstraint(final EventModel eventModel) {
		for (final ProcessEvent processEvent : getObjectHelper().getAllInstancesOf(eventModel, ProcessEvent.class)) {

			String eventName = "MISSING_NAME";
			if (processEvent.getName() != null && !processEvent.getName().isEmpty()) {
				eventName = processEvent.getName();
			}

			if (processEvent.getEntity() == null) {
				this.issueCreator.issue(processEvent, AmaltheaPackage.eINSTANCE.getLabelEvent_Entity(), eventName,
						"Entity (i.e. Runnable)");
			}

			if (processEvent.getCore() == null) {
				this.issueCreator.issue(processEvent, AmaltheaPackage.eINSTANCE.getProcessEvent_Core(), eventName,
						"Core");
			}
		}
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link RunnableEvent}
	 * are complete and correct. If there is a missing mapping information (i.e. no {@link Entity}, {@link Core} or
	 * {@link Process}) it will be handled as an error.
	 */
	public void checkRunnableEventConstraint(final EventModel eventModel) {
		for (final RunnableEvent runnableEvent : getObjectHelper().getAllInstancesOf(eventModel, RunnableEvent.class)) {

			String eventName = "MISSING_NAME";
			if (runnableEvent.getName() != null && !runnableEvent.getName().isEmpty()) {
				eventName = runnableEvent.getName();
			}

			if (runnableEvent.getEntity() == null) {
				this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Entity(), eventName,
						"Entity (i.e. Runnable)");
			}

			if (runnableEvent.getCore() == null) {
				this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Core(), eventName,
						"Core");
			}
			if (runnableEvent.getProcess() == null) {
				this.issueCreator.issue(runnableEvent, AmaltheaPackage.eINSTANCE.getRunnableEvent_Process(), eventName,
						"Process (i.e. Task)");
			}
		}
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link SemaphoreEvent}
	 * are complete and correct. If there is a missing mapping information (i.e. no {@link Entity}, {@link Core}, {@link
	 * Process} or {@link Runnable}) it will be handled as an error.
	 */
	public void checkSemaphoreEventConstraint(final EventModel eventModel) {
		for (final SemaphoreEvent semaphoreEvent : getObjectHelper().getAllInstancesOf(eventModel,
				SemaphoreEvent.class)) {

			String eventName = "MISSING_NAME";
			if (semaphoreEvent.getName() != null && !semaphoreEvent.getName().isEmpty()) {
				eventName = semaphoreEvent.getName();
			}

			if (semaphoreEvent.getCore() == null) {
				this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Core(), eventName,
						"Core");
			}
			if (semaphoreEvent.getEntity() == null) {
				this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Entity(), eventName,
						"Entity (i.e. Semaphore)");
			}
			if (semaphoreEvent.getProcess() == null) {
				this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Process(),
						eventName, "Process (i.e. Task)");
			}
			if (semaphoreEvent.getRunnable() == null) {
				this.issueCreator.issue(semaphoreEvent, AmaltheaPackage.eINSTANCE.getSemaphoreEvent_Runnable(),
						eventName, "Runnable");
			}
		}
	}

	/*
	 * Checks for the AMALTHEA {@link EventsModel} in AMALTHEA if the mapping information for all {@link StimulusEvent}
	 * are complete and correct. If there is a missing mapping information (i.e. no {@link Entity}) it will be handled
	 * as an error.
	 */
	public void checkStimulusEventConstraint(final EventModel eventModel) {
		for (final StimulusEvent stimulusEvent : getObjectHelper().getAllInstancesOf(eventModel, StimulusEvent.class)) {

			String eventName = "MISSING_NAME";
			if (stimulusEvent.getName() != null && !stimulusEvent.getName().isEmpty()) {
				eventName = stimulusEvent.getName();
			}

			if (stimulusEvent.getEntity() == null) {
				this.issueCreator.issue(stimulusEvent, AmaltheaPackage.eINSTANCE.getStimulusEvent_Entity(), eventName,
						"Entity (i.e. Periodic, Inter Process, ...)");
			}
		}
	}
}
