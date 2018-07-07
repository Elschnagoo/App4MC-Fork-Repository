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

package org.eclipse.app4mc.amalthea.converters111.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Element;
import org.jdom2.Namespace;

public class HelperUtils_110_111 extends AbstractHelper {

	private HelperUtils_110_111() {

	}

	private static HelperUtils_110_111 instance;

	public static HelperUtils_110_111 getInstance() {

		if (instance == null) {
			instance = new HelperUtils_110_111();
		}

		return instance;
	}


	/**
	 * This method is used to update the namespace references to 110
	 *
	 * @param rootElement
	 */

	public void updateNameSpaces_to_111(final Element rootElement) {

		final Namespace defaultNamespace = rootElement.getNamespace();


		if (isNS_AvailableIn_110(defaultNamespace)) {

			// if still 1.0.3 uri is used, then transform all URI's

			rootElement.setNamespace(null);

			rootElement.removeNamespaceDeclaration(defaultNamespace);

			rootElement.setNamespace(getNS_111(defaultNamespace.getPrefix()));

			// updating additional namespaces to the ones from 110

			final List<Namespace> additionalNamespaces = new ArrayList<Namespace>();

			additionalNamespaces.addAll(rootElement.getAdditionalNamespaces());

			for (int i = 0; i < additionalNamespaces.size(); i++) {

				final Namespace ns = additionalNamespaces.get(i);

				if (isNS_AvailableIn_110(ns)) {

					rootElement.removeNamespaceDeclaration(ns);

					final Namespace ns_111 = getNS_111(ns.getPrefix());

					rootElement.addNamespaceDeclaration(ns_111);

				}


			}

			rootElement.addNamespaceDeclaration(getGenericNS("xmi"));

			rootElement.addNamespaceDeclaration(getGenericNS("xsi"));

		}
	}

}
