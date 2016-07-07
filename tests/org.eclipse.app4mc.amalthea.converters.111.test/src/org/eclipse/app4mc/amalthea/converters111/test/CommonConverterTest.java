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
import org.eclipse.app4mc.amalthea.converters111.impl.HwConverter;
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
public class CommonConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/common/constraints.amxmi", true },
				{ "/common/default.amxmi-hw", true }, { "/common/default.amxmi-mapping", true },
				{ "/common/default.amxmi-os", true }, { "/common/default_bus.amxmi-hw", true },
				{ "/common/default_complexpin.amxmi-hw", true }, { "/common/default_complexport.amxmi-hw", true },
				{ "/common/default_featuretypes.amxmi-hw", true }, { "/common/default_memtype.amxmi-hw", true },
				{ "/common/default_networktype.amxmi-hw", true }, { "/common/default_quartz.amxmi-hw", true },
				{ "/common/default_runnable.amxmi-sw", true }, { "/common/hw.amxmi", true },
				{ "/common/mapping.amxmi", true }, { "/common/os.amxmi", true }, { "/common/stimuli.amxmi", true },
				{ "/common/sw.amxmi", true } });
	}

	public CommonConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class,HwConverter.class);
	}
	
	@Test
	public void verification(){ 
		super.verification();
	}
	
 
	
	@Test
	public void verification_TimeUnit(){

		parseGeneratedXMLFiles();

		Collection<Document> values = this.fileName_documentsMap.values();
		
		for (Document document : values) {
			
			final StringBuffer timeXpathBuffer = new StringBuffer();

			timeXpathBuffer.append(
					".//timingConstraints[(@xsi:type=\"constraints:SynchronisationConstraint\")]/tolerance");
			timeXpathBuffer.append("|");
			timeXpathBuffer
					.append(".//timingConstraints[(@xsi:type=\"constraints:ReactionConstraint\")]/minimum");
			timeXpathBuffer.append("|");
			timeXpathBuffer
					.append(".//timingConstraints[(@xsi:type=\"constraints:ReactionConstraint\")]/maximum");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:DelayConstraint\")]/upper");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:DelayConstraint\")]/lower");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:AgeConstraint\")]/maximum");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//timingConstraints[(@xsi:type=\"constraints:AgeConstraint\")]/minimum");
			timeXpathBuffer.append("|");
			timeXpathBuffer
					.append(".//timingConstraints[(@xsi:type=\"constraints:RepetitionConstraint\")]/lower");
			timeXpathBuffer.append("|");
			timeXpathBuffer
					.append(".//timingConstraints[(@xsi:type=\"constraints:RepetitionConstraint\")]/upper");
			timeXpathBuffer.append("|");
			timeXpathBuffer
					.append(".//timingConstraints[(@xsi:type=\"constraints:RepetitionConstraint\")]/jitter");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(
					".//dataAgeConstraints/dataAge[(@xsi:type=\"constraints:DataAgeTime\")]/minimumTime");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(
					".//dataAgeConstraints/dataAge[(@xsi:type=\"constraints:DataAgeTime\")]/maximumTime");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//schedulingUnit[(@xsi:type=\"os:SchedulingHWUnit\")]/delay");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//stimuli[(@xsi:type=\"stimuli:Periodic\")]/offset");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//stimuli[(@xsi:type=\"stimuli:Periodic\")]/recurrence");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/min");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/max");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/deadline");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:Periodic\")]/offset");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:SingleActivation\")]/min");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//activations[(@xsi:type=\"sw:SingleActivation\")]/max");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//stimuli[(@xsi:type=\"stimuli:Single\")]/activation");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(
					".//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/arrivalCurveEntries/lowerTimeBorder");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(
					".//stimuli[(@xsi:type=\"stimuli:ArrivalCurve\")]/arrivalCurveEntries/upperTimeBorder");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockTriangleFunction\")]/period");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockSinusFunction\")]/period");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockMultiplierList\")]/entries/time");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//runnables/deadline|/sw:Runnable/deadline");
			timeXpathBuffer.append("|");
			timeXpathBuffer.append(".//schedulingUnit[(@xsi:type=\"sw:SchedulingSWUnit\")]/runnable/deadline");

 
			List<Element> elements = getXpathResult(document.getRootElement(), timeXpathBuffer.toString());

			for (Element element : elements) {
				List<Attribute> attributes = getXpathResult_Attributes(element, "./@unit");
					assertTrue("Unable to set default value (from 1.1.0) of TimeUnit for element having tag name : "+element.getName(),  attributes.get(0).getValue()!=null);
			}

			
			final StringBuffer signedTimeXpathBuffer = new StringBuffer();
			signedTimeXpathBuffer
					.append(".//stimuli/stimulusDeviation/lowerBound[(@xsi:type=\"common:SignedTime\") ]");
			signedTimeXpathBuffer.append("|");
			signedTimeXpathBuffer
					.append(".//stimuli/stimulusDeviation/upperBound[(@xsi:type=\"common:SignedTime\") ]");
			signedTimeXpathBuffer.append("|");
			signedTimeXpathBuffer.append(
					".//stimuli/stimulusDeviation/distribution/*[(@xsi:type=\"common:SignedTime\") ]");
			signedTimeXpathBuffer.append("|");

			signedTimeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockTriangleFunction\")]/shift");
			signedTimeXpathBuffer.append("|");
			signedTimeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockSinusFunction\")]/shift");

			elements = getXpathResult(document.getRootElement(), signedTimeXpathBuffer.toString());

			for (Element element : elements) {
				List<Attribute> attributes = getXpathResult_Attributes(element, "./@unit");
					assertTrue("Unable to set default value (from 1.1.0) of TimeUnit for element having tag name : "+element.getName(),  attributes.get(0).getValue()!=null);
			}
			
			
		}
		
	}
}
