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
import org.eclipse.app4mc.amalthea.converters.common.utils.ModelVersion;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class SchedulerCacheBuilder extends AbstractAttributeRefCacheBuilder {


	public SchedulerCacheBuilder() {

		this.helper = HelperUtils_103_110.getInstance();
	}


	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {


		for (final File targetFile : fileName_documentsMap.keySet()) {

			/*- Cache initialized */

			getCacheMap().put(targetFile, new HashMap<String, Object>());

			final Document rootDocument = fileName_documentsMap.get(targetFile);

			/*- Key is a UUID and value is Element  */

			populate_All_UUID_Elements(targetFile, rootDocument, ".//osModel/scheduler | .//os:OSModel/scheduler",
					SchedulerCacheEnum.UUID_SCHEDULER_ELEMENT.name(), this.helper.getNS_103("os"));

			/*- Key is a legacy URI fragment and value is List of Attribute's having the same reference */

			final Map<String, List<Attribute>> uriFragment_schedulerRefAttribsMap = getAllSchedulerAttributes_containing_URIFragments(rootDocument);

			getCacheMap().get(targetFile).put(SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES.name(),
					uriFragment_schedulerRefAttribsMap);

			/*- Key is a legacy URI fragment and value is List of Elements which belong to this URIFragment */

			final Map<String, Element> uriFragment_SchedulerMap = getAllSchedulerElements_referred_by_URIFragments(
					targetFile, rootDocument);


			getCacheMap().get(targetFile).put(SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_ELEMENT.name(),
					uriFragment_SchedulerMap);


			/*- ---------Handling HREF elements ---------*/


			populateAllHREFSchedulerAttributes_having_legacy_URI_refs(targetFile, rootDocument);


			populate_AllElements_referred_by_hrefURIFragments(targetFile, rootDocument, fileName_documentsMap);


		}


	}


	@SuppressWarnings("unchecked")
	public void updateURIFragments_in_Cache(final Map<File, Document> fileName_documentsMap) {

		/*- based on the current implementation, Cache is updated after SchedulerRefs are updated */


		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Map<String, Object> cache_file_specific_Map = getCacheMap().get(targetFile);

			BiMap<String, String> biMap_urifragments_new_old = (BiMap<String, String>) cache_file_specific_Map
					.get(SchedulerCacheEnum.URI_FRAGMENT_NEW_OLD.name());

			if (biMap_urifragments_new_old == null) {

				biMap_urifragments_new_old = HashBiMap.create();

				cache_file_specific_Map.put(SchedulerCacheEnum.URI_FRAGMENT_NEW_OLD.name(), biMap_urifragments_new_old);

			}

			/*- As the user has requested to update the cache for URI fragments, clear the existing cache  */

			biMap_urifragments_new_old.clear();


			final Map<String, Element> urifragment_element_map = (Map<String, Element>) cache_file_specific_Map
					.get(SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_ELEMENT.name());

			for (final String old_uriFragment : urifragment_element_map.keySet()) {

				final Element element = urifragment_element_map.get(old_uriFragment);

				final String updated_uriFragment = this.helper.getURIFragment(element, ModelVersion._110);


				biMap_urifragments_new_old.put(updated_uriFragment, old_uriFragment);

			}


			final Map<String, Element> hrefurifragment_element_map = (Map<String, Element>) cache_file_specific_Map
					.get(SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_ELEMENT.name());

			for (final String old_href_uriFragment : hrefurifragment_element_map.keySet()) {

				final Element element = hrefurifragment_element_map.get(old_href_uriFragment);

				final String updated_uriFragment_part2 = this.helper.getURIFragment(element, ModelVersion._110);

				final String[] split = old_href_uriFragment.split("#");

				biMap_urifragments_new_old.put(split[0] + "#" + updated_uriFragment_part2, old_href_uriFragment);

			}


		}

	}

	private void populate_AllElements_referred_by_hrefURIFragments(final File targetFile, final Document rootDocument,
			final Map<File, Document> fileName_documentsMap) {
		populate_AllElements_referred_by_hrefURIFragments(targetFile, rootDocument, fileName_documentsMap,
				SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES.name(),
				SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_ELEMENT.name());

	}

	private void populateAllHREFSchedulerAttributes_having_legacy_URI_refs(final File targetFile,
			final Document rootDocument) {

		populateAllHREF_ElementAttributes_having_legacy_URI_refs(targetFile, rootDocument,
				".//scheduler/@href[contains(., \"/\")]",
				SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES.name());

	}


	/**
	 * This method is used to grab all the Attributes referring to legacy format of URI fragments and group them
	 * accordingly based on key as URIFragment
	 *
	 * @param rootDocument
	 * @return
	 */
	private Map<String, List<Attribute>> getAllSchedulerAttributes_containing_URIFragments(final Document rootDocument) {

		return getAllAttributes_containing_URIFragments(rootDocument, ".//@scheduler[contains(., \"/\")]");


	}

	/**
	 * This method is used to grab all Elements referred by legacy URI fragments and build a Map containing key as
	 * URIFragment and value as corresponding Element
	 *
	 * @param targetFile
	 * @param rootDocument
	 * @return
	 */
	private Map<String, Element> getAllSchedulerElements_referred_by_URIFragments(final File targetFile,
			final Document rootDocument) {


		return getAllElements_referred_by_URIFragments(targetFile, rootDocument,
				SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES.name());
	}


}
