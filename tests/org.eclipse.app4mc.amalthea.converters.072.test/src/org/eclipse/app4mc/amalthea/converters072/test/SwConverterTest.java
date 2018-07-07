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

import org.eclipse.app4mc.amalthea.converters072.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters072.impl.OSConverter;
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
public class SwConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/sw/sw.amxmi", true }, { "/sw/preemption/sw.amxmi", true },
				{ "/sw/instructions/instructions.amxmi", true }, { "/sw/samplingtype/sw.amxmi", true } });
	}

	public SwConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, OSConverter.class, SwConverter.class);

		verify_SamplingType();
	}


	private void verify_SamplingType() {

		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append(".//deviation[@samplingType]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//stimulusDeviation[@samplingType]");


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_072("am"), this.helper.getGenericNS("xsi"));

			if (xpathResult.size() > 0) {
				Assert.assertTrue(
						"Deviation element content migration is not successful --> as still it contains \"SamplingType attribute\". For further analysis check the migrated model file :"
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
