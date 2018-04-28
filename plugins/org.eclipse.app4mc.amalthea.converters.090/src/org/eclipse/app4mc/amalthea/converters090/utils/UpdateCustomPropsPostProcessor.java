package org.eclipse.app4mc.amalthea.converters090.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IPostProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.Iterables;

public class UpdateCustomPropsPostProcessor implements IPostProcessor {

	private HWTransformationCache hwTransformationCache;
	
	
	public UpdateCustomPropsPostProcessor() {
	}
	
	private List<ICache> caches;
	
	@Override
	public void addCaches(List<ICache> caches) {
		this.caches=caches;
	}

	@Override
	public void process(Map<File, Document> fileName_documentsMap, AbstractHelper helper) throws Exception {

		List<String> hwTypes_083 =initializeHwTypesList();
		
		Collection<Document> values = fileName_documentsMap.values();
		
		for (Document document : values) {
			Element rootElement = document.getRootElement();
			

			final List<Element> value_customPropertyElements =  helper.getXpathResult(rootElement,".//customProperties//*[@xsi:type=\"am:ReferenceObject\"]",
					Element.class,  helper.getGenericNS("xsi"));
			
			for (Element value_customPropertyElement : value_customPropertyElements) {

				Entry<String, String> entry = helper.getSingleElementsNameandTypeFromAttributeOrChildeElement("value", value_customPropertyElement);
				
				
				//As the scope of updating references in CustomProperties object is limited to HWModel : Below condition ensures that the type of the element is part of HWModel in 0.8.3
				if(entry!=null && hwTypes_083.contains(entry.getValue())) {
					
					value_customPropertyElement.removeAttribute("value");
					value_customPropertyElement.removeChild("value");

					String updatedTypeAfterMigration=getUpdatedType(entry.getKey(),entry.getValue());
					
					//If more than one file is supplied for model migration: crossdocument references can be used -> due to this reason there is a special convention to generate references with href
					if(values.size()>1) {
						Element valueElement=new Element("value");
						
						
						valueElement.setAttribute("type", "am:"+updatedTypeAfterMigration, helper.getGenericNS("xsi"));
						
						valueElement.setAttribute("href", "amlt:/#"+entry.getKey()+"?"+"type="+updatedTypeAfterMigration);
						
						value_customPropertyElement.addContent(valueElement);
					}else {
						value_customPropertyElement.setAttribute("value", entry.getKey()+"?type="+updatedTypeAfterMigration);
					}
					
					
				}
				
			}
			
		}
	}

	/**
	 * This method initializes a list containing HwModel element types from APP4MC 0.8.3 AMALTHEA model
	 * @return
	 */
	private List<String> initializeHwTypesList() {

		List<String> ls=new ArrayList<String>();
		
		ls.add("HWModel");
		ls.add("ComplexNode");
		ls.add("HwSystem");
		ls.add("ECU");
		ls.add("Microcontroller");
		ls.add("Core");
		ls.add("Memory");
		ls.add("Network");
		ls.add("Quartz");
		ls.add("HwComponent");
		ls.add("HardwareTypeDescription");
		ls.add("AbstractionType");
		ls.add("SystemType");
		ls.add("ECUType");
		ls.add("MicrocontrollerType");
		ls.add("CoreType");
		ls.add("MemoryType");
		ls.add("NetworkType");
		ls.add("HwPort");
		ls.add("Pin");
		ls.add("ComplexPort");
		ls.add("ComplexPin");
		ls.add("Prescaler");
		ls.add("CrossbarSwitch");
		ls.add("Bus");
		ls.add("Bridge");
		ls.add("LatencyAccessPath");
		ls.add("HwAccessPath");
		ls.add("AccessPathRef");
		ls.add("LatencyConstant");
		ls.add("LatencyDeviation");
		ls.add("HwAccessPathRef");
		ls.add("HwElementRef");
		
		return ls;
	}

	private String getUpdatedType(String name, String value) {

		if (value == null) {
			return null;
		}

		if (value.equals("MemoryType")) {

			if(getHWTransformationCache().new_cache_Types_Definition_Map.containsKey(name)) {
				value="CacheDefinition";
			}else if(getHWTransformationCache().new_memories_Map.containsKey(name)) {
				value="MemoryDefinition";
			}
			
		}else if(value.equals("Memory")) {
			if(getHWTransformationCache().new_caches_Map.containsKey(name)) {
				value="Cache";
			}else if(getHWTransformationCache().new_memories_Map.containsKey(name)) {
				value="Memory";
			}
		}
		else if (value.equals("CoreType")) {
			value = "ProcessingUnit";
		} else if (value.equals("NetworkType")) {
			value = "ConnectionHandler";
		} else if (value.equals("HwSystem")) {
			value = "HwStructure";
		} else if (value.equals("ECU")) {
			value = "HwStructure";
		} else if (value.equals("Microcontroller")) {
			value = "HwStructure";
		} else if (value.equals("Core")) {
			value = "ProcessingUnitDefinition";
		} else if (value.equals("Network")) {
			value = "ConnectionHandlerDefinition";
		} else if (value.equals("Quartz")) {
			value = "FrequencyDomain";
		}

		return value;
	}

	
	/**
	 * This method is used to get the PeriodicStimulusCacheBuilder object
	 *
	 * @return PeriodicStimulusCacheBuilder
	 */
	private HWTransformationCache getHWTransformationCache() {

		if (this.hwTransformationCache == null) {

			boolean isHWCacheAvailable=false;

			if(this.caches==null) {
				this.caches=new ArrayList<ICache>();
			}
			
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
