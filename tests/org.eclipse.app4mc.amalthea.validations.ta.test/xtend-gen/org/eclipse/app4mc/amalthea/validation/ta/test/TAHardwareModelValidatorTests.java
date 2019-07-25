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
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.PuType;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
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
public class TAHardwareModelValidatorTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private HardwareBuilder b2 = new HardwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(TimingArchitectsProfile.class);
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void test_TAHardwarePUDIPCMissing() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<HWModel> _function_1 = (HWModel it_1) -> {
        final Procedure1<HwFeatureCategory> _function_2 = (HwFeatureCategory it_2) -> {
          it_2.setName("Instructions");
          final Procedure1<HwFeature> _function_3 = (HwFeature it_3) -> {
            it_3.setName("IPC_core1");
          };
          this.b2.feature(it_2, _function_3);
          final Procedure1<HwFeature> _function_4 = (HwFeature it_3) -> {
            it_3.setName("IPC_core2");
          };
          this.b2.feature(it_2, _function_4);
        };
        this.b2.featureCategory(it_1, _function_2);
        final Procedure1<ProcessingUnitDefinition> _function_3 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("pud_ok");
          it_2.setPuType(PuType.CPU);
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_core1");
          _features.add(__find);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_3);
        final Procedure1<ProcessingUnitDefinition> _function_4 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("pud_noIPC");
          it_2.setPuType(PuType.CPU);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_4);
        final Procedure1<ProcessingUnitDefinition> _function_5 = (ProcessingUnitDefinition it_2) -> {
          it_2.setName("pud_manyIPC");
          it_2.setPuType(PuType.CPU);
          EList<HwFeature> _features = it_2.getFeatures();
          HwFeature __find = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_core1");
          _features.add(__find);
          EList<HwFeature> _features_1 = it_2.getFeatures();
          HwFeature __find_1 = this.b1.<HwFeature>_find(it_2, HwFeature.class, "IPC_core2");
          _features_1.add(__find_1);
        };
        this.b2.definition_ProcessingUnit(it_1, _function_5);
      };
      this.b1.hardwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Predicate<ValidationDiagnostic> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Objects.equal(_severityLevel, Severity.INFO);
    };
    final Function<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = validationResult.stream().filter(_function_1).<String>map(_function_2).collect(Collectors.<String>toList());
    Assert.assertTrue(result.contains("Processing Unit Definition \"pud_manyIPC\" has multiple IPC HwFeatures (only the first will be considered)"));
    Assert.assertTrue(
      result.contains(
        (("Processing Unit Definition \"pud_noIPC\" does not have an IPC specified (default value of 1.0 will be assumed). " + "To specify an IPC value: add a HwFeature in the category named \"Instructions\", set a name that starts with \"IPC_\", set a positive ") + "value, and add it to the feature list of Processing Unit Definition \"pud_noIPC\".")));
    Assert.assertFalse(result.contains("Processing Unit Definition \"pud_ok\" has multiple IPC HwFeatures (only the first will be considered)"));
    Assert.assertFalse(
      result.contains(
        (("Processing Unit Definition \"pud_ok\" does not have an IPC specified (default value of 1.0 will be assumed). " + "To specify an IPC value: add a HwFeature in the category named \"Instructions\", set a name that starts with \"IPC_\", set a positive ") + "value, and add it to the feature list of Processing Unit Definition \"pud_ok\".")));
  }
  
  @Test
  public void test_TAHardwareHWFIPCPositive() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<HWModel> _function_1 = (HWModel it_1) -> {
        final Procedure1<HwFeatureCategory> _function_2 = (HwFeatureCategory it_2) -> {
          it_2.setName("Instructions");
          final Procedure1<HwFeature> _function_3 = (HwFeature it_3) -> {
            it_3.setName("IPC_ok");
            it_3.setValue(1);
          };
          this.b2.feature(it_2, _function_3);
          final Procedure1<HwFeature> _function_4 = (HwFeature it_3) -> {
            it_3.setName("IPC_small");
            it_3.setValue(0);
          };
          this.b2.feature(it_2, _function_4);
        };
        this.b2.featureCategory(it_1, _function_2);
      };
      this.b1.hardwareModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The IPC value must be positive (0.0 <= 0.0d, in Hw Feature \"IPC_small\")"));
    Assert.assertFalse(result.contains("The IPC value must be positive (0.0 <= 0.0d, in Hw Feature \"IPC_ok\")"));
  }
}
