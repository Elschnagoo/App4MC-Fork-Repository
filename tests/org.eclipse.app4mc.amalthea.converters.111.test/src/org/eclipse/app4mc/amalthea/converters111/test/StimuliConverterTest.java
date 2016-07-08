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
import org.eclipse.app4mc.amalthea.converters111.impl.StimuliConverter;
import org.eclipse.app4mc.amalthea.converters111.impl.SwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class StimuliConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(
				new Object[][] { { "/stimuli/stimuli_2.amxmi", true }, { "/stimuli/modes/central.amxmi", true } });
	}

	public StimuliConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class, StimuliConverter.class, SwConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}


	@Test
	public void verification_setLabelsList() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying Task ref existence in CustomProperty */

			List<Element> elements = getXpathResult(document.getRootElement(), ".//stimuli/setLabelsList");

			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("stimuli_2.amxmi")) {
				assertTrue("Unable to migrate tag \"setLabelsList\" present in Stimuli model", elements.size() == 0);
			}

			elements = getXpathResult(document.getRootElement(), ".//stimuli[@name=\"PeriodicElement\"]");

			for (final Element element : elements) {
				elements = getXpathResult(element, "./setModeValueList/entries");

				assertTrue(
						"Unable to migrate tag \"setLabelsList--> entries \"  present inside Stimuli : PeriodicElement",
						elements.size() > 0);

			}


		}


	}

	@Test
	public void verification_enablingLabelsList() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying Task ref existence in CustomProperty */

			List<Element> elements = getXpathResult(document.getRootElement(), ".//stimuli/enablingLabelsList");

			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("stimuli_2.amxmi")) {
				assertTrue("Unable to migrate tag \"enablingLabelsList\" present in Stimuli model",
						elements.size() == 0);
			}

			elements = getXpathResult(document.getRootElement(), ".//stimuli[@name=\"PeriodicElement\"]");

			for (final Element element : elements) {

				assertTrue(
						"Unable to migrate tag \"enablingLabelsList--> entries \"  present inside Stimuli : PeriodicElement",
						getXpathResult(element, "./enablingModeValueList/entries").size() > 0);

			}

		}

	}

	@Test
	public void verification_disablingLabelsList() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying Task ref existence in CustomProperty */

			List<Element> elements = getXpathResult(document.getRootElement(), ".//stimuli/disablingLabelsList");

			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("stimuli_2.amxmi")) {
				assertTrue("Unable to migrate tag \"disablingLabelsList \" present in Stimuli model",
						elements.size() == 0);
			}

			elements = getXpathResult(document.getRootElement(), ".//stimuli[@name=\"PeriodicElement\"]");

			for (final Element element : elements) {

				assertTrue(
						"Unable to migrate tag \"disablingModeValueList  --> entries \"  present inside Stimuli : PeriodicElement",
						getXpathResult(element, "./disablingModeValueList/entries").size() > 0);

			}


		}


	}


	@Test
	public void verification_modeLabels_modeLiterals() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying Task ref existence in CustomProperty */


			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("stimuli_2.amxmi")) {
				List<Element> elements = getXpathResult(document.getRootElement(), ".//swModel/modes");

				assertTrue(
						"Unable to create Modes (and its corresponding literals) based on label references inside Stimuli elements  ",
						elements.size() > 0);

				assertTrue(
						"Unable to migrate Label literals present in Stimuli (PeriodicElement) as Modes (and its corresponding literals)  ",
						getXpathResult(elements.get(0), "./literals").size() > 0);

				elements = getXpathResult(document.getRootElement(), ".//swModel/modeLabels");

				assertTrue("Unable to create ModeLabels based on label references inside Stimuli elements  ",
						elements.size() > 0);

			}

		}


	}

}
