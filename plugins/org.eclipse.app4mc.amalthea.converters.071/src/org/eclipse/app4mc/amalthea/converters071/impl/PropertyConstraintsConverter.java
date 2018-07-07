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

package org.eclipse.app4mc.amalthea.converters071.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters071.utils.HelperUtils_070_071;
import org.jdom2.Document;
import org.jdom2.Element;

public class PropertyConstraintsConverter extends AbstractConverter {


	public PropertyConstraintsConverter() {
		this.helper = HelperUtils_070_071.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.0 to 0.7.1 : Executing PropertyConstraints converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		/*- Migration of size attribute of MemoryType to DataSize element */

		update_Size_MemoryType(rootElement, "./propertyConstraintsModel/memoryTypeDefinitions");

		/*- Migration of frequency attribute of Quartz to Frequency element */

		update_frequency_Quartz(rootElement,
				"./propertyConstraintsModel/mappingConstraints/hwConstraint//quartzes[@frequency]");

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


}
