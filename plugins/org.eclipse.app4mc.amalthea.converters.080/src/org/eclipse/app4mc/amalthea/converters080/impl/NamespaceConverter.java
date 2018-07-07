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

package org.eclipse.app4mc.amalthea.converters080.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters080.utils.HelperUtils_072_080;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the namespace of AMALTHEA model from 0.7.2 to 0.8.0
 *
 * @author mez2rng
 *
 */
public class NamespaceConverter implements IConverter {

	private final HelperUtils_072_080 helper;

	private final Logger logger;

	public NamespaceConverter() {
		this.helper = HelperUtils_072_080.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.2 to 0.8.0 : Executing Namespace converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateRootElement_NameSpaces_to_080(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


}
