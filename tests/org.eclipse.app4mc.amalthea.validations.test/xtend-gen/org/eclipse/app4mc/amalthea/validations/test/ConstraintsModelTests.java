/**
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 */
package org.eclipse.app4mc.amalthea.validations.test;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainContainer;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("all")
public class ConstraintsModelTests {
  @Before
  public void setUp() {
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  @Test
  public void testEventChainSimpleGood() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in, out);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, mid);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", mid, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  public void testEventChainSimple_UnmatchingStimulusEventAtChainStart() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent in_false = this.createLabelEvent("in_false");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in_false, out);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, mid);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", mid, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  @Test
  public void testEventChainSimple_UnmatchingResponseEventAtChainEnd() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out_false = this.createLabelEvent("out_false");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in, out_false);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, mid);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", mid, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  @Test
  public void testEventChainSimpleBadWrongStimulusInSubEvent() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent mid_false = this.createLabelEvent("mid_false");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in, out);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, mid);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", mid_false, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  @Test
  public void testEventChainSimpleBadWrongResponseInSubEvent() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent mid_false = this.createLabelEvent("mid_false");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in, out);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, mid_false);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", mid, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  @Test
  public void testEventChainSimpleBadMissingStimulusInSubEvent() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in, out);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, mid);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", null, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  /**
   * Test for validation method {@link ConstraintsModelCheckValidator#eventChainConstraint(AMALTHEA)}
   */
  @Test
  public void testEventChainSimpleBadMissingResponseInSubEvent() {
    final ConstraintsModel constraintsModel = AmaltheaFactory.eINSTANCE.createConstraintsModel();
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final EventChain simpleEC = this.createEventChain("BasicEventChain", in, out);
    final EventChainContainer subEC1 = this.createContainedSubChain("SubEvent1", in, null);
    final EventChainContainer subEC2 = this.createContainedSubChain("SubEvent2", mid, out);
    constraintsModel.getEventChains().add(simpleEC);
    simpleEC.getSegments().add(subEC1);
    simpleEC.getSegments().add(subEC2);
  }
  
  private LabelEvent createLabelEvent(final String name) {
    final LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent();
    event.setName(name);
    return event;
  }
  
  private EventChain createEventChain(final String name, final Event stimulus, final Event response) {
    final EventChain chain = AmaltheaFactory.eINSTANCE.createEventChain();
    chain.setName(name);
    chain.setStimulus(stimulus);
    chain.setResponse(response);
    return chain;
  }
  
  private EventChainContainer createContainedSubChain(final String name, final Event stimulus, final Event response) {
    final SubEventChain subchain = AmaltheaFactory.eINSTANCE.createSubEventChain();
    subchain.setName(name);
    subchain.setStimulus(stimulus);
    subchain.setResponse(response);
    final EventChainContainer container = AmaltheaFactory.eINSTANCE.createEventChainContainer();
    container.setEventChain(subchain);
    return container;
  }
}
