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

package org.eclipse.app4mc.amalthea.converters080.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters080.utils.HelperUtils_072_080;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 * This class is responsible for converting the PropertyConstraints Model elements from 0.7.2 to 0.8.0 version format of
 * AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class PropertyConstraintsConverter extends AbstractConverter {


	public PropertyConstraintsConverter() {
		this.helper = HelperUtils_072_080.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.7.2 to 0.8.0 : Executing Mapping converter for model file : " + targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		remove_HWConstraint_Element(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * Below migration is for the metamodel change w.r.t. PropertyConstraints model (For further details, check : Bug
	 * 514779 )
	 *
	 * HwCoreConstraint and HwMemoryConstraint classes are removed and there is no direct equivalent of these classes as
	 * per 0.8.0.
	 *
	 * -- Based on this change the data associated to HwCoreConstraint and HwMemoryConstraint is removed from the model
	 * (as a reference to the users, removed data is stored as a custom property)
	 *
	 * @param rootElement
	 */
	private void remove_HWConstraint_Element(final Element rootElement) {

		final XMLOutputter xmlOutputter = new XMLOutputter();

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./propertyConstraintsModel/allocationConstraints/hwConstraint");
		xpathBuffer.append("|");
		xpathBuffer.append("./propertyConstraintsModel/mappingConstraints/hwConstraint");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element hwConstraintElement : elements) {

			final String xmlString = xmlOutputter.outputString(hwConstraintElement);

			// TODO: this information shall be logged in model migration log file
			// System.out.println(xmlString);

			final Element parentElement = hwConstraintElement.getParentElement();

			final Element customPropertyElement = new Element("customProperties");
			customPropertyElement.setAttribute("key",
					"hwConstraint (element removed during Migration of Model to 0.8.0 version)");

			final Element valueElement = new Element("value");
			valueElement.setAttribute("type", "am:StringObject", this.helper.getGenericNS("xsi"));
			valueElement.setAttribute("value", xmlString);

			customPropertyElement.addContent(valueElement);

			parentElement.addContent(customPropertyElement);

			this.logger.warn("hwConstraint tag is removed from " + parentElement.getName()
					+ " . Below is the content of hwConstraint object: \n" + xmlString);

			/*- removing HWConstraint model element -> as there is no equivalent of it in AMALTHEA 0.8.0 version */
			parentElement.removeContent(hwConstraintElement);


		}

	}


}
