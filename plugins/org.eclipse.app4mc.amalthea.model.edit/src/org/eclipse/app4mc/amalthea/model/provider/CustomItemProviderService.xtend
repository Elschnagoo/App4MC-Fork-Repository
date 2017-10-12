package org.eclipse.app4mc.amalthea.model.provider

import java.util.ArrayList
import java.util.List
import java.util.Map
import org.apache.commons.lang.StringUtils
import org.eclipse.app4mc.amalthea.model.AbstractElementMappingConstraint
import org.eclipse.app4mc.amalthea.model.AbstractTime
import org.eclipse.app4mc.amalthea.model.AccessPathRef
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceSpec
import org.eclipse.app4mc.amalthea.model.AccessPrecedenceType
import org.eclipse.app4mc.amalthea.model.Amalthea
import org.eclipse.app4mc.amalthea.model.AmaltheaPackage
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement
import org.eclipse.app4mc.amalthea.model.ArrivalCurveEntry
import org.eclipse.app4mc.amalthea.model.AsynchronousServerCall
import org.eclipse.app4mc.amalthea.model.BaseTypeDefinition
import org.eclipse.app4mc.amalthea.model.BigIntegerObject
import org.eclipse.app4mc.amalthea.model.BooleanObject
import org.eclipse.app4mc.amalthea.model.CPUPercentageMetric
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit
import org.eclipse.app4mc.amalthea.model.ChainedProcessPrototype
import org.eclipse.app4mc.amalthea.model.ChannelAccess
import org.eclipse.app4mc.amalthea.model.ChannelReceive
import org.eclipse.app4mc.amalthea.model.ChannelSend
import org.eclipse.app4mc.amalthea.model.ClearEvent
import org.eclipse.app4mc.amalthea.model.CoherencyDirection
import org.eclipse.app4mc.amalthea.model.Component
import org.eclipse.app4mc.amalthea.model.ComponentInstance
import org.eclipse.app4mc.amalthea.model.ComponentScope
import org.eclipse.app4mc.amalthea.model.Composite
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
import org.eclipse.app4mc.amalthea.model.DataSize
import org.eclipse.app4mc.amalthea.model.DataSizeUnit
import org.eclipse.app4mc.amalthea.model.DataStability
import org.eclipse.app4mc.amalthea.model.DataTypeDefinition
import org.eclipse.app4mc.amalthea.model.Deviation
import org.eclipse.app4mc.amalthea.model.DoubleObject
import org.eclipse.app4mc.amalthea.model.EventChainContainer
import org.eclipse.app4mc.amalthea.model.EventChainReference
import org.eclipse.app4mc.amalthea.model.EventConfig
import org.eclipse.app4mc.amalthea.model.FInterfacePort
import org.eclipse.app4mc.amalthea.model.FloatObject
import org.eclipse.app4mc.amalthea.model.Frequency
import org.eclipse.app4mc.amalthea.model.FrequencyMetric
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit
import org.eclipse.app4mc.amalthea.model.FrequencyUnit
import org.eclipse.app4mc.amalthea.model.Group
import org.eclipse.app4mc.amalthea.model.GroupingType
import org.eclipse.app4mc.amalthea.model.HwAccessPath
import org.eclipse.app4mc.amalthea.model.HwAccessPathRef
import org.eclipse.app4mc.amalthea.model.HwElementRef
import org.eclipse.app4mc.amalthea.model.ISRAllocation
import org.eclipse.app4mc.amalthea.model.Instructions
import org.eclipse.app4mc.amalthea.model.InstructionsConstant
import org.eclipse.app4mc.amalthea.model.InstructionsDeviation
import org.eclipse.app4mc.amalthea.model.IntegerObject
import org.eclipse.app4mc.amalthea.model.InterProcessTrigger
import org.eclipse.app4mc.amalthea.model.InterfaceKind
import org.eclipse.app4mc.amalthea.model.LabelAccess
import org.eclipse.app4mc.amalthea.model.LabelAccessEnum
import org.eclipse.app4mc.amalthea.model.LatencyAccessPath
import org.eclipse.app4mc.amalthea.model.LatencyConstant
import org.eclipse.app4mc.amalthea.model.LatencyDeviation
import org.eclipse.app4mc.amalthea.model.LimitType
import org.eclipse.app4mc.amalthea.model.LongObject
import org.eclipse.app4mc.amalthea.model.MemoryClassification
import org.eclipse.app4mc.amalthea.model.MemoryMapping
import org.eclipse.app4mc.amalthea.model.MinAvgMaxStatistic
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess
import org.eclipse.app4mc.amalthea.model.ModeLiteral
import org.eclipse.app4mc.amalthea.model.ModeSwitch
import org.eclipse.app4mc.amalthea.model.ModeSwitchEntry
import org.eclipse.app4mc.amalthea.model.ModeValue
import org.eclipse.app4mc.amalthea.model.ModeValueConjunction
import org.eclipse.app4mc.amalthea.model.ModeValueDisjunction
import org.eclipse.app4mc.amalthea.model.ModeValueList
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
import org.eclipse.app4mc.amalthea.model.RWType
import org.eclipse.app4mc.amalthea.model.RunnableAllocation
import org.eclipse.app4mc.amalthea.model.RunnableAllocationConstraint
import org.eclipse.app4mc.amalthea.model.RunnableCall
import org.eclipse.app4mc.amalthea.model.RunnableInstructions
import org.eclipse.app4mc.amalthea.model.RunnableItem
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
import org.eclipse.app4mc.amalthea.model.System
import org.eclipse.app4mc.amalthea.model.TagGroup
import org.eclipse.app4mc.amalthea.model.TaskAllocation
import org.eclipse.app4mc.amalthea.model.TaskRunnableCall
import org.eclipse.app4mc.amalthea.model.Time
import org.eclipse.app4mc.amalthea.model.TimeMetric
import org.eclipse.app4mc.amalthea.model.TimeObject
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit
import org.eclipse.app4mc.amalthea.model.TimeUnit
import org.eclipse.app4mc.amalthea.model.TransmissionPolicy
import org.eclipse.app4mc.amalthea.model.TypeDefinition
import org.eclipse.app4mc.amalthea.model.TypeRef
import org.eclipse.app4mc.amalthea.model.WaitEvent
import org.eclipse.app4mc.amalthea.model.WaitingBehaviour
import org.eclipse.app4mc.amalthea.model.impl.CustomPropertyImpl
import org.eclipse.app4mc.amalthea.model.impl.RunnableInstructionsEntryImpl
import org.eclipse.emf.common.notify.AdapterFactory
import org.eclipse.emf.common.notify.Notification
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.edit.provider.IItemLabelProvider
import org.eclipse.emf.edit.provider.ViewerNotification
import org.eclipse.app4mc.amalthea.model.GetResultServerCall
import org.eclipse.app4mc.amalthea.model.BlockingType

