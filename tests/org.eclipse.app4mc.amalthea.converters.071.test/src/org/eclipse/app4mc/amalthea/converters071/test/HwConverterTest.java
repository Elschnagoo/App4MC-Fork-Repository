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
package org.eclipse.app4mc.amalthea.converters071.test;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.app4mc.amalthea.converters071.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.PropertyConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.SwConverter;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class HwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(
				new Object[][] { { "/hw/memorytype_size.amxmi", true }, { "/hw/hw_frequency_quartz.amxmi", true } });
	}

	public HwConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(RootElementConverter.class, NamespaceConverter.class, SwConverter.class,
				PropertyConstraintsConverter.class, HwConverter.class);
	}


	@Override
	@Test
	public void verification() {

		super.verification();

		verify_frequency_Quartz("./hwModel/system//quartzes");
	}


}
