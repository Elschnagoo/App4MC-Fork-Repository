/**
 ********************************************************************************
 * Copyright (c) 2017-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters083.impl;

import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters083.utils.HelperUtils_082_083;
import org.jdom2.Element;

public abstract class AbstractConverter implements IConverter {

	protected HelperUtils_082_083 helper;

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
}
