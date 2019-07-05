package org.eclipse.app4mc.amalthea.validation.ta.test;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
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
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile;
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
      ret.setAverage(avg);
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
      ret.setAverage(avg);
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
      ret.setAverage(avg);
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
      ret.setAverage(avg);
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
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void test_TABasicContinuousValueBetaDistribution() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("ContinuousValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_alphaZero\")"));
    Assert.assertTrue(result.contains("ContinuousValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_alphabetaZero\")"));
    Assert.assertFalse(result.contains("ContinuousValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_ok\")"));
    Assert.assertTrue(result.contains("ContinuousValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_betaZero\")"));
    Assert.assertTrue(result.contains("ContinuousValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_alphabetaZero\")"));
    Assert.assertFalse(result.contains("ContinuousValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Variable Rate Stimulus \"vrs_ok\")"));
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_meanLess\")"));
    Assert.assertTrue(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_meanMore\")"));
    Assert.assertFalse(result.contains("ContinuousValueGaussDistribution: mean is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"));
    Assert.assertFalse(result.contains("ContinuousValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_TABasicContinuousValueInterval() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("ContinuousValueInterval: lower bound is higher than the upper: (20.0 > 10.0, in Variable Rate Stimulus \"vrs_more\")"));
    Assert.assertFalse(result.contains("ContinuousValueInterval: lower bound is higher than the upper: (20.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_TABasicContinuousValueStatistics() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("ContinuousValueStatistics: average is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_avgLess\")"));
    Assert.assertTrue(result.contains("ContinuousValueStatistics: average is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_avgMore\")"));
    Assert.assertFalse(result.contains("ContinuousValueStatistics: average is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"));
    Assert.assertFalse(result.contains("ContinuousValueStatistics: average is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_TABasicContinuousValueWeibullEstimatorsDistribution() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is less than the lower bound: (10.0 < 20.0, in Variable Rate Stimulus \"vrs_avgLess\")"));
    Assert.assertTrue(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is greater than the upper bound: (50.0 > 40.0, in Variable Rate Stimulus \"vrs_avgMore\")"));
    Assert.assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is less than the lower bound: (30.0 < 20.0, in Variable Rate Stimulus \"vrs_ok\")"));
    Assert.assertFalse(result.contains("ContinuousValueWeibullEstimatorsDistribution: average is greater than the upper bound: (30.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_TABasicTruncatedContinuousValueDistribution() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TruncatedContinuousValueDistribution: lower bound is higher than the upper: (20.0 > 10.0, in Variable Rate Stimulus \"vrs_more\")"));
    Assert.assertFalse(result.contains("TruncatedContinuousValueDistribution: lower bound is higher than the upper: (20.0 > 40.0, in Variable Rate Stimulus \"vrs_ok\")"));
  }
  
  @Test
  public void test_TABasicDiscreteValueBetaDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<Ticks> _function_3 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVBetaD(0.5d, 0.5d, 20l, 40l));
          };
          this.b3.ticks(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_alphaZero");
          final Procedure1<Ticks> _function_4 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVBetaD(0d, 0.5d, 20l, 40l));
          };
          this.b3.ticks(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_betaZero");
          final Procedure1<Ticks> _function_5 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVBetaD(0.5d, 0d, 20l, 40l));
          };
          this.b3.ticks(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_5 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_alphabetaZero");
          final Procedure1<Ticks> _function_6 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVBetaD(0d, 0d, 20l, 40l));
          };
          this.b3.ticks(it_2, _function_6);
        };
        this.b3.runnable(it_1, _function_5);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("DiscreteValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_alphaZero\")"));
    Assert.assertTrue(result.contains("DiscreteValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_alphabetaZero\")"));
    Assert.assertFalse(result.contains("DiscreteValueBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_ok\")"));
    Assert.assertTrue(result.contains("DiscreteValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_betaZero\")"));
    Assert.assertTrue(result.contains("DiscreteValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_alphabetaZero\")"));
    Assert.assertFalse(result.contains("DiscreteValueBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicDiscreteValueGaussDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<Ticks> _function_3 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVGaussD(30d, 10d, 20, 40));
          };
          this.b3.ticks(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_meanLess");
          final Procedure1<Ticks> _function_4 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVGaussD(10d, 10d, 20, 40));
          };
          this.b3.ticks(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_meanMore");
          final Procedure1<Ticks> _function_5 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVGaussD(50d, 10d, 20, 40));
          };
          this.b3.ticks(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (10.0 < 20, in Runnable \"r_meanLess\")"));
    Assert.assertTrue(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (50.0 > 40, in Runnable \"r_meanMore\")"));
    Assert.assertFalse(result.contains("DiscreteValueGaussDistribution: mean is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"));
    Assert.assertFalse(result.contains("DiscreteValueGaussDistribution: mean is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicDiscreteValueInterval() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<Ticks> _function_3 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVUniformD(20, 40));
          };
          this.b3.ticks(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_more");
          final Procedure1<Ticks> _function_4 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVUniformD(20, 10));
          };
          this.b3.ticks(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("DiscreteValueInterval: lower bound is higher than the upper: (20 > 10, in Runnable \"r_more\")"));
    Assert.assertFalse(result.contains("DiscreteValueInterval: lower bound is higher than the upper: (20 < 40, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicDiscreteValueStatistics() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<Ticks> _function_3 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVStatistics(30d, 20, 40));
          };
          this.b3.ticks(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgLess");
          final Procedure1<Ticks> _function_4 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVStatistics(10d, 20, 40));
          };
          this.b3.ticks(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgMore");
          final Procedure1<Ticks> _function_5 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVStatistics(50d, 20, 40));
          };
          this.b3.ticks(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("DiscreteValueStatistics: average is less than the lower bound: (10.0 < 20, in Runnable \"r_avgLess\")"));
    Assert.assertTrue(result.contains("DiscreteValueStatistics: average is greater than the upper bound: (50.0 > 40, in Runnable \"r_avgMore\")"));
    Assert.assertFalse(result.contains("DiscreteValueStatistics: average is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"));
    Assert.assertFalse(result.contains("DiscreteValueStatistics: average is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicDiscreteValueWeibullEstimatorsDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<Ticks> _function_3 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVWeibullED(30d, 1d, 20, 40));
          };
          this.b3.ticks(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgLess");
          final Procedure1<Ticks> _function_4 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVWeibullED(10d, 1d, 20, 40));
          };
          this.b3.ticks(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_4 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_avgMore");
          final Procedure1<Ticks> _function_5 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVWeibullED(50d, 1d, 20, 40));
          };
          this.b3.ticks(it_2, _function_5);
        };
        this.b3.runnable(it_1, _function_4);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is less than the lower bound: (10.0 < 20, in Runnable \"r_avgLess\")"));
    Assert.assertTrue(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is greater than the upper bound: (50.0 > 40, in Runnable \"r_avgMore\")"));
    Assert.assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is less than the lower bound: (30.0 < 20, in Runnable \"r_ok\")"));
    Assert.assertFalse(result.contains("DiscreteValueWeibullEstimatorsDistribution: average is greater than the upper bound: (30.0 > 40, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicTruncatedDiscreteValueDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_2 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_ok");
          final Procedure1<Ticks> _function_3 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVGaussD(30d, 10d, 20, 40));
          };
          this.b3.ticks(it_2, _function_3);
        };
        this.b3.runnable(it_1, _function_2);
        final Procedure1<org.eclipse.app4mc.amalthea.model.Runnable> _function_3 = (org.eclipse.app4mc.amalthea.model.Runnable it_2) -> {
          it_2.setName("r_more");
          final Procedure1<Ticks> _function_4 = (Ticks it_3) -> {
            it_3.setDefault(this.createDVGaussD(30d, 10d, 20, 10));
          };
          this.b3.ticks(it_2, _function_4);
        };
        this.b3.runnable(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TruncatedDiscreteValueDistribution: lower bound is higher than the upper: (20 > 10, in Runnable \"r_more\")"));
    Assert.assertFalse(result.contains("TruncatedDiscreteValueDistribution: lower bound is higher than the upper: (20 > 40, in Runnable \"r_ok\")"));
  }
  
  @Test
  public void test_TABasicTimeBetaDistribution() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TimeBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_alphaZero\")"));
    Assert.assertTrue(result.contains("TimeBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_alphabetaZero\")"));
    Assert.assertFalse(result.contains("TimeBetaDistribution: alpha must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_ok\")"));
    Assert.assertTrue(result.contains("TimeBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_betaZero\")"));
    Assert.assertTrue(result.contains("TimeBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_alphabetaZero\")"));
    Assert.assertFalse(result.contains("TimeBetaDistribution: beta must be greater than 0.0d: (0.0 <= 0.0d, in Periodic Stimulus \"ps_ok\")"));
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TimeGaussDistribution: mean is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_meanLess\")"));
    Assert.assertTrue(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_meanMore\")"));
    Assert.assertFalse(result.contains("TimeGaussDistribution: mean is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"));
    Assert.assertFalse(result.contains("TimeGaussDistribution: mean is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"));
  }
  
  @Test
  public void test_TABasicTimeInterval() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TimeInterval: lower bound is higher than the upper: (20 ms > 10 ms, in Periodic Stimulus \"ps_more\")"));
    Assert.assertFalse(result.contains("TimeInterval: lower bound is higher than the upper: (20 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"));
  }
  
  @Test
  public void test_TABasicTimeStatistics() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TimeStatistics: average is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_avgLess\")"));
    Assert.assertTrue(result.contains("TimeStatistics: average is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_avgMore\")"));
    Assert.assertFalse(result.contains("TimeStatistics: average is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"));
    Assert.assertFalse(result.contains("TimeStatistics: average is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"));
  }
  
  @Test
  public void test_TABasicTimeWeibullEstimatorsDistribution() {
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
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TimeWeibullEstimatorsDistribution: average is less than the lower bound: (10 ms < 20 ms, in Periodic Stimulus \"ps_avgLess\")"));
    Assert.assertTrue(result.contains("TimeWeibullEstimatorsDistribution: average is greater than the upper bound: (50 ms > 40 ms, in Periodic Stimulus \"ps_avgMore\")"));
    Assert.assertFalse(result.contains("TimeWeibullEstimatorsDistribution: average is less than the lower bound: (30 ms < 20 ms, in Periodic Stimulus \"ps_ok\")"));
    Assert.assertFalse(result.contains("TimeWeibullEstimatorsDistribution: average is greater than the upper bound: (30 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"));
  }
  
  @Test
  public void test_TABasicTruncatedTimeDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<PeriodicStimulus> _function_2 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_ok");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(30, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(40, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_2);
        final Procedure1<PeriodicStimulus> _function_3 = (PeriodicStimulus it_2) -> {
          it_2.setName("ps_more");
          it_2.setJitter(this.createTGaussD(FactoryUtil.createTime(30, "ms"), FactoryUtil.createTime(10, "ms"), FactoryUtil.createTime(20, "ms"), FactoryUtil.createTime(10, "ms")));
        };
        this.b2.periodicStimulus(it_1, _function_3);
      };
      this.b1.stimuliModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function<ValidationDiagnostic, String> _function_1 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().<String>map(_function_1).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("TruncatedTimeDistribution: lower bound is higher than the upper: (20 ms > 10 ms, in Periodic Stimulus \"ps_more\")"));
    Assert.assertFalse(result.contains("TruncatedTimeDistribution: lower bound is higher than the upper: (20 ms > 40 ms, in Periodic Stimulus \"ps_ok\")"));
  }
}
