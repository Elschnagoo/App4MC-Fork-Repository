package org.eclipse.app4mc.amalthea.converters090.utils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Document;
import org.jdom2.Element;

public class HWCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_083_090  helper;

	private final HWTransformationCache cache;
	public HWCacheBuilder() {
		this.helper = HelperUtils_083_090.getInstance();
		cache=new HWTransformationCache();
	}

	public static final String cache_key="PeriodicStimulus_Containing_Clock";

	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {

		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Document document1 = fileName_documentsMap.get(targetFile);

			if (document1 == null) {
				// log error message
				continue;
			}
			
			
			Element rootElement = document1.getRootElement();
			
			if(rootElement !=null) {
				
				Element oldHWModelElement = rootElement.getChild("hwModel");
				
				if(oldHWModelElement!=null) {
					
					Element oldHWSystem = oldHWModelElement.getChild("system");
					
					if(oldHWSystem!=null) {
						
						List<Element> oldHWQuartzes = oldHWSystem.getChildren("quartzes");
						
						for (Element oldHWQuartz : oldHWQuartzes) {
							
							String attributeValue = oldHWQuartz.getAttributeValue("name");
							
							if(attributeValue!=null) {
								cache.old_hwQuartzs_Map.put(attributeValue, oldHWQuartz);
							}
						}
						
						List<Element> oldHWECUs = oldHWSystem.getChildren("ecus");
						
						for (Element oldHWECU : oldHWECUs) {
							List<Element> oldHWMicroControllers = oldHWECU.getChildren("microcontrollers");
							
							for (Element oldHWMicroController : oldHWMicroControllers) {
								
								List<Element> oldHWCores = oldHWMicroController.getChildren("cores");
								
								for (Element oldHWCore : oldHWCores) {
									String attributeValue = oldHWCore.getAttributeValue("name");
									if(attributeValue!=null) {
										cache.old_cores_Map.put(attributeValue, oldHWCore);
									}
								}
								
							}
						}
						
					}
					
					
					List<Element> oldHWMemoryTypes = oldHWModelElement.getChildren("memoryTypes");
					
					for (Element oldHWMemoryType : oldHWMemoryTypes) {
						String attributeValue = oldHWMemoryType.getAttributeValue("name");

						if(attributeValue!=null) {
							cache.old_memory_Types_Definition_Map.put(attributeValue, oldHWMemoryType);
							
						}
					}
					
					
				}
			}
			
			

//			final Element rootElement = document1.getRootElement();

			/*- Start : Cache initialization */

			HashMap<String, Object> hashMap = new HashMap<String, Object>();
			
			hashMap.put("globalCache", cache);
			
			getCacheMap().put(targetFile, hashMap);
			
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
