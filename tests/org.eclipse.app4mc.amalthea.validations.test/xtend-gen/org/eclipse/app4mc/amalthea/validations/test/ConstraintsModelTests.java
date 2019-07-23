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

import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder;
import org.eclipse.app4mc.amalthea.validations.ConstraintsProfile;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class ConstraintsModelTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private ConstraintsBuilder b2 = new ConstraintsBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(Collections.<Class<? extends IProfile>>unmodifiableList(CollectionLiterals.<Class<? extends IProfile>>newArrayList(EMFProfile.class, ConstraintsProfile.class)));
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void testEventChainSimpleGood() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, mid, out)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in);
          it_2.setResponse(out);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(mid);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(mid);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.isEmpty());
  }
  
  @Test
  public void testEventChainSimple_UnmatchingStimulusEventAtChainStart() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent in_false = this.createLabelEvent("in_false");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, in_false, mid, out)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in_false);
          it_2.setResponse(out);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(mid);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(mid);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Event Chain \"BasicEventChain\": stimulus of first segment <> stimulus of event chain"));
  }
  
  @Test
  public void testEventChainSimple_UnmatchingResponseEventAtChainEnd() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final LabelEvent out_false = this.createLabelEvent("out_false");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, mid, out, out_false)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in);
          it_2.setResponse(out_false);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(mid);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(mid);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Event Chain \"BasicEventChain\": response of last segment <> response of event chain"));
  }
  
  @Test
  public void testEventChainSimpleBadWrongStimulusInSubEvent() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent mid_false = this.createLabelEvent("mid_false");
    final LabelEvent out = this.createLabelEvent("out");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, mid, mid_false, out)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in);
          it_2.setResponse(out);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(mid);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(mid_false);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"));
  }
  
  @Test
  public void testEventChainSimpleBadWrongResponseInSubEvent() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent mid_false = this.createLabelEvent("mid_false");
    final LabelEvent out = this.createLabelEvent("out");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, mid, mid_false, out)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in);
          it_2.setResponse(out);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(mid_false);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(mid);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"));
  }
  
  @Test
  public void testEventChainSimpleBadMissingStimulusInSubEvent() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, mid, out)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in);
          it_2.setResponse(out);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(mid);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(null);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"));
    Assert.assertTrue(result.contains("The required feature \'stimulus\' of \'SubEventChain SubEvent2\' must be set ( in Event Chain \"BasicEventChain\" )"));
  }
  
  @Test
  public void testEventChainSimpleBadMissingResponseInSubEvent() {
    final LabelEvent in = this.createLabelEvent("in");
    final LabelEvent mid = this.createLabelEvent("mid");
    final LabelEvent out = this.createLabelEvent("out");
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<EventModel> _function_1 = (EventModel it_1) -> {
        it_1.getEvents().addAll(Collections.<Event>unmodifiableList(CollectionLiterals.<Event>newArrayList(in, mid, out)));
      };
      this.b1.eventModel(it, _function_1);
      final Procedure1<ConstraintsModel> _function_2 = (ConstraintsModel it_1) -> {
        final Procedure1<EventChain> _function_3 = (EventChain it_2) -> {
          it_2.setName("BasicEventChain");
          it_2.setStimulus(in);
          it_2.setResponse(out);
          final Procedure1<SubEventChain> _function_4 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent1");
            it_3.setStimulus(in);
            it_3.setResponse(null);
          };
          this.b2.segment_subchain(it_2, _function_4);
          final Procedure1<SubEventChain> _function_5 = (SubEventChain it_3) -> {
            it_3.setName("SubEvent2");
            it_3.setStimulus(mid);
            it_3.setResponse(out);
          };
          this.b2.segment_subchain(it_2, _function_5);
        };
        this.b2.eventChain(it_1, _function_3);
      };
      this.b1.constraintsModel(it, _function_2);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("Event Chain \"BasicEventChain\": response of segment 0 <> stimulus of segment 1"));
    Assert.assertTrue(result.contains("The required feature \'response\' of \'SubEventChain SubEvent1\' must be set ( in Event Chain \"BasicEventChain\" )"));
  }
  
  private LabelEvent createLabelEvent(final String name) {
    final LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent();
    event.setName(name);
    return event;
  }
}
