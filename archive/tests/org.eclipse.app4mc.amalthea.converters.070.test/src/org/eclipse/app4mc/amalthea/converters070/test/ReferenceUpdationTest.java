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

package org.eclipse.app4mc.amalthea.converters070.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.app4mc.amalthea.converters070.impl.CentralConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.CommonConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.ComponentsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.ConfigConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.ConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.EventsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.MappingConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.OsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.PropertyContraintsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.StimuliConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.SwConverter;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ReferenceUpdationTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(
				new Object[][] { { "referenceUpdation/AMALTHEA_Democar_EnergyEfficientMappingExample.amxmi", true },
						{ "referenceUpdation/AMALTHEA_Democar_MappingExample-hw.amxmi", true },
						{ "referenceUpdation/AMALTHEA_Democar_MappingExample.amxmi", true },
						{ "referenceUpdation/AMALTHEA_Democar_MappingExample_withTasks.amxmi", true },
						{ "referenceUpdation/AMALTHEA_HVAC_EnergyEfficientMapping_Example.amxmi", true } });
	}

	public ReferenceUpdationTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(CentralConverter.class, CommonConverter.class, ComponentsConverter.class,
				ConfigConverter.class, ConstraintsConverter.class, EventsConverter.class, HwConverter.class,
				MappingConverter.class, OsConverter.class, PropertyContraintsConverter.class, StimuliConverter.class,
				SwConverter.class, ContentConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}

	@Test
	public void verification_references() {


		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();


		for (final Document document : values) {

			final List<Attribute> attributes = getXpathResult_Attributes(document.getRootElement(), ".//@*");

			for (final Attribute attribute : attributes) {

				final String value = attribute.getValue();

				if (value.contains("?")) {

					final Pattern pattern = Pattern.compile(".+\\?type\\=\\w+");

					final Matcher matcher = pattern.matcher(value);

					assertTrue("Regex pattern (.+\\?type\\=\\w+) is not working as expected : ",
							!pattern.matcher(value + ".am").matches() ? true : false);

					/*-If the pattern is in the following format : label1?type=sw.Label, below assert will be true*/
					assertTrue("Unable to migrate the reference : \"" + value + "\" In model file :   "
							+ document.getBaseURI(), matcher.matches());
				}


			}

		}


	}


}
