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

package org.eclipse.app4mc.amalthea.converters091.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters091.impl.NamespaceConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class CustomPropertiesConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/customproperties/model.amxmi", true } });
	}

	public CustomPropertiesConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}


	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//value[@xsi:type=\"am:TimeObject\"]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//values[@xsi:type=\"am:TimeObject\"]");
		
		
		final List<Element> elements = this.helper.getXpathResult(document.getRootElement(),
				xpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));

			assertTrue( "CustomProperties migration to 0.9.1 is not successful" , elements.size()>0);
		
			 

	}
}
