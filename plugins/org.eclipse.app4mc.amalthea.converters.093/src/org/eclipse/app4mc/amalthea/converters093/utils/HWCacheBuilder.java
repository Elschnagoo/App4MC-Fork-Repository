/**
 ********************************************************************************
 * Copyright (c) 2018-2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters093.utils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Document;
import org.jdom2.Element;

public class HWCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_092_093 helper;
	protected Logger logger;
	
	public HWCacheBuilder() {
		this.helper = HelperUtils_092_093.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	public class PUDefinition_IPCData {

		/*- Instructions/ipc_2?type=HwFeature: 2.0*/
		public Map<String, Double> ipcFeature_valueMap=new HashMap<String, Double>();

		/*-  pudef : Instructions/ipc_2?type=HwFeature */
		public Map<String, String> puDefinition_IPCFeatureMap=new HashMap<String, String>();
		
		
	}
	
	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {
		
		HashMap<String, Object> hashMap = new HashMap<String, Object>();

		PUDefinition_IPCData cache = new PUDefinition_IPCData();
		hashMap.put("globalCache", cache);
		
		
		
		for (final File targetFile : fileName_documentsMap.keySet()) {

			getCacheMap().put(targetFile, hashMap);
			
			final Document document1 = fileName_documentsMap.get(targetFile);

			if (document1 == null) {
				// log error message
				continue;
			}

			Element rootElement = document1.getRootElement();

			if (rootElement != null) {

				Element hWModelElement = rootElement.getChild("hwModel");

				if (hWModelElement != null) {
					
					List<Element> featureCategoriesList = hWModelElement.getChildren("featureCategories");
					
					for (Element featureCategoriesElement : featureCategoriesList) {
						
						String featureCategoryName=featureCategoriesElement.getAttributeValue("name");
						
						List<Element> featuresList = featureCategoriesElement.getChildren("features");
						
						for (Element featureElement : featuresList) {
							
							String featureName=featureElement.getAttributeValue("name");

							String featureValue=featureElement.getAttributeValue("value");
							
							String ipcFeatureKey=this.helper.encodeName(featureCategoryName)+"/"+this.helper.encodeName(featureName)+"?type=HwFeature";
							
								double parseDouble = Double.parseDouble(featureValue);
								//adding ipcFeature data to cache map
								cache.ipcFeature_valueMap.put(ipcFeatureKey, parseDouble);
						}
					}
					
					
					List<Element> definitionsList = hWModelElement.getChildren("definitions");
					
					for (Element definitionsElement : definitionsList) {
						
						String puDefinitionName = definitionsElement.getAttributeValue("name");
						
						 Map<String, String> features = helper.getMultipleElementsNameandTypeFromAttributeOrChildeElement("features", definitionsElement);
						 
						 Set<String> keySet = features.keySet();
						 
						 List<String> ipcHwFeatures = keySet.stream().filter(st->(st.startsWith("Instructions/IPC")||st.startsWith("Instructions/ipc"))).collect(Collectors.toList());
						 
						 if(ipcHwFeatures.size()>0) {
							 if(ipcHwFeatures.size()>1) {
								 this.logger.error("ProcessingUnitDefinition : \""+puDefinitionName+"\" contains multiple HwFeatures of type IPC. In this case, only the first HwFeature : "+ipcHwFeatures.get(0) +" will be considered for runtime info calculation");
							 }

							 /*- value is stored as :  Instructions/ipc_2?type=HwFeature  */
							 cache.puDefinition_IPCFeatureMap.put(this.helper.encodeName(puDefinitionName), ipcHwFeatures.get(0)+"?type=HwFeature");
						 }
						 
					}
				}
			}

		}

	}

	@Override
	public Map<File, Map<String, Object>> getCacheMap() {
		return this.map;
	}

	@Override
	public void clearCacheMap() {

		this.map.clear();
	}

}
