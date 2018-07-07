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

package org.eclipse.app4mc.amalthea.converters072.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Document;
import org.jdom2.Element;

public class HwElementsCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_071_072 helper;

	public HwElementsCacheBuilder() {
		this.helper = HelperUtils_071_072.getInstance();
	}


	@Override
	public void buildCache(final Map<File, Document> fileName_documentsMap) {

		for (final File targetFile : fileName_documentsMap.keySet()) {

			final Document document1 = fileName_documentsMap.get(targetFile);

			if (document1 == null) {
				// log error message
				continue;
			}

			final Element rootElement = document1.getRootElement();

			/*- Start : Cache initialization */

			getCacheMap().put(targetFile, new HashMap<String, Object>());

			final List<String> coreNames = new ArrayList<String>();

			getCacheMap().get(targetFile).put(HwElementsCacheEnum.CORE_NAMES.name(), coreNames);

			final List<String> coreTypeNames = new ArrayList<String>();

			getCacheMap().get(targetFile).put(HwElementsCacheEnum.CORE_TYPE_NAMES.name(), coreTypeNames);


			final List<String> memoryNames = new ArrayList<String>();

			getCacheMap().get(targetFile).put(HwElementsCacheEnum.MEMORY_NAMES.name(), memoryNames);

			final List<String> memoryTypeNames = new ArrayList<String>();

			getCacheMap().get(targetFile).put(HwElementsCacheEnum.MEMORY_TYPE_NAMES.name(), memoryTypeNames);

			getCacheMap().get(targetFile).put(HwElementsCacheEnum.HwModel.name(), null);

			/*- End : Cache initialization */

			final List<Element> hwModelElements = this.helper.getXpathResult(rootElement, "./hwModel", Element.class,
					this.helper.getNS_070("am"));

			if (hwModelElements.size() > 0) {
				getCacheMap().get(targetFile).put(HwElementsCacheEnum.HwModel.name(), hwModelElements.get(0));
			}

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append("./hwModel//memories");
			xpathBuffer.append("|");
			xpathBuffer.append("./hwModel//cores");
			xpathBuffer.append("|");
			xpathBuffer.append("./hwModel/coreTypes");
			xpathBuffer.append("|");
			xpathBuffer.append("./hwModel/memoryTypes");

			final List<Element> hwElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_070("am"));


			for (final Element hwElement : hwElements) {

				if (hwElement.getName().equals("memories")) {
					memoryNames.add(hwElement.getAttributeValue("name"));
				}
				else if (hwElement.getName().equals("cores")) {
					coreNames.add(hwElement.getAttributeValue("name"));
				}
				else if (hwElement.getName().equals("coreTypes")) {
					coreNames.add(hwElement.getAttributeValue("name"));
				}
				else if (hwElement.getName().equals("memoryTypes")) {
					coreNames.add(hwElement.getAttributeValue("name"));
				}

			}
		}

	}


	@Override
	public Map<File, Map<String, Object>> getCacheMap() {
		return this.map;
	}

	@Override
	public void clearCacheMap() {

		this.map.clear();
	}


}
