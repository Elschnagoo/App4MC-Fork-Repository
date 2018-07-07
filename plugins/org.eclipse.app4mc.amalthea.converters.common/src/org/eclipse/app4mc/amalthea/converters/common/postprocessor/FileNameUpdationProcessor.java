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

package org.eclipse.app4mc.amalthea.converters.common.postprocessor;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.eclipse.app4mc.amalthea.converters.common.base.IPostProcessor;
import org.eclipse.app4mc.amalthea.converters.common.utils.AbstractHelper;
import org.jdom2.Attribute;
import org.jdom2.Document;

public class FileNameUpdationProcessor implements IPostProcessor {

	public FileNameUpdationProcessor() {
	}

	@Override
	public void process(final Map<File, Document> fileName_documentsMap, final AbstractHelper helper) throws Exception {

		/*-
		 * 1.File name should be updated
		 *
		 * 2.File location should be updated
		 *
		 */

		for (final File inputFile : fileName_documentsMap.keySet()) {
			final List<Attribute> hrefs = helper.getXpathResult(fileName_documentsMap.get(inputFile).getRootElement(),
					".//@href", Attribute.class);

			for (final Attribute attribute : hrefs) {

				/*- example:  href="f1/f2/sw.amxmi#_gK_hoMW5EeWBM6uFowTedA" */

				final String attributeValue = attribute.getValue();

				final int indexOfHash = attributeValue.lastIndexOf("#");

				if (indexOfHash != -1 && (indexOfHash + 1) < attributeValue.length()) {

					/*- example:  f1/f2/sw.amxmi */

					final String refRelativePath = attributeValue.substring(0, indexOfHash);

					final int lastIndex = refRelativePath.lastIndexOf("/");

					String refFileName = "";

					if (lastIndex == -1) {
						/*-Example: sw.amxmi  i.e. there is no hierarchy to reach to the file from the selected file*/
						refFileName = refRelativePath;
					}
					else if ((lastIndex != -1) && (lastIndex + 1) < refRelativePath.length()) {
						/*- example: sw.amxmi */

						refFileName = refRelativePath.substring(lastIndex + 1);

					}

					if (refFileName.length() > 0) {
						/*-check for the  file extension  */
						final int indexOfDot = refFileName.indexOf(".");

						if (indexOfDot != -1) {
							final String extension = refFileName.substring(indexOfDot + 1);

							if (extension.startsWith("amxmi") && !extension.equals("amxmi")) {

								/*- this is the case where extension of the model (e.g: amxmi-hw) is present instead of amxmi*/

								/*- adding amxmi extension, to make the model file compatible to 1.1.1 or higher */

								refFileName = refFileName + ".amxmi";


							}
						}

						/*- example:  href="f1/f2/sw.amxmi#_gK_hoMW5EeWBM6uFowTedA"
						 *
						 * In this case attributeValue_part2 is the second part of the above String i.e _gK_hoMW5EeWBM6uFowTedA
						 * */
						final String attributeValue_part2 = attributeValue.substring(indexOfHash + 1);

						/*- setting the updated file name (and also making the references relative, as files will be moved inside same directory*/

						attribute.setValue(refFileName + "#" + attributeValue_part2);


					}


				}
			}


		}


	}

}
