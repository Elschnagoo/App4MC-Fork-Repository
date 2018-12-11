/**
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringUtils;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BoundedContinuousDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteBetaDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.DiscreteGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteHistogram;
import org.eclipse.app4mc.amalthea.model.DiscreteHistogramEntry;
import org.eclipse.app4mc.amalthea.model.DiscreteInterval;
import org.eclipse.app4mc.amalthea.model.DiscreteStatistics;
import org.eclipse.app4mc.amalthea.model.DiscreteUniformDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullParametersDistribution;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteDistribution;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class CustomDeviationItemProviderService {
  private static String getContainingFeatureName(final EObject object, final String defaultText, final String separator) {
    EStructuralFeature _eContainingFeature = null;
    if (object!=null) {
      _eContainingFeature=object.eContainingFeature();
    }
    final EStructuralFeature feature = _eContainingFeature;
    String _xifexpression = null;
    if ((feature == null)) {
      _xifexpression = defaultText;
    } else {
      String _name = feature.getName();
      _xifexpression = (_name + separator);
    }
    final String name = _xifexpression;
    return name;
  }
  
  private static String getContainingFeatureName(final EObject object) {
    return CustomDeviationItemProviderService.getContainingFeatureName(object, "", ": ");
  }
  
  private static void addParentLabelNotification(final List<ViewerNotification> list, final Notification notification) {
    CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 1);
  }
  
  private static void addParentLabelNotification(final List<ViewerNotification> list, final Notification notification, final int number) {
    Object _notifier = notification.getNotifier();
    EObject obj = ((EObject) _notifier);
    int i = 0;
    while ((((i = (i + 1)) <= number) && ((obj = obj.eContainer()) != null))) {
      ViewerNotification _viewerNotification = new ViewerNotification(notification, obj, false, true);
      list.add(0, _viewerNotification);
    }
  }
  
  private static String getLabelProviderText(final Object object, final AdapterFactory rootAF) {
    if (((object != null) && rootAF.isFactoryForType(object))) {
      final Object plainAdapter = rootAF.adapt(object, IItemLabelProvider.class);
      if ((plainAdapter instanceof IItemLabelProvider)) {
        return ((IItemLabelProvider)plainAdapter).getText(object);
      }
    }
    return "";
  }
  
  /**
   * Pretty print methods
   */
  private static String ppCamelCase(final String s) {
    return StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(s), " ");
  }
  
  private static String ppName(final String name) {
    return CustomDeviationItemProviderService.ppName(name, "???");
  }
  
  private static String ppName(final String name, final String surrogate) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(name);
    if (_isNullOrEmpty) {
      return surrogate;
    }
    return name;
  }
  
  public static String getDiscreteDeviationText(final DiscreteDeviation dev) {
    String _switchResult = null;
    boolean _matched = false;
    if (dev instanceof DiscreteBetaDistribution) {
      _matched=true;
      _switchResult = "Discrete Beta Distribution";
    }
    if (!_matched) {
      if (dev instanceof DiscreteConstant) {
        _matched=true;
        Long _value = ((DiscreteConstant)dev).getValue();
        String _plus = ("Discrete Constant (value: " + _value);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteGaussDistribution) {
        _matched=true;
        Double _mean = ((DiscreteGaussDistribution)dev).getMean();
        String _plus = ("Discrete Gauss Distribution (mean: " + _mean);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteHistogram) {
        _matched=true;
        _switchResult = "Discrete Histogram";
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteInterval) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(dev);
        _switchResult = ("Discrete Interval " + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteStatistics) {
        _matched=true;
        _switchResult = "Discrete Statistics";
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteUniformDistribution) {
        _matched=true;
        _switchResult = "Discrete Uniform Distribution";
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteWeibullDistribution) {
        _matched=true;
        _switchResult = "Discrete Weibull Distribution";
      }
    }
    return _switchResult;
  }
  
  /**
   * BoundedDiscreteDistributionItemProvider
   */
  public static List<ViewerNotification> getBoundedDiscreteDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(BoundedDiscreteDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_DISCRETE_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_DISCRETE_DISTRIBUTION__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * TruncatedDiscreteDistributionItemProvider
   */
  public static List<ViewerNotification> getTruncatedDiscreteDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TruncatedDiscreteDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_DISCRETE_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_DISCRETE_DISTRIBUTION__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteBetaDistributionItemProvider
   */
  public static String getDiscreteBetaDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteBetaDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteBetaDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteBetaDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_BETA_DISTRIBUTION__ALPHA)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_BETA_DISTRIBUTION__BETA)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteConstantItemProvider
   */
  public static String getDiscreteConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteConstantItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_CONSTANT__VALUE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteGaussDistributionItemProvider
   */
  public static String getDiscreteGaussDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteGaussDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_GAUSS_DISTRIBUTION__MEAN)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_GAUSS_DISTRIBUTION__SD)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteHistogramItemProvider
   */
  public static String getDiscreteHistogramItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteHistogram)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DiscreteHistogramEntryItemProvider
   */
  public static String getDiscreteHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteHistogramEntry)) {
      final long num = ((DiscreteHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.getIntervalText(((DiscreteHistogramEntry)object).getInterval());
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DiscreteIntervalItemProvider
   */
  public static String getDiscreteIntervalItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteInterval)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteIntervalItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_INTERVAL__SAMPLING_TYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * DiscreteStatisticsItemProvider
   */
  public static String getDiscreteStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteStatisticsItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteStatistics.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_STATISTICS__AVERAGE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteUniformDistributionItemProvider
   */
  public static String getDiscreteUniformDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteUniformDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DiscreteWeibullEstimatorsDistributionItemProvider
   */
  public static String getDiscreteWeibullEstimatorsDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteWeibullEstimatorsDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteWeibullEstimatorsDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteWeibullEstimatorsDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteWeibullParametersDistributionItemProvider
   */
  public static String getDiscreteWeibullParametersDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteWeibullParametersDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteDeviationText = CustomDeviationItemProviderService.getDiscreteDeviationText(((DiscreteDeviation)object));
      return (_containingFeatureName + _discreteDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteWeibullParametersDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteWeibullParametersDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  private static String getIntervalText(final Object obj) {
    String s1 = "";
    String s2 = "";
    if ((obj instanceof BoundedDiscreteDistribution)) {
      final Long min = ((BoundedDiscreteDistribution)obj).getLowerBound();
      final Long max = ((BoundedDiscreteDistribution)obj).getUpperBound();
      String _xifexpression = null;
      if ((min == null)) {
        _xifexpression = "???";
      } else {
        _xifexpression = min.toString();
      }
      s1 = _xifexpression;
      String _xifexpression_1 = null;
      if ((max == null)) {
        _xifexpression_1 = "???";
      } else {
        _xifexpression_1 = max.toString();
      }
      s2 = _xifexpression_1;
    } else {
      if ((obj instanceof BoundedContinuousDistribution)) {
        final Double min_1 = ((BoundedContinuousDistribution)obj).getLowerBound();
        final Double max_1 = ((BoundedContinuousDistribution)obj).getUpperBound();
        String _xifexpression_2 = null;
        if ((min_1 == null)) {
          _xifexpression_2 = "???";
        } else {
          _xifexpression_2 = min_1.toString();
        }
        s1 = _xifexpression_2;
        String _xifexpression_3 = null;
        if ((max_1 == null)) {
          _xifexpression_3 = "???";
        } else {
          _xifexpression_3 = max_1.toString();
        }
        s2 = _xifexpression_3;
      } else {
        if ((obj instanceof BoundedTimeDistribution)) {
          final Time min_2 = ((BoundedTimeDistribution)obj).getLowerBound();
          final Time max_2 = ((BoundedTimeDistribution)obj).getUpperBound();
          String _xifexpression_4 = null;
          if ((min_2 == null)) {
            _xifexpression_4 = "???";
          } else {
            _xifexpression_4 = min_2.toString();
          }
          s1 = _xifexpression_4;
          String _xifexpression_5 = null;
          if ((max_2 == null)) {
            _xifexpression_5 = "???";
          } else {
            _xifexpression_5 = max_2.toString();
          }
          s2 = _xifexpression_5;
        } else {
          return "[]";
        }
      }
    }
    return (((("[" + s1) + ", ") + s2) + "]");
  }
}
