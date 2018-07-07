/**
 ********************************************************************************
 * Copyright (c) 2017 Dortmund University of Applied Sciences and Arts and others.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Dortmund University of Applied Sciences and Arts - initial API and implementation
 ********************************************************************************
 */
package org.eclipse.app4mc.multicore.sharelibs.modelchecker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelDescription;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpec;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountOperation;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecAmountType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.ModelSpecModelType;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.EntrySeverityLevel;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.logger.ModelSpecLogger;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.specs.ModelSpecAmount;
import org.eclipse.app4mc.multicore.sharelibs.modelchecker.specs.ModelSpecHasModelType;
import org.eclipse.app4mc.multicore.sharelibs.utframework.ModelLoader;
import org.junit.Before;
import org.junit.Test;

public class ModelCheckerTest {

	Amalthea testModel = null;

	@Before
	public void setUp() {
		this.testModel = ModelLoader.getModel(ModelLoader.DEMOCAR);
		// Remove all runnables
		this.testModel.getSwModel().getRunnables().clear();
		// Remove HW model
		this.testModel.setHwModel(null);
	}


	@Test
	public void testSeverityLevel() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		// Verify all runnable are gone
		assertEquals(0, this.testModel.getSwModel().getRunnables().size());

		final ModelSpecAmount spec = ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE)
				.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0);

		// Set it as error
		ModelDescription modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.ERROR));

		boolean checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		// Set as warning
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.WARNING));

		checkres = modelDesc.checkModel(this.testModel);

		// It shouldn't fail
		assertTrue(checkres);

		// Change the failing level to Warning
		modelDesc.setFailSeverityLevel(EntrySeverityLevel.WARNING);

		checkres = modelDesc.checkModel(this.testModel);

		// It hast to fail
		assertFalse(checkres);

		// Check that error still failing
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.ERROR))
				.setFailSeverityLevel(EntrySeverityLevel.WARNING);
		checkres = modelDesc.checkModel(this.testModel);
		assertFalse(checkres);

		// That for lower severities doesn't fail
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.OK))
				.setFailSeverityLevel(EntrySeverityLevel.WARNING);
		checkres = modelDesc.checkModel(this.testModel);
		assertTrue(checkres);
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.INFO))
				.setFailSeverityLevel(EntrySeverityLevel.WARNING);
		checkres = modelDesc.checkModel(this.testModel);
		assertTrue(checkres);

	}

	@Test
	public void testAllSeverities() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		// Verify all runnable are gone
		assertEquals(0, this.testModel.getSwModel().getRunnables().size());

		final ModelSpecAmount spec = ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE)
				.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0);

		// Set it as error
		ModelDescription modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.ERROR));

		boolean checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		// Set as warning
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.WARNING));

		checkres = modelDesc.checkModel(this.testModel);

		// It shouldn't fail
		assertTrue(checkres);

		// Set as Info
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.INFO));

		checkres = modelDesc.checkModel(this.testModel);

		// It shouldn't fail
		assertTrue(checkres);

		// Set as Info
		modelDesc = ModelDescription.builder().addSpec(spec.setSeverity(EntrySeverityLevel.OK));

		checkres = modelDesc.checkModel(this.testModel);

		// It shouldn't fail
		assertTrue(checkres);

	}

	@Test
	public void testAllAmountOperations() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		// Verify all runnable are gone
		assertEquals(0, this.testModel.getSwModel().getRunnables().size());

		final ModelSpecAmount spec = ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE)
				.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.ERROR);

		// Set it as error
		ModelDescription modelDesc = ModelDescription.builder().addSpec(spec);

		boolean checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec.compareWith(ModelSpecAmountOperation.GREATER, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec.compareWith(ModelSpecAmountOperation.GREATER_EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

		spec.compareWith(ModelSpecAmountOperation.EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

		spec.compareWith(ModelSpecAmountOperation.LESS, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec.compareWith(ModelSpecAmountOperation.LESS_EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

	}

	@Test
	public void testAllTypes() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		// Verify all runnable are gone
		assertEquals(0, this.testModel.getSwModel().getRunnables().size());

		final ModelSpecAmount spec = ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE)
				.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.ERROR);

		// Set it as error
		ModelDescription modelDesc = ModelDescription.builder().addSpec(spec);

		boolean checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec.compareWith(ModelSpecAmountOperation.EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

		spec.compareWith(ModelSpecAmountOperation.GREATER_EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

		spec.compareWith(ModelSpecAmountOperation.EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

		spec.compareWith(ModelSpecAmountOperation.LESS, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec.compareWith(ModelSpecAmountOperation.LESS_EQUAL, 0);
		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertTrue(checkres);

	}

	@Test
	public void testHasModelType() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		// Verify that the HW model failed
		assertNull(this.testModel.getHwModel());

		// Verify all runnable are gone
		assertEquals(0, this.testModel.getSwModel().getRunnables().size());

		ModelSpecHasModelType spec = ModelSpec.ofHasModel(ModelSpecModelType.HW_MODEL)
				.setSeverity(EntrySeverityLevel.ERROR);

		// Set it as error
		ModelDescription modelDesc = ModelDescription.builder().addSpec(spec);

		boolean checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec = ModelSpec.ofHasModel(ModelSpecModelType.SW_MODEL).setSeverity(EntrySeverityLevel.ERROR);

		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(this.testModel);

		// Now it has the model and should fail
		assertTrue(checkres);


	}

	@Test
	public void testHasAllModelType() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		final Amalthea emptyModel = AmaltheaFactory.eINSTANCE.createAmalthea();

		// Verify that all models are empty
		assertNull(emptyModel.getHwModel());
		assertNull(emptyModel.getCommonElements());
		assertNull(emptyModel.getComponentsModel());
		assertNull(emptyModel.getConfigModel());
		assertNull(emptyModel.getConstraintsModel());
		// assertNull(emptyModel.getCustomProperties());
		assertNull(emptyModel.getEventModel());
		assertNull(emptyModel.getHwModel());
		assertNull(emptyModel.getMappingModel());
		assertNull(emptyModel.getOsModel());
		assertNull(emptyModel.getPropertyConstraintsModel());
		assertNull(emptyModel.getStimuliModel());
		assertNull(emptyModel.getSwModel());


		for (final ModelSpecModelType type : ModelSpecModelType.values()) {
			final ModelSpecHasModelType spec = ModelSpec.ofHasModel(type).setSeverity(EntrySeverityLevel.ERROR);

			final ModelDescription modelDesc = ModelDescription.builder().addSpec(spec);

			final boolean checkres = modelDesc.checkModel(emptyModel);

			// It should return false since it shall fail
			assertFalse(checkres);
		}

	}

	@Test
	public void testAllAmountTypes() {

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		final Amalthea emptyModel = AmaltheaFactory.eINSTANCE.createAmalthea();
		emptyModel.setSwModel(AmaltheaFactory.eINSTANCE.createSWModel());
		emptyModel.setHwModel(AmaltheaFactory.eINSTANCE.createHWModel());

		// We have to create the entire path to cores to be sure that we are
		// testing it
		
// TODO implement
//		emptyModel.getHwModel().setSystem(AmaltheaFactory.eINSTANCE.createHwSystem());


		for (final ModelSpecAmountType type : ModelSpecAmountType.values()) {
			ModelSpecAmount spec = ModelSpec.ofAmount(type).compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0)
					.setSeverity(EntrySeverityLevel.ERROR);

			ModelDescription modelDesc = ModelDescription.builder().addSpec(spec);

			boolean checkres = modelDesc.checkModel(emptyModel);

			// It should return false since it shall fail
			assertFalse(checkres);

			spec = ModelSpec.ofAmount(type).compareWith(ModelSpecAmountOperation.EQUAL, 0)
					.setSeverity(EntrySeverityLevel.ERROR);

			modelDesc = ModelDescription.builder().addSpec(spec);

			checkres = modelDesc.checkModel(emptyModel);

			// It should return false since it shall fail
			assertTrue(checkres);
		}

	}

	@Test
	public void testFailingOnException() {

		final Amalthea emptyModel = AmaltheaFactory.eINSTANCE.createAmalthea();

		ModelSpecAmount spec = ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE)
				.compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0).setSeverity(EntrySeverityLevel.ERROR);

		ModelDescription modelDesc = ModelDescription.builder().addSpec(spec);

		boolean checkres = modelDesc.checkModel(emptyModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		spec = ModelSpec.ofAmount(ModelSpecAmountType.RUNNABLE).compareWith(ModelSpecAmountOperation.NOT_EQUAL, 0)
				.setSeverity(EntrySeverityLevel.WARNING);

		modelDesc = ModelDescription.builder().addSpec(spec);

		checkres = modelDesc.checkModel(emptyModel);

		// It should return false since it shall fail
		assertTrue(checkres);


	}

	@Test
	public void testConcatBuilderLogger() {

		final ModelSpecLogger logger = new ModelSpecLogger();

		// Verify that the software model is working
		assertNotNull(this.testModel);
		assertNotNull(this.testModel.getSwModel());

		// Verify that the HW model failed
		assertNull(this.testModel.getHwModel());

		// Verify all runnable are gone
		assertEquals(0, this.testModel.getSwModel().getRunnables().size());

		final ModelSpecHasModelType spec = ModelSpec.ofHasModel(ModelSpecModelType.HW_MODEL)
				.setSeverity(EntrySeverityLevel.ERROR);

		// Set it as error
		final ModelDescription modelDesc = ModelDescription.builder(logger).addSpec(spec);

		assertEquals(0, logger.getLogSize());

		boolean checkres = modelDesc.checkModel(this.testModel);

		// It should return false since it shall fail
		assertFalse(checkres);

		assertEquals(1, logger.getLogSize());

		modelDesc.printLog();


		final ModelDescription modelDesc2 = ModelDescription.builder("Name 1").addSpec(spec);

		modelDesc2.concatLog(modelDesc);

		checkres = modelDesc2.checkModel(this.testModel);

		// Now it has the model and should fail
		assertFalse(checkres);

		assertEquals(2, logger.getLogSize());

		final ModelDescription modelDesc3 = ModelDescription.builder(logger, "Name 1").addSpec(spec);

		checkres = modelDesc3.checkModel(ModelLoader.getURI(ModelLoader.DEMOCAR));

		// Original Model Has HW model
		assertTrue(checkres);

		assertEquals(2, logger.getLogSize());

		modelDesc3.printLog();

	}

}