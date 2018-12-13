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
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BoundedContinuousDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousBetaDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousConstant;
import org.eclipse.app4mc.amalthea.model.ContinuousDeviation;
import org.eclipse.app4mc.amalthea.model.ContinuousGaussDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousHistogram;
import org.eclipse.app4mc.amalthea.model.ContinuousHistogramEntry;
import org.eclipse.app4mc.amalthea.model.ContinuousInterval;
import org.eclipse.app4mc.amalthea.model.ContinuousStatistics;
import org.eclipse.app4mc.amalthea.model.ContinuousUniformDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteBetaDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.DiscreteGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteHistogram;
import org.eclipse.app4mc.amalthea.model.DiscreteHistogramEntry;
import org.eclipse.app4mc.amalthea.model.DiscreteInterval;
import org.eclipse.app4mc.amalthea.model.DiscreteStatistics;
import org.eclipse.app4mc.amalthea.model.DiscreteUniformDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution;
import org.eclipse.app4mc.amalthea.model.TimeConstant;
import org.eclipse.app4mc.amalthea.model.TimeDeviation;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeHistogram;
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry;
import org.eclipse.app4mc.amalthea.model.TimeInterval;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedContinuousDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

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
  
  private static String getIntervalText(final ContinuousDeviation obj) {
    if ((obj == null)) {
      return "[]";
    }
    final Double min = obj.getLowerBound();
    final Double max = obj.getUpperBound();
    String _xifexpression = null;
    if ((min == null)) {
      _xifexpression = "???";
    } else {
      _xifexpression = min.toString();
    }
    final String s1 = _xifexpression;
    String _xifexpression_1 = null;
    if ((max == null)) {
      _xifexpression_1 = "???";
    } else {
      _xifexpression_1 = max.toString();
    }
    final String s2 = _xifexpression_1;
    return (((("[" + s1) + ", ") + s2) + "]");
  }
  
  private static String getIntervalText(final DiscreteDeviation obj) {
    if ((obj == null)) {
      return "[]";
    }
    final Long min = obj.getLowerBound();
    final Long max = obj.getUpperBound();
    String _xifexpression = null;
    if ((min == null)) {
      _xifexpression = "???";
    } else {
      _xifexpression = min.toString();
    }
    final String s1 = _xifexpression;
    String _xifexpression_1 = null;
    if ((max == null)) {
      _xifexpression_1 = "???";
    } else {
      _xifexpression_1 = max.toString();
    }
    final String s2 = _xifexpression_1;
    return (((("[" + s1) + ", ") + s2) + "]");
  }
  
  private static String getIntervalText(final TimeDeviation obj) {
    if ((obj == null)) {
      return "[]";
    }
    final Time min = obj.getLowerBound();
    final Time max = obj.getUpperBound();
    String _xifexpression = null;
    if ((min == null)) {
      _xifexpression = "???";
    } else {
      _xifexpression = min.toString();
    }
    final String s1 = _xifexpression;
    String _xifexpression_1 = null;
    if ((max == null)) {
      _xifexpression_1 = "???";
    } else {
      _xifexpression_1 = max.toString();
    }
    final String s2 = _xifexpression_1;
    return (((("[" + s1) + ", ") + s2) + "]");
  }
  
  public static String getContinuousDeviationText(final ContinuousDeviation dev) {
    String _switchResult = null;
    boolean _matched = false;
    if (dev instanceof ContinuousBetaDistribution) {
      _matched=true;
      _switchResult = "Continuous Beta Distribution";
    }
    if (!_matched) {
      if (dev instanceof ContinuousConstant) {
        _matched=true;
        Double _value = ((ContinuousConstant)dev).getValue();
        String _plus = ("Continuous Constant (value: " + _value);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousGaussDistribution) {
        _matched=true;
        Double _mean = ((ContinuousGaussDistribution)dev).getMean();
        String _plus = ("Continuous Gauss Distribution (mean: " + _mean);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousHistogram) {
        _matched=true;
        _switchResult = "Continuous Histogram";
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousInterval) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(dev);
        _switchResult = ("Continuous Interval " + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousStatistics) {
        _matched=true;
        _switchResult = "Continuous Statistics";
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousUniformDistribution) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(dev);
        _switchResult = ("Continuous Uniform Distribution" + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = "Continuous Weibull Distribution";
      }
    }
    if (!_matched) {
      _switchResult = "<undefined deviation>";
    }
    return _switchResult;
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
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(dev);
        _switchResult = ("Discrete Uniform Distribution" + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = "Discrete Weibull Distribution";
      }
    }
    if (!_matched) {
      _switchResult = "<undefined deviation>";
    }
    return _switchResult;
  }
  
  public static String getTimeDeviationText(final TimeDeviation dev) {
    String _switchResult = null;
    boolean _matched = false;
    if (dev instanceof TimeBetaDistribution) {
      _matched=true;
      _switchResult = "Time Beta Distribution";
    }
    if (!_matched) {
      if (dev instanceof TimeConstant) {
        _matched=true;
        Time _value = ((TimeConstant)dev).getValue();
        String _plus = ("Time Constant (value: " + _value);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof TimeGaussDistribution) {
        _matched=true;
        Time _mean = ((TimeGaussDistribution)dev).getMean();
        String _plus = ("Time Gauss Distribution (mean: " + _mean);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof TimeHistogram) {
        _matched=true;
        _switchResult = "Time Histogram";
      }
    }
    if (!_matched) {
      if (dev instanceof TimeInterval) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(dev);
        _switchResult = ("Time Interval " + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof TimeStatistics) {
        _matched=true;
        _switchResult = "Time Statistics";
      }
    }
    if (!_matched) {
      if (dev instanceof TimeUniformDistribution) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(dev);
        _switchResult = ("Time Uniform Distribution" + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof TimeWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = "Time Weibull Distribution";
      }
    }
    if (!_matched) {
      _switchResult = "<undefined deviation>";
    }
    return _switchResult;
  }
  
  /**
   * BoundedContinuousDistributionItemProvider
   */
  public static List<ViewerNotification> getBoundedContinuousDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(BoundedContinuousDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_CONTINUOUS_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_CONTINUOUS_DISTRIBUTION__UPPER_BOUND)) {
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
   * TruncatedContinuousDistributionItemProvider
   */
  public static List<ViewerNotification> getTruncatedContinuousDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TruncatedContinuousDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_CONTINUOUS_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_CONTINUOUS_DISTRIBUTION__UPPER_BOUND)) {
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
   * ContinuousBetaDistributionItemProvider
   */
  public static String getContinuousBetaDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousBetaDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousBetaDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousBetaDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__ALPHA)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_BETA_DISTRIBUTION__BETA)) {
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
   * ContinuousConstantItemProvider
   */
  public static String getContinuousConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousConstantItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_CONSTANT__VALUE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * ContinuousGaussDistributionItemProvider
   */
  public static String getContinuousGaussDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousGaussDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_GAUSS_DISTRIBUTION__MEAN)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_GAUSS_DISTRIBUTION__SD)) {
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
   * ContinuousHistogramItemProvider
   */
  public static String getContinuousHistogramItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousHistogram)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ContinuousHistogramEntryItemProvider
   */
  public static String getContinuousHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousHistogramEntry)) {
      final long num = ((ContinuousHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.getIntervalText(((ContinuousHistogramEntry)object).getInterval());
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ContinuousIntervalItemProvider
   */
  public static String getContinuousIntervalItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousInterval)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousIntervalItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_INTERVAL__SAMPLING_TYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * ContinuousStatisticsItemProvider
   */
  public static String getContinuousStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousStatisticsItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousStatistics.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_STATISTICS__AVERAGE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * ContinuousUniformDistributionItemProvider
   */
  public static String getContinuousUniformDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousUniformDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ContinuousWeibullEstimatorsDistributionItemProvider
   */
  public static String getContinuousWeibullEstimatorsDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousWeibullEstimatorsDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousDeviationText = CustomDeviationItemProviderService.getContinuousDeviationText(((ContinuousDeviation)object));
      return (_containingFeatureName + _continuousDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousWeibullEstimatorsDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousWeibullEstimatorsDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE)) {
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
   * BoundedTimeDistributionItemProvider
   */
  public static List<ViewerNotification> getBoundedTimeDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(BoundedTimeDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_TIME_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_TIME_DISTRIBUTION__UPPER_BOUND)) {
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
   * TruncatedTimeDistributionItemProvider
   */
  public static List<ViewerNotification> getTruncatedTimeDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TruncatedTimeDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_TIME_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_TIME_DISTRIBUTION__UPPER_BOUND)) {
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
   * TimeBetaDistributionItemProvider
   */
  public static String getTimeBetaDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeBetaDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeBetaDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeBetaDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_BETA_DISTRIBUTION__ALPHA)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_BETA_DISTRIBUTION__BETA)) {
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
   * TimeConstantItemProvider
   */
  public static String getTimeConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeConstantItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_CONSTANT__VALUE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * TimeGaussDistributionItemProvider
   */
  public static String getTimeGaussDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeGaussDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__SD)) {
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
   * TimeHistogramItemProvider
   */
  public static String getTimeHistogramItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeHistogram)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeHistogramEntryItemProvider
   */
  public static String getTimeHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeHistogramEntry)) {
      final long num = ((TimeHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.getIntervalText(((TimeHistogramEntry)object).getInterval());
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeIntervalItemProvider
   */
  public static String getTimeIntervalItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeInterval)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeIntervalItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_INTERVAL__SAMPLING_TYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * TimeStatisticsItemProvider
   */
  public static String getTimeStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeStatisticsItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeStatistics.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_STATISTICS__AVERAGE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * TimeUniformDistributionItemProvider
   */
  public static String getTimeUniformDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeUniformDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeWeibullEstimatorsDistributionItemProvider
   */
  public static String getTimeWeibullEstimatorsDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeWeibullEstimatorsDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((TimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeWeibullEstimatorsDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeWeibullEstimatorsDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE)) {
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
}
