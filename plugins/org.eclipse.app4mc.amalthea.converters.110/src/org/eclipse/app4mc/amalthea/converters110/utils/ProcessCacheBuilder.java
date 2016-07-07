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
package org.eclipse.app4mc.amalthea.converters110.utils;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractAttributeRefCacheBuilder;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ProcessCacheBuilder extends AbstractAttributeRefCacheBuilder {


	public ProcessCacheBuilder() {

		this.helper = HelperUtils_103_110.getInstance();
	}


	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {


		for (final File targetFile : fileName_documentsMap.keySet()) {

			/*- *********** Cache initialization ***********  */

			getCacheMap().put(targetFile, new HashMap<String, Object>());

			final Document rootDocument = fileName_documentsMap.get(targetFile);

			/*- Key is a UUID and value is Element  */

			populate_All_UUID_Elements(targetFile, rootDocument,
					".//swModel/tasks|.//swModel/isrs|sw:SWModel/tasks|sw:SWModel/isrs",
					ProcessCacheEnum.UUID_PROCESS_ELEMENT.name(), this.helper.getNS_103("sw"));


			/*- Key is a legacy URI fragment and value is List of Attribute's having the same reference */

			final Map<String, List<Attribute>> uriFragment_schedulerRefAttribsMap = getAllProcessAttributes_containing_URIFragments(rootDocument);

			getCacheMap().get(targetFile).put(ProcessCacheEnum.URIFRAGMENT_PROCESS_REFS_ATRIBUTES.name(),
					uriFragment_schedulerRefAttribsMap);

			/*- Key is a legacy URI fragment and value is List of Elements which belong to this URIFragment */

			final Map<String, Element> uriFragment_SchedulerMap = getAllProcessElements_referred_by_URIFragments(
					targetFile, rootDocument);


			getCacheMap().get(targetFile).put(ProcessCacheEnum.URIFRAGMENT_PROCESS_ELEMENT.name(),
					uriFragment_SchedulerMap);


			/*- ---------Handling HREF elements ---------*/


			populateAllHREFProcessAttributes_having_legacy_URI_refs(targetFile, rootDocument);


			populate_AllElements_referred_by_hrefURIFragments(targetFile, rootDocument, fileName_documentsMap);


		}


	}

	private void populate_AllElements_referred_by_hrefURIFragments(final File targetFile, final Document rootDocument,
			final Map<File, Document> fileName_documentsMap) {
		populate_AllElements_referred_by_hrefURIFragments(targetFile, rootDocument, fileName_documentsMap,
				ProcessCacheEnum.HREF_URIFRAGMENT_PROCESS_REFS_ATRIBUTES.name(),
				ProcessCacheEnum.HREF_URIFRAGMENT_PROCESS_ELEMENT.name());
	}


	private void populateAllHREFProcessAttributes_having_legacy_URI_refs(final File targetFile,
			final Document rootDocument) {
		populateAllHREF_ElementAttributes_having_legacy_URI_refs(targetFile, rootDocument,
				".//process/@href[contains(., \"/\")]", ProcessCacheEnum.HREF_URIFRAGMENT_PROCESS_REFS_ATRIBUTES.name());

	}


	/**
	 * This method is used to grab all the Attributes referring to legacy format of URI fragments and group them
	 * accordingly based on key as URIFragment
	 *
	 * @param rootDocument
	 * @return
	 */
	private Map<String, List<Attribute>> getAllProcessAttributes_containing_URIFragments(final Document rootDocument) {

		return getAllAttributes_containing_URIFragments(rootDocument, ".//@process[contains(., \"/\")]");


	}

	/**
	 * This method is used to grab all Elements referred by legacy URI fragments and build a Map containing key as
	 * URIFragment and value as corresponding Element
	 *
	 * @param targetFile
	 * @param rootDocument
	 * @return
	 */
	private Map<String, Element> getAllProcessElements_referred_by_URIFragments(final File targetFile,
			final Document rootDocument) {
		return getAllElements_referred_by_URIFragments(targetFile, rootDocument,
				ProcessCacheEnum.URIFRAGMENT_PROCESS_REFS_ATRIBUTES.name());
	}


}
