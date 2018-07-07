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

package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.jdom2.Document;

public class CentralConverter implements IConverter {


	public CentralConverter() {
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

}
