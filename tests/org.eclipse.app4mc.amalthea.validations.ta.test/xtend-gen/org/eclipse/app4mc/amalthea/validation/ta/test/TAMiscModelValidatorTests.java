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
import org.eclipse.app4mc.amalthea.model.OSModel;
import org.eclipse.app4mc.amalthea.model.Semaphore;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.OperatingSystemBuilder;
import org.eclipse.app4mc.amalthea.validations.ta.TimingArchitectsProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class TAMiscModelValidatorTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private OperatingSystemBuilder b2 = new OperatingSystemBuilder();
  
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
  public void test_TAMMiscSemaphore() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      final Procedure1<OSModel> _function_1 = (OSModel it_1) -> {
        final Procedure1<Semaphore> _function_2 = (Semaphore it_2) -> {
          it_2.setName("s_ok");
          it_2.setInitialValue(0);
          it_2.setMaxValue(1);
        };
        this.b2.semaphore(it_1, _function_2);
        final Procedure1<Semaphore> _function_3 = (Semaphore it_2) -> {
          it_2.setName("s_initial");
          it_2.setInitialValue((-1));
          it_2.setMaxValue(1);
        };
        this.b2.semaphore(it_1, _function_3);
        final Procedure1<Semaphore> _function_4 = (Semaphore it_2) -> {
          it_2.setName("s_max");
          it_2.setInitialValue(0);
          it_2.setMaxValue(0);
        };
        this.b2.semaphore(it_1, _function_4);
        final Procedure1<Semaphore> _function_5 = (Semaphore it_2) -> {
          it_2.setName("s_initialmax");
          it_2.setInitialValue(2);
          it_2.setMaxValue(1);
        };
        this.b2.semaphore(it_1, _function_5);
      };
      this.b1.osModel(it, _function_1);
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
    Assert.assertTrue(result.contains("The initial value must not be negative (-1 < 0, in Semaphore \"s_initial\")"));
    Assert.assertTrue(result.contains("The maximum value must be positive (0 <= 0, in Semaphore \"s_max\")"));
    Assert.assertTrue(result.contains("The initial value is greater than the maximum value (2 > 1, in Semaphore \"s_initialmax\")"));
    Assert.assertFalse(result.contains("The initial value must not be negative (0 < 0, in Semaphore \"s_ok\")"));
    Assert.assertFalse(result.contains("The maximum value must be positive (1 <= 0, in Semaphore \"s_ok\")"));
    Assert.assertFalse(result.contains("The initial value is greater than the maximum value (0 > 1, in Semaphore \"s_ok\")"));
  }
}
