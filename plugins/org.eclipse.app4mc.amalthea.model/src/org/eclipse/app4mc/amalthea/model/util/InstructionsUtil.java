/**
 * *******************************************************************************
 *  Copyright (c) 2018 Robert Bosch GmbH and others.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 *
 * *******************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.util;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeature;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.NeedConstant;
import org.eclipse.app4mc.amalthea.model.NeedDeviation;
import org.eclipse.app4mc.amalthea.model.ProcessingUnit;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;

public class InstructionsUtil {

	public static final String INSTRUCTIONS_CATEGORY_NAME = "Instructions";

	public static HwFeatureCategory getOrCreateInstructionsCategory(Amalthea model) {
		HWModel hwModel = ModelUtil.getOrCreateHwModel(model);
		for (HwFeatureCategory category : hwModel.getFeatureCategories()) {
			if (category.getName() == INSTRUCTIONS_CATEGORY_NAME) return category;
		}
		
		// create missing category
		HwFeatureCategory newCategory = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
		newCategory.setName(INSTRUCTIONS_CATEGORY_NAME);
		hwModel.getFeatureCategories().add(newCategory);
		
		return newCategory;
	}

	public static ExecutionNeed createDefaultExecutionNeed(long instructions) {
		return createDefaultExecutionNeed(INSTRUCTIONS_CATEGORY_NAME, instructions);
	}

	public static ExecutionNeed createDefaultExecutionNeed(Deviation<LongObject> instructions) {
		return createDefaultExecutionNeed(INSTRUCTIONS_CATEGORY_NAME, instructions);
	}

	public static Need getDefaultNeed(ExecutionNeed execNeed) {
		return execNeed.getDefault().get(INSTRUCTIONS_CATEGORY_NAME);
	}
	
	public static long getDefaultNeedConstant(ExecutionNeed execNeed) {
		return getDefaultNeedConstant(execNeed, INSTRUCTIONS_CATEGORY_NAME);
	}
	
	public static Deviation<LongObject> getDefaultNeedDeviation(ExecutionNeed execNeed) {
		return getDefaultNeedDeviation(execNeed, INSTRUCTIONS_CATEGORY_NAME);
	}


	public static double getIPC(Amalthea model, ProcessingUnit pu) {
		List<Double> values = getFeatureValuesOfCategory(pu.getDefinition(), getOrCreateInstructionsCategory(model));
		if (!values.isEmpty()) {
			return values.get(0);	// take first value
		}
		return 1.0;	// default
	}


	//----------------------- General ----------------------- 


	private static ExecutionNeed createDefaultExecutionNeed(String category, long instructions) {
		NeedConstant need = AmaltheaFactory.eINSTANCE.createNeedConstant();
		need.setValue(instructions);
		
		ExecutionNeed execNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		execNeed.getDefault().put(category, need);
		
		return execNeed;
	}

	private static ExecutionNeed createDefaultExecutionNeed(String category, Deviation<LongObject> instructions) {
		NeedDeviation need = AmaltheaFactory.eINSTANCE.createNeedDeviation();
		need.setDeviation(instructions);;
		
		ExecutionNeed execNeed = AmaltheaFactory.eINSTANCE.createExecutionNeed();
		execNeed.getDefault().put(category, need);
		
		return execNeed;
	}

	
	private static long getDefaultNeedConstant(ExecutionNeed execNeed, String category) {
		if (execNeed == null || category == null) return 0;
		
		Need need = execNeed.getDefault().get(category);
		if (need instanceof NeedConstant) {
			return ((NeedConstant) need).getValue();
		}
		return 0;
	}
	
	private static Deviation<LongObject> getDefaultNeedDeviation(ExecutionNeed execNeed, String category) {
		if (execNeed == null || category == null) return null;
		
		Need need = execNeed.getDefault().get(category);
		if (need instanceof NeedDeviation) {
			return ((NeedDeviation) need).getDeviation();
		}
		return null;
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
	
