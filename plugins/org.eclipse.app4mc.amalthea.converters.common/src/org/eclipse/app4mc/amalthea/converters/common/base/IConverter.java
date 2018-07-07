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

package org.eclipse.app4mc.amalthea.converters.common.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.jdom2.Document;

public interface IConverter {
	
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
