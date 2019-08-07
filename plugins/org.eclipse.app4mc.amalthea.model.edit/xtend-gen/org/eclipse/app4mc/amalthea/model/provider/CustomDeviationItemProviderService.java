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
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage;
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
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
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
import org.eclipse.app4mc.amalthea.model.TimeUnit;
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution;
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
  
  private static final String DIAMETER = "\u2300";
  
  private static final String INFINITY = "\u221e";
  
  private static final String UNKNOWN = "???";
  
  private static final DecimalFormat FORMAT = new DecimalFormat("#.##");
  
  private static String intervalText(final Object min, final Object max) {
    return CustomDeviationItemProviderService.intervalText(min, max, false);
  }
  
  private static String intervalText(final Object min, final Object max, final boolean infinity) {
    String _xifexpression = null;
    if (infinity) {
      _xifexpression = ("-" + CustomDeviationItemProviderService.INFINITY);
    } else {
      _xifexpression = CustomDeviationItemProviderService.UNKNOWN;
    }
    final String NO_MIN = _xifexpression;
    String _xifexpression_1 = null;
    if (infinity) {
      _xifexpression_1 = CustomDeviationItemProviderService.INFINITY;
    } else {
      _xifexpression_1 = CustomDeviationItemProviderService.UNKNOWN;
    }
    final String NO_MAX = _xifexpression_1;
    String _xifexpression_2 = null;
    if ((min == null)) {
      _xifexpression_2 = NO_MIN;
    } else {
      _xifexpression_2 = min.toString();
    }
    final String s1 = _xifexpression_2;
    String _xifexpression_3 = null;
    if ((max == null)) {
      _xifexpression_3 = NO_MAX;
    } else {
      _xifexpression_3 = max.toString();
    }
    final String s2 = _xifexpression_3;
    return ((((" [" + s1) + ", ") + s2) + "]");
  }
  
  private static String averageText(final Object avg) {
    if ((avg == null)) {
      return "";
    }
    if ((avg instanceof Time)) {
      BigInteger _value = ((Time)avg).getValue();
      boolean _tripleEquals = (_value == null);
      if (_tripleEquals) {
        return "";
      }
      TimeUnit _unit = ((Time)avg).getUnit();
      boolean _equals = Objects.equal(_unit, TimeUnit._UNDEFINED_);
      if (_equals) {
        return "";
      }
    }
    String _switchResult = null;
    boolean _matched = false;
    if (avg instanceof Double) {
      _matched=true;
      _switchResult = CustomDeviationItemProviderService.FORMAT.format(avg);
    }
    if (!_matched) {
      if (avg instanceof Float) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.FORMAT.format(avg);
      }
    }
    if (!_matched) {
      if (avg instanceof Time) {
        _matched=true;
        _switchResult = ((Time)avg).adjustUnit().toString();
      }
    }
    if (!_matched) {
      _switchResult = avg.toString();
    }
    final String avgText = _switchResult;
    return (((" " + CustomDeviationItemProviderService.DIAMETER) + " ") + avgText);
  }
  
  private static String constantText(final Object value) {
    String _xblockexpression = null;
    {
      String _xifexpression = null;
      if ((value == null)) {
        _xifexpression = CustomDeviationItemProviderService.UNKNOWN;
      } else {
        _xifexpression = value.toString();
      }
      final String s1 = _xifexpression;
      _xblockexpression = (("Constant {" + s1) + "}");
    }
    return _xblockexpression;
  }
  
  private static String boundariesText(final Object min, final Object max) {
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max);
    return ("Boundaries" + _intervalText);
  }
  
  private static String uniformText(final Object min, final Object max) {
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max);
    return ("Uniform" + _intervalText);
  }
  
  private static String statisticsText(final Object min, final Object avg, final Object max) {
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max);
    String _plus = ("Statistics" + _intervalText);
    String _averageText = CustomDeviationItemProviderService.averageText(avg);
    return (_plus + _averageText);
  }
  
  private static String gaussText(final Object min, final Object avg, final Object max) {
    String _averageText = CustomDeviationItemProviderService.averageText(avg);
    String _plus = ("Gauss" + _averageText);
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max, true);
    return (_plus + _intervalText);
  }
  
  private static String betaText(final Object min, final Object avg, final Object max) {
    String _averageText = CustomDeviationItemProviderService.averageText(avg);
    String _plus = ("Beta" + _averageText);
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max);
    return (_plus + _intervalText);
  }
  
  private static String histogramText(final Object min, final Object avg, final Object max) {
    String _averageText = CustomDeviationItemProviderService.averageText(avg);
    String _plus = ("Histogram" + _averageText);
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max);
    return (_plus + _intervalText);
  }
  
  private static String weibullText(final Object min, final Object avg, final Object max) {
    String _averageText = CustomDeviationItemProviderService.averageText(avg);
    String _plus = ("Weibull" + _averageText);
    String _intervalText = CustomDeviationItemProviderService.intervalText(min, max);
    return (_plus + _intervalText);
  }
  
  public static String deviationText(final Object dev) {
    String _switchResult = null;
    boolean _matched = false;
    if (dev instanceof ContinuousValueConstant) {
      _matched=true;
      _switchResult = CustomDeviationItemProviderService.constantText(Double.valueOf(((ContinuousValueConstant)dev).getValue()));
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueConstant) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.constantText(Long.valueOf(((DiscreteValueConstant)dev).getValue()));
      }
    }
    if (!_matched) {
      if (dev instanceof TimeConstant) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.constantText(((TimeConstant)dev).getValue());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueBoundaries) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.boundariesText(((ContinuousValueBoundaries)dev).getLowerBound(), ((ContinuousValueBoundaries)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueBoundaries) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.boundariesText(((DiscreteValueBoundaries)dev).getLowerBound(), ((DiscreteValueBoundaries)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeBoundaries) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.boundariesText(((TimeBoundaries)dev).getLowerBound(), ((TimeBoundaries)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueUniformDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.uniformText(((ContinuousValueUniformDistribution)dev).getLowerBound(), ((ContinuousValueUniformDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueUniformDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.uniformText(((DiscreteValueUniformDistribution)dev).getLowerBound(), ((DiscreteValueUniformDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeUniformDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.uniformText(((TimeUniformDistribution)dev).getLowerBound(), ((TimeUniformDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueStatistics) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.statisticsText(((ContinuousValueStatistics)dev).getLowerBound(), ((ContinuousValueStatistics)dev).getAverage(), ((ContinuousValueStatistics)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueStatistics) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.statisticsText(((DiscreteValueStatistics)dev).getLowerBound(), ((DiscreteValueStatistics)dev).getAverage(), ((DiscreteValueStatistics)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeStatistics) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.statisticsText(((TimeStatistics)dev).getLowerBound(), ((TimeStatistics)dev).getAverage(), ((TimeStatistics)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueGaussDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.gaussText(((ContinuousValueGaussDistribution)dev).getLowerBound(), ((ContinuousValueGaussDistribution)dev).getAverage(), ((ContinuousValueGaussDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueGaussDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.gaussText(((DiscreteValueGaussDistribution)dev).getLowerBound(), ((DiscreteValueGaussDistribution)dev).getAverage(), ((DiscreteValueGaussDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeGaussDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.gaussText(((TimeGaussDistribution)dev).getLowerBound(), ((TimeGaussDistribution)dev).getAverage(), ((TimeGaussDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueBetaDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.betaText(((ContinuousValueBetaDistribution)dev).getLowerBound(), ((ContinuousValueBetaDistribution)dev).getAverage(), ((ContinuousValueBetaDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueBetaDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.betaText(((DiscreteValueBetaDistribution)dev).getLowerBound(), ((DiscreteValueBetaDistribution)dev).getAverage(), ((DiscreteValueBetaDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeBetaDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.betaText(((TimeBetaDistribution)dev).getLowerBound(), ((TimeBetaDistribution)dev).getAverage(), ((TimeBetaDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueHistogram) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.histogramText(((ContinuousValueHistogram)dev).getLowerBound(), ((ContinuousValueHistogram)dev).getAverage(), ((ContinuousValueHistogram)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueHistogram) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.histogramText(((DiscreteValueHistogram)dev).getLowerBound(), ((DiscreteValueHistogram)dev).getAverage(), ((DiscreteValueHistogram)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeHistogram) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.histogramText(((TimeHistogram)dev).getLowerBound(), ((TimeHistogram)dev).getAverage(), ((TimeHistogram)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof ContinuousValueWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.weibullText(((ContinuousValueWeibullEstimatorsDistribution)dev).getLowerBound(), ((ContinuousValueWeibullEstimatorsDistribution)dev).getAverage(), ((ContinuousValueWeibullEstimatorsDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof DiscreteValueWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.weibullText(((DiscreteValueWeibullEstimatorsDistribution)dev).getLowerBound(), ((DiscreteValueWeibullEstimatorsDistribution)dev).getAverage(), ((DiscreteValueWeibullEstimatorsDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      if (dev instanceof TimeWeibullEstimatorsDistribution) {
        _matched=true;
        _switchResult = CustomDeviationItemProviderService.weibullText(((TimeWeibullEstimatorsDistribution)dev).getLowerBound(), ((TimeWeibullEstimatorsDistribution)dev).getAverage(), ((TimeWeibullEstimatorsDistribution)dev).getUpperBound());
      }
    }
    if (!_matched) {
      _switchResult = "<undefined deviation>";
    }
    return _switchResult;
  }
  
  /**
   * ContinuousValueConstantItemProvider
   */
  public static String getContinuousValueConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__MEAN)) {
        _matched=true;
      }
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueHistogramItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueHistogramEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM__ENTRIES)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * ContinuousValueHistogramEntryItemProvider
   */
  public static String getContinuousValueHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueHistogramEntry)) {
      final long num = ((ContinuousValueHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.intervalText(((ContinuousValueHistogramEntry)object).getLowerBound(), ((ContinuousValueHistogramEntry)object).getUpperBound());
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getContinuousValueHistogramEntryItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueHistogramEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM_ENTRY__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM_ENTRY__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_HISTOGRAM_ENTRY__OCCURRENCES)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * ContinuousValueIntervalItemProvider
   */
  public static List<ViewerNotification> getContinuousValueIntervalItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(ContinuousValueInterval.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_INTERVAL__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.CONTINUOUS_VALUE_INTERVAL__UPPER_BOUND)) {
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
   * ContinuousValueBoundariesItemProvider
   */
  public static String getContinuousValueBoundariesItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueBoundaries)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * ContinuousValueStatisticsItemProvider
   */
  public static String getContinuousValueStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof ContinuousValueStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
   * DiscreteValueConstantItemProvider
   */
  public static String getDiscreteValueConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_GAUSS_DISTRIBUTION__MEAN)) {
        _matched=true;
      }
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueHistogramItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueHistogramEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM__ENTRIES)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteValueHistogramEntryItemProvider
   */
  public static String getDiscreteValueHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueHistogramEntry)) {
      final long num = ((DiscreteValueHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.intervalText(((DiscreteValueHistogramEntry)object).getLowerBound(), ((DiscreteValueHistogramEntry)object).getUpperBound());
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getDiscreteValueHistogramEntryItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueHistogramEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM_ENTRY__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM_ENTRY__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_HISTOGRAM_ENTRY__OCCURRENCES)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, false, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * DiscreteValueIntervalItemProvider
   */
  public static List<ViewerNotification> getDiscreteValueIntervalItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(DiscreteValueInterval.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_INTERVAL__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.DISCRETE_VALUE_INTERVAL__UPPER_BOUND)) {
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
   * DiscreteValueBoundariesItemProvider
   */
  public static String getDiscreteValueBoundariesItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueBoundaries)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * DiscreteValueStatisticsItemProvider
   */
  public static String getDiscreteValueStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof DiscreteValueStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
   * TimeConstantItemProvider
   */
  public static String getTimeConstantItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeConstant)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeGaussDistributionItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeGaussDistribution.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_GAUSS_DISTRIBUTION__MEAN)) {
        _matched=true;
      }
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeHistogramItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeHistogram.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_HISTOGRAM__ENTRIES)) {
      _matched=true;
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * TimeHistogramEntryItemProvider
   */
  public static String getTimeHistogramEntryItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeHistogramEntry)) {
      final long num = ((TimeHistogramEntry)object).getOccurrences();
      String _intervalText = CustomDeviationItemProviderService.intervalText(((TimeHistogramEntry)object).getLowerBound(), ((TimeHistogramEntry)object).getUpperBound());
      return ((("Entry -- " + Long.valueOf(num)) + " x ") + _intervalText);
    } else {
      return defaultText;
    }
  }
  
  public static List<ViewerNotification> getTimeHistogramEntryItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeHistogramEntry.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_HISTOGRAM_ENTRY__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_HISTOGRAM_ENTRY__UPPER_BOUND)) {
        _matched=true;
      }
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_HISTOGRAM_ENTRY__OCCURRENCES)) {
        _matched=true;
      }
    }
    if (_matched) {
      Object _notifier = notification.getNotifier();
      ViewerNotification _viewerNotification = new ViewerNotification(notification, _notifier, true, true);
      list.add(_viewerNotification);
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification, 2);
    }
    return list;
  }
  
  /**
   * TimeIntervalItemProvider
   */
  public static List<ViewerNotification> getTimeIntervalItemProviderNotifications(final Notification notification) {
    final ArrayList<ViewerNotification> list = CollectionLiterals.<ViewerNotification>newArrayList();
    int _featureID = notification.getFeatureID(TimeInterval.class);
    boolean _matched = false;
    if (Objects.equal(_featureID, AmaltheaPackage.TIME_INTERVAL__LOWER_BOUND)) {
      _matched=true;
    }
    if (!_matched) {
      if (Objects.equal(_featureID, AmaltheaPackage.TIME_INTERVAL__UPPER_BOUND)) {
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
   * TimeBoundariesItemProvider
   */
  public static String getTimeBoundariesItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeBoundaries)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      CustomDeviationItemProviderService.addParentLabelNotification(list, notification);
    }
    return list;
  }
  
  /**
   * TimeStatisticsItemProvider
   */
  public static String getTimeStatisticsItemProviderText(final Object object, final String defaultText) {
    if ((object instanceof TimeStatistics)) {
      String _containingFeatureName = CustomDeviationItemProviderService.getContainingFeatureName(((EObject)object));
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
      String _deviationText = CustomDeviationItemProviderService.deviationText(object);
      return (_containingFeatureName + _deviationText);
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
