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

import org.eclipse.app4mc.amalthea.converters072.impl.CommonElementsConvertor;
import org.eclipse.app4mc.amalthea.converters072.impl.NamespaceConverter;
import org.eclipse.app4mc.amalthea.converters072.impl.PropertyConstraintsConverter;
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
public class PropertyConstraintsConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays
				.asList(new Object[][] { { "/propertyConstraints/case1/AMALTHEA_Democar_MappingExample.amxmi", true },
						{ "/propertyConstraints/case2/AMALTHEA_Democar_MappingExample-without-hwmodel.amxmi", true } });
	}

	public PropertyConstraintsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConversion() {
		super.testConversion(NamespaceConverter.class, SwConverter.class, CommonElementsConvertor.class,
				PropertyConstraintsConverter.class);
	}


	@Override
	@Test
	public void verification() {
		super.verification();

		verifyMemType_CoreType_migration();

		verifyCore_Elements_migration();

		verifyMemory_Elements_migration();
	}

	private void verifyMemory_Elements_migration() {

		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append("./propertyConstraintsModel//firstConstraint[@xsi:type=\"am:HwMemoryProperty\"]/memory");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//secondConstraint[@xsi:type=\"am:HwMemoryProperty\"]/memory");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//hwConstraint[@xsi:type=\"am:HwMemoryProperty\"]/memory");


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_072("am"), this.helper.getGenericNS("xsi"));

			for (final Element element : xpathResult) {
				Assert.assertTrue(
						"Memory element content migration is not successful --> as PropertyConstraints model is still having \"Memory definition\"-> instead of references. For further analysis check the migrated model file :"
								+ document.getBaseURI(),
						element.getAttribute("href") != null);

			}


		}


	}


	private void verifyCore_Elements_migration() {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./propertyConstraintsModel//firstConstraint[@xsi:type=\"am:HwCoreProperty\"]/core");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//secondConstraint[@xsi:type=\"am:HwCoreProperty\"]/core");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel//hwConstraint[@xsi:type=\"am:HwCoreProperty\"]/core");


		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_072("am"), this.helper.getGenericNS("xsi"));

			for (final Element element : xpathResult) {
				Assert.assertTrue(
						"Core element content migration is not successful --> as PropertyConstraints model is still having \"Core definition\"-> instead of references. For further analysis check the migrated model file :"
								+ document.getBaseURI(),
						element.getAttribute("href") != null);

			}


		}


	}

	private void verifyMemType_CoreType_migration() {
		for (final Document document : this.fileName_documentsMap.values()) {

			final Element rootElement = document.getRootElement();

			final List<Element> xpathResult = this.helper.getXpathResult(rootElement,
					"./propertyConstraintsModel/coreTypeDefinitions|./propertyConstraintsModel/memoryTypeDefinitions",
					Element.class, this.helper.getNS_072("am"));

			if (xpathResult.size() > 0) {

				Assert.assertTrue(
						"MemType and CoreType content migration is not successful as PropertyConstraints model is still having them. For further analysis check the migrated model file :"
								+ document.getBaseURI(),
						xpathResult.size() == 0);
			}


		}

	}


}
