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
package org.eclipse.app4mc.amalthea.converters070.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters070.utils.HelperUtils_111_070;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

public class ComponentsConverter implements IConverter {

	private final HelperUtils_111_070 helper;
	private final Logger logger;

	public ComponentsConverter() {
		this.helper = HelperUtils_111_070.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {


		this.logger.info("Migration from itea.111 to 0.7.0 : Starting Components converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_FInterfacePort(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void update_FInterfacePort(final Element rootElement) {
		/*--
		 * Migraiton step to App4MC 0.7.0 from itea.1.1.1: interface variable inside FInterfacePort is removed
		 */

		final List<Element> francaInterfacePorts = this.helper.getXpathResult(rootElement,
				".//components/ports[(@xsi:type=\"components:FInterfacePort\")]|/components:ComponentsModel/components/ports[(@xsi:type=\"components:FInterfacePort\")]",
				Element.class, this.helper.getNS_111("components"), this.helper.getGenericNS("xsi"));


		for (final Element port : francaInterfacePorts) {

			/*- changing the value of Enum : InterfaceKind */

			final Attribute attribute = port.getAttribute("kind");

			if (attribute != null) {
				if (attribute.getValue().equals("PROVIDES")) {
					attribute.setValue("provides");
				}
				else if (attribute.getValue().equals("REQUIRES")) {
					attribute.setValue("requires");
				}
			}

			/*- Removing the reference of Franca Interface */
			final Element francaInterfaceRef = port.getChild("interface");

			if (francaInterfaceRef != null) {

				/*- URI Fragment referring to Franca model element */
				final String fInterfaceRefString = francaInterfaceRef.getAttributeValue("href");


				final Element customPropertyElement = new Element("customProperties");

				customPropertyElement.setAttribute("id", "" + EcoreUtil.generateUUID(),
						this.helper.getGenericNS("xmi"));

				customPropertyElement.setAttribute("key", "Franca interface");

				final Element value_customPropertyElement = new Element("value");

				value_customPropertyElement.setAttribute("type", "common:StringObject",
						this.helper.getGenericNS("xsi"));

				value_customPropertyElement.setAttribute("id", "" + EcoreUtil.generateUUID(),
						this.helper.getGenericNS("xmi"));

				value_customPropertyElement.setAttribute("value", fInterfaceRefString);

				/*- adding value element to the custom property*/
				customPropertyElement.addContent(value_customPropertyElement);

				/*- adding CustomProperty to the Port element*/
				port.addContent(customPropertyElement);

				/*-Removing the reference to the Franca element */
				francaInterfaceRef.detach();
			}
		}
	}
}
