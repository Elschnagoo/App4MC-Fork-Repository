/**
 ********************************************************************************
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

package org.eclipse.app4mc.amalthea.converters071.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters071.utils.HelperUtils_070_071;
import org.jdom2.Attribute;
import org.jdom2.Element;

public abstract class AbstractConverter implements IConverter {

	protected HelperUtils_070_071 helper;

	protected Logger logger;

	/**
	 * This method is used to migrate the size attribute inside MemoryType element, which can be contained inside :<br>
	 * HW-Model <br>
	 * Property-Constraints-Model<br>
	 *
	 * <code>
	 * Input : <memoryTypes name="MemType1" size="10"/>
	 *
	 * Output :
	 *  <memoryTypes name="MemType1">
	  		<size value="10" />
	 *	</memoryTypes>
	 *
	 * </code>
	 *
	 * Note: In the above case, size attribute is converted to DataSize element -> which will be contained inside
	 * MemoryType
	 *
	 * @param rootElement
	 *            Root element of the AMALTHEA model
	 * @param xpath
	 *            corresponding Xpath to fetch the element which is the equivalent of "MemoryType"
	 */
	protected void update_Size_MemoryType(final Element rootElement, final String xpath) {

		final List<Element> memoryTypes = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_071("am"));


		for (final Element memTypeElement : memoryTypes) {

			final Attribute sizeAttrib = memTypeElement.getAttribute("size");

			if (sizeAttrib != null) {

				final String value = sizeAttrib.getValue();

				final Element dataSizeElement = new Element("size");

				final Attribute unit = new Attribute("value", value);

				dataSizeElement.setAttribute(unit);

				memTypeElement.addContent(dataSizeElement);

				memTypeElement.removeAttribute(sizeAttrib);
			}
		}


	}

	/**
	 * Bug 505691 This method is used to migrate the frequency attribute inside Quartz element, which can be contained
	 * inside :<br>
	 * HW-Model <br>
	 * Property-Constraints-Model<br>
	 *
	 * <code>
	 * Input : <quartzes frequency="100"/>
	 *
	 * Output :
	 *  <quartzes>
	 *      <frequency value="100.0" />
	 *  </quartzes>
	 *
	 * </code>
	 *
	 * Note: In the above case, frequency attribute is converted to Frequency element -> which is contained inside
	 * Quartz element
	 *
	 * @param rootElement
	 *            Root element of the AMALTHEA model
	 * @param xpath
	 *            corresponding Xpath to fetch the element which is the equivalent of "Quartz"
	 */

	protected void update_frequency_Quartz(final Element rootElement, final String xpath) {

		/*-
		 * Bug 505691
		 * As per the change in 0.7.1, Quartz will not have frequency as integer, instead a Frequency object
		 *
		 * Model migration should change all the definitions of Quartz in the below Elements:
		 *
		 * - Core
		 * - ECU
		 * - HwComponent
		 * - HwSystem
		 * - Memory (Note: Memory element can be defined inside HW model or in PropertyConstraints model)
		 * - Microcontroller
		 * - Network
		 * - Quartz (Quartz objects can be nested)
		 *
		 *
		 * Xpaths for the above mentioned elements:
		 *
		 *  ./hwModel/system/ecus/microcontrollers/cores//quartzes
		 *	./hwModel/system/ecus//quartzes
		 *	./hwModel/system//components//quartzes
		 *	./hwModel/system/quartzes//quartzes
		 *	./hwModel/system//memories/quartzes//quartzes
		 *	./hwModel/system/ecus/microcontrollers//quartzes
		 *	./hwModel/system//networks/quartzes//quartzes
		 *
		 *  ./propertyConstraintsModel/mappingConstraints/hwConstraint//quartzes
		 *
		 * Above specified Xpaths can be summarized with the below two Xpaths:
		 *
		 * ./hwModel/system//quartzes[@frequency]
		 * ./propertyConstraintsModel/mappingConstraints/hwConstraint//quartzes[@frequency]
		 *
		 */

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_071("am"));

		for (final Element quartzElement : quartzElements) {

			final String frequencyValue = quartzElement.getAttributeValue("frequency");

			quartzElement.removeAttribute("frequency");

			final Element frequencyElement = new Element("frequency");

			try {
				frequencyElement.setAttribute("value", Double.parseDouble(frequencyValue) + "");
			}
			catch (final Exception e) {
				/*- If there is a exception during conversion to double, initial value which is fetched from \"frequency attribute \" is set as a value for \"value attribute \" of Frequency element*/
				frequencyElement.setAttribute("value", frequencyValue);

			}

			quartzElement.addContent(frequencyElement);

		}

	}
}
