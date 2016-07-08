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

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters111.impl.CommonConverter;
import org.eclipse.app4mc.amalthea.converters111.impl.PropertyConstraintsConverter;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
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

		return Arrays.asList(new Object[][] { { "/propertyconstraints/PropertyConstraints.amxmi", true } });
	}

	public PropertyConstraintsConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}

	@Test
	public void testConverter() {
		super.testConversion(CommonConverter.class, PropertyConstraintsConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}


	@Test
	public void verification_ComparatorType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {


			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(
					"(.//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreProperty\") ])");

			xpathBuffer.append("|");

			xpathBuffer.append(
					"(.//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]//firstConstraint[(@xsi:type=\"propertyconstraints:HwCoreProperty\")])");


			xpathBuffer.append("|");

			xpathBuffer.append(
					"(.//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]//secondConstraint[(@xsi:type=\"propertyconstraints:HwCoreProperty\") ])");

			xpathBuffer.append("|");

			xpathBuffer.append(
					"(.//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryProperty\") ])");

			xpathBuffer.append("|");

			xpathBuffer.append(
					"(.//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]//firstConstraint[(@xsi:type=\"propertyconstraints:HwMemoryProperty\") ])");


			xpathBuffer.append("|");

			xpathBuffer.append(
					"(.//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]//secondConstraint[(@xsi:type=\"propertyconstraints:HwMemoryProperty\") ])");


			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@comparator");

				assertTrue("Unable to set default value (from 1.1.0) of ComparatorType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue().equals("equal"));


			}

		}

	}


	@Test
	public void verification_ConjunctionType() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {


			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append(
					".//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")  ]");

			xpathBuffer.append("|");

			xpathBuffer.append(
					".//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]// firstConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")  ]");


			xpathBuffer.append("|");

			xpathBuffer.append(
					".//allocationConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")]// secondConstraint[(@xsi:type=\"propertyconstraints:HwCoreConjunction\")  ] ");

			xpathBuffer.append("|");

			xpathBuffer.append(
					".//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")  ]");

			xpathBuffer.append("|");

			xpathBuffer.append(
					".//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]// firstConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")  ] ");


			xpathBuffer.append("|");

			xpathBuffer.append(
					".//mappingConstraints/hwConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")]// secondConstraint[(@xsi:type=\"propertyconstraints:HwMemoryConjunction\")  ] ");


			final List<Element> elements = getXpathResult(document.getRootElement(), xpathBuffer.toString());


			for (final Element element : elements) {

				final List<Attribute> attributes = getXpathResult_Attributes(element, "./@conjunction");

				assertTrue("Unable to set default value (from 1.1.0) of ConjunctionType for element having tag name : "
						+ element.getName(), attributes.get(0).getValue().equals("and"));


			}

		}

	}
}
