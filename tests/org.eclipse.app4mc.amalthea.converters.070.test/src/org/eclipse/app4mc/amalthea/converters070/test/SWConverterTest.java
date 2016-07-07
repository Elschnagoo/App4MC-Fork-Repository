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
package org.eclipse.app4mc.amalthea.converters070.test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters070.impl.ContentConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.OsConverter;
import org.eclipse.app4mc.amalthea.converters070.impl.SwConverter;
import org.jdom2.Document;
import org.jdom2.Element;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SWConverterTest extends AbstractConverterTest {


	@Parameterized.Parameters(name = "{index}: Test file: {0}")
	public static Collection<Object[]> getTestData() {

		return Arrays.asList(new Object[][] { { "/sw/sw.amxmi", true }, { "/sw/sw_2.amxmi", true } });
	}

	public SWConverterTest(final String xmlFileRelativeLocation, final boolean canExecuteTestCase) {

		super(xmlFileRelativeLocation, canExecuteTestCase);
	}


	@Test
	public void testConversion() {
		super.testConversion(SwConverter.class, OsConverter.class, ContentConverter.class);
	}

	@Override
	@Test
	public void verification() {
		super.verification();
	}


	/**
	 * variable isDefault (available in 1.1.1) is renamed to default (in 0.7.0).
	 *
	 */
	@Test
	public void verification_isDefault() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//graphEntries[(@xsi:type=\"am:ModeSwitch\")]/entries");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of isDefault to default. In model file :   "
						+ document.getBaseURI(), element.getAttribute("default") != null);


			}

		}

	}


	/**
	 * variable isBuffered (available in 1.1.1) is renamed to buffered (in 0.7.0).
	 *
	 */
	@Test
	public void verification_label_isBuffered() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(), ".//labels");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of isBuffered to buffered. In model file :   "
						+ document.getBaseURI(), element.getAttribute("buffered") != null);


			}

		}

	}


	/**
	 * variable isBuffered (available in 1.1.1) is renamed to buffered (in 0.7.0).
	 *
	 */
	@Test
	public void verification_labelaccess_isBuffered() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//runnableItems[(@xsi:type=\"am:LabelAccess\")]");

			for (final Element element : elements) {

				System.out.println("LabelAccess present in model file : " + element.getDocument().getBaseURI());

				System.out.println("element.getAttributeValue(buffered) : " + element.getAttributeValue("buffered"));

				System.out
						.println("element.getAttributeValue(isBuffered) : " + element.getAttributeValue("isBuffered"));

				assertTrue("Unable to migrate the data of isBuffered to buffered. In model file :   "
						+ document.getBaseURI(), element.getAttribute("buffered") != null);


			}

		}

	}

	/**
	 * variable isBuffered (available in 1.1.1) is renamed to buffered (in 0.7.0).
	 *
	 */
	@Test
	public void verification_senderReceiverCommunication_isBuffered() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//runnableItem[(@xsi:type=\"am:SenderReceiverWrite\") or (@xsi:type=\"am:SenderReceiverRead\") ]");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of isBuffered to buffered. In model file :   "
						+ document.getBaseURI(), element.getAttribute("buffered") != null);


			}

		}

	}


	/**
	 * variable accessEnum (available in 1.1.1) is renamed to buffered (in 0.7.0).
	 *
	 */
	@Test
	public void verification_accessEnum() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//runnableItems[(@xsi:type=\"am:SemaphoreAccess\")]");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of accessEnum to access. In model file :   "
						+ document.getBaseURI(), element.getAttribute("access") != null);


			}

		}

	}


	/**
	 * variable isOrdered (available in 1.1.1) is renamed to ordered (in 0.7.0).
	 *
	 */
	@Test
	public void verification_isOrdered() {

		parseGeneratedXMLFiles();

		final Collection<Document> values = this.fileName_documentsMap.values();

		for (final Document document : values) {

			final List<Element> elements = getXpathResult(document.getRootElement(),
					".//runnableItems[(@xsi:type=\"am:Group\")]|.//runnableItem[(@xsi:type=\"am:Group\")]");

			for (final Element element : elements) {

				assertTrue("Unable to migrate the data of isOrdered to ordered. In model file :   "
						+ document.getBaseURI(), element.getAttribute("ordered") != null);


			}

		}

	}

}
