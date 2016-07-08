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
package org.eclipse.app4mc.amalthea.converters111.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters111.impl.CommonConverter;
import org.eclipse.app4mc.amalthea.converters111.impl.ComponentConverter;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class ComponentConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(
				new Object[][] { { "/components_uuid/default.amxmi", true }, { "/components_uuid/test.amxmi", true },
						{ "/components/default.amxmi", true }, { "/components/test.amxmi", true }, });
	}

	public ComponentConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConverter() {

		super.testConversion(CommonConverter.class, ComponentConverter.class);


	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Test
	public void verification_tagName() {


		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying Task ref existence in CustomProperty */


			final List<Element> elements = getXpathResult(document.getRootElement(), ".//tags[@xmi:id]");


			for (final Element element : elements) {

				final List<Attribute> tagNames = getXpathResult_Attributes(element, "./@name");

				assertTrue("Unable to migrate tag name attributes", tagNames.size() > 0);


			}

		}


	}

	/**
	 * This method is used to verify the migration of :<br>
	 * 1. components:Component/components:Composite/components:System contents<br>
	 * 2. components:ComponentInstance/components:Connector
	 */
	@Test
	public void verification_elements_tag_rename() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			List<Element> elements = getXpathResult(document.getRootElement(), ".//componentsModel/elements");

			assertTrue("Unable to migrate the data of components:Component/components:Composite/components:System ",
					elements.size() == 0);


			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("test.amxmi")) {

				elements = getXpathResult(document.getRootElement(), ".//componentsModel/components");

				assertTrue("Unable to migrate the data of components:Component/components:Composite in model file: "
						+ baseURI, elements.size() == 2);


				elements = getXpathResult(document.getRootElement(), ".//componentsModel/systems");

				assertTrue("Unable to migrate the data of components:System in model file: " + baseURI,
						elements.size() == 1);

				elements = getXpathResult(document.getRootElement(), ".//componentsModel/systems/connectors");

				assertTrue("Unable to migrate the data of components:Connector in model file: " + baseURI,
						elements.size() == 1);


				/*- below code is to verify the contents of components:Composite */

				elements = getXpathResult(document.getRootElement(),
						".//componentsModel/components[@xsi:type=\"components:Composite\"]");

				assertTrue("Unable to migrate the data of components:Composite in model file: " + baseURI,
						elements.size() == 1);

				elements = getXpathResult(document.getRootElement(),
						".//componentsModel/components[@xsi:type=\"components:Composite\"]/componentInstances");

				assertTrue("Unable to migrate the data of components:ComponentInstance in model file: " + baseURI,
						elements.size() == 1);

				elements = getXpathResult(document.getRootElement(),
						".//componentsModel/components[@xsi:type=\"components:Composite\"]/connectors");

				assertTrue("Unable to migrate the data of components:Connector in model file: " + baseURI,
						elements.size() == 1);


			}

		}

	}


	@Test
	public void verification_InterfaceKind() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//components/ports[@name=\"refP\"]");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@kind");

				assertTrue("Unable to create InterfaceKind enum attribute kind for Port object : "
						+ element.getAttributeValue("name"), attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for InterfaceKind enum attribute kind in Port object : "
								+ element.getAttributeValue("name"),
						attributes.get(0).getValue().equals("PROVIDES"));


			}

		}

	}
}
