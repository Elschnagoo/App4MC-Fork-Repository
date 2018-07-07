/**
 ********************************************************************************
 * Copyright (c) 2017-2018 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters072.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.jdom2.Document;
import org.jdom2.Element;

public class ConfigConverter extends AbstractConverter {


	public ConfigConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}


	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.1 to 0.7.2 : Executing \"Config Model\" converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateEventConfig(rootElement);
	}


	/**
	 * Bug 510086 : As per the model changes in 0.7.2 ==>
	 *
	 * EventConfigLink and EventConfigElement are removed <br>
	 * ==> Instead (in 0.7.2) EntityEvent is referred inside EventConfig object.
	 *
	 * @param rootElement
	 */
	private void updateEventConfig(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./configModel/eventsToTrace");

		final List<Element> eventsToTracelements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		if (eventsToTracelements.size() > 0) {

			Element eventModel = rootElement.getChild("eventModel");

			// check if "eventModel" tag is already existing. If not then create a Element
			if (eventModel == null) {
				eventModel = new Element("eventModel");
				rootElement.addContent(eventModel);
			}

			for (final Element eventsToTracelement : eventsToTracelements) {

				final String tagType = eventsToTracelement.getAttributeValue("type", this.helper.getGenericNS("xsi"));

				eventsToTracelement.removeAttribute("type", this.helper.getGenericNS("xsi"));

				if (tagType.equals("am:EventConfigElement")) {

					final Element eventElement = eventsToTracelement.getChild("event");
					if (eventElement != null) {

						// changing the event tag name to events

						eventElement.setName("events");

						// Removing Event element from EventConfigElement
						eventsToTracelement.removeContent(eventElement);

						// Shifting Event element (from config model) to EventModel
						eventModel.addContent(eventElement);

						// removing the EventConfigElement defintion as it no longer has any valid data

						eventsToTracelement.getParent().removeContent(eventsToTracelement);
					}

				}


			}
		}


	}

}
