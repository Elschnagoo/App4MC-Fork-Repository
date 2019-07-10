/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

import java.util.Collection
import java.util.Collections
import org.eclipse.app4mc.amalthea.model.AmaltheaServices
import org.eclipse.app4mc.amalthea.model.CallArgument
import org.eclipse.app4mc.amalthea.model.DataDependency
import org.eclipse.app4mc.amalthea.model.DirectionType
import org.eclipse.app4mc.amalthea.model.EnumMode
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.ModeLabel
import org.eclipse.app4mc.amalthea.model.ModeLabelAccess
import org.eclipse.app4mc.amalthea.model.ModeValue
import org.eclipse.app4mc.amalthea.model.NumericMode
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableParameter
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.ecore.EObject
import org.eclipse.sphinx.emf.util.EObjectUtil
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil
import org.eclipse.app4mc.amalthea.model.RunnableCall

class CustomPropertyDescriptorService {

	/*****************************************************************************
	 * 						NeedEntry Property Descriptors
	 *****************************************************************************/

	def static Collection<?> getNeedEntryValuesForKey(Object object) {
		val choiceOfValues = new UniqueEList<Object>();

		// empty entry
		choiceOfValues.add(null)

		// entries: names of feature categories
		choiceOfValues.addAll(
			EObjectUtil.getAllInstancesOf(object as EObject, HwFeatureCategory, true)
			.map[name]
			.filterNull
			.sort);

		return choiceOfValues
	}

	/*****************************************************************************
	 * 						CallArgument Property Descriptors
	 *****************************************************************************/

	def static Collection<?> getCallArgumentValuesForParameter(Object object) {
		if (object instanceof CallArgument) {
			val choiceOfValues = new BasicEList<RunnableParameter>();
			
			// empty entry
			choiceOfValues.add(null)
			
			// parameters of called runnable
			choiceOfValues.addAll(object.containingCall?.runnable?.parameters)
			
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}


	/*****************************************************************************
	 * 						DataDependency Property Descriptors
	 *****************************************************************************/

	def static Collection<?> getDataDependencyValuesForParameters(Object object) {
		if (object instanceof DataDependency) {
			val choiceOfValues = new BasicEList<RunnableParameter>();
			
			// Parameters (in, inout) of containing runnable
			val runnable = AmaltheaServices.getContainerOfType(object, Runnable)
			if (runnable !== null) {
				choiceOfValues.addAll(
					runnable.parameters
					.filter[e | e.direction == DirectionType::IN || e.direction == DirectionType::INOUT]
				)
			}
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}

	def static Collection<?> getDataDependencyValuesForCallArguments(Object object) {
		if (object instanceof DataDependency) {
			val choiceOfValues = new BasicEList<CallArgument>();
			
			// CallArguments (out, inout) of contained calls
			val runnable = AmaltheaServices.getContainerOfType(object, Runnable)
			if (runnable !== null) {
				choiceOfValues.addAll(
					SoftwareUtil.collectCallGraphItems(runnable.callGraph, null, [e | e instanceof RunnableCall])
					.map[e | (e as RunnableCall).arguments]
					.flatten
					.filter[e | e.parameter?.direction == DirectionType::OUT || e.parameter?.direction == DirectionType::INOUT]
				)
			}
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}

	/*****************************************************************************
	 * 						ModeValue Property Descriptors
	 *****************************************************************************/

	def static Collection<?> getValuesForModeValue(Object object) {
		if (object instanceof ModeValue) {
			val choiceOfValues = new BasicEList<String>();
			
			// Identify mode and possible values
			val mode = object.label?.mode
			if (mode instanceof NumericMode) return null // standard editor
			
			if (mode instanceof EnumMode) {
				choiceOfValues.addAll(mode.literals.map[e | e.name])
			}
			
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}

	/*****************************************************************************
	 * 						ModeLabel Property Descriptors
	 *****************************************************************************/

	def static Collection<?> getInitialValuesForModeLabel(Object object) {
		if (object instanceof ModeLabel) {
			val choiceOfValues = new BasicEList<String>();
			
			// Identify mode and possible values
			val mode = object.mode
			if (mode instanceof NumericMode) return null // standard editor
			
			if (mode instanceof EnumMode) {
				choiceOfValues.addAll(mode.literals.map[e | e.name])
			}
			
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}

	/*****************************************************************************
	 * 						ModeLabelAccess Property Descriptors
	 *****************************************************************************/

	def static Collection<?> getValuesForModeLabelAccess(Object object) {
		if (object instanceof ModeLabelAccess) {
			val choiceOfValues = new BasicEList<String>();
			
			// Identify mode and possible values
			val mode = object.data?.mode
			if (mode instanceof NumericMode) return null // standard editor
			
			if (mode instanceof EnumMode) {
				choiceOfValues.addAll(mode.literals.map[e | e.name])
			}
			
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}

}