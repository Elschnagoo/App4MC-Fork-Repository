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
}
