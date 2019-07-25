/**
 ********************************************************************************
 * Copyright (c) 2016-2019 Vector Informatik GmbH and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Vector Informatik GmbH - initial API and implementation
 ********************************************************************************
 */

package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.ClockStepList;
import org.eclipse.app4mc.amalthea.model.PeriodicStimulus;
import org.eclipse.app4mc.amalthea.model.StimuliModel;
import org.eclipse.app4mc.amalthea.model.VariableRateStimulus;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

public class StimuliBuilder {
	
	public void periodicStimulus(final StimuliModel container, Procedure1<PeriodicStimulus> initializer) {
		final PeriodicStimulus obj = AmaltheaFactory.eINSTANCE.createPeriodicStimulus();
		container.getStimuli().add(obj);
		initializer.apply(obj);
	}
	
	public void variableRateStimulus(final StimuliModel container, Procedure1<VariableRateStimulus> initializer) {
		final VariableRateStimulus obj = AmaltheaFactory.eINSTANCE.createVariableRateStimulus();
		container.getStimuli().add(obj);
		initializer.apply(obj);
	}
	
	public void clockStepList(final StimuliModel container, Procedure1<ClockStepList> initializer) {
		final ClockStepList obj = AmaltheaFactory.eINSTANCE.createClockStepList();
		container.getClocks().add(obj);
		initializer.apply(obj);
	}
}
