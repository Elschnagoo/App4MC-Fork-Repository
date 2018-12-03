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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters111.impl.CommonConverter;
import org.eclipse.app4mc.amalthea.converters111.impl.ComponentConverter;
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

public class CustomPropsRefObjectRemovalTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/custprops_refobjs/default.amxmi", true } });
	}

	public CustomPropsRefObjectRemovalTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

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
	public void verificationCustomprops_referenceObjects() {

		parseGeneratedXMLFiles();


		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final StringBuffer xpathBuffer = new StringBuffer();


			/*- verifying Task ref existence in CustomProperty */

			xpathBuffer.append(".//customProperties[@key=\"custKey\"]");


			List<Element> elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
					Element.class, this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));

			for (final Element element : elements) {

				assertTrue("Value is a reference of Task object, and it should not be removed during migration "
						+ document.getBaseURI(), element.getChild("value") != null);
			}

			/*- verifying stimuli ref existence in CustomProperty */
			xpathBuffer.setLength(0);
			xpathBuffer.append(".//customProperties[@key=\"custKey_stimuli\"]");


			elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(), Element.class,
					this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));

			for (final Element element : elements) {

				assertTrue("Value is a reference of Stimuli object, and it should be removed during migration "
						+ document.getBaseURI(), element.getChild("value") == null);
			}


			/*- verifying Tag ref existence in CustomProperty */
			xpathBuffer.setLength(0);

			xpathBuffer.append(".//customProperties[@key=\"custKey_tag\"]");


			elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(), Element.class,
					this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));

			for (final Element element : elements) {

				assertTrue("Value is a reference of Tag object, and it should not be removed during migration "
						+ document.getBaseURI(), element.getChild("value") != null);
			}

			/*- verifying AMALTHEA ref existence in CustomProperty */
			xpathBuffer.setLength(0);

			xpathBuffer.append(".//customProperties[@key=\"custKey_amalthea_1\"]");
			xpathBuffer.append("|");
			xpathBuffer.append(".//customProperties[@key=\"custKey_amalthea_2\"]");


			elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(), Element.class,
					this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));

			for (final Element element : elements) {

				assertTrue("Value is a reference of AMALTHEA object, and it should be removed during migration "
						+ document.getBaseURI(), element.getChild("value") == null);
			}

			/*- verifying AbstractProcess ref existence in CustomProperty */
			xpathBuffer.setLength(0);

			xpathBuffer.append(".//customProperties[@key=\"custKey_abstractProcess\"]");


			elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(), Element.class,
					this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));

			for (final Element element : elements) {

				assertTrue(
						"Value is a reference of AbstractProcess (i.e. either ProcessPrototype or Task or ISR object), and it should not be removed during migration "
								+ document.getBaseURI(),
						element.getChild("value") != null);
			}

			/*- verifying if removal of elements which are not implementing ReferableBaseObjects are successful inside CustomProperty custKey_group_refobjs
			 *
			 * Note: List consists of following elements
			 *
			 * 1.AMALTHEA object
			 * 2.Task object
			 * 3.Hardware object
			 * 4.Tag object
			 *
			 *
			 * Below is the content from model file:
			 *
			 * 	<customProperties xmi:id="_NaacUBhfEea3AoorCOXNXA" key="custKey_group_refobjs">
			 *         <	 xsi:type="common:ListObject" xmi:id="_8b8TkBhfEea3AoorCOXNXA">
			 *           <values xsi:type="common:ReferenceObject" xmi:id="_912FwBhfEea3AoorCOXNXA">
			 *             <value href="default1.amxmi#_l6kzYNotEeWXsaNW2kxe8A"/>
			 *           </values>
			 *           <values xsi:type="common:ReferenceObject" xmi:id="__kW2ABhfEea3AoorCOXNXA">
			 *             <value href="default1.amxmi#_nDgKUNotEeWXsaNW2kxe8A"/>
			 *           </values>
			 *           <values xsi:type="common:ReferenceObject" xmi:id="__s_0oBhfEea3AoorCOXNXA" value="_TmR8oNotEeWXsaNW2kxe8A"/>
			 *           <values xsi:type="common:ReferenceObject" xmi:id="__0BpsBhfEea3AoorCOXNXA">
			 *      <value href="default1.amxmi#_6PbocBhOEea3AoorCOXNXA"/>
			 *    </values>
			 *  </value>
			 * /customProperties>
			 *
			 *  */
			xpathBuffer.setLength(0);
			xpathBuffer.append(".//customProperties[@key=\"custKey_group_refobjs\"]");


			elements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(), Element.class,
					this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));

			for (final Element element : elements) {

				final Element child = element.getChild("value");

				assertTrue("Value of group custproperty should not be null", child != null);

				final List<Element> children = child.getChildren();

				final Map<String, Element> id_childElementsMap = new HashMap<String, Element>();

				for (final Element valuesElement : children) {
					id_childElementsMap.put(valuesElement.getAttributeValue("id", this.helper.getGenericNS("xmi")),
							valuesElement);
				}

				/*- ref to AMALTHEA object should be removed */
				if (id_childElementsMap.containsKey("_8b8TkBhfEea3AoorCOXNXA")) {

					assertTrue(
							"Value is a reference of AMALTHEA object, and it should be removed during migration "
									+ document.getBaseURI(),
							id_childElementsMap.get("_8b8TkBhfEea3AoorCOXNXA") == null);
				}

				/*- ref to Task object should be removed */
				if (id_childElementsMap.containsKey("__kW2ABhfEea3AoorCOXNXA")) {

					assertTrue(
							"Value is a reference of Task object, and it should not be removed during migration "
									+ document.getBaseURI(),
							id_childElementsMap.get("__kW2ABhfEea3AoorCOXNXA") != null);
				}


				/*- ref to Hardware object should be removed */
				if (id_childElementsMap.containsKey("__s_0oBhfEea3AoorCOXNXA")) {

					assertTrue(
							"Value is a reference of Hardware object, and it should be removed during migration "
									+ document.getBaseURI(),
							id_childElementsMap.get("__s_0oBhfEea3AoorCOXNXA") == null);
				}

				/*- ref to Tag object should be removed */
				if (id_childElementsMap.containsKey("__0BpsBhfEea3AoorCOXNXA")) {

					assertTrue(
							"Value is a reference of Tag object, and it should not be removed during migration "
									+ document.getBaseURI(),
							id_childElementsMap.get("__0BpsBhfEea3AoorCOXNXA") != null);
				}

			}


		}

	}


}

