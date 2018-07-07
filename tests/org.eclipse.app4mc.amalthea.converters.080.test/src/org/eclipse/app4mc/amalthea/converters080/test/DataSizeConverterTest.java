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

package org.eclipse.app4mc.amalthea.converters080.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.app4mc.amalthea.converters080.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters080.impl.SwConverter;
import org.jdom2.Document;
import org.jdom2.output.XMLOutputter;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class DataSizeConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles_swModeLabels = new String[] { "/datasize/dataSizeChanges.amxmi" };


		return Arrays.asList(new Object[][] { { "Models with DataSize", true, inputFiles_swModeLabels,
				"Migration of Amalthea models containing DataSize " } });
	}

	public DataSizeConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters080.impl.NamespaceConverter.class,
				RootElementConverter.class, SwConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);

		final XMLOutputter outputter = new XMLOutputter();
		final String docBufferString = outputter.outputString(document);


		assertTrue("Model migration of \"DataSize\" element is not successful in model file : " + document.getBaseURI(),
				!docBufferString.contains("byte") && !docBufferString.contains("kibit"));

	}


}
