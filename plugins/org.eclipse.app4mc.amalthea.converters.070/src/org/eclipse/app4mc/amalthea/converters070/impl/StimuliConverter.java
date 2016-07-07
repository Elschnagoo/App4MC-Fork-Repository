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

public class StimuliConverter implements IConverter {

	private final HelperUtils_111_070 helper;

	public StimuliConverter() {
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


		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

}
