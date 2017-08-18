/*********************************************************************************
 *  Copyright (c) 2016 Robert Bosch GmbH and others.
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

import org.eclipse.app4mc.amalthea.model.AbstractEventChain;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
import org.eclipse.app4mc.amalthea.model.EventChainItem;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;

public class ConstraintService {

	public List<Event> getEventsFromEventChain(final AbstractEventChain eventChain) {
		final List<Event> result = new ArrayList<>();
		if (null != eventChain) {
			if (null != eventChain.getStimulus()) {
				result.add(eventChain.getStimulus());
			}
			if (!eventChain.getSegments().isEmpty()) {
				for (final EventChainItem item : eventChain.getSegments()) {
					if (item instanceof EventChainReference) {
						result.addAll(getEventsFromEventChain(((EventChainReference) item).getEventChain()));
					}
					if (item instanceof EventChainContainer) {
						result.addAll(getEventsFromEventChain(((EventChainContainer) item).getEventChain()));
					}
				}
			}
			if (null != eventChain.getResponse()) {
				result.add(eventChain.getResponse());
			}
		}
		return result;
	}

	public List<Runnable> getRunnablesFromEventChain(final EventChain eventChain) {
		final List<Runnable> result = new ArrayList<>();
		final List<Event> events = getEventsFromEventChain(eventChain);
		for (final Event event : events) {
			result.addAll(getRunnableEdgeForEvent(event));
		}
		return result;
	}

	public List<Runnable> getRunnableEdgeForEvent(final Event event) {
		final List<Runnable> result = new ArrayList<>();
		if (event instanceof RunnableEvent && null != ((RunnableEvent) event).getEntity()) {
			result.add(((RunnableEvent) event).getEntity());
		}
		return result;
	}

	public String getRunnableEdgeForEventDescription(final Event event) {
		if (event instanceof RunnableEvent) {
			return ((RunnableEvent) event).getEventType().getName();
		}
		return null;
	}

}
