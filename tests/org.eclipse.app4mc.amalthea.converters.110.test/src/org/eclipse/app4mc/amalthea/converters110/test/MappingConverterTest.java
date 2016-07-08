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

import org.eclipse.app4mc.amalthea.converters110.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.MappingConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.OsConverter;
import org.eclipse.app4mc.amalthea.converters110.impl.SchedulerRefsConverter;
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
public class MappingConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/mapping/mapping.amxmi", true },
				{ "/mapping_2/mapping.amxmi-mapping", true }, { "/mapping_uri_fragments/mapping.amxmi", true } });
	}

	public MappingConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConverter() {

		super.testConversion(OsConverter.class, SwConverter.class, SchedulerRefsConverter.class, HwConverter.class,
				MappingConverter.class);

	}

	@Test
	@Override
	public void verification() {
		super.verification();

	}


	@Test
	public void verificiation_mapping_model() {


		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {


			/*- verifying Task ref existence in CustomProperty */


			final List<Element> elements = getXpathResult(document.getRootElement(), ".//mappingModel");


			for (final Element element : elements) {

				final List<Element> processAllocationElements = getXpathResult(element, "./processAllocation");

				assertTrue(
						"Unable to convert all the ExecutableAllocation objects having Task references -> to ProcessAllocations",
						processAllocationElements.size() >= 2);

				for (final Element processAllocation : processAllocationElements) {

					final Element scheduler = processAllocation.getChild("scheduler");
					final Element process = processAllocation.getChild("process");

					assertTrue("Process and Scheduler couldn't be migrated successfully",
							scheduler != null && process != null);

					if (process.getAttributeValue("type", this.helper.getGenericNS("xsi")).equals("sw:ISR")) {
						assertTrue("InterruptController object is not associated to ProcessAllocation having ISR : ",
								scheduler.getAttributeValue("type", this.helper.getGenericNS("xsi"))
										.equals("os:InterruptController"));
					}
					else if (process.getAttributeValue("type", this.helper.getGenericNS("xsi")).equals("sw:Task")) {
						assertTrue("TaskScheduler object is not associated to ProcessAllocation having Task ", scheduler
								.getAttributeValue("type", this.helper.getGenericNS("xsi")).equals("os:TaskScheduler"));
					}
				}

				final List<Element> runnableAllocationElements = getXpathResult(element, "./runnableAllocation");

				assertTrue(
						"Unable to convert all the ExecutableAllocation objects having Runnable references -> to RunnableAllocations",
						runnableAllocationElements.size() >= 1);

			}

		}


	}


}
