/**
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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
package org.eclipse.app4mc.amalthea.model.provider;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.Collections;
import java.util.function.Function;
import org.eclipse.app4mc.amalthea.model.AmaltheaServices;
import org.eclipse.app4mc.amalthea.model.CallArgument;
import org.eclipse.app4mc.amalthea.model.DataDependency;
import org.eclipse.app4mc.amalthea.model.DirectionType;
import org.eclipse.app4mc.amalthea.model.EnumMode;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.Mode;
import org.eclipse.app4mc.amalthea.model.ModeLabel;
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess;
import org.eclipse.app4mc.amalthea.model.ModeLiteral;
import org.eclipse.app4mc.amalthea.model.ModeValue;
import org.eclipse.app4mc.amalthea.model.NumericMode;
import org.eclipse.app4mc.amalthea.model.RunnableCall;
import org.eclipse.app4mc.amalthea.model.RunnableItem;
import org.eclipse.app4mc.amalthea.model.RunnableParameter;
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sphinx.emf.util.EObjectUtil;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class CustomPropertyDescriptorService {
  /**
   * NeedEntry Property Descriptors
   */
  public static Collection<?> getNeedEntryValuesForKey(final Object object) {
    final UniqueEList<Object> choiceOfValues = new UniqueEList<Object>();
    choiceOfValues.add(null);
    final Function1<HwFeatureCategory, String> _function = (HwFeatureCategory it) -> {
      return it.getName();
    };
    choiceOfValues.addAll(
      IterableExtensions.<String>sort(IterableExtensions.<String>filterNull(ListExtensions.<HwFeatureCategory, String>map(EObjectUtil.<HwFeatureCategory>getAllInstancesOf(((EObject) object), HwFeatureCategory.class, true), _function))));
    return choiceOfValues;
  }
  
  /**
   * CallArgument Property Descriptors
   */
  public static Collection<?> getCallArgumentValuesForParameter(final Object object) {
    if ((object instanceof CallArgument)) {
      final BasicEList<RunnableParameter> choiceOfValues = new BasicEList<RunnableParameter>();
      choiceOfValues.add(null);
      RunnableCall _containingCall = ((CallArgument)object).getContainingCall();
      org.eclipse.app4mc.amalthea.model.Runnable _runnable = null;
      if (_containingCall!=null) {
        _runnable=_containingCall.getRunnable();
      }
      EList<RunnableParameter> _parameters = null;
      if (_runnable!=null) {
        _parameters=_runnable.getParameters();
      }
      choiceOfValues.addAll(_parameters);
      return choiceOfValues;
    }
    return Collections.EMPTY_LIST;
  }
  
  /**
   * DataDependency Property Descriptors
   */
  public static Collection<?> getDataDependencyValuesForParameters(final Object object) {
    if ((object instanceof DataDependency)) {
      final BasicEList<RunnableParameter> choiceOfValues = new BasicEList<RunnableParameter>();
      final org.eclipse.app4mc.amalthea.model.Runnable runnable = AmaltheaServices.<org.eclipse.app4mc.amalthea.model.Runnable>getContainerOfType(((EObject)object), org.eclipse.app4mc.amalthea.model.Runnable.class);
      if ((runnable != null)) {
        final Function1<RunnableParameter, Boolean> _function = (RunnableParameter e) -> {
          return Boolean.valueOf((Objects.equal(e.getDirection(), DirectionType.IN) || Objects.equal(e.getDirection(), DirectionType.INOUT)));
        };
        Iterables.<RunnableParameter>addAll(choiceOfValues, 
          IterableExtensions.<RunnableParameter>filter(runnable.getParameters(), _function));
      }
      return choiceOfValues;
    }
    return Collections.EMPTY_LIST;
  }
  
  public static Collection<?> getDataDependencyValuesForCallArguments(final Object object) {
    if ((object instanceof DataDependency)) {
      final BasicEList<CallArgument> choiceOfValues = new BasicEList<CallArgument>();
      final org.eclipse.app4mc.amalthea.model.Runnable runnable = AmaltheaServices.<org.eclipse.app4mc.amalthea.model.Runnable>getContainerOfType(((EObject)object), org.eclipse.app4mc.amalthea.model.Runnable.class);
      if ((runnable != null)) {
        final Function<RunnableItem, Boolean> _function = (RunnableItem e) -> {
          return Boolean.valueOf((e instanceof RunnableCall));
        };
        final Function1<RunnableItem, EList<CallArgument>> _function_1 = (RunnableItem e) -> {
          return ((RunnableCall) e).getArguments();
        };
        final Function1<CallArgument, Boolean> _function_2 = (CallArgument e) -> {
          boolean _or = false;
          RunnableParameter _parameter = e.getParameter();
          DirectionType _direction = null;
          if (_parameter!=null) {
            _direction=_parameter.getDirection();
          }
          boolean _equals = Objects.equal(_direction, DirectionType.OUT);
          if (_equals) {
            _or = true;
          } else {
            RunnableParameter _parameter_1 = e.getParameter();
            DirectionType _direction_1 = null;
            if (_parameter_1!=null) {
              _direction_1=_parameter_1.getDirection();
            }
            boolean _equals_1 = Objects.equal(_direction_1, DirectionType.INOUT);
            _or = _equals_1;
          }
          return Boolean.valueOf(_or);
        };
        Iterables.<CallArgument>addAll(choiceOfValues, 
          IterableExtensions.<CallArgument>filter(Iterables.<CallArgument>concat(ListExtensions.<RunnableItem, EList<CallArgument>>map(SoftwareUtil.collectRunnableItems(runnable, null, _function), _function_1)), _function_2));
      }
      return choiceOfValues;
    }
    return Collections.EMPTY_LIST;
  }
  
  /**
   * ModeValue Property Descriptors
   */
  public static Collection<?> getValuesForModeValue(final Object object) {
    if ((object instanceof ModeValue)) {
      final BasicEList<String> choiceOfValues = new BasicEList<String>();
      ModeLabel _label = ((ModeValue)object).getLabel();
      Mode _mode = null;
      if (_label!=null) {
        _mode=_label.getMode();
      }
      final Mode mode = _mode;
      if ((mode instanceof NumericMode)) {
        return null;
      }
      if ((mode instanceof EnumMode)) {
        final Function1<ModeLiteral, String> _function = (ModeLiteral e) -> {
          return e.getName();
        };
        choiceOfValues.addAll(ListExtensions.<ModeLiteral, String>map(((EnumMode)mode).getLiterals(), _function));
      }
      return choiceOfValues;
    }
    return Collections.EMPTY_LIST;
  }
  
  /**
   * ModeLabel Property Descriptors
   */
  public static Collection<?> getInitialValuesForModeLabel(final Object object) {
    if ((object instanceof ModeLabel)) {
      final BasicEList<String> choiceOfValues = new BasicEList<String>();
      final Mode mode = ((ModeLabel)object).getMode();
      if ((mode instanceof NumericMode)) {
        return null;
      }
      if ((mode instanceof EnumMode)) {
        final Function1<ModeLiteral, String> _function = (ModeLiteral e) -> {
          return e.getName();
        };
        choiceOfValues.addAll(ListExtensions.<ModeLiteral, String>map(((EnumMode)mode).getLiterals(), _function));
      }
      return choiceOfValues;
    }
    return Collections.EMPTY_LIST;
  }
  
  /**
   * ModeLabelAccess Property Descriptors
   */
  public static Collection<?> getValuesForModeLabelAccess(final Object object) {
    if ((object instanceof ModeLabelAccess)) {
      final BasicEList<String> choiceOfValues = new BasicEList<String>();
      ModeLabel _data = ((ModeLabelAccess)object).getData();
      Mode _mode = null;
      if (_data!=null) {
        _mode=_data.getMode();
      }
      final Mode mode = _mode;
      if ((mode instanceof NumericMode)) {
        return null;
      }
      if ((mode instanceof EnumMode)) {
        final Function1<ModeLiteral, String> _function = (ModeLiteral e) -> {
          return e.getName();
        };
        choiceOfValues.addAll(ListExtensions.<ModeLiteral, String>map(((EnumMode)mode).getLiterals(), _function));
      }
      return choiceOfValues;
    }
    return Collections.EMPTY_LIST;
  }
}
