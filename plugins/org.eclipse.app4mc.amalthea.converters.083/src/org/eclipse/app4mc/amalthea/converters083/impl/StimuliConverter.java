/*******************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters083.impl;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters083.utils.HelperUtils_082_083;
import org.eclipse.app4mc.amalthea.converters083.utils.PeriodicStimulusCacheBuilder;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the Stimulus model elements from 0.8.2 to 0.8.3 version format of AMALTHEA model
 *
 * @author zmeer
 *
 */
public class StimuliConverter extends AbstractConverter {

	private List<ICache> caches;
	private PeriodicStimulusCacheBuilder periodicStimulusCacheBuilder;
	
	public StimuliConverter() {
		this.helper = HelperUtils_082_083.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.2 to 0.8.3  : Executing Stimulus model converter for model file : "
				+ targetFile.getName());

		this.caches = caches;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		
		final Element rootElement = root.getRootElement();


		migrateSyntheticStimulus(rootElement);
		
		migrateSporadicStimulus(rootElement);

		migrateArrivalCurveStimulus(rootElement);

		migrateSingleStimulus(rootElement);

		migrateRemainingStimulusTypes(rootElement);
		
		migratePeriodicStimulus(rootElement);
		
		migrateStimulusReferences(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}
	

	

	/**
	 * This method is used to get the PeriodicStimulusCacheBuilder object
	 *
	 * @return PeriodicStimulusCacheBuilder
	 */
	private PeriodicStimulusCacheBuilder getPeriodicStimulusCacheBuilder() {

		if (this.periodicStimulusCacheBuilder == null) {
			for (final ICache cache : this.caches) {

				if (cache instanceof PeriodicStimulusCacheBuilder) {
					this.periodicStimulusCacheBuilder = (PeriodicStimulusCacheBuilder) cache;
					return this.periodicStimulusCacheBuilder;
				}
			}
		}

		return this.periodicStimulusCacheBuilder;
	}
	
	private void migrateStimulusReferences(Element rootElement) {

	// updating the references 
		
		final StringBuffer xpathBufferForReferences = new StringBuffer();

		xpathBufferForReferences.append("./swModel/isrs");
		xpathBufferForReferences.append("|");
		xpathBufferForReferences.append("./swModel/tasks");
		xpathBufferForReferences.append("|");
		xpathBufferForReferences.append("./eventModel/events");
		
		final List<Element> stimulusReferenceContainers = this.helper.getXpathResult(rootElement, xpathBufferForReferences.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element stimulusReferenceContainer : stimulusReferenceContainers) {

			migrate_references_PeriodicStimulus(stimulusReferenceContainer);
			migrate_references_SporadicStimulus(stimulusReferenceContainer);
			migrate_references_SyntheticStimulus(stimulusReferenceContainer);
		}
	}
	
	/**
	 * This method is used to migrate the contents of PeriodicStimulus  based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migratePeriodicStimulus(Element rootElement) {

		
		final StringBuffer xpathBufferForDefinition = new StringBuffer();

		xpathBufferForDefinition.append("./stimuliModel/stimuli[@xsi:type=\"am:PeriodicStimulus\"]");
		 
		
		final List<Element> stimulusElements = this.helper.getXpathResult(rootElement, xpathBufferForDefinition.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element stimulusElement : stimulusElements) {

			if((stimulusElement.getChild("clock")==null) && (stimulusElement.getAttribute("clock")==null)) {
				//renaming stimulusDeviation to jitter  
				Element stimulusDeviationElement = stimulusElement.getChild("stimulusDeviation");
				if(stimulusDeviationElement !=null) {
					stimulusDeviationElement.setName("jitter");
				}
				
			}else {
				//changing the type of PeriodicStimulus to VariableRateStimulus
				
				Attribute typeAttribute = stimulusElement.getAttribute("type", helper.getGenericNS("xsi"));

				typeAttribute.setValue("am:VariableRateStimulus");
				
				//renaming recurrence to step  
				Element recurrenceElement = stimulusElement.getChild("recurrence");
				if(recurrenceElement !=null) {
					recurrenceElement.setName("step");
				}
				
				stimulusElement.removeChild("offset");
				stimulusElement.removeChild("stimulusDeviation");
				
			}
			 
			
			
		}
		
	}

	/**
	 * This method is used to verify if a PeriodicStimulus type be changed to VariableRateStimulus (as it consists of Clock definition. Based on 0.8.3 -> such PeriodicStimulus elements type are changed)
	 * @param elementName href (e.g: "amlt:/#Timer_10MS?type=PeriodicStimulus ")
	 * @return boolean ("true" - if PeriodicStimulus is containing Clock reference, else "false")
	 */
	
