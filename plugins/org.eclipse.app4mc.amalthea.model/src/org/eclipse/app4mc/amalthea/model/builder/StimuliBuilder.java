package org.eclipse.app4mc.amalthea.model.builder;

import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
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
}
