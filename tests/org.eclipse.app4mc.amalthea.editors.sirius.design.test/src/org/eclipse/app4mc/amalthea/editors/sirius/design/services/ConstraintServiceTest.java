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

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
import org.eclipse.app4mc.amalthea.model.EventChainReference;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableEvent;
import org.eclipse.app4mc.amalthea.model.RunnableEventType;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author daniel.kunz@de.bosch.com
 *
 */
public class ConstraintServiceTest {

	private ConstraintService constServ = null;
	private EventChain ec = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		this.constServ = new ConstraintService();
		this.ec = AmaltheaFactory.eINSTANCE.createEventChain();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		this.constServ = null;
		this.ec = null;
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getEventsFromEventChain(org.eclipse.app4mc.amalthea.model.AbstractEventChain)}
	 * .
	 */
	@Test
	public void testGetEventsFromEventChainNull() {
		List<Event> result = this.constServ.getEventsFromEventChain(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getEventsFromEventChain(org.eclipse.app4mc.amalthea.model.AbstractEventChain)}
	 * .
	 */
	@Test
	public void testGetEventsFromEventChainStimulus() {
		Event stimulus = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		this.ec.setStimulus(stimulus);
		List<Event> result = this.constServ.getEventsFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(stimulus));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getEventsFromEventChain(org.eclipse.app4mc.amalthea.model.AbstractEventChain)}
	 * .
	 */
	@Test
	public void testGetEventsFromEventChainResponse() {
		Event response = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		this.ec.setResponse(response);
		List<Event> result = this.constServ.getEventsFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(response));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getEventsFromEventChain(org.eclipse.app4mc.amalthea.model.AbstractEventChain)}
	 * .
	 */
	@Test
	public void testGetEventsFromEventChainStimulusResponse() {
		Event response = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		this.ec.setResponse(response);
		Event stimulus = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		this.ec.setStimulus(stimulus);
		List<Event> result = this.constServ.getEventsFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(2));
		assertThat(result.get(0), sameInstance(stimulus));
		assertThat(result.get(1), sameInstance(response));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getEventsFromEventChain(org.eclipse.app4mc.amalthea.model.AbstractEventChain)}
	 * .
	 */
	@Test
	public void testGetEventsFromEventChainSegmentsSubChain() {
		Event event1 = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		EventChainContainer eci1 = AmaltheaFactory.eINSTANCE.createEventChainContainer();
		SubEventChain sc1 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		sc1.setStimulus(event1);
		eci1.setEventChain(sc1);
		this.ec.getSegments().add(eci1);
		Event event2 = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		EventChainContainer eci2 = AmaltheaFactory.eINSTANCE.createEventChainContainer();
		SubEventChain sc2 = AmaltheaFactory.eINSTANCE.createSubEventChain();
		sc2.setStimulus(event2);
		eci2.setEventChain(sc2);
		this.ec.getSegments().add(eci2);
		List<Event> result = this.constServ.getEventsFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(2));
		assertThat(result.get(0), sameInstance(event1));
		assertThat(result.get(1), sameInstance(event2));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getEventsFromEventChain(org.eclipse.app4mc.amalthea.model.AbstractEventChain)}
	 * .
	 */
	@Test
	public void testGetEventsFromEventChainSegmentsReference() {
		EventChain ec2 = AmaltheaFactory.eINSTANCE.createEventChain();
		Event event1 = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		ec2.setStimulus(event1);
		Event event2 = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		ec2.setResponse(event2);
		EventChainReference eci1 = AmaltheaFactory.eINSTANCE.createEventChainReference();
		eci1.setEventChain(ec2);
		this.ec.getSegments().add(eci1);
		List<Event> result = this.constServ.getEventsFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(2));
		assertThat(result.get(0), sameInstance(event1));
		assertThat(result.get(1), sameInstance(event2));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnablesFromEventChain(org.eclipse.app4mc.amalthea.model.EventChain)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromEventChainNull() {
		List<Runnable> result = this.constServ.getRunnablesFromEventChain(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnablesFromEventChain(org.eclipse.app4mc.amalthea.model.EventChain)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromEventChainNoRunnableEvent() {
		Event response = AmaltheaFactory.eINSTANCE.createProcessEvent();
		this.ec.setResponse(response);
		List<Runnable> result = this.constServ.getRunnablesFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnablesFromEventChain(org.eclipse.app4mc.amalthea.model.EventChain)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromEventChainEmptyRunnableEvent() {
		RunnableEvent response = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		this.ec.setResponse(response);
		List<Runnable> result = this.constServ.getRunnablesFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnablesFromEventChain(org.eclipse.app4mc.amalthea.model.EventChain)}
	 * .
	 */
	@Test
	public void testGetRunnablesFromEventChainRunnableEvent() {
		RunnableEvent response = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		Runnable runnable = AmaltheaFactory.eINSTANCE.createRunnable();
		response.setEntity(runnable);
		this.ec.setResponse(response);
		List<Runnable> result = this.constServ.getRunnablesFromEventChain(this.ec);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), not(true));
		assertThat(result.size(), is(1));
		assertThat(result.get(0), sameInstance(runnable));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnableEdgeForEvent(org.eclipse.app4mc.amalthea.model.Event)}
	 * .
	 */
	@Test
	public void testGetRunnableEdgeForEventNull() {
		List<Runnable> result = this.constServ.getRunnableEdgeForEvent(null);
		assertThat(result, notNullValue());
		assertThat(result.isEmpty(), is(true));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnableEdgeForEventDescription(org.eclipse.app4mc.amalthea.model.Event)}
	 * .
	 */
	@Test
	public void testGetRunnableEdgeForEventDescriptionNull() {
		String result = this.constServ.getRunnableEdgeForEventDescription(null);
		assertThat(result, nullValue());
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnableEdgeForEventDescription(org.eclipse.app4mc.amalthea.model.Event)}
	 * .
	 */
	@Test
	public void testGetRunnableEdgeForEventDescriptionNoRunnableEvent() {
		Event event = AmaltheaFactory.eINSTANCE.createProcessEvent();
		String result = this.constServ.getRunnableEdgeForEventDescription(event);
		assertThat(result, nullValue());
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnableEdgeForEventDescription(org.eclipse.app4mc.amalthea.model.Event)}
	 * .
	 */
	@Test
	public void testGetRunnableEdgeForEventDescriptionRunnableEventDefault() {
		RunnableEvent event = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		String result = this.constServ.getRunnableEdgeForEventDescription(event);
		assertThat(result, is("_all_"));
	}

	/**
	 * Test method for
	 * {@link org.eclipse.app4mc.amalthea.editors.sirius.design.services.ConstraintService#getRunnableEdgeForEventDescription(org.eclipse.app4mc.amalthea.model.Event)}
	 * .
	 */
	@Test
	public void testGetRunnableEdgeForEventDescriptionRunnableEventStart() {
		RunnableEvent event = AmaltheaFactory.eINSTANCE.createRunnableEvent();
		event.setEventType(RunnableEventType.START);
		String result = this.constServ.getRunnableEdgeForEventDescription(event);
		assertThat(result, is("start"));
	}

}
