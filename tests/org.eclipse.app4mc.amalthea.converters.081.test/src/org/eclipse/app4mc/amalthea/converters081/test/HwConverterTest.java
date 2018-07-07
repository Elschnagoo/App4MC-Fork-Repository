/*********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters081.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters081.impl.ConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.HwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class HwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles = new String[] { "/hw/hw.amxmi" };

		final String[] inputFiles_quartz = new String[] { "/hw_quartz/hw_quartz.amxmi" };


		return Arrays.asList(new Object[][] {
				{ "Models with HW Model", true, inputFiles, "Migration of Amalthea models containing HW Model " } ,
				{ "Models with HW Model (containing Quartz)", true, inputFiles_quartz, "Migration of Amalthea models containing Quartz in HW Model " } });
	}

	public HwConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters081.impl.NamespaceConverter.class,
				org.eclipse.app4mc.amalthea.converters081.impl.RootElementConverter.class, ConstraintsConverter.class,
				HwConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);

		/* ============= MemoryType's =================== */


		final List<Element> memoryTypeElements = this.helper.getXpathResult(document.getRootElement(),
				"./hwModel/memoryTypes", Element.class, this.helper.getGenericNS("xsi"));


		for (final Element memoryTypeElement : memoryTypeElements) {

			assertTrue(
					"MemoryType : " + memoryTypeElement.getAttributeValue("name")
							+ " is not migrated as xAccessPattern attribute is still existing",
					memoryTypeElement.getAttribute("xAccessPattern") == null);

		}
		
		
		if(document.getBaseURI().endsWith("hw_quartz.amxmi")){
			final List<Element> quartzElements = this.helper.getXpathResult(document.getRootElement(),
					"./hwModel/system//quartzes", Element.class, this.helper.getGenericNS("xsi"));
			
		assertTrue("unable to migrate all Quartz elements", quartzElements.size()==7);
			
		}

	}


}
