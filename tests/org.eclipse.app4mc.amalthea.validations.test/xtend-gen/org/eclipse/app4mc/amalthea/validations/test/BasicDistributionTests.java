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
package org.eclipse.app4mc.amalthea.validations.test;

import com.google.common.base.Objects;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.CallGraph;
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics;
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics;
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.Ticks;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class BasicDistributionTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private StimuliBuilder b2 = new StimuliBuilder();
  
  @Extension
  private SoftwareBuilder b3 = new SoftwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(EMFProfile.class);
  
  public ContinuousValueBetaDistribution createCVBetaD(final double alpha, final double beta, final double lower, final double upper) {
    ContinuousValueBetaDistribution _xblockexpression = null;
    {
      final ContinuousValueBetaDistribution ret = AmaltheaFactory.eINSTANCE.createContinuousValueBetaDistribution();
      ret.setAlpha(alpha);
      ret.setBeta(beta);
      ret.setLowerBound(Double.valueOf(lower));
      ret.setUpperBound(Double.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
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
  
  public ContinuousValueUniformDistribution createCVUniformD(final double lower, final double upper) {
    ContinuousValueUniformDistribution _xblockexpression = null;
    {
      final ContinuousValueUniformDistribution ret = AmaltheaFactory.eINSTANCE.createContinuousValueUniformDistribution();
      ret.setLowerBound(Double.valueOf(lower));
      ret.setUpperBound(Double.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public ContinuousValueStatistics createCVStatistics(final double avg, final double lower, final double upper) {
    ContinuousValueStatistics _xblockexpression = null;
    {
      final ContinuousValueStatistics ret = AmaltheaFactory.eINSTANCE.createContinuousValueStatistics();
      ret.setAverage(Double.valueOf(avg));
      ret.setLowerBound(Double.valueOf(lower));
      ret.setUpperBound(Double.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public ContinuousValueWeibullEstimatorsDistribution createCVWeibullED(final double avg, final double prp, final double lower, final double upper) {
    ContinuousValueWeibullEstimatorsDistribution _xblockexpression = null;
    {
      final ContinuousValueWeibullEstimatorsDistribution ret = AmaltheaFactory.eINSTANCE.createContinuousValueWeibullEstimatorsDistribution();
      ret.setAverage(Double.valueOf(avg));
      ret.setPRemainPromille(prp);
      ret.setLowerBound(Double.valueOf(lower));
      ret.setUpperBound(Double.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public DiscreteValueBetaDistribution createDVBetaD(final double alpha, final double beta, final long lower, final long upper) {
    DiscreteValueBetaDistribution _xblockexpression = null;
    {
      final DiscreteValueBetaDistribution ret = AmaltheaFactory.eINSTANCE.createDiscreteValueBetaDistribution();
      ret.setAlpha(alpha);
      ret.setBeta(beta);
      ret.setLowerBound(Long.valueOf(lower));
      ret.setUpperBound(Long.valueOf(upper));
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
  
  public DiscreteValueUniformDistribution createDVUniformD(final long lower, final long upper) {
    DiscreteValueUniformDistribution _xblockexpression = null;
    {
      final DiscreteValueUniformDistribution ret = AmaltheaFactory.eINSTANCE.createDiscreteValueUniformDistribution();
      ret.setLowerBound(Long.valueOf(lower));
      ret.setUpperBound(Long.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public DiscreteValueStatistics createDVStatistics(final double avg, final long lower, final long upper) {
    DiscreteValueStatistics _xblockexpression = null;
    {
      final DiscreteValueStatistics ret = AmaltheaFactory.eINSTANCE.createDiscreteValueStatistics();
      ret.setAverage(Double.valueOf(avg));
      ret.setLowerBound(Long.valueOf(lower));
      ret.setUpperBound(Long.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public DiscreteValueWeibullEstimatorsDistribution createDVWeibullED(final double avg, final double prp, final long lower, final long upper) {
    DiscreteValueWeibullEstimatorsDistribution _xblockexpression = null;
    {
      final DiscreteValueWeibullEstimatorsDistribution ret = AmaltheaFactory.eINSTANCE.createDiscreteValueWeibullEstimatorsDistribution();
      ret.setAverage(Double.valueOf(avg));
      ret.setPRemainPromille(prp);
      ret.setLowerBound(Long.valueOf(lower));
      ret.setUpperBound(Long.valueOf(upper));
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public TimeBetaDistribution createTBetaD(final double alpha, final double beta, final Time lower, final Time upper) {
    TimeBetaDistribution _xblockexpression = null;
    {
      final TimeBetaDistribution ret = AmaltheaFactory.eINSTANCE.createTimeBetaDistribution();
      ret.setAlpha(alpha);
      ret.setBeta(beta);
      ret.setLowerBound(lower);
      ret.setUpperBound(upper);
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
  
  public TimeUniformDistribution createTUniformD(final Time lower, final Time upper) {
    TimeUniformDistribution _xblockexpression = null;
    {
      final TimeUniformDistribution ret = AmaltheaFactory.eINSTANCE.createTimeUniformDistribution();
      ret.setLowerBound(lower);
      ret.setUpperBound(upper);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public TimeStatistics createTStatistics(final Time avg, final Time lower, final Time upper) {
    TimeStatistics _xblockexpression = null;
    {
      final TimeStatistics ret = AmaltheaFactory.eINSTANCE.createTimeStatistics();
      ret.setAverage(avg);
      ret.setLowerBound(lower);
      ret.setUpperBound(upper);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public TimeWeibullEstimatorsDistribution createTWeibullED(final Time avg, final double prp, final Time lower, final Time upper) {
    TimeWeibullEstimatorsDistribution _xblockexpression = null;
    {
      final TimeWeibullEstimatorsDistribution ret = AmaltheaFactory.eINSTANCE.createTimeWeibullEstimatorsDistribution();
      ret.setAverage(avg);
      ret.setPRemainPromille(prp);
      ret.setLowerBound(lower);
      ret.setUpperBound(upper);
      _xblockexpression = ret;
    }
    return _xblockexpression;
  }
  
  public boolean containsAll(final String str, final String... args) {
    for (final String arg : args) {
      boolean _contains = str.contains(arg);
      boolean _not = (!_contains);
      if (_not) {
        return false;
      }
    }
    return true;
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
  public void test_BasicContinuousValueBetaDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0.5d, 0.5d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_alphaZero");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0d, 0.5d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
        final Procedure1<VariableRateStimulus> _function_4 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_betaZero");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0.5d, 0d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_4);
        final Procedure1<VariableRateStimulus> _function_5 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_alphabetaZero");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0d, 0d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_5);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The feature \'alpha\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_alphaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertTrue(result.contains("The feature \'alpha\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_alphabetaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertFalse(result.contains("The feature \'alpha\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_ok\" ) => The value \'0.5\' must be greater than \'0.0\'"));
    Assert.assertTrue(result.contains("The feature \'beta\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_betaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertTrue(result.contains("The feature \'beta\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_alphabetaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertFalse(result.contains("The feature \'beta\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_ok\" ) => The value \'0.5\' must be greater than \'0.0\'"));
  }
  
  @Test
  public void test_BasicContinuousValueInterval() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVUniformD(20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_more");
          it_2.setOccurrencesPerStep(this.createCVUniformD(20d, 10d));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("ContinuousValueUniformDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_more\" )"));
    Assert.assertFalse(result.contains("ContinuousValueUniformDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_ok\" )"));
  }
  
  @Test
  public void test_BasicContinuousValueStatistics() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVStatistics(30d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_avgLess");
          it_2.setOccurrencesPerStep(this.createCVStatistics(10d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
        final Procedure1<VariableRateStimulus> _function_4 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_avgMore");
          it_2.setOccurrencesPerStep(this.createCVStatistics(50d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_4);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("ContinuousValueStatistics: lower bound > average ( in Variable Rate Stimulus \"vrs_avgLess\" )"));
    Assert.assertTrue(result.contains("ContinuousValueStatistics: average > upper bound ( in Variable Rate Stimulus \"vrs_avgMore\" )"));
    Assert.assertFalse(result.contains("ContinuousValueStatistics: lower bound > average ( in Variable Rate Stimulus \"vrs_ok\")"));
    Assert.assertFalse(result.contains("ContinuousValueStatistics: average > upper bound ( in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_BasicContinuousValueWeibullEstimatorsDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVWeibullED(30d, 1d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_avgLess");
          it_2.setOccurrencesPerStep(this.createCVWeibullED(10d, 1d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
        final Procedure1<VariableRateStimulus> _function_4 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_avgMore");
          it_2.setOccurrencesPerStep(this.createCVWeibullED(50d, 1d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_4);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: lower bound > average ( in Variable Rate Stimulus \"vrs_avgLess\" )"));
    Assert.assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: average > upper bound ( in Variable Rate Stimulus \"vrs_avgMore\" )"));
    Assert.assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: lower bound > average ( in Variable Rate Stimulus \"vrs_ok\" )"));
    Assert.assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: average > upper bound ( in Variable Rate Stimulus \"vrs_ok\" )"));
  }
  
  @Test
  public void test_BasicTruncatedContinuousValueDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVGaussD(30d, 10d, 20d, 40d));
        };
        this.b2.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_more");
          it_2.setOccurrencesPerStep(this.createCVGaussD(30d, 10d, 20d, 10d));
        };
        this.b2.variableRateStimulus(it_1, _function_3);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("ContinuousValueGaussDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_more\" )"));
    Assert.assertFalse(result.contains("ContinuousValueGaussDistribution: lower bound > upper bound ( in Variable Rate Stimulus \"vrs_ok\" )"));
  }
  
  @Test
  public void test_BasicDiscreteValueBetaDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_3 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_4 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVBetaD(0.5d, 0.5d, 20l, 40l));
            };
            this.b3.ticks(it_3, _function_4);
          };
          this.b3.callGraph(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_alphaZero");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_5 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVBetaD(0d, 0.5d, 20l, 40l));
            };
            this.b3.ticks(it_3, _function_5);
          };
          this.b3.callGraph(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_betaZero");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_6 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVBetaD(0.5d, 0d, 20l, 40l));
            };
            this.b3.ticks(it_3, _function_6);
          };
          this.b3.callGraph(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_5 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_alphabetaZero");
          final Procedure1<CallGraph> _function_6 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_7 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVBetaD(0d, 0d, 20l, 40l));
            };
            this.b3.ticks(it_3, _function_7);
          };
          this.b3.callGraph(it_2, _function_6);
        };
        this.b3.runnable(it_1, _function_5);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final String alpha = "feature \'alpha\' of \'DiscreteValueBetaDistribution\'";
    final String beta = "feature \'beta\' of \'DiscreteValueBetaDistribution\'";
    final String message = "value \'0.0\' must be greater than \'0.0\'";
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    final Function1<String, Boolean> _function_3 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, alpha, message, "in Runnable \"r_alphaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_3));
    final Function1<String, Boolean> _function_4 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, alpha, message, "in Runnable \"r_alphabetaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_4));
    final Function1<String, Boolean> _function_5 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, alpha, message, "in Runnable \"r_ok\""));
    };
    Assert.assertFalse(IterableExtensions.<String>exists(result, _function_5));
    final Function1<String, Boolean> _function_6 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, beta, message, "in Runnable \"r_betaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_6));
    final Function1<String, Boolean> _function_7 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, beta, message, "in Runnable \"r_alphabetaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_7));
    final Function1<String, Boolean> _function_8 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, beta, message, "in Runnable \"r_ok\""));
    };
    Assert.assertFalse(IterableExtensions.<String>exists(result, _function_8));
  }
  
  @Test
  public void test_BasicDiscreteValueInterval() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_3 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_4 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVUniformD(20, 40));
            };
            this.b3.ticks(it_3, _function_4);
          };
          this.b3.callGraph(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_more");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_5 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVUniformD(20, 10));
            };
            this.b3.ticks(it_3, _function_5);
          };
          this.b3.callGraph(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("DiscreteValueUniformDistribution: lower bound > upper bound ( in Runnable \"r_more\" )"));
    Assert.assertFalse(result.contains("DiscreteValueUniformDistribution: lower bound > upper bound ( in Runnable \"r_ok\" )"));
  }
  
  @Test
  public void test_BasicDiscreteValueStatistics() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_3 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_4 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVStatistics(30d, 20, 40));
            };
            this.b3.ticks(it_3, _function_4);
          };
          this.b3.callGraph(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgLess");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_5 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVStatistics(10d, 20, 40));
            };
            this.b3.ticks(it_3, _function_5);
          };
          this.b3.callGraph(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgMore");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_6 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVStatistics(50d, 20, 40));
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
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("DiscreteValueStatistics: lower bound > average ( in Runnable \"r_avgLess\" )"));
    Assert.assertTrue(result.contains("DiscreteValueStatistics: average > upper bound ( in Runnable \"r_avgMore\" )"));
    Assert.assertFalse(result.contains("DiscreteValueStatistics: lower bound > average ( in Runnable \"r_ok\" )"));
    Assert.assertFalse(result.contains("DiscreteValueStatistics: average > upper bound ( in Runnable \"r_ok\" )"));
  }
  
  @Test
  public void test_BasicDiscreteValueWeibullEstimatorsDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<CallGraph> _function_3 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_4 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVWeibullED(30d, 1d, 20, 40));
            };
            this.b3.ticks(it_3, _function_4);
          };
          this.b3.callGraph(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgLess");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_5 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVWeibullED(10d, 1d, 20, 40));
            };
            this.b3.ticks(it_3, _function_5);
          };
          this.b3.callGraph(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgMore");
          final Procedure1<CallGraph> _function_5 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_6 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVWeibullED(50d, 1d, 20, 40));
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
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: lower bound > average ( in Runnable \"r_avgLess\" )"));
    Assert.assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: average > upper bound ( in Runnable \"r_avgMore\" )"));
    Assert.assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: lower bound > average ( in Runnable \"r_ok\" )"));
    Assert.assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: average > upper bound ( in Runnable \"r_ok\" )"));
  }
  
  @Test
  public void test_BasicTruncatedDiscreteValueDistribution() {
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
          it_2.setName("r_more");
          final Procedure1<CallGraph> _function_4 = (CallGraph it_3) -> {
            final Procedure1<Ticks> _function_5 = (Ticks it_4) -> {
              it_4.setDefault(this.createDVGaussD(30d, 10d, 20, 10));
            };
            this.b3.ticks(it_3, _function_5);
          };
          this.b3.callGraph(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("DiscreteValueGaussDistribution: lower bound > upper bound ( in Runnable \"r_more\" )"));
    Assert.assertFalse(result.contains("DiscreteValueGaussDistribution: lower bound > upper bound ( in Runnable \"r_ok\" )"));
  }
  
  @Test
  public void test_BasicTimeBetaDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTBetaD(0.5d, 0.5d, FactoryUtil.createTime(), FactoryUtil.createTime()));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_alphaZero");
          it_2.setJitter(this.createTBetaD(0d, 0.5d, FactoryUtil.createTime(), FactoryUtil.createTime()));
        };
        this.b2.periodicStimulus(it_1, _function_3);
        final Procedure1<PeriodicStimulus> _function_4 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_betaZero");
          it_2.setJitter(this.createTBetaD(0.5d, 0d, FactoryUtil.createTime(), FactoryUtil.createTime()));
        };
        this.b2.periodicStimulus(it_1, _function_4);
        final Procedure1<PeriodicStimulus> _function_5 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_alphabetaZero");
          it_2.setJitter(this.createTBetaD(0d, 0d, FactoryUtil.createTime(), FactoryUtil.createTime()));
        };
        this.b2.periodicStimulus(it_1, _function_5);
      };
      this.b1.stimuliModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final String alpha = "feature \'alpha\' of \'TimeBetaDistribution\'";
    final String beta = "feature \'beta\' of \'TimeBetaDistribution\'";
    final String message = "value \'0.0\' must be greater than \'0.0\'";
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    final Function1<String, Boolean> _function_3 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, alpha, message, "in Periodic Stimulus \"ps_alphaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_3));
    final Function1<String, Boolean> _function_4 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, alpha, message, "in Periodic Stimulus \"ps_alphabetaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_4));
    final Function1<String, Boolean> _function_5 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, alpha, message, "in Periodic Stimulus \"ps_ok\""));
    };
    Assert.assertFalse(IterableExtensions.<String>exists(result, _function_5));
    final Function1<String, Boolean> _function_6 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, beta, message, "in Periodic Stimulus \"ps_betaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_6));
    final Function1<String, Boolean> _function_7 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, beta, message, "in Periodic Stimulus \"ps_alphabetaZero\""));
    };
    Assert.assertTrue(IterableExtensions.<String>exists(result, _function_7));
    final Function1<String, Boolean> _function_8 = (String it) -> {
      return Boolean.valueOf(this.containsAll(it, beta, message, "in Periodic Stimulus \"ps_ok\""));
    };
    Assert.assertFalse(IterableExtensions.<String>exists(result, _function_8));
  }
  
  @Test
  public void test_BasicTimeInterval() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTUniformD(FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_more");
          it_2.setJitter(this.createTUniformD(FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(10, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_3);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("TimeUniformDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_more\" )"));
    Assert.assertFalse(result.contains("TimeUniformDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_ok\" )"));
  }
  
  @Test
  public void test_BasicTimeStatistics() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTStatistics(FactoryUtil.createTime(30, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_avgLess");
          it_2.setJitter(this.createTStatistics(FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_3);
        final Procedure1<PeriodicStimulus> _function_4 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_avgMore");
          it_2.setJitter(this.createTStatistics(FactoryUtil.createTime(50, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_4);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("TimeStatistics: lower bound > average ( in Periodic Stimulus \"ps_avgLess\" )"));
    Assert.assertTrue(result.contains("TimeStatistics: average > upper bound ( in Periodic Stimulus \"ps_avgMore\" )"));
    Assert.assertFalse(result.contains("TimeStatistics: lower bound > average ( in Periodic Stimulus \"ps_ok\" )"));
    Assert.assertFalse(result.contains("TimeStatistics: average > upper bound ( in Periodic Stimulus \"ps_ok\" )"));
  }
  
  @Test
  public void test_BasicTimeWeibullEstimatorsDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTWeibullED(FactoryUtil.createTime(30, "ms"), 1d, FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_avgLess");
          it_2.setJitter(this.createTWeibullED(FactoryUtil.createTime(10, "ms"), 1d, FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_3);
        final Procedure1<PeriodicStimulus> _function_4 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_avgMore");
          it_2.setJitter(this.createTWeibullED(FactoryUtil.createTime(50, "ms"), 1d, FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_4);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("TimeWeibullEstimatorsDistribution: lower bound > average ( in Periodic Stimulus \"ps_avgLess\" )"));
    Assert.assertTrue(result.contains("TimeWeibullEstimatorsDistribution: average > upper bound ( in Periodic Stimulus \"ps_avgMore\" )"));
    Assert.assertFalse(result.contains("TimeWeibullEstimatorsDistribution: lower bound > average ( in Periodic Stimulus \"ps_ok\" )"));
    Assert.assertFalse(result.contains("TimeWeibullEstimatorsDistribution: average > upper bound ( in Periodic Stimulus \"ps_ok\" )"));
  }
  
  @Test
  public void test_BasicTruncatedTimeDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(30, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), 
            FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_more");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(30, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), 
            FactoryUtil.createTime(10, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_3);
      };
      this.b1.stimuliModel(it, _function_1);
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
    Assert.assertTrue(result.contains("TimeGaussDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_more\" )"));
    Assert.assertFalse(result.contains("TimeGaussDistribution: lower bound > upper bound ( in Periodic Stimulus \"ps_ok\" )"));
  }
}
