package org.eclipse.app4mc.amalthea.converters090.utils;

import java.util.HashMap;
import java.util.Map;

import org.jdom2.Element;

public class HWTransformationCache {
	public Map<String, Element> new_systems_Map = new HashMap<String, Element>();
	public Map<String, Element> new_ecus_Map = new HashMap<String, Element>();
	public Map<String, Element> old_ecus_Map = new HashMap<String, Element>();
	public Map<String, Element> new_microControllers_Map = new HashMap<String, Element>();
	public Map<String, Element> old_microControllers_Map = new HashMap<String, Element>();
	public Map<String, Element> new_cores_Map = new HashMap<String, Element>();
	public Map<String, Element> old_cores_Map = new HashMap<String, Element>();
	public Map<String, Element> new_memories_Map = new HashMap<String, Element>();
	public Map<String, Element> new_memory_Types_Definition_Map = new HashMap<String, Element>();

	public Map<String, Element> new_cache_Types_Definition_Map = new HashMap<String, Element>();
	public Map<String, Element> new_caches_Map = new HashMap<String, Element>();
	
	public Map<String, Element> old_memory_Types_Definition_Map = new HashMap<String, Element>();
	public Map<String, Element> old_hwQuartzs_Map = new HashMap<String, Element>();
	public Map<String, Element> new_hwQuartzs_FrequencyDomain_Map = new HashMap<String, Element>();
	public Map<String, Element> new_features_Map = new HashMap<String, Element>();
	public Map<String, Element> new_feature_literals_Map = new HashMap<String, Element>();

}
