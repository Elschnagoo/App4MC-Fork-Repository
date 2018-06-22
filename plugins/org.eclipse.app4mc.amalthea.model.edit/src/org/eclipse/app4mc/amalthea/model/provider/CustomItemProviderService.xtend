/*******************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/

package org.eclipse.app4mc.amalthea.model.provider

import java.util.ArrayList
import java.util.List
import java.util.Map
import org.apache.commons.lang.StringUtils
import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition
import org.eclipse.app4mc.amalthea.model.BigIntegerObject
import org.eclipse.app4mc.amalthea.model.BlockingType
import org.eclipse.app4mc.amalthea.model.BooleanObject
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype
import org.eclipse.app4mc.amalthea.model.ChannelAccess
import org.eclipse.app4mc.amalthea.model.ChannelReceive
import org.eclipse.app4mc.amalthea.model.ChannelSend
import org.eclipse.app4mc.amalthea.model.ClearEvent
import org.eclipse.app4mc.amalthea.model.CoherencyDirection
import org.eclipse.app4mc.amalthea.model.ComponentInstance
import org.eclipse.app4mc.amalthea.model.ComponentScope
import org.eclipse.app4mc.amalthea.model.Condition
import org.eclipse.app4mc.amalthea.model.Connector
import org.eclipse.app4mc.amalthea.model.CoreClassification
import org.eclipse.app4mc.amalthea.model.CountMetric
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit
import org.eclipse.app4mc.amalthea.model.CustomEventTrigger
import org.eclipse.app4mc.amalthea.model.DataAgeCycle
import org.eclipse.app4mc.amalthea.model.DataAgeTime
import org.eclipse.app4mc.amalthea.model.DataCoherencyGroup
import org.eclipse.app4mc.amalthea.model.DataPlatformMapping
import org.eclipse.app4mc.amalthea.model.DataRate
import org.eclipse.app4mc.amalthea.model.DataRateUnit
import org.eclipse.app4mc.amalthea.model.DataSize
import org.eclipse.app4mc.amalthea.model.DataSizeUnit
import org.eclipse.app4mc.amalthea.model.DataStability
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition
import org.eclipse.app4mc.amalthea.model.Deviation
import org.eclipse.app4mc.amalthea.model.DoubleObject
import org.eclipse.app4mc.amalthea.model.EventChainContainer
import org.eclipse.app4mc.amalthea.model.EventChainMeasurement
import org.eclipse.app4mc.amalthea.model.EventChainReference
import org.eclipse.app4mc.amalthea.model.EventConfig
import org.eclipse.app4mc.amalthea.model.ExecutionNeed
import org.eclipse.app4mc.amalthea.model.FloatObject
import org.eclipse.app4mc.amalthea.model.Frequency
import org.eclipse.app4mc.amalthea.model.FrequencyMetric
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.GetResultServerCall
import org.eclipse.app4mc.amalthea.model.Group
import org.eclipse.app4mc.amalthea.model.GroupingType
import org.eclipse.app4mc.amalthea.model.HwAccessElement
import org.eclipse.app4mc.amalthea.model.HwAccessPath
import org.eclipse.app4mc.amalthea.model.HwConnection
import org.eclipse.app4mc.amalthea.model.HwFeature
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.HwPort
import org.eclipse.app4mc.amalthea.model.HwStructure
import org.eclipse.app4mc.amalthea.model.INamed
import org.eclipse.app4mc.amalthea.model.ISRAllocation
import org.eclipse.app4mc.amalthea.model.Instructions
import org.eclipse.app4mc.amalthea.model.InstructionsConstant
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation
import org.eclipse.app4mc.amalthea.model.IntegerObject
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger
import org.eclipse.app4mc.amalthea.model.InterfaceKind
import org.eclipse.app4mc.amalthea.model.InterfacePort
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.LatencyConstant
import org.eclipse.app4mc.amalthea.model.LatencyDeviation
import org.eclipse.app4mc.amalthea.model.LimitType
import org.eclipse.app4mc.amalthea.model.ListObject
import org.eclipse.app4mc.amalthea.model.LongObject
import org.eclipse.app4mc.amalthea.model.MemoryClassification
import org.eclipse.app4mc.amalthea.model.MemoryMapping
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic
import org.eclipse.app4mc.amalthea.model.Mode
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess
import org.eclipse.app4mc.amalthea.model.ModeLiteral
import org.eclipse.app4mc.amalthea.model.ModeSwitch
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.ModeValue
import org.eclipse.app4mc.amalthea.model.ModeValueConjunction
import org.eclipse.app4mc.amalthea.model.ModeValueDisjunction
import org.eclipse.app4mc.amalthea.model.ModeValueList
import org.eclipse.app4mc.amalthea.model.Need
import org.eclipse.app4mc.amalthea.model.NeedConstant
import org.eclipse.app4mc.amalthea.model.NeedDeviation
import org.eclipse.app4mc.amalthea.model.NonAtomicDataCoherency
import org.eclipse.app4mc.amalthea.model.OrderPrecedenceSpec
import org.eclipse.app4mc.amalthea.model.OrderType
import org.eclipse.app4mc.amalthea.model.OsAPIInstructions
import org.eclipse.app4mc.amalthea.model.OsDataConsistency
import org.eclipse.app4mc.amalthea.model.OsDataConsistencyMode
import org.eclipse.app4mc.amalthea.model.OsISRInstructions
import org.eclipse.app4mc.amalthea.model.OsInstructions
import org.eclipse.app4mc.amalthea.model.PercentageMetric
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit
import org.eclipse.app4mc.amalthea.model.PhysicalSectionConstraint
import org.eclipse.app4mc.amalthea.model.PhysicalSectionMapping
import org.eclipse.app4mc.amalthea.model.ProcessAllocationConstraint
import org.eclipse.app4mc.amalthea.model.ProcessChainRequirement
import org.eclipse.app4mc.amalthea.model.ProcessPrototypeAllocationConstraint
import org.eclipse.app4mc.amalthea.model.ProcessRequirement
import org.eclipse.app4mc.amalthea.model.ProcessScope
import org.eclipse.app4mc.amalthea.model.QualifiedPort
import org.eclipse.app4mc.amalthea.model.ReferenceObject
import org.eclipse.app4mc.amalthea.model.RunnableAllocation
import org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint
import org.eclipse.app4mc.amalthea.model.RunnableCall
import org.eclipse.app4mc.amalthea.model.RunnableItem
import org.eclipse.app4mc.amalthea.model.RunnableMeasurement
import org.eclipse.app4mc.amalthea.model.RunnableModeSwitch
import org.eclipse.app4mc.amalthea.model.RunnableProbabilitySwitch
import org.eclipse.app4mc.amalthea.model.RunnableRequirement
import org.eclipse.app4mc.amalthea.model.RunnableScope
import org.eclipse.app4mc.amalthea.model.SchedulerAllocation
import org.eclipse.app4mc.amalthea.model.SchedulingParameters
import org.eclipse.app4mc.amalthea.model.SemaphoreAccess
import org.eclipse.app4mc.amalthea.model.SemaphoreAccessEnum
import org.eclipse.app4mc.amalthea.model.SenderReceiverRead
import org.eclipse.app4mc.amalthea.model.SenderReceiverWrite
import org.eclipse.app4mc.amalthea.model.SetEvent
import org.eclipse.app4mc.amalthea.model.SingleValueStatistic
import org.eclipse.app4mc.amalthea.model.StringObject
import org.eclipse.app4mc.amalthea.model.SubEventChain
import org.eclipse.app4mc.amalthea.model.SynchronousServerCall
import org.eclipse.app4mc.amalthea.model.TagGroup
import org.eclipse.app4mc.amalthea.model.TaskAllocation
import org.eclipse.app4mc.amalthea.model.TaskMeasurement
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.TimeMetric
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit
import org.eclipse.app4mc.amalthea.model.TimeUnit
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy
import org.eclipse.app4mc.amalthea.model.TypeDefinition
import org.eclipse.app4mc.amalthea.model.TypeRef
import org.eclipse.app4mc.amalthea.model.Value
import org.eclipse.app4mc.amalthea.model.Voltage
import org.eclipse.app4mc.amalthea.model.VoltageUnit
import org.eclipse.app4mc.amalthea.model.WaitEvent
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour
import org.eclipse.app4mc.amalthea.model.impl.CustomPropertyImpl
import org.eclipse.app4mc.amalthea.model.impl.ExecutionNeedExtendedImpl
import org.eclipse.app4mc.amalthea.model.impl.ModeValueImpl
import org.eclipse.app4mc.amalthea.model.impl.NeedEntryImpl
import org.eclipse.emf.common.notify.AdapterFactory
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.IItemLabelProvider
import org.eclipse.emf.edit.provider.ViewerNotification

class CustomItemProviderService {

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
///// _________________________ Amalthea _________________________
///// 

	/*****************************************************************************
	 * 						AmaltheaItemProvider
	 *****************************************************************************/
	def static String getAmaltheaItemProviderText(Object object, String defaultText) {
		if (object instanceof Amalthea) {
			return "AMALTHEA model (version " + object.version + ")"
		} else {
			return defaultText
		}
	}

