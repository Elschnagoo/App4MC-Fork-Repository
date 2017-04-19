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
package org.eclipse.app4mc.amalthea.converters111.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.jdom2.Document;
import org.jdom2.Element;

public class CentralConverter implements IConverter {

	private final HelperUtils_110_111 helper;
	private final Logger logger;

	public CentralConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.110 to itea.111 : Executing Central converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("common"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("hw"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("os"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("stimuli"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("sw"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("propertyconstraints"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("mapping"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("events"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("constraints"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("config"));
		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("components"));


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

}
