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
import java.util.List;

import org.eclipse.app4mc.amalthea.converters071.impl.HwConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.PropertyConstraintsConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.RootElementConverter;
import org.eclipse.app4mc.amalthea.converters071.impl.SwConverter;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class SwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test data ID: {0}")
	public static Collection<Object[]> getTestData() {


		final String[] inputFiles_Section = new String[] { "/sw/AMALTHEA_Democar.amxmi" };

		final String[] inputFiles_ModeSwitch = new String[] { "/sw/modeswitch/modeswitch.amxmi",
				"/sw/modeswitch/modeliterals.amxmi", "/sw/modeswitch/modeswtich_isrs.amxmi" };

		return Arrays.asList(new Object[][] { { "Sections : 1", true, inputFiles_Section },
				{ "ModeSwitchEntry_Scenario : 2", true, inputFiles_ModeSwitch } });
	}

	public SwConverterTest(final String testDataID, final boolean canExecuteTestCase, final String[] xmlFiles) {

		super(testDataID, xmlFiles, canExecuteTestCase);
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

		verify_modeswitchEntry();
	}

	private void verify_modeswitchEntry() {

		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement,
					".//callGraph//graphEntries//entries[@value]|.//callGraph//graphEntries//entries/value|.//callGraph//graphEntries//entries[@default]",
					Element.class, this.helper.getNS_071("am"));

			if (xpathResult.size() > 0) {

				final List<Attribute> xpathResult2 = this.helper.getXpathResult(xpathResult.get(0),
						"./ancestor::tasks[1]/@name|./ancestor::isrs[1]/@name", Attribute.class);


				Assert.assertTrue(
						"Task \"" + xpathResult2.get(0).getValue()
								+ "\" is not migrated completely.. and is not valid as per 0.7.1",
						xpathResult.size() == 0);
			}


		}

	}


}
