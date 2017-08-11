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
package org.eclipse.app4mc.amalthea.converters082.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters082.utils.HelperUtils_081_082;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the namespace of AMALTHEA model from 0.8.1 to 0.8.2
 *
 * @author mez2rng
 *
 */
public class NamespaceConverter implements IConverter {

	private final HelperUtils_081_082 helper;

	private final Logger logger;

	public NamespaceConverter() {
		this.helper = HelperUtils_081_082.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.8.1 to 0.8.2 : Executing Namespace converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateRootElement_NameSpaces_to_082(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


}
