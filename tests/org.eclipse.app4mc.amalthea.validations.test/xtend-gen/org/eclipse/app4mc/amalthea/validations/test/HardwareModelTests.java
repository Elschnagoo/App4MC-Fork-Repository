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
import org.eclipse.app4mc.amalthea.model.FrequencyDomain;
import org.eclipse.app4mc.amalthea.model.FrequencyUnit;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.HardwareBuilder;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.validations.BasicProfile;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.amalthea.validations.HardwareProfile;
import org.eclipse.app4mc.validation.core.IProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class HardwareModelTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private HardwareBuilder b2 = new HardwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(Collections.<Class<? extends IProfile>>unmodifiableList(CollectionLiterals.<Class<? extends IProfile>>newArrayList(EMFProfile.class, BasicProfile.class, HardwareProfile.class)));
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void testECUType_Attributes_NoDuplicateNameAddAttributeTwice() {
  }
  
  @Test
  public void test_HardwareFrequencyDomainPositive() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<HWModel> _function_1 = (HWModel it_1) -> {
        final Procedure1<FrequencyDomain> _function_2 = (FrequencyDomain it_2) -> {
          it_2.setName("fd_ok");
          it_2.setDefaultValue(FactoryUtil.createFrequency(1, FrequencyUnit.MHZ));
        };
        this.b2.domain_Frequency(it_1, _function_2);
        final Procedure1<FrequencyDomain> _function_3 = (FrequencyDomain it_2) -> {
          it_2.setName("fd_small");
          it_2.setDefaultValue(FactoryUtil.createFrequency(0, FrequencyUnit.MHZ));
        };
        this.b2.domain_Frequency(it_1, _function_3);
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
    Assert.assertTrue(result.contains("Frequency: defaultValue value must be greater than zero ( in Frequency Domain \"fd_small\" )"));
    Assert.assertFalse(result.contains("Frequency: defaultValue value must be greater than zero ( in Frequency Domain \"fd_ok\" )"));
  }
}
