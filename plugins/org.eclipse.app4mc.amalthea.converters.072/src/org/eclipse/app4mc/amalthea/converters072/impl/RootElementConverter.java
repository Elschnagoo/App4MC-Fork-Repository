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
package org.eclipse.app4mc.amalthea.converters072.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the root element of the model file as : "Amalthea" (only if for the supplied
 * model root element is other than "Amalthea" e.g: hwModel or swModel)
 *
 * @author mez2rng
 *
 */
public class RootElementConverter implements IConverter {

	private final HelperUtils_071_072 helper;

	private final Logger logger;

	public RootElementConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}


	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		/*-
		 * ==============
		 *|| Input Model :||
		 * ==============
		 * <am:MappingModel xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:am="http://app4mc.eclipse.org/amalthea/0.7.1" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
		 *	</am:MappingModel>
		 *
		 * ==============
		 *|| Output Model :||
		 * ==============
		 *
		 * <am:Amalthea xmlns:am="http://app4mc.eclipse.org/amalthea/0.7.2" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
		 *		<mappingModel>
		 *
		 *		</mappingModel>
		  </am:Amalthea>
		 */


		this.logger.info("Migration from 0.7.1 to 0.7.2 : Starting \"Root Element Converter\"");

		final Document document = fileName_documentsMap.get(targetFile);

		if (document == null) {
			return;
		}
		final Element rootElement = document.getRootElement();

		final String rootTagName = rootElement.getName();

		if (!rootTagName.equals("Amalthea")) {

			if (rootTagName.equals("SWModel") || rootTagName.equals("HWModel") || rootTagName.equals("OSModel")
					|| rootTagName.equals("StimuliModel") || rootTagName.equals("ConstraintsModel")
					|| rootTagName.equals("EventModel") || rootTagName.equals("PropertyConstraintsModel")
					|| rootTagName.equals("MappingModel") || rootTagName.equals("ConfigModel")
					|| rootTagName.equals("ComponentsModel")) {

				final Element newRootElement = new Element("Amalthea");

				this.helper.copyAllNameSpaces(rootElement, newRootElement);

				updateCurrentRootTagProps(rootElement);

				document.removeContent();

				newRootElement.addContent(rootElement);

				document.addContent(newRootElement);

				fileName_documentsMap.put(targetFile.getCanonicalFile(), document);
			}

		}


	}

	/**
	 * This method is used to remove the default namespaces associated to the Root Element and also change the name of
	 * it -> so that it can be added as a sub-tag inside "Amalthea root element"
	 *
	 * @param rootElement
	 *            Element This is the root element of the model file (where Amalthea is not root element)
	 */
	private void updateCurrentRootTagProps(final Element rootElement) {

		this.helper.removeDefaultAttribs(rootElement);

		final String name = rootElement.getName();

		if (name.equals("SWModel")) {
			rootElement.setName("swModel");
		}
		else if (name.equals("HWModel")) {
			rootElement.setName("hwModel");
		}
		else if (name.equals("OSModel")) {
			rootElement.setName("osModel");
		}
		else if (name.equals("StimuliModel")) {
			rootElement.setName("stimuliModel");
		}
		else if (name.equals("ConstraintsModel")) {
			rootElement.setName("constraintsModel");
		}
		else if (name.equals("EventModel")) {
			rootElement.setName("eventModel");
		}
		else if (name.equals("PropertyConstraintsModel")) {
			rootElement.setName("propertyConstraintsModel");
		}
		else if (name.equals("MappingModel")) {
			rootElement.setName("mappingModel");
		}
		else if (name.equals("ConfigModel")) {
			rootElement.setName("configModel");
		}
		else if (name.equals("ComponentsModel")) {
			rootElement.setName("componentsModel");
		}


	}

}