	private boolean canPeriodicStimulusTypeBeChangedForHref(String href) {
		/*
		 * Example: <stimuli xsi:type="am:PeriodicStimulus" href="amlt:/#Timer_10MS?type=PeriodicStimulus"/>
		 * 
		 * parameter : "href" -> contains amlt:/#Timer_10MS?type=PeriodicStimulus 
		 */

		int start = href.indexOf("#");
		int end = href.lastIndexOf("?");

		if((start !=-1) & (end !=-1)) {

			String elementName=href.substring(start+1, end);

			
			boolean result=isPeriodicStimulusPresentInCache(elementName);
			
			return result;
		}
		return false;
	}

	/**
	 * This method is used to verify if a PeriodicStimulus is avaialble in Cache (Note: Storage in cache is done only if Clock is referred inside PeriodicStimulus element)
	 * @param elementName String (e.g: "testStimulus")
	 * @return boolean ("true" - if PeriodicStimulus is containing Clock reference, else "false")
	 */
	private boolean isPeriodicStimulusPresentInCache(String elementName) {
		Map<File, Map<String, Object>> cacheMap = getPeriodicStimulusCacheBuilder().getCacheMap();
		
		if(cacheMap !=null) {
			
			Set<File> keySet = cacheMap.keySet();
			
			for (File file : keySet) {
				
				Map<String, Object> map = cacheMap.get(file);
				
				if(map!=null) {
					Object object = map.get(PeriodicStimulusCacheBuilder.cache_key);
					
					if(object !=null) {
						@SuppressWarnings("unchecked")
						final List<String> periodicStimulus_with_clock = (List<String>) object;
						
						if(periodicStimulus_with_clock.contains(elementName)) {
							return true;
						}
						
					}
					
				}
			}
		}
		
		return false;
	}
	
	/**
	 * This method is used to check and update the reference of PeriodicStimulus.
	 * Note: 
	 * 1. If PeriodicStimulus consists of clock, then type of it should be changed to VariableRateStimulus
	 * 2. If PeriodicStimulus doesn't contain clock definition -> type should remain as PeriodicStimulus
	 * 
	 * @param reference String (e.g: "ss1?type=SporadicStimulus")
	 * @return String - Updated string with type info (only if PeriodicStimulus element consists of clock )
	 */
	private String checkAndUpdatePeriodicStimulusReference(String reference) {
	
		/*
		 * Example: <tasks name="t3" stimuli="ss1?type=SporadicStimulus" multipleTaskActivationLimit="0"/>
		 * 
		 * parameter : "reference" -> contains ss1?type=SporadicStimulus 
		 */
		
		int index=reference.lastIndexOf("?");
		
		if(index !=-1) {
			String elementName=reference.substring(0, index);

			boolean result=isPeriodicStimulusPresentInCache(elementName);
			
			if(result) {
				elementName=reference.replace("?type=PeriodicStimulus", "?type=VariableRateStimulus");
				
				return elementName;

			}
		}
		
		return reference;
		
	}
	