///// 
///// _________________________ Common _________________________
///// 

	private def static getTimeText(Time time) {
		if(time === null) return "<time>"

		val value = if(time.value === null) "???" else time.value.toString
		val unit = if(time.unit == TimeUnit::_UNDEFINED_) "<unit>" else time.unit.literal
		return value + " " + unit
	}

	private def static getDataSizeText(DataSize size) {
		if(size === null) return "<data size>"

		val value = if(size.value === null) "???" else size.value.toString
		val unit = if(size.unit == DataSizeUnit::_UNDEFINED_) "<unit>" else size.unit.literal
		return value + " " + unit
	}

	private def static getDataRateText(DataRate rate) {
		if(rate === null) return "<data rate>"

		val value = if(rate.value === null) "???" else rate.value.toString
		val unit = if(rate.unit == DataRateUnit::_UNDEFINED_) "<unit>" else rate.unit.literal
		return value + " " + unit.replace("PerSecond", "/s")
	}

	private def static getFrequencyText(Frequency frequency) {
		if(frequency === null) return "<frequency>"

		val value = Double.toString(frequency.value)
		val unit = if(frequency.unit == FrequencyUnit::_UNDEFINED_) "<unit>" else frequency.unit.literal
		return value + " " + unit
	}

	private def static getVoltageText(Voltage voltage) {
		if(voltage === null) return "<voltage>"

		val value = Double.toString(voltage.value)
		val unit = if(voltage.unit == VoltageUnit::_UNDEFINED_) "<unit>" else voltage.unit.literal
		return value + " " + unit
	}

	private def static getDeviationBoundText(Object bound) {
		switch bound {
			LongObject:
				String.valueOf(bound.value)
			DoubleObject:
				String.valueOf(bound.value)
			Time:
				getTimeText(bound)
			}
	}

	private def static trimDistName(String name) {
		if(name === null) return ""

		return name.replace("Distribution", "").replace("Estimators", "").replace("Parameters", "")
	}

	private def static getInstructionsText(Instructions instr) {
		switch instr {
			InstructionsConstant: getInstructionsConstantItemProviderText(instr, null)
			InstructionsDeviation: getInstructionsDeviationItemProviderText(instr, null)
		}
	}

	private def static getNeedText(Need need) {
		switch need {
			NeedConstant: getNeedConstantItemProviderText(need, null)
			NeedDeviation: getNeedDeviationItemProviderText(need, null)
		}
	}

	private def static getValueText(Value object) {
		if(object === null) return "null"
		
		switch object {
			BooleanObject:
				String.valueOf(object.value)
			IntegerObject:
				String.valueOf(object.value)
			LongObject:
				String.valueOf(object.value)
			BigIntegerObject:
				String.valueOf(object.value)
			FloatObject:
				String.valueOf(object.value)
			DoubleObject:
				String.valueOf(object.value)
			StringObject:
				if(object.value === null) "null" else "\"" + object.value + "\""
			ReferenceObject:
				if(object.value === null) "null" else object.value.eClass.name + " \"" + ppName(object?.value?.name) + "\""
			Time:
				if(object.value === null) "null" else getTimeText(object)
			ListObject:
				""
		}
	}


	/*****************************************************************************
	 * 						CustomPropertyItemProvider
	 *****************************************************************************/
	def static String getCustomPropertyItemProviderText(Object object, String defaultText) {
		if (object instanceof CustomPropertyImpl) {
			val key = object?.getKey()
			val value = object?.getValue()
			val valueType = object?.getValue()?.eClass?.name
			val s1 = if(key.isNullOrEmpty) "<key>" else "\"" + key + "\""
			val s2 = if(valueType === null) "" else "(" + valueType.replace("Object", "") + ") "
			val s3 = getValueText(value)
			return s1 + " -> " + s2 + s3;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getCustomPropertyItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(Map.Entry)) {
			case AmaltheaPackage::CUSTOM_PROPERTY__KEY:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::CUSTOM_PROPERTY__VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						BooleanObjectItemProvider
	 *****************************************************************************/
	def static String getBooleanObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof BooleanObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getBooleanObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BooleanObject)) {
			case AmaltheaPackage::BOOLEAN_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DoubleObjectItemProvider
	 *****************************************************************************/
	def static String getDoubleObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof DoubleObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDoubleObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DoubleObject)) {
			case AmaltheaPackage::DOUBLE_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						FloatObjectItemProvider
	 *****************************************************************************/
	def static String getFloatObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof FloatObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getFloatObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(FloatObject)) {
			case AmaltheaPackage::FLOAT_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						IntegerObjectItemProvider
	 *****************************************************************************/
	def static String getIntegerObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof IntegerObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getIntegerObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(IntegerObject)) {
			case AmaltheaPackage::INTEGER_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						LongObjectItemProvider
	 *****************************************************************************/
	def static String getLongObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof LongObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getLongObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(LongObject)) {
			case AmaltheaPackage::LONG_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						StringObjectItemProvider
	 *****************************************************************************/
	def static String getStringObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof StringObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getStringObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(StringObject)) {
			case AmaltheaPackage::STRING_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						BigIntegerObjectItemProvider
	 *****************************************************************************/
	def static String getBigIntegerObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof BigIntegerObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getBigIntegerObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(BigIntegerObject)) {
			case AmaltheaPackage::BIG_INTEGER_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ReferenceObjectItemProvider
	 *****************************************************************************/
	def static String getReferenceObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof ReferenceObject) {
			return getContainingFeatureName(object) + getValueText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getReferenceObjectItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ReferenceObject)) {
			case AmaltheaPackage::REFERENCE_OBJECT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						BoundariesItemProvider
	 *****************************************************************************/
	def static String getBoundariesItemProviderText(Object object, String defaultText) {
		return "Dist: Boundaries"
	}

	/*****************************************************************************
	 * 						BetaDistributionItemProvider
	 *****************************************************************************/
	def static String getBetaDistributionItemProviderText(Object object, String defaultText) {
		return "Dist: Beta"
	}

	/*****************************************************************************
	 * 						GaussDistributionItemProvider
	 *****************************************************************************/
	def static String getGaussDistributionItemProviderText(Object object, String defaultText) {
		return "Dist: Gauss"
	}

	/*****************************************************************************
	 * 						UniformDistributionItemProvider
	 *****************************************************************************/
	def static String getUniformDistributionItemProviderText(Object object, String defaultText) {
		return "Dist: Uniform";
	}

	/*****************************************************************************
	 * 						WeibullEstimatorsItemProvider
	 *****************************************************************************/
	def static String getWeibullEstimatorsItemProviderText(Object object, String defaultText) {
		return "Dist: Weibull Estimators";
	}

	/*****************************************************************************
	 * 						WeibullParametersItemProvider
	 *****************************************************************************/
	def static String getWeibullParametersItemProviderText(Object object, String defaultText) {
		return "Dist: Weibull Parameters";
	}

	/*****************************************************************************
	 * 						FrequencyItemProvider
	 *****************************************************************************/
	def static String getFrequencyItemProviderText(Object object, String defaultText) {
		if (object instanceof Frequency) {
			return getContainingFeatureName(object) + getFrequencyText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getFrequencyItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(Frequency)) {
			case AmaltheaPackage::FREQUENCY__VALUE,
			case AmaltheaPackage::FREQUENCY__UNIT: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						VoltageItemProvider
	 *****************************************************************************/
	def static String getVoltageItemProviderText(Object object, String defaultText) {
		if (object instanceof Voltage) {
			return getContainingFeatureName(object) + getVoltageText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getVoltageItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(Voltage)) {
			case AmaltheaPackage::VOLTAGE__VALUE,
			case AmaltheaPackage::VOLTAGE__UNIT: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DataSizeItemProvider
	 *****************************************************************************/
	def static String getDataSizeItemProviderText(Object object, String defaultText) {
		if (object instanceof DataSize) {
			return getContainingFeatureName(object) + getDataSizeText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDataSizeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DataSize)) {
			case AmaltheaPackage::DATA_SIZE__VALUE,
			case AmaltheaPackage::DATA_SIZE__UNIT: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DataRateItemProvider
	 *****************************************************************************/
	def static String getDataRateItemProviderText(Object object, String defaultText) {
		if (object instanceof DataRate) {
			return getContainingFeatureName(object) + getDataRateText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDataRateItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DataRate)) {
			case AmaltheaPackage::DATA_RATE__VALUE,
			case AmaltheaPackage::DATA_RATE__UNIT: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						DeviationItemProvider
	 *****************************************************************************/
	def static String getDeviationItemProviderText(Object object, String defaultText) {
		if (object instanceof Deviation<?>) {
			val distName = object?.distribution?.eClass?.name
			val lower = object?.lowerBound
			val upper = object?.upperBound
			val s1 = if(distName.isNullOrEmpty) "Dist: ???" else "Dist: " + trimDistName(distName)
			val s2 = if(lower === null) "" else " lowerBound: " + getDeviationBoundText(lower)
			val s3 = if(upper === null) "" else " upperBound: " + getDeviationBoundText(upper)

			return getContainingFeatureName(object) + "(" + s1 + ")" + s2 + s3
		}
	}

	def static List<ViewerNotification> getDeviationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(Deviation)) {
			case AmaltheaPackage::DEVIATION__LOWER_BOUND,
			case AmaltheaPackage::DEVIATION__UPPER_BOUND,
			case AmaltheaPackage::DEVIATION__DISTRIBUTION: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
				addParentLabelNotification(list, notification, 2)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						MinAvgMaxStatisticItemProvider
	 *****************************************************************************/
	def static String getMinAvgMaxStatisticItemProviderText(Object object, String defaultText) {
		if (object instanceof MinAvgMaxStatistic) {
			val s1 = getContainingFeatureName(object)
			return s1 + object.min + " : " + object.avg + " : " + object.max
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						SingleValueStatisticItemProvider
	 *****************************************************************************/
	def static String getSingleValueStatisticItemProviderText(Object object, String defaultText) {
		if (object instanceof SingleValueStatistic) {
			return getContainingFeatureName(object) + object.value
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeItemProvider
	 *****************************************************************************/
	def static String getTimeItemProviderText(Object object, String defaultText) {
		if (object instanceof Time) {
			return getContainingFeatureName(object) + getTimeText(object)
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getTimeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(Time)) {
			case AmaltheaPackage::TIME__VALUE,
			case AmaltheaPackage::TIME__UNIT: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						InstructionsConstantItemProvider
	 *****************************************************************************/
	def static String getInstructionsConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof InstructionsConstant) {
			val feature = getContainingFeatureName(object, "", "")
			val s1 = if(feature == "value") "" else feature + " -- "
			val s2 = Long.toString(object.value)
			return s1 + "instructions (constant): " + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getInstructionsConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(InstructionsConstant)) {
			case AmaltheaPackage::INSTRUCTIONS_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						InstructionsDeviationItemProvider
	 *****************************************************************************/
	def static String getInstructionsDeviationItemProviderText(Object object, String defaultText) {
		if (object instanceof InstructionsDeviation) {
			val feature = getContainingFeatureName(object, "", "")
			val s1 = if(feature == "value") "" else feature + " -- "
			val distName = object?.deviation?.distribution?.eClass?.name
			val s2 = if(distName.isNullOrEmpty) "<distribution>" else trimDistName(distName)
			return s1 + "instructions (deviation): " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getInstructionsDeviationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(InstructionsDeviation)) {
			case AmaltheaPackage::INSTRUCTIONS_DEVIATION__DEVIATION:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						NeedConstantItemProvider
	 *****************************************************************************/
	def static String getNeedConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof NeedConstant) {
			val feature = getContainingFeatureName(object, "", "")
			val s1 = if(feature == "value") "" else feature + " -- "
			val s2 = Long.toString(object.value)
			return s1 + "need (constant): " + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getNeedConstantItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(NeedConstant)) {
			case AmaltheaPackage::NEED_CONSTANT__VALUE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						NeedDeviationItemProvider
	 *****************************************************************************/
	def static String getNeedDeviationItemProviderText(Object object, String defaultText) {
		if (object instanceof NeedDeviation) {
			val feature = getContainingFeatureName(object, "", "")
			val s1 = if(feature == "value") "" else feature + " -- "
			val distName = object?.deviation?.distribution?.eClass?.name
			val s2 = if(distName.isNullOrEmpty) "<distribution>" else trimDistName(distName)
			return s1 + "need (deviation): " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getNeedDeviationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(NeedDeviation)) {
			case AmaltheaPackage::NEED_DEVIATION__DEVIATION:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						TransmissionPolicyItemProvider
	 *****************************************************************************/
	def static String getTransmissionPolicyItemProviderText(Object object, String defaultText) {
		if (object instanceof TransmissionPolicy) {
			val size = object.chunkSize
			val instr = object.chunkProcessingInstructions
			val ratio = object.transmitRatio

			return "transmission (chunk size: " + getDataSizeText(size) + " instructions: " + instr + " ratio: " + ratio + ")";
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTransmissionPolicyItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TransmissionPolicy)) {
			case AmaltheaPackage::TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS,
			case AmaltheaPackage::TRANSMISSION_POLICY__TRANSMIT_RATIO:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::TRANSMISSION_POLICY__CHUNK_SIZE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

///// 
///// _________________________ Components _________________________
///// 

	/*****************************************************************************
	 * 						ComponentInstanceItemProvider
	 *****************************************************************************/
	def static String getComponentInstanceItemProviderText(Object object, String defaultText) {
		if (object instanceof ComponentInstance) {
			val name = object?.name
			val typeName = object?.type?.name
			val s1 = ppName(name, "<component instance>")
			val s2 = ppName(typeName)
			return s1 + " (type: " + s2 + ")"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getComponentInstanceItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ComponentInstance)) {
			case AmaltheaPackage::COMPONENT_INSTANCE__NAME,
			case AmaltheaPackage::COMPONENT_INSTANCE__TYPE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::COMPONENT_INSTANCE__CUSTOM_PROPERTIES:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						ConnectorItemProvider
	 *****************************************************************************/
	def static String getConnectorItemProviderText(Object object, String defaultText) {
		if (object instanceof Connector) {
			val name = object?.name
			val s1 = ppName(name, "<connector>")
			return s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						InterfacePortItemProvider
	 *****************************************************************************/
	def static String getInterfacePortItemProviderText(Object object, String defaultText) {
		if (object instanceof InterfacePort) {
			val cName = object?.containingComponent.name
			val kind = object?.kind
			val name = object?.name
			val s1 = ppName(cName, "<component>")
			val s2 = if(kind === null || kind == InterfaceKind::_UNDEFINED_) "<kind>" else kind.literal
			val s3 = ppName(name, "<port>")
			return s1 + " " + s2 + " " + s3
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						QualifiedPortItemProvider
	 *****************************************************************************/
	def static String getQualifiedPortItemProviderText(Object object, String defaultText) {
		if (object instanceof QualifiedPort) {
			val instName = object?.instance?.name
			val portName = object?.port?.name
			var String s2 = ""
			var String s4 = ""
			if (object?.instance === null) {
				s4 = " (enclosing composite)"
			} else {
				s2 = if(instName.isNullOrEmpty) "??? / " else instName + " / "
			}
			val s3 = if(portName.isNullOrEmpty) "<port>" else portName
			return getContainingFeatureName(object) + s2 + s3 + s4
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getQualifiedPortItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(QualifiedPort)) {
			case AmaltheaPackage::QUALIFIED_PORT__INSTANCE,
			case AmaltheaPackage::QUALIFIED_PORT__PORT:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

///// 
///// _________________________ Config _________________________
///// 

	/*****************************************************************************
	 * 						EventConfigItemProvider
	 *****************************************************************************/
	def static String getEventConfigItemProviderText(Object object, String defaultText, AdapterFactory rootAF) {
		if (object instanceof EventConfig) {
			val name = object?.name
			val event = object?.event
			val s1 = ppName(name)
			var s2 = if(event === null) "<event>" else getLabelProviderText(event, rootAF)

			return "Config " + s1 + " -> trace " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getEventConfigItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(EventConfig)) {
			case AmaltheaPackage::EVENT_CONFIG__NAME:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::EVENT_CONFIG__EVENT:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

///// 
///// _________________________ Constraints _________________________
///// 

	private def static getLimitTypeText(LimitType limitType) {
		switch limitType {
			case LimitType::UPPER_LIMIT: " <= "
			case LimitType::LOWER_LIMIT: " >= "
			default: " ? "
		}
	}

	/*****************************************************************************
	 * 						ComponentScopeItemProvider
	 *****************************************************************************/
	def static String getComponentScopeItemProviderText(Object object, String defaultText) {
		if (object instanceof ComponentScope) {
			val compName = object?.component?.name
			val s1 = if(compName.isNullOrEmpty) "<component>" else "Component " + compName
			return "Scope: " + s1
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getComponentScopeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ComponentScope)) {
			case AmaltheaPackage::COMPONENT_SCOPE__COMPONENT: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ProcessScopeItemProvider
	 *****************************************************************************/
	def static String getProcessScopeItemProviderText(Object object, String defaultText) {
		if (object instanceof ProcessScope) {
			val proc = object?.process
			val s1 = if(proc?.name.isNullOrEmpty) "<process>" else proc.eClass.name + " " + proc.name
			return "Scope: " + s1
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getProcessScopeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ProcessScope)) {
			case AmaltheaPackage::PROCESS_SCOPE__PROCESS: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						RunnableScopeItemProvider
	 *****************************************************************************/
	def static String getRunnableScopeItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableScope) {
			val runName = object?.runnable?.name
			val s1 = if(runName.isNullOrEmpty) "<runnable>" else "Runnable " + runName
			return "Scope: " + s1
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getRunnableScopeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(RunnableScope)) {
			case AmaltheaPackage::RUNNABLE_SCOPE__RUNNABLE: {
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
				addParentLabelNotification(list, notification)
				}
		}
		return list
	}

	/*****************************************************************************
	 * 						ArchitectureRequirementItemProvider
	 *****************************************************************************/
	def static String getArchitectureRequirementItemProviderText(Object object, String defaultText) {
		if (object instanceof ArchitectureRequirement) {
			val reqName = object?.name
			val compName = object?.component?.name
			val s1 = ppName(reqName)
			val s2 = if(compName.isNullOrEmpty) "<component>" else "Component " + compName
			return "Req " + s1 + " -- " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getArchitectureRequirementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ArchitectureRequirement)) {
			case AmaltheaPackage::ARCHITECTURE_REQUIREMENT__NAME,
			case AmaltheaPackage::ARCHITECTURE_REQUIREMENT__COMPONENT:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						CountRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getCountRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof CountRequirementLimit) {
			val metric = object?.metric
			val limitType = object?.limitType
			val limitValue = if(object === null) 0 else object.limitValue
			val s1 = if(metric === null || metric == CountMetric::_UNDEFINED_) "<count metric>" else metric.literal + " count"
			val s2 = getLimitTypeText(limitType)
			val s3 = Double.toString(limitValue)
			return s1 + s2 + s3
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						CPUPercentageRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getCPUPercentageRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof CPUPercentageRequirementLimit) {
			val metric = object?.metric
			val hwContext = object?.hardwareContext?.name
			val limitType = object?.limitType
			val limitValue = if(object === null) 0 else object.limitValue
			val s1 = if(metric === null || metric == CPUPercentageMetric::_UNDEFINED_) "<CPU % metric>" else metric.literal
			val s2 = if(hwContext.isNullOrEmpty) "" else " on " + hwContext
			val s3 = getLimitTypeText(limitType)
			val s4 = Double.toString(limitValue) + " %"
			return s1 + s2 + s3 + s4
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						FrequencyRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getFrequencyRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof FrequencyRequirementLimit) {
			val metric = object?.metric
			val limitType = object?.limitType
			val limitValue = object?.limitValue
			val s1 = if(metric === null || metric == FrequencyMetric::_UNDEFINED_) "<frequency metric>" else metric.literal
			val s2 = getLimitTypeText(limitType)
			val s3 = getFrequencyText(limitValue)
			return s1 + s2 + s3
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getFrequencyRequirementLimitItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(FrequencyRequirementLimit)) {
			case AmaltheaPackage::FREQUENCY_REQUIREMENT_LIMIT__METRIC:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						PercentageRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getPercentageRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof PercentageRequirementLimit) {
			val metric = object?.metric
			val limitType = object?.limitType
			val limitValue = if(object === null) 0 else object.limitValue
			val s1 = if(metric === null || metric == PercentageMetric::_UNDEFINED_) "<% metric>" else metric.literal
			val s2 = getLimitTypeText(limitType)
			val s3 = Double.toString(limitValue) + " %"
			return s1 + s2 + s3
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getTimeRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeRequirementLimit) {
			val metric = object?.metric
			val limitType = object?.limitType
			val limitValue = object?.limitValue
			val s1 = if(metric === null || metric == TimeMetric::_UNDEFINED_) "<time metric>" else metric.literal
			val s2 = getLimitTypeText(limitType)
			val s3 = getTimeText(limitValue)
			return s1 + s2 + s3
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTimeRequirementLimitItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TimeRequirementLimit)) {
			case AmaltheaPackage::TIME_REQUIREMENT_LIMIT__METRIC:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ProcessRequirementItemProvider
	 *****************************************************************************/
	def static String getProcessRequirementItemProviderText(Object object, String defaultText) {
		if (object instanceof ProcessRequirement) {
			val reqName = object?.name
			val proc = object?.process
			val s1 = ppName(reqName)
			val s2 = if(proc?.name.isNullOrEmpty) "<process>" else proc.eClass.name + " " + proc.name
			return "Req " + s1 + " -- " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getProcessRequirementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ProcessRequirement)) {
			case AmaltheaPackage::PROCESS_REQUIREMENT__NAME,
			case AmaltheaPackage::PROCESS_REQUIREMENT__PROCESS:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						RunnableRequirementItemProvider
	 *****************************************************************************/
	def static String getRunnableRequirementItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableRequirement) {
			val reqName = object?.name
			val runName = object?.runnable?.name
			val s1 = ppName(reqName)
			val s2 = if(runName.isNullOrEmpty) "<runnable>" else "Runnable " + runName
			return "Req " + s1 + " -- " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getRunnableRequirementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(RunnableRequirement)) {
			case AmaltheaPackage::RUNNABLE_REQUIREMENT__NAME,
			case AmaltheaPackage::RUNNABLE_REQUIREMENT__RUNNABLE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ProcessChainRequirementItemProvider
	 *****************************************************************************/
	def static String getProcessChainRequirementItemProviderText(Object object, String defaultText) {
		if (object instanceof ProcessChainRequirement) {
			val reqName = object?.name
			val pcName = object?.processChain?.name
			val s1 = ppName(reqName)
			val s2 = if(pcName.isNullOrEmpty) "<process chain>" else "Process Chain " + pcName
			return "Req " + s1 + " -- " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getProcessChainRequirementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ProcessChainRequirement)) {
			case AmaltheaPackage::PROCESS_CHAIN_REQUIREMENT__NAME,
			case AmaltheaPackage::PROCESS_CHAIN_REQUIREMENT__PROCESS_CHAIN:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						DataAgeCycleItemProvider
	 *****************************************************************************/
	def static String getDataAgeCycleItemProviderText(Object object, String defaultText) {
		if (object instanceof DataAgeCycle) {
			return "Age cycles c: " + object.minimumCycle + " <= c <= " + object.maximumCycle
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DataAgeTimeItemProvider
	 *****************************************************************************/
	def static String getDataAgeTimeItemProviderText(Object object, String defaultText) {
		if (object instanceof DataAgeTime) {
			val minTime = object?.minimumTime
			val maxTime = object?.maximumTime
			return "Age time t: " + getTimeText(minTime) + " <= t <= " + getTimeText(maxTime)
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getDataAgeTimeItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(DataAgeTime)) {
			case AmaltheaPackage::DATA_AGE_TIME__MINIMUM_TIME,
			case AmaltheaPackage::DATA_AGE_TIME__MAXIMUM_TIME:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						DataCoherencyGroupItemProvider
	 *****************************************************************************/
	def static String getDataCoherencyGroupItemProviderText(Object object, String defaultText) {
		if (object instanceof DataCoherencyGroup) {
			val name = object?.name
			val direction = object?.direction
			val scope = object?.scope
			val s1 = ppName(name, "<group>")
			val s2 = if(direction === null ||
					direction == CoherencyDirection::_UNDEFINED_) "<direction>" else direction.literal
			val s3 = switch scope {
				RunnableScope: if(scope.runnable?.name.isNullOrEmpty) "<runnable>" else "Runnable " +
					scope.runnable.name
				ProcessScope: if(scope.process?.name.isNullOrEmpty) "<process>" else scope.process.eClass.name + " " +
					scope.process.name
				ComponentScope: if(scope.component?.name.isNullOrEmpty) "<component>" else "Component " +
					scope.component.name
				default: "?"
			}
			return "CoherencyGroup " + s1 + " " + s2 + " (Scope: " + s3 + ")"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getDataCoherencyGroupItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(DataCoherencyGroup)) {
			case AmaltheaPackage::DATA_COHERENCY_GROUP__NAME,
			case AmaltheaPackage::DATA_COHERENCY_GROUP__DIRECTION:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::DATA_COHERENCY_GROUP__SCOPE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						EventChainReferenceItemProvider
	 *****************************************************************************/
	def static String getEventChainReferenceItemProviderText(Object object, String defaultText) {
		if (object instanceof EventChainReference) {
			val chainName = object?.eventChain?.name
			val s1 = getContainingFeatureName(object)
			val s2 = if(chainName.isNullOrEmpty) "<chain ref>" else "(Chain Ref) " + chainName
			return s1 + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getEventChainReferenceItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(EventChainReference)) {
			case AmaltheaPackage::EVENT_CHAIN_REFERENCE__EVENT_CHAIN:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						EventChainContainerItemProvider
	 *****************************************************************************/
	def static String getEventChainContainerItemProviderText(Object object, String defaultText) {
		if (object instanceof EventChainContainer) {
			val chain = object?.eventChain
			val s1 = getContainingFeatureName(object)
			val s2 = if(chain === null) "<sub chain>" else if(chain.name.
					isNullOrEmpty) "Sub Chain" else "(Sub Chain) " + chain.name
			return s1 + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getEventChainContainerItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SubEventChain)) {
			case AmaltheaPackage::EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						TagGroupItemProvider
	 *****************************************************************************/
	def static String getTagGroupItemProviderText(Object object, String defaultText) {
		if (object instanceof TagGroup) {
			val tagName = object?.tag?.name
			val s1 = if(tagName.isNullOrEmpty) "<tag>" else "\"" + tagName + "\""
			return "Items with tag " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTagGroupItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TagGroup)) {
			case AmaltheaPackage::TAG_GROUP__TAG:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

///// 
///// _________________________ Events _________________________
///// 

	/*****************************************************************************
	 * 						PhysicalSectionConstraintItemProvider
	 *****************************************************************************/
	def static String getPhysicalSectionConstraintItemProviderText(Object object, String defaultText) {
		if (object instanceof PhysicalSectionConstraint) {
			val section = object?.section
			val memories = object?.memories

			val sectionString = if(section?.name.isNullOrEmpty) "<section>" else "Section :  " + section.name

			val List<String> memoryNames = new ArrayList<String>()

			if (!memories.isNullOrEmpty) {
				memories.forEach [ it |
					val st = if(it?.name.isNullOrEmpty) "???" else it.name
					memoryNames.add(st)
				]
			}

			val memoriesString = if (memoryNames.isNullOrEmpty) {
					"<memories>"
				} else {
					if (memoryNames.size > 10) {
						" Memories : " + memoryNames.subList(0, 10).join(', ') + ", ..."
					} else {
						" Memories : " + memoryNames.join(', ')
					}
				}

			val s0 = if(object?.name.isNullOrEmpty) "<name>" else object.name

			return s0 + " : (" + sectionString + ")" + " --> (" + memoriesString + ")";
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getPhysicalSectionConstraintItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(PhysicalSectionConstraint)) {
			case AmaltheaPackage::PHYSICAL_SECTION_CONSTRAINT__NAME:
				return (new ViewerNotification(notification, notification.getNotifier(), false, false))
			case AmaltheaPackage::PHYSICAL_SECTION_CONSTRAINT__SECTION:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
			case AmaltheaPackage::PHYSICAL_SECTION_CONSTRAINT__MEMORIES:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

///// 
///// _________________________ HW _________________________
///// 

	/*****************************************************************************
	 * 						HwStructureItemProvider
	 *****************************************************************************/

	def static String getHwStructureItemProviderImageName(Object object, String defaultName) {
		if (object instanceof HwStructure) {
			switch (object.structureType) {
				case SYSTEM:
					return "HwStructure_System"
				case ECU:
					return "HwStructure_ECU"
				case MICROCONTROLLER:
					return "HwStructure_Microcontroller"
				default:
					return "HwStructure"
			}
		} else {
			return defaultName
		}
	}

	/*****************************************************************************
	 * 						HwFeatureCategoryItemProvider
	 *****************************************************************************/
	def static ViewerNotification getHwFeatureCategoryItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(HwFeatureCategory)) {
			case AmaltheaPackage::HW_FEATURE_CATEGORY__NAME,
			case AmaltheaPackage::HW_FEATURE_CATEGORY__FEATURES:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						HwFeatureItemProvider
	 *****************************************************************************/
	def static String getHwFeatureItemProviderText(Object object, String defaultText) {
		if (object instanceof HwFeature) {
			return object.toString
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						HwPortItemProvider
	 *****************************************************************************/
	def static String getHwPortItemProviderText(Object object, String defaultText) {
		if (object instanceof HwPort) {
			val name = object.name
			val cName = (object.eContainer as INamed).name
			val cType = if(object.eContainer instanceof HwStructure) "<structure>" else "<module>"

			val s1 = ppName(cName, cType)
			val s2 = ppName(name, "<port>")
			return s1 + "_" + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getHwPortItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(HwPort)) {
			case AmaltheaPackage::HW_PORT__NAME:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						HwAccessElementItemProvider
	 *****************************************************************************/
	def static String getHwAccessElementItemProviderText(Object object, String defaultText) {
		if (object instanceof HwAccessElement) {
			val s1 = ppName(object.name, "???")
			val s2 = ppName(object.source?.name, "<source>")
			val s3 = ppName(object.destination?.name, "<destination>")
			return s1 + ": " + s2 + " --> " + s3
		}
	}

	def static ViewerNotification getHwAccessElementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(HwAccessElement)) {
			case AmaltheaPackage::HW_ACCESS_ELEMENT__NAME,
			case AmaltheaPackage::HW_ACCESS_ELEMENT__SOURCE,
			case AmaltheaPackage::HW_ACCESS_ELEMENT__DESTINATION:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::HW_ACCESS_ELEMENT__READ_LATENCY,
			case AmaltheaPackage::HW_ACCESS_ELEMENT__WRITE_LATENCY,
			case AmaltheaPackage::HW_ACCESS_ELEMENT__ACCESS_PATH:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						HwAccessPathItemProvider
	 *****************************************************************************/
	def static String getHwAccessPathItemProviderText(Object object, String defaultText) {
		if (object instanceof HwAccessPath) {
			return object.name
		}
	}

	/*****************************************************************************
	 * 						HwConnectionItemProvider
	 *****************************************************************************/
	def static String getHwConnectionItemProviderText(Object object, String defaultText) {
		if (object instanceof HwConnection) {
			val cName1 = (object.port1?.eContainer as INamed)?.name
			val cName2 = (object.port2?.eContainer as INamed)?.name

			val s1 = ppName(object.name, "???")
			val s2 = ppName(cName1, "<module1>")
			val s3 = ppName(object.port1?.name, "<port1>")
			val s4 = ppName(cName2, "<module2>")
			val s5 = ppName(object.port2?.name, "<port2>")
			return s1 + ": " + s2 + "_" + s3 + " --> " + s4 + "_" + s5
		}
	}

	def static ViewerNotification getHwConnectionItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(HwConnection)) {
			case AmaltheaPackage::HW_CONNECTION__NAME,
			case AmaltheaPackage::HW_CONNECTION__PORT1,
			case AmaltheaPackage::HW_CONNECTION__PORT2:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage.HW_CONNECTION__READ_LATENCY,
			case AmaltheaPackage.HW_CONNECTION__WRITE_LATENCY,
			case AmaltheaPackage.HW_CONNECTION__DATA_RATE:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						LatencyConstantItemProvider
	 *****************************************************************************/
	def static String getLatencyConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof LatencyConstant) {
			val feature = getContainingFeatureName(object, "", "")
			val s1 = if(feature == "value") "" else feature + " -- "
			val s2 = Long.toString(object.cycles)
			return s1 + "cycles (constant): " + s2
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						LatencyDeviationItemProvider
	 *****************************************************************************/
	def static String getLatencyDeviationItemProviderText(Object object, String defaultText) {
		if (object instanceof LatencyDeviation) {
			val feature = getContainingFeatureName(object, "", "")
			val s1 = if(feature == "value") "" else feature + " -- "
			val distName = object.cycles?.distribution?.eClass?.name
			val s2 = if(distName.isNullOrEmpty) "<distribution>" else trimDistName(distName)
			return s1 + "cycles (deviation): " + s2
		} else {
			return defaultText
		}
	}

///// 
///// _________________________ Mapping _________________________
///// 

	/*****************************************************************************
	 * 						MappingModelItemProvider
	 *****************************************************************************/
	def static String getMappingModelItemProviderText(Object object, String defaultText) {
		return "Mapping"
	}

	/*****************************************************************************
	 * 						SchedulerAllocationItemProvider
	 *****************************************************************************/
	def static String getSchedulerAllocationItemProviderText(Object object, String defaultText) {
		if (object instanceof SchedulerAllocation) {
			val schedName = object?.scheduler?.name
			val cores = object?.responsibility
			val s1 = if(schedName.isNullOrEmpty) "<scheduler>" else "Scheduler " + schedName
			val s2 = cores.map[e|ppName(e?.name)].join(", ")
			return "Allocation: " + s1 + " -- Cores ( " + s2 + " )";
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getSchedulerAllocationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SchedulerAllocation)) {
			case AmaltheaPackage::SCHEDULER_ALLOCATION__SCHEDULER,
			case AmaltheaPackage::SCHEDULER_ALLOCATION__RESPONSIBILITY:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::SCHEDULER_ALLOCATION__CUSTOM_PROPERTIES:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						ISRAllocationItemProvider
	 *****************************************************************************/
	def static String getISRAllocationItemProviderText(Object object, String defaultText) {
		if (object instanceof ISRAllocation) {
			val ctrlName = object?.controller?.name
			val isrName = object?.isr?.name
			val s1 = if(ctrlName.isNullOrEmpty) "<controller>" else "Controller " + ctrlName
			val s2 = if(isrName.isNullOrEmpty) "<isr>" else "ISR " + isrName
			return "Allocation: " + s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getISRAllocationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ISRAllocation)) {
			case AmaltheaPackage::ISR_ALLOCATION__CONTROLLER,
			case AmaltheaPackage::ISR_ALLOCATION__ISR:
				// update the label but not the content tree
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						RunnableAllocationItemProvider
	 *****************************************************************************/
	def static String getRunnableAllocationItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableAllocation) {
			val schedName = object?.scheduler?.name
			val entityName = object?.entity?.name
			val s1 = if(schedName.isNullOrEmpty) "<scheduler>" else "Scheduler " + schedName
			val s2 = if(entityName.isNullOrEmpty) "<runnable>" else "Runnable " + entityName
			return "Allocation: " + s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getRunnableAllocationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(RunnableAllocation)) {
			case AmaltheaPackage::RUNNABLE_ALLOCATION__ENTITY,
			case AmaltheaPackage::RUNNABLE_ALLOCATION__SCHEDULER:
				// update the label but not the content tree
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						TaskAllocationItemProvider
	 *****************************************************************************/
	def static String getTaskAllocationItemProviderText(Object object, String defaultText) {
		if (object instanceof TaskAllocation) {
			val schedName = object?.scheduler?.name
			val taskName = object?.task?.name
			val s1 = if(schedName.isNullOrEmpty) "<scheduler>" else "Scheduler " + schedName
			val s2 = if(taskName.isNullOrEmpty) "<task>" else "Task " + taskName
			return "Allocation: " + s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTaskAllocationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TaskAllocation)) {
			case AmaltheaPackage::TASK_ALLOCATION__TASK,
			case AmaltheaPackage::TASK_ALLOCATION__SCHEDULER:
				// update the label
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS,
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				// update the content tree
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						MemoryMappingItemProvider
	 *****************************************************************************/
	def static String getMemoryMappingItemProviderText(Object object, String defaultText) {
		if (object instanceof MemoryMapping) {
			val memName = object?.memory?.name
			val elem = object?.abstractElement
			val s1 = if(memName.isNullOrEmpty) "<memory>" else "Memory " + memName
			val s2 = if(elem?.name.isNullOrEmpty) "<element>" else elem.eClass.name + " " + elem.name
			return "Mapping: " + s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getMemoryMappingItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(MemoryMapping)) {
			case AmaltheaPackage::MEMORY_MAPPING__MEMORY,
			case AmaltheaPackage::MEMORY_MAPPING__ABSTRACT_ELEMENT:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						PhysicalSectionMappingItemProvider
	 *****************************************************************************/
	def static String getPhysicalSectionMappingItemProviderText(Object object, String defaultText) {
		if (object instanceof PhysicalSectionMapping) {
			val memory = object?.memory
			val sections = object?.origin

			val memoryString = if(memory?.name.isNullOrEmpty) "<memory>" else "Memory :  " + memory.name

			val List<String> sectionNames = new ArrayList<String>()

			if (!sections.isNullOrEmpty) {
				sections.forEach [ it |
					val st = if(it?.name.isNullOrEmpty) "???" else it.name
					sectionNames.add(st)
				]
			}

			val sectionsString = if (sectionNames.isNullOrEmpty) {
					"<sections>"
				} else {
					if (sectionNames.size > 10) {
						" Sections : " + sectionNames.subList(0, 10).join(', ') + ", ..."
					} else {
						" Sections : " + sectionNames.join(', ')
					}
				}

			val s0 = ppName(object?.name, "<name>")

			return s0 + " : (" + sectionsString + ")" + " --> (" + memoryString + ")";
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getPhysicalSectionMappingItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(PhysicalSectionMapping)) {
			case AmaltheaPackage::PHYSICAL_SECTION_MAPPING__MEMORY:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::PHYSICAL_SECTION_MAPPING__ORIGIN:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
			case AmaltheaPackage::PHYSICAL_SECTION_MAPPING__NAME:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

///// 
///// _________________________ OS _________________________
///// 

	/*****************************************************************************
	 * 						OsDataConsistencyItemProvider
	 *****************************************************************************/
	def static String getOsDataConsistencyItemProviderText(Object object, String defaultText) {
		if (object instanceof OsDataConsistency) {
			val mode = object.mode

			val s1 = "OS Data Consistency - "
			val s2 = if(mode === null || mode == OsDataConsistencyMode::_UNDEFINED_) "?" else mode.literal
			return s1 + s2
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DataStabilityItemProvider
	 *****************************************************************************/
	def static String getDataStabilityItemProviderText(Object object, String defaultText) {
		if (object instanceof DataStability) {
			return "OS Data Stability - enabled: " + object.enabled.toString
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						NonAtomicDataCoherencyItemProvider
	 *****************************************************************************/
	def static String getNonAtomicDataCoherencyItemProviderText(Object object, String defaultText) {
		if (object instanceof NonAtomicDataCoherency) {
			return "OS Data Coherency - enabled: " + object.enabled.toString
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						OsInstructionsItemProvider
	 *****************************************************************************/
	def static String getOsInstructionsItemProviderText(Object object, String defaultText) {
		if (object instanceof OsInstructions) {
			val name = object.name
			val s1 = if(name.isNullOrEmpty) "OS Instructions" else name
			return s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						OsAPIInstructionsItemProvider
	 *****************************************************************************/
	def static String getOsAPIInstructionsItemProviderText(Object object, String defaultText) {
		if (object instanceof OsAPIInstructions) {
			return getContainingFeatureName(object, "API Instructions", "")
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						OsISRInstructionsItemProvider
	 *****************************************************************************/
	def static String getOsISRInstructionsItemProviderText(Object object, String defaultText) {
		if (object instanceof OsISRInstructions) {
			val feature = object?.eContainingFeature()
			val s1 = if(feature === null) "" else feature.name
			return s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						SchedulingParametersItemProvider
	 *****************************************************************************/
	def static String getSchedulingParametersItemProviderText(Object object, String defaultText) {
		if (object instanceof SchedulingParameters) {
			return "Parameters (Scheduling)";
		} else {
			return defaultText
		}
	}

///// 
///// _________________________ PropertyConstraints _________________________
///// 

	/*****************************************************************************
	 * 						ProcessPrototypeAllocationConstraintItemProvider
	 *****************************************************************************/
	def static String getProcessPrototypeAllocationConstraintItemProviderText(Object object, String defaultText) {
		if (object instanceof ProcessPrototypeAllocationConstraint) {
			val name = object?.processPrototype?.name
			val s1 = if(name.isNullOrEmpty) "<process prototype>" else "Prototype " + name
			return "Constraint allocation of " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getProcessPrototypeAllocationConstraintItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ProcessPrototypeAllocationConstraint)) {
			case AmaltheaPackage::PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__PROCESS_PROTOTYPE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ProcessAllocationConstraintItemProvider
	 *****************************************************************************/
	def static String getProcessAllocationConstraintItemProviderText(Object object, String defaultText) {
		if (object instanceof ProcessAllocationConstraint) {
			val proc = object?.process
			val s1 = if(proc?.name.isNullOrEmpty) "<process>" else proc.eClass.name + " " + proc.name
			return "Constraint allocation of " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getProcessAllocationConstraintItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ProcessAllocationConstraint)) {
			case AmaltheaPackage::PROCESS_ALLOCATION_CONSTRAINT__PROCESS:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						RunnableAllocationConstraintItemProvider
	 *****************************************************************************/
	def static String getRunnableAllocationConstraintItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableAllocationConstraint) {
			val runName = object?.runnable?.name
			val s1 = if(runName.isNullOrEmpty) "<runnable>" else "Runnable " + runName
			return "Constraint allocation of " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getRunnableAllocationConstraintItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(RunnableAllocationConstraint)) {
			case AmaltheaPackage::RUNNABLE_ALLOCATION_CONSTRAINT__RUNNABLE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						CoreClassificationItemProvider
	 *****************************************************************************/
	def static String getCoreClassificationItemProviderText(Object object, String defaultText) {
		if (object instanceof CoreClassification) {
			val con = object?.condition
			val grp = object?.grouping
			val cla = object?.classifiers

			val s1 = if(con === null || con == Condition::_UNDEFINED_) "<condition>" else con.literal
			val s2 = if(grp === null || grp == GroupingType::_UNDEFINED_) "<grouping>" else ppCamelCase(grp.literal).toLowerCase
			val s3 = if(cla.isNullOrEmpty) "<classifiers>" else cla.map[e|ppName(e?.name)].join(", ")
			return s1 + " (" + s2 + "): " + s3;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getCoreClassificationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(CoreClassification)) {
			case AmaltheaPackage::CORE_CLASSIFICATION__CONDITION,
			case AmaltheaPackage::CORE_CLASSIFICATION__GROUPING,
			case AmaltheaPackage::CORE_CLASSIFICATION__CLASSIFIERS:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						AbstractElementMappingConstraintItemProvider
	 *****************************************************************************/
	def static String getAbstractElementMappingConstraintItemProviderText(Object object, String defaultText) {
		if (object instanceof AbstractElementMappingConstraint) {
			val elem = object?.abstractElement
			val s1 = if(elem?.name.isNullOrEmpty) "<element>" else elem.eClass.name + " " + elem.name
			return "Constraint mapping of " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getAbstractElementMappingConstraintItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(AbstractElementMappingConstraint)) {
			case AmaltheaPackage::ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						MemoryClassificationItemProvider
	 *****************************************************************************/
	def static String getMemoryClassificationItemProviderText(Object object, String defaultText) {
		if (object instanceof MemoryClassification) {
			val con = object?.condition
			val grp = object?.grouping
			val cla = object?.classifiers

			val s1 = if(con === null || con == Condition::_UNDEFINED_) "<condition>" else con.literal
			val s2 = if(grp === null || grp == GroupingType::_UNDEFINED_) "<grouping>" else ppCamelCase(grp.literal).toLowerCase
			val s3 = if(cla.isNullOrEmpty) "<classifiers>" else cla.map[e|ppName(e?.name)].join(", ")
			return s1 + " (" + s2 + "): " + s3;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getMemoryClassificationItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(MemoryClassification)) {
			case AmaltheaPackage::MEMORY_CLASSIFICATION__CONDITION,
			case AmaltheaPackage::MEMORY_CLASSIFICATION__GROUPING,
			case AmaltheaPackage::MEMORY_CLASSIFICATION__CLASSIFIERS:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

///// 
///// _________________________ Stimuli _________________________
///// 

	/*****************************************************************************
	 * 						ModeValueListItemProvider
	 *****************************************************************************/
	def static String getModeValueListItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeValueList) {
			return getContainingFeatureName(object) + defaultText
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ModeValueDisjunctionItemProvider
	 *****************************************************************************/
	def static String getModeValueDisjunctionItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeValueDisjunction) {
			return getContainingFeatureName(object) + "OR"
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ModeValueConjunctionItemProvider
	 *****************************************************************************/
	def static String getModeValueConjunctionItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeValueConjunction) {
			return "AND"
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ModeValueItemProvider
	 *****************************************************************************/
	def static String getModeValueItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeValue) {
			val prov = object?.valueProvider
			val value = object?.value
			val relation = if(object?.eContainer instanceof ModeValueList) " <- " else " == "
			val s1 = if(prov?.name.isNullOrEmpty) "<mode label>" else "Mode Label " + prov.name
			val s2 = if(value === null) "<value>" else value.toString
			return s1 + relation + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getModeValueItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ModeValueImpl)) {
			case AmaltheaPackage::MODE_VALUE__VALUE_PROVIDER,
			case AmaltheaPackage::MODE_VALUE__VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ArrivalCurveEntryItemProvider
	 *****************************************************************************/
	def static String getArrivalCurveEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ArrivalCurveEntry) {
			val num = if(object === null) 0 else object.numberOfOccurrences
			val s1 = getTimeText(object?.lowerTimeBorder)
			val s2 = getTimeText(object?.upperTimeBorder)
			return "#occurrences: " + num + " -- interval: " + s1 + ", " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getArrivalCurveEntryItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ArrivalCurveEntry)) {
			case AmaltheaPackage::ARRIVAL_CURVE_ENTRY__NUMBER_OF_OCCURRENCES:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER,
			case AmaltheaPackage::ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

///// 
///// _________________________ SW _________________________
///// 

	private def static getRunnableItemText(RunnableItem item) {
		switch item {
			LabelAccess: getLabelAccessItemProviderText(item, null)
			RunnableCall: getRunnableCallItemProviderText(item, null)
			ExecutionNeed: "Execution Need"
			Group: getGroupItemProviderText(item, null)
			RunnableModeSwitch: getRunnableModeSwitchItemProviderText(item, null)
			RunnableProbabilitySwitch: "Probability Switch"
			ModeLabelAccess: getModeLabelAccessItemProviderText(item, null)
			SemaphoreAccess: getSemaphoreAccessItemProviderText(item, null)
			SenderReceiverRead: getSenderReceiverReadItemProviderText(item, null)
			SenderReceiverWrite: getSenderReceiverWriteItemProviderText(item, null)
			AsynchronousServerCall: getAsynchronousServerCallItemProviderText(item, null)
			SynchronousServerCall: getSynchronousServerCallItemProviderText(item, null)
		}
	}

	/*****************************************************************************
	 * 						AccessPrecedenceSpecItemProvider
	 *****************************************************************************/
	def static String getAccessPrecedenceSpecItemProviderText(Object object, String defaultText) {
		if (object instanceof AccessPrecedenceSpec) {
			val originName = object?.origin?.name
			val targetName = object?.target?.name
			val labelName = object?.label?.name
			val accessType = object?.orderType
			val s1 = ppName(originName, "<runnable>")
			val s2 = ppName(targetName, "<runnable>")
			val s3 = ppName(labelName, "<label>")
			val s4 = if(accessType === null || accessType == AccessPrecedenceType::_UNDEFINED_) "<access>" else accessType.literal
			return "Spec: " + s1 + " --> " + s2 + " (" + s3 + " : " + s4 + ")"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getAccessPrecedenceSpecItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(AccessPrecedenceSpec)) {
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__ORDER_TYPE,
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__ORIGIN,
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__TARGET,
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__LABEL:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						OrderPrecedenceSpecItemProvider
	 *****************************************************************************/
	def static String getOrderPrecedenceSpecItemProviderText(Object object, String defaultText) {
		if (object instanceof OrderPrecedenceSpec) {
			val originName = object?.origin?.name
			val targetName = object?.target?.name
			val order = object?.orderType
			val s1 = ppName(originName, "<runnable>")
			val s2 = ppName(targetName, "<runnable>")
			val s3 = if(order === null || order == OrderType::_UNDEFINED_) "<order>" else order.literal
			return "Spec: " + s1 + " --> " + s2 + " (" + s3 + ")"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getOrderPrecedenceSpecItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(OrderPrecedenceSpec)) {
			case AmaltheaPackage::ORDER_PRECEDENCE_SPEC__ORDER_TYPE,
			case AmaltheaPackage::ORDER_PRECEDENCE_SPEC__ORIGIN,
			case AmaltheaPackage::ORDER_PRECEDENCE_SPEC__TARGET:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						AsynchronousServerCallItemProvider
	 *****************************************************************************/
	def static String getAsynchronousServerCallItemProviderText(Object object, String defaultText) {
		if (object instanceof AsynchronousServerCall) {
			val serverRun = object?.serverRunnable?.name
			val resultRun = object?.resultRunnable?.name
			val s1 = ppName(serverRun, "<runnable>")
			val s2 = ppName(resultRun, "<runnable>")
			return "call server: " + s1 + " (async - result: " + s2 + ")"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getAsynchronousServerCallItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(AsynchronousServerCall)) {
			case AmaltheaPackage::ASYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE,
			case AmaltheaPackage::ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						SynchronousServerCallItemProvider
	 *****************************************************************************/
	def static String getSynchronousServerCallItemProviderText(Object object, String defaultText) {
		if (object instanceof SynchronousServerCall) {
			val serverRun = object?.serverRunnable?.name
			val waiting = object?.waitingBehaviour
			val s1 = ppName(serverRun, "<runnable>")
			val s2 = if(waiting === null || waiting == WaitingBehaviour::_UNDEFINED_) "undefined" else waiting.literal
			return "call server: " + s1 + " (sync - " + s2 + " waiting)"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getSynchronousServerCallItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SynchronousServerCall)) {
			case AmaltheaPackage::SYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE,
			case AmaltheaPackage::SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						GetResultServerCallItemProvider
	 *****************************************************************************/
	def static String getGetResultServerCallItemProviderText(Object object, String defaultText) {
		if (object instanceof GetResultServerCall) {
			val serverRun = object?.serverRunnable?.name
			val blocking = object?.blockingType
			val s1 = ppName(serverRun, "<runnable>")
			val s2 = if(blocking === null || blocking == BlockingType::_UNDEFINED_) "undefined" else blocking.literal.replace("_", " ")
			return "call server: " + s1 + " (get result - " + s2 + ")"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getGetResultServerCallItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(GetResultServerCall)) {
			case AmaltheaPackage::GET_RESULT_SERVER_CALL__SERVER_RUNNABLE,
			case AmaltheaPackage::GET_RESULT_SERVER_CALL__BLOCKING_TYPE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ChainedProcessPrototypeItemProvider
	 *****************************************************************************/
	def static String getChainedProcessPrototypeItemProviderText(Object object, String defaultText) {
		if (object instanceof ChainedProcessPrototype) {
			val proto = object?.prototype?.name
			val apply = if(object === null) 0 else object.apply
			val offset = if(object === null) 0 else object.offset
			val s1 = ppName(proto, "<process prototype>")
			return "Chained Prototype " + s1 + " ( apply: " + apply + " offset: " + offset + " )"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getChainedProcessPrototypeItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ChainedProcessPrototype)) {
			case AmaltheaPackage::CHAINED_PROCESS_PROTOTYPE__PROTOTYPE,
			case AmaltheaPackage::CHAINED_PROCESS_PROTOTYPE__APPLY,
			case AmaltheaPackage::CHAINED_PROCESS_PROTOTYPE__OFFSET:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						GroupItemProvider
	 *****************************************************************************/
	def static String getGroupItemProviderText(Object object, String defaultText) {
		if (object instanceof Group) {
			val name = if(object.name.isNullOrEmpty) null else object.name
			val ordered = if(object === null) false else object.isOrdered
			val result = if(ordered) "(Sequence)" else "(Set)"
			return if(name === null) result else result + " " + name
		}
	}

	def static String getGroupItemProviderImageName(Object object, String defaultName) {
		if (object instanceof Group) {
			val ordered = if(object === null) false else object.isOrdered
			return "Group_" + if(ordered) "ordered" else "unordered"
		} else {
			return defaultName
		}
	}

	/*****************************************************************************
	 * 						InterProcessTriggerItemProvider
	 *****************************************************************************/
	def static String getInterProcessTriggerItemProviderText(Object object, String defaultText) {
		if (object instanceof InterProcessTrigger) {
			val stimulusName = object?.getStimulus?.name
			val s1 = ppName(stimulusName, "<stimulus>")
			return "trigger " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getInterProcessTriggerItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(InterProcessTrigger)) {
			case AmaltheaPackage::INTER_PROCESS_TRIGGER__STIMULUS:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ModeItemProvider
	 *****************************************************************************/
	def static ViewerNotification getModeItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(Mode)) {
			case AmaltheaPackage::MODE__NAME,
			case AmaltheaPackage::MODE__LITERALS:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ModeLiteralItemProvider
	 *****************************************************************************/
	def static String getModeLiteralItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeLiteral) {
			return object.toString
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ModeLabelItemProvider
	 *****************************************************************************/
	def static String getModeLabelItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeLabel) {
			val name = object.name
			val modeName = object.mode?.name
			val s1 = ppName(name, "<mode label>")
			val s2 = ppName(modeName, "<mode>")
			return s1 + " (" + s2 + ")";
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getModeLabelItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ModeLabel)) {
			case AmaltheaPackage::MODE_LABEL__NAME,
			case AmaltheaPackage::MODE_LABEL__INITIAL_VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ModeSwitchItemProvider
	 *****************************************************************************/
	def static String getModeSwitchItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeSwitch) {
			return "Mode Switch"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getModeSwitchItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ModeSwitch)) {
			case AmaltheaPackage.MODE_SWITCH__ENTRIES,
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						RunnableModeSwitchItemProvider
	 *****************************************************************************/
	def static String getRunnableModeSwitchItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableModeSwitch) {
			return "Mode Switch"
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getRunnableModeSwitchItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(RunnableModeSwitch)) {
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__ENTRIES,
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ENTRY:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						ModeSwitchEntryItemProvider
	 *****************************************************************************/
	def static String getModeSwitchEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeSwitchEntry<?>) {
			// Idea: create short notation if structure is simple (like the old one)
			// val valueName = object?.values?.join("", ", ", "", [name])
			val entryName = object?.name
			val s1 = if(entryName.nullOrEmpty) "_" else "\"" + entryName + "\""
			return "case: " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getModeSwitchEntryItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ModeSwitchEntry)) {
			case AmaltheaPackage::MODE_SWITCH_ENTRY__CONDITION,
			case AmaltheaPackage::MODE_SWITCH_ENTRY__ITEMS:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
			case AmaltheaPackage::MODE_SWITCH_ENTRY__NAME:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ModeSwitchDefaultItemProvider
	 *****************************************************************************/
	def static String getModeSwitchDefaultItemProviderText(Object object, String defaultText) {
		return "default"
	}

	/*****************************************************************************
	 * 						TaskRunnableCallItemProvider
	 *****************************************************************************/
	def static String getTaskRunnableCallItemProviderText(Object object, String defaultText) {
		if (object instanceof TaskRunnableCall) {
			val runName = object?.runnable?.name
			val s1 = ppName(runName, "<runnable>")
			return "call " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTaskRunnableCallItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TaskRunnableCall)) {
			case AmaltheaPackage::TASK_RUNNABLE_CALL__RUNNABLE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::TASK_RUNNABLE_CALL__STATISTIC:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						LabelAccessItemProvider
	 *****************************************************************************/
	def static String getLabelAccessItemProviderText(Object object, String defaultText) {
		if (object instanceof LabelAccess) {
			val access = object?.access
			val labelName = object?.data?.name
			val s1 = if(access === null || access == LabelAccessEnum::_UNDEFINED_) "<access>" else access.literal
			val s2 = ppName(labelName, "<label>")
			return s1 + " " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getLabelAccessItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(LabelAccess)) {
			case AmaltheaPackage::LABEL_ACCESS__ACCESS,
			case AmaltheaPackage::LABEL_ACCESS__DATA:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::LABEL_ACCESS__STATISTIC:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						ChannelAccessItemProvider
	 *****************************************************************************/
	def static ViewerNotification getChannelAccessItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ChannelAccess)) {
			case AmaltheaPackage::CHANNEL_ACCESS__DATA:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::CHANNEL_ACCESS__TRANSMISSION_POLICY:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						ChannelReceiveItemProvider
	 *****************************************************************************/
	def static String getChannelReceiveItemProviderText(Object object, String defaultText) {
		if (object instanceof ChannelReceive) {
			val data = object?.data?.name

			val s1 = ppName(data, "<channel>")
			return "receive from " + s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ChannelSendItemProvider
	 *****************************************************************************/
	def static String getChannelSendItemProviderText(Object object, String defaultText) {
		if (object instanceof ChannelSend) {
			val data = object?.data?.name

			val s1 = ppName(data, "<channel>")
			return "send to " + s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						SemaphoreAccessItemProvider
	 *****************************************************************************/
	def static String getSemaphoreAccessItemProviderText(Object object, String defaultText) {
		if (object instanceof SemaphoreAccess) {
			val access = object?.access
			val semName = object?.semaphore?.name
			val s1 = if(access === null || access == SemaphoreAccessEnum::_UNDEFINED_) "<access>" else access.literal
			val s2 = ppName(semName, "<semaphore>")
			return s1 + " " + s2

		} else {
			return defaultText
		}
	}

	def static ViewerNotification getSemaphoreAccessItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SemaphoreAccess)) {
			case AmaltheaPackage::SEMAPHORE_ACCESS__ACCESS,
			case AmaltheaPackage::SEMAPHORE_ACCESS__SEMAPHORE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ModeLabelAccessItemProvider
	 *****************************************************************************/
	def static String getModeLabelAccessItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeLabelAccess) {
			val access = object?.access
			val label = object?.data?.name
			val s1 = if(access === null || access == LabelAccessEnum::_UNDEFINED_) "<access>" else access.literal
			val s2 = ppName(label, "<mode label>")
			return s1 + " " + s2
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getModeLabelAccessItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(ModeLabelAccess)) {
			case AmaltheaPackage::MODE_LABEL_ACCESS__ACCESS,
			case AmaltheaPackage::MODE_LABEL_ACCESS__DATA:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						ExecutionNeedExtendedItemProvider
	 *****************************************************************************/
	def static String getExecutionNeedExtendedItemProviderText(Object object, String defaultText) {
		if (object instanceof ExecutionNeedExtendedImpl) {
			val typeName = object?.getKey()?.name

			val s1 = if(typeName.isNullOrEmpty) "<core type>" else typeName
			val s2 = "Needs (Map)"
			return s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getExecutionNeedExtendedItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(Map.Entry)) {
			case AmaltheaPackage::EXECUTION_NEED_EXTENDED__KEY:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::EXECUTION_NEED_EXTENDED__VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						NeedEntryItemProvider
	 *****************************************************************************/
	def static String getNeedEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof NeedEntryImpl) {
			val featureName = object?.getKey()
			val need = object?.getValue()

			val s1 = if(featureName.isNullOrEmpty) "<feature>" else "Feature \"" + featureName + "\""
			val s2 = if(need === null) "<need>" else getNeedText(need)
			return s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getNeedEntryItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(Map.Entry)) {
			case AmaltheaPackage::NEED_ENTRY__KEY:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::NEED_ENTRY__VALUE:
				return new ViewerNotification(notification, notification.getNotifier(), true, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						RunnableCallItemProvider
	 *****************************************************************************/
	def static String getRunnableCallItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableCall) {
			val runName = object?.runnable?.name
			val s1 = ppName(runName, "<runnable>")
			return "call " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getRunnableCallItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(RunnableCall)) {
			case AmaltheaPackage::RUNNABLE_CALL__RUNNABLE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
			case AmaltheaPackage::RUNNABLE_CALL__STATISTIC:
				return new ViewerNotification(notification, notification.getNotifier(), true, false)
		}
		return null
	}

	/*****************************************************************************
	 * 						CustomEventTriggerItemProvider
	 *****************************************************************************/
	def static String getCustomEventTriggerItemProviderText(Object object, String defaultText) {
		if (object instanceof CustomEventTrigger) {
			val eventName = object?.event?.name
			val s1 = ppName(eventName, "<custom event>")
			return "trigger " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getCustomEventTriggerItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(CustomEventTrigger)) {
			case AmaltheaPackage::CUSTOM_EVENT_TRIGGER__EVENT:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						SenderReceiverReadItemProvider
	 *****************************************************************************/
	def static String getSenderReceiverReadItemProviderText(Object object, String defaultText) {
		if (object instanceof SenderReceiverRead) {
			val labelName = object?.label?.name
			val s1 = if(labelName.isNullOrEmpty) "<label>" else "Label " + labelName
			return "Sender Receiver - Read " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getSenderReceiverReadItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SenderReceiverRead)) {
			case AmaltheaPackage::SENDER_RECEIVER_READ__LABEL:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						SenderReceiverWriteItemProvider
	 *****************************************************************************/
	def static String getSenderReceiverWriteItemProviderText(Object object, String defaultText) {
		if (object instanceof SenderReceiverWrite) {
			val labelName = object?.label?.name
			val s1 = if(labelName.isNullOrEmpty) "<label>" else "Label " + labelName
			return "Sender Receiver - Write " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getSenderReceiverWriteItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SenderReceiverWrite)) {
			case AmaltheaPackage::SENDER_RECEIVER_WRITE__LABEL:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						SetEventItemProvider
	 *****************************************************************************/
	def static String getSetEventItemProviderText(Object object, String defaultText) {
		if (object instanceof SetEvent) {
			val proc = object?.process
			val s1 = if(proc?.name.isNullOrEmpty) "<process>" else proc.eClass.name + " " + proc.name
			return "SetEvent " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getSetEventItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(SetEvent)) {
			case AmaltheaPackage::SET_EVENT__PROCESS:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						WaitEventItemProvider
	 *****************************************************************************/
	def static String getWaitEventItemProviderText(Object object, String defaultText) {
		if (object instanceof WaitEvent) {
			val waiting = object?.waitingBehaviour
			val s1 = if(waiting === null || waiting == WaitingBehaviour::_UNDEFINED_) "<waiting>" else waiting.literal
			return "WaitEvent " + s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						ClearEventItemProvider
	 *****************************************************************************/
	def static String getClearEventItemProviderText(Object object, String defaultText) {
		if (object instanceof ClearEvent) {
			return "ClearEvent"
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						BaseTypeDefinitionItemProvider
	 *****************************************************************************/
	def static String getBaseTypeDefinitionItemProviderText(Object object, String defaultText) {
		if (object instanceof BaseTypeDefinition) {
			val name = object?.name
			val s1 = ppName(name, "<type definition>")
			return "BaseType " + s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TypeDefinitionItemProvider
	 *****************************************************************************/
	def static String getTypeDefinitionItemProviderText(Object object, String defaultText) {
		if (object instanceof TypeDefinition) {
			val name = object?.name
			val s1 = ppName(name, "<type definition>")
			return "Type " + s1
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TypeRefItemProvider
	 *****************************************************************************/
	def static String getTypeRefItemProviderText(Object object, String defaultText) {
		if (object instanceof TypeRef) {
			val typeName = object?.typeDef?.name
			val s1 = ppName(typeName, "<type definition>")
			return "TypeRef " + s1
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTypeRefItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TypeRef)) {
			case AmaltheaPackage::TYPE_REF__TYPE_DEF:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						DataPlatformMappingItemProvider
	 *****************************************************************************/
	def static String getDataPlatformMappingItemProviderText(Object object, String defaultText) {
		if (object instanceof DataPlatformMapping) {
			val name = object?.platformName
			val typeName = object?.platformType
			val s1 = ppName(name, "<platform>")
			val s2 = ppName(typeName, "<type>")
			return "Platform Mapping: " + s1 + " --> " + s2
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DataTypeDefinitionItemProvider
	 *****************************************************************************/
	def static String getDataTypeDefinitionItemProviderText(Object object, String defaultText) {
		if (object instanceof DataTypeDefinition) {
			val name = object?.name
			val s1 = ppName(name)
			return "DataType " + s1
		} else {
			return defaultText
		}
	}

///// 
///// _________________________ Measurement _________________________
///// 

	/*****************************************************************************
	 * 						TaskMeasurementItemProvider
	 *****************************************************************************/
	def static String getTaskMeasurementItemProviderText(Object object, String defaultText) {
		if (object instanceof TaskMeasurement) {
			val taskName = object?.task?.name
			val s1 = ppName(taskName, "<task>")
			return "Measurement -- Task " + s1;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getTaskMeasurementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(TaskMeasurement)) {
			case AmaltheaPackage::TASK_MEASUREMENT__TASK:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						RunnableMeasurementItemProvider
	 *****************************************************************************/
	def static String getRunnableMeasurementItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableMeasurement) {
			val runName = object?.runnable?.name
			val s1 = ppName(runName, "<runnable>")
			return "Measurement -- Runnable " + s1;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getRunnableMeasurementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(RunnableMeasurement)) {
			case AmaltheaPackage::RUNNABLE_MEASUREMENT__RUNNABLE:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

	/*****************************************************************************
	 * 						EventChainMeasurementItemProvider
	 *****************************************************************************/
	def static String getEventChainMeasurementItemProviderText(Object object, String defaultText) {
		if (object instanceof EventChainMeasurement) {
			val ecName = object?.eventChain?.name
			val s1 = ppName(ecName, "<event chain>")
			return "Measurement -- Event Chain " + s1;
		} else {
			return defaultText
		}
	}

	def static ViewerNotification getEventChainMeasurementItemProviderNotification(Notification notification) {
		switch notification.getFeatureID(typeof(EventChainMeasurement)) {
			case AmaltheaPackage::EVENT_CHAIN_MEASUREMENT__EVENT_CHAIN:
				return new ViewerNotification(notification, notification.getNotifier(), false, true)
		}
		return null
	}

}
