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
public class PropertyConstraintsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/propertyconstraints/memorytype_size.amxmi", true },
				{ "/propertyconstraints/pc_frequency_quartz.amxmi", true } });
	}

	public PropertyConstraintsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(RootElementConverter.class, NamespaceConverter.class, SwConverter.class, HwConverter.class,
				PropertyConstraintsConverter.class);
	}


	@Override
	@Test
	public void verification() {

		super.verification();

		verify_frequency_Quartz("./propertyConstraintsModel/mappingConstraints/hwConstraint//quartzes");
	}


}
