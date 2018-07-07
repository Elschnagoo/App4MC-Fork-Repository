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

package org.eclipse.app4mc.amalthea.converters070.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.MappingConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class MappingConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/mapping/mapping.amxmi", true } });
	}

	public MappingConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(HwConverter.class, MappingConverter.class, ContentConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}

	/**
	 * variable mem (available in 1.1.1) is renamed to memory (in 0.7.0).
	 *
	 */
	@Test
	public void verification_mem() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(), ".//mappingModel/mapping");

			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("mapping.amxmi")) {
				assertTrue("Unable to migrate the data of Mapping model :  " + baseURI, elements.size() >= 3);
			}


			for (final Element element : elements) {

				String attributeValue = element.getAttributeValue("memory");

				if (attributeValue == null) {
					final Element child = element.getChild("memory");

					attributeValue = child != null ? child.getAttributeValue("href") : null;

				}

				assertTrue("Unable to migrate the mapping model data --> i.e. from mem to memory ",
						attributeValue != null);


			}

		}

	}

	@Test
	public void verification_processAllocation() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final String baseURI = document.getBaseURI();

			final List<Element> elements = getXpathResult(document.getRootElement(), ".//mappingModel");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of processAllocation in Mapping model of :  " + baseURI,
						element.getChildren("processAllocation").size() == 0);

				if (baseURI.endsWith("mapping.amxmi")) {

					assertTrue(
							"Unable to migrate the data of processAllocation (containing task references) Mapping model :  "
									+ baseURI,
							element.getChildren("taskAllocation").size() == 2);

					assertTrue(
							"Unable to migrate the data of ProcessAllocation (containing ISR references) Mapping model :  "
									+ baseURI,
							element.getChildren("isrAllocation").size() == 2);

				}
			}

		}

	}
}
