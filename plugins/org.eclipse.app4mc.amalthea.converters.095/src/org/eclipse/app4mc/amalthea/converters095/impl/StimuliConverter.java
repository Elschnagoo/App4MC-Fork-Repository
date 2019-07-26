/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters095.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters095.utils.HelperUtils_094_095;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class StimuliConverter extends AbstractConverter {

	public StimuliConverter() {
		this.helper = HelperUtils_094_095.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File file, final Map<File, Document> map, final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.9.4 to 0.9.5 : Executing Stimuli converter for model file : " + file.getName());

		basicConvert(file, map, caches);
	}

	public void basicConvert(final File file, final Map<File, Document> map, final List<ICache> caches) {

		final Document document = map.get(file);
		if (document == null) {
			return;
		}

		final Element rootElement = document.getRootElement();
		//migrate clocks to 0.9.5
		update_ClocksMulitplierList(rootElement);
		update_ClockSineFunction(rootElement);
		update_ClockTriangleFunction(rootElement);
	}

	private void update_ClockSineFunction(Element rootElement) {
		final String xpath = "./stimuliModel/clocks[@xsi:type=\"am:ClockSinusFunction\"]";
		
		final List<Element> clocks = this.helper.getXpathResult(rootElement, xpath,
				Element.class, this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		StringBuilder customPropsValue =new StringBuilder();
		for (Element element : clocks) {
			element.setAttribute("type", "am:ClockFunction", this.helper.getGenericNS("xsi"));
			element.setAttribute("curveType","sine");
			Attribute amplitude = element.getAttribute("amplitude");
			amplitude.detach();
			customPropsValue.append(getStringValue(amplitude));
			customPropsValue.append(" ");
			
			Attribute offset = element.getAttribute("yOffset");
			offset.detach();
			customPropsValue.append(getStringValue(offset));
			
			customPropsValue.append(" ");
			customPropsValue.append(getPeriodAndShiftVals(element));
			
			Element customProps = new Element("customProperties");
			customProps.setAttribute("key", "old_definition_0.9.4");
			element.addContent(customProps);
			
			Element value = new Element("value");
			value.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
			value.setAttribute("value", customPropsValue.toString().trim());
			customProps.addContent(value);
		}

	}
	
	private void update_ClockTriangleFunction(Element rootElement) {
		final String xpath = "./stimuliModel/clocks[@xsi:type=\"am:ClockTriangleFunction\"]";
		
		final List<Element> clocks = this.helper.getXpathResult(rootElement, xpath,
				Element.class, this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		StringBuilder customPropsValue =new StringBuilder();
		for (Element element : clocks) {
			element.setAttribute("type", "am:ClockFunction", this.helper.getGenericNS("xsi"));
			element.setAttribute("curveType","triangle");
			Attribute max = element.getAttribute("max");
			max.detach();
			customPropsValue.append(getStringValue(max));
			customPropsValue.append(" ");
			 
			Attribute min = element.getAttribute("min");
			min.detach();
			customPropsValue.append(getStringValue(min));
			
			customPropsValue.append(" ");
			customPropsValue.append(getPeriodAndShiftVals(element));
		
			
			Element customProps = new Element("customProperties");
			customProps.setAttribute("key", "old_definition_0.9.4");
			element.addContent(customProps);
			
			Element value = new Element("value");
			value.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
			value.setAttribute("value", customPropsValue.toString().trim());
			customProps.addContent(value);
		}

	}
	
	private String getPeriodAndShiftVals(Element ele) {
		StringBuilder str = new StringBuilder();
		List<Element> children = ele.getChildren();
		for (Element element : children) {
			str.append(element.getName());
			str.append("=");
			str.append(element.getAttributeValue("value"));
			str.append(" ");
		}

		ele.removeChild("period");
		ele.removeChild("shift");
		
		return str.toString();
	}
	
	private String getStringValue(Attribute attr) {
		String str = attr.getName()+"="+attr.getValue();
		
		return str;
	}

	private void update_ClocksMulitplierList(final Element rootElement) {
		final String xpath = "./stimuliModel/clocks[@xsi:type=\"am:ClockMultiplierList\"]";
		
		final List<Element> clocks = this.helper.getXpathResult(rootElement, xpath,
				Element.class, this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		for (Element element : clocks) {
			 element.setAttribute("type", "am:ClockStepList", this.helper.getGenericNS("xsi"));
			 update_ClockEntries(element);
			 
		}
	}
	
	private void update_ClockEntries(Element clockElement) {
		List<Element> entries = clockElement.getChildren("entries");
		for (Element element : entries) {
			Attribute multiplier = element.getAttribute("multiplier");
			Element customProps = new Element("customProperties");
			element.addContent(customProps);
			customProps.setAttribute("key", "multiplier");
			
			Element value = new Element("value");
			value.setAttribute("type", "am:DoubleObject", this.helper.getGenericNS("xsi"));
			customProps.addContent(value);
			
			multiplier.detach();
		}
	}
	

}
