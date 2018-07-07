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

package org.eclipse.app4mc.amalthea.converters082.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.common.utils.NameSpace_082;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.Namespace;

public class HelperUtils_081_082 extends AbstractHelper {

	private HelperUtils_081_082() {

	}

	private static HelperUtils_081_082 instance;

	public static HelperUtils_081_082 getInstance() {

		if (instance == null) {
			instance = new HelperUtils_081_082();
		}

		return instance;
	}

	public Element createAmaltheaElement_082() {

		final Element amaltheaElement = new Element("Amalthea");
		amaltheaElement.setNamespace(Namespace.getNamespace("am", NameSpace_082.am.getNSValue()));

		amaltheaElement
				.addNamespaceDeclaration(Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance"));

		amaltheaElement.addNamespaceDeclaration(Namespace.getNamespace("xmi", "http://www.omg.org/XMI"));


		final Attribute attrib = new Attribute("version", "2.0");

		attrib.setNamespace(Namespace.getNamespace("xmi", "http://www.omg.org/XMI"));

		amaltheaElement.setAttribute(attrib);

		return amaltheaElement;

	}


	/**
	 * This method is used to update the namespace references to 080
	 *
	 * @param rootElement
	 */

	public void updateRootElement_NameSpaces_to_082(final Element rootElement) {

		final Namespace defaultNamespace = rootElement.getNamespace();


		if (isNS_AvailableIn_081(defaultNamespace)) {

			// final String rootElementName = rootElement.getName();

			rootElement.setNamespace(null);

			rootElement.removeNamespaceDeclaration(defaultNamespace);

			rootElement.setNamespace(getNS_082("am"));

			// updating additional namespaces to the ones from 0.8.2

			final List<Namespace> additionalNamespaces = new ArrayList<Namespace>();

			additionalNamespaces.addAll(rootElement.getAdditionalNamespaces());

			for (int i = 0; i < additionalNamespaces.size(); i++) {

				final Namespace ns = additionalNamespaces.get(i);

				if (isNS_AvailableIn_081(ns)) {

					rootElement.removeNamespaceDeclaration(ns);

				}

			}

			rootElement.addNamespaceDeclaration(getGenericNS("xmi"));

			rootElement.addNamespaceDeclaration(getGenericNS("xsi"));

		}
	}


}
