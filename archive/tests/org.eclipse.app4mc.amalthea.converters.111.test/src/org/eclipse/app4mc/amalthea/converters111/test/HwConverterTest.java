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

package org.eclipse.app4mc.amalthea.converters111.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters111.impl.CommonConverter;
import org.eclipse.app4mc.amalthea.converters111.impl.HwConverter;
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
public class HwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/hw/hw.amxmi", true }, { "/hw/default.amxmi-hw", true },
				{ "/hw/default_quartz.amxmi-hw", true }, { "/hw/default_memtype.amxmi-hw", true },
				{ "/hw/default_bus.amxmi-hw", true }, { "/hw/default_complexpin.amxmi-hw", true },
				{ "/hw/default_complexport.amxmi-hw", true }, { "/hw/default_networktype.amxmi-hw", true },
				{ "/hw/default_featuretypes.amxmi-hw", true }

		});
	}

	public HwConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class, HwConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Test
	public void verification_QType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//quartzes|/hw:Quartz");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@type");
				assertTrue("Unable to set default value (from 1.1.0) of QType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}

		}

	}

	@Test
	public void verification_MemoryType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//memoryTypes|.//memTypeDefinitions|/hw:MemType");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@type");
				assertTrue("Unable to set default value (from 1.1.0) of MemoryType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}

		}

	}

	@Test
	public void verification_BusType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//networkTypes[(@xsi:type=\"hw:Bus\")]|/hw:Bus");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@busType");
				assertTrue("Unable to set default value (from 1.1.0) of BusType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}

		}

	}

	@Test
	public void verification_RWType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(
					".//ports[(@xsi:type=\"hw:ComplexPort\")]|.//pins[(@xsi:type=\"hw:ComplexPin\")]|/hw:ComplexPort|/hw:ComplexPin");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@direction");
				assertTrue("Unable to set default value (from 1.1.0) of RWType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}

		}

	}

	@Test
	public void verification_SchedType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//networkTypes|/hw:NetworkType");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@schedPolicy");
				assertTrue("Unable to set default value (from 1.1.0) of SchedType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}
		}
	}

	@Test
	public void verification_PinType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//pins[(@xsi:type=\"hw:ComplexPin\")]|/hw:ComplexPin");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@type");
				assertTrue("Unable to set default value (from 1.1.0) of PinType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}

		}

	}

	@Test
	public void verification_FeatureType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//features[(@xsi:type=\"hw:FeatureTypes\")]|/hw:FeatureTypes");

			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (final Element element : elements) {
				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@value");
				assertTrue("Unable to set default value (from 1.1.0) of FeatureType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue() != null);
			}

		}

	}
}
