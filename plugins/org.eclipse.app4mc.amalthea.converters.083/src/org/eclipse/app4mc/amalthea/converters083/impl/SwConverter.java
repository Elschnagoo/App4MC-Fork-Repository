/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters083.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters083.utils.HelperUtils_082_083;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the HW Model elements from 0.8.2 to 0.8.3 version format of AMALTHEA model
 *
 * @author zmeer
 *
 */
public class SwConverter extends AbstractConverter {

	public SwConverter() {
		this.helper = HelperUtils_082_083.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.2 to 0.8.3  : Executing Component model converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();


		migrateModeSwitchElements(rootElement);

		migrateVariableRateActivationElements(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to migrate the contents of VariableRateActivation based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateVariableRateActivationElements(Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/activations[@xsi:type=\"am:VariableRateActivation\"]");
		
		final List<Element> variableRateActivationElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element element : variableRateActivationElements) {
			
			element.removeChildren("activationDeviation");
		}
		
	}

	/**
	 * This method is used to migrate the contents of ModeSwitch based on the changes introduced as per Bug 528934
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateModeSwitchElements(Element rootElement) {
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/isrs/callGraph/graphEntries[@xsi:type=\"am:ModeSwitch\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/tasks/callGraph/graphEntries[@xsi:type=\"am:ModeSwitch\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs/callGraph/graphEntries//items[@xsi:type=\"am:ModeSwitch\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/tasks/callGraph/graphEntries//items[@xsi:type=\"am:ModeSwitch\"]");
		
		xpathBuffer.append("|");
		
		xpathBuffer.append("./swModel/runnables//runnableItems[@xsi:type=\"am:RunnableModeSwitch\"]");
		
		xpathBuffer.append("|");
		
		xpathBuffer.append("./swModel/runnables//items[@xsi:type=\"am:RunnableModeSwitch\"]");
		
		
		final List<Element> modeSwitchElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );

		updateModeSwitchElement(modeSwitchElements);
	}

	private void updateModeSwitchElement(final List<Element> modeSwitchElements) {
		//Setting xsi:type value of Port
		for (Element modeSwitchElement : modeSwitchElements) {

			boolean isLocalModeLabelUsed = false;
			String modeLabelValue = null;

			Attribute valueProviderAttribute = modeSwitchElement.getAttribute("valueProvider");

			Element valueProviderChild = modeSwitchElement.getChild("valueProvider");

			if (valueProviderAttribute != null) {
				isLocalModeLabelUsed = true;

				modeLabelValue = valueProviderAttribute.getValue();

				modeSwitchElement.removeAttribute(valueProviderAttribute);

			} else if (valueProviderChild != null) {

				modeLabelValue = valueProviderChild.getAttributeValue("href");

				modeSwitchElement.removeContent(valueProviderChild);
			}			
			
			//fetch  ModeSwitchEntry<GraphEntryBase>[] entries objects and migrate them
			
			List<Element> entriesElements = modeSwitchElement.getChildren("entries");
			
			for (Element entriesElement : entriesElements) {
				
				boolean isLocalLiteralsUsed=false;
				
				Attribute valuesAttribute = entriesElement.getAttribute("values");
				List<Element> valuesElements = entriesElement.getChildren("values");
				
				List<String> literals=new ArrayList<String>();
				
				if (valuesAttribute != null) {
					isLocalLiteralsUsed = true;

					String value = valuesAttribute.getValue();

					String[] split = value.split("\\s+");

					for (String string : split) {
						literals.add(string);
					}

					// removing this attribute, as it is not there in 0.8.3
					entriesElement.removeAttribute(valuesAttribute);

				} else if (valuesElements != null) {

					for (Element valueElement : valuesElements) {
						String attributeValue = valueElement.getAttributeValue("href");
						if (attributeValue != null) {
							literals.add(attributeValue);
						}
					}
					// removing this attribute, as it is not there in 0.8.3
					entriesElement.removeChildren("values");
				}				
				
				// creating Condition element and adding its children
				
				Element conditionElement=new Element("condition");
				
				for (String literal : literals) {
					
					Element entriesElementInsideConditionElement=new Element("entries");
					
					entriesElementInsideConditionElement.setAttribute("type", "am:ModeValue", helper.getGenericNS("xsi"));
					
					if (modeLabelValue != null) {
						if (isLocalModeLabelUsed) {
							entriesElementInsideConditionElement.setAttribute("valueProvider", modeLabelValue);
						} else {
							Element valueProviderElement = new Element("valueProvider");

							entriesElementInsideConditionElement.addContent(valueProviderElement);
						}
					}

					if (isLocalLiteralsUsed) {
						entriesElementInsideConditionElement.setAttribute("value", literal);

					} else {
						Element valueElement = new Element("value");

						valueElement.setAttribute("href", literal);

						entriesElementInsideConditionElement.addContent(valueElement);
					}

					conditionElement.addContent(entriesElementInsideConditionElement);
				}
				
				entriesElement.addContent(conditionElement);
			}
			
			
			/*- now checking for recursive ModeSwitch elements and handling them 
			
			for (Element entriesElement : entriesElements) {
				
				StringBuffer xpathForSubModeSwitchBuffer=new StringBuffer();
				xpathForSubModeSwitchBuffer.append("./items[@xsi:type=\"am:ModeSwitch\"]");
				xpathForSubModeSwitchBuffer.append("|");
				xpathForSubModeSwitchBuffer.append("./defaultEntry/items[@xsi:type=\"am:ModeSwitch\"]");
				
				
				final List<Element> submodeSwitchElements = this.helper.getXpathResult(entriesElement,xpathForSubModeSwitchBuffer.toString(),
						Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );

						updateModeSwitchElement(submodeSwitchElements);
						
					}*/
			
			
			
			
		 
			
		}
	}

  

}
