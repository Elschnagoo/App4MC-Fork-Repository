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

package org.eclipse.app4mc.amalthea.converters091.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters091.utils.HelperUtils_090_091;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the CustomProperties elements from 0.9.0 to 0.9.1 version format of AMALTHEA model
 *
 * @author zmeer
 *
 */
public class CustomPropertiesConverter extends AbstractConverter {

	public CustomPropertiesConverter() {
		this.helper = HelperUtils_090_091.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}
 

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.9.0 to 0.9.1  : Executing \"CustomProperties converter\" for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		migrateTimeObject(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}
 

	
	private void migrateTimeObject(Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//value[@xsi:type=\"am:TimeObject\"]");
		xpathBuffer.append("|");
		xpathBuffer.append(".//values[@xsi:type=\"am:TimeObject\"]");

		final List<Element> timeObjectElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
	 

		for (Element timeObjectElement : timeObjectElements) { 
			
			Attribute typeAttribute = timeObjectElement.getAttribute("type",this.helper.getGenericNS("xsi"));
			
			if(typeAttribute!=null) {
				typeAttribute.setValue("am:Time");
			}
			
		}

	}
 
}