class CustomItemProviderService {

	private def static getContainingFeatureName(EObject object, String defaultText, String separator) {
		val feature = object?.eContainingFeature()
		val name = if(feature === null) defaultText else feature.name + separator
		return name
	}

	private def static getContainingFeatureName(EObject object) {
		return getContainingFeatureName(object, "", ": ")
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


///// _________________________ Amalthea _________________________
 


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


///// _________________________ Common _________________________
 


	private def static getFrequencyText(Frequency frequency) {
		if (frequency === null) return "<frequency>"
		
		val value = Double.toString(frequency.value)
		val unit = if (frequency.unit == FrequencyUnit::_UNDEFINED_) "<unit>" else frequency.unit.literal
		return value + " " + unit
	}

	private def static getTimeText(AbstractTime time) {
		if (time === null) return "<time>"
		
		val value = if (time.value === null) "???" else time.value.toString
		val unit = if (time.unit == TimeUnit::_UNDEFINED_) "<unit>" else time.unit.literal
		return value + " " + unit
	}

	private def static getDataSizeText(DataSize size) {
		if (size === null) return "<data size>"
		
		val value = if (size.value === null) "???" else size.value.toString
		val unit = if (size.unit == DataSizeUnit::_UNDEFINED_) "<unit>" else size.unit.literal
		return value + " " + unit
	}

	private def static trimDistName(String name) {
		if (name === null) return ""
		
		return name.replace("Distribution", "").replace("Estimators", "").replace("Parameters", "")
	}


	private def static getInstructionsText(Instructions instr){
		switch instr {
			InstructionsConstant: getInstructionsConstantItemProviderText(instr, null)
			InstructionsDeviation: getInstructionsDeviationItemProviderText(instr, null)
		}
	}


	/*****************************************************************************
	 * 						CustomPropertyItemProvider
	 *****************************************************************************/
	def static String getCustomPropertyItemProviderText(Object object, String defaultText) {
		if (object instanceof CustomPropertyImpl) {
			val key = object?.getKey()
			val value = object?.getValue()
			val s1 = if(key.isNullOrEmpty) "<key>" else "\"" + key + "\""
			val s2 = if(value === null) "null" else value
			return s1 + " -> " + s2;
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getCustomPropertyItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(Map.Entry)) {
			case AmaltheaPackage::CUSTOM_PROPERTY__KEY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::CUSTOM_PROPERTY__VALUE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}

	/*****************************************************************************
	 * 						BooleanObjectItemProvider
	 *****************************************************************************/
	 def static String getBooleanObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof BooleanObject) {
			return getContainingFeatureName(object) + object
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						DoubleObjectItemProvider
	 *****************************************************************************/
	def static String getDoubleObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof DoubleObject) {
			return getContainingFeatureName(object) + object
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						FloatObjectItemProvider
	 *****************************************************************************/
	def static String getFloatObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof FloatObject) {
			return getContainingFeatureName(object) + object
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						IntegerObjectItemProvider
	 *****************************************************************************/
	def static String getIntegerObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof IntegerObject) {
			return getContainingFeatureName(object) + object
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						LongObjectItemProvider
	 *****************************************************************************/
	def static String getLongObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof LongObject) {
			return getContainingFeatureName(object) + object
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						TimeObjectItemProvider
	 *****************************************************************************/
	def static String getTimeObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof TimeObject) {
			return getContainingFeatureName(object) + getTimeText(object)
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						StringObjectItemProvider
	 *****************************************************************************/
	def static String getStringObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof StringObject) {
			val s1 = getContainingFeatureName(object)
			val s2 = if(object?.value === null) "null" else "\"" + object.value + "\"";
			return s1 + s2
		} else {
			return defaultText
		}
	}

