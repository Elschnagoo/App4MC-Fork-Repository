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
public class SwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles = new String[] { "/sw/sw.amxmi","/sw/sw2.amxmi" };

		final String[] inputFiles_priority = new String[] { "/sw_priority/sw_priority.amxmi" };


		final String[] inputFiles_activations = new String[] { "/activations/events.amxmi" , "/activations/sw_activations.amxmi"};
		

		return Arrays.asList(new Object[][] {
			{ "Models with SW Model", true, inputFiles, "Migration of Amalthea models containing SW Model " } ,

			{ "Models with SW Model - having sub-classes of AbstractProcess (e.g: Task, ISR, ProcessPrototyes)", true, inputFiles_priority, "Migration of Amalthea models containing SW Model (with AbstractProcess elements)"},   
			
			{ "Models with Activations & Triggers", true, inputFiles_activations, "Migration of Amalthea models containing PeriodicActivation's & EventActivation's " }
			
		});
	}

	public SwConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters081.impl.NamespaceConverter.class,
				org.eclipse.app4mc.amalthea.converters081.impl.RootElementConverter.class, ConstraintsConverter.class,
				HwConverter.class, SwConverter.class, MappingConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);


		final List<Element> runnableElements = this.helper.getXpathResult(document.getRootElement(),
				"./swModel/runnables[./activations]|./swModel/runnables[@activations]", Element.class, this.helper.getGenericNS("xsi"));


		if(document.getBaseURI().endsWith("sw.amxmi")){
			assertTrue( "Runnable migration is not successful" , runnableElements.size()==2);

		}

		//check for priority inside AbstractProcessElements

		final StringBuffer absProcessXpathBuffer = new StringBuffer();

		absProcessXpathBuffer.append("./swModel/tasks[@priority or @osekTaskGroup]");
		absProcessXpathBuffer.append("|");
		absProcessXpathBuffer.append("./swModel/isrs[@priority]");
		absProcessXpathBuffer.append("|");
		absProcessXpathBuffer.append("./swModel/processPrototypes[@priority]");



		final List<Element> abstractProcessElements = this.helper.getXpathResult(document.getRootElement(),
				absProcessXpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));


		assertTrue( "Priority from AbstractProcess elements is not migrated properly" , abstractProcessElements.size()==0);


		//check for priority inside TaskAllocation


		final List<Element> taskAllocationElements = this.helper.getXpathResult(document.getRootElement(),
				"./mappingModel/taskAllocation[@priority]", Element.class, this.helper.getGenericNS("xsi"));

		assertTrue( "Priority from TaskAllocation elements is not migrated properly" , taskAllocationElements.size()==0);
		
		final List<Element> deadlineElements = this.helper.getXpathResult(document.getRootElement(),
				"./swModel/activations[@xsi:type=\"am:PeriodicActivation\"]/deadline", Element.class, this.helper.getGenericNS("xsi"));

		assertTrue( "PeriodicActivation is not migrated w.r.t. deadline" , deadlineElements.size()==0);
		
		final List<Element> triggerElements = this.helper.getXpathResult(document.getRootElement(),
				"./swModel/activations[@xsi:type=\"am:EventActivation\"]/deadline", Element.class, this.helper.getGenericNS("xsi"));

		assertTrue( "EventActivation is not migrated w.r.t. trigger" , triggerElements.size()==0);
		
		
		
		


	}


}
