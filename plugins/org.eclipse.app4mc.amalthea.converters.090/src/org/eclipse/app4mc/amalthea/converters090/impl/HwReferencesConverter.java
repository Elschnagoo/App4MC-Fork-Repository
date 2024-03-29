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

package org.eclipse.app4mc.amalthea.converters090.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters090.utils.HWCacheBuilder;
import org.eclipse.app4mc.amalthea.converters090.utils.HWTransformationCache;
import org.eclipse.app4mc.amalthea.converters090.utils.HelperUtils_083_090;
import org.jdom2.Attribute;
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
		
		migrateCPUPercentageRequirementLimit(rootElement);
	}

	
	private void migrateRunnableInstructionsEntry(Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables//*[@xsi:type=\"am:RunnableInstructions\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers/computationItems[@xsi:type=\"am:RunnableInstructions\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/interruptControllers/computationItems[@xsi:type=\"am:RunnableInstructions\"]");

		final List<Element> runnableInstructionsEntries = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		if(runnableInstructionsEntries.size()>0) {
			//in this case, HWFeatureCategory should be referenced in the newly created ExecutionNeed elements.
			
			if(this.hwTransformationCache.new_feature_categories_Map.containsKey("Instructions")==false) {
				checkAndCreateHWFeatureCategory(rootElement);
			}
		}

		for (Element runnableInstruction : runnableInstructionsEntries) {

			Element parentElementOfRunnableInstruction = runnableInstruction.getParentElement();

			String tagName = runnableInstruction.getName();

			int indexOfRunnableInstructions=parentElementOfRunnableInstruction.indexOf(runnableInstruction);

			//		runnableInstructions.detach(); //removing element from parent

			Element executionNeedElement=new Element(tagName);

			executionNeedElement.setAttribute("type", "am:ExecutionNeed", this.helper.getGenericNS("xsi"));

			migrateValueOfRunnableInstructions(runnableInstruction, executionNeedElement,"default");


			List<Element> oldExtendedElements = runnableInstruction.getChildren("extended");

			for (Element oldExtendedElement : oldExtendedElements) {

				Element newExtendedSubElement=new Element("extended");

				Map<String, String> coresMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("key", oldExtendedElement);


				for(String coreName:coresMap.keySet()) {

					Element puReference=new Element("key");
					puReference.setAttribute("href", "amlt:/#"+this.helper.encodeNameForReference(coreName)+"?type=ProcessingUnitDefinition");
					newExtendedSubElement.addContent(puReference);

				}

				migrateValueOfRunnableInstructions(oldExtendedElement, newExtendedSubElement, "value");

				//Adding the extended elements to Execution element
				executionNeedElement.addContent(newExtendedSubElement);

			}

			parentElementOfRunnableInstruction.addContent(indexOfRunnableInstructions,executionNeedElement);

			runnableInstruction.detach();


		}

	}

	private void checkAndCreateHWFeatureCategory(Element rootElement) {
		Element hwModelEleemnt = rootElement.getChild("hwModel");
		
		if(hwModelEleemnt==null) {
			hwModelEleemnt=new Element("hwModel");
			rootElement.addContent(hwModelEleemnt);
		}
		
		Element featureCategoriesElement=new Element("featureCategories");
		featureCategoriesElement.setAttribute("name", "Instructions");
		featureCategoriesElement.setAttribute("featureType", "performance");
		hwModelEleemnt.addContent(featureCategoriesElement);
	}

	private void migrateValueOfRunnableInstructions(Element runnableInstruction, Element executionNeedElement, String valueTagName) {
		Element oldDefaultElement = runnableInstruction.getChild(valueTagName);

		if(oldDefaultElement!=null) {

			String oldElement_defaultType = oldDefaultElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));

			if(oldElement_defaultType!=null) {
				if(oldElement_defaultType.equals("am:InstructionsConstant")) {

					String oldDefault_value = oldDefaultElement.getAttributeValue("value");

					if(oldDefault_value!=null) {

						Element newDefaultSubElement=new Element(valueTagName);

						if(valueTagName.equals("default")) {
							newDefaultSubElement.setAttribute("key", "Instructions");
						}else {
							newDefaultSubElement.setAttribute("key", "Instructions");
							/*Element newKeyElement=new Element("key");

						newKeyElement.setAttribute("href", "amlt:/#Instructions?type=HwFeatureCategory");
							
						newDefaultSubElement.addContent(newKeyElement);*/
						}
						

						Element newValueElement=new Element("value");

						newValueElement.setAttribute("type", "am:NeedConstant", this.helper.getGenericNS("xsi"));

						newValueElement.setAttribute("value", oldDefault_value);


						newDefaultSubElement.addContent(newValueElement);

						//Adding newly created default element here
						executionNeedElement.addContent(newDefaultSubElement);

					}

				}else if(oldElement_defaultType.equals("am:InstructionsDeviation")) {

					Element newDefaultSubElement=new Element(valueTagName);

					
					if(valueTagName.equals("default")) {
						newDefaultSubElement.setAttribute("key", "Instructions");
					}else {
						
						/*Element newKeyElement=new Element("key");

						newKeyElement.setAttribute("href", "amlt:/#Instructions?type=HwFeatureCategory");
						
						newDefaultSubElement.addContent(newKeyElement);*/
						
						
						newDefaultSubElement.setAttribute(new Attribute("key", "Instructions"));

					}

					Element newValueElement=new Element("value");

					
					newValueElement.setAttribute("type", "am:NeedDeviation", this.helper.getGenericNS("xsi"));

					Element oldDeviationElement = oldDefaultElement.getChild("deviation");

					if(oldDeviationElement!=null) {

						Element newDeviationElement = oldDeviationElement.clone();

						newDeviationElement.detach();

						newValueElement.addContent(newDeviationElement);

					}

					newDefaultSubElement.addContent(newValueElement);

					//Adding newly created default element here
					executionNeedElement.addContent(newDefaultSubElement);
				}
			}


		}
}


	private void migrateEvents(Element rootElement) {
		
		Element eventModel = rootElement.getChild("eventModel");
		
		if(eventModel!=null) {
			
			List<Element> events = eventModel.getChildren("events");
			
			for (Element event : events) {
				
				Map<String, String> coresMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("core", event);

				event.removeChildren("core");
				event.removeAttribute("core");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element memoryElement=new Element("processingUnit");
					memoryElement.setAttribute("href", "amlt:/#"+this.helper.encodeNameForReference(coreName)+"?type=ProcessingUnit");
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
				
				Map<String, String> coresMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("coreAffinity", taskAllocation);

				taskAllocation.removeChildren("coreAffinity");
				taskAllocation.removeAttribute("coreAffinity");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element processingUnitElement=new Element("affinity");
					processingUnitElement.setAttribute("href", "amlt:/#"+this.helper.encodeNameForReference(coreName)+"?type=ProcessingUnit");
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
				Map<String, String> coresMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("responsibility", schedulerAllocation);

				schedulerAllocation.removeChildren("responsibility");
				schedulerAllocation.removeAttribute("responsibility");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element memoryElement=new Element("responsibility");
					//Info : In this case, CoreName is already encoded. Encoding again will cause problems w.r.t. association to its definition
					memoryElement.setAttribute("href", "amlt:/#"+ (coreName)+"?type=ProcessingUnit");
					schedulerAllocation.addContent(memoryElement);
				
				}
				
				//Step 2: modifying executingCore tag
				
				 coresMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("executingCore", schedulerAllocation);

				schedulerAllocation.removeChildren("executingCore");
				schedulerAllocation.removeAttribute("executingCore");
				
				for(String coreName:coresMap.keySet()) {
					 
					Element memoryElement=new Element("executingPU");
					memoryElement.setAttribute("href", "amlt:/#"+ (coreName)+"?type=ProcessingUnit");
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
				
				Map<String, String> memoriesMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("memory", physicalSectionMapping);

				physicalSectionMapping.removeChildren("memory");
				physicalSectionMapping.removeAttribute("memory");
				
				for(String memoryName:memoriesMap.keySet()) {
					//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
					
					if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
						Element memoryElement=new Element("memory");
						memoryElement.setAttribute("href", "amlt:/#"+ (memoryName)+"?type=Memory");
						physicalSectionMapping.addContent(memoryElement);
					}else {
						if(hwTransformationCache.new_caches_Map.containsKey(memoryName)) {
							this.helper.logger.warn("In 0.8.3, Memory : \""+memoryName+"\" referred as a Target element in AffinityConstraint is no longer a valid Target element. \r\n -- As in 0.9.0 -> this Memory element is transformed to Cache ");
						}
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
				
				Map<String, String> memoriesMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("memory", memroyMapping);

				memroyMapping.removeChildren("memory");
				memroyMapping.removeAttribute("memory");
				
				for(String memoryName:memoriesMap.keySet()) {
					//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
					
					if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
						Element memoryElement=new Element("memory");
						memoryElement.setAttribute("href", "amlt:/#"+ (memoryName)+"?type=Memory");
						memroyMapping.addContent(memoryElement);
					}else {
						if(hwTransformationCache.new_caches_Map.containsKey(memoryName)) {
							this.helper.logger.warn("In 0.8.3, Memory : \""+memoryName+"\" referred as a Target element in AffinityConstraint is no longer a valid Target element. \r\n -- As in 0.9.0 -> this Memory element is transformed to Cache ");
						}
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
				
				Map<String, String> memoriesMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("memories", physicalSectionContraint);

				physicalSectionContraint.removeChildren("memories");
				physicalSectionContraint.removeAttribute("memories");
				
				for(String memoryName:memoriesMap.keySet()) {
					//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
					
					if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
						Element memoryElement=new Element("memories");
						memoryElement.setAttribute("href", "amlt:/#"+ (memoryName)+"?type=Memory");
						physicalSectionContraint.addContent(memoryElement);
					}else {
						if(hwTransformationCache.new_caches_Map.containsKey(memoryName)) {
							this.helper.logger.warn("In 0.8.3, Memory : \""+memoryName+"\" referred as a Target element in AffinityConstraint is no longer a valid Target element. \r\n -- As in 0.9.0 -> this Memory element is transformed to Cache ");
							
						}
					
					}
				}
				
			}
			
			
		}
	}
	
	
	private void migrateCPUPercentageRequirementLimit(Element rootElement) {
		Element constraintsModel = rootElement.getChild("constraintsModel");
		
		if(constraintsModel!=null) {
			List<Element> requirements = constraintsModel.getChildren("requirements");
			
			for (Element requirement : requirements) {

				
				List<Element> limitElements = requirement.getChildren("limit");
				
				for (Element limitElement : limitElements) {
					String limitElementType = limitElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
					if(limitElementType!=null && limitElementType.equals("am:CPUPercentageRequirementLimit")) {
						
						Map<String, String> complexNodesMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("hardwareContext", limitElement);
						
						limitElement.removeChildren("hardwareContext");
						limitElement.removeAttribute("hardwareContext");
						
						for(String complexNodeName:complexNodesMap.keySet()) {
							
							String complexNodeType=complexNodesMap.get(complexNodeName);
							
							if(complexNodeType!=null && complexNodeType.equals("Core")) {
								Element puElement=new Element("hardwareContext");
								puElement.setAttribute("href", "amlt:/#"+complexNodeName+"?type=ProcessingUnit");
								limitElement.addContent(puElement);
							}else {
								this.helper.logger.warn("As per 0.9.0 : Only ProcessingUnit element can be referred inside CPUPercentageRequirementLimit as a hardwareContext.\r\n Reference of : "+complexNodeName+" of type :" +complexNodeType+" is removed : as it is not valid as per 0.9.0");
							}
							
							 
						}
						
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
						
						Map<String, String> memoriesMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("memories", targetMemory);

						targetMemory.removeChildren("memories");
						targetMemory.removeAttribute("memories");
						
						for(String memoryName:memoriesMap.keySet()) {
							//verify if the memory name is still transformed in 0.9.0 as Memory only .. as based on certain properties, it could also be transformed as a Cache and it should not be referred
							
							if(hwTransformationCache.new_memories_Map.containsKey(memoryName)) {
								Element memoryElement=new Element("memories");
								memoryElement.setAttribute("href", "amlt:/#"+ (memoryName)+"?type=Memory");
								targetMemory.addContent(memoryElement);
							}else {

								if(hwTransformationCache.new_caches_Map.containsKey(memoryName)) {
									this.helper.logger.warn("In 0.8.3, Memory : \""+memoryName+"\" referred as a Target element in AffinityConstraint is no longer a valid Target element. \r\n -- As in 0.9.0 -> this Memory element is transformed to Cache ");
									
								}
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
					
					Map<String, String> coresMap = this.helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("cores", targetCore);

					targetCore.removeChildren("cores");
					targetCore.removeAttribute("cores");
					
					for(String coreName:coresMap.keySet()) {
						 
						Element memoryElement=new Element("cores");
						memoryElement.setAttribute("href", "amlt:/#"+ (coreName)+"?type=ProcessingUnit");
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