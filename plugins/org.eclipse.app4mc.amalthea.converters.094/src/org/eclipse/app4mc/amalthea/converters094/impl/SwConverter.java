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
import org.jdom2.Document;
import org.jdom2.Element;

public class SwConverter extends AbstractConverter {


	private File targetFile;


	public SwConverter() {
		this.helper = HelperUtils_093_094.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.9.3 to 0.9.4 : Executing Sw converter for model file : " + targetFile.getName());

		this.caches = caches;

		this.fileName_documentsMap = fileName_documentsMap;

		this.targetFile = targetFile;

		final Document root = fileName_documentsMap.get(this.targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();
		// TODO: remove the below function call
		update_activations(rootElement);

	}

	private void update_activations(final Element rootElement) {
		/*--
		final StringBuffer xpathBuffer = new StringBuffer();
		xpathBuffer.append("./swModel/activations");
		
		final List<Element> activationElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getNS_093("am"), this.helper.getGenericNS("xsi"));
		
		for (final Element activationElement : activationElements) {
			final String activationType = activationElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));
		
			if (activationType != null) {
		
				if (activationType.equals("am:VariableRateActivation")) {
		
					final Element occurrencesPerStep_double_deviationElement = activationElement
							.getChild("occurrencesPerStep");
		
					if (occurrencesPerStep_double_deviationElement != null) {
		
						final Element migratedElement = migrateDeviationElement_Containing_DoubleValue(
								occurrencesPerStep_double_deviationElement, "occurrencesPerStep");
		
						final int indexOf = activationElement.indexOf(occurrencesPerStep_double_deviationElement);
		
						activationElement.removeContent(occurrencesPerStep_double_deviationElement);
		
						if (migratedElement != null) {
							// adding migrated element to the activation element
							activationElement.addContent(indexOf, migratedElement);
		
						}
					}
		
		
				}
		
			}
		}
		
		*/}


}
