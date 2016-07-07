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

import org.eclipse.app4mc.amalthea.converters110.impl.OsConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class OsConverterTest extends AbstractConverterTest {


	public OsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {
		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/Os/schedulers/schedulers.amxmi-os", true }, { "/Os/Amalthea_ArExampleEngine-os.amxmi", true }  });
	}

	@Test
	public void testConverter() {
		
		super.testConversion( OsConverter.class );

	}
	
	@Test
	public void verification(){ 
		super.verification();
		
	}
	
	
 
	
	@Test
	public void verificiation_OSModel_Contents(){


		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {



			/*- verifying Task ref existence in CustomProperty */


			List<Element> elements = getXpathResult(document.getRootElement(), ".//operatingSystems");
			

			for (Element element : elements) {
				
				List<Element> taskSchedulers = getXpathResult(element, "./taskSchedulers");
				
				assertTrue("Unable to convert Scheduler objects to task schedulers", taskSchedulers.size()>=2);

			}

		}
		
	
	}
	
	
	@Test
	public void verificiation_OSModel_DeadlineMonotonic(){


		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {

			/*- verifying Task ref existence in CustomProperty */

			List<Element> elements = getXpathResult(document.getRootElement(), ".//operatingSystems");
			

			for (Element element : elements) {
				
				List<Element> taskSchedulers = getXpathResult(element, "./taskSchedulers[@name=\"Scheduler5\"]");
				
				if(taskSchedulers.size()>0){
					
					 String attributeValue = taskSchedulers.get(0).getChild("schedulingAlgorithm").getAttributeValue("type",helper.getGenericNS("xsi"));
					 
					 assertTrue("Unable to convert DeadlineMonotinic type to DeadlineMonotonic", attributeValue.equals("os:DeadlineMonotonic"));
					 
					
				}
				

			}

		}
		
	
	}
	
}
