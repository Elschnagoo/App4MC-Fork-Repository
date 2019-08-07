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

import java.text.DecimalFormat
import java.util.List
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
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
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation
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
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.ViewerNotification
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.TimeUnit

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

	static val DIAMETER = "\u2300"
	static val INFINITY = "\u221e"
	static val UNKNOWN = "???"
	static val FORMAT = new DecimalFormat("#.##")

	private def static intervalText(Object min, Object max) {
		intervalText(min, max, false)
	}

	private def static intervalText(Object min, Object max, boolean infinity) {
		val NO_MIN = if(infinity) "-" + INFINITY else UNKNOWN
		val NO_MAX = if(infinity) INFINITY else UNKNOWN

		val s1 = if(min === null) NO_MIN else min.toString
		val s2 = if(max === null) NO_MAX else max.toString
		return " [" + s1 +", " + s2 + "]"
	}

	private def static averageText(Object avg) {
		if (avg === null) return ""
		if (avg instanceof Time) {
			if (avg.value === null) return ""
			if (avg.unit == TimeUnit::_UNDEFINED_) return ""
		}
		
		val avgText = switch avg {
			Double: FORMAT.format(avg)
			Float: FORMAT.format(avg)
			Time: avg.adjustUnit.toString
			default: avg.toString
		}
		return " " + DIAMETER + " " + avgText
	}

	private def static constantText(Object value) {
		val s1 = if(value === null) UNKNOWN else value.toString		
		"Constant {" + s1 + "}"
	}

	private def static boundariesText(Object min, Object max) {
		"Boundaries" + intervalText(min, max)
	}

	private def static uniformText(Object min, Object max) {
		"Uniform" + intervalText(min, max)
	}

	private def static statisticsText(Object min, Object avg, Object max) {
		"Statistics" + intervalText(min, max) + averageText(avg)
	}

	private def static gaussText(Object min, Object avg, Object max) {
		"Gauss" + averageText(avg) + intervalText(min, max, true)
	}

	private def static betaText(Object min, Object avg, Object max) {
		"Beta" + averageText(avg) + intervalText(min, max)
	}

	private def static histogramText(Object min, Object avg, Object max) {
		"Histogram" + averageText(avg) + intervalText(min, max)
	}

	private def static weibullText(Object min, Object avg, Object max) {
		"Weibull" + averageText(avg) + intervalText(min, max)
	}

	def static deviationText(Object dev) {
		switch dev {
			ContinuousValueConstant :	constantText(dev.value)
			DiscreteValueConstant :		constantText(dev.value)
			TimeConstant :				constantText(dev.value)
			
			ContinuousValueBoundaries :	boundariesText(dev.lowerBound, dev.upperBound)
			DiscreteValueBoundaries :	boundariesText(dev.lowerBound, dev.upperBound)
			TimeBoundaries :			boundariesText(dev.lowerBound, dev.upperBound)
			
			ContinuousValueUniformDistribution :	uniformText(dev.lowerBound, dev.upperBound)
			DiscreteValueUniformDistribution :		uniformText(dev.lowerBound, dev.upperBound)
			TimeUniformDistribution:				uniformText(dev.lowerBound, dev.upperBound)
			
			ContinuousValueStatistics :	statisticsText(dev.lowerBound, dev.average, dev.upperBound)
			DiscreteValueStatistics :	statisticsText(dev.lowerBound, dev.average, dev.upperBound)
			TimeStatistics :			statisticsText(dev.lowerBound, dev.average, dev.upperBound)
			
			ContinuousValueGaussDistribution :	gaussText(dev.lowerBound, dev.average, dev.upperBound)
			DiscreteValueGaussDistribution :	gaussText(dev.lowerBound, dev.average, dev.upperBound)
			TimeGaussDistribution :				gaussText(dev.lowerBound, dev.average, dev.upperBound)
			
			ContinuousValueBetaDistribution :	betaText(dev.lowerBound, dev.average, dev.upperBound)
			DiscreteValueBetaDistribution :		betaText(dev.lowerBound, dev.average, dev.upperBound)
			TimeBetaDistribution :				betaText(dev.lowerBound, dev.average, dev.upperBound)
			
			ContinuousValueHistogram :	histogramText(dev.lowerBound, dev.average, dev.upperBound)
			DiscreteValueHistogram :	histogramText(dev.lowerBound, dev.average, dev.upperBound)
			TimeHistogram :				histogramText(dev.lowerBound, dev.average, dev.upperBound)
			
			ContinuousValueWeibullEstimatorsDistribution :	weibullText(dev.lowerBound, dev.average, dev.upperBound)
			DiscreteValueWeibullEstimatorsDistribution :	weibullText(dev.lowerBound, dev.average, dev.upperBound)
			TimeWeibullEstimatorsDistribution :				weibullText(dev.lowerBound, dev.average, dev.upperBound)
			
			default : "<undefined deviation>"
		}
	}


