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
package org.eclipse.app4mc.amalthea.converters110.impl;

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
import org.eclipse.app4mc.amalthea.converters110.utils.HelperUtils_103_110;
import org.eclipse.app4mc.amalthea.converters110.utils.SchedulerCacheBuilder;
import org.eclipse.app4mc.amalthea.converters110.utils.SchedulerCacheEnum;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

import com.google.common.collect.Table;

public class SchedulerRefsConverter implements IConverter {

	private final HelperUtils_103_110 helper;

	private final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	public SchedulerRefsConverter() {
		this.helper = HelperUtils_103_110.getInstance();
	}

	public SchedulerRefsConverter(final HelperUtils_103_110 helper) {
		this.helper = helper;
	}

	@Override
	@SuppressWarnings("unchecked")
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger
				.info("Migration from itea.103 to itea.110 : Starting OS model (SchedulerRefs) converter for model file : "
						+ targetFile.getName());

		for (final ICache cache : this.getFilteredCaches(caches, SchedulerCacheBuilder.class)) {


			loop: for (final File file : fileName_documentsMap.keySet()) {


				final Map<String, Object> cacheMap = cache.getCacheMap().get(file);

				if (cacheMap == null) {
					continue loop;
				}

				final Map<String, Element> uriFragment_scheduler_map = (Map<String, Element>) cacheMap
						.get(SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_ELEMENT.name());


				final Map<String, List<Attribute>> uriFragment_attribs_map = (Map<String, List<Attribute>>) cacheMap
						.get(SchedulerCacheEnum.URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES.name());

				if (uriFragment_attribs_map == null || uriFragment_scheduler_map == null) {
					continue loop;
				}


				for (final String uriFragment : uriFragment_scheduler_map.keySet()) {

					final Element element = uriFragment_scheduler_map.get(uriFragment);

					// urifragments should be updated, as for certain elements parent is changed

					final String updated_uriFragment = this.helper.getURIFragment(element, ModelVersion._110);

					this.logger.info(uriFragment + " : : " + element + " : : " + updated_uriFragment);

					final List<Attribute> list = uriFragment_attribs_map.get(uriFragment);

					for (final Attribute attribute : list) {

						attribute.setValue(updated_uriFragment);
					}

				}


				/*- ============ updating hrefs   ============*/

				final Map<String, Element> href_uriFragment_scheduler_map = (Map<String, Element>) cacheMap
						.get(SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_ELEMENT.name());

				final Map<File, Table<String, String, List<Attribute>>> href_urifragment_attributesMap = (Map<File, Table<String, String, List<Attribute>>>) cacheMap
						.get(SchedulerCacheEnum.HREF_URIFRAGMENT_SCHEDULER_REFS_ATRIBUTES.name());


				for (final String href_uriFragment : href_uriFragment_scheduler_map.keySet()) {

					final Element schedulerElement = href_uriFragment_scheduler_map.get(href_uriFragment);

					final String updated_uriFragment = this.helper.getURIFragment(schedulerElement, ModelVersion._110);

					final List<Attribute> attributes = getAttributes(href_urifragment_attributesMap, href_uriFragment);

					for (final Attribute attribute : attributes) {

						final String[] split = href_uriFragment.split("#");

						/*- Setting updated URI fragment */

						attribute.setValue(split[0] + "#" + updated_uriFragment);

						/*- As Schduler has become an abstract class, it is important to also add the type to the parent element of href attribute */

						final Element schedulerRef = attribute.getParent();

						final Attribute schedulerType = schedulerRef.getAttribute("type",
								this.helper.getGenericNS("xmi"));

						if (schedulerType == null) {

							if (schedulerElement.getName().equals("taskSchedulers")) {
								schedulerRef.setAttribute("type", "os:TaskScheduler", this.helper.getGenericNS("xmi"));

							}
							else if (schedulerElement.getName().equals("interruptControllers")) {
								schedulerRef.setAttribute("type", "os:InterruptController",
										this.helper.getGenericNS("xmi"));
							}
						}


					}

				}


			}


		}

		/*- once the references are created newly, update the cache to establish mapping between old URIFragments and the new ones */

		for (final ICache cache : caches) {
			if (cache instanceof SchedulerCacheBuilder) {
				((SchedulerCacheBuilder) cache).updateURIFragments_in_Cache(fileName_documentsMap);
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
