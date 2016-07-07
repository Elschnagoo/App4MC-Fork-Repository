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

import org.eclipse.app4mc.amalthea.converters070.impl.ComponentsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
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
public class ComponentsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/components/comp.amxmi-components.amxmi", true } });
	}

	public ComponentsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(ComponentsConverter.class, ContentConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Test
	public void verification_FrancaInterface() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//components/ports[(@xsi:type=\"am:FInterfacePort\")]|/am:ComponentsModel/components/ports[(@xsi:type=\"am:FInterfacePort\")]");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of Franca Interface. In model file :   " + document.getBaseURI(),
						element.getChild("interface") == null);

				final List<Attribute> attributes = getXpathResult_Attributes(element,
						"./customProperties[(@key=\"Franca interface\")]/value[@xsi:type=\"am:StringObject\"]/@value");

				assertTrue("Unable to create custom property with Franca Interface details. In model file :   "
						+ document.getBaseURI(), attributes.get(0).getValue().contains("@interfaces"));


			}

		}

	}

	@Test
	public void verification_InterfaceKind() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//components/ports[(@xsi:type=\"am:FInterfacePort\")]|/am:ComponentsModel/components/ports[(@xsi:type=\"am:FInterfacePort\")]");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of InterfaceKind . In model file :   " + document.getBaseURI(),
						element.getAttributeValue("kind").equals("provides")
								|| element.getAttributeValue("kind").equals("requires"));

			}

		}

	}
}
