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
package org.eclipse.app4mc.amalthea.converters110.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters110.utils.HelperUtils_103_110;
import org.jdom2.Document;
import org.jdom2.Element;

public class CentralConverter implements IConverter {

	private final HelperUtils_103_110 helper;
	private final Logger logger;

	public CentralConverter() {
		this.helper = HelperUtils_103_110.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.103 to itea.110 : Executing Central converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_110(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("common"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("hw"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("os"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("stimuli"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("sw"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("propertyconstraints"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("mapping"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("events"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("constraints"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("config"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_110("components"));


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

}
