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
import java.util.Collections;
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
							}
						}
						
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