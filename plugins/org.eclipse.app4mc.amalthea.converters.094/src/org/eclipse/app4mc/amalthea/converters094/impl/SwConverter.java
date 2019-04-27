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

package org.eclipse.app4mc.amalthea.converters094.impl;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters094.utils.HelperUtils_093_094;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter extends AbstractConverter {

	public SwConverter() {
		this.helper = HelperUtils_093_094.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File file, final Map<File, Document> map, final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.3 to 0.9.4 : Executing Sw converter for model file : " + file.getName());

		basicConvert(file, map, caches);
	}

	public void basicConvert(final File file, final Map<File, Document> map, final List<ICache> caches) {

		final Document document = map.get(file);
		if (document == null) {
			return;
		}
		
		final Element rootElement = document.getRootElement();
		
		update_Runnables(rootElement);
		update_Datatypes(rootElement);
		
		update_ModeLabels(rootElement);
		update_ModeLabelAccesses(rootElement);
		
		update_ModeValueLists(rootElement);
		update_ModeConditions(rootElement);
		update_EnablingModeValueLists(rootElement);	
	}
	
	private void update_Datatypes(final Element rootElement) {
		final String xpath ="./swModel/typeDefinitions[@xsi:type=\"am:BaseTypeDefinition\"]";
		
		final List<Element> types = this.helper.getXpathResult(rootElement, xpath,
				Element.class, this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		for (Element baseType : types) {
			for (Element mapping : baseType.getChildren("dataMapping")) {
				String platformName = mapping.getAttributeValue("platformName");
				String platformType = mapping.getAttributeValue("platformType");
				
				mapping.removeAttribute("platformName");
				mapping.removeAttribute("platformType");
				
				mapping.setName("aliases");
				mapping.setAttribute("target", platformName);
				mapping.setAttribute("alias", platformType);
			}
		}
	}

	private void update_Runnables(final Element rootElement) {
		final String xpath = "./swModel/runnables";

		final List<Element> runnables = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		Element constraintModel = rootElement.getChild("constraintsModel");

		if (constraintModel == null) {
			constraintModel = new Element("constraintsModel");
			//rootElement.addContent(constraintModel);
		}
		boolean deadlineFound = false;
		for (Element runnable : runnables) {
			Element deadline = runnable.getChild("deadline");
			String runnableName = runnable.getAttributeValue("name");

			if (deadline != null) {
				deadlineFound = true;
				// create RunnableRequirement
				Element runnableReq = new Element("requirements");
				constraintModel.addContent(runnableReq);
				runnableReq.setAttribute("type", "am:RunnableRequirement", this.helper.getGenericNS("xsi"));
				runnableReq.setAttribute("name", "deadline");
				runnableReq.setAttribute("runnable", this.helper.encodeName(runnableName) + "?type=Runnable");

				Element limit = new Element("limit");
				runnableReq.addContent(limit);
				limit.setAttribute("type", "am:TimeRequirementLimit", this.helper.getGenericNS("xsi"));
				limit.setAttribute("limitType", "UpperLimit");
				limit.setAttribute("metric", "ResponseTime");

				Element limitValue = deadline.clone();
				limitValue.setName("limitValue");
				limit.addContent(limitValue);

				runnable.removeContent(deadline);
			}
		}
		
		if(deadlineFound) {
			rootElement.addContent(constraintModel);
		}
	}

	private void update_ModeLabels(final Element rootElement) {
		String xpath;
		
		// convert Modes
		xpath = "./swModel/modes";

		final List<Element> modes = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		for (Element mode : modes) {
			mode.setAttribute("type", "am:EnumMode", this.helper.getGenericNS("xsi"));
		}

		// convert ModeLabels
		xpath = "./swModel/modeLabels";

		final List<Element> modeLabels = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));

		for (Element modeLabel : modeLabels) {
			
			// modify attribute (standard reference)
			String attributeValue = modeLabel.getAttributeValue("initialValue");
			if (attributeValue != null) {
				// pattern: "mode/literal?type=modeliteral"
				Pattern p = Pattern.compile("(.+)/(.+)\\?type=ModeLiteral");
				Matcher m = p.matcher(attributeValue);
				if (m.find()) {
					String mode = m.group(1);
					String literal = this.helper.decodeName(m.group(2));
					
					modeLabel.setAttribute("mode", mode + "?type=EnumMode");
					modeLabel.setAttribute("initialValue", literal);					
				}
			}
			
			// modify content (cross file reference)
			Element element = getSingleChild(modeLabel, "initialValue");
			if (element != null) {
				String hrefValue = element.getAttributeValue("href");
				if (hrefValue != null) {
					// pattern: "amlt:/#mode/literal?type=modeliteral"
					Pattern p = Pattern.compile("amlt:/#(.+)/(.+)\\?type=ModeLiteral");
					Matcher m = p.matcher(hrefValue);
					if (m.find()) {
						String mode = m.group(1);
						String literal = this.helper.decodeName(m.group(2));
						
						element.setName("mode");
						element.setAttribute("type", "am:EnumMode", this.helper.getGenericNS("xsi"));
						element.setAttribute("href", "amlt:/#" + mode + "?type=EnumMode");
						
						modeLabel.setAttribute("initialValue", literal);					
					}
				}
			}
		}
	}

	private void update_ModeLabelAccesses(final Element rootElement) {
		// convert mode label access in RunnableItems
		final String xpath = "./swModel/runnables//*[@xsi:type=\"am:ModeLabelAccess\"]";
		
		final List<Element> modeLabelAccesses = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		for (Element modeLabelAccess : modeLabelAccesses) {
			// convert access "write" to "set"
			Attribute access = modeLabelAccess.getAttribute("access");
			if (access != null) {
				if(access.getValue().equals("write")) {
					access.setValue("set");
				}				
			}
			
			// modify attribute (standard reference)
			Attribute modeValue = modeLabelAccess.getAttribute("modeValue");
			if (modeValue != null) {
				modeValue.setName("value");
				modeValue.setValue(extractAndDecodeLiteral(modeValue.getValue()));
			}
			
			// modify content (cross file reference)
			Element element = getSingleChild(modeLabelAccess, "modeValue");
			if (element != null) {
				String hrefValue = element.getAttributeValue("href");
				if (hrefValue != null) {
					modeLabelAccess.setAttribute("value", extractAndDecodeLiteral(hrefValue));
					modeLabelAccess.removeChild("modeValue");
				}
			}
		}
	}
	
	private void update_ModeValueLists(final Element rootElement) {
		// convert mode assignments in mode value lists
		final String xpath ="./stimuliModel/stimuli/setModeValueList/entries";
		
		final List<Element> assignments = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		for (Element assignment : assignments) {
			convertModeValueContents(assignment);
		}
	}

	private void update_ModeConditions(final Element rootElement) {
		// handle mode value
		final String xpath =
			"./swModel/runnables//*[@xsi:type=\"am:RunnableModeSwitch\"]/entries/condition/entries"
		+ "|./swModel/tasks//*[@xsi:type=\"am:ModeSwitch\"]/entries/condition/entries"
		+ "|./stimuliModel/stimuli/enablingModeValueList/entries";
				
		final List<Element> conditionDisjunctionEntries = this.helper.getXpathResult(rootElement, xpath,
				Element.class, this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
	
		for (Element disjunctionEntry : conditionDisjunctionEntries) {
			String entryType = disjunctionEntry.getAttributeValue("type", this.helper.getGenericNS("xsi"));
			
			if (entryType.equals("am:ModeValue")) {
				convertModeValue(disjunctionEntry, true);
			}
			else if (entryType.equals("am:ModeValueConjunction")) {
				disjunctionEntry.setAttribute("type", "am:ModeConditionConjunction", this.helper.getGenericNS("xsi"));
				for (Element modeValue : disjunctionEntry.getChildren("entries")) {
					convertModeValue(modeValue, false);
				}
			}
		}
	}

	private void convertModeValue(final Element modeValueElement, boolean setType) {
		if (setType) {
			modeValueElement.setAttribute("type", "am:ModeCondition", this.helper.getGenericNS("xsi"));	
		}

		modeValueElement.setAttribute("relation", "EQUAL");
		convertModeValueContents(modeValueElement);
	}

	private void convertModeValueContents(final Element modeValueElement) {
		
		// 1. rename valueProvider to label
		
		// - modify attribute (standard reference)
		Attribute providerAttribute = modeValueElement.getAttribute("valueProvider");
		if (providerAttribute != null) {
			providerAttribute.setName("label");
		}
		
		// - modify content (cross file reference)
		Element providerElement = getSingleChild(modeValueElement, "valueProvider");
		if (providerElement != null) {
			providerElement.setName("label");
		}
		
		// 2. extract and set value
		
		// modify attribute (standard reference)
		String refValue = modeValueElement.getAttributeValue("value");
		if (refValue != null) {
			modeValueElement.setAttribute("value", extractAndDecodeLiteral(refValue));
		}
		
		// modify content (cross file reference)
		Element valueElement = getSingleChild(modeValueElement, "value");
		if (valueElement != null) {
			String hrefValue = valueElement.getAttributeValue("href");
			if (hrefValue != null) {
				modeValueElement.setAttribute("value", extractAndDecodeLiteral(hrefValue));
				modeValueElement.removeChild("value");
			}
		}
	}

	private void update_EnablingModeValueLists(final Element rootElement) {
		final String xpath = "./stimuliModel/stimuli";
		
		final List<Element> stimuli = this.helper.getXpathResult(rootElement, xpath, Element.class,
				this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		for (Element stimulus : stimuli) {
			// rename enabling list
			Element enablingList = getSingleChild(stimulus, "enablingModeValueList");
			if(enablingList != null) {
				enablingList.setName("executionCondition");
			}
			
			// remove disabling list
			Element disablingList = getSingleChild(stimulus, "disablingModeValueList");
			if (disablingList != null) {
				// TODO log removal
				stimulus.removeChild("disablingModeValueList");
			}
		}
	}
	
	
	// helper methods

	private String extractAndDecodeLiteral(String modeValueReference) {
		String value = modeValueReference;
		Pattern p = Pattern.compile(".*/(.+?)\\?type=ModeLiteral");
		Matcher m = p.matcher(value);
		if(m.find()) {
			return this.helper.decodeName(m.group(1));
		}
		
		return modeValueReference;
	}
	
	private Element getSingleChild(final Element parent, String name) {
		List<Element> list = parent.getChildren(name);
		if (list.size() == 1) {
			return list.get(0);
		} else {
			return null;
		}
	}

}
