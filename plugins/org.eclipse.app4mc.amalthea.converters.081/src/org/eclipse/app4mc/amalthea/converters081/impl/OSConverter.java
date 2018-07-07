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
 * This class is responsible for converting the OS Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class OSConverter extends AbstractConverter {

	public OSConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing OS converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateOSModel(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to migrate the OS model data 
	 * 
	 * 1. AlgorithmParameter elements to ParameterExtension inside UserSpecificSchedulingAlgorithm : For further
	 * details, check : Bug 518070  
	 * 
	 * 2. Removal of SchedulingUnit from TaskScheduler and InterruptContoller elements. For further details check : 
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateOSModel(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./osModel/operatingSystems/interruptControllers");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers");
		
		
		final List<Element> sourceElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
 

		for (Element schedulerElement : sourceElements) { 
			
			//Changing model based on : Bug 518070  
			
			final List<Element> algorithmParameterElements = this.helper.getXpathResult(schedulerElement, "./schedulingAlgorithm[@xsi:type=\"am:UserSpecificSchedulingAlgorithm\"]/parameter",
					Element.class, this.helper.getGenericNS("xsi"));

			 for (Element algorithmParameterElement : algorithmParameterElements) {
				
				 algorithmParameterElement.setName("parameterExtensions");
			}
			
			 /*====================== Changing model based on : Bug 519746 ======================*/
			 
			//Adding customProperty "scheduleUnitPriority"
			 
			String scheduleUnitPriority= schedulerElement.getAttributeValue("scheduleUnitPriority");
			 
			if(scheduleUnitPriority!=null && !scheduleUnitPriority.equals("0")){
				addCustomProperty(schedulerElement, "scheduleUnitPriority", schedulerElement.getAttributeValue("scheduleUnitPriority"));
			}
			 
			//removal of scheduleUnitPriority attribute
			schedulerElement.removeAttribute("scheduleUnitPriority");
			
			Element schedulingUnitElement = schedulerElement.getChild("schedulingUnit");
			
			if(schedulingUnitElement !=null){
				
				this.logger.warn("SchedulingUnit removed from Scheduler : "+ schedulerElement.getAttributeValue("name"));
				
				String schedulingUnitType = schedulingUnitElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
				
				if(schedulingUnitType !=null){
					
					if(schedulingUnitType.equals("am:SchedulingHWUnit")){
						
						moveCustomPropertiesOfSchedulingUnit(schedulerElement, schedulingUnitElement,"SchedulingHWUnit_CustomProperty__");
						 
						//Adding customProperty "delay"
						Element delayElement = schedulingUnitElement.getChild("delay");
						if(delayElement!=null){
							delayElement.detach();
							
							Element customPropertiesElement=new Element("customProperties");
							
							customPropertiesElement.setAttribute("key", "SchedulingHWUnit___delay");
							
							delayElement.setName("value");
							
							delayElement.setAttribute("type", "am:TimeObject", this.helper.getGenericNS("xsi"));
							
							//adding as a value to CustomProperty
							customPropertiesElement.addContent(delayElement);
							
							//adding customProperty to Scheduler Eleemnt
							schedulerElement.addContent(customPropertiesElement);
							
							addCustomProperty(schedulerElement, "SchedulingHWUnit___delay", schedulerElement.getAttributeValue("delay"));
						}
						
						
					}else if(schedulingUnitType.equals("am:SchedulingSWUnit")){
						
						moveCustomPropertiesOfSchedulingUnit(schedulerElement, schedulingUnitElement,"SchedulingSWUnit_CustomProperty__");
						
						/*- fetching all Instruction elements and associating to RunnableInstructions */
						List<Element> instructionElements = schedulingUnitElement.getChildren("instructions");
						
						if(instructionElements.size()>0){
							this.logger.warn("-- Instructions inside SchedulingSWUnit are migrated to RunnableInstructions element");
						}
						
						for (Element instructionElement : instructionElements) {
							
							Element clone = instructionElement.clone();
							
							clone.setName("default");
							
							Element computationItemElement=new Element("computationItems");
							
							computationItemElement.setAttribute("type", "am:RunnableInstructions", this.helper.getGenericNS("xsi"));
							
							computationItemElement.addContent(clone);
							
							schedulerElement.addContent(computationItemElement);
							
						}
						
						//Adding customProperty "priority"
						
						String priority=schedulingUnitElement.getAttributeValue("priority");
						
						if(priority !=null && !priority.equals("0")){
							addCustomProperty(schedulerElement, "SchedulingSWUnit___priority", priority);
						}
						
						//removing interruptController
						if(schedulingUnitElement.removeAttribute("interruptController") || schedulingUnitElement.removeChild("interruptController")){
							this.logger.warn("-- InterruptController inside SchedulingSWUnit is removed, as there is no equivalent element for it in AMALTHEA 0.8.1");
						}
						
					}
				}
				
				
				/*- removing SchedulingHWUnit --*/
				
				schedulerElement.removeChild("schedulingUnit");
				

			}
			
		}


		
		
	}

	private void moveCustomPropertiesOfSchedulingUnit(Element schedulerElement, Element schedulingUnitElement, String prefix) {
		
		List<Element> customPropertyElements = schedulingUnitElement.getChildren("customProperties");
		
		for (Element customProperty : customPropertyElements) {
			
			Element cloneCustomProperty = customProperty.clone();
			
			Attribute keyAttribute = cloneCustomProperty.getAttribute("key");
			
			if(keyAttribute !=null){
				String value = keyAttribute.getValue();
				keyAttribute.setValue(prefix+value);
			}
			
			/*- adding CustomProperty to Scheduler */
			
			schedulerElement.addContent(cloneCustomProperty);
			
		}
	}
	
 
}