	/*****************************************************************************
	 * 						BigIntegerObjectItemProvider
	 *****************************************************************************/
	def static String getBigIntegerObjectItemProviderText(Object object, String defaultText) {
		if (object instanceof BigIntegerObject) {
			val s1 = getContainingFeatureName(object)
			val s2 = if(object?.value === null) "null" else "\"" + object.value + "\"";
			return s1 + s2
		} else {
			return defaultText
		}
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
	

	/*****************************************************************************
	 * 						DeviationItemProvider
	 *****************************************************************************/
	def static String getDeviationItemProviderText(Object object, String defaultText) {
		if (object instanceof Deviation<?>) {
			val distName = object?.distribution?.eClass?.name
			val lower = object?.lowerBound
			val upper = object?.upperBound
			val s1 = if(distName.isNullOrEmpty) "Dist: ???" else "Dist: " + trimDistName(distName)
			val s2 = if(lower === null) "" else " lowerBound: " + lower
			val s3 = if(upper === null) "" else " upperBound: " + upper
			
	 		return s1 + s2 + s3
		}
	}

	def static List<ViewerNotification> getDeviationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(Deviation)) {
			case AmaltheaPackage::DEVIATION__LOWER_BOUND,
			case AmaltheaPackage::DEVIATION__UPPER_BOUND,
			case AmaltheaPackage::DEVIATION__DISTRIBUTION:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
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

	def static List<ViewerNotification> getInstructionsDeviationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(InstructionsDeviation)) {
			case AmaltheaPackage::INSTRUCTIONS_DEVIATION__DEVIATION:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
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

	def static List<ViewerNotification> getTransmissionPolicyItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(TransmissionPolicy)) {
			case AmaltheaPackage::TRANSMISSION_POLICY__CHUNK_PROCESSING_INSTRUCTIONS,
			case AmaltheaPackage::TRANSMISSION_POLICY__TRANSMIT_RATIO:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::TRANSMISSION_POLICY__CHUNK_SIZE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}



///// _________________________ Components _________________________



	/*****************************************************************************
	 * 						ComponentItemProvider
	 *****************************************************************************/
	def static String getComponentItemProviderText(Object object, String defaultText) {
		if (object instanceof Component) {
			val name = object?.name
			val s1 = ppName(name, "<component>")
			return s1
		} else {
			return defaultText
		}
	}

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

