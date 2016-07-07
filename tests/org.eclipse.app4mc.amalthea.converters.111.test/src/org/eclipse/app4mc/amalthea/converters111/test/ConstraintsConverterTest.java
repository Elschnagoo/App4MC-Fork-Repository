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
import org.eclipse.app4mc.amalthea.converters111.impl.ConstraintsConverter;
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
public class ConstraintsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/constraints/Constraints.amxmi", true } });
	}

	public ConstraintsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	
	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class,ConstraintsConverter.class);
	}
	
	@Test
	public void verification(){ 
		super.verification();
	}
	
	

 
	
	@Test
	public void verification_maximumCyle(){

		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {

			/*- verifying Task ref existence in CustomProperty */

			List<Element> elements = getXpathResult(document.getRootElement(), ".//dataAge[@xsi:type=\"constraints:DataAgeCycle\" and @xmi:id=\"_KUT7oMadEeWBM6uFowTedA\"]");

			for (Element element : elements) {
				
				List<Attribute> tagNames = getXpathResult_Attributes(element, "./@maximumCycle");
					
					assertTrue("Unable to migrate tag name attributes", tagNames.size()>0);
				

			}

		}
		
	
	}
	
	@Test
	public void verification_RunnableOrderType(){

		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {

			List<Element> elements = getXpathResult(document.getRootElement(), ".//runnableSequencingConstraints");
			

			for (Element element : elements) {
				
				List<Attribute> attributes = getXpathResult_Attributes(element, "./@orderType");
					
					assertTrue("Unable to create RunnableOrderType enum attribute orderType for RunnableSequencingConstraint object ", attributes.size()>=0  );
					assertTrue("Unable to set default value (from 1.1.0) for RunnableOrderType enum attribute orderType in RunnableSequencingConstraint object",  attributes.get(0).getValue().equals("successor"));
				

			}

		}
		
	}
	
	@Test
	public void verification_RunnableGroupingType(){

		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {

			List<Element> elements = getXpathResult(document.getRootElement(), ".//runnableGroups");
			

			for (Element element : elements) {
				
				List<Attribute> attributes = getXpathResult_Attributes(element, "./@groupingType");
					
					assertTrue("Unable to create RunnableGroupingType enum attribute groupingType for ProcessRunnableGroup object ", attributes.size()>=0  );
					assertTrue("Unable to set default value (from 1.1.0) for RunnableGroupingType enum attribute groupingType in ProcessRunnableGroup object",  attributes.get(0).getValue().equals("allOfThem"));
				

			}

		}
		
	}
}
