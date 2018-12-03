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
import org.eclipse.app4mc.amalthea.converters111.impl.ComponentConverter;
import org.eclipse.app4mc.amalthea.converters111.impl.SwConverter;
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
public class SwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/sw/sw_cns.amxmi", true } });
	}

	public SwConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class, SwConverter.class, ComponentConverter.class);
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

	@Test
	public void verification_label_initialValue() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying Task ref existence in CustomProperty */


			final List<Element> elements = getXpathResult(document.getRootElement(), ".//labels");


			for (final Element element : elements) {

				final List<Attribute> initialValues = getXpathResult_Attributes(element, "./@initialValue");

				assertTrue("Unable to migrate initialValue of Label element : " + element.getAttributeValue("name"),
						initialValues.size() == 0);


			}

		}

	}

	@Test
	public void verification_WaitEventType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying existance of enum WaitEventType  */


			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//tasks[@name=\"t1\"]//calls[(@xsi:type=\"sw:WaitEvent\") ]");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@maskType");

				assertTrue("Unable to create WaitEventType enum attribute maskType for Process object : t1",
						attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for WaitEventType enum attribute maskType in Process object : t1",
						attributes.get(0).getValue().equals("AND"));


			}

		}

	}


	@Test
	public void verification_AccessPrecedenceType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying existance of enum WaitEventType  */


			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//processPrototypes[@name=\"test\"]/accessPrecedenceSpec");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@orderType");

				assertTrue(
						"Unable to create AccessPrecedenceType enum attribute orderType for ProcessPrototype object : test",
						attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for AccessPrecedenceType enum attribute orderType in ProcessPrototype object : test",
						attributes.get(0).getValue().equals("ignoreWR"));


			}

		}

	}

	@Test
	public void verification_OrderType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying existance of enum WaitEventType  */


			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//processPrototypes[@name=\"test\"]/orderPrecedenceSpec");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@orderType");

				assertTrue("Unable to create OrderType enum attribute orderType for ProcessPrototype object : test",
						attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for OrderType enum attribute orderType in ProcessPrototype object : test",
						attributes.get(0).getValue().equals("order"));


			}

		}

	}

	@Test
	public void verification_LabelAccess() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying existance of enum WaitEventType  */


			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//runnables[@name=\"R1\"]/runnableItems[@xsi:type=\"sw:LabelAccess\"]");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@access");

				assertTrue("Unable to create LabelAccess enum attribute access for Runnable object : R1",
						attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for LabelAccess enum attribute access in Runnable object : R1",
						attributes.get(0).getValue().equals("read"));


			}

		}

	}

	@Test
	public void verification_SemaphoreAccessEnum() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			/*- verifying existance of enum WaitEventType  */


			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//runnables[@name=\"R1\"]/runnableItems[@xsi:type=\"sw:SemaphoreAccess\"]");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@accessEnum");

				assertTrue("Unable to create SemaphoreAccess enum attribute accessEnum for Runnable object : R1",
						attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for SemaphoreAccess enum attribute accessEnum in Runnable object : R1",
						attributes.get(0).getValue().equals("request"));


			}

		}

	}

	@Test
	public void verification_Preemption() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//tasks[@name=\"t1\"]|.//processPrototypes[@name=\"test\"]");


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@preemption");

				assertTrue("Unable to create Preemption enum attribute preemption for ProcessPrototype/Task object : "
						+ element.getAttributeValue("name"), attributes.size() >= 0);
				assertTrue(
						"Unable to set default value (from 1.1.0) for Preemption enum attribute preemption in ProcessPrototype/Task object : "
								+ element.getAttributeValue("name"),
						attributes.get(0).getValue().equals("cooperative"));


			}

		}

	}

	@Test
	public void verification_ModeLabel_ModeEntries() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			List<Element> elements = getXpathResult(document.getRootElement(), ".//modeLabels[@name=\"RL\"]");

			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("sw_cns.amxmi")) {
				assertTrue("Unable to migrate the data of LabelSwitch to Mode Label " + baseURI, elements.size() >= 1);
			}


			elements = getXpathResult(document.getRootElement(), ".//modes[@name=\"mode_sw_0_migration_generated\"]");


			for (final Element element : elements) {

				this.logger.info("Printing contents of : .//modes[@name=\"mode_sw_0_migration_generated\"]");

				this.logger.info("Mode object found in document : " + element.getDocument().getBaseURI());

				this.logger.info("Total mode literals found are : " + element.getChildren("literals").size());

				assertTrue("Unable to migrate the data of LabelSwitchEntry to Mode Literals ",
						element.getChildren("literals").size() >= 0);


			}

		}

	}


	@Test
	public void verification_deadline_attribute_removal() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			List<Element> elements = getXpathResult(document.getRootElement(), ".//tasks|.//isrs|.//processPrototypes");

			for (final Element element : elements) {

				/*- Step1 : verifying if deadline tag is inside the given element */
				assertTrue(
						"Unable to migrate \"deadline\" value inside Process/ProcessPrototype element : "
								+ element.getAttributeValue("name"),
						getXpathResult(element, ".//deadline").size() == 0);
			}

			/*- Step 2: fetching contents from Constraints model and checking if the corresponding values of deadline are migrated */

			elements = getXpathResult(document.getRootElement(),
					".//requirements[@xsi:type=\"constraints:ProcessRequirement\"]");

			final String baseURI = document.getBaseURI();

			if (baseURI.endsWith("sw_cns.amxmi")) {
				assertTrue(
						"migration not complete, as it is mandatory to create three ProcessRequirement object in model file : "
								+ baseURI,
						elements.size() >= 3);
			}

			for (final Element element : elements) {
				final String name = element.getAttributeValue("name");
				final Element limit = element.getChild("limit");
				String limitType = "";
				String metric = "";
				String unit = "";
				String value = "";

				if (limit != null) {

					limitType = limit.getAttributeValue("limitType");
					metric = limit.getAttributeValue("metric");
					final Element limitValue = limit.getChild("limitValue");
					if (limitValue != null) {
						unit = limitValue.getAttributeValue("unit");
						value = limitValue.getAttributeValue("value");
					}
				}


				if (name != null && name.equals("ISR1")) {

					assertTrue(
							"migration is not fully completed, as deadline value is not converted into ProcessRequirement for element : "
									+ name,
							limitType.equals("UpperLimit") && metric.equals("ResponseTime") && unit.equals("ps")
									&& value.equals("0"));

				}
				else if (name != null && name.equals("t1")) {


					assertTrue(
							"migration is not fully completed, as deadline value is not converted into ProcessRequirement for element : "
									+ name,
							limitType.equals("UpperLimit") && metric.equals("ResponseTime") && unit.equals("ns")
									&& value.equals("22"));


				}
				else if (name != null && name.equals("test")) {


					assertTrue(
							"migration is not fully completed, as deadline value is not converted into ProcessRequirement for element : "
									+ name,
							limitType.equals("UpperLimit") && metric.equals("ResponseTime") && unit.equals("ps")
									&& value.equals("50"));


				}


			}

		}


	}


}
