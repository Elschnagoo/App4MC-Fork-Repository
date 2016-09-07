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
package org.eclipse.app4mc.amalthea.converters071.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters071.utils.HelperUtils_070_071;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter implements IConverter {

	private final HelperUtils_070_071 helper;

	private final Logger logger;

	public SwConverter() {
		this.helper = HelperUtils_070_071.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.0 to 0.7.1 : Starting Sw converter");

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*- Migration of DataSize attributes */
		update_DataSize(rootElement);

		this.helper.updateRootElement_NameSpaces_to_071(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	/**
	 * This method is used to migrate the contents of "DataSize" element which can be contained inside following
	 * AMALTHEA elements: <br>
	 * BaseTypeDefinition <br>
	 * Section <br>
	 * Task <br>
	 * ISR <br>
	 * ProcessPrototype <br>
	 * ModeLabel <br>
	 * Label <br>
	 * Runnable<br>
	 * CustomEntity<br>
	 *
	 * Change : in previous version of model (0.7.0) -> DataSize element was consisting of "numberBits". In model
	 * (0.7.1) it is changed to "value" and an additional attribute "unit" is introduced [As a part of migration value
	 * set for "unit" is "bit"]
	 *
	 * @param rootElement
	 *            root XML Element
	 */
	private void update_DataSize(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/sections/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/typeDefinitions/size");
		xpathBuffer.append("|");

		xpathBuffer.append("./swModel/tasks/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/processPrototypes/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/modeLabels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/labels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/customEntities/size");


		final List<Element> dataSizes = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getNS_071("am"));


		for (final Element dataSizeElement : dataSizes) {

			final Attribute numberBits = dataSizeElement.getAttribute("numberBits");

			if (numberBits != null) {

				numberBits.setName("value");

				final Attribute unit = new Attribute("unit", "bit");

				dataSizeElement.setAttribute(unit);


			}
		}

	}

}
