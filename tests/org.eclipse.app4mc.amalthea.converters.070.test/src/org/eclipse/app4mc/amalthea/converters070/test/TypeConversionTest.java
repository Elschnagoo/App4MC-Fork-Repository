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
package org.eclipse.app4mc.amalthea.converters070.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

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
import org.jdom2.Document;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TypeConversionTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/type/amalthea.amxmi", true } });
	}

	public TypeConversionTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

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
	public void verification_RootTag() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			assertTrue("Unable to migrate the name of root tag i.e from AMALTHEA to Amalthea . In model file :   "
					+ document.getBaseURI(), document.getRootElement().getName().equals("Amalthea"));

		}

	}
}
