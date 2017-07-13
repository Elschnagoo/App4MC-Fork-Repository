/*******************************************************************************
 * Copyright (c) 2016 Robert Bosch GmbH and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Robert Bosch GmbH - initial API and implementation
 *******************************************************************************/
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

/**
 * This class is responsible for converting the SW Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class SwConverter extends AbstractConverter {

	public SwConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing Software converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateRunnable(rootElement);

		updateAllAbstractProcessElements(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to remove priority from sub-classes of AbstractProcess (For further
	 * details, check : Bug 511284, 518070  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateAllAbstractProcessElements(Element rootElement) {
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/tasks");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/processPrototypes");

		final List<Element> abstractProcessElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		for (Element abstractProcessElement : abstractProcessElements) {
			
			Attribute priorityAttribute = abstractProcessElement.getAttribute("priority");
			
			if(priorityAttribute !=null){
				String value = priorityAttribute.getValue();
				
				/*-- removing attribute based on the metamodel changes introduced in 0.8.1 --*/
				
				abstractProcessElement.removeAttribute(priorityAttribute);
				
				if(!value.equals("0")){
 					
					Element customPropertiesElement=new Element("customProperties");
					
					customPropertiesElement.setAttribute("key", "priority");
					
					Element valueElement=new Element("value");
					
					valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
					
					valueElement.setAttribute("value", value);
					
					customPropertiesElement.addContent(valueElement);
					
					abstractProcessElement.addContent(customPropertiesElement);
					
					this.logger.info("Priority is removed from : "+abstractProcessElement.getName()+" element ("+abstractProcessElement.getAttributeValue("name")+") and added as a CustomProperty with key as Priority");
					
				}
				
				
			}
			
		}
		
		
	}

	/**
	 * This method is used to migrate the Runnable data to support multiple Activations (For further
	 * details, check : Bug 519357  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateRunnable(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/runnables");
		
		
		final List<Element> runnableElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
 
		

		for (Element runnableElement : runnableElements) { 
			
			Attribute activationAttribute = runnableElement.getAttribute("activation");
			Element activationElement = runnableElement.getChild("activation");
			
			if(activationAttribute !=null){
				activationAttribute.setName("activations");
			}else if(activationElement !=null){
				activationElement.setName("activations");
			}
		}


		
		
	}
 
}