	/**
	 * This method is used to migrate the contents of CustomStimulus, InterProcessStimulus, EventStimulus  based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateRemainingStimulusTypes(Element rootElement) {
		
		
		final StringBuffer xpathBufferForDefinition = new StringBuffer();
		
		xpathBufferForDefinition.append("./stimuliModel/stimuli[@xsi:type=\"am:CustomStimulus\" or @xsi:type=\"am:InterProcessStimulus\" or @xsi:type=\"am:EventStimulus\"]");
		
		
		final List<Element> stimulusElements = this.helper.getXpathResult(rootElement, xpathBufferForDefinition.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element stimulusElement : stimulusElements) {
			
			
			//removing stimulusDeviation  
			stimulusElement.removeChild("stimulusDeviation");
			
			
		}
	}


	/**
	 * This method is used to migrate the contents of SingleStimulus based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateSingleStimulus(Element rootElement) {

		
		// Step 1: changing the type from SyntheticStimulus to PeriodicSyntheticStimulus 
		final StringBuffer xpathBufferForDefinition = new StringBuffer();

		xpathBufferForDefinition.append("./stimuliModel/stimuli[@xsi:type=\"am:SingleStimulus\"]");
		 
		
		final List<Element> stimulusElements = this.helper.getXpathResult(rootElement, xpathBufferForDefinition.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element stimulusElement : stimulusElements) {

			 
			//removing stimulusDeviation  
			stimulusElement.removeChild("stimulusDeviation");
			
			//changing the activation tag name to occurrence 
			
			Element activationElement = stimulusElement.getChild("activation");
			
			if(activationElement !=null) {
				activationElement.setName("occurrence");
			}
			
		}
	}

	/**
	 * This method is used to migrate the contents of ArrivalCurveStimulus based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateArrivalCurveStimulus(Element rootElement) {

		
		// Step 1: changing the type from SyntheticStimulus to PeriodicSyntheticStimulus 
		final StringBuffer xpathBufferForDefinition = new StringBuffer();

		xpathBufferForDefinition.append("./stimuliModel/stimuli[@xsi:type=\"am:ArrivalCurveStimulus\"]");
		 
		
		final List<Element> stimulusElements = this.helper.getXpathResult(rootElement, xpathBufferForDefinition.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element stimulusElement : stimulusElements) {

			 
			//removing stimulusDeviation  
			stimulusElement.removeChild("stimulusDeviation");
			
			//changing the attribute name from numberOfEvents to numberOfOccurences
			
			List<Element> entriesElements = stimulusElement.getChildren("entries");
			
			for (Element entriesElement : entriesElements) {
				Attribute attribute = entriesElement.getAttribute("numberOfEvents");
				
				if(attribute !=null) {
					attribute.setName("numberOfOccurrences");
				}
			}
			
		}
	}
	

	/**
	 * This method is used to migrate the contents of SporadicStimulus based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateSporadicStimulus(Element rootElement) {

		
		// Step 1: changing the type from SyntheticStimulus to PeriodicSyntheticStimulus 
		final StringBuffer xpathBufferForDefinition = new StringBuffer();

		xpathBufferForDefinition.append("./stimuliModel/stimuli[@xsi:type=\"am:SporadicStimulus\"]");
		 
		
		final List<Element> sporadicStimulusElements = this.helper.getXpathResult(rootElement, xpathBufferForDefinition.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element sporadicStimulusElement : sporadicStimulusElements) {

			Attribute typeAttribute = sporadicStimulusElement.getAttribute("type", helper.getGenericNS("xsi"));

			typeAttribute.setValue("am:RelativePeriodicStimulus");

			//changing of stimulusDeviation to nextOccurrence
			Element stimulusDeviationElement = sporadicStimulusElement.getChild("stimulusDeviation");
			
			if(stimulusDeviationElement !=null) {
				stimulusDeviationElement.setName("nextOccurrence");
			}
			
		}
		
	 
		
	}

	
	
	
	/**
	 * This method is used to migrate the contents of SyntheticStimulus based on the changes introduced as per Bug 529831
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void migrateSyntheticStimulus(Element rootElement) {

		
		// Step 1: changing the type from SyntheticStimulus to PeriodicSyntheticStimulus 
		final StringBuffer xpathBufferForDefinition = new StringBuffer();

		xpathBufferForDefinition.append("./stimuliModel/stimuli[@xsi:type=\"am:SyntheticStimulus\"]");
		 
		
		final List<Element> syntheticStimulusElements = this.helper.getXpathResult(rootElement, xpathBufferForDefinition.toString(),
				Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
		
		for (Element syntheticStimulusElement : syntheticStimulusElements) {

			Attribute typeAttribute = syntheticStimulusElement.getAttribute("type", helper.getGenericNS("xsi"));

			typeAttribute.setValue("am:PeriodicSyntheticStimulus");

			//deletion of stimulusDeviation
			syntheticStimulusElement.removeChild("stimulusDeviation");
			
			Element periodElement = syntheticStimulusElement.getChild("period");
			
			if(periodElement!=null) {
				periodElement.setName("recurrence");
			}
			Element triggerTimesElement = syntheticStimulusElement.getChild("triggerTimes");
			
			if(triggerTimesElement!=null) {
				
				final List<Element> timeStampsElements = this.helper.getXpathResult(triggerTimesElement, ".//timestamps",
						Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_083("am") );
				
				for (Element timeStampsElement : timeStampsElements) {
					timeStampsElement.setName("occurenceTimes");
					timeStampsElement.detach();
					syntheticStimulusElement.addContent(timeStampsElement);
				}
				
				//removing element triggerTimesElement
				syntheticStimulusElement.removeContent(triggerTimesElement);
			}
			
			
		}
		
	}

 
	
	/**
	 * This method is used to migrate the references of SporadicStimulus elements
	 * @param stimulusReferenceContainer (e.g: tasks, isrs, events)
	 */
	private void migrate_references_SporadicStimulus(Element stimulusReferenceContainer) {
		String containerTagName = stimulusReferenceContainer.getName();
		if(containerTagName.equals("isrs")||containerTagName.equals("tasks")) {
			
			 List<Element> stimuliElements = stimulusReferenceContainer.getChildren("stimuli");
			 Attribute stimuliAttribute = stimulusReferenceContainer.getAttribute("stimuli");
			 
			 for (Element stimuliElement : stimuliElements) {
					
					if(stimuliElement!=null) {
						
						Attribute typeAttribute = stimuliElement.getAttribute("type", helper.getGenericNS("xsi"));

						if(typeAttribute !=null) {
							if(typeAttribute.getValue().equals("am:SporadicStimulus")) {
								typeAttribute.setValue("am:RelativePeriodicStimulus");
							}
						}
						
						Attribute hrefAttribute = stimuliElement.getAttribute("href");
						if(hrefAttribute!=null) {
							String value = hrefAttribute.getValue();
							value=value.replace("?type=SporadicStimulus", "?type=RelativePeriodicStimulus");
							hrefAttribute.setValue(value);
						}
					}
			}
			 
			   if(stimuliAttribute !=null) {
					String value = stimuliAttribute.getValue();
					value=value.replaceAll("\\?type\\=SporadicStimulus", "?type=RelativePeriodicStimulus");
					stimuliAttribute.setValue(value);
				}
			
			
			
		}else if(containerTagName.equals("events")) {
			//case of events
			
			Element stimuliElement = stimulusReferenceContainer.getChild("entity");

			Attribute stimuliAttribute = stimulusReferenceContainer.getAttribute("entity");

			if(stimuliElement!=null) {
				
				Attribute typeAttribute = stimuliElement.getAttribute("type", helper.getGenericNS("xsi"));

				if(typeAttribute !=null) {
					if(typeAttribute.getValue().equals("am:SporadicStimulus")) {
						typeAttribute.setValue("am:RelativePeriodicStimulus");
					}
				}
				
				Attribute hrefAttribute = stimuliElement.getAttribute("href");
				if(hrefAttribute !=null) {
					String value = hrefAttribute.getValue();
					value=value.replace("?type=SporadicStimulus", "?type=RelativePeriodicStimulus");
					hrefAttribute.setValue(value);
					
				}
			}else if(stimuliAttribute !=null) {
				String value = stimuliAttribute.getValue();
				value=value.replace("?type=SporadicStimulus", "?type=RelativePeriodicStimulus");
				stimuliAttribute.setValue(value);
			}
		}
	}
	
