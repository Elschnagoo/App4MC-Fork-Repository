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
package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class HwConverter implements IConverter {

	private final HelperUtils_111_070 helper;
	
	private final Logger logger ;

	public HwConverter() {
		this.helper = HelperUtils_111_070.getInstance();
		this.logger=LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_ComplexPort_isMaster(rootElement);

		update_ComplexNode_attributes(rootElement);

		update_ComplexNode_features(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	private void update_ComplexNode_attributes(final Element rootElement) {

		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: AbstractType[] attribute references are removed inside ComplexNode
		 *
		 * As a part of migration, CustomProperties should be created for each "attribute" element
		 */


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//hwModel//attribute[(@xsi:type=\"hw:BoolValue\") or (@xsi:type=\"hw:CharValue\") or (@xsi:type=\"hw:DoubleValue\")  or (@xsi:type=\"hw:IntValue\")  or (@xsi:type=\"hw:LongValue\")  or (@xsi:type=\"hw:StrValue\")  or (@xsi:type=\"hw:FeatureTypes\") ]");
		xpathBuffer.append("|");
		xpathBuffer.append(
				"/hw:HWModel//attribute[(@xsi:type=\"hw:BoolValue\") or (@xsi:type=\"hw:CharValue\") or (@xsi:type=\"hw:DoubleValue\")  or (@xsi:type=\"hw:IntValue\")  or (@xsi:type=\"hw:LongValue\")  or (@xsi:type=\"hw:StrValue\")  or (@xsi:type=\"hw:FeatureTypes\") ]");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Element element : elements) {

			createCustomProperty_Attrib_Feature(element, "attribute#");

		}

	}

	private void update_ComplexNode_features(final Element rootElement) {

		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: AbstractType[] attribute references are removed inside ComplexNode
		 *
		 * As a part of migration, CustomProperties should be created for each "attribute" element
		 */


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(
				".//hwModel//features[(@xsi:type=\"hw:BoolValue\") or (@xsi:type=\"hw:CharValue\") or (@xsi:type=\"hw:DoubleValue\")  or (@xsi:type=\"hw:IntValue\")  or (@xsi:type=\"hw:LongValue\")  or (@xsi:type=\"hw:StrValue\")  or (@xsi:type=\"hw:FeatureTypes\") ]");
		xpathBuffer.append("|");
		xpathBuffer.append(
				"/hw:HWModel//features[(@xsi:type=\"hw:BoolValue\") or (@xsi:type=\"hw:CharValue\") or (@xsi:type=\"hw:DoubleValue\")  or (@xsi:type=\"hw:IntValue\")  or (@xsi:type=\"hw:LongValue\")  or (@xsi:type=\"hw:StrValue\")  or (@xsi:type=\"hw:FeatureTypes\") ]");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Element element : elements) {

			createCustomProperty_Attrib_Feature(element, "feature#");

		}

	}

	/**
	 * This method is used to build the CustomProperty content from the supplied attribute/feature AMALTHEA element
	 *
	 * @param element
	 *            object of class extending AbstractType (of types BoolValue or CharValue or DoubleValue etc.,)
	 * @param prefix
	 *            content to be added as prefix for the key of CustomProperty
	 */
	private void createCustomProperty_Attrib_Feature(final Element element, final String prefix) {

		final String type = element.getAttributeValue("type", this.helper.getGenericNS("xsi"));

		final String name = element.getAttributeValue("name");

		final String value = element.getAttributeValue("value");

		final Element customPropertyElement = new Element("customProperties");

		customPropertyElement.setAttribute("key", prefix + name);

		final Element valueElement = new Element("value");

		customPropertyElement.addContent(valueElement);

		if (type.equals("hw:BoolValue")) {

			valueElement.setAttribute("type", "am:BooleanObject", this.helper.getGenericNS("xsi"));

			if (value != null) {
				valueElement.setAttribute("value", value);
			}
		}
		else if (type.equals("hw:CharValue")) {

			valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));

			if (value != null) {

				try {

					final int intValue = Integer.parseInt(value);

					final char[] chars = Character.toChars(intValue);


					valueElement.setAttribute("value", String.copyValueOf(chars));
				}
				catch (final Exception e) {
					logger.error( "Exception occured during coversion of String :"+value+" to Integer" , e);
					throw e;
				}
			}
		}
		else if (type.equals("hw:DoubleValue")) {

			valueElement.setAttribute("type", "am:DoubleObject", this.helper.getGenericNS("xsi"));

			if (value != null) {
				valueElement.setAttribute("value", value);
			}

		}
		else if (type.equals("hw:IntValue")) {

			valueElement.setAttribute("type", "am:IntegerObject", this.helper.getGenericNS("xsi"));

			if (value != null) {
				valueElement.setAttribute("value", value);
			}


		}
		else if (type.equals("hw:LongValue")) {

			valueElement.setAttribute("type", "am:LongObject", this.helper.getGenericNS("xsi"));

			if (value != null) {
				valueElement.setAttribute("value", value);
			}

		}
		else if (type.equals("hw:StrValue")) {

			valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));

			if (value != null) {
				valueElement.setAttribute("value", value);
			}
		}
		else if (type.equals("hw:FeatureTypes")) {

			customPropertyElement.setAttribute("key", prefix + "FeatureTypes#" + name);

			valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));

			if (value != null) {
				valueElement.setAttribute("value", value);
			}

		}


		/*- now adding customproperty to the parent of "attribute" element*/

		element.getParent().addContent(customPropertyElement);

		element.detach();
	}


	private void update_ComplexPort_isMaster(final Element rootElement) {

		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: isMaster  variable inside ComplexPort is changed to master
		 */

		final List<Attribute> attributes = this.helper.getXpathResult(rootElement,
				".//hwModel//ports[(@xsi:type=\"hw:ComplexPort\")]/@isMaster|/hw:HWModel//ports[(@xsi:type=\"hw:ComplexPort\")]/@isMaster",
				Attribute.class, this.helper.getNS_111("hw"), this.helper.getGenericNS("xsi"));


		for (final Attribute isMasterAttribute : attributes) {

			isMasterAttribute.setName("master");
		}

	}

}
