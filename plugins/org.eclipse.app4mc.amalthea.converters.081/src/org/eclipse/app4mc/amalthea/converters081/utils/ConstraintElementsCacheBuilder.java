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
package org.eclipse.app4mc.amalthea.converters081.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Document;
import org.jdom2.Element;

public class ConstraintElementsCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_080_081 helper;

	public ConstraintElementsCacheBuilder() {
		this.helper = HelperUtils_080_081.getInstance();
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

			final List<String> rootEventChainNames = new ArrayList<String>();

			getCacheMap().get(targetFile).put(ConstraintElementsCacheEnum.ROOT_EVENTCHAIN_NAMES.name(),
					rootEventChainNames);

			/*- End : Cache initialization */

			final List<Element> rootEventChainElements = this.helper.getXpathResult(rootElement,
					"./constraintsModel/eventChains", Element.class, this.helper.getNS_070("am"));


			/*- ================START: Collecting root level eventchain elements ======================== */

			for (final Element element : rootEventChainElements) {

				final String eventChain_name = element.getAttributeValue("name");

				if (eventChain_name != null) {
					rootEventChainNames.add(eventChain_name);
				}
			}

			/*- ================END: Collecting root level eventchain elements ======================== */

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