	def static List<ViewerNotification> getComponentInstanceItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ComponentInstance)) {
			case AmaltheaPackage::COMPONENT_INSTANCE__NAME,
			case AmaltheaPackage::COMPONENT_INSTANCE__TYPE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::COMPONENT_INSTANCE__CUSTOM_PROPERTIES:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}

	/*****************************************************************************
	 * 						CompositeItemProvider
	 *****************************************************************************/
	def static String getCompositeItemProviderText(Object object, String defaultText) {
		if (object instanceof Composite) {
			val name = object?.name
			val s1 = ppName(name, "<composite>")
			return s1
		} else {
			return defaultText
		}
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
	 * 						FInterfacePortItemProvider
	 *****************************************************************************/
	def static String getFInterfacePortItemProviderText(Object object, String defaultText) {
		if (object instanceof FInterfacePort) {
			val cName = (object?.eContainer as Component).name
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

	def static List<ViewerNotification> getQualifiedPortItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(QualifiedPort)) {
			case AmaltheaPackage::QUALIFIED_PORT__INSTANCE,
			case AmaltheaPackage::QUALIFIED_PORT__PORT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						SystemItemProvider
	 *****************************************************************************/
	def static String getSystemItemProviderText(Object object, String defaultText) {
		if (object instanceof System) {
			val name = object?.name
			val s1 = ppName(name, "<system>")
			return s1
		} else {
			return defaultText
		}
	}



///// _________________________ Config _________________________



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

	def static List<ViewerNotification> getEventConfigItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(EventConfig)) {			
			case AmaltheaPackage::EVENT_CONFIG__NAME:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::EVENT_CONFIG__EVENT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}



///// _________________________ Constraints _________________________



	private def static getLimitTypeText(LimitType limitType) {
		switch limitType {
			case LimitType::UPPER_LIMIT : " <= "
			case LimitType::LOWER_LIMIT : " >= "
			default : " ? "
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
			case AmaltheaPackage::COMPONENT_SCOPE__COMPONENT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))

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
			case AmaltheaPackage::PROCESS_SCOPE__PROCESS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
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
			case AmaltheaPackage::RUNNABLE_SCOPE__RUNNABLE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
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

	def static List<ViewerNotification> getArchitectureRequirementItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ArchitectureRequirement)) {
			case AmaltheaPackage::ARCHITECTURE_REQUIREMENT__NAME,
			case AmaltheaPackage::ARCHITECTURE_REQUIREMENT__COMPONENT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}
	

	/*****************************************************************************
	 * 						CountRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getCountRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof CountRequirementLimit) {
			val metric = object?.metric
			val limitType = object?.limitType
			val limitValue = if (object === null) 0 else object.limitValue
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
			val limitValue = if (object === null) 0 else object.limitValue
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

	def static List<ViewerNotification> getFrequencyRequirementLimitItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(FrequencyRequirementLimit)) {
			case AmaltheaPackage::FREQUENCY_REQUIREMENT_LIMIT__METRIC:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::FREQUENCY_REQUIREMENT_LIMIT__LIMIT_VALUE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}

	/*****************************************************************************
	 * 						PercentageRequirementLimitItemProvider
	 *****************************************************************************/
	def static String getPercentageRequirementLimitItemProviderText(Object object, String defaultText) {
		if (object instanceof PercentageRequirementLimit) {
			val metric = object?.metric
			val limitType = object?.limitType
			val limitValue = if (object === null) 0 else object.limitValue
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

	def static List<ViewerNotification> getTimeRequirementLimitItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TimeRequirementLimit)) {
			case AmaltheaPackage::TIME_REQUIREMENT_LIMIT__METRIC:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::TIME_REQUIREMENT_LIMIT__LIMIT_VALUE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
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
	
	def static List<ViewerNotification> getProcessRequirementItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ProcessRequirement)) {
			case AmaltheaPackage::PROCESS_REQUIREMENT__NAME,
			case AmaltheaPackage::PROCESS_REQUIREMENT__PROCESS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getRunnableRequirementItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(RunnableRequirement)) {
			case AmaltheaPackage::RUNNABLE_REQUIREMENT__NAME,
			case AmaltheaPackage::RUNNABLE_REQUIREMENT__RUNNABLE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getProcessChainRequirementItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ProcessChainRequirement)) {
			case AmaltheaPackage::PROCESS_CHAIN_REQUIREMENT__NAME,
			case AmaltheaPackage::PROCESS_CHAIN_REQUIREMENT__PROCESS_CHAIN:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getDataAgeTimeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(DataAgeTime)) {
			case AmaltheaPackage::DATA_AGE_TIME__MINIMUM_TIME,
			case AmaltheaPackage::DATA_AGE_TIME__MAXIMUM_TIME:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
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
			val s2 = if(direction === null || direction == CoherencyDirection::_UNDEFINED_) "<direction>" else direction.literal
			val s3 = switch scope {
				RunnableScope: if (scope.runnable?.name.isNullOrEmpty) "<runnable>" else "Runnable " + scope.runnable.name
				ProcessScope: if (scope.process?.name.isNullOrEmpty) "<process>" else scope.process.eClass.name + " " + scope.process.name
				ComponentScope: if (scope.component?.name.isNullOrEmpty) "<component>" else "Component " + scope.component.name
				default: "?"
			}
			return "CoherencyGroup " + s1 + " " + s2 + " (Scope: " + s3 + ")"
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getDataCoherencyGroupItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(DataCoherencyGroup)) {
			case AmaltheaPackage::DATA_COHERENCY_GROUP__NAME,
			case AmaltheaPackage::DATA_COHERENCY_GROUP__DIRECTION:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::DATA_COHERENCY_GROUP__SCOPE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
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

	def static List<ViewerNotification> getEventChainReferenceItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(EventChainReference)) {
			case AmaltheaPackage::EVENT_CHAIN_REFERENCE__EVENT_CHAIN:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))

		}
		return list
	}

	/*****************************************************************************
	 * 						EventChainContainerItemProvider
	 *****************************************************************************/
	def static String getEventChainContainerItemProviderText(Object object, String defaultText) {
		if (object instanceof EventChainContainer) {
			val chain = object?.eventChain
			val s1 = getContainingFeatureName(object)
			val s2 = if(chain === null) "<sub chain>" else if (chain.name.isNullOrEmpty) "Sub Chain" else "(Sub Chain) " + chain.name
			return s1 + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getEventChainContainerItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SubEventChain)) {
			case AmaltheaPackage::EVENT_CHAIN_CONTAINER__EVENT_CHAIN:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
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

	def static List<ViewerNotification> getTagGroupItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TagGroup)) {
			case AmaltheaPackage::TAG_GROUP__TAG:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}



///// _________________________ Events _________________________


	/*****************************************************************************
	 * 						PhysicalSectionConstraintItemProvider
	 *****************************************************************************/
	def static String getPhysicalSectionConstraintItemProviderText(Object object, String defaultText) {
		if (object instanceof PhysicalSectionConstraint) {
			val section = object?.section
			val memories = object?.memories

			val sectionString = if(section?.name.isNullOrEmpty) "<section>" else "Section :  " + section.name
			
			val List<String> memoryNames=new ArrayList<String>()
			
			if(!memories.isNullOrEmpty){
				memories.forEach[it|
					val st= if(it?.name.isNullOrEmpty) "???" else it.name
					memoryNames.add(st)
				]
			}
			
			val memoriesString = if(memoryNames.isNullOrEmpty) {"<memories>"}  else { 
				if(memoryNames.size>10) {
				" Memories : "+memoryNames.subList(0,10).join(', ')+", ..."
				} else {
				" Memories : "+memoryNames.join(', ')
				}
			}
			
			val s0= if(object?.name.isNullOrEmpty) "<name>" else  object.name
			
			return s0 + " : (" + sectionString + ")" + " --> (" + memoriesString + ")";
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getPhysicalSectionConstraintItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(PhysicalSectionConstraint)) {
			case AmaltheaPackage::PHYSICAL_SECTION_CONSTRAINT__NAME:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, false))
			case AmaltheaPackage::PHYSICAL_SECTION_CONSTRAINT__SECTION:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
			case AmaltheaPackage::PHYSICAL_SECTION_CONSTRAINT__MEMORIES:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}





