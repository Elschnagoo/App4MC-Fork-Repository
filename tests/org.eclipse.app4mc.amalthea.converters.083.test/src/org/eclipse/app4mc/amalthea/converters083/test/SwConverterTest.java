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

package org.eclipse.app4mc.amalthea.converters083.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters083.impl.ComponentModelConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters083.impl.SwConverter;
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

		return Arrays.asList(new Object[][] { { "/sw/model.amxmi", true } });
	}

	public SwConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, RootElementConverter.class, ComponentModelConverter.class, SwConverter.class );
	}


	@Override
	@Test
	public void verification() {
		super.verification();
		
	}
	
	@Override
	protected void namespaceVerification(Document document) {
		// TODO Auto-generated method stub
		super.namespaceVerification(document);
	}
  @Override
protected void modelFileVerificationHook(Document document) {

	  super.modelFileVerificationHook(document);
	  
		
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//*[(@xsi:type=\"am:ModeSwitch\")  ]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//*[(@xsi:type=\"am:RunnableModeSwitch\")  ]");
		
		final List<Element> modeSwitchElements = this.helper.getXpathResult(document.getRootElement(), xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element element : modeSwitchElements) {
			
			if(element.getAttribute("valueProvider")!=null) {
				assertTrue("Model migration of ModeSwitch elements is not successful in model file : "
						+ document.getBaseURI(), false);
				
			}
		}

		
	
}

}