///// 
///// _________________________ ContinuousValue Deviations _________________________
///// 

	/*****************************************************************************
	 * 						ContinuousValueConstantItemProvider
	 *****************************************************************************/
	def static String getContinuousValueConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueConstant) {
			return getContainingFeatureName(object) + deviationText(object)
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueGaussDistribution)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::CONTINUOUS_VALUE_GAUSS_DISTRIBUTION__UPPER_BOUND,
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueHistogramItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueHistogramEntry)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_HISTOGRAM__ENTRIES: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getContinuousValueHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + intervalText(object.lowerBound, object.upperBound)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueHistogramEntryItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueHistogramEntry)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_HISTOGRAM_ENTRY__LOWER_BOUND,
			case AmaltheaPackage::CONTINUOUS_VALUE_HISTOGRAM_ENTRY__UPPER_BOUND,
			case AmaltheaPackage::CONTINUOUS_VALUE_HISTOGRAM_ENTRY__OCCURRENCES: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueIntervalItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getContinuousValueIntervalItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueInterval)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_INTERVAL__LOWER_BOUND,
			case AmaltheaPackage::CONTINUOUS_VALUE_INTERVAL__UPPER_BOUND: {
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
			return getContainingFeatureName(object) + deviationText(object)
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
	 * 						ContinuousValueBoundariesItemProvider
	 *****************************************************************************/
	def static String getContinuousValueBoundariesItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueBoundaries) {
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getContinuousValueBoundariesItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ContinuousValueBoundaries)) {
			case AmaltheaPackage::CONTINUOUS_VALUE_BOUNDARIES__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ContinuousValueStatisticsItemProvider
	 *****************************************************************************/
	def static String getContinuousValueStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueStatistics) {
			return getContainingFeatureName(object) + deviationText(object)
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ContinuousValueWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getContinuousValueWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof ContinuousValueWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + deviationText(object)
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
	 * 						DiscreteValueConstantItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueConstant) {
			return getContainingFeatureName(object) + deviationText(object)
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueGaussDistribution)) {
			case AmaltheaPackage::DISCRETE_VALUE_GAUSS_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::DISCRETE_VALUE_GAUSS_DISTRIBUTION__UPPER_BOUND,
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueHistogramItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueHistogramEntry)) {
			case AmaltheaPackage::DISCRETE_VALUE_HISTOGRAM__ENTRIES: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + intervalText(object.lowerBound, object.upperBound)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueHistogramEntryItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueHistogramEntry)) {
			case AmaltheaPackage::DISCRETE_VALUE_HISTOGRAM_ENTRY__LOWER_BOUND,
			case AmaltheaPackage::DISCRETE_VALUE_HISTOGRAM_ENTRY__UPPER_BOUND,
			case AmaltheaPackage::DISCRETE_VALUE_HISTOGRAM_ENTRY__OCCURRENCES: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueIntervalItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getDiscreteValueIntervalItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueInterval)) {
			case AmaltheaPackage::DISCRETE_VALUE_INTERVAL__LOWER_BOUND,
			case AmaltheaPackage::DISCRETE_VALUE_INTERVAL__UPPER_BOUND: {
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
			return getContainingFeatureName(object) + deviationText(object)
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
	 * 						DiscreteValueBoundariesItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueBoundariesItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueBoundaries) {
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteValueBoundariesItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteValueBoundaries)) {
			case AmaltheaPackage::DISCRETE_VALUE_BOUNDARIES__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DiscreteValueStatisticsItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueStatistics) {
			return getContainingFeatureName(object) + deviationText(object)
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DiscreteValueWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteValueWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteValueWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + deviationText(object)
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
	 * 						TimeConstantItemProvider
	 *****************************************************************************/
	def static String getTimeConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeConstant) {
			return getContainingFeatureName(object) + deviationText(object)
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeGaussDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeGaussDistribution)) {
			case AmaltheaPackage::TIME_GAUSS_DISTRIBUTION__LOWER_BOUND,
			case AmaltheaPackage::TIME_GAUSS_DISTRIBUTION__UPPER_BOUND,
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeHistogramItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeHistogram)) {
			case AmaltheaPackage::TIME_HISTOGRAM__ENTRIES: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeHistogramEntryItemProvider
	 *****************************************************************************/
	def static String getTimeHistogramEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeHistogramEntry) {
			val num = object.occurrences
			return "Entry -- " + num + " x " + intervalText(object.lowerBound, object.upperBound)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeHistogramEntryItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeHistogramEntry)) {
			case AmaltheaPackage::TIME_HISTOGRAM_ENTRY__LOWER_BOUND,
			case AmaltheaPackage::TIME_HISTOGRAM_ENTRY__UPPER_BOUND,
			case AmaltheaPackage::TIME_HISTOGRAM_ENTRY__OCCURRENCES: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeIntervalItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getTimeIntervalItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeInterval)) {
			case AmaltheaPackage::TIME_INTERVAL__LOWER_BOUND,
			case AmaltheaPackage::TIME_INTERVAL__UPPER_BOUND: {
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
			return getContainingFeatureName(object) + deviationText(object)
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
	 * 						TimeBoundariesItemProvider
	 *****************************************************************************/
	def static String getTimeBoundariesItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeBoundaries) {
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeBoundariesItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeBoundaries)) {
			case AmaltheaPackage::TIME_BOUNDARIES__SAMPLING_TYPE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						TimeStatisticsItemProvider
	 *****************************************************************************/
	def static String getTimeStatisticsItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeStatistics) {
			return getContainingFeatureName(object) + deviationText(object)
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
			return getContainingFeatureName(object) + deviationText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeWeibullEstimatorsDistributionItemProvider
	 *****************************************************************************/
	def static String getTimeWeibullEstimatorsDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeWeibullEstimatorsDistribution) {
			return getContainingFeatureName(object) + deviationText(object)
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