///// _________________________ HW _________________________


	/*****************************************************************************
	 * 						HwAccessPathItemProvider
	 *****************************************************************************/
	def static String getHwAccessPathItemProviderText(Object object, String defaultText) {
		if (object instanceof HwAccessPath) {
			val name = object?.name
			val sourceName = object?.source?.name
			val targetName = object?.target?.name
			val s1 = ppName(name, "<path>")
			val s2 = ppName(sourceName, "<source>")
			val s3 = ppName(targetName, "<target>")
			return "AccessPath (Hardware) " + s1 + " : " + s2 + " --> " + s3
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getHwAccessPathItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(HwAccessPath)) {
			case AmaltheaPackage::HW_ACCESS_PATH__NAME,
			case AmaltheaPackage::HW_ACCESS_PATH__SOURCE,
			case AmaltheaPackage::HW_ACCESS_PATH__TARGET:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::HW_ACCESS_PATH__HW_ELEMENTS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}


	/*****************************************************************************
	 * 						AccessPathRefItemProvider
	 *****************************************************************************/
	def static String getAccessPathRefItemProviderText(Object object, String defaultText) {
		if (object instanceof AccessPathRef) {
			val refName = object?.ref?.name
			val s1 = if(refName.isNullOrEmpty) "<path ref>" else "Path " + refName
			return "Ref -> " + s1
		} else {
			return defaultText
		}

// TODO: use label text of referred element

//			final AccessPathRef element = (AccessPathRef) object;
//			if (null != element.getRef()) {
//				return getString("_UI_AccessPathRef_type") + " -> "
//						+ new ProviderUtil().getTextForElementByLabelProvider(element.getRef(), getAdapterFactory());
//			}
	}


	/*****************************************************************************
	 * 						HwAccessPathRefItemProvider
	 *****************************************************************************/
	def static String getHwAccessPathRefItemProviderText(Object object, String defaultText) {
		if (object instanceof HwAccessPathRef) {
			val refName = object?.ref?.name
			val s1 = if(refName.isNullOrEmpty) "<path ref>" else "Path " + refName
			return "Ref -> " + s1
		} else {
			return defaultText
		}

// TODO: use label text of referred element

//			final HwAccessPathRef element = (HwAccessPathRef) object;
//			if (null != element.getRef()) {
//				return getString("_UI_HwAccessPathRef_type") + " -> "
//						+ new ProviderUtil().getTextForElementByLabelProvider(element.getRef(), getAdapterFactory());
//			}
	}

	def static List<ViewerNotification> getHwAccessPathRefItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(HwAccessPathRef)) {
			case AmaltheaPackage::HW_ACCESS_PATH_REF__REF:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						HwElementRefItemProvider
	 *****************************************************************************/
	def static String getHwElementRefItemProviderText(Object object, String defaultText) {
		if (object instanceof HwElementRef) {
			val portName = object?.port?.name
			val s1 = if(portName.isNullOrEmpty) "<port>" else "Port " + portName
			return  "Ref -> " + s1
		} else {
			return defaultText
		}

// TODO: Name Provider and Update
	}

	def static List<ViewerNotification> getHwElementRefItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(HwElementRef)) {
			case AmaltheaPackage::HW_ELEMENT_REF__PORT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						LatencyAccessPathItemProvider
	 *****************************************************************************/
	def static String getLatencyAccessPathItemProviderText(Object object, String defaultText) {
		if (object instanceof LatencyAccessPath) {
			val name = object?.name
			val sourceName = object?.source?.name
			val targetName = object?.target?.name
			val s1 = ppName(name, "<path>")
			val s2 = ppName(sourceName, "<source>")
			val s3 = ppName(targetName, "<target>")
			return "AccessPath (Latency) " + s1 + " : " + s2 + " --> " + s3
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getLatencyAccessPathItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(LatencyAccessPath)) {
			case AmaltheaPackage::LATENCY_ACCESS_PATH__NAME,
			case AmaltheaPackage::LATENCY_ACCESS_PATH__SOURCE,
			case AmaltheaPackage::LATENCY_ACCESS_PATH__TARGET:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::LATENCY_ACCESS_PATH__LATENCIES:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}


	/*****************************************************************************
	 * 						LatencyConstantItemProvider
	 *****************************************************************************/
	def static String getLatencyConstantItemProviderText(Object object, String defaultText) {
		if (object instanceof LatencyConstant) {
			val type = object?.accessType
			val value = if(object === null) 0 else object.value
			val s1 = if(type === null || type == RWType::_UNDEFINED_) "?" else type.literal
			val s2 = Long.toString(value)
			return "Access: " + s1 + " -- Latency (constant): " + s2
		} else {
			return defaultText
		}
	}


	/*****************************************************************************
	 * 						LatencyDeviationItemProvider
	 *****************************************************************************/
	def static String getLatencyDeviationItemProviderText(Object object, String defaultText) {
		if (object instanceof LatencyDeviation) {
			val type = object.accessType
			val distName = object?.deviation?.distribution?.eClass?.name
			val s1 = if(type === null || type == RWType::_UNDEFINED_) "?" else type.literal
			val s2 = if(distName.isNullOrEmpty) "<distribution>" else trimDistName(distName)
			return "Access: " + s1 + " -- Latency (deviation): " + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getLatencyDeviationItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(LatencyDeviation)) {
			case AmaltheaPackage::LATENCY_DEVIATION__ACCESS_TYPE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::LATENCY_DEVIATION__DEVIATION:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}




///// _________________________ Mapping _________________________



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
			val s2 = cores.map[e | ppName(e?.name)].join(", ")
			return "Allocation: " + s1 + " -- Cores ( " + s2 + " )";
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getSchedulerAllocationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SchedulerAllocation)) {
			case AmaltheaPackage::SCHEDULER_ALLOCATION__SCHEDULER,
			case AmaltheaPackage::SCHEDULER_ALLOCATION__RESPONSIBILITY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::SCHEDULER_ALLOCATION__CUSTOM_PROPERTIES:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
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

	def static List<ViewerNotification> getISRAllocationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ISRAllocation)) {
			case AmaltheaPackage::ISR_ALLOCATION__CONTROLLER,
			case AmaltheaPackage::ISR_ALLOCATION__ISR:
				// update the label but not the content tree
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getRunnableAllocationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(RunnableAllocation)) {
			case AmaltheaPackage::RUNNABLE_ALLOCATION__ENTITY,
			case AmaltheaPackage::RUNNABLE_ALLOCATION__SCHEDULER:
				// update the label but not the content tree
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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
	
	def static List<ViewerNotification> getTaskAllocationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TaskAllocation)) {
			case AmaltheaPackage::TASK_ALLOCATION__TASK,
			case AmaltheaPackage::TASK_ALLOCATION__SCHEDULER:
				// update the label
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage.TASK_ALLOCATION__SCHEDULING_PARAMETERS,
			case AmaltheaPackage.TASK_ALLOCATION__PARAMETER_EXTENSIONS:
				// update the content tree
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
			
		}
		return list
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

	def static List<ViewerNotification> getMemoryMappingItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(MemoryMapping)) {
			case AmaltheaPackage::MEMORY_MAPPING__MEMORY,
			case AmaltheaPackage::MEMORY_MAPPING__ABSTRACT_ELEMENT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}

 
 

	/*****************************************************************************
	 * 						PhysicalSectionMappingItemProvider
	 *****************************************************************************/
	def static String getPhysicalSectionMappingItemProviderText(Object object, String defaultText) {
		if (object instanceof PhysicalSectionMapping) {
			val memory = object?.memory
			val sections = object?.origin

			val memoryString = if(memory?.name.isNullOrEmpty) "<memory>" else "Memory :  " + memory.name
			
			val List<String> sectionNames=new ArrayList<String>()
			
			if(!sections.isNullOrEmpty){
				sections.forEach[it|
					val st= if(it?.name.isNullOrEmpty) "???" else it.name
					sectionNames.add(st)
				]
			}
			
			val sectionsString = if(sectionNames.isNullOrEmpty) {"<sections>"}
			 else {
			 	if(sectionNames.size>10) {
			 	" Sections : "+sectionNames.subList(0,10).join(', ')+", ..."
			 	} else {
			 	" Sections : "+sectionNames.join(', ')
			 	}
			 }
			
			val s0= ppName(object?.name, "<name>")
			
			return s0 + " : (" + sectionsString + ")" + " --> (" + memoryString + ")";
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getPhysicalSectionMappingItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(PhysicalSectionMapping)) {
			case AmaltheaPackage::PHYSICAL_SECTION_MAPPING__MEMORY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::PHYSICAL_SECTION_MAPPING__ORIGIN:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
			case AmaltheaPackage::PHYSICAL_SECTION_MAPPING__NAME:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}



///// _________________________ OS _________________________



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



///// _________________________ PropertyConstraints _________________________



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

	def static List<ViewerNotification> getProcessPrototypeAllocationConstraintItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ProcessPrototypeAllocationConstraint)) {
			case AmaltheaPackage::PROCESS_PROTOTYPE_ALLOCATION_CONSTRAINT__PROCESS_PROTOTYPE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getProcessAllocationConstraintItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ProcessAllocationConstraint)) {
			case AmaltheaPackage::PROCESS_ALLOCATION_CONSTRAINT__PROCESS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getRunnableAllocationConstraintItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(RunnableAllocationConstraint)) {
			case AmaltheaPackage::RUNNABLE_ALLOCATION_CONSTRAINT__RUNNABLE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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
			val s3 = if (cla.isNullOrEmpty) "<classifiers>" else cla.map[e| ppName(e?.name)].join(", ")
			return s1 + " (" + s2 + "): " + s3;
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getCoreClassificationItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(CoreClassification)) {
			case AmaltheaPackage::CORE_CLASSIFICATION__CONDITION,
			case AmaltheaPackage::CORE_CLASSIFICATION__GROUPING,
			case AmaltheaPackage::CORE_CLASSIFICATION__CLASSIFIERS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getAbstractElementMappingConstraintItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(AbstractElementMappingConstraint)) {
			case AmaltheaPackage::ABSTRACT_ELEMENT_MAPPING_CONSTRAINT__ABSTRACT_ELEMENT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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
			val s3 = if (cla.isNullOrEmpty) "<classifiers>" else cla.map[e| ppName(e?.name)].join(", ")
			return s1 + " (" + s2 + "): " + s3;
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getMemoryClassificationItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(MemoryClassification)) {
			case AmaltheaPackage::MEMORY_CLASSIFICATION__CONDITION,
			case AmaltheaPackage::MEMORY_CLASSIFICATION__GROUPING,
			case AmaltheaPackage::MEMORY_CLASSIFICATION__CLASSIFIERS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


///// _________________________ Stimuli _________________________



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
			return getContainingFeatureName(object) + "OR List"
		} else {
			return defaultText
		}
	}


	/*****************************************************************************
	 * 						ModeValueConjunctionItemProvider
	 *****************************************************************************/
	def static String getModeValueConjunctionItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeValueConjunction) {
			return "AND List"
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
			val s1 = if(prov?.name.isNullOrEmpty) "<mode label>" else "Mode Label " + prov.name
			val s2 = if(value === null) "<value>" else value.toString
			return s1 + " == " + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getModeValueItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ModeValue)) {
			case AmaltheaPackage::MODE_VALUE__VALUE,
			case AmaltheaPackage::MODE_VALUE__VALUE_PROVIDER:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						ArrivalCurveEntryItemProvider
	 *****************************************************************************/
	def static String getArrivalCurveEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ArrivalCurveEntry) {
			val numEvents = if (object === null) 0 else object.numberOfEvents
			val s1 = getTimeText(object?.lowerTimeBorder)
			val s2 = getTimeText(object?.upperTimeBorder)
			return "#events: " + numEvents + " -- interval: " + s1 + ", " + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getArrivalCurveEntryItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ArrivalCurveEntry)) {
			case AmaltheaPackage::ARRIVAL_CURVE_ENTRY__NUMBER_OF_EVENTS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::ARRIVAL_CURVE_ENTRY__LOWER_TIME_BORDER,
			case AmaltheaPackage::ARRIVAL_CURVE_ENTRY__UPPER_TIME_BORDER:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
	}



