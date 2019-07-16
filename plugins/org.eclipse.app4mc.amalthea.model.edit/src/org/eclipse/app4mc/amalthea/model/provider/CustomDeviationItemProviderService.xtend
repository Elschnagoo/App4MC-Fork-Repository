/**
 ********************************************************************************
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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.provider

import java.util.List
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.BoundedContinuousValueDistribution
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteValueDistribution
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueBetaDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueBoundaries
import org.eclipse.app4mc.amalthea.model.ContinuousValueConstant
import org.eclipse.app4mc.amalthea.model.ContinuousValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueHistogram
import org.eclipse.app4mc.amalthea.model.ContinuousValueHistogramEntry
import org.eclipse.app4mc.amalthea.model.ContinuousValueInterval
import org.eclipse.app4mc.amalthea.model.ContinuousValueStatistics
import org.eclipse.app4mc.amalthea.model.ContinuousValueUniformDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousValueWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueBetaDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueBoundaries
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant
import org.eclipse.app4mc.amalthea.model.DiscreteValueGaussDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueHistogram
import org.eclipse.app4mc.amalthea.model.DiscreteValueHistogramEntry
import org.eclipse.app4mc.amalthea.model.DiscreteValueInterval
import org.eclipse.app4mc.amalthea.model.DiscreteValueStatistics
import org.eclipse.app4mc.amalthea.model.DiscreteValueUniformDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteValueWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.IContinuousValueDeviation
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation
import org.eclipse.app4mc.amalthea.model.ITimeDeviation
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution
import org.eclipse.app4mc.amalthea.model.TimeBoundaries
import org.eclipse.app4mc.amalthea.model.TimeConstant
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution
import org.eclipse.app4mc.amalthea.model.TimeHistogram
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry
import org.eclipse.app4mc.amalthea.model.TimeInterval
import org.eclipse.app4mc.amalthea.model.TimeStatistics
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedContinuousValueDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteValueDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.ViewerNotification

class CustomDeviationItemProviderService {

	private def static getContainingFeatureName(EObject object, String defaultText, String separator) {
		val feature = object?.eContainingFeature()
		var name = if(feature === null) defaultText else feature.name
		
		// special cases
		switch object {
			IDiscreteValueDeviation:
				if (name.endsWith("Latency")) name = name + " [cycles]"
		}
		
		return name + separator
	}

	private def static getContainingFeatureName(EObject object) {
		return getContainingFeatureName(object, "", ": ")
	}

	private def static addParentLabelNotification(List<ViewerNotification> list, Notification notification) {
		addParentLabelNotification(list, notification, 1)
	}

	private def static addParentLabelNotification(List<ViewerNotification> list, Notification notification, int number) {
	    var obj = notification.getNotifier() as EObject
	    var i = 0
	    while ((i=i+1) <= number && (obj=obj.eContainer) !== null) {
	    	list.add(0, new ViewerNotification(notification, obj, false, true))
	    }
	}

///// 
///// _________________________ Deviations _________________________
///// 

	private def static String getIntervalText(ContinuousValueInterval obj) {
		if (obj === null) return "[]"
		
		val min = obj.lowerBound
		val max = obj.upperBound
		val s1 = if(min === null) "???" else min.toString
		val s2 = if(max === null) "???" else max.toString
		return "[" + s1 +", " + s2 + "]"
	}

	private def static String getIntervalText(DiscreteValueInterval obj) {
		if (obj === null) return "[]"
		
		val min = obj.lowerBound
		val max = obj.upperBound
		val s1 = if(min === null) "???" else min.toString
		val s2 = if(max === null) "???" else max.toString
		return "[" + s1 +", " + s2 + "]"
	}

	private def static String getIntervalText(TimeInterval obj) {
		if (obj === null) return "[]"
		
		val min = obj.lowerBound
		val max = obj.upperBound
		val s1 = if(min === null) "???" else min.toString
		val s2 = if(max === null) "???" else max.toString
		return "[" + s1 +", " + s2 + "]"
	}

	def static getContinuousValueDeviationText(IContinuousValueDeviation dev) {
		switch dev {
			ContinuousValueBetaDistribution: "ContinuousValue Beta Distribution"
			ContinuousValueConstant: "ContinuousValue Constant (value: " + dev.value + ")"
			ContinuousValueGaussDistribution: "ContinuousValue Gauss Distribution (mean: " + dev.mean + ")"
			ContinuousValueHistogram : "ContinuousValue Histogram"
			ContinuousValueBoundaries : "ContinuousValue Boundaries " + getIntervalText(dev)
			ContinuousValueStatistics : "ContinuousValue Statistics"
			ContinuousValueUniformDistribution : "ContinuousValue Uniform Distribution" + getIntervalText(dev)
			ContinuousValueWeibullEstimatorsDistribution : "ContinuousValue Weibull Distribution"
			default : "<undefined deviation>"
		}
	}

	def static getDiscreteValueDeviationText(IDiscreteValueDeviation dev) {
		switch dev {
			DiscreteValueBetaDistribution: "DiscreteValue Beta Distribution"
			DiscreteValueConstant: "DiscreteValue Constant (value: " + dev.value + ")"
			DiscreteValueGaussDistribution: "DiscreteValue Gauss Distribution (mean: " + dev.mean + ")"
			DiscreteValueHistogram : "DiscreteValue Histogram"
			DiscreteValueBoundaries : "DiscreteValue Boundaries " + getIntervalText(dev)
			DiscreteValueStatistics : "DiscreteValue Statistics"
			DiscreteValueUniformDistribution : "DiscreteValue Uniform Distribution" + getIntervalText(dev)
			DiscreteValueWeibullEstimatorsDistribution : "DiscreteValue Weibull Distribution"
			default : "<undefined deviation>"
		}
	}

	def static getTimeDeviationText(ITimeDeviation dev) {
		switch dev {
			TimeBetaDistribution: "Time Beta Distribution"
			TimeConstant: "Time Constant (value: " + dev.value + ")"
			TimeGaussDistribution: "Time Gauss Distribution (mean: " + dev.mean + ")"
			TimeHistogram : "Time Histogram"
			TimeBoundaries : "Time Boundaries " + getIntervalText(dev)
			TimeStatistics : "Time Statistics"
			TimeUniformDistribution : "Time Uniform Distribution" + getIntervalText(dev)
			TimeWeibullEstimatorsDistribution : "Time Weibull Distribution"
			default : "<undefined deviation>"
		}
	}

///// 
///// _________________________ ContinuousValue Deviations _________________________
///// 

	/*****************************************************************************
	 * 						BoundedContinuousValueDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getBoundedContinuousValueDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BoundedContinuousValueDistribution)) {
			case AmaltheaPackage::BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::BOUNDED_CONTINUOUS_VALUE_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TruncatedContinuousValueDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getTruncatedContinuousValueDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TruncatedContinuousValueDistribution)) {
			case AmaltheaPackage::TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::TRUNCATED_CONTINUOUS_VALUE_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueBetaDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousValueBetaDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueBetaDistribution) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueBetaDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueBetaDistribution)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_BETA_DISTRIBUTION__ALPHA,
			case AmaltheaPackage::CONTINUOUS_VALUE_BETA_DISTRIBUTION__BETA: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueConstantItemProvider
	 *****************************************************************************/
	def static String getContinuousValueConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueConstant) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueConstant)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueGaussDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousValueGaussDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueGaussDistribution) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueGaussDistribution)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__MEAN,
			case AmaltheaPackage::CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__SD: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueHistogramItemProvider
	 *****************************************************************************/
	def static String getContinuousValueHistogramItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueHistogram) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousValueHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getContinuousValueHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + getIntervalText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousValueBoundariesItemProvider
	 *****************************************************************************/
	def static String getContinuousValueBoundariesItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueBoundaries) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueBoundariesItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueBoundaries)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_BOUNDARIES__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueStatisticsItemProvider
	 *****************************************************************************/
	def static String getContinuousValueStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueStatistics) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueStatisticsItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueStatistics)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_STATISTICS__AVERAGE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueUniformDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousValueUniformDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueUniformDistribution) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousValueWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousValueWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + getContinuousValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueWeibullEstimatorsDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueWeibullEstimatorsDistribution)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE,
			case AmaltheaPackage::CONTINUOUS_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

