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
}
