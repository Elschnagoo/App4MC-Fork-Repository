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

package org.eclipse.app4mc.amalthea.converters071.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters071.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.PropertyConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.SwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class Sw_SectionConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}")
	public static Collection<Object[]> getTestData() {


		final String[] inputFiles = new String[] { "/sw.sections/1.amxmi", "/sw.sections/2.amxmi",
				"/sw.sections/3.amxmi" };

		return Arrays.asList(new Object[][] { { "Sections-Constraints-Conversion : 1", true, inputFiles } });
	}

	public Sw_SectionConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(RootElementConverter.class, NamespaceConverter.class, SwConverter.class, HwConverter.class,
				PropertyConstraintsConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();

		verify_MemoryElement_Section_data();

		verify_Section_data();

		verify_SectionMapping_data();

		verify_SectionMappingConstraints_data();
	}

	/**
	 * This method is used to verify if the SectionMappingConstraint data elements are removed based on the model
	 * migration step
	 */
	private void verify_SectionMappingConstraints_data() {


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();


			final StringBuffer xpathBuffer = new StringBuffer();


			xpathBuffer
					.append("./propertyConstraintsModel/mappingConstraints[@xsi:type=\"am:SectionMappingConstraint\"]");

			final List<Element> sectionMappingElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

			if (sectionMappingElements != null && sectionMappingElements.size() > 0) {
				Assert.assertTrue(
						"SectionMappingConstraints data is not migrated completely.. and is not valid as per 0.7.1",
						false);
			}

		}


	}

	/**
	 * This method is used to verify if there exists SectionMapping elements inside the Mapping model <br>
	 * As per Model Migration to 0.7.1 : All the SectionMapping elements should be removed from the Mapping Model
	 */
	private void verify_SectionMapping_data() {


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();


			final StringBuffer xpathBuffer = new StringBuffer();


			xpathBuffer.append("./mappingModel/mapping[@xsi:type=\"am:SectionMapping\"]");

			final List<Element> sectionMappingElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getGenericNS("xsi"), this.helper.getNS_071("am"));

			if (sectionMappingElements != null && sectionMappingElements.size() > 0) {
				Assert.assertTrue("SectionMapping data is not migrated completely.. and is not valid as per 0.7.1",
						false);
			}

		}


	}

	/**
	 * This method is used to verify if the section content is migrated successfully
	 */
	private void verify_Section_data() {

		boolean checkData = false;

		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement, ".//swModel/sections",
					Element.class, this.helper.getNS_071("am"));


			for (final Element element : xpathResult) {

				checkData = true;

				final List<Element> labels = element.getChildren("labels");
				final List<Element> runnables = element.getChildren("runEntities");
				final Element dataSize = element.getChild("size");

				if (labels.size() > 0 || runnables.size() > 0 || dataSize != null) {
					Assert.assertTrue("Section " + element.getAttributeValue("name")
							+ " is not migrated completely.. and is not valid as per 0.7.1", false);
				}

			}

		}
		Assert.assertTrue("No section info found in the provided test data", checkData);
	}

	/**
	 * This method is used to verify whether model migration of Section content is successful i.e. valid section is
	 * associated to Label/Runnable elements
	 */

	public void verify_MemoryElement_Section_data() {

		final Map<String, String> label_ExpectedSectionMap = new HashMap<String, String>();

		label_ExpectedSectionMap.put("label1", "Section1");
		label_ExpectedSectionMap.put("label2", "Section2");
		label_ExpectedSectionMap.put("label3", "Section6");
		label_ExpectedSectionMap.put("label6", "Section6");


		for (final String memoryelementName : label_ExpectedSectionMap.keySet()) {

			boolean checkData = false;

			for (final Document document : this.fileName_documentsMap.values()) {

				final Element rootElement = document.getRootElement();

				final List<Element> xpathResult = this.helper.getXpathResult(rootElement,
						".//swModel/labels[@name=\"" + memoryelementName + "\"]", Element.class,
						this.helper.getNS_071("am"));

				if (xpathResult.size() > 0) {

					checkData = true;
					final Element element = xpathResult.get(0);


					if (!((memoryelementName.equals("label6")) || (memoryelementName.equals("label1"))
							|| (memoryelementName.equals("label2")))) {

						final Element child = element.getChild("section");

						if (!(child != null && child.getAttributeValue("href").equals(
								"amlt:/#" + label_ExpectedSectionMap.get(memoryelementName) + "?type=Section"))) {
							org.junit.Assert.assertTrue("Migration is not valid for Label : " + memoryelementName
									+ ", as the correponding Section : "
									+ label_ExpectedSectionMap.get(memoryelementName) + " is not associated to it",
									false);
						}
					}
					else {
						/*-
						 * This is a case where label and section are defined in the same file
						 *  e.g: label6 is a special case -> as both Section6 and label6 are defined in the same file
						 */

						final String attributeValue = element.getAttributeValue("section");

						org.junit.Assert.assertTrue(
								"Migration is not valid for Label : " + memoryelementName
										+ ", as the correponding Section : "
										+ label_ExpectedSectionMap.get(memoryelementName) + " is not associated to it",
								attributeValue
										.equals(label_ExpectedSectionMap.get(memoryelementName) + "?type=Section"));

					}


				}
			}

			Assert.assertTrue(
					"Label : " + memoryelementName
							+ " is not found in the migrated data. Unable to test the migration of section information",
					checkData);
		}

	}


}
