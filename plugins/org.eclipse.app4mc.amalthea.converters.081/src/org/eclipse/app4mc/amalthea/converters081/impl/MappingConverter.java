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

/**
 * This class is responsible for converting the Mapping Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class MappingConverter extends AbstractConverter {

	public MappingConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing Mapping converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateMappingModel_coreAllocation(rootElement);
		
		updateMappingModel_schedulerAllocation(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}
	
	/**
	 * This method is used to migrate the MappingModel data (priority element from TaskAllocation should be moved to SchedulingParameters element: For further
	 * details, check : Bug 511284, 518070 )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateMappingModel_schedulerAllocation(Element rootElement) {
		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./mappingModel/taskAllocation");
		
		
		final List<Element> taskAllocationElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
		
		boolean priorityAddedAsSchedulingParameter=false;
 
		for (Element taskAllocationElement : taskAllocationElements) {
			
			Attribute priorityAttribute = taskAllocationElement.getAttribute("priority");

			if(priorityAttribute !=null){
				
				String value = priorityAttribute.getValue();
				
				/*-- removing attribute based on the metamodel changes introduced in 0.8.1 --*/

				taskAllocationElement.removeAttribute(priorityAttribute);
				
				if(!value.equals("0")){
					
					priorityAddedAsSchedulingParameter=true;
					
					Element schedulingParametersElement=new Element("schedulingParameters");
					
					schedulingParametersElement.setAttribute("priority", value);
					
					taskAllocationElement.addContent(schedulingParametersElement);
				}


			}

		}
		
		if(priorityAddedAsSchedulingParameter){
			this.logger.info("Priority is removed from TaskAllocation elements and added as a attribute in corresponding SchedulingParameters element");
		}
	}

	/**
	 * This method is used to migrate the MappingModel data (CoreAllocations elements to SchedulerAllocation : For further
	 * details, check : Bug 518070  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateMappingModel_coreAllocation(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./mappingModel/coreAllocation");
		
		
		final List<Element> coreAllocationElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
 
		

		for (Element coreAllocationElement : coreAllocationElements) { 
			
			coreAllocationElement.setName("schedulerAllocation");
			
			Attribute coreAttribute = coreAllocationElement.getAttribute("core");
			
			Element coreElement = coreAllocationElement.getChild("core");
			
			if(coreAttribute!=null){
				coreAttribute.setName("responsibility");
			}else if(coreElement!=null){
				coreElement.setName("responsibility");
			}
			
		 
		}


		
		
	}
 
}
