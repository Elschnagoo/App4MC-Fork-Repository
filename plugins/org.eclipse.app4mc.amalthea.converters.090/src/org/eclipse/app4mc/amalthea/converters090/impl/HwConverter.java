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
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

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
public class HwConverter extends AbstractConverter {

	private List<ICache> caches;

	private HWTransformationCache hwTransformationCache;

	private boolean hasProcessedQuartzes;

	private boolean hasProcessedCores;

	private boolean hasProcessedMemoryTypes;


	public HwConverter() {
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

		this.logger.info("Migration from 0.8.3 to 0.9.0  : Executing HW model converter for model file : "
				+ targetFile.getName());


		this.caches = caches;

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*-getting the cache object */
		hwTransformationCache=getHWTransformationCache();


		Element oldHWModelElement = rootElement.getChild("hwModel");

		migrateHWModel(rootElement, oldHWModelElement);
		
		updateReferencesInModel(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void updateReferencesInModel(Element rootElement) {
		
	}

	private void migrateHWModel(final Element rootElement, Element oldHWModelElement) {
		if(oldHWModelElement!=null) {

			final Element newHWModelElement=new Element("hwModel");
			
			if(!hasProcessedMemoryTypes) {

				hasProcessedMemoryTypes=true;

				migrateAllMemoryTypes_modelscope(newHWModelElement);
			}

			migrateCoreTypes(oldHWModelElement, newHWModelElement);

			migrateNetworkTypes(oldHWModelElement, newHWModelElement);


			Element oldHWSystem = oldHWModelElement.getChild("system");

			if(oldHWSystem!=null) {
				migrateSystem(newHWModelElement, oldHWSystem);
			}


			migrateLatencyAccessPath(oldHWModelElement, newHWModelElement);
			
			int indexOf = rootElement.indexOf(oldHWModelElement);

			rootElement.removeContent(oldHWModelElement); 

			rootElement.addContent(indexOf,newHWModelElement);

		}
	}


	private void migrateAllMemoryTypes_modelscope(Element newHWModelElement) {

		Collection<Element> oldHW_MemoryType_definitions = hwTransformationCache.old_memory_Types_Definition_Map.values();
		
		for (Element oldHWModelElement : oldHW_MemoryType_definitions) {
			
			migrateMemoryTypes(oldHWModelElement, newHWModelElement);
		}
		
		
	}

	private void migrateLatencyAccessPath(Element oldHWModelElement, Element newHWModelElement) {

		List<Element> oldHWAccessPaths= oldHWModelElement.getChildren("accessPaths");
		
		for (Element oldHWAccessPath : oldHWAccessPaths) {
			
			String oldHWAccessPath_name = oldHWAccessPath.getAttributeValue("name");
			
			String oldHW_AccessPath_Type = oldHWAccessPath.getAttributeValue("type", this.helper.getGenericNS("xsi"));
			
			if(oldHW_AccessPath_Type!=null && oldHW_AccessPath_Type.equals("am:LatencyAccessPath")) {
				
				Entry<String, String> oldHW_Source = getSingleElementsNameandTypeFromAttributeOrChildeElement("source", oldHWAccessPath);

				Entry<String, String> oldHW_Target = getSingleElementsNameandTypeFromAttributeOrChildeElement("target", oldHWAccessPath);
				
				
				Element newHW_AccessElements=null;
				
				if(oldHW_Source!=null) {
					
					String oldHW_element_key = oldHW_Source.getKey();

					String oldHW_element_type = oldHW_Source.getValue();
					
					if(oldHW_element_type.equals("Core")) {
						
						Element	newHW_Core_ProcessingUnit = hwTransformationCache.new_cores_Map.get(oldHW_element_key);
					 
						if(newHW_Core_ProcessingUnit!=null) {
							newHW_AccessElements=new Element("accessElements");
							
							newHW_AccessElements.setAttribute("name", oldHWAccessPath_name!=null?oldHWAccessPath_name:"");

							newHW_Core_ProcessingUnit.addContent(newHW_AccessElements);
						}
						
					}
				}
				
				if(oldHW_Target!=null) {
					Element newHW_AccessElements_Destination=new Element("destination");
					
					String oldHW_element_name = oldHW_Target.getKey();

					String oldHW_element_type = oldHW_Target.getValue();
					
					if(oldHW_element_type.equals("Memory")) {

						newHW_AccessElements_Destination.setAttribute("type", "am:Memory", this.helper.getGenericNS("xsi"));

						newHW_AccessElements_Destination.setAttribute("href", "amlt://#"+encodeNameForReference(oldHW_element_name)+"?type=Memory" );

					}else if(oldHW_element_type.equals("Core")) {
						
						
						newHW_AccessElements_Destination.setAttribute("type", "am:ProcessingUnit", this.helper.getGenericNS("xsi"));

						newHW_AccessElements_Destination.setAttribute("href", "amlt://#"+encodeNameForReference(oldHW_element_name)+"?type=ProcessingUnit" );
						
						
					}else {
						//This destination element can not be migrated, as in new HWModel HWDestination element only support Memory and ProcessingUnit
						//TODO:log a console message
					}
					
					if(newHW_AccessElements!=null) {
						newHW_AccessElements.addContent(newHW_AccessElements_Destination);
					}
				}
				
				//now adding latencies
				if(newHW_AccessElements!=null) {
					
					List<Element> oldHW_Latencies = oldHWAccessPath.getChildren("latencies");
					
					for (Element oldHW_Latency : oldHW_Latencies) {
						String oldHW_Latency_AccessType = oldHW_Latency.getAttributeValue("accessType");
						
						if(oldHW_Latency_AccessType!=null) {
							
							List<Element> newHWLatencies=new ArrayList<Element>();
							
							if(oldHW_Latency_AccessType.equals("R")) {
								
								newHWLatencies.add(new Element("readLatency"));
								
							}else if( oldHW_Latency_AccessType.equals("W")){
								
								newHWLatencies.add(new Element("writeLatency"));
								
							}else if(oldHW_Latency_AccessType.equals("RW")){
								
								newHWLatencies.add(new Element("readLatency"));
								newHWLatencies.add(new Element("writeLatency"));
								
							}else {
								continue;
							}
							
							for (Element newHW_Latency : newHWLatencies) {
								
								/*- adding latency to HWAccessElement */
								newHW_AccessElements.addContent(newHW_Latency);
								
								String oldHW_Latency_Type=oldHW_Latency.getAttributeValue("type",this.helper.getGenericNS("xsi"));
								
								if(oldHW_Latency_Type!=null) {
									
									if(oldHW_Latency_Type.equals("am:LatencyConstant")) {
										newHW_Latency.setAttribute("type", "am:LatencyConstant", this.helper.getGenericNS("xsi"));
										
										String oldHW_Latency_Value = oldHW_Latency.getAttributeValue("value");
										
										newHW_Latency.setAttribute("cycles", oldHW_Latency_Value);
										
									}else if(oldHW_Latency_Type.equals("am:LatencyDeviation")) {
										newHW_Latency.setAttribute("type", "am:LatencyDeviation", this.helper.getGenericNS("xsi"));
										
										Element oldHW_Latency_Deviation = oldHW_Latency.getChild("deviation");
										
										if(oldHW_Latency_Deviation!=null) {
											oldHW_Latency_Deviation=oldHW_Latency_Deviation.clone();
											oldHW_Latency_Deviation.detach();
											
											oldHW_Latency_Deviation.setName("cycles");
											
											newHW_Latency.addContent(oldHW_Latency_Deviation);
										}
									}
									
								}
							}
							
							
						}
						
					}
				}
				
			}
			
			
			
			
		}
			
	}

	private void migrateNetworkTypes(Element oldHWModelElement, final Element newHWModelElement) {
		List<Element> oldHWNetworkTypes = oldHWModelElement.getChildren("networkTypes");

		for (Element oldHWNetworkType : oldHWNetworkTypes) {

			String oldHWNetworkType_name=oldHWNetworkType.getAttributeValue("name");

			Element newHWNetworkType=new Element("definitions");

			/*-adding newly created element to the hwmodel*/
			newHWModelElement.addContent(newHWNetworkType);

			newHWNetworkType.setAttribute("type", "am:ConnectionHandlerDefinition", helper.getGenericNS("xsi"));

			if(oldHWNetworkType_name!=null) {
				newHWNetworkType.setAttribute("name", oldHWNetworkType_name);
			}


			String oldHWNetworkType_schedPolicy = oldHWNetworkType.getAttributeValue("schedPolicy");

			if(oldHWNetworkType_schedPolicy!=null) {

				String policy="_undefined_";

				if(oldHWNetworkType_schedPolicy.equals("RROBIN")) {
					policy="RoundRobin";	
				}else if(oldHWNetworkType_schedPolicy.equals("PRIORITY")) {
					policy="PriorityBased";	

				}
				newHWNetworkType.setAttribute("policy", policy);	
			}


		}
	}


	private void migrateCoreTypes(Element oldHWModelElement, final Element newHWModelElement) {
		List<Element> oldHWCoreTypes = oldHWModelElement.getChildren("coreTypes");

		for (Element oldHWCoreType : oldHWCoreTypes) {

			String oldHWCoreType_name=oldHWCoreType.getAttributeValue("name");

			Element newHWCoreType=new Element("definitions");

			/*-adding newly created element to the hwmodel*/
			newHWModelElement.addContent(newHWCoreType);

			newHWCoreType.setAttribute("type", "am:ProcessingUnitDefinition", helper.getGenericNS("xsi"));

			if(oldHWCoreType_name!=null) {
				newHWCoreType.setAttribute("name", oldHWCoreType_name);
			}

			newHWCoreType.setAttribute("puType", "CPU");

			Attribute oldHWCoreType_Classifiers = oldHWCoreType.getAttribute("classifiers");

			if(oldHWCoreType_Classifiers!=null) {

				newHWCoreType.setAttribute(oldHWCoreType_Classifiers.clone());
			}else {
				List<Element> oldCoreType_Classifiers_List = oldHWCoreType.getChildren("classifiers");

				for (Element oldCoreType_Classifier : oldCoreType_Classifiers_List) {
					newHWCoreType.addContent(oldCoreType_Classifier.clone());
				}
			}

			String oldCoreType_ipc = oldHWCoreType.getAttributeValue("instructionsPerCycle");

			if(oldCoreType_ipc!=null) {

				String ipc_value=oldCoreType_ipc;
				
				oldCoreType_ipc="IPC_"+ipc_value;
				
				String newHWFeatureName = "Instructions";

				Element newHWFeatureCategories=new Element("featureCategories");
				newHWFeatureCategories.setAttribute("name", newHWFeatureName);
				


				if(hwTransformationCache.new_features_Map.containsKey(newHWFeatureName)) {
					newHWFeatureCategories=hwTransformationCache.new_features_Map.get(newHWFeatureName);
				}else {
					newHWModelElement.addContent(newHWFeatureCategories);
				}



				newHWFeatureCategories.setAttribute("featureType", "performance");
				
				//TODO: Add docu here. In new_feature_literals_Map key is the literal name with convention as : FeatureName/LiteralName
				if(!hwTransformationCache.new_feature_literals_Map.containsKey(newHWFeatureName+"/"+oldCoreType_ipc)) {
					
					Element newHWFeatureElement=new Element("features");
					
					newHWFeatureElement.setAttribute("name", oldCoreType_ipc);
					
					Element valueElement=new Element("value");

					valueElement.setAttribute("type", "am:FloatObject", this.helper.getGenericNS("xsi"));

					valueElement.setAttribute("value",ipc_value);
					
					newHWFeatureElement.addContent(valueElement);
					
					newHWFeatureCategories.addContent(newHWFeatureElement);
					
					hwTransformationCache.new_feature_literals_Map.put(newHWFeatureName+"/"+oldCoreType_ipc, newHWFeatureElement);
				}
				
				hwTransformationCache.new_features_Map.put(newHWFeatureName, newHWFeatureCategories);
			
				newHWCoreType.setAttribute("features", encodeNameForReference(newHWFeatureName)+"/"+encodeNameForReference(oldCoreType_ipc)+"?type=HwFeature");

			}
		}
	}


	private void migrateMemoryTypes(Element oldHWModelElement_MemoryType, final Element newHWModelElement) {

		String oldHWMemoryType_name=oldHWModelElement_MemoryType.getAttributeValue("name");

		String oldHWMemoryType_type=oldHWModelElement_MemoryType.getAttributeValue("type");

		Element newHWMemoryType=new Element("definitions");

		/*-adding newly created element to the hwmodel*/
		newHWModelElement.addContent(newHWMemoryType);
		
		if(oldHWMemoryType_type!=null && oldHWMemoryType_type.equals("CACHE")) {
			newHWMemoryType.setAttribute("type", "am:CacheDefinition", helper.getGenericNS("xsi"));
			hwTransformationCache.new_cache_Types_Definition_Map.put(oldHWMemoryType_name, newHWMemoryType);
		}else {
			newHWMemoryType.setAttribute("type", "am:MemoryDefinition", helper.getGenericNS("xsi"));
			hwTransformationCache.new_memory_Types_Definition_Map.put(oldHWMemoryType_name, newHWMemoryType);
		}

		if(oldHWMemoryType_name!=null) {
			newHWMemoryType.setAttribute("name", oldHWMemoryType_name);
		}

		Attribute oldHWMemoryType_Classifiers = oldHWModelElement_MemoryType.getAttribute("classifiers");

		if(oldHWMemoryType_Classifiers!=null) {

			newHWMemoryType.setAttribute(oldHWMemoryType_Classifiers.clone());
		}else {
			List<Element> oldMemoryType_Classifiers_List = oldHWModelElement_MemoryType.getChildren("classifiers");

			for (Element oldMemoryType_Classifier : oldMemoryType_Classifiers_List) {
				newHWMemoryType.addContent(oldMemoryType_Classifier.clone());
			}
		}

		Element oldMemoryType_size = oldHWModelElement_MemoryType.getChild("size");

		if(oldMemoryType_size!=null) {
			newHWMemoryType.addContent(oldMemoryType_size.clone());
		}
		
	
		}

	private void migrateSystem(final Element newHWModelElement, Element oldHWSystem) {
		String oldHWSystem_name=oldHWSystem.getAttributeValue("name");

		hwTransformationCache.new_systems_Map.put(oldHWSystem_name, oldHWSystem);

		Element newHWSystem=new Element("structures");

		if(oldHWSystem_name!=null) {
			newHWSystem.setAttribute("name", oldHWSystem_name);
		}

		newHWSystem.setAttribute("structureType", "System");

		newHWModelElement.addContent(newHWSystem);

		hwTransformationCache.new_systems_Map.put(oldHWSystem_name, newHWSystem);


		if(!hasProcessedQuartzes) {

			hasProcessedQuartzes=true;

			migrateAllQuartzes_modelscope(newHWModelElement);
		}

		List<Element> oldHWecus = oldHWSystem.getChildren("ecus");

		for (Element oldHWEcu : oldHWecus) {

			migrateECU(newHWSystem, oldHWEcu);
		}
		
		/*-migrating memories*/
		migrateMemoriesAndCaches(oldHWSystem, newHWSystem,true,true);
		
		/*-migrating networks*/
		migrateNetworks(oldHWSystem, newHWSystem);
		
		/*-migrate ports*/
		
		migratePorts(oldHWSystem, newHWSystem);
	}

	private void migratePorts(Element oldHWElement, Element newHWElement) {
		
		List<Element> oldHW_ports = oldHWElement.getChildren("ports");
		
		for (Element oldHWPort : oldHW_ports) {
			
			Element newHWPort=new Element("ports");
			
			String oldHWPort_name = oldHWPort.getAttributeValue("name");

			String oldHWPort_bitWidth = oldHWPort.getAttributeValue("bitWidth");

			String oldHWPort_master = oldHWPort.getAttributeValue("master");
			
			if(oldHWPort_name!=null) {
				newHWPort.setAttribute("name", oldHWPort_name);
			}
			if(oldHWPort_bitWidth!=null) {
				newHWPort.setAttribute("bitWidth", oldHWPort_bitWidth);
			}
			if(oldHWPort_master!=null) {
				
				if(Boolean.valueOf(oldHWPort_master.trim())) {
					newHWPort.setAttribute("portType", "initiator");
					
				}else {
					newHWPort.setAttribute("portType", "responder");
					
				}
			}
			
			newHWElement.addContent(newHWPort);
			
		}
	}
	
	private void migrateMemoriesAndCaches(Element oldHWElement, Element newHWStructure_or_PU_Element, boolean migrateCache, boolean migrateMemory) {
		List<Element> oldHW_Memories = getAllMemories(oldHWElement);

		for (Element oldHW_Memory : oldHW_Memories) {
			
			Element newHW_Memory_Element=new Element("modules");
			
			String oldHW_Memory_Name = oldHW_Memory.getAttributeValue("name");
			
			if(oldHW_Memory_Name!=null) {
				newHW_Memory_Element.setAttribute("name", oldHW_Memory_Name);
			}
			
			String hw_memory_typeDefinitionName=getSingleElementNameFromAttributeOrChildeElement("type",oldHW_Memory);
			
			String newHW_definitions_type_amalthea_element="MemoryDefinition";
			
			if(hw_memory_typeDefinitionName!=null) {
				
				if(migrateCache) {
					if(hwTransformationCache.new_cache_Types_Definition_Map.containsKey(hw_memory_typeDefinitionName)) {
						
						newHW_definitions_type_amalthea_element="CacheDefinition";
						
//						newHW_Memory_Element.setName("caches");
						
						newHW_Memory_Element.setAttribute("type", "am:Cache", this.helper.getGenericNS("xsi"));
						
						hwTransformationCache.new_caches_Map.put(oldHW_Memory_Name, newHW_Memory_Element);
						
						//Adding memory object to newHW
						newHWStructure_or_PU_Element.addContent(newHW_Memory_Element);
						
					}	
				}
				
				if(migrateMemory) {
					  if(hwTransformationCache.new_memory_Types_Definition_Map.containsKey(hw_memory_typeDefinitionName)) {
							newHW_Memory_Element.setAttribute("type", "am:Memory", this.helper.getGenericNS("xsi"));
							
							hwTransformationCache.new_memories_Map.put(oldHW_Memory_Name, newHW_Memory_Element);
							
							//Adding memory object to newHW
							newHWStructure_or_PU_Element.addContent(newHW_Memory_Element);
						}
				}
				
			}else {
				if(migrateMemory) {
					newHW_Memory_Element.setAttribute("type", "am:Memory", this.helper.getGenericNS("xsi"));
					
					hwTransformationCache.new_memories_Map.put(oldHW_Memory_Name, newHW_Memory_Element);
					
					//Adding memory object to newHW
					newHWStructure_or_PU_Element.addContent(newHW_Memory_Element);
					
				}
			}
			
			List<Element> newHWMemoryDefinitions = migrateAttributeorElementData(oldHW_Memory, "type", "definition", newHW_definitions_type_amalthea_element);

			for (Element newHWMemoryDefinition : newHWMemoryDefinitions) {
				
				newHW_Memory_Element.addContent(newHWMemoryDefinition);
			}
			
			migratePrescaler(oldHW_Memory, newHW_Memory_Element);
			
			/*-migrate ports*/

			migratePorts(oldHW_Memory, newHW_Memory_Element);
			
			
			
			
			
		}
	}
	
	private void migrateNetworks(Element oldHWElement, Element newHWStructure) {
		List<Element> oldHW_Networks = getAllNetworks(oldHWElement);

		for (Element oldHW_network : oldHW_Networks) {
			
			Element newHW_network=new Element("modules");
			
			String oldHW_network_Name = oldHW_network.getAttributeValue("name");
			
			if(oldHW_network_Name!=null) {
				newHW_network.setAttribute("name", oldHW_network_Name);
			}
			
			newHW_network.setAttribute("type", "am:ConnectionHandler", this.helper.getGenericNS("xsi"));
			
			
			List<Element> newHWNetworkTypeDefinitions = migrateAttributeorElementData(oldHW_network, "type", "definition", "ConnectionHandlerDefinition");

			for (Element newHWNetworkTypeDefinition : newHWNetworkTypeDefinitions) {
				
				newHW_network.addContent(newHWNetworkTypeDefinition);
			}
			
			migratePrescaler(oldHW_network, newHW_network);
			
			/*-migrate ports*/

			migratePorts(oldHW_network, newHW_network);
			
			//Adding network object to newHW
			newHWStructure.addContent(newHW_network);
			
		}
	}

	private List<Element> getAllNetworks(Element oldHW_ComplexNode) {
		List<Element> oldHW_Networks=new ArrayList<Element>();
		
		
		List<Element> oldHW_ComplexNodeElements = oldHW_ComplexNode.getChildren("networks");
		oldHW_Networks.addAll(oldHW_ComplexNodeElements);
		
		populateAllSubNetworks(oldHW_Networks, oldHW_ComplexNode.getChildren("networks"));
		

		populateAllSubNetworks(oldHW_Networks, oldHW_ComplexNode.getChildren("memories"));

		populateAllSubNetworks(oldHW_Networks, oldHW_ComplexNode.getChildren("components"));
		
		return oldHW_Networks;
	}
	
	private List<Element> getAllMemories(Element oldHW_ComplexNode) {
		List<Element> oldHW_Memories=new ArrayList<Element>();
		
		
		List<Element> oldHW_ComplexNodeElements = oldHW_ComplexNode.getChildren("memories");
		oldHW_Memories.addAll(oldHW_ComplexNodeElements);
		
		populateAllSubMemories(oldHW_Memories, oldHW_ComplexNode.getChildren("memories"));
		

		populateAllSubMemories(oldHW_Memories, oldHW_ComplexNode.getChildren("networks"));

		populateAllSubMemories(oldHW_Memories, oldHW_ComplexNode.getChildren("components"));
		return oldHW_Memories;
	}

	private void populateAllSubMemories(List<Element> oldHW_Memories, List<Element> oldHW_ComplexNodeElements) {
		for (Element oldHWMemory : oldHW_ComplexNodeElements) {
			
			final StringBuffer xpathBufferForMemoryDefinitions = new StringBuffer();
 
			xpathBufferForMemoryDefinitions.append("./memories");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//components/memories");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//nestedComponents/memories");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//memories/memories");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//networks/memories");
			
			
			final List<Element> memoryElements = this.helper.getXpathResult(oldHWMemory, xpathBufferForMemoryDefinitions.toString(),
					Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_090("am") );
			
			oldHW_Memories.addAll(memoryElements);
			
		}
	}
	
	
	private void populateAllSubNetworks(List<Element> oldHW_Networks, List<Element> oldHW_ComplexNodeElements) {
		for (Element oldHWNetwork : oldHW_ComplexNodeElements) {
			
			final StringBuffer xpathBufferForMemoryDefinitions = new StringBuffer();
 
			xpathBufferForMemoryDefinitions.append("./networks");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//components/networks");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//nestedComponents/networks");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//memories/networks");
			xpathBufferForMemoryDefinitions.append("|");
			
			xpathBufferForMemoryDefinitions.append(".//networks/networks");
			
			
			final List<Element> networkElements = this.helper.getXpathResult(oldHWNetwork, xpathBufferForMemoryDefinitions.toString(),
					Element.class, this.helper.getGenericNS("xsi"),this.helper.getNS_090("am") );
			
			oldHW_Networks.addAll(networkElements);
			
		}
	}

	
	private void migrateAllCores_modelscope(Element newHW_MicroController) {
		
		Collection<Element> oldHWCoreElements = hwTransformationCache.old_cores_Map.values();
		
		for (Element oldHWCoreElement : oldHWCoreElements) {
			
			migrateCore(newHW_MicroController, oldHWCoreElement);
		}
		
	}
	private void migrateAllQuartzes_modelscope(Element newHWModel) {

		Collection<Element> oldHWQuartzElements = hwTransformationCache.old_hwQuartzs_Map.values();

		for (Element oldHWQuartzElement : oldHWQuartzElements) {

			Element newHWFrequencyDomain=new Element("domains");

			newHWFrequencyDomain.setAttribute("type", "am:FrequencyDomain",this.helper.getGenericNS("xsi"));

			String oldHWQuartz_name = oldHWQuartzElement.getAttributeValue("name");

			if(oldHWQuartz_name!=null) {
				newHWFrequencyDomain.setAttribute("name", oldHWQuartz_name);
			}

			Element oldHWElement_Frequency = oldHWQuartzElement.getChild("frequency");

			if(oldHWElement_Frequency!=null) {
				Element newHWFrequency_defaultValue = oldHWElement_Frequency.clone();

				newHWFrequency_defaultValue.detach();

				newHWFrequency_defaultValue.setName("defaultValue");

				newHWFrequencyDomain.addContent(newHWFrequency_defaultValue);
			}

			newHWModel.addContent(newHWFrequencyDomain);

			hwTransformationCache.new_hwQuartzs_FrequencyDomain_Map.put(oldHWQuartz_name, newHWFrequencyDomain);
		}
	}

	private void migrateECU(Element newHWSystem, Element oldHWEcu) {
		String oldHWEcu_name=oldHWEcu.getAttributeValue("name");

		hwTransformationCache.old_ecus_Map.put(oldHWEcu_name, oldHWEcu);

		Element newHWEcu=new Element("structures");

		if(oldHWEcu_name!=null) {
			newHWEcu.setAttribute("name", oldHWEcu_name);
		}

		newHWEcu.setAttribute("structureType", "ECU");

		newHWSystem.addContent(newHWEcu);

		hwTransformationCache.new_ecus_Map.put(oldHWEcu_name, newHWEcu);
		
		
		/*-migrating memories*/
		migrateMemoriesAndCaches(oldHWEcu, newHWEcu,true,true);

		/*-migrating networks*/
		migrateNetworks(oldHWEcu, newHWEcu);
		
		/*-migrate ports*/

		migratePorts(oldHWEcu, newHWEcu);

		List<Element> oldHWMicroControllers = oldHWEcu.getChildren("microcontrollers");

		for (Element oldHWMicroController : oldHWMicroControllers) {

			migrateMicroController(newHWEcu, oldHWMicroController);
		}
	}

	private void migrateMicroController(Element newHWEcu, Element oldHWMicroController) {
		String oldHWMicroController_name=oldHWMicroController.getAttributeValue("name");

		hwTransformationCache.old_microControllers_Map.put(oldHWMicroController_name, oldHWMicroController);

		Element newHWMicroController=new Element("structures");

		if(oldHWMicroController_name!=null) {
			newHWMicroController.setAttribute("name", oldHWMicroController_name);
		}

		newHWMicroController.setAttribute("structureType", "Microcontroller");

		newHWEcu.addContent(newHWMicroController);

		hwTransformationCache.new_microControllers_Map.put(oldHWMicroController_name, newHWMicroController);

		/*-migrating memories*/
		migrateMemoriesAndCaches(oldHWMicroController, newHWMicroController,true,true);
		
		/*-migrating networks*/
		migrateNetworks(oldHWMicroController, newHWMicroController);
		
		/*-migrate ports*/

		migratePorts(oldHWMicroController, newHWMicroController);

 
		if (!hasProcessedCores) {

			hasProcessedCores = true;

			migrateAllCores_modelscope(newHWMicroController);
		}

		List<Element> oldHWCores = oldHWMicroController.getChildren("cores");
		
		for (Element oldHWCore : oldHWCores) {

			/*-migrating memories*/
			
			//TODO: cross check : As in case of new HW Model, core can not contain memories, corresponding memories of core are added to the HWStructure (microcontroller type)
			migrateMemoriesAndCaches(oldHWCore, newHWMicroController,false,true);
			
			
			/*-migrating networks*/
			migrateNetworks(oldHWCore, newHWMicroController);
			
			
			

		}
	}

	private void migrateCore(Element newHWMicroController, Element oldHWCore) {
		Element newHWCore=new Element("modules");

		newHWMicroController.addContent(newHWCore);

		newHWCore.setAttribute("type", "am:ProcessingUnit", helper.getGenericNS("xsi"));

		String oldHWCore_name = oldHWCore.getAttributeValue("name");

		if(oldHWCore_name!=null) {
			newHWCore.setAttribute("name", oldHWCore_name);
		}

		List<Element> newHWProcessingUnits = migrateAttributeorElementData(oldHWCore, "coreType", "definition", "ProcessingUnitDefinition");

		for (Element newHWProcessingUnit : newHWProcessingUnits) {

			newHWCore.addContent(newHWProcessingUnit);

		}

		migratePrescaler(oldHWCore, newHWCore);
		
		/*-migrate ports*/

		migratePorts(oldHWCore, newHWCore);
		
		
		migrateMemoriesAndCaches(oldHWCore, newHWCore, true, false);
		
		hwTransformationCache.new_cores_Map.put(oldHWCore_name, newHWCore);
	}

	/**
	 * 
	 * @param oldHWElement e.g: Core, Memory
	 * @param newHWElement
	 */
	private void migratePrescaler(Element oldHWElement, Element newHWElement) {
		Element oldHWPrescaler = oldHWElement.getChild("prescaler");

		if(oldHWPrescaler!=null) {

			String oldHW_quartz_name = getSingleElementNameFromAttributeOrChildeElement("quartz", oldHWPrescaler);

			if(oldHW_quartz_name!=null) {
				
				String clockRatio = oldHWPrescaler.getAttributeValue("clockRatio");
				
				if(clockRatio==null) {
					clockRatio="0.0";
				}

				Element newHW_FrequencyDomain = hwTransformationCache.new_hwQuartzs_FrequencyDomain_Map.get(oldHW_quartz_name);

				if( !clockRatio.trim().toString().equals("1.0")) {


					if(newHW_FrequencyDomain!=null) {

						/*-getting parent element of existing FrequencyDomain -> HWModel */
						Element parentElement = newHW_FrequencyDomain.getParentElement();

						newHW_FrequencyDomain=	newHW_FrequencyDomain.clone();

						newHW_FrequencyDomain.detach();

						/*-Adding newly created FrequencyDomain to HWModel*/

						parentElement.addContent(newHW_FrequencyDomain);

						//As the clock ratio is not 1.0, in this case -> cloning standard FrequencyDomain and setting the updated Frequency
						newHW_FrequencyDomain.setAttribute("name", oldHW_quartz_name+"__"+clockRatio);

						Element newHW_frequency = newHW_FrequencyDomain.getChild("defaultValue");

						if(newHW_frequency!=null) {
							Attribute newHW_frequency_value_attribute  = newHW_frequency.getAttribute("value");

							if(newHW_frequency_value_attribute!=null) {

								try {
									String value = newHW_frequency_value_attribute.getValue();

									String	newHW_frequency_value=Double.parseDouble(value)*Double.parseDouble(clockRatio)+"";

									newHW_frequency_value_attribute.setValue(newHW_frequency_value);

								} catch (Exception e) {
									this.logger.error("Exception occured during creation of new FrequencyDomain :"+newHW_FrequencyDomain.getAttributeValue("name"));
								}


							}
						}

					}
				}
				//updating reference
				if(newHW_FrequencyDomain!=null) {
					Element newHW_frequencyDoamin_reference=new Element("frequencyDomain");
					
					newHW_frequencyDoamin_reference.setAttribute("href", "amlt:/#"+encodeNameForReference(newHW_FrequencyDomain.getAttributeValue("name"))+"?type=FrequencyDomain");
					
					newHWElement.addContent(newHW_frequencyDoamin_reference);
				}
				
			}
			


		}
	}

	public List<Element> migrateAttributeorElementData(Element oldHWElement, String attributeOrChildElementName, String newChildElementName, String newChildElementType){

		List<Element> newHWElements=new ArrayList<Element>();

		Attribute oldHWAttribute = oldHWElement.getAttribute(attributeOrChildElementName);

		if(oldHWAttribute!=null) {

			String oldHWRefElementsValue = oldHWAttribute.getValue();

			StringTokenizer stk=new StringTokenizer(oldHWRefElementsValue);

			while(stk.hasMoreTokens()) {
				String nextToken = stk.nextToken();

				String newHWRefElementName=updateReferenceStringWithNewType(nextToken, newChildElementType);

				Element newHWRefElement=new Element(newChildElementName);

				newHWRefElement.setAttribute("href", "amlt:/#"+newHWRefElementName);

				newHWElements.add(newHWRefElement);

			}


		}else {
			List<Element> oldHWChildElements = oldHWElement.getChildren(attributeOrChildElementName);

			for (Element oldHWChildElement : oldHWChildElements) {

				String oldHWhrefValue = oldHWChildElement.getAttributeValue("href");
				if(oldHWhrefValue!=null) {


					String newHWRefElementName=updateReferenceStringWithNewType(oldHWhrefValue, newChildElementType);

					Element newHWRefElement=new Element(newChildElementName);

					newHWRefElement.setAttribute("href", newHWRefElementName);

					newHWElements.add(newHWRefElement);
				}				
			}
		}


		oldHWElement.removeAttribute(attributeOrChildElementName);

		oldHWElement.removeChildren(attributeOrChildElementName);

		return newHWElements;
	}



	private String updateReferenceStringWithNewType(String inputString, String newType) {

		if(inputString!=null) {
			int startIndex = inputString.indexOf("?type=");

			if(startIndex!=-1) {
				String oldHWRefElementName = inputString.substring(0, startIndex);

				String newHWRefElementName=encodeNameForReference(oldHWRefElementName)+"?type="+newType;

				return newHWRefElementName;
			}
			return inputString;
		}
		return inputString;
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
