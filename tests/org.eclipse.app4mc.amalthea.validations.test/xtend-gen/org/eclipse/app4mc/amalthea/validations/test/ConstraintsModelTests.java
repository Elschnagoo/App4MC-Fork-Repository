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
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.DataAgeConstraint;
import org.eclipse.app4mc.amalthea.model.DataAgeTime;
import org.eclipse.app4mc.amalthea.model.DelayConstraint;
import org.eclipse.app4mc.amalthea.model.Event;
import org.eclipse.app4mc.amalthea.model.EventChain;
import org.eclipse.app4mc.amalthea.model.EventChainLatencyConstraint;
import org.eclipse.app4mc.amalthea.model.EventModel;
import org.eclipse.app4mc.amalthea.model.EventSynchronizationConstraint;
import org.eclipse.app4mc.amalthea.model.LabelEvent;
import org.eclipse.app4mc.amalthea.model.RepetitionConstraint;
import org.eclipse.app4mc.amalthea.model.SubEventChain;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimingConstraint;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.ConstraintsBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.BasicProfile;
import org.eclipse.app4mc.amalthea.validations.ConstraintsProfile;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
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
  
  private final ValidationExecutor executor = new ValidationExecutor(Collections.<Class<? extends IProfile>>unmodifiableList(CollectionLiterals.<Class<? extends IProfile>>newArrayList(EMFProfile.class, BasicProfile.class, ConstraintsProfile.class)));
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  public DataAgeConstraint createDAC(final String name, final Time lower, final Time upper) {
    DataAgeConstraint _xblockexpression = null;
    {
      final DataAgeConstraint dac = AmaltheaFactory.eINSTANCE.createDataAgeConstraint();
      dac.setName(name);
      final DataAgeTime dat = AmaltheaFactory.eINSTANCE.createDataAgeTime();
      dat.setMinimumTime(lower);
      dat.setMaximumTime(upper);
      dac.setDataAge(dat);
      _xblockexpression = dac;
    }
    return _xblockexpression;
  }
  
  public DelayConstraint createDC(final String name, final Time lower, final Time upper) {
    DelayConstraint _xblockexpression = null;
    {
      final DelayConstraint dc = AmaltheaFactory.eINSTANCE.createDelayConstraint();
      dc.setName(name);
      dc.setLower(lower);
      dc.setUpper(upper);
      _xblockexpression = dc;
    }
    return _xblockexpression;
  }
  
  public EventChainLatencyConstraint createECLC(final String name, final Time lower, final Time upper) {
    EventChainLatencyConstraint _xblockexpression = null;
    {
      final EventChainLatencyConstraint eclc = AmaltheaFactory.eINSTANCE.createEventChainLatencyConstraint();
      eclc.setName(name);
      eclc.setMinimum(lower);
      eclc.setMaximum(upper);
      _xblockexpression = eclc;
    }
    return _xblockexpression;
  }
  
  public RepetitionConstraint createRC(final String name, final Time lower, final Time upper, final Time jitter, final Time period) {
    RepetitionConstraint _xblockexpression = null;
    {
      final RepetitionConstraint rc = AmaltheaFactory.eINSTANCE.createRepetitionConstraint();
      rc.setName(name);
      rc.setLower(lower);
      rc.setUpper(upper);
      rc.setJitter(jitter);
      rc.setPeriod(period);
      _xblockexpression = rc;
    }
    return _xblockexpression;
  }
  
  @Test
  public void testEventChainSimpleGood() {
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
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
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent in_false = ConstraintsModelTests.createLabelEvent("in_false");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
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
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
    final LabelEvent out_false = ConstraintsModelTests.createLabelEvent("out_false");
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
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent mid_false = ConstraintsModelTests.createLabelEvent("mid_false");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
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
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent mid_false = ConstraintsModelTests.createLabelEvent("mid_false");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
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
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
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
    final LabelEvent in = ConstraintsModelTests.createLabelEvent("in");
    final LabelEvent mid = ConstraintsModelTests.createLabelEvent("mid");
    final LabelEvent out = ConstraintsModelTests.createLabelEvent("out");
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
  
  @Test
  public void testDataAgeTime() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<DataAgeConstraint> _dataAgeConstraints = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC = this.createDAC("dac_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"));
        _dataAgeConstraints.add(_createDAC);
        EList<DataAgeConstraint> _dataAgeConstraints_1 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_1 = this.createDAC("dac_min", FactoryUtil.createTime((-1), "ms"), null);
        _dataAgeConstraints_1.add(_createDAC_1);
        EList<DataAgeConstraint> _dataAgeConstraints_2 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_2 = this.createDAC("dac_max", null, FactoryUtil.createTime((-1), "ms"));
        _dataAgeConstraints_2.add(_createDAC_2);
        EList<DataAgeConstraint> _dataAgeConstraints_3 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_3 = this.createDAC("dac_maxmin", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"));
        _dataAgeConstraints_3.add(_createDAC_3);
        EList<DataAgeConstraint> _dataAgeConstraints_4 = it_1.getDataAgeConstraints();
        DataAgeConstraint _createDAC_4 = this.createDAC("dac_maximin", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"));
        _dataAgeConstraints_4.add(_createDAC_4);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Time: minimumTime value must be positive or zero (in Data Age Constraint \"dac_min\")"));
    Assert.assertTrue(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_max\")"));
    Assert.assertTrue(result.contains("Time: minimumTime value must be positive or zero (in Data Age Constraint \"dac_maxmin\")"));
    Assert.assertTrue(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_maxmin\")"));
    Assert.assertTrue(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_maximin\")"));
    Assert.assertFalse(result.contains("Time: minimumTime value must be positive or zero (in Data Age Constraint \"dac_ok\")"));
    Assert.assertFalse(result.contains("Time: maximumTime value must be positive or zero (in Data Age Constraint \"dac_ok\")"));
  }
  
  @Test
  public void testDelayConstraintTime() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        DelayConstraint _createDC = this.createDC("dc_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"));
        _timingConstraints.add(_createDC);
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        DelayConstraint _createDC_1 = this.createDC("dc_lower", FactoryUtil.createTime((-1), "ms"), null);
        _timingConstraints_1.add(_createDC_1);
        EList<TimingConstraint> _timingConstraints_2 = it_1.getTimingConstraints();
        DelayConstraint _createDC_2 = this.createDC("dc_upper", null, FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_2.add(_createDC_2);
        EList<TimingConstraint> _timingConstraints_3 = it_1.getTimingConstraints();
        DelayConstraint _createDC_3 = this.createDC("dc_upperlower", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_3.add(_createDC_3);
        EList<TimingConstraint> _timingConstraints_4 = it_1.getTimingConstraints();
        DelayConstraint _createDC_4 = this.createDC("dc_upperbelower", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_4.add(_createDC_4);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Time: lower value must be positive or zero (in Delay Constraint \"dc_lower\")"));
    Assert.assertTrue(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_upper\")"));
    Assert.assertTrue(result.contains("Time: lower value must be positive or zero (in Delay Constraint \"dc_upperlower\")"));
    Assert.assertTrue(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_upperlower\")"));
    Assert.assertTrue(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_upperbelower\")"));
    Assert.assertFalse(result.contains("Time: lower value must be positive or zero (in Delay Constraint \"dc_ok\")"));
    Assert.assertFalse(result.contains("Time: upper value must be positive or zero (in Delay Constraint \"dc_ok\")"));
  }
  
  @Test
  public void testECLConstraintTime() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC = this.createECLC("eclc_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"));
        _timingConstraints.add(_createECLC);
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_1 = this.createECLC("eclc_lower", FactoryUtil.createTime((-1), "ms"), null);
        _timingConstraints_1.add(_createECLC_1);
        EList<TimingConstraint> _timingConstraints_2 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_2 = this.createECLC("eclc_upper", null, FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_2.add(_createECLC_2);
        EList<TimingConstraint> _timingConstraints_3 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_3 = this.createECLC("eclc_upperlower", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_3.add(_createECLC_3);
        EList<TimingConstraint> _timingConstraints_4 = it_1.getTimingConstraints();
        EventChainLatencyConstraint _createECLC_4 = this.createECLC("eclc_upperbelower", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_4.add(_createECLC_4);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Time: minimum value must be positive or zero (in Event Chain Latency Constraint \"eclc_lower\")"));
    Assert.assertTrue(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upper\")"));
    Assert.assertTrue(result.contains("Time: minimum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upperlower\")"));
    Assert.assertTrue(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upperlower\")"));
    Assert.assertTrue(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_upperbelower\")"));
    Assert.assertFalse(result.contains("Time: minimum value must be positive or zero (in Event Chain Latency Constraint \"eclc_ok\")"));
    Assert.assertFalse(result.contains("Time: maximum value must be positive or zero (in Event Chain Latency Constraint \"eclc_ok\")"));
  }
  
  @Test
  public void testRepetitionConstraintTime() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        RepetitionConstraint _createRC = this.createRC("rc_ok", FactoryUtil.createTime(4, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(1, "ms"), FactoryUtil.createTime(50, "ms"));
        _timingConstraints.add(_createRC);
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_1 = this.createRC("rc_lower", FactoryUtil.createTime((-1), "ms"), null, null, null);
        _timingConstraints_1.add(_createRC_1);
        EList<TimingConstraint> _timingConstraints_2 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_2 = this.createRC("rc_upper", null, FactoryUtil.createTime((-1), "ms"), null, null);
        _timingConstraints_2.add(_createRC_2);
        EList<TimingConstraint> _timingConstraints_3 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_3 = this.createRC("rc_upperlower", FactoryUtil.createTime((-2), "ms"), FactoryUtil.createTime((-1), "ms"), null, null);
        _timingConstraints_3.add(_createRC_3);
        EList<TimingConstraint> _timingConstraints_4 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_4 = this.createRC("rc_upperbelower", FactoryUtil.createTime(0, "ms"), FactoryUtil.createTime((-1), "ms"), null, null);
        _timingConstraints_4.add(_createRC_4);
        EList<TimingConstraint> _timingConstraints_5 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_5 = this.createRC("rc_jitter", null, null, FactoryUtil.createTime((-1), "ms"), null);
        _timingConstraints_5.add(_createRC_5);
        EList<TimingConstraint> _timingConstraints_6 = it_1.getTimingConstraints();
        RepetitionConstraint _createRC_6 = this.createRC("rc_period", null, null, null, FactoryUtil.createTime((-1), "ms"));
        _timingConstraints_6.add(_createRC_6);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Time: lower value must be positive or zero (in Repetition Constraint \"rc_lower\")"));
    Assert.assertTrue(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_upper\")"));
    Assert.assertTrue(result.contains("Time: lower value must be positive or zero (in Repetition Constraint \"rc_upperlower\")"));
    Assert.assertTrue(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_upperlower\")"));
    Assert.assertTrue(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_upperbelower\")"));
    Assert.assertTrue(result.contains("Time: jitter value must be positive or zero (in Repetition Constraint \"rc_jitter\")"));
    Assert.assertTrue(result.contains("Time: period value must be positive or zero (in Repetition Constraint \"rc_period\")"));
    Assert.assertFalse(result.contains("Time: lower value must be positive or zero (in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("Time: upper value must be positive or zero (in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("Time: jitter value must be positive or zero (in Repetition Constraint \"rc_ok\")"));
    Assert.assertFalse(result.contains("Time: period value must be positive or zero (in Repetition Constraint \"rc_ok\")"));
  }
  
  @Test
  public void testSynchronizationConstraintTolerance() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<ConstraintsModel> _function_1 = (ConstraintsModel it_1) -> {
        final EventSynchronizationConstraint sc_ok = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
        sc_ok.setName("sc_ok");
        sc_ok.setTolerance(FactoryUtil.createTime(1, "ms"));
        EList<TimingConstraint> _timingConstraints = it_1.getTimingConstraints();
        _timingConstraints.add(sc_ok);
        final EventSynchronizationConstraint sc_notOk = AmaltheaFactory.eINSTANCE.createEventSynchronizationConstraint();
        sc_notOk.setName("sc_notOk");
        sc_notOk.setTolerance(FactoryUtil.createTime((-42), "ms"));
        EList<TimingConstraint> _timingConstraints_1 = it_1.getTimingConstraints();
        _timingConstraints_1.add(sc_notOk);
      };
      this.b1.constraintsModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.ERROR);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Time: tolerance value must be positive or zero (in Event Synchronization Constraint \"sc_notOk\")"));
    Assert.assertFalse(result.contains("Time: tolerance value must be positive or zero (in Event Synchronization Constraint \"sc_ok\")"));
  }
  
  private static LabelEvent createLabelEvent(final String name) {
    final LabelEvent event = AmaltheaFactory.eINSTANCE.createLabelEvent();
    event.setName(name);
    return event;
  }
}
