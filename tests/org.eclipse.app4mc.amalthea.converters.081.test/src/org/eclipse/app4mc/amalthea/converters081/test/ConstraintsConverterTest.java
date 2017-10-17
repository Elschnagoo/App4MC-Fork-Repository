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
package org.eclipse.app4mc.amalthea.converters081.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters081.impl.ConstraintsConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class ConstraintsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles = new String[] { "/eventChain/default.amxmi", "/eventChain/eventChain.amxmi", "/eventChain/democar.amxmi" };


		return Arrays.asList(new Object[][] { { "Models with Constraint Model", true, inputFiles,
				"Migration of Amalthea models containing Constraints Model " } });
	}

	public ConstraintsConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters081.impl.NamespaceConverter.class,
				org.eclipse.app4mc.amalthea.converters081.impl.RootElementConverter.class, ConstraintsConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);

		/* ============= EventChain =================== */

		eventChain_migrationVerification_Case1(document);

		/* ========EventChainSynchronizationConstraints ========== */

		timingConstraints_migrationVerification_Case1(document);

		timingConstraints_migrationVerification_Case2(document);

		timingConstraints_migrationVerification_Case3(document);

		timingConstraints_migrationVerification_Case5(document);


		/* ===========LatencyConstraints ================= */

		timingConstraints_migrationVerification_Case4(document);


		// assertTrue("Model migration of \"OS Model\" element is not successful in model file : " +
		// document.getBaseURI(),
		// elements.size() == 0);

	}


	

	/**
	 * This is the scenario in which EventChainReference element refers to the sub EventChain elements present in
	 * different model file.
	 *
	 * As a part of migration, following points should be considered:<br>
	 * -- sub EventChain references should not be referred anywhere (as it is not valid to have them as per the change
	 * in Metamodel from 0.8.1).<br>
	 * -- Removed reference string of sub eventchain is stored as CustomProperty, inorder to avoid data loss
	 *
	 * @param document
	 */
	private void eventChain_migrationVerification_Case1(final Document document) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//eventChains[ @name=\"eventChain_4\"]");


		final List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (document.getBaseURI().endsWith("eventChain.amxmi")) {

			/*-
			 * EventChain migrated content:
			 *
			 *  <eventChains name="eventChain_4">
					<strands xsi:type="am:EventChainContainer">
						<eventChain name="strands_subeventchain_2" stimulus="label_event_2?type=LabelEvent" response="label_event_1?type=LabelEvent">
									<segments xsi:type="am:EventChainContainer">
										<eventChain name="eventChain_3" />
									</segments>
									<segments xsi:type="am:EventChainContainer">
										<eventChain>
										  <segments xsi:type="am:EventChainReference">
										    <customProperties key="eventChain">
										      <value xsi:type="am:StringObject" value="amlt:/#eventChain_from_second_file_sub_element?type=EventChain" />
										    </customProperties>
										  </segments>
										</eventChain>
									</segments>
							<strands xsi:type="am:EventChainReference" eventChain="eventChain_3?type=EventChain" />
						</eventChain>
					</strands>
			</eventChains>
			 *
			 */

			assertTrue("EventChain element should exists with name : eventChain_4", elements.size() == 1);

			final Element eventChainElement = elements.get(0);

			final Element eventChainReferenceElement = eventChainElement.getChild("strands").getChild("eventChain")
					.getChildren("segments").get(1).getChild("eventChain").getChild("segments");

			/*- verification of EventChain existance inside EventChainReference */

			assertTrue(
					"sub EventChain element still exists inside EventChainReference element (which is not allowed as per 0.8.1), is not migrated",
					eventChainReferenceElement.getChild("eventChain") == null);


			/*- verification of EventChain existance inside EventChainReference */

			assertTrue("Unable to migrate Sub event chain element references as CustomProperty",
					eventChainReferenceElement.getChild("customProperties").getChild("value").getAttributeValue("value")
							.equals("amlt:/#eventChain_from_second_file_sub_element?type=EventChain"));


		}
	}


	/**
	 * This is the scenario in which EventChainSynchronizationConstraint elements refers to two EventChain elements
	 * present in the same file. Among the two EventChain elements, one EventChain is root element and the other one is
	 * sub EventChain.
	 *
	 * As a part of migration, sub EventChain references should be removed from scope (as it is not valid to have them
	 * as per the change in Metamodel from 0.8.1) Removed references are stored as CustomProperties, inorder to avoid
	 * data loss
	 *
	 * @param document
	 */
	private void timingConstraints_migrationVerification_Case1(final Document document) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//timingConstraints[@xsi:type=\"am:EventChainSynchronizationConstraint\" and @name=\"ecc_1\"]");


		final List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (document.getBaseURI().endsWith("eventChain.amxmi")) {

			assertTrue("EventChainSynchronizationConstraint element should exists with name : ecc_1",
					elements.size() == 1);

			final Element eventChainSyncConstraintElement = elements.get(0);

			// "Scope should contains only global EventChain elements. If sub event chain elements are present in the
			// input model, as a part of migration content is converted as CustomProperty",
			assertTrue("Scope contains sub event chain elements (which are not allowed as per 0.8.1)",
					eventChainSyncConstraintElement.getAttributeValue("scope").equals("eventChain_1?type=EventChain"));

			assertTrue("Unable to migrate Sub event chain element references as CustomProperty",
					eventChainSyncConstraintElement.getChild("customProperties").getChild("value").getChild("values")
							.getAttributeValue("value").equals("subeventChain_2?type=EventChain"));

		}
	}


	/**
	 * This is the scenario in which EventChainSynchronizationConstraint elements refers to two EventChain elements
	 * present in the same file. Both the two EventChain elements are sub EventChain's.
	 *
	 * As a part of migration, sub EventChain references should be removed from scope (as it is not valid to have them
	 * as per the change in Metamodel from 0.8.1) Removed references are stored as CustomProperties, inorder to avoid
	 * data loss
	 *
	 * @param document
	 */
	private void timingConstraints_migrationVerification_Case2(final Document document) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//timingConstraints[@xsi:type=\"am:EventChainSynchronizationConstraint\" and @name=\"ecc2\"]");


		final List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (document.getBaseURI().endsWith("eventChain.amxmi")) {

			assertTrue("EventChainSynchronizationConstraint element should exists with name : ecc2",
					elements.size() == 1);

			final Element eventChainSyncConstraintElement = elements.get(0);

			// "Scope should contains only global EventChain elements. If sub event chain elements are present in the
			// input model, as a part of migration content is converted as CustomProperty",
			assertTrue(
					"Scope content is not migrated successfully (In a valid case, scope attribute should be removed as both sub eventchain references are removed)",
					eventChainSyncConstraintElement.getAttribute("scope") == null);

			final List<Element> values = eventChainSyncConstraintElement.getChild("customProperties").getChild("value")
					.getChildren("values");
			assertTrue("Unable to migrate Sub event chain element references as CustomProperty",
					values.get(0).getAttributeValue("value").equals("subeventChain_2?type=EventChain")
							&& values.get(1).getAttributeValue("value").equals("subeventChain_3?type=EventChain"));

		}
	}


	/**
	 * This is the scenario in which EventChainSynchronizationConstraint elements refers to three EventChain elements
	 * two present in the same file and the third EventChain present in different file. Among these three EventChain
	 * elements, one EventChain is a sub EventChain element
	 *
	 * As a part of migration, sub EventChain references should be removed from scope (as it is not valid to have them
	 * as per the change in Metamodel from 0.8.1). Removed references are stored as CustomProperties, inorder to avoid
	 * data loss
	 *
	 * @param document
	 */
	private void timingConstraints_migrationVerification_Case3(final Document document) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//timingConstraints[@xsi:type=\"am:EventChainSynchronizationConstraint\" and @name=\"ecc3\"]");


		final List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (document.getBaseURI().endsWith("eventChain.amxmi")) {

			assertTrue("EventChainSynchronizationConstraint element should exists with name : ecc3",
					elements.size() == 1);

			final Element eventChainSyncConstraintElement = elements.get(0);

			assertTrue(
					"Scope content is not migrated successfully (In a valid case, scope attribute should be removed as both sub eventchain references are removed)",
					eventChainSyncConstraintElement.getChildren("scope").size() == 2);

			final List<Element> values = eventChainSyncConstraintElement.getChild("customProperties").getChild("value")
					.getChildren("values");
			assertTrue("Unable to migrate Sub event chain element references as CustomProperty",
					values.get(0).getAttributeValue("value").equals("amlt:/#subeventChain_2?type=EventChain"));

		}
	}


	/**
	 * This is the scenario in which EventChainLatencyConstraint elements refers to three EventChain elements two
	 * present in the same file and the third EventChain present in different file. Among these three EventChain
	 * elements, one EventChain is a sub EventChain element
	 *
	 * As a part of migration, sub EventChain references should be removed from scope (as it is not valid to have them
	 * as per the change in Metamodel from 0.8.1). Removed references are stored as CustomProperties, inorder to avoid
	 * data loss
	 *
	 * @param document
	 */
	private void timingConstraints_migrationVerification_Case4(final Document document) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//timingConstraints[@xsi:type=\"am:EventChainLatencyConstraint\" and @name=\"ecl1\"]");


		final List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (document.getBaseURI().endsWith("eventChain.amxmi")) {

			assertTrue("EventChainLatencyConstraint element should exists with name : ecl1", elements.size() == 1);

			final Element eventChainLatencyConstraintElement = elements.get(0);

			assertTrue(
					"Scope content is not migrated successfully (In a valid case, scope attribute should be removed as sub eventchain references are removed)",
					eventChainLatencyConstraintElement.getAttribute("scope") == null);

			final List<Element> values = eventChainLatencyConstraintElement.getChild("customProperties")
					.getChild("value").getChildren("values");
			assertTrue("Unable to migrate Sub event chain element references as CustomProperty",
					values.get(0).getAttributeValue("value").equals("strands_subeventchain_2?type=EventChain"));

		}
	}

	
	private void timingConstraints_migrationVerification_Case5(Document document) {

		if(document.getBaseURI().endsWith("democar.amxmi")){
			
			  StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(".//timingConstraints[@xsi:type=\"am:EventChainLatencyConstraint\" and @name=\"a\"]");
			
			  List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
					Element.class, this.helper.getGenericNS("xsi"));
			
			assertTrue("EventChainLatencyConstraint element should exists with name : a", elements.size() == 1);

			  Element eventChainLatencyConstraintElement = elements.get(0);

				 assertTrue("Unable to migrate event chain element references for EventChainLatencyConstraint for element \"a\" - due to failure in encoding of the content",
						 eventChainLatencyConstraintElement.getAttributeValue("scope").equals("Test+1?type=EventChain"));
				 
				 //second criteria

				 xpathBuffer=new StringBuffer();

				 xpathBuffer.append(".//timingConstraints[@xsi:type=\"am:EventChainLatencyConstraint\" and @name=\"d\"]");

				 elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
						 Element.class, this.helper.getGenericNS("xsi"));

				 assertTrue("EventChainLatencyConstraint element should exists with name : d", elements.size() == 1);

				 eventChainLatencyConstraintElement = elements.get(0);

				 assertTrue("Unable to migrate event chain element references for EventChainLatencyConstraint for element \"d\" - due to failure in encoding of the content",
						 eventChainLatencyConstraintElement.getAttributeValue("scope").equals("Test+1?type=EventChain"));
			
			
		}
	}
}
