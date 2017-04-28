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
package org.eclipse.app4mc.amalthea.converters080.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters080.utils.HelperUtils_072_080;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the Mapping Model elements from 0.7.2 to 0.8.0 version format of AMALTHEA
 * model
 *
 * @author mez2rng
 *
 */
public class MappingConverter extends AbstractConverter {


	public MappingConverter() {
		this.helper = HelperUtils_072_080.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.7.2 to 0.8.0 : Executing Mapping converter for model file : " + targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_Mapping(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * Below migration is for the metamodel change : Bug 513977 (Restructure MappingModel)
	 *
	 * Mapping(Abstract) class and AbstractElementMapping class contents are merged into a class : MemoryMapping
	 *
	 * @param rootElement
	 */
	private void update_Mapping(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./mappingModel/mapping[@xsi:type=\"am:AbstractElementMapping\"]");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element mappingElements : elements) {

			mappingElements.removeAttribute("type", this.helper.getGenericNS("xsi"));

			mappingElements.setName("memoryMapping");

		}

	}


}
