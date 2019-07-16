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
package org.eclipse.app4mc.amalthea.model.provider;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
import org.eclipse.app4mc.amalthea.model.BoundedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteValueDistribution;
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueBoundaries;
import org.eclipse.app4mc.amalthea.model.ContinuousValueConstant;
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueHistogram;
import org.eclipse.app4mc.amalthea.model.ContinuousValueHistogramEntry;
import org.eclipse.app4mc.amalthea.model.ContinuousValueInterval;
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics;
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueBoundaries;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueHistogram;
import org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry;
import org.eclipse.app4mc.amalthea.model.DiscreteValueInterval;
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics;
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution;
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.IContinuousValueDeviation;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.ITimeDeviation;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution;
import org.eclipse.app4mc.amalthea.model.TimeBoundaries;
import org.eclipse.app4mc.amalthea.model.TimeConstant;
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution;
import org.eclipse.app4mc.amalthea.model.TimeHistogram;
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry;
import org.eclipse.app4mc.amalthea.model.TimeInterval;
import org.eclipse.app4mc.amalthea.model.TimeStatistics;
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedContinuousValueDistribution;
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteValueDistribution;
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
      _xifexpression = feature.getName();
    }
    String name = _xifexpression;
    boolean _matched = false;
    if (object instanceof IDiscreteValueDeviation) {
      _matched=true;
      boolean _endsWith = name.endsWith("Latency");
      if (_endsWith) {
        name = (name + " [cycles]");
      }
    }
    return (name + separator);
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
  
  private static String getIntervalText(final ContinuousValueInterval obj) {
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
  
  private static String getIntervalText(final DiscreteValueInterval obj) {
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
  
  private static String getIntervalText(final TimeInterval obj) {
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
  
  public static String getContinuousValueDeviationText(final IContinuousValueDeviation dev) {
    String _switchResult = null;
    boolean _matched = false;
    if (dev instanceof ContinuousValueBetaDistribution) {
      _matched=true;
      _switchResult = "ContinuousValue Beta Distribution";
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueConstant) {
        _matched=true;
        double _value = ((ContinuousValueConstant)dev).getValue();
        String _plus = ("ContinuousValue Constant (value: " + Double.valueOf(_value));
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueGaussDistribution) {
        _matched=true;
        double _mean = ((ContinuousValueGaussDistribution)dev).getMean();
        String _plus = ("ContinuousValue Gauss Distribution (mean: " + Double.valueOf(_mean));
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueHistogram) {
        _matched=true;
        _switchResult = "ContinuousValue Histogram";
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueBoundaries) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(((ContinuousValueInterval)dev));
        _switchResult = ("ContinuousValue Boundaries " + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueStatistics) {
        _matched=true;
        _switchResult = "ContinuousValue Statistics";
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueUniformDistribution) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(((ContinuousValueInterval)dev));
        _switchResult = ("ContinuousValue Uniform Distribution" + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = "ContinuousValue Weibull Distribution";
      }
    }
    if (!_matched) {
      _switchResult = "<undefined deviation>";
    }
    return _switchResult;
  }
  
  public static String getDiscreteValueDeviationText(final IDiscreteValueDeviation dev) {
    String _switchResult = null;
    boolean _matched = false;
    if (dev instanceof DiscreteValueBetaDistribution) {
      _matched=true;
      _switchResult = "DiscreteValue Beta Distribution";
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueConstant) {
        _matched=true;
        long _value = ((DiscreteValueConstant)dev).getValue();
        String _plus = ("DiscreteValue Constant (value: " + Long.valueOf(_value));
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueGaussDistribution) {
        _matched=true;
        double _mean = ((DiscreteValueGaussDistribution)dev).getMean();
        String _plus = ("DiscreteValue Gauss Distribution (mean: " + Double.valueOf(_mean));
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueHistogram) {
        _matched=true;
        _switchResult = "DiscreteValue Histogram";
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueBoundaries) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(((DiscreteValueInterval)dev));
        _switchResult = ("DiscreteValue Boundaries " + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueStatistics) {
        _matched=true;
        _switchResult = "DiscreteValue Statistics";
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueUniformDistribution) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(((DiscreteValueInterval)dev));
        _switchResult = ("DiscreteValue Uniform Distribution" + _intervalText);
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = "DiscreteValue Weibull Distribution";
      }
    }
    if (!_matched) {
      _switchResult = "<undefined deviation>";
    }
    return _switchResult;
  }
  
  public static String getTimeDeviationText(final ITimeDeviation dev) {
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
      if (dev instanceof TimeBoundaries) {
        _matched=true;
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(((TimeInterval)dev));
        _switchResult = ("Time Boundaries " + _intervalText);
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
        String _intervalText = CustomDeviationItemProviderService.getIntervalText(((TimeInterval)dev));
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
   * BoundedContinuousValueDistributionItemProvider
   */
  public static List<ViewerNotification> getBoundedContinuousValueDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(BoundedContinuousValueDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION__UPPER_BOUND)) {
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
   * TruncatedContinuousValueDistributionItemProvider
   */
  public static List<ViewerNotification> getTruncatedContinuousValueDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TruncatedContinuousValueDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__UPPER_BOUND)) {
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
   * ContinuousValueBetaDistributionItemProvider
   */
  public static String getContinuousValueBetaDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueBetaDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueBetaDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueBetaDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_BETA_DISTRIBUTION__ALPHA)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_BETA_DISTRIBUTION__BETA)) {
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
   * ContinuousValueConstantItemProvider
   */
  public static String getContinuousValueConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueConstantItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_CONSTANT__VALUE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * ContinuousValueGaussDistributionItemProvider
   */
  public static String getContinuousValueGaussDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueGaussDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__MEAN)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__SD)) {
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
   * ContinuousValueHistogramItemProvider
   */
  public static String getContinuousValueHistogramItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueHistogram)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ContinuousValueHistogramEntryItemProvider
   */
  public static String getContinuousValueHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueHistogramEntry)) {
      final long num = ((ContinuousValueHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.getIntervalText(((ContinuousValueInterval)object));
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ContinuousValueBoundariesItemProvider
   */
  public static String getContinuousValueBoundariesItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueBoundaries)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueBoundariesItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueBoundaries.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_BOUNDARIES__SAMPLING_TYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * ContinuousValueStatisticsItemProvider
   */
  public static String getContinuousValueStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueStatisticsItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueStatistics.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_STATISTICS__AVERAGE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * ContinuousValueUniformDistributionItemProvider
   */
  public static String getContinuousValueUniformDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueUniformDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * ContinuousValueWeibullEstimatorsDistributionItemProvider
   */
  public static String getContinuousValueWeibullEstimatorsDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueWeibullEstimatorsDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _continuousValueDeviationText = CustomDeviationItemProviderService.getContinuousValueDeviationText(((IContinuousValueDeviation)object));
      return (_containingFeatureName + _continuousValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueWeibullEstimatorsDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueWeibullEstimatorsDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE)) {
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
   * BoundedDiscreteValueDistributionItemProvider
   */
  public static List<ViewerNotification> getBoundedDiscreteValueDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(BoundedDiscreteValueDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_DISCRETE_VALUE_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.BOUNDED_DISCRETE_VALUE_DISTRIBUTION__UPPER_BOUND)) {
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
   * TruncatedDiscreteValueDistributionItemProvider
   */
  public static List<ViewerNotification> getTruncatedDiscreteValueDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TruncatedDiscreteValueDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__UPPER_BOUND)) {
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
   * DiscreteValueBetaDistributionItemProvider
   */
  public static String getDiscreteValueBetaDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueBetaDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueBetaDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueBetaDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_BETA_DISTRIBUTION__ALPHA)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_BETA_DISTRIBUTION__BETA)) {
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
   * DiscreteValueConstantItemProvider
   */
  public static String getDiscreteValueConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueConstantItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueConstant.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_CONSTANT__VALUE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteValueGaussDistributionItemProvider
   */
  public static String getDiscreteValueGaussDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueGaussDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__MEAN)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__SD)) {
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
   * DiscreteValueHistogramItemProvider
   */
  public static String getDiscreteValueHistogramItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueHistogram)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DiscreteValueHistogramEntryItemProvider
   */
  public static String getDiscreteValueHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueHistogramEntry)) {
      final long num = ((DiscreteValueHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.getIntervalText(((DiscreteValueInterval)object));
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DiscreteValueBoundariesItemProvider
   */
  public static String getDiscreteValueBoundariesItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueBoundaries)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueBoundariesItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueBoundaries.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_BOUNDARIES__SAMPLING_TYPE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * DiscreteValueStatisticsItemProvider
   */
  public static String getDiscreteValueStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueStatisticsItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueStatistics.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_STATISTICS__AVERAGE)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteValueUniformDistributionItemProvider
   */
  public static String getDiscreteValueUniformDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueUniformDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * DiscreteValueWeibullEstimatorsDistributionItemProvider
   */
  public static String getDiscreteValueWeibullEstimatorsDistributionItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueWeibullEstimatorsDistribution)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _discreteValueDeviationText = CustomDeviationItemProviderService.getDiscreteValueDeviationText(((IDiscreteValueDeviation)object));
      return (_containingFeatureName + _discreteValueDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueWeibullEstimatorsDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueWeibullEstimatorsDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE)) {
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
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
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
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
      String _intervalText = CustomDeviationItemProviderService.getIntervalText(((TimeInterval)object));
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  /**
   * TimeBoundariesItemProvider
   */
  public static String getTimeBoundariesItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeBoundaries)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
      return (_containingFeatureName + _timeDeviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeBoundariesItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeBoundaries.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_BOUNDARIES__SAMPLING_TYPE)) {
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
      String _timeDeviationText = CustomDeviationItemProviderService.getTimeDeviationText(((ITimeDeviation)object));
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
