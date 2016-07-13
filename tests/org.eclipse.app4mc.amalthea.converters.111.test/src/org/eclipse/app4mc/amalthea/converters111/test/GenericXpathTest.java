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
package org.eclipse.app4mc.amalthea.converters111.test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(Parameterized.class)
public class GenericXpathTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { 
				{ "/stimuli/stimuli.amxmi", true } });
	}

	public GenericXpathTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConverter() {

		if (!this.canExecuteTestCase) {
			return;
		}

		try {

			parseInputXMLFiles();
			
			final Set<File> keySet = this.fileName_documentsMap.keySet();

			for (final File file : keySet) {

				this.logger.info(file.getAbsolutePath());
				final Document rootDocument = this.fileName_documentsMap.get(file);

				final StringBuffer signedTimeXpathBuffer = new StringBuffer();
				signedTimeXpathBuffer
						.append(".//stimuli/stimulusDeviation/lowerBound[(@xsi:type=\"common:SignedTime\") and not(@unit)]");
				signedTimeXpathBuffer.append("|");
				signedTimeXpathBuffer
				.append(".//stimuli/stimulusDeviation/upperBound[(@xsi:type=\"common:SignedTime\") and not(@unit)]");
				signedTimeXpathBuffer.append("|");
				signedTimeXpathBuffer
						.append(".//stimuli/stimulusDeviation/distribution/*[(@xsi:type=\"common:SignedTime\") and not(@unit)]");
				signedTimeXpathBuffer.append("|");

				signedTimeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockTriangleFunction\")]/shift[not(@unit)]");
				signedTimeXpathBuffer.append("|");
				signedTimeXpathBuffer.append(".//clocks[(@xsi:type=\"stimuli:ClockSinusFunction\")]/shift[not(@unit)]");


				final List<Element> adsMappingTypes = this.helper.getXpathResult(rootDocument, signedTimeXpathBuffer.toString(),
						Element.class, this.helper.getNS_111("common"), this.helper.getNS_111("stimuli"),
						this.helper.getGenericNS("xsi"));


				assertTrue("Xpath supplied to fetch the elements is not working ",adsMappingTypes.size()==5);
				
				this.logger.info(" Result : " + adsMappingTypes.size());

			}


		}
		catch (final Exception e) {

			fail(e.getMessage());
			System.err.println(e.getMessage());

		}


	}


}
