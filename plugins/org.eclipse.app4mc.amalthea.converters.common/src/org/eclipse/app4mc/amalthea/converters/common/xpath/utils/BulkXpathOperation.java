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
package org.eclipse.app4mc.amalthea.converters.common.xpath.utils;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Document;
import org.jdom2.Element;

public class BulkXpathOperation {

	private final Logger logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");

	/**
	 * This method takes Xml Document object and the list of Xpath Strings as input-> and returns a Map with key as
	 * Xpath and Value as the List<Element> JDOM elements
	 *
	 * @param document
	 * @param xpaths
	 * @param helper
	 * @return Map - containing Key as Xpath and Value as the List of JDOM Element's
	 */
	public Map<String, List<Element>> invokeXpath(final Document document, final Collection<String> xpaths,
			final AbstractHelper helper) {

		final Map<String, List<Element>> resultsMap = new HashMap<String, List<Element>>();

		try {

			// building optimized map

			final Map<String, XpathFragment> fragmentsMap = new HashMap<String, XpathFragment>();


			for (final String xpath : xpaths) {

				/*-example Xpath : //osModel/scheduler[3] */

				/*- this buffer is used to populate characters of xpath fragment string till the first occurance of "/" */

				final StringBuffer fragmentStringBuffer = new StringBuffer();

				final char[] charArray = xpath.toCharArray();

				final int length = charArray.length;

				XpathFragment parentFragmentObject = null;

				for (int i = 0; i < length; i++) {

					final char _char = charArray[i];

					/*- on occurance of "/" char, then the next character is also checked if it is "/" */

					if (_char == '/') {

						if ((i + 1) < length) {

							final char _char_next = charArray[i + 1];

							if (_char_next == '/') {

								fragmentStringBuffer.append(_char);

								fragmentStringBuffer.append(_char_next);

								i++;
							}
							/*- on occurance of "/" char, then the next character is also checked if it is "/"
							 *  Below is the case where next char is not "/"
							 * */
							else {

								/*- containing only parts of the fragment */
								final String fragmentString = fragmentStringBuffer.toString();

								/*- example :
								 *
								 * - First iteration :  //osModel
								 * - Second iteration :
								 * */

								if (fragmentString.length() > 0) {

									/*- this the content of Xpath string from the begining till the current character (i.e. index of i)*/
									final String xpathSubContent_from_begining_till_current_index = xpath.substring(0,
											i);

									if (fragmentsMap.containsKey(xpathSubContent_from_begining_till_current_index)) {

										parentFragmentObject = fragmentsMap
												.get(xpathSubContent_from_begining_till_current_index);

									}
									else {
										final XpathFragment fragmentObject = new XpathFragment();
										fragmentObject.setValue(fragmentString);
										fragmentObject.setParent(parentFragmentObject);
										/*-updating map*/
										fragmentsMap.put(xpathSubContent_from_begining_till_current_index,
												fragmentObject);
										/*- marking the current fragment as parent fragment for the next iteration */
										parentFragmentObject = fragmentObject;
									}

								}

								fragmentStringBuffer.setLength(0);

								fragmentStringBuffer.append("./");
							}
						}
					}
					else {

						fragmentStringBuffer.append(_char);
					}
				}

				/*- setting last fragment value, as it will not set in the previous loop */
				final String fragmentString = fragmentStringBuffer.toString();

				if (fragmentString.length() > 0) {

					final XpathFragment fragment = new XpathFragment();
					fragment.setValue(fragmentString);
					fragment.setParent(parentFragmentObject);
					/*-updating map*/
					fragmentsMap.put(xpath, fragment);
				}


			}

			/*- Printing the contents of FragmentsMap */

			final Set<String> keySet = fragmentsMap.keySet();

			for (final String string : keySet) {

				this.logger.info("Xpath Fragment : " + string + "associated Xpath chunk :  "
						+ fragmentsMap.get(string).getValue());

			}


			/*- execute Xpath evaluation */

			final Element rootElement = document.getRootElement();

			for (final String xpath : xpaths) {

				if (!resultsMap.containsKey(xpath)) {


					final XpathFragment xpathFragment = fragmentsMap.get(xpath);

					if (xpathFragment != null) {

						xpathFragment.visit(rootElement, helper);

						final List<Element> xmlElements = xpathFragment.getXmlElements();

						resultsMap.put(xpath, xmlElements);

						this.logger.info("xpath : " + xpath + " elements : " + xmlElements.size());
					}
				}
			}
		}
		catch (final Exception e) {
			this.logger.error(e.getMessage(), e);
			throw e;
		}
		return resultsMap;


	}
}
