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
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.ClockStep;
import org.eclipse.app4mc.amalthea.model.ClockStepList;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.BasicProfile;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class StimuliModelTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private StimuliBuilder b2 = new StimuliBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(Collections.<Class<? extends IProfile>>unmodifiableList(CollectionLiterals.<Class<? extends IProfile>>newArrayList(EMFProfile.class, BasicProfile.class)));
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  public Scenario createScenario(final double samplingRecurrence) {
    Scenario _xblockexpression = null;
    {
      final Scenario ret = AmaltheaFactory.eINSTANCE.createScenario();
      ret.setSamplingRecurrence(samplingRecurrence);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public ArrivalCurveStimulus createACS(final String name, final String unit, final long... entryPairs) {
    ArrivalCurveStimulus _xblockexpression = null;
    {
      final ArrivalCurveStimulus ret = AmaltheaFactory.eINSTANCE.createArrivalCurveStimulus();
      ret.setName(name);
      {
        int i = 0;
        int _length = entryPairs.length;
        boolean _lessThan = (i < _length);
        boolean _while = _lessThan;
        while (_while) {
          {
            final ArrivalCurveEntry entry = AmaltheaFactory.eINSTANCE.createArrivalCurveEntry();
            entry.setLowerTimeBorder(FactoryUtil.createTime(entryPairs[i], unit));
            int _length_1 = entryPairs.length;
            boolean _lessThan_1 = ((i + 1) < _length_1);
            if (_lessThan_1) {
              entry.setUpperTimeBorder(FactoryUtil.createTime(entryPairs[(i + 1)], unit));
            }
            EList<ArrivalCurveEntry> _entries = ret.getEntries();
            _entries.add(entry);
          }
          int _i = i;
          i = (_i + 2);
          int _length_1 = entryPairs.length;
          boolean _lessThan_1 = (i < _length_1);
          _while = _lessThan_1;
        }
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public PeriodicSyntheticStimulus createPSS(final String name, final String unit, final long... occurrenceTimes) {
    PeriodicSyntheticStimulus _xblockexpression = null;
    {
      final PeriodicSyntheticStimulus ret = AmaltheaFactory.eINSTANCE.createPeriodicSyntheticStimulus();
      ret.setName(name);
      for (final long occurrence : occurrenceTimes) {
        {
          final Time occurrenceTime = FactoryUtil.createTime(occurrence, unit);
          EList<Time> _occurrenceTimes = ret.getOccurrenceTimes();
          _occurrenceTimes.add(occurrenceTime);
        }
      }
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  @Test
  public void testArrivalCurveStimulusTimes() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        EList<Stimulus> _stimuli = it_1.getStimuli();
        ArrivalCurveStimulus _createACS = this.createACS("acs_ok", "ms", 0, 1, 2, 5);
        _stimuli.add(_createACS);
        EList<Stimulus> _stimuli_1 = it_1.getStimuli();
        ArrivalCurveStimulus _createACS_1 = this.createACS("acs_small", "ms", (-1), 0, 1, 100);
        _stimuli_1.add(_createACS_1);
        EList<Stimulus> _stimuli_2 = it_1.getStimuli();
        ArrivalCurveStimulus _createACS_2 = this.createACS("acs_big", "ms", 0, (-1), 1, (-100));
        _stimuli_2.add(_createACS_2);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("Time: lowerTimeBorder value must be positive or zero ( in Arrival Curve Stimulus \"acs_small\" )"));
    Assert.assertTrue(result.contains("Time: upperTimeBorder value must be positive or zero ( in Arrival Curve Stimulus \"acs_big\" )"));
    Assert.assertFalse(result.contains("Time: lowerTimeBorder value must be positive or zero ( in Arrival Curve Stimulus \"acs_ok\" )"));
    Assert.assertFalse(result.contains("Time: upperTimeBorder value must be positive or zero ( in Arrival Curve Stimulus \"acs_ok\" )"));
  }
  
  @Test
  public void testPeriodicSyntheticStimulusTimes() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        EList<Stimulus> _stimuli = it_1.getStimuli();
        PeriodicSyntheticStimulus _createPSS = this.createPSS("pss_ok", "ms", 0, 1);
        _stimuli.add(_createPSS);
        EList<Stimulus> _stimuli_1 = it_1.getStimuli();
        PeriodicSyntheticStimulus _createPSS_1 = this.createPSS("pss_small1", "ms", (-1), 0);
        _stimuli_1.add(_createPSS_1);
        EList<Stimulus> _stimuli_2 = it_1.getStimuli();
        PeriodicSyntheticStimulus _createPSS_2 = this.createPSS("pss_small2", "ms", 0, 0, 1, (-100));
        _stimuli_2.add(_createPSS_2);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("Time: occurrenceTimes value must be positive or zero ( in Periodic Synthetic Stimulus \"pss_small1\" )"));
    Assert.assertTrue(result.contains("Time: occurrenceTimes value must be positive or zero ( in Periodic Synthetic Stimulus \"pss_small2\" )"));
    Assert.assertFalse(result.contains("Time: occurrenceTimes value must be positive or zero ( in Periodic Synthetic Stimulus \"pss_ok\" )"));
  }
  
  @Test
  public void testVariableRateStimulusScenario() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setScenario(this.createScenario(2.0));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_wrongPeriod");
          it_2.setScenario(this.createScenario((-1.0)));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
      };
      this.b1.stimuliModel(it, _function_1);
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
    this.executor.dumpResultMap(null);
    Assert.assertTrue(result.contains("The feature \'samplingRecurrence\' of \'Scenario\' contains a bad value ( in Variable Rate Stimulus \"vrs_wrongPeriod\" ) => The value \'-1.0\' must be greater than or equal to \'0.0\'"));
    Assert.assertTrue(result.contains("The required feature \'clock\' of \'Scenario\' must be set ( in Variable Rate Stimulus \"vrs_wrongPeriod\" )"));
  }
  
  @Test
  public void testClockStepListTimesAndFrequencies() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<ClockStepList> _function_2 = (ClockStepList it_2) -> {
          it_2.setName("csl_ok");
          it_2.setPeriod(FactoryUtil.createTime(10, "ms"));
          EList<ClockStep> _entries = it_2.getEntries();
          ClockStep _createClockStep = FactoryUtil.createClockStep(0, FrequencyUnit.HZ, 0, "ms");
          _entries.add(_createClockStep);
          EList<ClockStep> _entries_1 = it_2.getEntries();
          ClockStep _createClockStep_1 = FactoryUtil.createClockStep(2, FrequencyUnit.HZ, 3, "ms");
          _entries_1.add(_createClockStep_1);
        };
        this.b2.clockStepList(it_1, _function_2);
        final Procedure1<ClockStepList> _function_3 = (ClockStepList it_2) -> {
          it_2.setName("csl_period");
          it_2.setPeriod(FactoryUtil.createTime(0, "ms"));
        };
        this.b2.clockStepList(it_1, _function_3);
        final Procedure1<ClockStepList> _function_4 = (ClockStepList it_2) -> {
          it_2.setName("csl_frequency");
          EList<ClockStep> _entries = it_2.getEntries();
          ClockStep _createClockStep = FactoryUtil.createClockStep((-1), FrequencyUnit.HZ, 0, "ms");
          _entries.add(_createClockStep);
        };
        this.b2.clockStepList(it_1, _function_4);
        final Procedure1<ClockStepList> _function_5 = (ClockStepList it_2) -> {
          it_2.setName("csl_time");
          EList<ClockStep> _entries = it_2.getEntries();
          ClockStep _createClockStep = FactoryUtil.createClockStep(0, FrequencyUnit.HZ, (-1), "ms");
          _entries.add(_createClockStep);
        };
        this.b2.clockStepList(it_1, _function_5);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("Time: period value must be greater than zero ( in Clock Step List \"csl_period\" )"));
    Assert.assertTrue(result.contains("The feature \'value\' of \'Frequency\' contains a bad value ( in Clock Step List \"csl_frequency\" ) => The value \'-1.0\' must be greater than or equal to \'0.0\'"));
    Assert.assertTrue(result.contains("Time: time value must be positive or zero ( in Clock Step List \"csl_time\" )"));
    Assert.assertFalse(result.contains("Time: period value must be greater than zero ( in Clock Step List \"csl_ok\" )"));
    Assert.assertFalse(result.contains("The feature \'value\' of \'Frequency\' contains a bad value ( in Clock Step List \"csl_ok\" ) => The value \'0.0\' must be greater than or equal to \'0.0\'"));
    Assert.assertFalse(result.contains("Time: time value must be positive or zero ( in Clock Step List \"csl_ok\" )"));
  }
}
