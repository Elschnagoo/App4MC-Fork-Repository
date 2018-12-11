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
import org.apache.commons.lang.StringUtils
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.BoundedContinuousDistribution
import org.eclipse.app4mc.amalthea.model.BoundedDiscreteDistribution
import org.eclipse.app4mc.amalthea.model.BoundedTimeDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteBetaDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteConstant
import org.eclipse.app4mc.amalthea.model.DiscreteGaussDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteHistogram
import org.eclipse.app4mc.amalthea.model.DiscreteHistogramEntry
import org.eclipse.app4mc.amalthea.model.DiscreteInterval
import org.eclipse.app4mc.amalthea.model.DiscreteStatistics
import org.eclipse.app4mc.amalthea.model.DiscreteUniformDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullEstimatorsDistribution
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullParametersDistribution
import org.eclipse.app4mc.amalthea.model.TruncatedDiscreteDistribution
import org.eclipse.emf.common.notify.AdapterFactory
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.IItemLabelProvider
import org.eclipse.emf.edit.provider.ViewerNotification
import org.eclipse.app4mc.amalthea.model.DiscreteDeviation
import org.eclipse.app4mc.amalthea.model.DiscreteWeibullDistribution

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

	private def static getLabelProviderText(Object object, AdapterFactory rootAF) {
		if (object !== null && rootAF.isFactoryForType(object)) {
			val plainAdapter = rootAF.adapt(object, typeof(IItemLabelProvider))
			if (plainAdapter instanceof IItemLabelProvider) {
				return plainAdapter.getText(object)
			}
		}
		return ""
	}

	/* Pretty print methods */
	private def static ppCamelCase(String s) {
		StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(s), ' ')
	}

	private def static ppName(String name) {
		return ppName(name, "???")
	}

	private def static ppName(String name, String surrogate) {
		if(name.isNullOrEmpty) return surrogate
		return name
	}

///// 
///// _________________________ Deviations _________________________
///// 

	def static getDiscreteDeviationText(DiscreteDeviation dev) {
		switch dev {
			DiscreteBetaDistribution: "Discrete Beta Distribution"
			DiscreteConstant: "Discrete Constant (value: " + dev.value + ")"
			DiscreteGaussDistribution: "Discrete Gauss Distribution (mean: " + dev.mean + ")"
			DiscreteHistogram : "Discrete Histogram"
			DiscreteInterval : "Discrete Interval " + getIntervalText(dev)
			DiscreteStatistics : "Discrete Statistics"
			DiscreteUniformDistribution : "Discrete Uniform Distribution"
			DiscreteWeibullDistribution : "Discrete Weibull Distribution"
		}
	}

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

	/*****************************************************************************
	 * 						DiscreteWeibullParametersDistributionItemProvider
	 *****************************************************************************/
	def static String getDiscreteWeibullParametersDistributionItemProviderText(Object object, String defaultText) {
		if (object instanceof DiscreteWeibullParametersDistribution) {
			return getContainingFeatureName(object) + getDiscreteDeviationText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDiscreteWeibullParametersDistributionItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DiscreteWeibullParametersDistribution)) {
			case AmaltheaPackage::DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__KAPPA,
			case AmaltheaPackage::DISCRETE_WEIBULL_PARAMETERS_DISTRIBUTION__LAMBDA: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}


	private def static String getIntervalText(Object obj) {
		var String s1 = ""
		var String s2 = ""
		if (obj instanceof BoundedDiscreteDistribution) {
			val min = obj.lowerBound
			val max = obj.upperBound
			s1 = if(min === null) "???" else min.toString
			s2 = if(max === null) "???" else max.toString
		} else if (obj instanceof BoundedContinuousDistribution) {
			val min = obj.lowerBound
			val max = obj.upperBound
			s1 = if(min === null) "???" else min.toString
			s2 = if(max === null) "???" else max.toString
		} else if (obj instanceof BoundedTimeDistribution) {
			val min = obj.lowerBound
			val max = obj.upperBound
			s1 = if(min === null) "???" else min.toString
			s2 = if(max === null) "???" else max.toString
		} else {
			return "[]"
		}
		return "[" + s1 +", " + s2 + "]"
	}


}
