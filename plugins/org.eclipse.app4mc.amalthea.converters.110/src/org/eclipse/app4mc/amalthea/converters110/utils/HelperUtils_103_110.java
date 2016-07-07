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
package org.eclipse.app4mc.amalthea.converters110.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.common.utils.NameSpace_110;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.Namespace;

public class HelperUtils_103_110 extends AbstractHelper {

	private HelperUtils_103_110() {

	}

	private static HelperUtils_103_110 instance;

	public static HelperUtils_103_110 getInstance() {

		if (instance == null) {
			instance = new HelperUtils_103_110();
		}

		return instance;
	}

	public Element createAmaltheaElement_110() {

		final Element amaltheaElement = new Element("AMALTHEA");
		amaltheaElement.setNamespace(Namespace.getNamespace("central", NameSpace_110.central.getNSValue()));

		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("common", NameSpace_110.common.getNSValue()));
		amaltheaElement
				.addNamespaceDeclaration(Namespace.getNamespace("components", NameSpace_110.components.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("config", NameSpace_110.config.getNSValue()));
		amaltheaElement
				.addNamespaceDeclaration(Namespace.getNamespace("constraints", NameSpace_110.constraints.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("events", NameSpace_110.events.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("hw", NameSpace_110.hw.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("mapping", NameSpace_110.mapping.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("os", NameSpace_110.os.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(
				Namespace.getNamespace("propertyconstraints", NameSpace_110.propertyconstraints.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("stimuli", NameSpace_110.stimuli.getNSValue()));
		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("sw", NameSpace_110.sw.getNSValue()));

		amaltheaElement
				.addNamespaceDeclaration(Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance"));

		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("xmi", "http://www.omg.org/XMI"));


		final Attribute attrib = new Attribute("version", "2.0");

		attrib.setNamespace(Namespace.getNamespace("xmi", "http://www.omg.org/XMI"));

		amaltheaElement.setAttribute(attrib);

		return amaltheaElement;

	}


	/**
	 * This method is used to update the namespace references to 110
	 *
	 * @param rootElement
	 */

	public void updateNameSpaces_to_110(final Element rootElement) {

		final Namespace defaultNamespace = rootElement.getNamespace();


		if (isNS_AvailableIn_103(defaultNamespace)) {

			// if still 1.0.3 uri is used, then transform all URI's

			rootElement.setNamespace(null);

			rootElement.removeNamespaceDeclaration(defaultNamespace);

			rootElement.setNamespace(getNS_110(defaultNamespace.getPrefix()));

			// updating additional namespaces to the ones from 110

			final List<Namespace> additionalNamespaces = new ArrayList<Namespace>();

			additionalNamespaces.addAll(rootElement.getAdditionalNamespaces());

			for (int i = 0; i < additionalNamespaces.size(); i++) {

				final Namespace ns = additionalNamespaces.get(i);

				if (isNS_AvailableIn_103(ns)) {

					rootElement.removeNamespaceDeclaration(ns);

					final Namespace ns_110 = getNS_110(ns.getPrefix());

					rootElement.addNamespaceDeclaration(ns_110);

				}


			}

			rootElement.addNamespaceDeclaration(getGenericNS("xmi"));

			rootElement.addNamespaceDeclaration(getGenericNS("xsi"));

		}
	}


}
