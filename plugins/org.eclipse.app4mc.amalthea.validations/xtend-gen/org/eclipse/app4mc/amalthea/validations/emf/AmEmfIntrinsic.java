/**
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.validations.emf;

import java.util.List;
import java.util.Map;
import org.eclipse.app4mc.amalthea.model.util.AmaltheaValidator;
import org.eclipse.app4mc.amalthea.validation.core.AmaltheaValidation;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Checks EMF constraints and generated AMALTHEA invariants
 */
@Validation(id = "AM-EMF-INTRINSIC")
@SuppressWarnings("all")
public class AmEmfIntrinsic extends AmaltheaValidation {
  @Override
  public EClassifier getEClassifier() {
    return EcorePackage.eINSTANCE.getEObject();
  }
  
  @Override
  public void validate(final EObject eObject, final List<ValidationDiagnostic> resultList) {
    EObject _eContainer = eObject.eClass().eContainer();
    boolean _tripleEquals = (_eContainer == AmaltheaValidation.ePackage);
    if (_tripleEquals) {
      BasicDiagnostic diagnostics = new BasicDiagnostic();
      Map<Object, Object> context = null;
      boolean valid = AmaltheaValidator.INSTANCE.validate(eObject.eClass(), eObject, diagnostics, context);
      if ((!valid)) {
        List<Diagnostic> _children = diagnostics.getChildren();
        for (final Diagnostic emfDiagnostic : _children) {
          {
            final Function1<Object, Boolean> _function = (Object e) -> {
              return Boolean.valueOf((e instanceof EObject));
            };
            Object _findFirst = IterableExtensions.findFirst(emfDiagnostic.getData(), _function);
            final EObject problematicObject = ((EObject) _findFirst);
            final Function1<Object, Boolean> _function_1 = (Object e) -> {
              return Boolean.valueOf((e instanceof EStructuralFeature));
            };
            Object _findFirst_1 = IterableExtensions.findFirst(emfDiagnostic.getData(), _function_1);
            final EStructuralFeature problematicFeature = ((EStructuralFeature) _findFirst_1);
            String _message = emfDiagnostic.getMessage();
            EObject _xifexpression = null;
            if ((problematicObject != null)) {
              _xifexpression = problematicObject;
            } else {
              _xifexpression = eObject;
            }
            final ValidationDiagnostic result = new ValidationDiagnostic(_message, _xifexpression, problematicFeature);
            Severity _switchResult = null;
            int _severity = emfDiagnostic.getSeverity();
            switch (_severity) {
              case Diagnostic.INFO:
                _switchResult = Severity.INFO;
                break;
              case Diagnostic.WARNING:
                _switchResult = Severity.WARNING;
                break;
              case Diagnostic.ERROR:
                _switchResult = Severity.ERROR;
                break;
              default:
                _switchResult = Severity.UNDEFINED;
                break;
            }
            result.setSeverityLevel(_switchResult);
            resultList.add(result);
          }
        }
      }
    }
  }
}
