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

package org.eclipse.app4mc.amalthea.converters070.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.eclipse.app4mc.amalthea.converters.common.utils.NameSpace_070;
import org.jdom2.Attribute;
import org.jdom2.Element;
import org.jdom2.Namespace;

public class HelperUtils_111_070 extends AbstractHelper {

	private HelperUtils_111_070() {

	}

	private static HelperUtils_111_070 instance;

	public static HelperUtils_111_070 getInstance() {

		if (instance == null) {
			instance = new HelperUtils_111_070();
		}

		return instance;
	}

	public Element createAmaltheaElement_070() {

		final Element amaltheaElement = new Element("AMALTHEA");
		amaltheaElement.setNamespace(Namespace.getNamespace("central", NameSpace_070.am.getNSValue()));

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

	public void updateRootElement_NameSpaces_to_070(final Element rootElement) {

		final Namespace defaultNamespace = rootElement.getNamespace();


		if (isNS_AvailableIn_111(defaultNamespace)) {

			final String rootElementName = rootElement.getName();

			/*- As the root element AMALTHEA name is changed to Amalthea"*/

			if (rootElementName != null && rootElementName.equals("AMALTHEA")) {
				rootElement.setName("Amalthea");
			}


			// if still 1.1.1 uri is used, then transform all URI's

			rootElement.setNamespace(null);

			rootElement.removeNamespaceDeclaration(defaultNamespace);

			rootElement.setNamespace(getNS_070("am"));

			// updating additional namespaces to the ones from 0.7.0

			final List<Namespace> additionalNamespaces = new ArrayList<Namespace>();

			additionalNamespaces.addAll(rootElement.getAdditionalNamespaces());

			for (int i = 0; i < additionalNamespaces.size(); i++) {

				final Namespace ns = additionalNamespaces.get(i);

				if (isNS_AvailableIn_111(ns)) {

					rootElement.removeNamespaceDeclaration(ns);

				}

			}

			rootElement.addNamespaceDeclaration(getGenericNS("xmi"));

			rootElement.addNamespaceDeclaration(getGenericNS("xsi"));

		}
	}

	/**
	 * This method is used to update the new Type in: <br>
	 * - references of format 1.1.1 and higher<br>
	 *
	 * @param inputString
	 * @param newTypeWithPrefix
	 * @return
	 */
	public String updateReferenceWithType(final String inputString,
			final String newTypeWithPrefix/* , final boolean isReference */) {

		// if (isReference) {

		/*- Example: inputString:
		 *
		 *  activation="periodic_activation?type=sw.Periodic"
		 *
		 *  newType:
		 *
		 *  am:PeriodicActivation
		 *  */

		if (inputString != null && inputString.contains("?type=")) {

			/*- periodic_activation?type=.*/
			final int lastIndexOf = inputString.lastIndexOf("=");

			if (lastIndexOf != -1) {
				/*- periodic_activation?type=model.PeriodicActivation*/
				return inputString.substring(0, lastIndexOf + 1) + newTypeWithPrefix;
			}

		}

		// }
		// else {
		// /*- This is scenario of xsi:type value updation */
		//
		// /*-
		// * Example: inputString
		// *
		// * xsi:type="sw:Periodic"
		// *
		// * newType:
		// *
		// * am:PeriodicActivation
		// */
		//
		// /* sw:Periodic */
		// if (inputString != null && inputString.contains(":")) {
		//
		// /* sw: */
		// final int lastIndexOf = inputString.lastIndexOf(":");
		//
		// if (lastIndexOf != -1) {
		// /*- sw:PeriodicActivation
		// * */
		// return inputString.substring(0, lastIndexOf + 1) + newTypeWithPrefix;
		// }
		//
		// }
		// }


		return inputString;
	}

}
