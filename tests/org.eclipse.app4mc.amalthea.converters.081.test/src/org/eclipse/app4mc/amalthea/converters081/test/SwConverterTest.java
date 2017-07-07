/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters081.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters081.impl.ConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.SwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class SwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles = new String[] { "/sw/sw.amxmi","/sw/sw2.amxmi" };



		return Arrays.asList(new Object[][] {
				{ "Models with SW Model", true, inputFiles, "Migration of Amalthea models containing SW Model " } ,
  });
	}

	public SwConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters081.impl.NamespaceConverter.class,
				org.eclipse.app4mc.amalthea.converters081.impl.RootElementConverter.class, ConstraintsConverter.class,
				HwConverter.class, SwConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);


		final List<Element> runnableElements = this.helper.getXpathResult(document.getRootElement(),
				"./swModel/runnables[./activations]|./swModel/runnables[@activations]", Element.class, this.helper.getGenericNS("xsi"));


		if(document.getBaseURI().endsWith("sw.amxmi")){
			assertTrue( "Runnable migration is not successful" , runnableElements.size()==2);
			
		}

		
		
	 

	}


}
