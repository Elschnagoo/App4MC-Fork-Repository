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

import org.eclipse.app4mc.amalthea.model.AbstractProcess;
import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ArchitectureRequirement;
import org.eclipse.app4mc.amalthea.model.CPUPercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.ConstraintsModel;
import org.eclipse.app4mc.amalthea.model.CountRequirementLimit;
import org.eclipse.app4mc.amalthea.model.FrequencyRequirementLimit;
import org.eclipse.app4mc.amalthea.model.LimitType;
import org.eclipse.app4mc.amalthea.model.PercentageRequirementLimit;
import org.eclipse.app4mc.amalthea.model.ProcessChainRequirement;
import org.eclipse.app4mc.amalthea.model.ProcessRequirement;
import org.eclipse.app4mc.amalthea.model.Requirement;
import org.eclipse.app4mc.amalthea.model.Runnable;
import org.eclipse.app4mc.amalthea.model.RunnableRequirement;
import org.eclipse.app4mc.amalthea.model.Time;
import org.eclipse.app4mc.amalthea.model.TimeMetric;
import org.eclipse.app4mc.amalthea.model.TimeRequirementLimit;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class ConstraintsBuilder {

	public ConstraintsModel constraintsModelRoot(final Amalthea container, final Procedure1<ConstraintsModel> initializer) {
		final ConstraintsModel obj = AmaltheaFactory.eINSTANCE.createConstraintsModel();
		container.setConstraintsModel(obj);
		initializer.apply(obj);
		return obj;
	}

	// ********** Top level elements **********

	public void requirement_Architecture(final ConstraintsModel container, final Procedure1<ArchitectureRequirement> initializer) {
		final ArchitectureRequirement obj = AmaltheaFactory.eINSTANCE.createArchitectureRequirement();
		container.getRequirements().add(obj);
		initializer.apply(obj);
	}

	public void requirement_Runnable(final ConstraintsModel container, final Procedure1<RunnableRequirement> initializer) {
		final RunnableRequirement obj = AmaltheaFactory.eINSTANCE.createRunnableRequirement();
		container.getRequirements().add(obj);
		initializer.apply(obj);
	}

	public void requirement_Process(final ConstraintsModel container, final Procedure1<ProcessRequirement> initializer) {
		final ProcessRequirement obj = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		container.getRequirements().add(obj);
		initializer.apply(obj);
	}

	public void requirement_ProcessChain(final ConstraintsModel container, final Procedure1<ProcessChainRequirement> initializer) {
		final ProcessChainRequirement obj = AmaltheaFactory.eINSTANCE.createProcessChainRequirement();
		container.getRequirements().add(obj);
		initializer.apply(obj);
	}

	// ********** Top level shortcut - deadline (ResponseTime, UpperLimit) **********

	public void deadline_Process(final ConstraintsModel container, final AbstractProcess process, final Time deadline) {
		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		limit.setMetric(TimeMetric.RESPONSE_TIME);
		limit.setLimitType(LimitType.UPPER_LIMIT);
		limit.setLimitValue(deadline);
		final ProcessRequirement req = AmaltheaFactory.eINSTANCE.createProcessRequirement();
		req.setName("Process deadline - " + process.getName());
		req.setProcess(process);
		req.setLimit(limit);
		container.getRequirements().add(req);
	}

	public void deadline_Runnable(final ConstraintsModel container, final Runnable runnable, final Time deadline) {
		final TimeRequirementLimit limit = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		limit.setMetric(TimeMetric.RESPONSE_TIME);
		limit.setLimitType(LimitType.UPPER_LIMIT);
		limit.setLimitValue(deadline);
		final RunnableRequirement req = AmaltheaFactory.eINSTANCE.createRunnableRequirement();
		req.setName("Runnable deadline - " + runnable.getName());
		req.setRunnable(runnable);
		req.setLimit(limit);
		container.getRequirements().add(req);
	}

	// ********** Requirements - limits **********

	public void limit_Time(final Requirement container, final Procedure1<TimeRequirementLimit> initializer) {
		final TimeRequirementLimit obj = AmaltheaFactory.eINSTANCE.createTimeRequirementLimit();
		container.setLimit(obj);
		initializer.apply(obj);
	}

	public void limit_Frequency(final Requirement container, final Procedure1<FrequencyRequirementLimit> initializer) {
		final FrequencyRequirementLimit obj = AmaltheaFactory.eINSTANCE.createFrequencyRequirementLimit();
		container.setLimit(obj);
		initializer.apply(obj);
	}

	public void limit_Percentage(final Requirement container, final Procedure1<PercentageRequirementLimit> initializer) {
		final PercentageRequirementLimit obj = AmaltheaFactory.eINSTANCE.createPercentageRequirementLimit();
		container.setLimit(obj);
		initializer.apply(obj);
	}

	public void limit_Count(final Requirement container, final Procedure1<CountRequirementLimit> initializer) {
		final CountRequirementLimit obj = AmaltheaFactory.eINSTANCE.createCountRequirementLimit();
		container.setLimit(obj);
		initializer.apply(obj);
	}

	public void limit_CPUPercentage(final Requirement container, final Procedure1<CPUPercentageRequirementLimit> initializer) {
		final CPUPercentageRequirementLimit obj = AmaltheaFactory.eINSTANCE.createCPUPercentageRequirementLimit();
		container.setLimit(obj);
		initializer.apply(obj);
	}

}
