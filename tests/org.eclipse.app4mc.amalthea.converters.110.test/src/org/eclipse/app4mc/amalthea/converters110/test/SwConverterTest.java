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
package org.eclipse.app4mc.amalthea.converters110.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters110.impl.MappingConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.OsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.SwConverter;
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

		return Arrays.asList(new Object[][] { { "/sw/sw.amxmi", true } });
	}

	public SwConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConverter() {
		
		super.testConversion(OsConverter.class,MappingConverter.class, SwConverter.class);

	}
	
	@Test
	public void verification(){ 
		super.verification();
		
	}
	
	
	@Test
	public void verificiation_LabelAccessStatistic_Contents(){


		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {



			/*- verifying Task ref existence in CustomProperty */


			List<Element> elements = getXpathResult(document.getRootElement(), ".//swModel");
			

			for (Element element : elements) {
				
				List<Element> statistics = getXpathResult(element, "./runnables[@name=\"R1\"]/runnableItems[@access=\"write\"]/statistic ");
				
				if(statistics.size()>0){
					
					/*
					 *  <statistic xmi:id="_-kM1gJNVEeWQC6k3Y09j_A">
          			 *			<value xsi:type="common:MinAvgMaxStatistic" xmi:id="_IRk5wJNWEeWQC6k3Y09j_A" avg="1" max="2" />
          			 *		<cacheMisses xsi:type="common:MinAvgMaxStatistic" xmi:id="_HSrBgJNWEeWQC6k3Y09j_A" min="8" avg="-1" max="5" />
        			 *  </statistic>
					 */

					Element valueElement = statistics.get(0).getChild("value");
					
					assertTrue("Unable to migrate \"write\" tag to \"value\" tag ", valueElement!=null);

					String avgAttribute = valueElement.getAttributeValue("avg");

					String maxAttribute = valueElement.getAttributeValue("max");
					
					assertTrue("Unable to migrate the contents of write tag ", (avgAttribute.equals("1")&& maxAttribute.equals("2")));
					
					Element cacheMisses = statistics.get(0).getChild("cacheMisses");
					
					assertTrue("Unable to migrate readCacheMisses tag to cacheMisses", (cacheMisses!=null));
					
					
				}
				

			}

		}
		
	
	}
	
}
