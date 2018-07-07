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

package org.eclipse.app4mc.amalthea.converters083.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters083.utils.HelperUtils_082_083;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the HW Model elements from 0.8.2 to 0.8.3 version format of AMALTHEA model
 *
 * @author zmeer
 *
 */
public class ComponentModelConverter extends AbstractConverter {

	public ComponentModelConverter() {
		this.helper = HelperUtils_082_083.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.2 to 0.8.3  : Executing Component model converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();


		updateInterfacePort(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to change the reference of FInterfacePort to InterfacePort , check : Bug 528932)
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateInterfacePort(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./componentsModel/components/ports");
		
		
		final List<Element> portElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		//Setting xsi:type value of Port
		for (Element portElement : portElements) { 
			Attribute typeAttribute = portElement.getAttribute("type", helper.getGenericNS("xsi"));
			
			if(typeAttribute !=null) {
				String value = typeAttribute.getValue();
				if(value.equals("am:FInterfacePort")) {
					typeAttribute.setValue("am:InterfacePort");
				}
			}
			
		}

		/*========== updating references ==================*/
		
		final StringBuffer xpathBufferForReferences = new StringBuffer();

		xpathBufferForReferences.append("./componentsModel/components/groundedPorts");
		
		xpathBufferForReferences.append("|");
		
		xpathBufferForReferences.append("./componentsModel/components/connectors/sourcePort");
		
		xpathBufferForReferences.append("|");
		
		xpathBufferForReferences.append("./componentsModel/components/connectors/targetPort");
		
		xpathBufferForReferences.append("|");
		
		xpathBufferForReferences.append("./componentsModel/systems/groundedPorts");

		xpathBufferForReferences.append("|");

		xpathBufferForReferences.append("./componentsModel/systems/connectors/sourcePort");

		xpathBufferForReferences.append("|");

		xpathBufferForReferences.append("./componentsModel/systems/connectors/targetPort");
		
		
		
		final List<Element> elementsReferringPorts = this.helper.getXpathResult(rootElement, xpathBufferForReferences.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (Element elementReferringPort : elementsReferringPorts) { 
			
			Attribute portAttribute = elementReferringPort.getAttribute("port");
			
			if(portAttribute==null) {
				
				Element portElement = elementReferringPort.getChild("port");
				
				if(portElement!=null) {
				
					/*
					 * This is the case where Port element from other file is referenced
					 * In this case, below scernarios should be considered:
					 * 1.type updation 
					 * 2.reference href updation
					 */
					
					//type updation
					
					Attribute typeAttribute = portElement.getAttribute("type", helper.getGenericNS("xsi"));
					
					if(typeAttribute !=null) {
						String value = typeAttribute.getValue();
						if(value.equals("am:FInterfacePort")) {
							typeAttribute.setValue("am:InterfacePort");
						}
					}
					//href updation
					
					Attribute hrefAttribute = portElement.getAttribute("href");
					
					if(hrefAttribute!=null) {
						String value = hrefAttribute.getValue();
						
						value=value.replace("=FInterfacePort", "=InterfacePort");
						hrefAttribute.setValue(value);
					}
				}
			}else {
				//referring to local ports
				
				String value = portAttribute.getValue();
				
				value=value.replace("=FInterfacePort", "=InterfacePort");
				portAttribute.setValue(value);
			}
			
		}
		
		
		
	}

  

}
