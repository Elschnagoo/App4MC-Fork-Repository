/**
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 */
package org.eclipse.app4mc.amalthea.validation.ta.test;

import com.google.common.base.Objects;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry;
import org.eclipse.app4mc.amalthea.model.ArrivalCurveStimulus;
import org.eclipse.app4mc.amalthea.model.Clock;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierList;
import org.eclipse.app4mc.amalthea.model.ClockMultiplierListEntry;
import org.eclipse.app4mc.amalthea.model.ClockSinusFunction;
import org.eclipse.app4mc.amalthea.model.ClockTriangleFunction;
import org.eclipse.app4mc.amalthea.model.PeriodicSyntheticStimulus;
import org.eclipse.app4mc.amalthea.model.Scenario;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Stimulus;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TAStimuliModelValidatorTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private StimuliBuilder b2 = new StimuliBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(TimingArchitectsProfile.class);
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  public Scenario createScenario(final Time recurrence) {
    Scenario _xblockexpression = null;
    {
      final Scenario ret = AmaltheaFactory.eINSTANCE.createScenario();
      ret.setRecurrence(recurrence);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public ClockTriangleFunction createCTF(final String name, final double min, final double max) {
    ClockTriangleFunction _xblockexpression = null;
    {
      final ClockTriangleFunction ret = AmaltheaFactory.eINSTANCE.createClockTriangleFunction();
      ret.setName(name);
      ret.setMin(min);
      ret.setMax(max);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public ClockSinusFunction createCSF(final String name, final double amplitude, final double yOffset) {
    ClockSinusFunction _xblockexpression = null;
    {
      final ClockSinusFunction ret = AmaltheaFactory.eINSTANCE.createClockSinusFunction();
      ret.setName(name);
      ret.setAmplitude(amplitude);
      ret.setYOffset(yOffset);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public ClockMultiplierList createCML(final String name, final double... multipliers) {
    ClockMultiplierList _xblockexpression = null;
    {
      final ClockMultiplierList ret = AmaltheaFactory.eINSTANCE.createClockMultiplierList();
      ret.setName(name);
      for (final double multiplier : multipliers) {
        {
          final ClockMultiplierListEntry entry = AmaltheaFactory.eINSTANCE.createClockMultiplierListEntry();
          entry.setMultiplier(multiplier);
          EList<ClockMultiplierListEntry> _entries = ret.getEntries();
          _entries.add(entry);
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
  
  @Test
  public void test_TAStimuliArrivalCurveStimulus() {
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
    Assert.assertTrue(result.contains("The lower time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_small\" must not be negative."));
    Assert.assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_small\" must not be negative."));
    Assert.assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_small\" must not be negative."));
    Assert.assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_small\" must not be negative."));
    Assert.assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_big\" must not be negative."));
    Assert.assertTrue(result.contains("The upper time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_big\" must not be negative."));
    Assert.assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_big\" must not be negative."));
    Assert.assertTrue(result.contains("The upper time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_big\" must not be negative."));
    Assert.assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_ok\" must not be negative."));
    Assert.assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 0 of Arrival Curve Stimulus \"acs_ok\" must not be negative."));
    Assert.assertFalse(result.contains("The lower time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_ok\" must not be negative."));
    Assert.assertFalse(result.contains("The upper time border specified in the Arrival Curve Entry at index 1 of Arrival Curve Stimulus \"acs_ok\" must not be negative."));
  }
  
  @Test
  public void test_TAStimuliClockMultiplierList() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        EList<Clock> _clocks = it_1.getClocks();
        ClockMultiplierList _createCML = this.createCML("cml_ok", 0, 1);
        _clocks.add(_createCML);
        EList<Clock> _clocks_1 = it_1.getClocks();
        ClockMultiplierList _createCML_1 = this.createCML("cml_small", (-1), 0, 1, (-100));
        _clocks_1.add(_createCML_1);
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
    Assert.assertTrue(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 0 of Clock Multiplier List \"cml_small\" must not be negative."));
    Assert.assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 1 of Clock Multiplier List \"cml_small\" must not be negative."));
    Assert.assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 2 of Clock Multiplier List \"cml_small\" must not be negative."));
    Assert.assertTrue(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 3 of Clock Multiplier List \"cml_small\" must not be negative."));
    Assert.assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 0 of Clock Multiplier List \"cml_ok\" must not be negative."));
    Assert.assertFalse(result.contains("The multiplier specified in the Clock Multiplier List Entry at index 1 of Clock Multiplier List \"cml_ok\" must not be negative."));
  }
  
  @Test
  public void test_TAStimuliClockSinusFunction() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        EList<Clock> _clocks = it_1.getClocks();
        ClockSinusFunction _createCSF = this.createCSF("csf_ok", 4, 10);
        _clocks.add(_createCSF);
        EList<Clock> _clocks_1 = it_1.getClocks();
        ClockSinusFunction _createCSF_1 = this.createCSF("csf_amplitude", (-1), 10);
        _clocks_1.add(_createCSF_1);
        EList<Clock> _clocks_2 = it_1.getClocks();
        ClockSinusFunction _createCSF_2 = this.createCSF("csf_yOffset", 0, 0);
        _clocks_2.add(_createCSF_2);
        EList<Clock> _clocks_3 = it_1.getClocks();
        ClockSinusFunction _createCSF_3 = this.createCSF("csf_yOffsetamplitude", (-2), 0);
        _clocks_3.add(_createCSF_3);
        EList<Clock> _clocks_4 = it_1.getClocks();
        ClockSinusFunction _createCSF_4 = this.createCSF("csf_yOffsetiamplitude", 1, 0);
        _clocks_4.add(_createCSF_4);
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
    Assert.assertTrue(result.contains("The amplitude must not be negative (-1.0 < 0.0d, in Clock Sinus Function \"csf_amplitude\")"));
    Assert.assertTrue(result.contains("The yOffset must be positive (0.0 <= 0.0d, in Clock Sinus Function \"csf_yOffset\")"));
    Assert.assertTrue(result.contains("The amplitude must not be negative (-2.0 < 0.0d, in Clock Sinus Function \"csf_yOffsetamplitude\")"));
    Assert.assertTrue(result.contains("The yOffset must be positive (0.0 <= 0.0d, in Clock Sinus Function \"csf_yOffsetamplitude\")"));
    Assert.assertTrue(result.contains("The yOffset must be positive (0.0 <= 0.0d, in Clock Sinus Function \"csf_yOffsetiamplitude\")"));
    Assert.assertTrue(result.contains("The amplitude is greater than the yOffset (1.0 > 0.0, in Clock Sinus Function \"csf_yOffsetiamplitude\")"));
    Assert.assertFalse(result.contains("The amplitude must not be negative (4.0 < 0.0d, in Clock Sinus Function \"csf_ok\")"));
    Assert.assertFalse(result.contains("The yOffset must be positive (10.0 <= 0.0, in Clock Sinus Function \"csf_ok\")"));
    Assert.assertFalse(result.contains("The amplitude is greater than the yOffset (4.0 > 10.0, in Clock Sinus Function \"csf_ok\")"));
  }
  
  @Test
  public void test_TAStimuliClockTriangleFunction() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        EList<Clock> _clocks = it_1.getClocks();
        ClockTriangleFunction _createCTF = this.createCTF("ctf_ok", 4, 10);
        _clocks.add(_createCTF);
        EList<Clock> _clocks_1 = it_1.getClocks();
        ClockTriangleFunction _createCTF_1 = this.createCTF("ctf_min", (-1), 10);
        _clocks_1.add(_createCTF_1);
        EList<Clock> _clocks_2 = it_1.getClocks();
        ClockTriangleFunction _createCTF_2 = this.createCTF("ctf_max", 0, 0);
        _clocks_2.add(_createCTF_2);
        EList<Clock> _clocks_3 = it_1.getClocks();
        ClockTriangleFunction _createCTF_3 = this.createCTF("ctf_maxmin", (-2), 0);
        _clocks_3.add(_createCTF_3);
        EList<Clock> _clocks_4 = it_1.getClocks();
        ClockTriangleFunction _createCTF_4 = this.createCTF("ctf_maximin", 1, 0);
        _clocks_4.add(_createCTF_4);
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
    Assert.assertTrue(result.contains("The min must not be negative (-1.0 < 0.0d, in Clock Triangle Function \"ctf_min\")"));
    Assert.assertTrue(result.contains("The max must be positive (0.0 <= 0.0d, in Clock Triangle Function \"ctf_max\")"));
    Assert.assertTrue(result.contains("The min must not be negative (-2.0 < 0.0d, in Clock Triangle Function \"ctf_maxmin\")"));
    Assert.assertTrue(result.contains("The max must be positive (0.0 <= 0.0d, in Clock Triangle Function \"ctf_maxmin\")"));
    Assert.assertTrue(result.contains("The max must be positive (0.0 <= 0.0d, in Clock Triangle Function \"ctf_maximin\")"));
    Assert.assertTrue(result.contains("The min is greater than the max (1.0 > 0.0, in Clock Triangle Function \"ctf_maximin\")"));
    Assert.assertFalse(result.contains("The min must not be negative (4.0 < 0.0d, in Clock Triangle Function \"ctf_ok\")"));
    Assert.assertFalse(result.contains("The max must be positive (10.0 <= 0.0, in Clock Triangle Function \"ctf_ok\")"));
    Assert.assertFalse(result.contains("The min is greater than the max (4.0 > 10.0, in Clock Triangle Function \"ctf_ok\")"));
  }
  
  @Test
  public void test_TAStimuliPeriodicSyntheticStimulus() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        EList<Stimulus> _stimuli = it_1.getStimuli();
        PeriodicSyntheticStimulus _createPSS = this.createPSS("pss_ok", "ms", 0, 1);
        _stimuli.add(_createPSS);
        EList<Stimulus> _stimuli_1 = it_1.getStimuli();
        PeriodicSyntheticStimulus _createPSS_1 = this.createPSS("pss_small", "ms", (-1), 0, 1, (-100));
        _stimuli_1.add(_createPSS_1);
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
    Assert.assertTrue(result.contains("The occurrence time specified at index 0 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."));
    Assert.assertFalse(result.contains("The occurrence time specified at index 1 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."));
    Assert.assertFalse(result.contains("The occurrence time specified at index 2 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."));
    Assert.assertTrue(result.contains("The occurrence time specified at index 3 of Periodic Synthetic Stimulus \"pss_small\" must not be negative."));
    Assert.assertFalse(result.contains("The occurrence time specified at index 0 of Periodic Synthetic Stimulus \"pss_ok\" must not be negative."));
    Assert.assertFalse(result.contains("The occurrence time specified at index 1 of Periodic Synthetic Stimulus \"pss_ok\" must not be negative."));
  }
  
  @Test
  public void test_TAStimuliVRStimulus() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setScenario(this.createScenario(FactoryUtil.createTime(2, "ms")));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_nos");
        };
        this.b2.variableRateStimulus(it_1, _function_3);
        final Procedure1<VariableRateStimulus> _function_4 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_wrongPeriod");
          it_2.setScenario(this.createScenario(FactoryUtil.createTime(0, "ms")));
        };
        this.b2.variableRateStimulus(it_1, _function_4);
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
    Assert.assertTrue(result.contains("Scenario must be set in Variable Rate Stimulus \"vrs_nos\"."));
    Assert.assertTrue(result.contains("The recurrence time specified in the scenario of Variable Rate Stimulus \"vrs_wrongPeriod\" must be greater than 0."));
    Assert.assertFalse(result.contains("Scenario must be set in Variable Rate Stimulus \"vrs_ok\"."));
    Assert.assertFalse(result.contains("The recurrence time specified in the scenario of Variable Rate Stimulus \"vrs_ok\" must be greater than 0."));
  }
}
