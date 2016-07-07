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
package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.jdom2.Document;
import org.jdom2.Element;

public class PropertyContraintsConverter implements IConverter {

	private final HelperUtils_111_070 helper;

	public PropertyContraintsConverter() {
		this.helper = HelperUtils_111_070.getInstance();
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_MemTypeDefinitions(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void update_MemTypeDefinitions(final Element rootElement) {


		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: memTypeDefinitions inside PropertyConstraintsModel are changed to memoryTypeDefinitions
		 */

		final List<Element> memTypeDefinitions = this.helper.getXpathResult(rootElement,
				".//propertyConstraintsModel/memTypeDefinitions|/propertyconstraints:PropertyConstraintsModel/memTypeDefinitions",
				Element.class, this.helper.getNS_111("propertyconstraints"));


		for (final Element element : memTypeDefinitions) {

			element.setName("memoryTypeDefinitions");
		}


		/*-
		 * TODO: NOTE: currently it is not supported to migrate URI-Fragments inside CustomProperties and other
		 * references->
		 * - as it could be a huge performance hit in finding all the references of hw:MemType in various
		 * customproprerties across the models and updating them accordingly
		 *
		 * ## In a case user is having models with URI fragments, it is expected that they manually convert such models to have URI fragments (by using the workflow components provided by the Amalthea team)
		 */

	}

}
