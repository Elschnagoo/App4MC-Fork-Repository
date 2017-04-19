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
 * This class is responsible for converting the Stimuli Model elements from 0.7.2 to 0.8.0 version format of AMALTHEA
 * model
 *
 * @author mez2rng
 *
 */
public class StimuliConverter extends AbstractConverter {


	public StimuliConverter() {
		this.helper = HelperUtils_072_080.getInstance();
		this.logger = LogManager.getLogger("org.eclipse.app4mc.amalthea.modelmigration");
	}

	@Override
	public void convert(final File targetFile, final Map<File, Document> fileName_documentsMap,
			final List<ICache> caches) throws Exception {

		this.logger.info(
				"Migration from 0.7.2 to 0.8.0 : Executing Stimuli converter for model file : " + targetFile.getName());


		final Document root = fileName_documentsMap.get(targetFile);

		if (root == null) {
			return;
		}
		final Element rootElement = root.getRootElement();


		update_SignedTime(rootElement);

		update_SignedTimeObject(rootElement);

		fileName_documentsMap.put(targetFile.getCanonicalFile(), root);
	}


	/**
	 * Below migration is for the metamodel change : SignedTimeObject class is removed -> instead of it TimeObject class
	 * is used
	 *
	 * For details w.r.t. metamodel change, see : Bug 514334
	 *
	 * @param rootElement
	 */
	private void update_SignedTimeObject(final Element rootElement) {


		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append(".//customProperties//@xsi:type[.=\"am:SignedTimeObject\"]");


		final List<Attribute> types = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Attribute.class,
				this.helper.getGenericNS("xsi"));


		for (final Attribute signedTimeObjectAttribute : types) {
			signedTimeObjectAttribute.setValue("am:TimeObject");
		}


	}

	/**
	 * Below migration is for the metamodel change : SignedTime class is removed -> instead of it Time class is used
	 *
	 * For details w.r.t. metamodel change, see : Bug 514334
	 *
	 * @param rootElement
	 */
	private void update_SignedTime(final Element rootElement) {

		final StringBuffer xpathBuffer = new StringBuffer();

		xpathBuffer.append("./stimuliModel/stimuli/stimulusDeviation//*[@xsi:type=\"am:SignedTime\"]");


		final List<Element> elements = this.helper.getXpathResult(rootElement, xpathBuffer.toString(), Element.class,
				this.helper.getGenericNS("xsi"));

		for (final Element signedTimeElement : elements) {

			final Attribute attribute = signedTimeElement.getAttribute("type", this.helper.getGenericNS("xsi"));

			if (attribute != null) {
				attribute.setValue("am:Time");

			}


		}


	}


}
