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
package org.eclipse.app4mc.amalthea.converters090.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters090.utils.HWCacheBuilder;
import org.eclipse.app4mc.amalthea.converters090.utils.HWTransformationCache;
import org.eclipse.app4mc.amalthea.converters090.utils.HelperUtils_083_090;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.Iterables;

/**
 * This class is responsible for converting the HW Model elements from 0.8.3 to 0.9.0 version format of AMALTHEA model
 *
 * @author zmeer
 *
 */
public class HwReferencesConverter extends AbstractConverter {

	private List<ICache> caches;

	private HWTransformationCache hwTransformationCache;


	public HwReferencesConverter() {
		this.helper = HelperUtils_083_090.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	/*-
	 * As in 0.9.0, there is a major restructuring of HW data model -> 
	 * 				all model files HW data is transformed at once and its content is stored only inside a single HW model
	 */

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.3 to 0.9.0  : Executing \"HW model references converter\" for model file : "
				+ targetFile.getName());


		this.caches = caches;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*-getting the cache object */
		hwTransformationCache=getHWTransformationCache();


		updateReferencesInModel(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void updateReferencesInModel(Element rootElement) {

		migrateTargetMemory(rootElement);
		
		migratePhysicalSectionConstraint(rootElement);
		
		migrateMemoryMapping(rootElement);
		
		migratePhysicalSectionMapping(rootElement);
		
		migrateTargetCore(rootElement);
		
		migrateEvents(rootElement);
		
		migrateSchedulerAllocation(rootElement);
		
		migrateTaskAllocation(rootElement);
		
		migrateRunnableInstructionsEntry(rootElement);
	}

	
private void migrateRunnableInstructionsEntry(Element rootElement) {
	
	final StringBuffer xpathBuffer = new StringBuffer();
	
	xpathBuffer.append("./swModel/runnables//extended");
	xpathBuffer.append("|");
	xpathBuffer.append("./osModel/operatingSystems/taskSchedulers/computationItems[@xsi:type=\"am:RunnableInstructions\"]/extended");
	xpathBuffer.append("|");
	xpathBuffer.append("./osModel/operatingSystems/interruptControllers/computationItems[@xsi:type=\"am:RunnableInstructions\"]/extended");
	xpathBuffer.append("|");
	xpathBuffer.append("./swModel/tasks//extended");
	xpathBuffer.append("|");
	xpathBuffer.append("./swModel/isrs//extended");
	
	
	final List<Element> runnableInstructionsEntries = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
			Element.class, this.helper.getGenericNS("xsi"));
	
	for (Element runnableInstructionsEntry : runnableInstructionsEntries) {
		
		Element item = runnableInstructionsEntry.getParentElement();
		
		String itemType = item.getAttributeValue("type", this.helper.getGenericNS("xsi"));
		
		if(item!=null && itemType.equals("am:RunnableInstructions")) {
			
			Map<String, String> coresMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("key", runnableInstructionsEntry);

			runnableInstructionsEntry.removeChildren("key");
			runnableInstructionsEntry.removeAttribute("key");
			
			for(String coreName:coresMap.keySet()) {
				 
				Element puReference=new Element("key");
				puReference.setAttribute("href", "amlt:/#"+coreName+"?type=ProcessingUnitDefinition");
				runnableInstructionsEntry.addContent(puReference);
			
			}
		
		}
		
	}
	 
	}


