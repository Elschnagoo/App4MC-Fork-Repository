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
package org.eclipse.app4mc.amalthea.converters081.impl;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters081.utils.HelperUtils_080_081;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the Stimuli Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class StimuliConverter extends AbstractConverter {

	public StimuliConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing Stimuli converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateAllModeValueListEntryElements(rootElement);
		
		updateAllStimulusElements(rootElement);
		
		updateCustomPropertiesForStimulus(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void updateCustomPropertiesForStimulus(Element rootElement) {
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//customProperties/value[@value]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//customProperties/value/value");
		xpathBuffer.append("|");
		xpathBuffer.append(".//customProperties//values[@value]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//customProperties//values/value");
		
		
		Map<String, String> namesMap=new HashMap<String, String>();

		namesMap.put("ArrivalCurve","ArrivalCurveStimulus");
		namesMap.put("InterProcess","InterProcessStimulus");
		namesMap.put("Periodic","PeriodicStimulus");
		namesMap.put("PeriodicEvent","VariableRateStimulus");
		namesMap.put("Single","SingleStimulus");
		namesMap.put("Sporadic","SporadicStimulus");
		namesMap.put("Synthetic","SyntheticStimulus");

		
		
		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		for (Element element : elements) {
			
			Attribute typeAttribute = element.getAttribute("type", this.helper.getGenericNS("xsi"));

			Attribute valueAttribute = element.getAttribute("value");
			
			Attribute hrefAttribute = element.getAttribute("href");
			
			/*-
			 * Case 1:  <value xsi:type="am:ReferenceObject" value="no-name?type=ArrivalCurve"/>
			 * 
			 */
			if(typeAttribute !=null && valueAttribute !=null){
				
				String value = valueAttribute.getValue();
			 
				final int indexOfEquals = value.indexOf("=");
				
				if(indexOfEquals!=-1){
					String stimulusName = value.substring(indexOfEquals+1, value.length());
					
					if(namesMap.containsKey(stimulusName)){
						
						String newValue = value.substring(0, indexOfEquals+1)+namesMap.get(stimulusName);
						
						valueAttribute.setValue(newValue);
						
					}
				}
					
			}
			
			/*-
			 * Case 2:   <value xsi:type="am:EventStimulus" href="amlt:/#foreignEventStimulus?type=EventStimulus"/>
			 */
			else if((valueAttribute == null) && (hrefAttribute !=null) && (typeAttribute !=null)){
				
				updateStimulusTypeAttribute(element);
				
			 
				String value = hrefAttribute.getValue();
				 
				final int indexOfEquals = value.indexOf("=");
				
				if(indexOfEquals!=-1){
					String stimulusName = value.substring(indexOfEquals+1, value.length());
					
					if(namesMap.containsKey(stimulusName)){
						
						String newValue = value.substring(0, indexOfEquals+1)+namesMap.get(stimulusName);
						
						hrefAttribute.setValue(newValue);
						
					}
				}
 
				
				
			}
			
			
			
		}
		
		
	}

	/**
	 * This method is used to migrate all EventStimulus elements + update type info of Stimulus elements (For further
	 * details, check : Bug 519925, Bug 519930  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateAllStimulusElements(Element rootElement) {

		updateAllStimulusElementsDefinition(rootElement);
		
		updateAllStimulusElementsReferences(rootElement);
		
	}

	private void updateAllStimulusElementsReferences(Element rootElement) {
		
		Map<String, String> old_new_StimulusNamesMap=new HashMap<String, String>();
		
		old_new_StimulusNamesMap.put("ArrivalCurve", "ArrivalCurveStimulus");
		old_new_StimulusNamesMap.put("InterProcess", "InterProcessStimulus");
		old_new_StimulusNamesMap.put("Periodic", "PeriodicStimulus");
		old_new_StimulusNamesMap.put("PeriodicEvent", "VariableRateStimulus");
		old_new_StimulusNamesMap.put("Single", "SingleStimulus");
		old_new_StimulusNamesMap.put("Sporadic", "SporadicStimulus");
		old_new_StimulusNamesMap.put("Synthetic", "SyntheticStimulus");
		

		final StringBuffer stimulusEventBuffer = new StringBuffer();

		stimulusEventBuffer.append("./eventModel/events[@xsi:type=\"am:StimulusEvent\"]");
		
		
		updateStimulusReferences(rootElement, old_new_StimulusNamesMap, stimulusEventBuffer, "entity",false);
		
		
		
		final StringBuffer processBuffer = new StringBuffer();
		processBuffer.append("./swModel/tasks");
		processBuffer.append("|");
		processBuffer.append("./swModel/isrs");

		updateStimulusReferences(rootElement, old_new_StimulusNamesMap, processBuffer, "stimuli",false);

		
		final StringBuffer interProcessActivationBuffer = new StringBuffer();
		
		interProcessActivationBuffer.append("./swModel/tasks//calls[@xsi:type=\"am:InterProcessActivation\"]");
		interProcessActivationBuffer.append("|");
		interProcessActivationBuffer.append("./swModel/isrs//calls[@xsi:type=\"am:InterProcessActivation\"]");
		
		updateStimulusReferences(rootElement, old_new_StimulusNamesMap, interProcessActivationBuffer, "stimulus",true);
		
	}

	private void updateStimulusReferences(Element rootElement, Map<String, String> old_new_StimulusNamesMap,
			final StringBuffer stimulusEventBuffer, String variableName, boolean isInterProcessActivation) {
		
		
		final List<Element> elements = this.helper.getXpathResult(rootElement, stimulusEventBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		for (Element targetElement : elements) {

			Attribute attribute = targetElement.getAttribute(variableName);

			if (attribute != null) {

				StringBuffer updatedValueBuffer = new StringBuffer();

				StringTokenizer stk = new StringTokenizer(attribute.getValue());

				while (stk.hasMoreTokens()) {

					String nextToken = stk.nextToken();

					updatedValueBuffer.append(getUpdatedStimulusReference(nextToken, old_new_StimulusNamesMap,isInterProcessActivation) + " ");

				}

				String trimmedValue = updatedValueBuffer.toString().trim();
				
				if(trimmedValue.length()!=0){
					attribute.setValue(trimmedValue);
				}else{
					attribute.detach();
				}
			}

			
			
			List<Element> children = 	this.helper.getXpathResult(targetElement, "./"+variableName,
					Element.class, this.helper.getGenericNS("xsi"));

			for (Element element : children) {
				
				if(isInterProcessActivation){
					
					//Note: in case of InterProcessActivation, only InterProcessStimulus is supported (for details refer : 519930)
					String attributeValue = element.getAttributeValue("type", this.helper.getGenericNS("xsi"));
					
					if(attributeValue!=null && ! attributeValue.equals("InterProcess") ){
						element.detach();
						continue;
					}
				}

				/*-- element will also have the type information, if in the model, contents are defined using its super class */
				
				updateStimulusTypeAttribute(element);
				
				
				/*--- below code is used to update the references */
				Attribute hrefAttribute = element.getAttribute("href");

				if (hrefAttribute != null) {
					String value = hrefAttribute.getValue();

					String updatedValue = getUpdatedStimulusReference(value, old_new_StimulusNamesMap,isInterProcessActivation);

					if (value.equals(updatedValue) == false) {
						hrefAttribute.setValue(updatedValue);
					}

				}
			}

			
			/*-
			 * update root elements type for InterProcessActivation as per the meta model change in 0.8.1:
			 */
			
			if(isInterProcessActivation){
				Attribute typeAttribute = targetElement.getAttribute("type",this.helper.getGenericNS("xsi"));
				
				if (typeAttribute != null) {

					String typeValue = typeAttribute.getValue();
					
					if(typeValue.equals("am:InterProcessActivation")){
						typeAttribute.setValue("am:InterProcessTrigger");
					}

				}
			}
		}
		
		
	
			
	}

	private String  getUpdatedStimulusReference(String token, Map<String, String> old_new_StimulusNamesMap, boolean isInterProcessActivation) {

		final int indexOfEquals = token.indexOf("=");
		
		if(indexOfEquals!=-1){
			String stimulusType = token.substring(indexOfEquals+1, token.length());
			
			//Note: in case of InterProcessActivation, only InterProcessStimulus is supported (for details refer : 519930)
			if(isInterProcessActivation && ! stimulusType.equals("InterProcess")){
				return "";
			}
			
			if(old_new_StimulusNamesMap.containsKey(stimulusType)){
				
			return	token.substring(0, indexOfEquals+1)+old_new_StimulusNamesMap.get(stimulusType);
			}
			
		}
		
		
		return token;
	}

	private void updateAllStimulusElementsDefinition(Element rootElement) {
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./stimuliModel/stimuli");

		final List<Element> stimulusElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		for (Element stimulusElement : stimulusElements) {
			
			updateStimulusTypeAttribute(stimulusElement);
			
			
		}
	}

	/**
	 * This method is used to update the type attribute of both Stimulus definition and references
	 * @param stimulusElement
	 */
	private void updateStimulusTypeAttribute(Element stimulusElement) {
		Attribute typeAttribute = stimulusElement.getAttribute("type",this.helper.getGenericNS("xsi"));
		
		if (typeAttribute != null) {

			String stimulusType = typeAttribute.getValue();

			if (stimulusType.equals("am:EventStimulus")) {

				/*-Model migration of EventStimulus element as per Bug 519925*/

				updateEventStimulus(stimulusElement);

			} else if (stimulusType.equals("am:ArrivalCurve")) {

				typeAttribute.setValue("am:ArrivalCurveStimulus");

			} else if (stimulusType.equals("am:InterProcess")) {

				typeAttribute.setValue("am:InterProcessStimulus");

			} else if (stimulusType.equals("am:Periodic")) {

				typeAttribute.setValue("am:PeriodicStimulus");

			} else if (stimulusType.equals("am:PeriodicEvent")) {

				typeAttribute.setValue("am:VariableRateStimulus");

			} else if (stimulusType.equals("am:Single")) {

				typeAttribute.setValue("am:SingleStimulus");

			} else if (stimulusType.equals("am:Sporadic")) {

				typeAttribute.setValue("am:SporadicStimulus");

			} else if (stimulusType.equals("am:Synthetic")) {

				typeAttribute.setValue("am:SyntheticStimulus");

			}
		}
	}

	/**
	 * This method is used to migrate all EventStimulus elements + (For further
	 * details, check : Bug 519925  )
	 * @param stimulusElement
	 */
	private void updateEventStimulus(Element stimulusElement) {
		Attribute triggerAttribute = stimulusElement.getAttribute("trigger");
		
		if(triggerAttribute!=null){
			 triggerAttribute.setName("triggeringEvents");
		}
		
		List<Element> triggerElements = stimulusElement.getChildren("trigger");
		
		if(triggerElements !=null ){
			for (Element triggerElement : triggerElements) {
				triggerElement.setName("triggeringEvents");
			}
		}
	}

	/**
	 * This method is used to migrate all ModeValueListEntry elements (For further
	 * details, check : Bug 519860 )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateAllModeValueListEntryElements(Element rootElement) {
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./stimuliModel/stimuli/setModeValueList/entries");
		xpathBuffer.append("|");
		xpathBuffer.append("./stimuliModel/stimuli/enablingModeValueList/entries");
		xpathBuffer.append("|");
		xpathBuffer.append("./stimuliModel/stimuli/disablingModeValueList/entries");

		final List<Element> modeValueListEntryElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		for (Element modeValueListEntry : modeValueListEntryElements) { 
			modeValueListEntry.setAttribute("type", "am:ModeValue", this.helper.getGenericNS("xsi"));
		}
		
	}
  
}
