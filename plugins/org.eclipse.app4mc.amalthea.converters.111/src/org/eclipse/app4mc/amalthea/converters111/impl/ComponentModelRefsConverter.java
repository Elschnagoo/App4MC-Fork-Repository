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
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters.common.utils.ModelVersion;
import org.eclipse.app4mc.amalthea.converters111.utils.CacheEnum;
import org.eclipse.app4mc.amalthea.converters111.utils.ComponentModelRefsCacheBuilder;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.Table;

public class ComponentModelRefsConverter implements IConverter {

	private final HelperUtils_110_111 helper;

	private final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	public ComponentModelRefsConverter() {
		this.helper = HelperUtils_110_111.getInstance();
	}

	public ComponentModelRefsConverter(final HelperUtils_110_111 helper) {
		this.helper = helper;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger
				.info("Migration from itea.110 to itea.111 : Executing ComponentModelRefs converter for model file : "
						+ targetFile.getName());

		for (final ICache cache : getFilteredCaches(caches, ComponentModelRefsCacheBuilder.class)) {


			loop: for (final File file : fileName_documentsMap.keySet()) {


				final Map<String, Object> cacheMap = cache.getCacheMap().get(file);

				if (cacheMap == null) {
					continue loop;
				}

				final Map<String, Element> uriFragment_component_map = (Map<String, Element>) cacheMap
						.get(CacheEnum.URIFRAGMENT_ELEMENT.name());


				final Map<String, List<Attribute>> uriFragment_component_attribs_map = (Map<String, List<Attribute>>) cacheMap
						.get(CacheEnum.URIFRAGMENT_ELEMENT_REFS_ATRIBUTES.name());

				if (uriFragment_component_attribs_map == null || uriFragment_component_map == null) {
					continue loop;
				}


				for (final String uriFragment : uriFragment_component_map.keySet()) {

					final Element element = uriFragment_component_map.get(uriFragment);

					// urifragments should be updated, as for certain elements parent is changed

					final String updated_uriFragment = this.helper.getURIFragment(element, ModelVersion._111);

					this.logger.info(uriFragment + " : : " + element + " : : " + updated_uriFragment);

					final List<Attribute> list = uriFragment_component_attribs_map.get(uriFragment);

					for (final Attribute attribute : list) {

						attribute.setValue(updated_uriFragment);
					}

				}


				/*- ============ updating hrefs   ============*/

				final Map<String, Element> href_uriFragment_component_map = (Map<String, Element>) cacheMap
						.get(CacheEnum.HREF_URIFRAGMENT_ELEMENT.name());

				final Map<File, Table<String, String, List<Attribute>>> href_urifragment_attributesMap = (Map<File, Table<String, String, List<Attribute>>>) cacheMap
						.get(CacheEnum.HREF_URIFRAGMENT_ELEMENT_REFS_ATRIBUTES.name());


				for (final String href_uriFragment : href_uriFragment_component_map.keySet()) {

					final Element componentElement = href_uriFragment_component_map.get(href_uriFragment);

					final String updated_uriFragment = this.helper.getURIFragment(componentElement, ModelVersion._111);

					final List<Attribute> attributes = getAttributes(href_urifragment_attributesMap, href_uriFragment);

					for (final Attribute attribute : attributes) {

						final String[] split = href_uriFragment.split("#");

						/*- Setting updated URI fragment */

						attribute.setValue(split[0] + "#" + updated_uriFragment);

					}

				}


			}


		}

		/*- once the references are created newly, update the cache to establish mapping between old URIFragments and the new ones */

		for (final ICache cache : caches) {
			if (cache instanceof ComponentModelRefsCacheBuilder) {
				((ComponentModelRefsCacheBuilder) cache).updateURIFragments_in_Cache(fileName_documentsMap);
			}
		}
	}

	private List<Attribute> getAttributes(
			final Map<File, Table<String, String, List<Attribute>>> href_urifragment_attributesMap,
			final String uriFragment) {
		for (final File referenceFile : href_urifragment_attributesMap.keySet()) {

			final Table<String, String, List<Attribute>> table = href_urifragment_attributesMap.get(referenceFile);

			if (table != null) {
				final Map<String, List<Attribute>> map = table.row(uriFragment);

				if (map != null) {

					if (map.size() > 0) {

						final Set<String> keySet = map.keySet();

						for (final String string : keySet) {

							final List<Attribute> list = map.get(string);

							return list;

						}
					}
				}

			}
		}
		return new ArrayList<Attribute>();
	}

}
