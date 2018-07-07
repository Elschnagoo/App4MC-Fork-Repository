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
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class NameSpaceConversionTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/namespaces/hw.amxmi", true }, { "/namespaces/mapping.amxmi", true },
				{ "/namespaces/os.amxmi", true }, { "/namespaces/stimuli.amxmi", true },
				{ "/namespaces/amalthea.amxmi", true }, { "/namespaces/sw.amxmi", true } });
	}

	public NameSpaceConversionTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

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


}