///// _________________________ SW _________________________


	
	private def static getRunnableItemText(RunnableItem item) {
		switch item {
			LabelAccess: getLabelAccessItemProviderText(item, null)
			RunnableCall: getRunnableCallItemProviderText(item, null)
			RunnableInstructions: "Runnable Instructions"
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

	def static List<ViewerNotification> getAccessPrecedenceSpecItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(AccessPrecedenceSpec)) {
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__ORDER_TYPE,
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__ORIGIN,
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__TARGET,
			case AmaltheaPackage::ACCESS_PRECEDENCE_SPEC__LABEL:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getOrderPrecedenceSpecItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(OrderPrecedenceSpec)) {
			case AmaltheaPackage::ORDER_PRECEDENCE_SPEC__ORDER_TYPE,
			case AmaltheaPackage::ORDER_PRECEDENCE_SPEC__ORIGIN,
			case AmaltheaPackage::ORDER_PRECEDENCE_SPEC__TARGET:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getAsynchronousServerCallItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(AsynchronousServerCall)) {
			case AmaltheaPackage::ASYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE,
			case AmaltheaPackage::ASYNCHRONOUS_SERVER_CALL__RESULT_RUNNABLE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))

		}
		return list
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

	def static List<ViewerNotification> getSynchronousServerCallItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SynchronousServerCall)) {
			case AmaltheaPackage::SYNCHRONOUS_SERVER_CALL__SERVER_RUNNABLE,
			case AmaltheaPackage::SYNCHRONOUS_SERVER_CALL__WAITING_BEHAVIOUR:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))

		}
		return list
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

	def static List<ViewerNotification> getGetResultServerCallItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(GetResultServerCall)) {
			case AmaltheaPackage::GET_RESULT_SERVER_CALL__SERVER_RUNNABLE,
			case AmaltheaPackage::GET_RESULT_SERVER_CALL__BLOCKING_TYPE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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
			return "Chained Prototype " + s1 + "(apply: " + apply + " offset: " + offset + ")"
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getChainedProcessPrototypeItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ChainedProcessPrototype)) {
			case AmaltheaPackage::CHAINED_PROCESS_PROTOTYPE__PROTOTYPE,
			case AmaltheaPackage::CHAINED_PROCESS_PROTOTYPE__APPLY,
			case AmaltheaPackage::CHAINED_PROCESS_PROTOTYPE__OFFSET:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						GroupItemProvider
	 *****************************************************************************/
	def static String getGroupItemProviderText(Object object, String defaultText) {
		if (object instanceof Group) {
			val name = if (object.name.isNullOrEmpty) null else object.name
			val ordered = if(object === null) false else object.isOrdered
			val result = if(ordered) "(Sequence)" else "(Set)"
			return if (name === null) result else result + " " + name
		}
	}
	
	def static String getGroupItemProviderImageName(Object object) {
		if (object instanceof Group) {
			val ordered = if(object === null) false else object.isOrdered
			return "Group_" + if(ordered) "ordered" else "unordered"
		}
	}


	/*****************************************************************************
	 * 						InterProcessActivationItemProvider
	 *****************************************************************************/
	def static String getInterProcessActivationItemProviderText(Object object, String defaultText) {
		if (object instanceof InterProcessTrigger) {
			val stimulusName = object?.getStimulus?.name
			val s1 = ppName(stimulusName, "<stimulus>")
			return "trigger " + s1
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getInterProcessActivationItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(InterProcessTrigger)) {
			case AmaltheaPackage::INTER_PROCESS_TRIGGER__STIMULUS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getModeLabelItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ModeLabel)) {
			case AmaltheaPackage::MODE_LABEL__NAME,
			case AmaltheaPackage::MODE_LABEL__MODE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						ModeSwitchItemProvider
	 *****************************************************************************/
	def static String getModeSwitchItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeSwitch) {
			val valueName = object.valueProvider?.name
			val modeName = object.valueProvider?.mode?.name
			val s1 = ppName(valueName, "<mode label>")
			val s2 = ppName(modeName, "<mode>")
			return "Switch " + s1 + " (" + s2 + ")";
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getModeSwitchItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ModeSwitch)) {
			case AmaltheaPackage::MODE_SWITCH__VALUE_PROVIDER:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))	
			case AmaltheaPackage.MODE_SWITCH__ENTRIES,
			case AmaltheaPackage.MODE_SWITCH__DEFAULT_ENTRY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}


	/*****************************************************************************
	 * 						RunnableModeSwitchItemProvider
	 *****************************************************************************/
	def static String getRunnableModeSwitchItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableModeSwitch) {
			val valueName = object.valueProvider?.name
			val modeName = object.valueProvider?.mode?.name
			val s1 = ppName(valueName, "<mode label>")
			val s2 = ppName(modeName, "<mode>")
			return "Switch " + s1 + " (" + s2 + ")";
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getRunnableModeSwitchItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(RunnableModeSwitch)) {
			case AmaltheaPackage::RUNNABLE_MODE_SWITCH__VALUE_PROVIDER:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__ENTRIES,
			case AmaltheaPackage.RUNNABLE_MODE_SWITCH__DEFAULT_ENTRY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}


	/*****************************************************************************
	 * 						ModeSwitchEntryItemProvider
	 *****************************************************************************/
	def static String getModeSwitchEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof ModeSwitchEntry<?>) {
			val valueName = object?.values?.join("", ", ", "", [name])
			val s1 = "case: "
			val s2 = if(valueName.isNullOrEmpty) "<mode literals>" else valueName
			return s1 + s2
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getModeSwitchEntryItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ModeSwitchEntry)) {
			case AmaltheaPackage::MODE_SWITCH_ENTRY__ITEMS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
			case AmaltheaPackage::MODE_SWITCH_ENTRY__VALUES:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getTaskRunnableCallItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TaskRunnableCall)) {
			case AmaltheaPackage::TASK_RUNNABLE_CALL__RUNNABLE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::TASK_RUNNABLE_CALL__STATISTIC:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
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

	def static List<ViewerNotification> getLabelAccessItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(LabelAccess)) {
			case AmaltheaPackage::LABEL_ACCESS__ACCESS,
			case AmaltheaPackage::LABEL_ACCESS__DATA:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::LABEL_ACCESS__STATISTIC:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
	}


	/*****************************************************************************
	 * 						ChannelAccessItemProvider
	 *****************************************************************************/
	def static List<ViewerNotification> getChannelAccessItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(ChannelAccess)) {
			case AmaltheaPackage::CHANNEL_ACCESS__DATA:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::CHANNEL_ACCESS__TRANSMISSION_POLICY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
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

	def static List<ViewerNotification> getSemaphoreAccessItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SemaphoreAccess)) {
			case AmaltheaPackage::SEMAPHORE_ACCESS__ACCESS,
			case AmaltheaPackage::SEMAPHORE_ACCESS__SEMAPHORE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getModeLabelAccessItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(ModeLabelAccess)) {
			case AmaltheaPackage::MODE_LABEL_ACCESS__ACCESS,
			case AmaltheaPackage::MODE_LABEL_ACCESS__DATA:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
	}


	/*****************************************************************************
	 * 						RunnableInstructionsEntryItemProvider
	 *****************************************************************************/
	def static String getRunnableInstructionsEntryItemProviderText(Object object, String defaultText) {
		if (object instanceof RunnableInstructionsEntryImpl) {
			val typeName = object?.getKey()?.name
			val instr = object?.getValue()

			val s1 = if(typeName.isNullOrEmpty) "<core type>" else "Core Type " + typeName
			val s2 = if(instr === null) "<instructions>" else getInstructionsText(instr)
			return s1 + " -- " + s2;
		} else {
			return defaultText
		}
	}

	def static List<ViewerNotification> getRunnableInstructionsEntryItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(Map.Entry)) {
			case AmaltheaPackage::RUNNABLE_INSTRUCTIONS_ENTRY__KEY:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::RUNNABLE_INSTRUCTIONS_ENTRY__VALUE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, true))
		}
		return list
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

	def static List<ViewerNotification> getRunnableCallItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(RunnableCall)) {
			case AmaltheaPackage::RUNNABLE_CALL__RUNNABLE:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
			case AmaltheaPackage::RUNNABLE_CALL__STATISTIC:
				list.add(new ViewerNotification(notification, notification.getNotifier(), true, false))
		}
		return list
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

	def static List<ViewerNotification> getCustomEventTriggerItemProviderNotifications(Notification notification) {
		val list = newArrayList

		switch notification.getFeatureID(typeof(CustomEventTrigger)) {
			case AmaltheaPackage::CUSTOM_EVENT_TRIGGER__EVENT:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getSenderReceiverReadItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SenderReceiverRead)) {
			case AmaltheaPackage::SENDER_RECEIVER_READ__LABEL:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getSenderReceiverWriteItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SenderReceiverWrite)) {
			case AmaltheaPackage::SENDER_RECEIVER_WRITE__LABEL:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getSetEventItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(SetEvent)) {
			case AmaltheaPackage::SET_EVENT__PROCESS:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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

	def static List<ViewerNotification> getTypeRefItemProviderNotifications(Notification notification) {
		val list = newArrayList
		switch notification.getFeatureID(typeof(TypeRef)) {
			case AmaltheaPackage::TYPE_REF__TYPE_DEF:
				list.add(new ViewerNotification(notification, notification.getNotifier(), false, true))
		}
		return list
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


}
