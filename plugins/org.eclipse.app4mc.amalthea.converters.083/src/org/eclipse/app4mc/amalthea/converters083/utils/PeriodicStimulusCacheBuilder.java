/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters083.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.jdom2.Document;
import org.jdom2.Element;

public class PeriodicStimulusCacheBuilder implements ICache {

	private final Map<File, Map<String, Object>> map = new HashMap<File, Map<String, Object>>();
	private final HelperUtils_082_083 helper;

	public PeriodicStimulusCacheBuilder() {
		this.helper = HelperUtils_082_083.getInstance();
	}

	public static final String cache_key="PeriodicStimulus_Containing_Clock";

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

			final List<String> periodicStimulusElementNames = new ArrayList<String>();

			getCacheMap().get(targetFile).put("PeriodicStimulus_Containing_Clock", periodicStimulusElementNames);

			 

			final StringBuffer xpathBuffer = new StringBuffer();

			xpathBuffer.append("./stimuliModel/stimuli[@xsi:type=\"am:PeriodicStimulus\"]");

			final List<Element> periodicStimulusElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
					Element.class, this.helper.getNS_083("am"), this.helper.getGenericNS("xsi"));

			for (final Element periodicStimusElement : periodicStimulusElements) { 
				if((periodicStimusElement.getChild("clock")!=null)  || (periodicStimusElement.getAttribute("clock")!=null))  {
					String attributeValue = periodicStimusElement.getAttributeValue("name");
					if(attributeValue!=null) {
						periodicStimulusElementNames.add(attributeValue);
					}
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
