/**
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
 */

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Deviation;
import org.eclipse.app4mc.amalthea.model.ExecutionNeed;
import org.eclipse.app4mc.amalthea.model.HWModel;
import org.eclipse.app4mc.amalthea.model.HwFeatureCategory;
import org.eclipse.app4mc.amalthea.model.LongObject;
import org.eclipse.app4mc.amalthea.model.Need;
import org.eclipse.app4mc.amalthea.model.NeedConstant;
import org.eclipse.app4mc.amalthea.model.NeedDeviation;
import org.eclipse.app4mc.amalthea.model.ProcessingUnitDefinition;
import org.eclipse.app4mc.amalthea.model.Scheduler;
import org.eclipse.app4mc.amalthea.model.util.FactoryUtil;
import org.eclipse.app4mc.amalthea.model.util.InstructionsUtil;
import org.eclipse.emf.common.util.BasicEMap;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class InstructionsBuilder {

	// ********** Execution Need (Runnable items) **********

	public NeedConstant default_Instructions(final ExecutionNeed container, final long instructions) {
		final NeedConstant need = FactoryUtil.createNeedConstant(instructions);
		container.getDefault().put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
		return need;
	}

	public NeedDeviation default_Instructions(final ExecutionNeed container, final Deviation<LongObject> instructions) {
		final NeedDeviation need = FactoryUtil.createNeedDeviation(instructions);
		container.getDefault().put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
		return need;
	}

	public NeedConstant extended_Instructions(final ExecutionNeed container, final ProcessingUnitDefinition puDef, final long instructions) {
		final NeedConstant need = FactoryUtil.createNeedConstant(instructions);
		if (container.getExtended().containsKey(puDef) == false) {
			container.getExtended().put(puDef, new BasicEMap<String, Need>());
		}
		container.getExtended().get(puDef).put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
		return need;
	}

	public NeedDeviation extended_Instructions(final ExecutionNeed container, final ProcessingUnitDefinition puDef, final Deviation<LongObject> instructions) {
		final NeedDeviation need = FactoryUtil.createNeedDeviation(instructions);
		if (container.getExtended().containsKey(puDef) == false) {
			container.getExtended().put(puDef, new BasicEMap<String, Need>());
		}
		container.getExtended().get(puDef).put(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME, need);
		return need;
	}

	// ********** Execution Need (Computation Items) **********

	public ExecutionNeed execNeed_default_Instructions(final Scheduler container, final long instructions) {
		final ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeedConstant(instructions);
		container.getComputationItems().add(execNeed);
		return execNeed;
	}

	public ExecutionNeed execNeed_default_Instructions(final Scheduler container, final Deviation<LongObject> instructions) {
		final ExecutionNeed execNeed = InstructionsUtil.createDefaultExecutionNeedDeviation(instructions);
		container.getComputationItems().add(execNeed);
		return execNeed;
	}

	// ********** Hardware Feature Category **********

	public void featureCategory_Instructions(final HWModel container, final Procedure1<HwFeatureCategory> initializer) {
		final HwFeatureCategory obj = AmaltheaFactory.eINSTANCE.createHwFeatureCategory();
		obj.setName(InstructionsUtil.INSTRUCTIONS_CATEGORY_NAME);
		container.getFeatureCategories().add(obj);
		initializer.apply(obj);
	}

}
