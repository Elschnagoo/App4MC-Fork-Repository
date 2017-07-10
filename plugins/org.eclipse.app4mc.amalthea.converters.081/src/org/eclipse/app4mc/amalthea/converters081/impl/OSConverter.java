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
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the OS Model elements from 0.8.0 to 0.8.1 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class OSConverter extends AbstractConverter {

	public OSConverter() {
		this.helper = HelperUtils_080_081.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.0 to 0.8.1  : Executing OS converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateOSModel(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to migrate the OS model data (AlgorithmParameter elements to ParameterExtension inside UserSpecificSchedulingAlgorithm : For further
	 * details, check : Bug 518070  )
	 *
	 *
	 * @param rootElement
	 *            Amalthea root element
	 */
	private void updateOSModel(Element rootElement) {

		
		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./osModel/operatingSystems/interruptControllers");
		xpathBuffer.append("|");
		xpathBuffer.append("./osModel/operatingSystems/taskSchedulers");
		
		
		final List<Element> sourceElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));
 

		for (Element sourceElement : sourceElements) { 
			
			final List<Element> algorithmParameterElements = this.helper.getXpathResult(sourceElement, "./schedulingAlgorithm[@xsi:type=\"am:UserSpecificSchedulingAlgorithm\"]/parameter",
					Element.class, this.helper.getGenericNS("xsi"));

			 for (Element algorithmParameterElement : algorithmParameterElements) {
				
				 algorithmParameterElement.setName("parameterExtensions");
			}
			
			
		}


		
		
	}
 
}
