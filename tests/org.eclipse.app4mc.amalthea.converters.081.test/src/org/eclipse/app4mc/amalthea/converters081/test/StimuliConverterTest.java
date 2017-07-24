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
import org.eclipse.app4mc.amalthea.converters081.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.MappingConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.StimuliConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.SwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class StimuliConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles = new String[] { "/stimuli/stimuli.amxmi" };

		final String[] inputFiles_stimuli = new String[] { "/stimuli_event/eventModel.amxmi", "/stimuli_event/eventStimulus.amxmi"  };




		return Arrays.asList(new Object[][] {
			{ "Models with Stimuli Model (Containing ModeValueListEntry elements)", true, inputFiles, "Migration of Amalthea models containing Stimuli model(Containing ModeValueListEntry elements) " } ,

			{ "Models with Stimuli Model (Containing EventStimulus elements)", true, inputFiles_stimuli, "Migration of Amalthea models containing Stimulus model(Containing EventStimulus elements) " }
			
			  
		});
	}

	public StimuliConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters081.impl.NamespaceConverter.class,
				org.eclipse.app4mc.amalthea.converters081.impl.RootElementConverter.class, ConstraintsConverter.class,
				HwConverter.class, SwConverter.class, MappingConverter.class, StimuliConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);

		/*-------------- Case 1 -----------------*/
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./stimuliModel/stimuli/setModeValueList/entries[@xsi:type=\"am:ModeValue\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./stimuliModel/stimuli/enablingModeValueList/entries[@xsi:type=\"am:ModeValue\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./stimuliModel/stimuli/disablingModeValueList/entries[@xsi:type=\"am:ModeValue\"]");

		final List<Element> abstractProcessElements = this.helper.getXpathResult(document.getRootElement(),
				xpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));

		if(document.getBaseURI().endsWith("stimuli.amxmi")){
			assertTrue( "Unable to migrate Stimul model containing ModeValueListEntry elements " , abstractProcessElements.size()==4);
		}

		/*-------------- Case 2 -----------------*/

		final StringBuffer xpathBuffer_eventStimulus = new StringBuffer();

		xpathBuffer_eventStimulus.append("./stimuliModel/stimuli[@xsi:type=\"am:EventStimulus\"]");
		
		final List<Element> eventStimulusElements = this.helper.getXpathResult(document.getRootElement(),
				xpathBuffer_eventStimulus.toString(), Element.class, this.helper.getGenericNS("xsi"));

		for (Element eventStimulusElement : eventStimulusElements) {
			
			boolean migStatus_eventStimulus=(eventStimulusElement.getAttribute("trigger") ==null) ||(eventStimulusElement.getChildren("trigger").size()==0);
			
			assertTrue( "Unable to migrate Stimul model containing EventStimulus elements " , migStatus_eventStimulus);
			
			
			 
		}
		
	}


}
