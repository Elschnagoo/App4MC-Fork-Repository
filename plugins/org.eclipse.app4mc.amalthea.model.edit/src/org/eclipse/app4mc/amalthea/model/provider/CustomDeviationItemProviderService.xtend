/**
 ********************************************************************************
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
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.provider

import java.util.List
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.BoundedContinuousDistribution
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteDistribution
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousBetaDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousConstant
import org.eclipse.app4mc.amalthea.model.ContinuousDeviation
import org.eclipse.app4mc.amalthea.model.ContinuousGaussDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousHistogram
import org.eclipse.app4mc.amalthea.model.ContinuousHistogramEntry
import org.eclipse.app4mc.amalthea.model.ContinuousInterval
import org.eclipse.app4mc.amalthea.model.ContinuousStatistics
import org.eclipse.app4mc.amalthea.model.ContinuousUniformDistribution
import org.eclipse.app4mc.amalthea.model.ContinuousWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteBetaDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteConstant
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation
import org.eclipse.app4mc.amalthea.model.DiscreteGaussDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteHistogram
import org.eclipse.app4mc.amalthea.model.DiscreteHistogramEntry
import org.eclipse.app4mc.amalthea.model.DiscreteInterval
import org.eclipse.app4mc.amalthea.model.DiscreteStatistics
import org.eclipse.app4mc.amalthea.model.DiscreteUniformDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.TimeBetaDistribution
import org.eclipse.app4mc.amalthea.model.TimeConstant
import org.eclipse.app4mc.amalthea.model.TimeDeviation
import org.eclipse.app4mc.amalthea.model.TimeGaussDistribution
import org.eclipse.app4mc.amalthea.model.TimeHistogram
import org.eclipse.app4mc.amalthea.model.TimeHistogramEntry
import org.eclipse.app4mc.amalthea.model.TimeInterval
import org.eclipse.app4mc.amalthea.model.TimeStatistics
import org.eclipse.app4mc.amalthea.model.TimeUniformDistribution
import org.eclipse.app4mc.amalthea.model.TimeWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedContinuousDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedTimeDistribution
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.ViewerNotification

class CustomDeviationItemProviderService {

	private def static getContainingFeatureName(EObject object, String defaultText, String separator) {
		val feature = object?.eContainingFeature()
		val name = if(feature === null) defaultText else feature.name + separator
		return name
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

	private def static String getIntervalText(ContinuousDeviation obj) {
		if (obj === null) return "[]"
		
		val min = obj.lowerBound
		val max = obj.upperBound
		val s1 = if(min === null) "???" else min.toString
		val s2 = if(max === null) "???" else max.toString
		return "[" + s1 +", " + s2 + "]"
	}

	private def static String getIntervalText(DiscreteDeviation obj) {
		if (obj === null) return "[]"
		
		val min = obj.lowerBound
		val max = obj.upperBound
		val s1 = if(min === null) "???" else min.toString
		val s2 = if(max === null) "???" else max.toString
		return "[" + s1 +", " + s2 + "]"
	}

	private def static String getIntervalText(TimeDeviation obj) {
		if (obj === null) return "[]"
		
		val min = obj.lowerBound
		val max = obj.upperBound
		val s1 = if(min === null) "???" else min.toString
		val s2 = if(max === null) "???" else max.toString
		return "[" + s1 +", " + s2 + "]"
	}

	def static getContinuousDeviationText(ContinuousDeviation dev) {
		switch dev {
			ContinuousBetaDistribution: "Continuous Beta Distribution"
			ContinuousConstant: "Continuous Constant (value: " + dev.value + ")"
			ContinuousGaussDistribution: "Continuous Gauss Distribution (mean: " + dev.mean + ")"
			ContinuousHistogram : "Continuous Histogram"
			ContinuousInterval : "Continuous Interval " + getIntervalText(dev)
			ContinuousStatistics : "Continuous Statistics"
			ContinuousUniformDistribution : "Continuous Uniform Distribution" + getIntervalText(dev)
			ContinuousWeibullEstimatorsDistribution : "Continuous Weibull Distribution"
			default : "<undefined deviation>"
		}
	}

	def static getDiscreteDeviationText(DiscreteDeviation dev) {
		switch dev {
			DiscreteBetaDistribution: "Discrete Beta Distribution"
			DiscreteConstant: "Discrete Constant (value: " + dev.value + ")"
			DiscreteGaussDistribution: "Discrete Gauss Distribution (mean: " + dev.mean + ")"
			DiscreteHistogram : "Discrete Histogram"
			DiscreteInterval : "Discrete Interval " + getIntervalText(dev)
			DiscreteStatistics : "Discrete Statistics"
			DiscreteUniformDistribution : "Discrete Uniform Distribution" + getIntervalText(dev)
			DiscreteWeibullEstimatorsDistribution : "Discrete Weibull Distribution"
			default : "<undefined deviation>"
		}
	}

	def static getTimeDeviationText(TimeDeviation dev) {
		switch dev {
			TimeBetaDistribution: "Time Beta Distribution"
			TimeConstant: "Time Constant (value: " + dev.value + ")"
			TimeGaussDistribution: "Time Gauss Distribution (mean: " + dev.mean + ")"
			TimeHistogram : "Time Histogram"
			TimeInterval : "Time Interval " + getIntervalText(dev)
			TimeStatistics : "Time Statistics"
			TimeUniformDistribution : "Time Uniform Distribution" + getIntervalText(dev)
			TimeWeibullEstimatorsDistribution : "Time Weibull Distribution"
			default : "<undefined deviation>"
		}
	}

///// 
///// _________________________ Continuous Deviations _________________________
///// 

	/*****************************************************************************
	 * 						BoundedContinuousDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getBoundedContinuousDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BoundedContinuousDistribution)) {
			case AmaltheaPackage::BOUNDED_CONTINUOUS_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::BOUNDED_CONTINUOUS_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TruncatedContinuousDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getTruncatedContinuousDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TruncatedContinuousDistribution)) {
			case AmaltheaPackage::TRUNCATED_CONTINUOUS_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::TRUNCATED_CONTINUOUS_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousBetaDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousBetaDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousBetaDistribution) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousBetaDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousBetaDistribution)) {
			case AmaltheaPackage::CONTINUOUS_BETA_DISTRIBUTION__ALPHA,
			case AmaltheaPackage::CONTINUOUS_BETA_DISTRIBUTION__BETA: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousConstantItemProvider
	 *****************************************************************************/
	def static String getContinuousConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousConstant) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousConstant)) {
			case AmaltheaPackage::CONTINUOUS_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousGaussDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousGaussDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousGaussDistribution) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousGaussDistribution)) {
			case AmaltheaPackage::CONTINUOUS_GAUSS_DISTRIBUTION__MEAN,
			case AmaltheaPackage::CONTINUOUS_GAUSS_DISTRIBUTION__SD: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousHistogramItemProvider
	 *****************************************************************************/
	def static String getContinuousHistogramItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousHistogram) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getContinuousHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + getIntervalText(object.interval)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousIntervalItemProvider
	 *****************************************************************************/
	def static String getContinuousIntervalItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousInterval) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousIntervalItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousConstant)) {
			case AmaltheaPackage::CONTINUOUS_INTERVAL__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousStatisticsItemProvider
	 *****************************************************************************/
	def static String getContinuousStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousStatistics) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousStatisticsItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousStatistics)) {
			case AmaltheaPackage::CONTINUOUS_STATISTICS__AVERAGE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousUniformDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousUniformDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousUniformDistribution) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + getContinuousDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousWeibullEstimatorsDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousWeibullEstimatorsDistribution)) {
			case AmaltheaPackage::CONTINUOUS_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE,
			case AmaltheaPackage::CONTINUOUS_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

///// 
///// _________________________ Discrete Deviations _________________________
///// 

	/*****************************************************************************
	 * 						BoundedDiscreteDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getBoundedDiscreteDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BoundedDiscreteDistribution)) {
			case AmaltheaPackage::BOUNDED_DISCRETE_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::BOUNDED_DISCRETE_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TruncatedDiscreteDistributionItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getTruncatedDiscreteDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TruncatedDiscreteDistribution)) {
			case AmaltheaPackage::TRUNCATED_DISCRETE_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::TRUNCATED_DISCRETE_DISTRIBUTION__UPPER_BOUND: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteBetaDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteBetaDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteBetaDistribution) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteBetaDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteBetaDistribution)) {
			case AmaltheaPackage::DISCRETE_BETA_DISTRIBUTION__ALPHA,
			case AmaltheaPackage::DISCRETE_BETA_DISTRIBUTION__BETA: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteConstantItemProvider
	 *****************************************************************************/
	def static String getDiscreteConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteConstant) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteConstant)) {
			case AmaltheaPackage::DISCRETE_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteGaussDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteGaussDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteGaussDistribution) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteGaussDistribution)) {
			case AmaltheaPackage::DISCRETE_GAUSS_DISTRIBUTION__MEAN,
			case AmaltheaPackage::DISCRETE_GAUSS_DISTRIBUTION__SD: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteHistogramItemProvider
	 *****************************************************************************/
	def static String getDiscreteHistogramItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteHistogram) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getDiscreteHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + getIntervalText(object.interval)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteIntervalItemProvider
	 *****************************************************************************/
	def static String getDiscreteIntervalItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteInterval) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteIntervalItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteConstant)) {
			case AmaltheaPackage::DISCRETE_INTERVAL__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteStatisticsItemProvider
	 *****************************************************************************/
	def static String getDiscreteStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteStatistics) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteStatisticsItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteStatistics)) {
			case AmaltheaPackage::DISCRETE_STATISTICS__AVERAGE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteUniformDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteUniformDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteUniformDistribution) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteWeibullEstimatorsDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteWeibullEstimatorsDistribution)) {
			case AmaltheaPackage::DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__AVERAGE,
			case AmaltheaPackage::DISCRETE_WEIBULL_ESTIMATORS_DISTRIBUTION__PREMAIN_PROMILLE: {
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
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
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
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
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
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
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
			return "Entry -- " + num + " x " + getIntervalText(object.interval)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeIntervalItemProvider
	 *****************************************************************************/
	def static String getTimeIntervalItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeInterval) {
			return getContainingFeatureName(object) + getTimeDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeIntervalItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeConstant)) {
			case AmaltheaPackage::TIME_INTERVAL__SAMPLING_TYPE: {
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
