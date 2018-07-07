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

public class ConstraintsConverter extends AbstractConverter {


	public ConstraintsConverter() {
		this.helper = HelperUtils_071_072.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.1 to 0.7.2 : Executing Constraints converter for model file : "
				+ targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_AffinityConstraints(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}

	private void update_AffinityConstraints(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./constraintsModel/affinityConstraints");


		final List<Element> affinityConstraintElements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element affinityConstraintElement : affinityConstraintElements) {

			final String type = affinityConstraintElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));

			if (type != null) {
				Element childElement = null;
				if (type.equals("am:RunnablePairingConstraint")) {

					childElement = affinityConstraintElement.getChild("runnables");
				}
				else if (type.equals("am:ProcessPairingConstraint")) {
					childElement = affinityConstraintElement.getChild("processes");

				}
				else if (type.equals("am:DataPairingConstraint")) {
					childElement = affinityConstraintElement.getChild("labels");

				}

				if (childElement != null) {
					childElement.setName("group");
				}

				// in 0.7.2, TargetProcess, TargetCallSequence elements are removed.
				final Element targetElement = affinityConstraintElement.getChild("target");

				if (targetElement != null) {

					final String targetType = targetElement.getAttributeValue("type", this.helper.getGenericNS("xsi"));

					if (targetType != null
							&& (targetType.equals("am:TargetCallSequence") || targetType.equals("am:TargetProcess"))) {

						affinityConstraintElement.removeContent(targetElement);

					}

				}

			}
		}
	}


}
