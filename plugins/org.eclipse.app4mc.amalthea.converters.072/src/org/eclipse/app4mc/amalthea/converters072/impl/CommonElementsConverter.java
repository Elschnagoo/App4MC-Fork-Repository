/*******************************************************************************
 * Copyright (c) 2017 Robert Bosch GmbH and others.
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
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.jdom2.Document;
import org.jdom2.Element;

public class CommonElementsConverter extends AbstractConverter {


	public CommonElementsConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}


	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.1 to 0.7.2 : Executing \"Common Elements\" converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateCommonElements(rootElement);
	}


	/**
	 * Bug 510086 : As per the model changes in 0.7.2 ==>
	 *
	 * @param rootElement
	 */
	private void updateCommonElements(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./componentsModel/tags");
		xpathBuffer.append("|");
		xpathBuffer.append("./hwModel/tags");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/tags");

		final List<Element> tagElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		if (tagElements.size() > 0) {

			Element commonElements = rootElement.getChild("commonElements");

			// check if "commonElements" tag is already existing. If not then create a Element
			if (commonElements == null) {
				commonElements = new Element("commonElements");
				rootElement.addContent(commonElements);
			}

			for (final Element tagElement : tagElements) {
				final Element parentElement = tagElement.getParentElement();
				// removing Tag Elements from its parent and associating it to commonElements Tag
				parentElement.removeContent(tagElement);
				commonElements.addContent(tagElement);
			}
		}


	}

}
