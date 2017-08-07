/*******************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 *
 ******************************************************************************/

package org.eclipse.app4mc.multicore.openmapping.test.algorithms.taskgen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.openmapping.algorithms.AbstractTaskCreationAlgorithm;
import org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic.PragmaticTaskGenerator;
import org.eclipse.app4mc.multicore.sharelibs.utframework.ModelLoader;
import org.junit.Before;
import org.junit.Test;

public class PragmaticTaskGeneratorTest {
	Amalthea testSwModel = null;
	Amalthea output = null;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		// Prepare input, based on the Mapping Example for creating Tasks
		this.testSwModel = ModelLoader.getModel(ModelLoader.DEMOCAR_WITH_PP);

		// Verify that the software model is working
		assertNotNull("Amalthea Input Model must be set.", this.testSwModel);
		assertNotNull("Software Input Model must be set.", this.testSwModel.getSwModel());
		assertNotEquals("Number of Process Prototypes must be greater 0.", this.testSwModel.getSwModel().getProcessPrototypes().size(), 0);
		assertNotEquals("Number of Activations must be greater 0.", this.testSwModel.getSwModel().getActivations().size(), 0);
	}

	/**
	 * Test method for {@link org.eclipse.app4mc.multicore.openmapping.algorithms.taskgen.pragmatic.PragmaticTaskGenerator#createTasks()}.
	 */
	@Test
	public final void testCreateTasks() {
		AbstractTaskCreationAlgorithm alg = new PragmaticTaskGenerator();
		alg.setAmaltheaModel(this.testSwModel);
		alg.createTasks();
		
		this.output = alg.getAmaltheaOutputModel();
		
		// Verify that output models exist
		assertNotNull("Output must be created.", this.output);
		assertNotNull("Output must contain SW Model", this.output.getSwModel());
		assertNotNull("Output must contain Stimuli Model", this.output.getStimuliModel());
		
		// Verify that the amount of converted elements matches the input
		assertEquals("Number of created Tasks has to match number of ProcessPrototypes", this.testSwModel.getSwModel().getProcessPrototypes().size(), this.output.getSwModel().getTasks().size());
		assertEquals("Number of created Stimuli has to match number of Activations", this.testSwModel.getSwModel().getActivations().size(), this.output.getStimuliModel().getStimuli().size());
	}
}
