/**
 ********************************************************************************
 * Copyright (c) 2019 Robert Bosch GmbH and others.
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

package org.eclipse.app4mc.amalthea.converters094.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters094.utils.HelperUtils_093_094;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class HwConverter extends AbstractConverter {

	public HwConverter() {
		this.helper = HelperUtils_093_094.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File file, final Map<File, Document> map, final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.3 to 0.9.4 : Executing Hw converter for model file : " + file.getName());

		basicConvert(file, map, caches);
	}

	public void basicConvert(final File file, final Map<File, Document> map, final List<ICache> caches) {
		
		final Document document = map.get(file);
		if (document == null) {
			return;
		}
		
		final Element rootElement = document.getRootElement();
		
		update_portInterface(rootElement);
	}

	private void update_portInterface(final Element rootElement) {
		final String xpath = "./hwModel/structures//ports[@portInterface=\"ABH\"]";
		
		final List<Element> portInterfaceElements = this.helper.getXpathResult(rootElement, xpath,
				Element.class, this.helper.getNS_094("am"), this.helper.getGenericNS("xsi"));
		
		for (Element portInterfaceElement : portInterfaceElements) {
			
			Attribute portInterfaceAttribute = portInterfaceElement.getAttribute("portInterface");
			portInterfaceAttribute.setValue("AHB");
		}
	}

}
