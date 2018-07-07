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

package org.eclipse.app4mc.amalthea.converters072.test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters072.impl.CommonElementsConverter;
import org.eclipse.app4mc.amalthea.converters072.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters072.impl.OSConverter;
import org.eclipse.app4mc.amalthea.converters072.impl.StimuliConverter;
import org.eclipse.app4mc.amalthea.converters072.impl.SwConverter;
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
public class StimuliConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/stimuli/Stimuli.amxmi", true } });
	}

	public StimuliConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, OSConverter.class, SwConverter.class,
				CommonElementsConverter.class, StimuliConverter.class);

		verify_ArrivalCurveEntries();
	}


	/**
	 * Bug 510088 : As per the changes in MetaModel - > arrivalCurveEntries tag is changed to entries.
	 *
	 * After successful model migration -> there should not be any arrivalCurveEntries tags inside ArrivalCurve Stimulus
	 * element.
	 *
	 * Below method is used to verify if there exists any arrivalCurveEntries tags inside Stimulus (ArrivalCurve)
	 * element .
	 *
	 */
	private void verify_ArrivalCurveEntries() {

		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append("./stimuliModel/stimuli[@xsi:type=\"am:ArrivalCurve\"]/arrivalCurveEntries");


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_072("am"), this.helper.getGenericNS("xsi"));

			if (xpathResult.size() > 0) {
				Assert.assertTrue(
						"ArrivalCurve Stimulus element content migration is not successful --> as still it contains \"arrivalCurveEntries tag\". For further analysis check the migrated model file :"
								+ document.getBaseURI(),
						xpathResult.size() == 0);

			}


		}


	}


	@Override
	@Test
	public void verification() {
		super.verification();


	}


}
