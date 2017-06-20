package org.eclipse.app4mc.multicore.sharelibs.utframework;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.multicore.sharelibs.utframework.ModelLoader;
import org.junit.Test;

public class ModelLoaderTest {

	@Test
	public void testSingleLoad() {
		final Amalthea testModel = ModelLoader.getModel(ModelLoader.DEMOCAR);
		assertNotNull(testModel);
		assertNotNull(testModel.getSwModel());
	}

	@Test
	public void testDualLoads() {
		final Amalthea testModel0 = ModelLoader.getModel(ModelLoader.DEMOCAR);
		final Amalthea testModel1 = ModelLoader.getModel(ModelLoader.DEMOCAR);

		assertNotNull(testModel0);
		assertNotNull(testModel1);
		assertNotNull(testModel0.getSwModel());
		assertNotNull(testModel1.getSwModel());

		// Modify one of the models
		testModel0.setSwModel(null);
		assertNull(testModel0.getSwModel());

		// Test that both models are independent from each other
		assertNotSame(testModel0.getSwModel(), testModel1.getSwModel());


	}

}