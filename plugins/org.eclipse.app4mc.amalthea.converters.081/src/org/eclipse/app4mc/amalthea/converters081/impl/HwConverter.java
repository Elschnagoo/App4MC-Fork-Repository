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


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
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
