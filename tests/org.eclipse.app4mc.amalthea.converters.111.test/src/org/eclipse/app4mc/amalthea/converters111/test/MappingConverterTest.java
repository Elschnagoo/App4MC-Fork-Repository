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
import org.eclipse.app4mc.amalthea.converters111.impl.MappingConverter;
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
public class MappingConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/mapping/mapping.amxmi", true },
				{ "/mapping/default.amxmi-mapping", true } });
	}

	public MappingConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class,MappingConverter.class);
	}
	
	@Test
	public void verification(){ 
		super.verification();
	}
	
	
	@Test
	public void verification_MemoryAddressMappingType(){

		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {
			
			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer
			.append(".//mappingModel|/mapping:MappingModel");
 
			List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());

			for (Element element : elements) {
				List<Attribute> attributes = getXpathResult_Attributes(element, "./@addressMappingType");
					assertTrue("Unable to set default value (from 1.1.0) of MemoryAddressMappingType for element having tag name : "+element.getName(),  attributes.get(0).getValue()!=null);
			}

		}
		
	}
}
