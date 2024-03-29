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

		super.testConversion(OsConverter.class, MappingConverter.class, SwConverter.class);

	}

	@Test
	@Override
	public void verification() {
		super.verification();

	}


	@Test
	public void verificiation_LabelAccessStatistic_Contents() {


		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {


			/*- verifying Task ref existence in CustomProperty */


			final List<Element> elements = getXpathResult(document.getRootElement(), ".//swModel");


			for (final Element element : elements) {

				final List<Element> statistics = getXpathResult(element,
						"./runnables[@name=\"R1\"]/runnableItems[@access=\"write\"]/statistic ");

				if (statistics.size() > 0) {

					/*
					 * <statistic xmi:id="_-kM1gJNVEeWQC6k3Y09j_A"> <value xsi:type="common:MinAvgMaxStatistic"
					 * xmi:id="_IRk5wJNWEeWQC6k3Y09j_A" avg="1" max="2" /> <cacheMisses
					 * xsi:type="common:MinAvgMaxStatistic" xmi:id="_HSrBgJNWEeWQC6k3Y09j_A" min="8" avg="-1" max="5" />
					 * </statistic>
					 */

					final Element valueElement = statistics.get(0).getChild("value");

					assertTrue("Unable to migrate \"write\" tag to \"value\" tag ", valueElement != null);

					final String avgAttribute = valueElement.getAttributeValue("avg");

					final String maxAttribute = valueElement.getAttributeValue("max");

					assertTrue("Unable to migrate the contents of write tag ",
							(avgAttribute.equals("1") && maxAttribute.equals("2")));

					final Element cacheMisses = statistics.get(0).getChild("cacheMisses");

					assertTrue("Unable to migrate readCacheMisses tag to cacheMisses", (cacheMisses != null));


				}


			}

		}


	}

}
