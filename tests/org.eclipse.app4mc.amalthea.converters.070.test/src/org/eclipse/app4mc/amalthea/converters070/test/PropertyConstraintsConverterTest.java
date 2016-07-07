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
package org.eclipse.app4mc.amalthea.converters070.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.PropertyContraintsConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PropertyConstraintsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		/*- As pc2.amxmi is referring elements from pc.amxmi, both these files will be considered for the migration*/
		return Arrays.asList(new Object[][] { { "/pcmodel_memtype/pc.amxmi", true } });
	}

	public PropertyConstraintsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(PropertyContraintsConverter.class, ContentConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}


	/**
	 * variable memTypeDefinitions (available in 1.1.1) is renamed to memoryTypeDefinitions (in 0.7.0).
	 *
	 */
	@Test
	public void verification_memTypeDefinitions() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//propertyConstraintsModel|/PropertyConstraintsModel");

			for (final Element element : elements) {

				final Element child = element.getChild("memoryTypeDefinitions");


				assertTrue("Unable to migrate the data of memTypeDefinitions to memoryTypeDefinitions ", child != null);


			}

		}

	}

}