	/**
	 * This method is used to migrate the references of Synthetic Stimulus references
	 * @param syntheticStimulusReferenceContainer (e.g: tasks, isrs, events)
	 */
	private void migrate_references_SyntheticStimulus(Element syntheticStimulusReferenceContainer) {
		String containerTagName = syntheticStimulusReferenceContainer.getName();
		if(containerTagName.equals("isrs")||containerTagName.equals("tasks")) {
			
			 List<Element> stimuliElements = syntheticStimulusReferenceContainer.getChildren("stimuli");
			 Attribute stimuliAttribute = syntheticStimulusReferenceContainer.getAttribute("stimuli");
			 
			 for (Element stimuliElement : stimuliElements) {
					
					if(stimuliElement!=null) {
						
						Attribute typeAttribute = stimuliElement.getAttribute("type", helper.getGenericNS("xsi"));

						if(typeAttribute !=null) {
							if(typeAttribute.getValue().equals("am:SyntheticStimulus")) {
								typeAttribute.setValue("am:PeriodicSyntheticStimulus");
							}
						}
						
						Attribute hrefAttribute = stimuliElement.getAttribute("href");
						if(hrefAttribute!=null) {
							String value = hrefAttribute.getValue();
							value=value.replace("?type=SyntheticStimulus", "?type=PeriodicSyntheticStimulus");
							hrefAttribute.setValue(value);
						}
					}
			}
			 
			   if(stimuliAttribute !=null) {
					String value = stimuliAttribute.getValue();
					value=value.replaceAll("\\?type\\=SyntheticStimulus", "?type=PeriodicSyntheticStimulus");
					stimuliAttribute.setValue(value);
				}
			
			
			
		}else if(containerTagName.equals("events")) {
			//case of events
			
			Element stimuliElement = syntheticStimulusReferenceContainer.getChild("entity");

			Attribute stimuliAttribute = syntheticStimulusReferenceContainer.getAttribute("entity");

			if(stimuliElement!=null) {
				
				Attribute typeAttribute = stimuliElement.getAttribute("type", helper.getGenericNS("xsi"));

				if(typeAttribute !=null) {
					if(typeAttribute.getValue().equals("am:SyntheticStimulus")) {
						typeAttribute.setValue("am:PeriodicSyntheticStimulus");
					}
				}
				
				Attribute hrefAttribute = stimuliElement.getAttribute("href");
				if(hrefAttribute !=null) {
					String value = hrefAttribute.getValue();
					value=value.replace("?type=SyntheticStimulus", "?type=PeriodicSyntheticStimulus");
					hrefAttribute.setValue(value);
					
				}
			}else if(stimuliAttribute !=null) {
				String value = stimuliAttribute.getValue();
				value=value.replace("?type=SyntheticStimulus", "?type=PeriodicSyntheticStimulus");
				stimuliAttribute.setValue(value);
			}
		}
	}


