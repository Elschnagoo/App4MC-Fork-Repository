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
package org.eclipse.app4mc.amalthea.converters.common.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.jdom2.Document;

public interface IConverter {
	
	public final Logger logger=LogManager.getLogger("Model-Migration");
	
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap, List<ICache> caches)
			throws Exception;

	default public Document getDocument(final Map<File, Document> fileName_documentsMap, final String fileName,
			final String outputDirectory) {

		final Set<File> files = fileName_documentsMap.keySet();

		for (final File file : files) {
			if (file.equals(fileName)) {
				return fileName_documentsMap.get(file);
			}
		}
		return null;
	}

	default File getFile(final Map<File, Document> fileName_documentsMap, final String fileName) {

		final Set<File> files = fileName_documentsMap.keySet();

		for (final File file : files) {
			if (file.getName().equals(fileName)) {
				return file;
			}
		}
		return null;
	}


	@SuppressWarnings("unchecked")
	default <T extends ICache> List<T> getFilteredCaches(final List<ICache> caches, final Class<T>... filterTypes) {

		final List<T> filteredCaches = new ArrayList<T>();

		for (final ICache iCache : caches) {

			for (final Class<T> filterType : filterTypes) {
				if (iCache.getClass().isAssignableFrom(filterType)) {
					filteredCaches.add((T) iCache);
				}

			}
		}

		return filteredCaches;
	}
}
