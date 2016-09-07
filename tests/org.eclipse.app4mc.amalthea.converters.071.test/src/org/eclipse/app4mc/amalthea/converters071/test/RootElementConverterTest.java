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
package org.eclipse.app4mc.amalthea.converters071.test;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.eclipse.app4mc.amalthea.converters071.impl.RootElementConverter;
import org.jdom2.Document;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class RootElementConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/nonAmaltheaRootTag/components.amxmi", true },
				{ "/nonAmaltheaRootTag/config.amxmi", true }, { "/nonAmaltheaRootTag/constraints.amxmi", true },
				{ "/nonAmaltheaRootTag/eventmodel.amxmi", true }, { "/nonAmaltheaRootTag/hwmodel.amxmi", true },
				{ "/nonAmaltheaRootTag/mappingmodel.amxmi", true }, { "/nonAmaltheaRootTag/osmodel.amxmi", true },
				{ "/nonAmaltheaRootTag/propertyconstraints.amxmi", true },
				{ "/nonAmaltheaRootTag/stimuli.amxmi", true }, { "/nonAmaltheaRootTag/swmodel.amxmi", true } });
	}

	public RootElementConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(RootElementConverter.class);
	}


	@Override
	@Test
	public void verification() {

		parseGeneratedXMLFiles();

		final Map<File, Document> map = this.fileName_documentsMap;

		final Set<File> keySet = map.keySet();

		for (final File file1 : keySet) {
			final Document document = map.get(file1);

			final String name = document.getRootElement().getName();

			assertTrue("unable to migrate root element of file to \"Amalthea\" : " + file1.getAbsolutePath(),
					name.equals("Amalthea"));

			assertTrue(
					"unable to copy amalthea namespace to the newly created root element :  \"Amalthea\" : "
							+ file1.getAbsolutePath(),
					document.getRootElement().getNamespace().equals(this.helper.getNS_070("am")));


		}
	}


}
