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

package org.eclipse.app4mc.amalthea.converters081.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters081.utils.HelperUtils_080_081;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the SW Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class SwConverter extends AbstractConverter {

	public SwConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing Software converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateRunnable(rootElement);
		
		updateActivations(rootElement);

		updateAllAbstractProcessElements(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to remove priority from sub-classes of AbstractProcess (For further
	 * details, check : Bug 511284, 518070  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateAllAbstractProcessElements(Element rootElement) {
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/tasks");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/processPrototypes");

		final List<Element> abstractProcessElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		for (Element abstractProcessElement : abstractProcessElements) {
			
			Attribute priorityAttribute = abstractProcessElement.getAttribute("priority");
			
			if(priorityAttribute !=null){
				String value = priorityAttribute.getValue();
				
				/*-- removing attribute based on the metamodel changes introduced in 0.8.1 --*/
				
				abstractProcessElement.removeAttribute(priorityAttribute);
				
				if(!value.equals("0")){
 					
					Element customPropertiesElement=new Element("customProperties");
					
					customPropertiesElement.setAttribute("key", "priority");
					
					Element valueElement=new Element("value");
					
					valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
					
					valueElement.setAttribute("value", value);
					
					customPropertiesElement.addContent(valueElement);
					
					abstractProcessElement.addContent(customPropertiesElement);
					
					this.logger.info("Priority is removed from : "+abstractProcessElement.getName()+" element ("+abstractProcessElement.getAttributeValue("name")+") and added as a CustomProperty with key as Priority");
					
				}
				
			}
			
			/*-- removing osekTaskGroup attribute inside Task element:  based on the metamodel changes introduced in 0.8.1 --*/
			
			if(abstractProcessElement.getName().equals("tasks")){
				
				 Attribute osekTaskGroupAttribute = abstractProcessElement.getAttribute("osekTaskGroup");
				 
				 if(osekTaskGroupAttribute !=null){
					 
					 String osekTaskGroupValue = osekTaskGroupAttribute.getValue();
					 
					 abstractProcessElement.removeAttribute(osekTaskGroupAttribute);
					 
					 if(!osekTaskGroupValue.equals("0")){
						 addCustomProperty(abstractProcessElement, "osekTaskGroup", osekTaskGroupValue);
						 
						 this.logger.info("osekTaskGroup attribute is removed from Task ("+abstractProcessElement.getAttributeValue("name")+") and added as a CustomProperty with key as osekTaskGroup");
					 }
					 
				 }
				
				
			}
			
		}
		
		
	}

	/**
	 * This method is used to migrate the Runnable data to support multiple Activations (For further
	 * details, check : Bug 519357  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateRunnable(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables");
		
		
		final List<Element> runnableElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
 
		

		for (Element runnableElement : runnableElements) { 
			
			Attribute activationAttribute = runnableElement.getAttribute("activation");
			Element activationElement = runnableElement.getChild("activation");
			
			if(activationAttribute !=null){
				activationAttribute.setName("activations");
			}else if(activationElement !=null){
				activationElement.setName("activations");
			}
		}


		
		
	}
	/**
	 * This method is used to migrate both PeriodicAtivation (removal of deadline ) and EventActivation (change of trigger tag to triggeringEvents)
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateActivations(Element rootElement) {
		
		
		final StringBuffer xpathBuffer = new StringBuffer();
		
		xpathBuffer.append("./swModel/activations");
		
		
		final List<Element> activationElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		
		boolean removedDeadLine=false;
		
		for (Element activationElement : activationElements) { 
			
			if(activationElement.getAttributeValue("type", this.helper.getGenericNS("xsi")).contains("am:PeriodicActivation")){
				
				Element deadlineElement = activationElement.getChild("deadline");
				
				if(deadlineElement !=null){
					
					deadlineElement.detach();
					
					
					Element customPropertiesElement=new Element("customProperties");
					
					customPropertiesElement.setAttribute("key", "deadline");
					
					deadlineElement.setName("value");
					
					deadlineElement.setAttribute("type", "am:TimeObject", this.helper.getGenericNS("xsi"));
					
					//adding as a value to CustomProperty
					customPropertiesElement.addContent(deadlineElement);
					
					//adding customProperty to Activation Eleemnt
					activationElement.addContent(customPropertiesElement);
					
				removedDeadLine=true;
					
				}

			}else if(activationElement.getAttributeValue("type", this.helper.getGenericNS("xsi")).contains("am:EventActivation")){
				
				List<Element> triggerElements = activationElement.getChildren("trigger");

				if(triggerElements !=null){
					for (Element element : triggerElements) {
						element.setName("triggeringEvents");
					}
				}
				
				Attribute triggerAttribute = activationElement.getAttribute("trigger");
				
				if(triggerAttribute!=null){
					triggerAttribute.setName("triggeringEvents");
				}
				
				
			}
			 
		}
		
		if(removedDeadLine){
			this.logger.warn("-- Deadline inside PeriodicActivation elements is removed, as there is no equivalent element for it in AMALTHEA 0.8.1");
		}
		
		
		
		
	}
 
}
