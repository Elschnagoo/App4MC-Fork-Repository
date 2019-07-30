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
		// migrate scenario
		update_Scenario(rootElement);

		// migrate clocks
		update_ClocksMulitplierList(rootElement);
		update_ClockSineFunction(rootElement);
		update_ClockTriangleFunction(rootElement);
	}

	private void update_Scenario(Element rootElement) {
		final String xpath = "./stimuliModel/stimuli[@xsi:type=\"am:VariableRateStimulus\"]/scenario";

		final List<Element> scenarios = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		for (Element element : scenarios) {
			Element recurrence = element.getChild("recurrence");
			if (recurrence != null) {
				recurrence.detach();

				String value = recurrence.getAttributeValue("value");
				String unit = recurrence.getAttributeValue("unit");

				addCustomProperty(element, "old_definition_v0.9.4", "recurrence=" + value + unit);
			}
		}
	}

	private void update_ClockSineFunction(Element rootElement) {
		final String xpath = "./stimuliModel/clocks[@xsi:type=\"am:ClockSinusFunction\"]";

		final List<Element> clocks = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		StringBuilder customPropsValue = new StringBuilder();
		for (Element element : clocks) {
			element.setAttribute("type", "am:ClockFunction", this.helper.getGenericNS("xsi"));
			element.setAttribute("curveType", "sine");

			Attribute amplitude = element.getAttribute("amplitude");
			amplitude.detach();
			customPropsValue.append(getStringValue(amplitude));
			customPropsValue.append(" ");

			Attribute offset = element.getAttribute("yOffset");
			offset.detach();
			customPropsValue.append(getStringValue(offset));
			customPropsValue.append(" ");

			customPropsValue.append(extractPeriodAndShift(element));

			addCustomProperty(element, "old_definition_v0.9.4", customPropsValue.toString().trim());
		}
	}

	private void update_ClockTriangleFunction(Element rootElement) {
		final String xpath = "./stimuliModel/clocks[@xsi:type=\"am:ClockTriangleFunction\"]";

		final List<Element> clocks = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		StringBuilder customPropsValue = new StringBuilder();
		for (Element element : clocks) {
			element.setAttribute("type", "am:ClockFunction", this.helper.getGenericNS("xsi"));
			element.setAttribute("curveType", "triangle");

			Attribute max = element.getAttribute("max");
			max.detach();
			customPropsValue.append(getStringValue(max));
			customPropsValue.append(" ");

			Attribute min = element.getAttribute("min");
			min.detach();
			customPropsValue.append(getStringValue(min));
			customPropsValue.append(" ");

			customPropsValue.append(extractPeriodAndShift(element));

			addCustomProperty(element, "old_definition_v0.9.4", customPropsValue.toString().trim());
		}
	}

	private String extractPeriodAndShift(Element element) {
		StringBuilder str = new StringBuilder();
		List<Element> children = element.getChildren();
		for (Element e : children) {
			str.append(e.getName());
			str.append("=");
			str.append(e.getAttributeValue("value"));
			str.append(e.getAttributeValue("unit"));
			str.append(" ");
		}

		element.removeChild("period");
		element.removeChild("shift");

		return str.toString();
	}

	private String getStringValue(Attribute attr) {
		String str = attr.getName() + "=" + attr.getValue();

		return str;
	}

	private void update_ClocksMulitplierList(final Element rootElement) {
		final String xpath = "./stimuliModel/clocks[@xsi:type=\"am:ClockMultiplierList\"]";

		final List<Element> clocks = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		for (Element element : clocks) {
			element.setAttribute("type", "am:ClockStepList", this.helper.getGenericNS("xsi"));
			update_ClockEntries(element);

		}
	}

	private void update_ClockEntries(Element clockElement) {
		List<Element> entries = clockElement.getChildren("entries");
		for (Element entry : entries) {
			Attribute multiplier = entry.getAttribute("multiplier");
			multiplier.detach();

			addCustomProperty(entry, "old_definition_v0.9.4", "multiplier=" + multiplier.getValue());
		}
	}

	private void addCustomProperty(Element element, String key, String value) {
		Element customProps = new Element("customProperties");
		// set key
		customProps.setAttribute("key", key);
		// set value
		Element valueElement = new Element("value");
		valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
		valueElement.setAttribute("value", value);
		customProps.addContent(valueElement);

		element.addContent(customProps);
	}

}
