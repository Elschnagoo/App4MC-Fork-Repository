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

import java.util.HashMap;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.INamed;
import org.eclipse.app4mc.amalthea.model.IReferable;
import org.eclipse.app4mc.amalthea.model.util.AmaltheaValidator;
import org.eclipse.app4mc.validation.annotation.Validation;
import org.eclipse.app4mc.validation.core.IValidation;
import org.eclipse.app4mc.validation.core.Severity;
import org.eclipse.app4mc.validation.core.ValidationDiagnostic;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Checks EMF constraints and generated AMALTHEA invariants
 */
@Validation(id = "AM-EMF-INTRINSIC")
@SuppressWarnings("all")
public class AmEmfIntrinsic implements IValidation {
  private final HashMap<Object, Object> CONTEXT = AmEmfIntrinsic.createContextMap();
  
  @Override
  public EPackage getEPackage() {
    return AmaltheaPackage.eINSTANCE;
  }
  
  @Override
  public EClassifier getEClassifier() {
    return EcorePackage.eINSTANCE.getEObject();
  }
  
  @Override
  public void validate(final EObject eObject, final List<ValidationDiagnostic> resultList) {
    EObject _eContainer = eObject.eClass().eContainer();
    EPackage _ePackage = this.getEPackage();
    boolean _tripleEquals = (_eContainer == _ePackage);
    if (_tripleEquals) {
      BasicDiagnostic diagnostics = new BasicDiagnostic();
      boolean valid = AmaltheaValidator.INSTANCE.validate(eObject.eClass(), eObject, diagnostics, this.CONTEXT);
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
            String _containerInfo2 = this.containerInfo2(problematicObject);
            String _plus = (_message + _containerInfo2);
            final Function1<Diagnostic, String> _function_2 = (Diagnostic it) -> {
              return it.getMessage();
            };
            final Function1<String, CharSequence> _function_3 = (String it) -> {
              return it.trim();
            };
            String _join = IterableExtensions.<String>join(ListExtensions.<Diagnostic, String>map(emfDiagnostic.getChildren(), _function_2), " => ", ", ", "", _function_3);
            String _plus_1 = (_plus + _join);
            EObject _xifexpression = null;
            if ((problematicObject != null)) {
              _xifexpression = problematicObject;
            } else {
              _xifexpression = eObject;
            }
            final ValidationDiagnostic result = new ValidationDiagnostic(_plus_1, _xifexpression, problematicFeature);
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
  
  private String containerInfo2(final EObject object) {
    if ((object == null)) {
      return "";
    }
    final IReferable container = AmaltheaServices.<IReferable>getContainerOfType(object, IReferable.class);
    if (((container == null) || StringExtensions.isNullOrEmpty(container.getName()))) {
      return "";
    }
    String _objectInfo = this.objectInfo(container);
    String _plus = (" ( in " + _objectInfo);
    return (_plus + " )");
  }
  
  private static HashMap<Object, Object> createContextMap() {
    final HashMap<Object, Object> map = new HashMap<Object, Object>();
    map.put(EValidator.SubstitutionLabelProvider.class, new EValidator.SubstitutionLabelProvider() {
      @Override
      public String getFeatureLabel(final EStructuralFeature eStructuralFeature) {
        return eStructuralFeature.getName();
      }
      
      @Override
      public String getObjectLabel(final EObject eObject) {
        String _xblockexpression = null;
        {
          final String s1 = eObject.eClass().getName();
          String _xifexpression = null;
          if ((eObject instanceof INamed)) {
            String _name = ((INamed) eObject).getName();
            _xifexpression = (" " + _name);
          } else {
            _xifexpression = "";
          }
          final String s2 = _xifexpression;
          _xblockexpression = (s1 + s2);
        }
        return _xblockexpression;
      }
      
      @Override
      public String getValueLabel(final EDataType eDataType, final Object value) {
        return EcoreUtil.convertToString(eDataType, value);
      }
    });
    return map;
  }
}
