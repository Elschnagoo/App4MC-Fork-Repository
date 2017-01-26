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
public class CommonElementsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/commonElements/commonElements.amxmi", true } });
	}

	public CommonElementsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, OSConverter.class, SwConverter.class, StimuliConverter.class,
				CommonElementsConverter.class);

		verify_Tag_Elements();
	}


	private void verify_Tag_Elements() {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./componentsModel/tags");
		xpathBuffer.append("|");
		xpathBuffer.append("./hwModel/tags");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/tags");


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_072("am"), this.helper.getGenericNS("xsi"));

			if (xpathResult.size() > 0) {

				Assert.assertTrue(
						"Tag elements content migration is not successful --> as still it contains \"Tag elements inside -> componentsModel or hwModel or swModel \". For further analysis check the migrated model file :"
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
