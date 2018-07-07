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

package org.eclipse.app4mc.amalthea.converters111.utils;

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

public class ComponentModelRefsCacheBuilder extends AbstractAttributeRefCacheBuilder {


	public ComponentModelRefsCacheBuilder() {

		this.helper = HelperUtils_110_111.getInstance();
	}


	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {


		for (final File targetFile : fileName_documentsMap.keySet()) {

			/*- Cache initialized */

			getCacheMap().put(targetFile, new HashMap<String, Object>());

			final Document rootDocument = fileName_documentsMap.get(targetFile);

			/*- Key is a UUID and value is Element  */

			// populate_All_UUID_Elements(targetFile, rootDocument, ".//elements[(@xsi:type=\"components:Component\")]",
			// PortCacheEnum.UUID_COMPONENT_ELEMENT.name(), this.helper.getNS_110("components"));

			/*- Key is a legacy URI fragment and value is List of Attribute's having the same reference */

			final Map<String, List<Attribute>> uriFragment_portRefAttribsMap = getAllElementRefAttributes_containing_URIFragments(rootDocument);

			getCacheMap().get(targetFile).put(CacheEnum.URIFRAGMENT_ELEMENT_REFS_ATRIBUTES.name(),
					uriFragment_portRefAttribsMap);

			/*- Key is a legacy URI fragment and value is List of Elements which belong to this URIFragment */

			final Map<String, Element> uriFragment_PortMap = getAllElements_referred_by_URIFragments(targetFile,
					rootDocument);


			getCacheMap().get(targetFile)
			.put(CacheEnum.URIFRAGMENT_ELEMENT.name(), uriFragment_PortMap);


			/*- ---------Handling HREF elements ---------*/


			populateAllHREFAttributes_having_legacy_URI_refs(targetFile, rootDocument);


			populate_AllElements_referred_by_hrefURIFragments(targetFile, rootDocument, fileName_documentsMap);


		}


	}


	@SuppressWarnings("unchecked")
	public void updateURIFragments_in_Cache(final Map<File, Document> fileName_documentsMap) {

		/*- based on the current implementation, Cache is updated after SchedulerRefs are updated */


		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Map<String, Object> cache_file_specific_Map = getCacheMap().get(targetFile);

			BiMap<String, String> biMap_urifragments_new_old = (BiMap<String, String>) cache_file_specific_Map
					.get(CacheEnum.ELEMENT_URI_FRAGMENT_NEW_OLD.name());

			if (biMap_urifragments_new_old == null) {

				biMap_urifragments_new_old = HashBiMap.create();

				cache_file_specific_Map.put(CacheEnum.ELEMENT_URI_FRAGMENT_NEW_OLD.name(),
						biMap_urifragments_new_old);

			}

			/*- As the user has requested to update the cache for URI fragments, clear the existing cache  */

			biMap_urifragments_new_old.clear();


			final Map<String, Element> urifragment_element_map = (Map<String, Element>) cache_file_specific_Map
					.get(CacheEnum.URIFRAGMENT_ELEMENT.name());

			for (final String old_uriFragment : urifragment_element_map.keySet()) {

				final Element element = urifragment_element_map.get(old_uriFragment);

				final String updated_uriFragment = this.helper.getURIFragment(element, ModelVersion._111);


				biMap_urifragments_new_old.put(updated_uriFragment, old_uriFragment);

			}


			final Map<String, Element> hrefurifragment_element_map = (Map<String, Element>) cache_file_specific_Map
					.get(CacheEnum.HREF_URIFRAGMENT_ELEMENT.name());

			for (final String old_href_uriFragment : hrefurifragment_element_map.keySet()) {

				final Element element = hrefurifragment_element_map.get(old_href_uriFragment);

				final String updated_uriFragment_part2 = this.helper.getURIFragment(element, ModelVersion._111);

				final String[] split = old_href_uriFragment.split("#");

				biMap_urifragments_new_old.put(split[0] + "#" + updated_uriFragment_part2, old_href_uriFragment);

			}


		}

	}

	private void populate_AllElements_referred_by_hrefURIFragments(final File targetFile, final Document rootDocument,
			final Map<File, Document> fileName_documentsMap) {
		populate_AllElements_referred_by_hrefURIFragments(targetFile, rootDocument, fileName_documentsMap,
				CacheEnum.HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES.name(),
				CacheEnum.HREF_URIFRAGMENT_ELEMENT.name());

	}

	private void populateAllHREFAttributes_having_legacy_URI_refs(final File targetFile, final Document rootDocument) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer
		.append("(.//elements[(@xsi:type=\"components:Connector\")]/sourcePort/port/@href[contains(., \"/\")])");
		xpathBuffer.append("|");
		xpathBuffer
				.append("(.//elements[(@xsi:type=\"components:Connector\")]/targetPort/port/@href[contains(., \"/\")])");
		xpathBuffer.append("|");
		xpathBuffer
		.append("(.//elements[(@xsi:type=\"components:Connector\")]/sourcePort/instance/@href[contains(., \"/\")])");
		xpathBuffer.append("|");
		xpathBuffer
		.append("(.//elements[(@xsi:type=\"components:Connector\")]/targetPort/instance/@href[contains(., \"/\")])");

		xpathBuffer.append("|");
		xpathBuffer
		.append("(.//elements[(@xsi:type=\"components:ComponentInstance\")]/type/@href[contains(., \"/\")])");


		populateAllHREF_ElementAttributes_having_legacy_URI_refs(targetFile, rootDocument, xpathBuffer.toString(),
				CacheEnum.HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES.name(),
				this.helper.getNS_110("components"), this.helper.getGenericNS("xsi"));

	}


	/**
	 * This method is used to grab all the Attributes referring to legacy format of URI fragments and group them
	 * accordingly based on key as URIFragment
	 *
	 * @param rootDocument
	 * @return
	 */
	private Map<String, List<Attribute>> getAllElementRefAttributes_containing_URIFragments(final Document rootDocument) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("(.//elements[(@xsi:type=\"components:Connector\")]/sourcePort/@port[contains(., \"/\")])");
		xpathBuffer.append("|");

		xpathBuffer.append("(.//elements[(@xsi:type=\"components:Connector\")]/targetPort/@port[contains(., \"/\")])");
		xpathBuffer.append("|");

		xpathBuffer
		.append("(.//elements[(@xsi:type=\"components:Connector\")]/sourcePort/@instance[contains(., \"/\")])");
		xpathBuffer.append("|");

		xpathBuffer
		.append("(.//elements[(@xsi:type=\"components:Connector\")]/targetPort/@instance[contains(., \"/\")])");

		xpathBuffer.append("|");

		xpathBuffer.append("(.//elements[(@xsi:type=\"components:ComponentInstance\")]/@type[contains(., \"/\")])");


		return getAllAttributes_containing_URIFragments(rootDocument, xpathBuffer.toString(),
				this.helper.getNS_110("components"), this.helper.getGenericNS("xsi"));


	}

	/**
	 * This method is used to grab all Elements referred by legacy URI fragments and build a Map containing key as
	 * URIFragment and value as corresponding Element
	 *
	 * @param targetFile
	 * @param rootDocument
	 * @return
	 */
	private Map<String, Element> getAllElements_referred_by_URIFragments(final File targetFile,
			final Document rootDocument) {


		return getAllElements_referred_by_URIFragments(targetFile, rootDocument,
				CacheEnum.URIFRAGMENT_ELEMENT_REFS_ATRIBUTES.name());
	}


}
