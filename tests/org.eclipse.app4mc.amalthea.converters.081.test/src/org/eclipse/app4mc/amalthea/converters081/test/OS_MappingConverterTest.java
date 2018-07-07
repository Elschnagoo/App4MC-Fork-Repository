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

package org.eclipse.app4mc.amalthea.converters081.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters081.impl.ConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.MappingConverter;
import org.eclipse.app4mc.amalthea.converters081.impl.OSConverter;
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
public class OS_MappingConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}. Description : {3}")
	public static Collection<Object[]> getTestData() {

		final String[] inputFiles = new String[] { "/os_mapping/modeling_example_client_server_1.amxmi" };



		return Arrays.asList(new Object[][] {
				{ "AMXMI  with OS and Mapping Models", true, inputFiles, "Migration of Amalthea models containing SW Model " } ,
  });
	}

	public OS_MappingConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles,
			final String description) {

		super(testDataID, xmlFiles, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(org.eclipse.app4mc.amalthea.converters081.impl.NamespaceConverter.class,
				org.eclipse.app4mc.amalthea.converters081.impl.RootElementConverter.class, ConstraintsConverter.class,
				HwConverter.class, SwConverter.class, OSConverter.class, MappingConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Override
	protected void modelFileVerificationHook(final Document document) {
		super.modelFileVerificationHook(document);


		final StringBuffer parameterExtensionsXpathBuffer = new StringBuffer();

		parameterExtensionsXpathBuffer.append("./osModel/operatingSystems/interruptControllers/schedulingAlgorithm[@xsi:type=\"am:UserSpecificSchedulingAlgorithm\"]/parameterExtensions");
		parameterExtensionsXpathBuffer.append("|");
		parameterExtensionsXpathBuffer.append("./osModel/operatingSystems/taskSchedulers/schedulingAlgorithm[@xsi:type=\"am:UserSpecificSchedulingAlgorithm\"]/parameterExtensions");
		
		
		final List<Element> parameterExtensionElements = this.helper.getXpathResult(document.getRootElement(),
				parameterExtensionsXpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));

			assertTrue( "UserSpecificSchedulingAlgorithm element migration is not successful" , parameterExtensionElements.size()>0);
			

		
			final StringBuffer responsibilityXpathBuffer = new StringBuffer();

			responsibilityXpathBuffer.append("./mappingModel/schedulerAllocation[/responsibility or @responsibility]");

			final List<Element> responsibilityElements = this.helper.getXpathResult(document.getRootElement(),
					responsibilityXpathBuffer.toString(), Element.class, this.helper.getGenericNS("xsi"));

				assertTrue( "CoreAllocation (from 0.8.0) element migration is not successful" , responsibilityElements.size()>0);
				
			
		
	 

	}


}
