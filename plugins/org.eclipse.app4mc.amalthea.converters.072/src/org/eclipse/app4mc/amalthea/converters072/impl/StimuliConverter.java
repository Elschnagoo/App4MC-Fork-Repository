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

package org.eclipse.app4mc.amalthea.converters072.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters072.utils.HelperUtils_071_072;
import org.jdom2.Document;
import org.jdom2.Element;

public class StimuliConverter extends AbstractConverter {


	public StimuliConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}


	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.7.1 to 0.7.2 : Executing Stimuli converter for model file : " + targetFile.getName());

		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		updateArrivalCurve(rootElement);
	}


	/**
	 * Bug 510088 : As per the model changes in 0.7.2 ==> "arrivalCurveEntries" is changed to "entries" inside the class
	 * ArrivalCurve
	 *
	 * @param rootElement
	 */
	private void updateArrivalCurve(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./stimuliModel/stimuli[@xsi:type=\"am:ArrivalCurve\"]/arrivalCurveEntries");

		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element element : elements) {
			// changing tag name from : arrivalCurveEntries to entries
			element.setName("entries");
		}

	}

}
