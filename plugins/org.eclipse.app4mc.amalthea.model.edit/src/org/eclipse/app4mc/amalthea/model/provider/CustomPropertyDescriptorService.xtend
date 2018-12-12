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
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory
import org.eclipse.app4mc.amalthea.model.Runnable
import org.eclipse.app4mc.amalthea.model.RunnableCall
import org.eclipse.app4mc.amalthea.model.RunnableParameter
import org.eclipse.app4mc.amalthea.model.util.SoftwareUtil
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.emf.common.util.UniqueEList
import org.eclipse.emf.ecore.EObject
import org.eclipse.sphinx.emf.util.EObjectUtil

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
			EObjectUtil.getAllInstancesOf(object as EObject, typeof(HwFeatureCategory), true)
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
			val runnable = AmaltheaServices.getContainerOfType(object, typeof(Runnable))
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
			val runnable = AmaltheaServices.getContainerOfType(object, typeof(Runnable))
			if (runnable !== null) {
				choiceOfValues.addAll(
					SoftwareUtil.collectRunnableItems(runnable, null, [e | e instanceof RunnableCall])
					.map[e | (e as RunnableCall).arguments]
					.flatten
					.filter[e | e.parameter?.direction == DirectionType::OUT || e.parameter?.direction == DirectionType::INOUT]
				)
			}
			return choiceOfValues
		}
		return Collections.EMPTY_LIST
	}

}