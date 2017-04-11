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
package org.eclipse.app4mc.amalthea.converters080.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.log4j.LogManager;
import org.eclipse.app4mc.amalthea.converters.common.base.ICache;
import org.eclipse.app4mc.amalthea.converters080.utils.HelperUtils_072_080;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;

/**
 * This class is responsible for converting the SW Model elements from 0.7.2 to 0.8.0 version format of AMALTHEA model
 *
 * @author mez2rng
 *
 */
public class SwConverter extends AbstractConverter {


	public SwConverter() {
		this.helper = HelperUtils_072_080.getInstance();
		this.logger = LogManager.getLogger(this.getClass());
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info("Migration from 0.7.2 to 0.8.0 : Starting SW converter");


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();

		update_mode_Label(rootElement);

		update_DataSize(rootElement);

		update_ProbabiltitySwitch(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * Below migration is for the metamodel change : ProbabiltitySwitch class changed to ProbabilitySwitch (typo fixed)
	 *
	 * @param rootElement
	 */
	private void update_ProbabiltitySwitch(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/tasks//*[@xsi:type=\"am:ProbabiltitySwitch\"]");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs//*[@xsi:type=\"am:ProbabilitySwitch\"]");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element probabilitySwitchElement : elements) {

			final Attribute attribute = probabilitySwitchElement.getAttribute("type", this.helper.getGenericNS("xsi"));

			if (attribute != null) {
				attribute.setValue("am:ProbabilitySwitch");

			}


		}


	}

	/**
	 * Below migration is for the metamodel change : Bug 513969 (Inconsistent unit names for data size)
	 *
	 * In DataSizeUnit enum following values are changed: kibit, byte to : Kibit, B
	 *
	 * @param rootElement
	 */
	private void update_DataSize(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./swModel/typeDefinitions[@xsi:type=\"am:BaseTypeDefinition\"]/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./hwModel/memoryTypes/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables/runnableItems//transmissionPolicy/chunkSize");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/runnables/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/labels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/modeLabels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/channels/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/customEntities/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/processPrototypes/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/isrs/size");
		xpathBuffer.append("|");
		xpathBuffer.append("./swModel/tasks/size");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element dataSizeElement : elements) {

			final Attribute attribute = dataSizeElement.getAttribute("unit");

			if (attribute != null) {
				final String value = attribute.getValue();
				if (value.equals("kibit")) {
					attribute.setValue("Kibit");
				}
				else if (value.equals("byte")) {
					attribute.setValue("B");
				}
			}


		}

	}

	/**
	 * Below migration is for the metamodel change : Bug 513976 (Simplify Modes Handling).
	 *
	 * Migration is required : As mode reference is not serialized in the model (as it is set as transient in the
	 * metamodel definition).
	 *
	 *
	 * @param rootElement
	 */
	private void update_mode_Label(final Element rootElement) {

		final StringBuffer labelXpathBuffer = new StringBuffer();

		labelXpathBuffer.append("./swModel/modeLabels");

		final List<Element> elements = this.helper.getXpathResult(rootElement, labelXpathBuffer.toString(),
				Element.class, this.helper.getGenericNS("xsi"));

		for (final Element modeLabel : elements) {

			final Attribute modeAttribute = modeLabel.getAttribute("mode");

			if (modeAttribute != null) {
				modeLabel.removeAttribute(modeAttribute);
			}
			else {

				final Element modeElement = modeLabel.getChild("mode");
				if (modeElement != null) {
					modeLabel.removeChild("mode");
				}
			}


		}
	}

}
