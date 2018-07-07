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

import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.MappingConverter;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class OSConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		/*- As pc2.amxmi is referring elements from pc.amxmi, both these files will be considered for the migration*/
		return Arrays.asList(new Object[][] { { "/osmodel_namechanges/os_2.amxmi", true },
				{ "/osmodel_namechanges/os.amxmi", true } });
	}

	public OSConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {
		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		testConversion(HwConverter.class, MappingConverter.class, ContentConverter.class);
	}

}
