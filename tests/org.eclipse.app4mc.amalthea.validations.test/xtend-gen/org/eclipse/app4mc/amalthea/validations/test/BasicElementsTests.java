/**
 * Copyright (c) 2015-2019 Robert Bosch GmbH and others..
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
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.Label;
import org.eclipse.app4mc.amalthea.model.SWModel;
import org.eclipse.app4mc.amalthea.model.builder.AmaltheaBuilder;
import org.eclipse.app4mc.amalthea.model.builder.SoftwareBuilder;
import org.eclipse.app4mc.amalthea.validations.EMFProfile;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.app4mc.validation.util.ValidationExecutor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class BasicElementsTests {
  @Extension
  private AmaltheaBuilder b1 = new AmaltheaBuilder();
  
  @Extension
  private SoftwareBuilder b2 = new SoftwareBuilder();
  
  private final ValidationExecutor executor = new ValidationExecutor(EMFProfile.class);
  
  public List<ValidationDiagnostic> validate(final Amalthea model) {
    List<ValidationDiagnostic> _xblockexpression = null;
    {
      this.executor.validate(model);
      _xblockexpression = this.executor.getResults();
    }
    return _xblockexpression;
  }
  
  @Test
  public void testCustomPropertyNoDuplicateKey() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      it.getCustomProperties().put("SW", null);
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        it_1.getCustomProperties().put("SW", null);
        final Procedure1<Label> _function_2 = (Label it_2) -> {
          it_2.setName("TestLabel");
          it_2.getCustomProperties().put("custom1", null);
          it_2.getCustomProperties().put("custom2", null);
        };
        this.b2.label(it_1, _function_2);
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
    Assert.assertTrue(result.isEmpty());
  }
  
  @SuppressWarnings("unchecked")
  @Test
  public void testCustomPropertyDuplicateKey() {
    final Procedure1<Amalthea> _function = (Amalthea it) -> {
      it.getCustomProperties().put("SW", null);
      final Procedure1<SWModel> _function_1 = (SWModel it_1) -> {
        it_1.getCustomProperties().put("SW", null);
        final Procedure1<Label> _function_2 = (Label it_2) -> {
          it_2.setName("TestLabel");
          it_2.getCustomProperties().put("different", null);
          it_2.getCustomProperties().put("custom", null);
        };
        this.b2.label(it_1, _function_2);
      };
      this.b1.softwareModel(it, _function_1);
    };
    final Amalthea model = this.b1.amalthea(_function);
    final AmaltheaFactory factory = AmaltheaFactory.eINSTANCE;
    final Label label = IterableExtensions.<Label>head(model.getSwModel().getLabels());
    final EObject prop = factory.create(AmaltheaPackage.eINSTANCE.getCustomProperty());
    prop.eSet(prop.eClass().getEStructuralFeature("key"), "custom");
    final EStructuralFeature propFeature = label.eClass().getEStructuralFeature(AmaltheaPackage.LABEL__CUSTOM_PROPERTIES);
    Object _eGet = label.eGet(propFeature);
    ((EList<EObject>) _eGet).add(prop);
    final List<ValidationDiagnostic> validationResult = this.validate(model);
    final Function1<ValidationDiagnostic, Boolean> _function_1 = (ValidationDiagnostic it) -> {
      Severity _severityLevel = it.getSeverityLevel();
      return Boolean.valueOf(Objects.equal(_severityLevel, Severity.ERROR));
    };
    final Function1<ValidationDiagnostic, String> _function_2 = (ValidationDiagnostic it) -> {
      return it.getMessage();
    };
    final List<String> result = IterableExtensions.<String>toList(IterableExtensions.<ValidationDiagnostic, String>map(IterableExtensions.<ValidationDiagnostic>filter(validationResult, _function_1), _function_2));
    Assert.assertTrue(result.contains("The feature \'customProperties\' has a map entry at index 2 with a key that collides with that of the map entry at index 1"));
  }
}
