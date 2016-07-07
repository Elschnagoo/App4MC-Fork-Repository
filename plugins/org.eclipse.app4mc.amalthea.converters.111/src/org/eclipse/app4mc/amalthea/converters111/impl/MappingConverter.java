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

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.jdom2.Document;
import org.jdom2.Element;

public class MappingConverter implements IConverter {

	private final HelperUtils_110_111 helper;

	public MappingConverter() {
		this.helper = HelperUtils_110_111.getInstance();
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("os"), this.helper.getNS_111("sw"));

		updateEnum_MemoryAddressMappingType(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	private void updateEnum_MemoryAddressMappingType(final Element rootElement) {

		/*--
		 * MemoryAddressMappingType enum is referred inside MappingModel i.e. as per the schema, it can occur in either
		 * mapping:MappingModel or mappingModel tags
		 *
		 */

		// Migraiton step to 111 from 110: Grep the mappingModel elements which do not have addressMappingType attribute
		// and set the attribute and its value as : none (as it was the default value as per meta model in 110)

		final List<Element> mappingModels = this.helper.getXpathResult(rootElement,
				".//mappingModel[not(@addressMappingType)]|/mapping:MappingModel[not(@addressMappingType)]",
				Element.class, this.helper.getNS_111("mapping"));


		for (final Element mappingModel : mappingModels) {

			mappingModel.setAttribute("addressMappingType", "none");
		}

	}

}