///// 
///// _________________________ DiscreteValue Deviations _________________________
///// 

	/*****************************************************************************
	 * 						BoundedDiscreteValueDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getBoundedDiscreteValueDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BoundedDiscreteValueDistribution)) {
			case AmaltheaPackage::BOUNDED_DISCRETE_VALUE_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::BOUNDED_DISCRETE_VALUE_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TruncatedDiscreteValueDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getTruncatedDiscreteValueDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TruncatedDiscreteValueDistribution)) {
			case AmaltheaPackage::TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::TRUNCATED_DISCRETE_VALUE_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueBetaDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueBetaDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueBetaDistribution) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueBetaDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueBetaDistribution)) {
			case AmaltheaPackage::DISCRETE_VALUE_BETA_DISTRIBUTION__ALPHA,
			case AmaltheaPackage::DISCRETE_VALUE_BETA_DISTRIBUTION__BETA: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueConstantItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueConstant) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueConstant)) {
			case AmaltheaPackage::DISCRETE_VALUE_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueGaussDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueGaussDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueGaussDistribution) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueGaussDistribution)) {
			case AmaltheaPackage::DISCRETE_VALUE_GAUSS_DISTRIBUTION__MEAN,
			case AmaltheaPackage::DISCRETE_VALUE_GAUSS_DISTRIBUTION__SD: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueHistogramItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueHistogramItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueHistogram) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteValueHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + getIntervalText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteValueBoundariesItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueBoundariesItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueBoundaries) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueBoundariesItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueBoundaries)) {
			case AmaltheaPackage::DISCRETE_VALUE_BOUNDARIES__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueStatisticsItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueStatistics) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueStatisticsItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueStatistics)) {
			case AmaltheaPackage::DISCRETE_VALUE_STATISTICS__AVERAGE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueUniformDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueUniformDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueUniformDistribution) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteValueWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + getDiscreteValueDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueWeibullEstimatorsDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueWeibullEstimatorsDistribution)) {
			case AmaltheaPackage::DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE,
			case AmaltheaPackage::DISCRETE_VALUE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

///// 
///// _________________________ Time Deviations _________________________
///// 

	/*****************************************************************************
	 * 						BoundedTimeDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getBoundedTimeDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BoundedTimeDistribution)) {
			case AmaltheaPackage::BOUNDED_TIME_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::BOUNDED_TIME_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TruncatedTimeDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getTruncatedTimeDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TruncatedTimeDistribution)) {
			case AmaltheaPackage::TRUNCATED_TIME_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::TRUNCATED_TIME_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeBetaDistributionItemProvider
	 *****************************************************************************/
	def static String getTimeBetaDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeBetaDistribution) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeBetaDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeBetaDistribution)) {
			case AmaltheaPackage::TIME_BETA_DISTRIBUTION__ALPHA,
			case AmaltheaPackage::TIME_BETA_DISTRIBUTION__BETA: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeConstantItemProvider
	 *****************************************************************************/
	def static String getTimeConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeConstant) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeConstant)) {
			case AmaltheaPackage::TIME_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeGaussDistributionItemProvider
	 *****************************************************************************/
	def static String getTimeGaussDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeGaussDistribution) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeGaussDistribution)) {
			case AmaltheaPackage::TIME_GAUSS_DISTRIBUTION__MEAN,
			case AmaltheaPackage::TIME_GAUSS_DISTRIBUTION__SD: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeHistogramItemProvider
	 *****************************************************************************/
	def static String getTimeHistogramItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeHistogram) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getTimeHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + getIntervalText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeBoundariesItemProvider
	 *****************************************************************************/
	def static String getTimeBoundariesItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeBoundaries) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeBoundariesItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeBoundaries)) {
			case AmaltheaPackage::TIME_BOUNDARIES__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeStatisticsItemProvider
	 *****************************************************************************/
	def static String getTimeStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeStatistics) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeStatisticsItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeStatistics)) {
			case AmaltheaPackage::TIME_STATISTICS__AVERAGE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeUniformDistributionItemProvider
	 *****************************************************************************/
	def static String getTimeUniformDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeUniformDistribution) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getTimeWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeWeibullEstimatorsDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeWeibullEstimatorsDistribution)) {
			case AmaltheaPackage::TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE,
			case AmaltheaPackage::TIME_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

}
