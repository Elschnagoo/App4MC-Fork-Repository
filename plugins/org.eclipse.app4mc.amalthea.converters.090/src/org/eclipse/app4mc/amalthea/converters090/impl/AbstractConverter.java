/*******************************************************************************
 * Copyright (c) 2017 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
package org.eclipse.app4mc.amalthea.converters090.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters090.utils.HelperUtils_083_090;
import org.jdom2.Element;

public abstract class AbstractConverter implements IConverter {

	protected HelperUtils_083_090 helper;

	protected Logger logger;


	/**
	 * This method is used to add CustomProperty to the parent Element, with the supplied key and value
	 * @param parentElement Element for which CustomProperty shall be added to
	 * @param key
	 * @param value
	 */
	protected void addCustomProperty(Element parentElement, String key, String value){

		if(value == null){
			return ;
		}
		
		Element customPropertiesElement=new Element("customProperties");
		
		customPropertiesElement.setAttribute("key", key);
		
		Element valueElement=new Element("value");
		
		valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
		
		valueElement.setAttribute("value", value);
		
		customPropertiesElement.addContent(valueElement);
		
		parentElement.addContent(customPropertiesElement);
		
		
	}
	
	protected String encodeNameForReference(final String name) {
		if (name == null || name.length() == 0) {
			return "no-name";
		}

		String result;
		try {
			result = URLEncoder.encode(name, StandardCharsets.UTF_8.toString());
		}
		catch (final UnsupportedEncodingException e) {
			result = name; // keep old name - we have no better option
		}
		return result;
	}
	
	
	/**
	 * This method returns name and type of the element
	 * @param attributeOrTagName
	 * @param element
	 * @return Entry<String, String> key here is name and value is Type
	 */
	protected Map<String, String> getMultipleElementsNameandTypeFromAttributeOrChildeElement(String attributeOrTagName, Element element) {
		
		
		String attributeValue = element.getAttributeValue(attributeOrTagName);

		if(attributeValue!=null) {
			Map<String, String> map=new HashMap<String, String>();
			
			String[] references = attributeValue.split("\\s");
			
			for (String reference : references) {
				
				String name= getElementNameFromReference(reference);
				String type= getElementTypeFromReference(reference);
				
				map.put(name, type);
			}
			return map;
		}else {
			
			List<Element> children = element.getChildren(attributeOrTagName);

			if(children.size()>0) {
				Map<String, String> map=new HashMap<String, String>();

				for (Element child : children) {

					String hrefValue = child.getAttributeValue("href");

					if(hrefValue!=null) {
						String name= getElementNameFromReference(hrefValue);
						String type= getElementTypeFromReference(hrefValue);
						map.put(name, type);
					}
				
				}
				
				return map;
			}
		
		}
		
		return new HashMap<String, String>();
	}
	
	
	/**
	 * This method returns name and type of the element
	 * @param attributeOrTagName
	 * @param element
	 * @return Entry<String, String> key here is name and value is Type
	 */
	protected Entry<String, String> getSingleElementsNameandTypeFromAttributeOrChildeElement(String attributeOrTagName, Element element) {
		
		
		String attributeValue = element.getAttributeValue(attributeOrTagName);

		if(attributeValue!=null) {
			String name= getElementNameFromReference(attributeValue);
			String type= getElementTypeFromReference(attributeValue);
			return new AbstractMap.SimpleEntry<String,String>(name, type);
		}else {
			Element child = element.getChild(attributeOrTagName);

			if(child!=null) {
				String hrefValue = child.getAttributeValue("href");

				if(hrefValue!=null) {
					String name= getElementNameFromReference(hrefValue);
					String type= getElementTypeFromReference(hrefValue);
					return new AbstractMap.SimpleEntry<String,String>(name, type);
				}
			}
		}
		
		return null;
	}
	protected String getSingleElementNameFromAttributeOrChildeElement(String attributeOrTagName, Element element) {

		String attributeValue = element.getAttributeValue(attributeOrTagName);

		if(attributeValue!=null) {
			return getElementNameFromReference(attributeValue);
		}else {
			Element child = element.getChild(attributeOrTagName);

			if(child!=null) {
				String hrefValue = child.getAttributeValue("href");

				if(hrefValue!=null) {
					return getElementNameFromReference(hrefValue);
				}
			}
		}

		return null;
	}

	
	private String getElementTypeFromReference(String reference) {

		if(reference==null || reference.length()==0) {
			return "";
		}
		int startIndex = reference.indexOf("?type=");

		if(startIndex!=-1) {
			String type = reference.substring(startIndex+6);
			 
			return type;
		}

		return reference;
	}
	
	
	private String getElementNameFromReference(String reference) {

		if(reference==null || reference.length()==0) {
			return "";
		}
		int startIndex = reference.indexOf("?type=");

		if(startIndex!=-1) {
			String name = reference.substring(0, startIndex);

			if(name.startsWith("amlt:/#")) {
				name=name.replaceFirst("amlt\\:\\/\\#", "");
				return name;
			}
			return name;
		}

		return reference;
	}
}