	private void migrateEvents(Element rootElement) {
		
		Element eventModel = rootElement.getChild("eventModel");
		
		if(eventModel!=null) {
			
			List<Element> events = eventModel.getChildren("events");
			
			for (Element event : events) {
				
				Map<String, String> coresMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("core", event);

				event.removeChildren("core");
				event.removeAttribute("core");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element memoryElement=new Element("processingUnit");
					memoryElement.setAttribute("href", "amlt:/#"+coreName+"?type=ProcessingUnit");
					event.addContent(memoryElement);
				
				}
			}
		}
	}
	
	private void migrateTaskAllocation(Element rootElement) {
		
		Element mappingModel = rootElement.getChild("mappingModel");
		
		if(mappingModel!=null) {
			
			List<Element> taskAllocations = mappingModel.getChildren("taskAllocation");
			
			for (Element taskAllocation : taskAllocations) {
				
				Map<String, String> coresMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("coreAffinity", taskAllocation);

				taskAllocation.removeChildren("coreAffinity");
				taskAllocation.removeAttribute("coreAffinity");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element processingUnitElement=new Element("affinity");
					processingUnitElement.setAttribute("href", "amlt:/#"+coreName+"?type=ProcessingUnit");
					taskAllocation.addContent(processingUnitElement);
				
				}
				
			}
		}
	}
	
	private void migrateSchedulerAllocation(Element rootElement) {
		
		Element mappingModel = rootElement.getChild("mappingModel");
		
		if(mappingModel!=null) {
			
			List<Element> schedulerAllocations = mappingModel.getChildren("schedulerAllocation");
			
			for (Element schedulerAllocation : schedulerAllocations) {
				
				//Step 1:
				Map<String, String> coresMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("responsibility", schedulerAllocation);

				schedulerAllocation.removeChildren("responsibility");
				schedulerAllocation.removeAttribute("responsibility");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element memoryElement=new Element("responsibility");
					memoryElement.setAttribute("href", "amlt:/#"+coreName+"?type=ProcessingUnit");
					schedulerAllocation.addContent(memoryElement);
				
				}
				
				//Step 2: modifying executingCore tag
				
				 coresMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("executingCore", schedulerAllocation);

				schedulerAllocation.removeChildren("executingCore");
				schedulerAllocation.removeAttribute("executingCore");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element memoryElement=new Element("executingPU");
					memoryElement.setAttribute("href", "amlt:/#"+coreName+"?type=ProcessingUnit");
					schedulerAllocation.addContent(memoryElement);
				
				}
				
				
				
			}
		}
	}
	
	
	private void migratePhysicalSectionMapping(Element rootElement) {
		Element mappingModel = rootElement.getChild("mappingModel");
		
		if(mappingModel!=null) {
			List<Element> physicalSectionMappings = mappingModel.getChildren("physicalSectionMapping");
			
			for (Element physicalSectionMapping : physicalSectionMappings) {
				
				Map<String, String> memoriesMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("memory", physicalSectionMapping);

				physicalSectionMapping.removeChildren("memory");
				physicalSectionMapping.removeAttribute("memory");
				
				for(String memoryName:memoriesMap.keySet()) {
					//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
					
					if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
						Element memoryElement=new Element("memory");
						memoryElement.setAttribute("href", "amlt:/#"+memoryName+"?type=Memory");
						physicalSectionMapping.addContent(memoryElement);
					}else {
						//TODO: log message that memory reference is removed
					}
				}
				
			}
			
			
		}
	}
	
	private void migrateMemoryMapping(Element rootElement) {
		Element mappingModel = rootElement.getChild("mappingModel");
		
		if(mappingModel!=null) {
			List<Element> memoryMappings = mappingModel.getChildren("memoryMapping");
			
			for (Element memroyMapping : memoryMappings) {
				
				Map<String, String> memoriesMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("memory", memroyMapping);

				memroyMapping.removeChildren("memory");
				memroyMapping.removeAttribute("memory");
				
				for(String memoryName:memoriesMap.keySet()) {
					//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
					
					if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
						Element memoryElement=new Element("memory");
						memoryElement.setAttribute("href", "amlt:/#"+memoryName+"?type=Memory");
						memroyMapping.addContent(memoryElement);
					}else {
						//TODO: log message that memory reference is removed
					}
				}
				
			}
			
			
		}
	}
	
	
	private void migratePhysicalSectionConstraint(Element rootElement) {
		Element constraintsModel = rootElement.getChild("constraintsModel");
		
		if(constraintsModel!=null) {
			List<Element> physicalSectionConstraints = constraintsModel.getChildren("physicalSectionConstraints");
			
			for (Element physicalSectionContraint : physicalSectionConstraints) {
				
				Map<String, String> memoriesMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("memories", physicalSectionContraint);

				physicalSectionContraint.removeChildren("memories");
				physicalSectionContraint.removeAttribute("memories");
				
				for(String memoryName:memoriesMap.keySet()) {
					//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
					
					if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
						Element memoryElement=new Element("memories");
						memoryElement.setAttribute("href", "amlt:/#"+memoryName+"?type=Memory");
						physicalSectionContraint.addContent(memoryElement);
					}else {
						//TODO: log message that memory reference is removed
					}
				}
				
			}
			
			
		}
	}
	
	
	private void migrateTargetMemory(Element rootElement) {
		Element constraintsModel = rootElement.getChild("constraintsModel");
		
		if(constraintsModel!=null) {
			List<Element> affinityConstraints = constraintsModel.getChildren("affinityConstraints");
			
			for (Element affinityConstraint : affinityConstraints) {
				
				List<Element> targetMemories = affinityConstraint.getChildren("target");
				
				for (Element targetMemory : targetMemories) {
					String elementType = targetMemory.getAttributeValue("type", this.helper.getGenericNS("xsi"));
					if(elementType!=null && elementType.equals("am:TargetMemory")) {
						
						Map<String, String> memoriesMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("memories", targetMemory);

						targetMemory.removeChildren("memories");
						targetMemory.removeAttribute("memories");
						
						for(String memoryName:memoriesMap.keySet()) {
							//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
							
							if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
								Element memoryElement=new Element("memories");
								memoryElement.setAttribute("href", "amlt:/#"+memoryName+"?type=Memory");
								targetMemory.addContent(memoryElement);
							}else {
								//TODO: log message that memory reference is removed
							}
						}
						
					}
				}
			}
			
			
		}
	}
	
	
	private void migrateTargetCore(Element rootElement) {
		Element constraintsModel = rootElement.getChild("constraintsModel");
		
		if(constraintsModel!=null) {
			List<Element> affinityConstraints = constraintsModel.getChildren("affinityConstraints");
			
			for (Element affinityConstraint : affinityConstraints) {
				
				List<Element> targetCores = affinityConstraint.getChildren("target");
				
				for (Element targetCore : targetCores) {
					
					Map<String, String> coresMap = getMultipleElementsNameandTypeFromAttributeOrChildeElement("cores", targetCore);

					targetCore.removeChildren("cores");
					targetCore.removeAttribute("cores");
					
					for(String coreName:coresMap.keySet()) {
						 
						Element memoryElement=new Element("cores");
						memoryElement.setAttribute("href", "amlt:/#"+coreName+"?type=ProcessingUnit");
						targetCore.addContent(memoryElement);
					
					}
					
				
				}
			}
			
			
		}
	}
	
	
	/**
	 * This method is used to get the PeriodicStimulusCacheBuilder object
	 *
	 * @return PeriodicStimulusCacheBuilder
	 */
	private HWTransformationCache getHWTransformationCache() {

		if (this.hwTransformationCache == null) {

			boolean isHWCacheAvailable=false;

			for (final ICache cache : this.caches) {

				if (cache instanceof HWCacheBuilder) {
					isHWCacheAvailable=true;
					Map<File, Map<String, Object>> cacheMap = cache.getCacheMap();

					if(cacheMap!=null && cacheMap.size()>0) {
						Map<String, Object> map = Iterables.get(cacheMap.values(), 0);

						if(map!=null) {
							Object object = map.get("globalCache");

							return (HWTransformationCache) object;
						}

					}
				}
			}

			if(isHWCacheAvailable==false) {
				return new HWTransformationCache();
			}
		}
		return hwTransformationCache;

	}
}