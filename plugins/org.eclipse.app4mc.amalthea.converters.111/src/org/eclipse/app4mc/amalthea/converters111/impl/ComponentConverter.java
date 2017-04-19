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
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters.common.base.IConverter;
import org.eclipse.app4mc.amalthea.converters111.utils.HelperUtils_110_111;
import org.jdom2.Document;
import org.jdom2.Element;

public class ComponentConverter implements IConverter {

	private final HelperUtils_110_111 helper;
	private final Logger logger;

	public ComponentConverter() {
		this.helper = HelperUtils_110_111.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from itea.110 to itea.111 : Executing Component converter for model file : "
				+ targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		this.helper.updateNameSpaces_to_111(rootElement);

		this.helper.addAdditionalNameSpace(rootElement, this.helper.getNS_111("components"));

		updateEnum_InterfaceKind(rootElement);

		update_ComponentModel(rootElement);

		update_ISystem(rootElement);

		/*- once the references are created newly, update the cache to establish mapping between old URIFragments and the new ones */

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);


	}

	private void update_ISystem(final Element rootElement) {

		/*-
		 *
		 * Change:
		 * In 1.1.0:  ISystem consisted of  "ISystemElement[] elements" variable.
		 *
		 * But in 1.1.1, ISystem interface is having below variable arrays
		 *
		 * contains ComponentInstance[] componentInstances
		 * contains Connector[] connectors
		 */

		final List<Element> componentInstances = this.helper.getXpathResult(rootElement,
				".//elements[(@xsi:type=\"components:ComponentInstance\")]", Element.class,
				this.helper.getNS_111("components"), this.helper.getGenericNS("xsi"));

		for (final Element element : componentInstances) {

			element.setName("componentInstances");

			element.removeAttribute("type", this.helper.getGenericNS("xsi"));
		}


		final List<Element> connectors = this.helper.getXpathResult(rootElement,
				".//elements[(@xsi:type=\"components:Connector\")]", Element.class, this.helper.getNS_111("components"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : connectors) {

			element.setName("connectors");

			element.removeAttribute("type", this.helper.getGenericNS("xsi"));
		}


	}

	private void update_ComponentModel(final Element rootElement) {

		/*-
		 *
		 * Change:
		 * In 1.1.0:  ComponentModel consisted of  IComponentsModelElement[] elements variable.
		 *
		 * But in 1.1.1, IComponentsModelElement interface is removed and the corresponding elements are specified directly as variable arrays
		 *
		 * contains Component[] components
		 * contains System[] systems
		 */

		final List<Element> components = this.helper.getXpathResult(rootElement,
				".//elements[(@xsi:type=\"components:Component\")]", Element.class, this.helper.getNS_111("components"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : components) {

			element.setName("components");

			element.removeAttribute("type", this.helper.getGenericNS("xsi"));
		}


		final List<Element> composites = this.helper.getXpathResult(rootElement,
				".//elements[(@xsi:type=\"components:Composite\")]", Element.class, this.helper.getNS_111("components"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : composites) {

			element.setName("components");

		}


		final List<Element> systems = this.helper.getXpathResult(rootElement,
				".//elements[(@xsi:type=\"components:System\")]", Element.class, this.helper.getNS_111("components"),
				this.helper.getGenericNS("xsi"));

		for (final Element element : systems) {

			element.setName("systems");

			element.removeAttribute("type", this.helper.getGenericNS("xsi"));
		}

	}

	private void updateEnum_InterfaceKind(final Element rootElement) {

		/*- InterfaceKind enum is contained inside FInterfacePort. FInterfacePort is contained inside Component,Composite class, using variable name as ports*/

		/*--
		 * Migraiton step to 111 from 110: Grep the references of "ports" of xsi:type components:FInterfacePort -> which do not have "kind" attribute
		 */

		final List<Element> ports = this.helper.getXpathResult(rootElement,
				".//ports[(@xsi:type=\"components:FInterfacePort\") and not(@kind)]", Element.class,
				this.helper.getNS_111("components"), this.helper.getGenericNS("xsi"));


		for (final Element port : ports) {

			port.setAttribute("kind", "PROVIDES");
		}

	}


}
