/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters095.impl;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters095.utils.HelperUtils_094_095;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the namespace of AMALTHEA model from 0.9.4 to 0.9.5
 */
public class NamespaceConverter extends AbstractConverter {

	public NamespaceConverter() {
		this.helper = HelperUtils_094_095.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.9.4 to 0.9.5 : Executing Namespace converter for model file : "
				+ targetFile.getName());

		basicConvert(targetFile, fileName_documentsMap, caches);
	}

	public void basicConvert(final File targetFile, final Map<File, Document> fileName_documentsMap, final List<ICache> caches) {
		
		final Document document = fileName_documentsMap.get(targetFile);
		if (document == null) {
			return;
		}
		
		final Element rootElement = document.getRootElement();

		this.helper.updateRootElement_NameSpaces_to_095(rootElement);

		try {
			fileName_documentsMap.put(targetFile.getCanonicalFile(), document);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
