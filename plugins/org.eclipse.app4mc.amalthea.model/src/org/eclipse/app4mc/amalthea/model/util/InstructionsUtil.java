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

package org.eclipse.app4mc.amalthea.model.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.DiscreteConstant;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.IDiscreteDeviation;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;

/**
 * Creates Need entries for Instructions 
 * 
 * @deprecated (0.9.3) use {@link ExecutionTicks} instead.
 */
@Deprecated
public class InstructionsUtil {

	public static final String INSTRUCTIONS_CATEGORY_NAME = "Instructions";

	public static HwFeatureCategory getOrCreateInstructionsCategory(Amalthea model) {
		HWModel hwModel = ModelUtil.getOrCreateHwModel(model);
		for (HwFeatureCategory category : hwModel.getFeatureCategories()) {
			if (null != category.getName() && category.getName().equals(INSTRUCTIONS_CATEGORY_NAME))
				return category;
		}

		// create missing category
		HwFeatureCategory newCategory = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
		newCategory.setName(INSTRUCTIONS_CATEGORY_NAME);
		hwModel.getFeatureCategories().add(newCategory);

		return newCategory;
	}

	public static ExecutionNeed createExecutionNeedConstant(long instructions) {
		return createExecutionNeed(INSTRUCTIONS_CATEGORY_NAME, instructions);
	}

	public static IDiscreteDeviation getNeed(ExecutionNeed execNeed) {
		return execNeed.getNeeds().get(INSTRUCTIONS_CATEGORY_NAME);
	}
	
	public static long getNeedConstant(ExecutionNeed execNeed) {
		return getNeedConstant(execNeed, INSTRUCTIONS_CATEGORY_NAME);
	}
	
	public static IDiscreteDeviation getNeedDeviation(ExecutionNeed execNeed) {
		return getNeedDeviation(execNeed, INSTRUCTIONS_CATEGORY_NAME);
	}


	public static double getIPC(Amalthea model, ProcessingUnit pu) {
		List<Double> values = getFeatureValuesOfCategory(pu.getDefinition(), getOrCreateInstructionsCategory(model));
		if (!values.isEmpty()) {
			return values.get(0);	// take first value
		}
		return 1.0;	// default
	}


	//----------------------- General ----------------------- 


	private static ExecutionNeed createExecutionNeed(String category, long value) {
		DiscreteConstant dev = AmaltheaFactory.eINSTANCE.createDiscreteConstant();
		dev.setValue(value);
		
		ExecutionNeed execNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		execNeed.getNeeds().put(category, dev);
		
		return execNeed;
	}

	private static long getNeedConstant(ExecutionNeed execNeed, String category) {
		if (execNeed == null || category == null) return 0;
		
		IDiscreteDeviation dev = execNeed.getNeeds().get(category);
		if (dev instanceof DiscreteConstant) {
			return ((DiscreteConstant) dev).getValue();
		}
		return 0;
	}
	
	private static IDiscreteDeviation getNeedDeviation(ExecutionNeed execNeed, String category) {
		if (execNeed == null || category == null) return null;
		
		return execNeed.getNeeds().get(category);
	}

	public static List<HwFeature> getFeaturesOfCategory(ProcessingUnitDefinition puDefinition, HwFeatureCategory category) {
		if (puDefinition == null || category == null) return Collections.<HwFeature>emptyList();
		
		return puDefinition.getFeatures().stream()
				.filter(i -> i.getContainingCategory() == category)
				.collect(Collectors.toList());
	}

	public static List<Double> getFeatureValuesOfCategory(ProcessingUnitDefinition puDefinition, HwFeatureCategory category) {
		if (puDefinition == null || category == null) return Collections.<Double>emptyList();
		
		return puDefinition.getFeatures().stream()
				.filter(i -> i.getContainingCategory() == category)
				.map(i -> i.getValue())
				.collect(Collectors.toList());
	}


}
	
