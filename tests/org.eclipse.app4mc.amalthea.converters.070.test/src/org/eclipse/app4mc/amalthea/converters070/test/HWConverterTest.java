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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters070.impl.ComponentsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.HwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class HWConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/hw/default.amxmi", true }, { "/hw/pcmodel.amxmi", true },
				{ "/hw/hw_uuid.amxmi", true }, { "/hw/ref_hw.amxmi", true },
				{ "/hw/hw_attribs_features.amxmi", true } });
	}

	public HWConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(ComponentsConverter.class, HwConverter.class, ContentConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Test
	public void verification_isMaster() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//ports[@name=\"complex_port\"]");


			for (final Element element : elements) {

				final String attributeValue = element.getAttributeValue("master");

				assertTrue("Unable to migrate the data of LabelSwitchEntry to Mode Literals ",
						attributeValue != null && attributeValue.equals("true"));


			}

		}

	}

	@Test
	public void verification_complexnode_attribute_features() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//system|.//ecus|.//microcontrollers|.//cores|.//memories|.//networks|.//quartzes|.//components");


			for (final Element element : elements) {

				final List<Element> attributes = element.getChildren("attribute");
				final List<Element> features = element.getChildren("features");

				assertTrue("Unable to migrate the data of attribute/features from ComplexNode in HW Model : "
						+ element.getDocument().getBaseURI(), attributes.size() == 0 || features.size() == 0);
			}


			if (document.getBaseURI().endsWith("hw_attribs_features.amxmi")) {

				for (final Element element : elements) {


					final List<Element> customProperties = element.getChildren("customProperties");

					assertTrue(
							"Unable to migrate the data of attribute/features from ComplexNode, to CustomProperties : "
									+ element.getDocument().getBaseURI(),
							customProperties.size() > 0);


					final List<Element> attributes = new ArrayList<Element>();
					final List<Element> features = new ArrayList<Element>();

					for (final Element element2 : customProperties) {

						final String attributeValue = element2.getAttributeValue("key");

						if (attributeValue.startsWith("attribute#")) {

							attributes.add(element2);
						}
						else if (attributeValue.startsWith("feature#")) {
							features.add(element2);
						}
					}

					if (element.getName().equals("ecus") || element.getName().equals("microcontrollers")
							|| element.getName().equals("cores") || element.getName().equals("memories")
							|| element.getName().equals("networks") || element.getName().equals("quartzes")
							|| element.getName().equals("components")) {

						assertTrue("Unable to migrate the data of attribute/features from ComplexNode : "
								+ element.getName() + " , to CustomProperties : " + element.getDocument().getBaseURI(),
								attributes.size() > 0 && features.size() == 0);
					}
					else {
						assertTrue("Unable to migrate the data of attribute/features from ComplexNode : "
								+ element.getName() + " , to CustomProperties : " + element.getDocument().getBaseURI(),
								attributes.size() > 0 && features.size() > 0);
					}

				}
			}
		}

	}

}
