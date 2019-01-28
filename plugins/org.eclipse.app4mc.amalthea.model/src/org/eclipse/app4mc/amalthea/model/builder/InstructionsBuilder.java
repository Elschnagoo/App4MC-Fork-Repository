/**
 ********************************************************************************
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.DiscreteValueConstant;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.IDiscreteValueDeviation;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * Creates Need entries for Instructions 
 * 
 * @deprecated (0.9.3) use {@link org.eclipse.app4mc.amalthea.model.Ticks} instead.
 */
@Deprecated
public class InstructionsBuilder {

	// ********** Execution Need (Runnable items) **********

	public DiscreteValueConstant instructions(final ExecutionNeed container, final long instructions) {
		final DiscreteValueConstant usages = AmaltheaFactory.eINSTANCE.createDiscreteValueConstant();
		usages.setValue(instructions);
		container.getNeeds().put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, usages);
		return usages;
	}

	public IDiscreteValueDeviation instructions(final ExecutionNeed container, final IDiscreteValueDeviation instructions) {
		container.getNeeds().put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, instructions);
		return instructions;
	}

	// ********** Hardware Feature Category **********

	public void featureCategory_Instructions(final HWModel container, final Procedure1<HwFeatureCategory> initializer) {
		final HwFeatureCategory obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
		obj.setName(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME);
		container.getFeatureCategories().add(obj);
		initializer.apply(obj);
	}

}