	/**
	 * This method is used to migrate the references of PeriodicStimulus elements
	 * @param stimulusReferenceContainer (e.g: tasks, isrs, events)
	 */
	private void migrate_references_PeriodicStimulus(Element stimulusReferenceContainer) {
		String containerTagName = stimulusReferenceContainer.getName();
		if(containerTagName.equals("isrs")||containerTagName.equals("tasks")) {

			List<Element> stimuliElements = stimulusReferenceContainer.getChildren("stimuli");

			Attribute stimuliAttribute = stimulusReferenceContainer.getAttribute("stimuli");

			for (Element stimuliElement : stimuliElements) {

				if(stimuliElement!=null) {


					Attribute typeAttribute = stimuliElement.getAttribute("type", helper.getGenericNS("xsi"));

					if(typeAttribute !=null) {
						if(typeAttribute.getValue().equals("am:PeriodicStimulus")) {

							Attribute hrefAttribute = stimuliElement.getAttribute("href");
							if(hrefAttribute!=null) {
								String hrefValue = hrefAttribute.getValue();
								//<stimuli xsi:type="am:PeriodicStimulus" href="amlt:/#Timer_10MS?type=PeriodicStimulus"/>
								if(canPeriodicStimulusTypeBeChangedForHref(hrefValue)) {
									//setting type
									typeAttribute.setValue("am:VariableRateStimulus");

									hrefValue=hrefValue.replace("?type=PeriodicStimulus", "?type=VariableRateStimulus");

									hrefAttribute.setValue(hrefValue);
								}
							}

						}
					}

				}
			}

			if(stimuliAttribute !=null) {
				String value = stimuliAttribute.getValue();

				String[] split = value.split("\\s+");

				StringBuffer updatedRefsBuffer=new StringBuffer();

				for (String reference : split) {

					if(reference.contains("?type=PeriodicStimulus")) {

						updatedRefsBuffer.append(checkAndUpdatePeriodicStimulusReference(reference)+" ");
					}else {
						updatedRefsBuffer.append(reference+" ");
					}
				}
				value=updatedRefsBuffer.toString().trim();

				stimuliAttribute.setValue(value);
			}



		}else if(containerTagName.equals("events")) {
			//case of events

			Element stimuliElement = stimulusReferenceContainer.getChild("entity");

			Attribute stimuliAttribute = stimulusReferenceContainer.getAttribute("entity");

			if(stimuliElement!=null) {

				Attribute typeAttribute = stimuliElement.getAttribute("type", helper.getGenericNS("xsi"));

				if(typeAttribute !=null) {
					if(typeAttribute.getValue().equals("am:PeriodicStimulus")) {


						Attribute hrefAttribute = stimuliElement.getAttribute("href");
						if(hrefAttribute !=null) {
							String hrefValue = hrefAttribute.getValue();

							//<stimuli xsi:type="am:PeriodicStimulus" href="amlt:/#Timer_10MS?type=PeriodicStimulus"/>
							if(canPeriodicStimulusTypeBeChangedForHref(hrefValue)) {
								//setting type

								typeAttribute.setValue("am:VariableRateStimulus");

								hrefValue=hrefValue.replace("?type=PeriodicStimulus", "?type=VariableRateStimulus");

								hrefAttribute.setValue(hrefValue);
							}
						}

					}
				}


			}else if(stimuliAttribute !=null) {
				String reference = stimuliAttribute.getValue();

				if(reference.contains("?type=PeriodicStimulus")) {

					reference= (checkAndUpdatePeriodicStimulusReference(reference));
				}
				stimuliAttribute.setValue(reference);
			}
		}
	}

}
