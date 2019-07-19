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
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TABasicModelValidatorTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private StimuliBuilder b2 = new StimuliBuilder();
  
  @Extension
  private SoftwareBuilder b3 = new SoftwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(TimingArchitectsProfile.class);
  
  public ContinuousValueGaussDistribution createCVGaussD(final double mean, final double sd, final double lower, final double upper) {
    ContinuousValueGaussDistribution _xblockexpression = null;
    {
      final ContinuousValueGaussDistribution ret = AmaltheaFactory.eINSTANCE.createContinuousValueGaussDistribution();
      ret.setMean(mean);
      ret.setSd(sd);
      ret.setLowerBound(Double.valueOf(lower));
      ret.setUpperBound(Double.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public DiscreteValueGaussDistribution createDVGaussD(final double mean, final double sd, final long lower, final long upper) {
    DiscreteValueGaussDistribution _xblockexpression = null;
    {
      final DiscreteValueGaussDistribution ret = AmaltheaFactory.eINSTANCE.createDiscreteValueGaussDistribution();
      ret.setMean(mean);
      ret.setSd(sd);
      ret.setLowerBound(Long.valueOf(lower));
      ret.setUpperBound(Long.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public TimeGaussDistribution createTGaussD(final Time mean, final Time sd, final Time lower, final Time upper) {
    TimeGaussDistribution _xblockexpression = null;
    {
      final TimeGaussDistribution ret = AmaltheaFactory.eINSTANCE.createTimeGaussDistribution();
      ret.setMean(mean);
      ret.setSd(sd);
      ret.setLowerBound(lower);
      ret.setUpperBound(upper);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void test_TABasicContinuousValueGaussDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVGaussD(30d, 10d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_meanLess");
          it_2.setOccurrencesPerStep(this.createCVGaussD(10d, 10d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
        final Procedure1<VariableRateStimulus> _function_4 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_meanMore");
          it_2.setOccurrencesPerStep(this.createCVGaussD(50d, 10d, 20d, 40d));
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
    Assert.assertTrue(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_meanLess\")"));
    Assert.assertTrue(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_meanMore\")"));
    Assert.assertFalse(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"));
    Assert.assertFalse(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_TABasicDiscreteValueGaussDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_3 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_4 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVGaussD(30d, 10d, 20, 40));
            };
            this.b3.ticks(it_3, _function_4);
          };
          this.b3.callGraph(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_meanLess");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_5 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVGaussD(10d, 10d, 20, 40));
            };
            this.b3.ticks(it_3, _function_5);
          };
          this.b3.callGraph(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_meanMore");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_6 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVGaussD(50d, 10d, 20, 40));
            };
            this.b3.ticks(it_3, _function_6);
          };
          this.b3.callGraph(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (10.0 < 20, in Runnable \"r_meanLess\")"));
    Assert.assertTrue(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40, in Runnable \"r_meanMore\")"));
    Assert.assertFalse(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"));
    Assert.assertFalse(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicTimeGaussDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(30, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_meanLess");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_3);
        final Procedure1<PeriodicStimulus> _function_4 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_meanMore");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(50, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_4);
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
    Assert.assertTrue(result.contains("TimeGaussDistribution: mean is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_meanLess\")"));
    Assert.assertTrue(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_meanMore\")"));
    Assert.assertFalse(result.contains("TimeGaussDistribution: mean is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"));
    Assert.assertFalse(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"));
  }
}
