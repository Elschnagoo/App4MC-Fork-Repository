/**
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.SporadicActivation;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.model.builder.StimuliBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class EMFIntrinsicTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  @Extension
  private StimuliBuilder b3 = new StimuliBuilder();
  
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
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void testTimeInterval_Bounds() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<SporadicActivation> _function_2 = (SporadicActivation it_2) -> {
          it_2.setName("a1");
          it_2.setOccurrence(FactoryUtil.createTimeBoundaries(FactoryUtil.createTime(5, TimeUnit.NS), FactoryUtil.createTime(1, TimeUnit.NS)));
        };
        this.b2.activation_Sporadic(it_1, _function_2);
        final Procedure1<SporadicActivation> _function_3 = (SporadicActivation it_2) -> {
          it_2.setName("a2");
          it_2.setOccurrence(FactoryUtil.createTimeBoundaries(FactoryUtil.createTime(1, TimeUnit.MS), FactoryUtil.createTime(5, TimeUnit.NS)));
        };
        this.b2.activation_Sporadic(it_1, _function_3);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, EObject> _function_2 = (ValidationDiagnostic it) -> {
      return it.getTargetObject().eContainer();
    };
    final Function1<ValidationDiagnostic, String> _function_3 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final Map<EObject, String> errors = IterableExtensions.<ValidationDiagnostic, EObject, String>toMap(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2, _function_3);
    String _get = errors.get(this.b1.<SporadicActivation>_find(model, SporadicActivation.class, "a1"));
    boolean _equals = Objects.equal(_get, "TimeBoundaries: lower bound > upper bound ( in Sporadic Activation \"a1\" )");
    Assert.assertTrue(_equals);
    String _get_1 = errors.get(this.b1.<SporadicActivation>_find(model, SporadicActivation.class, "a2"));
    boolean _equals_1 = Objects.equal(_get_1, "TimeBoundaries: lower bound > upper bound ( in Sporadic Activation \"a2\" )");
    Assert.assertTrue(_equals_1);
  }
  
  @Test
  public void testTimeTruncatedDistribution_Bounds() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        final Procedure1<SporadicActivation> _function_2 = (SporadicActivation it_2) -> {
          it_2.setName("a1");
          it_2.setOccurrence(FactoryUtil.createTimeGaussDistribution(FactoryUtil.createTime(1, TimeUnit.US), FactoryUtil.createTime(5, TimeUnit.NS), FactoryUtil.createTime(9, TimeUnit.US), FactoryUtil.createTime(7, TimeUnit.US)));
        };
        this.b2.activation_Sporadic(it_1, _function_2);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, EObject> _function_2 = (ValidationDiagnostic it) -> {
      return it.getTargetObject().eContainer();
    };
    final Function1<ValidationDiagnostic, String> _function_3 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final Map<EObject, String> errors = IterableExtensions.<ValidationDiagnostic, EObject, String>toMap(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2, _function_3);
    String _get = errors.get(this.b1.<SporadicActivation>_find(model, SporadicActivation.class, "a1"));
    boolean _equals = Objects.equal(_get, "TimeGaussDistribution: lower bound > upper bound ( in Sporadic Activation \"a1\" )");
    Assert.assertTrue(_equals);
  }
  
  @Test
  public void test_TABasicContinuousValueBetaDistribution() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<StimuliModel> _function_1 = (StimuliModel it_1) -> {
        final Procedure1<VariableRateStimulus> _function_2 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_ok");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0.5d, 0.5d, 20d, 40d));
        };
        this.b3.variableRateStimulus(it_1, _function_2);
        final Procedure1<VariableRateStimulus> _function_3 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_alphaZero");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0d, 0.5d, 20d, 40d));
        };
        this.b3.variableRateStimulus(it_1, _function_3);
        final Procedure1<VariableRateStimulus> _function_4 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_betaZero");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0.5d, 0d, 20d, 40d));
        };
        this.b3.variableRateStimulus(it_1, _function_4);
        final Procedure1<VariableRateStimulus> _function_5 = (VariableRateStimulus it_2) -> {
          it_2.setName("vrs_alphabetaZero");
          it_2.setOccurrencesPerStep(this.createCVBetaD(0d, 0d, 20d, 40d));
        };
        this.b3.variableRateStimulus(it_1, _function_5);
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
    Assert.assertTrue(result.contains("The feature \'alpha\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_alphaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertTrue(result.contains("The feature \'alpha\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_alphabetaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertFalse(result.contains("The feature \'alpha\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_ok\" ) => The value \'0.5\' must be greater than \'0.0\'"));
    Assert.assertTrue(result.contains("The feature \'beta\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_betaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertTrue(result.contains("The feature \'beta\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_alphabetaZero\" ) => The value \'0.0\' must be greater than \'0.0\'"));
    Assert.assertFalse(result.contains("The feature \'beta\' of \'ContinuousValueBetaDistribution\' contains a bad value ( in Variable Rate Stimulus \"vrs_ok\" ) => The value \'0.5\' must be greater than \'0.0\'"));
  }
}
