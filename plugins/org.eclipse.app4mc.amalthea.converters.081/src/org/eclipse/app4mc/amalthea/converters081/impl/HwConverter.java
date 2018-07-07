/**
 ********************************************************************************
 * Copyright (c) 2015-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters081.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters081.utils.HelperUtils_080_081;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Parent;

/**
 * This class is responsible for converting the HW Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class HwConverter extends AbstractConverter {

	public HwConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing Hardware converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		removeXAccessPattern(rootElement);

		updateQuartz(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to move all Quartz elements to a single global list inside Hardware model i.e. directly inside HwSystem element (For further
	 * details, check : Bug 518069 )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateQuartz(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./hwModel/system//quartzes");
		
		
		final List<Element> hwSystemElements = this.helper.getXpathResult(rootElement, "./hwModel/system",
				Element.class, this.helper.getGenericNS("xsi"));

		final List<Element> quartzElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
	
		Element hwSystemElement = null;

		if ( hwSystemElements.size() > 0) {
			hwSystemElement = hwSystemElements.get(0);
		} 
		

		for (Element quartzElement : quartzElements) {
				//removing content of quartz element from existing parent
				Parent parent = quartzElement.getParent();
				
				if(parent !=null){
					//In case of nested Quartz, elements would have been removed from their parents
					parent.removeContent(quartzElement);
				}

				//changing the tag name of Quartz 
				quartzElement.setName("quartzes");
				
				//setting Quartz element to HwSystem
				hwSystemElement.addContent(quartzElement);
				
				Attribute nameAttribute = quartzElement.getAttribute("name");
				
				String quartzName = nameAttribute!=null? nameAttribute.getValue():"";
				
				
				logger.info("Moved Quartz element"+quartzName+" as a child element of HwSystem");
				
				//removing sub-elements which are no longer valid as per 0.8.1
				boolean removedComponents = quartzElement.removeChild("components");
				if(removedComponents){
					this.logger.warn("-- Removed all HwComponent objects defined inside Quartz : "+quartzName);
				}
				boolean removedMemories = quartzElement.removeChild("memories");
				
				if(removedMemories){
					this.logger.warn("-- Removed all Memory objects defined inside Quartz : "+quartzName);
				}
				boolean removedNetworks = quartzElement.removeChild("networks");
				if(removedNetworks){
					this.logger.warn("-- Removed all Network objects defined inside Quartz : "+quartzName);
				}
				boolean removedPorts = quartzElement.removeChild("ports");
				if(removedPorts){
					this.logger.warn("-- Removed all HwPort objects defined inside Quartz : "+quartzName);
				}
				boolean removedPrescalers = quartzElement.removeChild("prescaler");
				if(removedPrescalers){
					this.logger.warn("-- Removed all Prescaler objects defined inside Quartz : "+quartzName);
				}
				boolean removedQuartzes = quartzElement.removeChild("quartzes");
				
				if(removedQuartzes){
					this.logger.warn("-- Moved all Quartz objects defined inside Quartz : "+quartzName + " as elements inside HwSystem");
				}
		}


		
		
	}

	/**
	 * This method is used for the migration of MemmoryType element present inside the Hardware model (For further
	 * details, check : Bug 518068 )
	 *
	 * As the metamodel change in 0.8.1: xAccessPattern attribute is removed from the MemoryType element
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void removeXAccessPattern(final Element rootElement) {


		final List<Element> memoryTypeElements = this.helper.getXpathResult(rootElement, "./hwModel/memoryTypes",
				Element.class, this.helper.getGenericNS("xsi"));


		for (final Element memoryTypeElement : memoryTypeElements) {

			memoryTypeElement.removeAttribute("xAccessPattern");

			this.logger.info("xAccessPattern attribute and its value are removed from MemoryType: "
					+ memoryTypeElement.getAttributeValue("name"));
		}


	}

}
